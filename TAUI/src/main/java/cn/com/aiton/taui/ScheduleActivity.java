package cn.com.aiton.taui;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AbsoluteLayout;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.NumberPicker;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import net.tsz.afinal.FinalDb;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

import cn.com.aiton.domain.GbtControlModel;
import cn.com.aiton.domain.GbtSchedule;
import cn.com.aiton.domain.GbtTimePattern;
import cn.com.aiton.domain.TimePatterDesc;
import cn.com.aiton.domain.TscNode;
import cn.com.aiton.services.ScheduleService;
import cn.com.aiton.services.impl.ScheduleServiceImpl;
import cn.com.aiton.utils.AndroidTscDefine;


public class ScheduleActivity extends Activity {
    private List<Map<String, String>> mData;
    private ListView listView;
    public final static int SUCCESS = 1;
    public final static int FAILURE = 0;
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏
       // setContentView(R.layout.activity_schedule);
        View viewToLoad = LayoutInflater.from(this.getParent()).inflate(R.layout.activity_schedule, null);
        this.setContentView(viewToLoad);
        SharedPreferences sp = this.getSharedPreferences(AndroidTscDefine.TSCNODE, MODE_PRIVATE);
        TscNode node = AndroidTscDefine.spToTscNode(sp);
        FinalDb db = FinalDb.create(this, AndroidTscDefine.DBNAME);
        List<GbtTimePattern> gbtTimePatterns = db.findAllByWhere(GbtTimePattern.class,"deviceId = '"+node.getId()+"'");

        listView = (ListView)findViewById(R.id.list);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.v("MyListView4-click", (String) mData.get(position).get("id") + "    --    " + (String) mData.get(position).get("scheduleId"));

                showPopWindow(ScheduleActivity.this, view, position);
            }
        });
        Thread t2 = new Thread(runnable);
        t2.start();

    }
