package cn.com.aiton.taui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import net.tsz.afinal.FinalDb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cn.com.aiton.domain.GbtDirec;
import cn.com.aiton.domain.GbtPhase;
import cn.com.aiton.domain.GbtSchedule;
import cn.com.aiton.domain.GbtStagePattern;
import cn.com.aiton.domain.GbtTimeBase;
import cn.com.aiton.domain.GbtTimePattern;
import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;
import cn.com.aiton.services.TimeBaseService;
import cn.com.aiton.services.impl.TimeBaseServiceImpl;
import cn.com.aiton.utils.AndroidTscDefine;


public class BasetimeWeekActivity extends Activity {
    List<GbtTimeBase> gbtTimeBases;
    List<GbtSchedule> gbtSchedules;
    private List<String> list = new ArrayList<String>();
    private List<String> schedules = new ArrayList<String>();
    private Spinner mySpinner;
    private ArrayAdapter<String> adapter;
    private Spinner sp_schedule;
    private ArrayAdapter<String> adapter_schedule;
    private CheckBox cbxMonday;
    private CheckBox cbxTuesday;
    private CheckBox Wednesday;
    private CheckBox cbxThursday;
    private CheckBox cbxFriday;
    private CheckBox cbxSaturday;
    private CheckBox cbxSunday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏
        setContentView(R.layout.activity_basetime_week);
        cbxMonday = (CheckBox)findViewById(R.id.cbxMonday);
        cbxTuesday = (CheckBox)findViewById(R.id.cbxTuesday);
        Wednesday = (CheckBox)findViewById(R.id.Wednesday);
        cbxThursday = (CheckBox)findViewById(R.id.cbxThursday);
        cbxFriday = (CheckBox)findViewById(R.id.cbxFriday);
        cbxSaturday = (CheckBox)findViewById(R.id.cbxSaturday);
        cbxSunday = (CheckBox)findViewById(R.id.cbxSunday);
        TscNode node = AndroidTscDefine.spToTscNode(AndroidTscDefine.getSharedPreferences(this));
        FinalDb db = AndroidTscDefine.getFinalDb(this);
        gbtTimeBases = db.findAllByWhere(GbtTimeBase.class,"deviceId = '"+node.getId()+"'");
        gbtSchedules = db.findAllByWhere(GbtSchedule.class,"deviceId = '"+node.getId()+"'");
        initTimeBaseID();
        initSchedules();