android.os.Handler handler = new android.os.Handler(){
    @Override
    public void handleMessage(Message msg) {
        switch (msg.what) {
            case SUCCESS:
                myAdapter = new MyAdapter(ScheduleActivity.this);
                listView.setAdapter(myAdapter);

                break;
            case FAILURE:

                break;
            default:
                break;
        }
        super.handleMessage(msg);
    }
};
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            Message msg = new Message();
            msg.what = SUCCESS;
            mData = getData();
            handler.sendMessage(msg);
        }
    };

    public List<TimePatterDesc> getTimePatternData(){
        List<TimePatterDesc> list = new ArrayList<TimePatterDesc>();
        Context ctx = ScheduleActivity.this;
        SharedPreferences sp = ctx.getSharedPreferences(AndroidTscDefine.TSCNODE, MODE_PRIVATE);
        TscNode node = AndroidTscDefine.spToTscNode(sp);
        FinalDb db = FinalDb.create(this,AndroidTscDefine.DBNAME);
        List<GbtTimePattern> gbtTimePatterns = db.findAllByWhere(GbtTimePattern.class,"deviceId = '"+node.getId()+"'");
        Iterator<GbtTimePattern> gbtTimePatternIterator = gbtTimePatterns.iterator();
        while(gbtTimePatternIterator.hasNext()){
            int id = gbtTimePatternIterator.next().getTimePatternId();
            list.add(new TimePatterDesc("方案"+id,id));
        }
        return list;
    }
    private List<Map<String, String>> getData() {
        Context ctx = ScheduleActivity.this;
        SharedPreferences sp = ctx.getSharedPreferences(AndroidTscDefine.TSCNODE, MODE_PRIVATE);
        TscNode node = AndroidTscDefine.spToTscNode(sp);
        FinalDb db = FinalDb.create(this,AndroidTscDefine.DBNAME);
        List<GbtSchedule> gbtSchedules = db.findAllByWhere(GbtSchedule.class,"deviceId = '"+node.getId()+"'");
        List<Map<String,String>> maps = AndroidTscDefine.listScheduleToListMap(gbtSchedules);

        return maps;
    }

    // ListView 中某项被选中后的逻辑


    /**
     * listview中点击按键弹出对话框
     */
    public void showInfo(final int position){

        new AlertDialog.Builder(this.getParent())
                .setTitle("提示")
                .setMessage("功能未开放，请联系厂家！")
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Map<String,String> map = mData.get(position);
                        GbtSchedule gbtSchedule = AndroidTscDefine.mapToSchedule(map);
                    }
                })
                .show();

    }

    private void showPopWindow(Context context, View parent, final int position)
    {
       // LayoutInflater inflater = (LayoutInflater)
        //        context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View vPopWindow=LayoutInflater.from(this.getParent()).inflate(R.layout.schedule_popupwindow, null, false);
        //宽300 高300
        final PopupWindow popWindow = new PopupWindow(vPopWindow, LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT,true);

        Button save = (Button)vPopWindow.findViewById(R.id.lvs_btn_save);
        final NumberPicker lvs_np_hour = (NumberPicker)vPopWindow.findViewById(R.id.lvs_np_hour);
        lvs_np_hour.setMinValue(0);
        lvs_np_hour.setMaxValue(23);
        lvs_np_hour.setValue(Integer.parseInt(mData.get(position).get("beginHour")));
        final NumberPicker lvs_np_minute = (NumberPicker)vPopWindow.findViewById(R.id.lvs_np_minute);
        lvs_np_minute.setMinValue(0);
        lvs_np_minute.setMaxValue(59);
        lvs_np_minute.setValue(Integer.parseInt(mData.get(position).get("beginMinute")));
        final Spinner lvs_sp_control_model = (Spinner)vPopWindow.findViewById(R.id.lvs_sp_control_model);
        List<GbtControlModel> gbtControlModels = new ArrayList<GbtControlModel>();
        gbtControlModels.add(new GbtControlModel("自主控制",0));
        gbtControlModels.add(new GbtControlModel("关灯控制",1));
        gbtControlModels.add(new GbtControlModel("黄闪控制",2));
        gbtControlModels.add(new GbtControlModel("全红控制",3));
        gbtControlModels.add(new GbtControlModel("感应控制",6));
        gbtControlModels.add(new GbtControlModel("无电缆协调",7));
        gbtControlModels.add(new GbtControlModel("单点优化",8));
        gbtControlModels.add(new GbtControlModel("主从控制", 11));
        gbtControlModels.add(new GbtControlModel("联网控制", 12));
        gbtControlModels.add(new GbtControlModel("手动控制", 13));
        final SpinnerControlModeAdapter spinnerControlModeAdapter = new SpinnerControlModeAdapter(gbtControlModels,this );
        lvs_sp_control_model.setAdapter(spinnerControlModeAdapter);
        lvs_sp_control_model.setSelection(Integer.parseInt(AndroidTscDefine.detailToInt(mData.get(position).get("controlMode"))),true);
        final Spinner lvs_sp_time_pattern_id = (Spinner)vPopWindow.findViewById(R.id.lvs_sp_time_pattern_id);
        List<TimePatterDesc> timePatternData = getTimePatternData();
        SpinnerTimePatternAdapter spinnerTimePatternAdapter = new SpinnerTimePatternAdapter(timePatternData,this);
        //ArrayAdapter<String> timepatternAdapter = new ArrayAdapter<String>(this ,android.R.layout.simple_spinner_item,timePatternData);
        lvs_sp_time_pattern_id.setAdapter(spinnerTimePatternAdapter);
        lvs_sp_time_pattern_id.setSelection(AndroidTscDefine.timePatternDetailToInt(mData.get(position).get("timePatternId")),true);
        // Button cancleButton = (Button)vPopWindow.findViewById(R.id.lvs_btn_save);
        save.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Log.e("BTN", lvs_np_minute.getValue() + "==" + lvs_np_hour.getValue() + "===" +
                        ((GbtControlModel) lvs_sp_control_model.getSelectedItem()).getName() + "===" +
                        lvs_sp_time_pattern_id.getSelectedItem().toString() + "===" +
                        mData.get(position).get("auxOut") + "===" +
                        mData.get(position).get("deviceId") + "===" +
                        mData.get(position).get("eventId") + "===" +
                        mData.get(position).get("id") + "===" +
                        mData.get(position).get("scheduleId") + "===" +
                        mData.get(position).get("specialOut"));
                try{
                    SharedPreferences sp = ScheduleActivity.this.getSharedPreferences(AndroidTscDefine.TSCNODE, MODE_PRIVATE);
                    TscNode node = AndroidTscDefine.spToTscNode(sp);
                    FinalDb db = FinalDb.create(ScheduleActivity.this, AndroidTscDefine.DBNAME);

                    GbtSchedule gbtSchedule = db.findById(Integer.parseInt(mData.get(position).get("id")),GbtSchedule.class);
                    gbtSchedule.setSpecialOut(Integer.parseInt(mData.get(position).get("specialOut")));
                    //gbtSchedule.setId(Integer.parseInt(mData.get(position).get("id")));
                    gbtSchedule.setEventId(Integer.parseInt(mData.get(position).get("eventId")));
                    gbtSchedule.setDeviceId(Integer.parseInt(mData.get(position).get("deviceId")));
                    gbtSchedule.setAuxOut(Integer.parseInt(mData.get(position).get("auxOut")));
                    gbtSchedule.setBeginHour(lvs_np_hour.getValue());
                    mData.get(position).put("beginHour", lvs_np_hour.getValue() + "");
                    gbtSchedule.setBeginMinute(lvs_np_minute.getValue());
                    mData.get(position).put("beginMinute", lvs_np_minute.getValue() + "");
                    gbtSchedule.setControlMode(((GbtControlModel) lvs_sp_control_model.getSelectedItem()).getValue());
                    mData.get(position).put("controlMode", ((GbtControlModel) lvs_sp_control_model.getSelectedItem()).getValue() + "");
                    gbtSchedule.setSpecialOut(Integer.parseInt(mData.get(position).get("specialOut")));
                    gbtSchedule.setScheduleId(Integer.parseInt(mData.get(position).get("scheduleId")));
                    gbtSchedule.setTimePatternId(((TimePatterDesc) lvs_sp_time_pattern_id.getSelectedItem()).getValue());
                    mData.get(position).put("timePatternId", ((TimePatterDesc) lvs_sp_time_pattern_id.getSelectedItem()).getValue() + "");
                    db.update(gbtSchedule);
                    //<<<<<<<<<<<<< 这个地方将信号机的schedule 数据发送到信号机端。目前这里只实现了保存到android 数据库中

                    List<GbtSchedule> gbtSchedules = db.findAllByWhere(GbtSchedule.class,"deviceId="+node.getId());
                    ScheduleService scheduleService = new ScheduleServiceImpl();
                    scheduleService.setSchedule(node,gbtSchedules);
                    //>>>>>>>>>>>>>>>>>>
                    popWindow.dismiss(); //Close the Pop Window
                    myAdapter.notifyDataSetChanged();
                  //  MyAdapter myAdapter = new MyAdapter(ScheduleActivity.this);
                 //   listView.setAdapter(myAdapter);
                }catch (Exception ex){
                    ex.printStackTrace();
                }

            }
        });

        popWindow.showAtLocation(parent, Gravity.CENTER, 0, 0);


    }

    public final class ViewHolder{
        public EditText id;
        public TextView scheduleId;
        public TextView eventId;
        public TextView beginHour;
        public TextView beginMinute;
        public TextView controlMode;
        public TextView timePatternId;
    }


    public class MyAdapter extends BaseAdapter {

        private LayoutInflater mInflater;


        public MyAdapter(Context context){
            this.mInflater = LayoutInflater.from(context);
        }
        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return mData.size();
        }

        @Override
        public Object getItem(int arg0) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public long getItemId(int arg0) {
            // TODO Auto-generated method stub
            return 0;
        }
        public GbtSchedule gbtSchedule = new GbtSchedule();
        ViewHolder holder = null;
        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {


            if (convertView == null) {

                holder=new ViewHolder();

                convertView = mInflater.inflate(R.layout.lv_schedule, null);
                holder.id = (EditText)convertView.findViewById(R.id.lvs_id);
                holder.scheduleId = (TextView)convertView.findViewById(R.id.lvs_scheduleId);
                holder.eventId = (TextView)convertView.findViewById(R.id.lvs_eventId);
                holder.beginHour = (TextView)convertView.findViewById(R.id.lvs_beginHour);
                holder.beginMinute = (TextView)convertView.findViewById(R.id.lvs_beginMinute);
                holder.controlMode = (TextView)convertView.findViewById(R.id.lvs_controlMode);
                holder.timePatternId = (TextView)convertView.findViewById(R.id.lvs_timePatternId);
              //  holder.viewBtn = (Button)convertView.findViewById(R.id.lvs_btn);
                convertView.setTag(holder);

            }else {

                holder = (ViewHolder)convertView.getTag();
            }

            holder.id.setText((String) mData.get(position).get("id"));
            holder.scheduleId.setText((String) mData.get(position).get("scheduleId"));
            holder.scheduleId.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean b) {
                    if (b) {
                        // 此处为得到焦点时的处理内容
                    } else {
                        // 此处为失去焦点时的处理内容
                        //   EditText et_scheduleid = (EditText)view;
                        //  gbtSchedule.setScheduleId(Integer.parseInt(et_scheduleid.getText().toString()));
                    }
                }
            });
            holder.eventId.setText((String) mData.get(position).get("eventId"));
            holder.eventId.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean b) {
                    if (b) {

                    } else {
                        EditText et_event_id = (EditText) view;
                        //gbtSchedule.setEventId(Integer.set);
                    }
                }
            });

            holder.beginHour.setText(mData.get(position).get("beginHour"));
            holder.beginMinute.setText(mData.get(position).get("beginMinute"));
            //List<String> list = SpinnerControlModeAdapter.getData();
            //ArrayAdapter<String> adapter = new ArrayAdapter<String>(ScheduleActivity.this,android.R.layout.simple_spinner_item,list);