        sp_schedule = (Spinner) findViewById(R.id.sp_week_schedule);
        adapter_schedule = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,schedules);
        adapter_schedule.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_schedule.setAdapter(adapter_schedule);
        sp_schedule.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                // TODO Auto-generated method stub
                /* 将所选mySpinner 的值带入myTextView 中*/
                Toast.makeText(BasetimeWeekActivity.this, "您选择的是：" + adapter.getItem(arg2), Toast.LENGTH_LONG).show();
                // myTextView.setText("您选择的是：" + adapter.getItem(arg2));
                /* 将mySpinner 显示*/
                arg0.setVisibility(View.VISIBLE);
            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
                Toast.makeText(BasetimeWeekActivity.this, "您选择的是：NONE", Toast.LENGTH_LONG).show();
                arg0.setVisibility(View.VISIBLE);
            }
        });
 /*下拉菜单弹出的内容选项触屏事件处理*/
        sp_schedule.setOnTouchListener(new Spinner.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                // TODO Auto-generated method stub
                /**
                 *
                 */
                return false;
            }
        });
        /*下拉菜单弹出的内容选项焦点改变事件处理*/
        sp_schedule.setOnFocusChangeListener(new Spinner.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                // TODO Auto-generated method stub

            }
        });

        mySpinner = (Spinner)findViewById(R.id.sp_week_basetime_id);
        //第二步：为下拉列表定义一个适配器，这里就用到里前面定义的list。
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list);
        //第三步：为适配器设置下拉列表下拉时的菜单样式。
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //第四步：将适配器添加到下拉列表上
        mySpinner.setAdapter(adapter);
        //第五步：为下拉列表设置各种事件的响应，这个事响应菜单被选中
        mySpinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                // TODO Auto-generated method stub
                /* 将所选mySpinner 的值带入myTextView 中*/
                Toast.makeText(BasetimeWeekActivity.this,"您选择的是：" + adapter.getItem(arg2),Toast.LENGTH_LONG).show();
                // myTextView.setText("您选择的是：" + adapter.getItem(arg2));
                /* 将mySpinner 显示*/
                for (GbtTimeBase gtb:gbtTimeBases
                        ) {
                    int id = Integer.parseInt(adapter.getItem(arg2));
                    int week = gtb.getWeek();
                    if(gtb.getTimeBaseId() == id){

                        if((week & 2) == 2){
                            cbxMonday.setChecked(true);
                        }else{
                            cbxMonday.setChecked(false);
                        }
                        if ((week & 4) ==4 ){
                            cbxTuesday.setChecked(true);
                        }else{
                            cbxTuesday.setChecked(false);
                        }
                        if((week & 8) == 8){
                            Wednesday.setChecked(true);
                        }else{
                            Wednesday.setChecked(false);
                        }
                        if((week & 16) == 16){
                            cbxThursday.setChecked(true);
                        }else{
                            cbxThursday.setChecked(false);
                        }
                        if((week & 32) == 32){
                            cbxFriday.setChecked(true);
                        }else{
                            cbxFriday.setChecked(false);
                        }
                        if((week & 64) == 64){
                            cbxSaturday.setChecked(true);
                        }else{
                            cbxSaturday.setChecked(false);
                        }
                        if((week & 128) == 128){
                            cbxSunday.setChecked(true);
                        }else{
                            cbxSunday.setChecked(false);
                        }
                        break;
                    }else{
                        disabledChecked(week);
                    }

                }
                arg0.setVisibility(View.VISIBLE);
            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
                Toast.makeText(BasetimeWeekActivity.this,"您选择的是：NONE",Toast.LENGTH_LONG).show();
                arg0.setVisibility(View.VISIBLE);
            }
        });
        /*下拉菜单弹出的内容选项触屏事件处理*/
        mySpinner.setOnTouchListener(new Spinner.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                // TODO Auto-generated method stub
                /**
                 *
                 */
                return false;
            }
        });
        /*下拉菜单弹出的内容选项焦点改变事件处理*/
        mySpinner.setOnFocusChangeListener(new Spinner.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                // TODO Auto-generated method stub

            }
        });
    }
    public void initTimeBaseID(){
        for(int i=21;i<=30;i++){
            list.add(i+"");
        }
    }
    private void disabledChecked(int week){
        cbxMonday.setChecked(false);

        cbxTuesday.setChecked(false);

        Wednesday.setChecked(false);

        cbxThursday.setChecked(false);

        cbxFriday.setChecked(false);

        cbxSaturday.setChecked(false);

        cbxSunday.setChecked(false);
    }
    /**
     * 将数据加载到LIST中，以便Spinner的使用
     */
    public void initSchedules(){
        Iterator<GbtSchedule> gbtScheduleIterator = gbtSchedules.iterator();
        while(gbtScheduleIterator.hasNext()){
            GbtSchedule schedule = gbtScheduleIterator.next();
            if(schedule.getEventId() != 0){
                int scheduleId = schedule.getScheduleId();
                schedules.add(String.valueOf(scheduleId));
            }

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.basetime_week, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void btWeekSubmit(View view){
        int week = 0;
        if(cbxMonday.isChecked()){
            week = week | 2;
        }else {

        }
        if(cbxTuesday.isChecked()){
            week = week | 4;
        }else{

        }
        if(Wednesday.isChecked()){
            week = week | 8;
        }else{

        }
        if(cbxThursday.isChecked()){
            week = week | 16;
        }else{

        }
        if(cbxFriday.isChecked()){
            week = week | 32;
        }else{

        }
        if(cbxSaturday.isChecked()){
            week = week | 64;
        }else{

        }
        if(cbxSunday.isChecked()){
            week = week | 128;
        }else{

        }

        TscNode node = AndroidTscDefine.spToTscNode(AndroidTscDefine.getSharedPreferences(this));
        FinalDb db = AndroidTscDefine.getFinalDb(this);
        GbtTimeBase gbtTimeBase = new GbtTimeBase();
        gbtTimeBase.setDay(0);
        gbtTimeBase.setMonth(0);
        int scheduleId = Integer.parseInt((String)sp_schedule.getSelectedItem());
        gbtTimeBase.setScheduleId(scheduleId);
        gbtTimeBase.setWeek(week);
        String timebaseid = (String)mySpinner.getSelectedItem();
        gbtTimeBase.setTimeBaseId(Integer.parseInt(timebaseid));
        gbtTimeBase.setDeviceId(node.getId());
        //如果在现有的数据库中存在了的timebaseID不再进行保存。
        List<Integer> timebaseids = new ArrayList<Integer>();
        gbtTimeBases = db.findAllByWhere(GbtTimeBase.class,"deviceId = '"+node.getId()+"'");
        for (GbtTimeBase g:gbtTimeBases
                ) {
            timebaseids.add(g.getTimeBaseId());
        }
        if(!timebaseids.contains(gbtTimeBase.getTimeBaseId())){
            db.save(gbtTimeBase);
        }
        gbtTimeBases = db.findAllByWhere(GbtTimeBase.class,"deviceId = '"+node.getId()+"'");
      //  Toast.makeText(this,"功能未开发，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void btWeekRead(View view){
        TscNode node = AndroidTscDefine.spToTscNode(AndroidTscDefine.getSharedPreferences(this));
        FinalDb db = AndroidTscDefine.getFinalDb(this);
        gbtTimeBases = db.findAllByWhere(GbtTimeBase.class,"deviceId = '"+node.getId()+"'");
        TimeBaseService timeBaseService = new TimeBaseServiceImpl();
        Message message = timeBaseService.setTimeBaseByWeekend(gbtTimeBases, node);
        Toast.makeText(this,message.getMsg(),Toast.LENGTH_LONG).show();
    }
}