//            List<GbtControlModel> gbtControlModels = new ArrayList<GbtControlModel>();
//            gbtControlModels.add(new GbtControlModel("自主控制",0));
//            gbtControlModels.add(new GbtControlModel("关灯控制",1));
//            gbtControlModels.add(new GbtControlModel("黄闪控制",2));
//            gbtControlModels.add(new GbtControlModel("全红控制",3));
//            gbtControlModels.add(new GbtControlModel("感应控制",6));
//            gbtControlModels.add(new GbtControlModel("无电缆协调",7));
//            gbtControlModels.add(new GbtControlModel("单点优化",8));
//            gbtControlModels.add(new GbtControlModel("主从控制", 11));
//            gbtControlModels.add(new GbtControlModel("联网控制", 12));
//            gbtControlModels.add(new GbtControlModel("手动控制", 13));
//
//            SpinnerControlModeAdapter spinnerControlModeAdapter = new SpinnerControlModeAdapter(gbtControlModels,ScheduleActivity.this);
            holder.controlMode.setText(mData.get(position).get("controlMode"));
//            holder.controlMode.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//                @Override
//                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                    String s = adapterView.getItemAtPosition(i).toString();
//                    Log.e("Schedule",s);
//                }
//
//                @Override
//                public void onNothingSelected(AdapterView<?> adapterView) {
//
//                }
//            });
//            List<String> timePatternData = getTimePatternData();
//            ArrayAdapter<String> timepatternAdapter = new ArrayAdapter<String>(ScheduleActivity.this,android.R.layout.simple_spinner_item,timePatternData);
            holder.timePatternId.setText(mData.get(position).get("timePatternId"));
            // holder.controlMode.setText((String) mData.get(position).get("controlMode"));
            //holder.timePatternId.setText((String)mData.get(position).get("timePatternId"));
//            holder.timePatternId.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//                @Override
//                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                    String s = adapterView.getItemAtPosition(i).toString();
//                    Log.e("Schedule", s);
//                }
//
//                @Override
//                public void onNothingSelected(AdapterView<?> adapterView) {
//
//                }
//            });



            return convertView;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.schedule, menu);
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

}
