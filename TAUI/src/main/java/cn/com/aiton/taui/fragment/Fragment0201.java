package cn.com.aiton.taui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
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
import cn.com.aiton.taui.R;
import cn.com.aiton.utils.AndroidTscDefine;

public class Fragment0201 extends Fragment implements View.OnClickListener {

    private View mInflate;

    public Fragment0201() {
        // Required empty public constructor
    }

    private List<String> list = new ArrayList<String>();
    private List<String> schedules = new ArrayList<String>();
    private Spinner mySpinner;
    private ArrayAdapter<String> adapter;
    private Spinner sp_schedule;
    private ArrayAdapter<String> adapter_schedule;
    List<GbtStagePattern> gbtStagePatterns;
    List<GbtTimePattern> gbtTimePatterns;
    List<GbtDirec> gbtDirecs;
    List<GbtPhase> gbtPhases;
    List<GbtTimeBase> gbtTimeBases;
    List<GbtSchedule> gbtSchedules;
    private CheckBox cbxJanuary;
    private CheckBox cbxFebruary;
    private CheckBox cbxMarch;
    private CheckBox cbxApril;
    private CheckBox cbxMay;
    private CheckBox cbxJune;
    private CheckBox cbxJuly;
    private CheckBox cbxAugust;
    private CheckBox cbxSeptember;
    private CheckBox cbxOctober;
    private CheckBox cbxNovember;
    private CheckBox cbxDecember;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for getActivity() fragment
        mInflate = inflater.inflate(R.layout.fragment_fragment0201, null);
        mInflate.findViewById(R.id.btMonthBtnSave).setOnClickListener(this);
        mInflate.findViewById(R.id.btMonthBtnRead).setOnClickListener(this);

        cbxJanuary = (CheckBox) mInflate.findViewById(R.id.cbxJanuary);
        cbxFebruary = (CheckBox) mInflate.findViewById(R.id.cbxFebruary);
        cbxMarch = (CheckBox) mInflate.findViewById(R.id.cbxMarch);
        cbxApril = (CheckBox) mInflate.findViewById(R.id.cbxApril);
        cbxMay = (CheckBox) mInflate.findViewById(R.id.cbxMay);
        cbxJune = (CheckBox) mInflate.findViewById(R.id.cbxJune);
        cbxJuly = (CheckBox) mInflate.findViewById(R.id.cbxJuly);
        cbxAugust = (CheckBox) mInflate.findViewById(R.id.cbxAugust);
        cbxSeptember = (CheckBox) mInflate.findViewById(R.id.cbxSeptember);
        cbxOctober = (CheckBox) mInflate.findViewById(R.id.cbxOctober);
        cbxNovember = (CheckBox) mInflate.findViewById(R.id.cbxNovember);
        cbxDecember = (CheckBox) mInflate.findViewById(R.id.cbxDecember);

        TscNode node = AndroidTscDefine.spToTscNode(AndroidTscDefine.getSharedPreferences(getActivity()));
        FinalDb db = AndroidTscDefine.getFinalDb(getActivity());
        gbtStagePatterns = db.findAllByWhere(GbtStagePattern.class, "deviceId = '" + node.getId() + "'");
        gbtTimePatterns = db.findAllByWhere(GbtTimePattern.class, "deviceId = '" + node.getId() + "'");
        gbtDirecs = db.findAllByWhere(GbtDirec.class, "deviceId = '" + node.getId() + "' and phaseId !='0' or overlapId != '0'");
        gbtPhases = db.findAllByWhere(GbtPhase.class, "deviceId = '" + node.getId() + "'");
        gbtTimeBases = db.findAllByWhere(GbtTimeBase.class, "deviceId = '" + node.getId() + "'");
        gbtSchedules = db.findAllByWhere(GbtSchedule.class, "deviceId = '" + node.getId() + "'");
        initTimeBaseID();
        initSchedules();

        sp_schedule = (Spinner) mInflate.findViewById(R.id.sp_schedule);
        adapter_schedule = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, schedules);
        adapter_schedule.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_schedule.setAdapter(adapter_schedule);
        sp_schedule.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                // TODO Auto-generated method stub
                /* 将所选mySpinner 的值带入myTextView 中*/
                Toast.makeText(getActivity(), "您选择的是：" + adapter.getItem(arg2), Toast.LENGTH_LONG).show();
                // myTextView.setText("您选择的是：" + adapter.getItem(arg2));
                /* 将mySpinner 显示*/
                arg0.setVisibility(View.VISIBLE);
            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
                Toast.makeText(getActivity(), "您选择的是：NONE", Toast.LENGTH_LONG).show();
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

        mySpinner = (Spinner) mInflate.findViewById(R.id.sp_basetime_id);
        //第二步：为下拉列表定义一个适配器，这里就用到里前面定义的list。
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, list);
        //第三步：为适配器设置下拉列表下拉时的菜单样式。
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //第四步：将适配器添加到下拉列表上
        mySpinner.setAdapter(adapter);
        //第五步：为下拉列表设置各种事件的响应，这个事响应菜单被选中
        mySpinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                // TODO Auto-generated method stub
                /* 将所选mySpinner 的值带入myTextView 中*/
                Toast.makeText(getActivity(), "您选择的是：" + adapter.getItem(arg2), Toast.LENGTH_LONG).show();
                // myTextView.setText("您选择的是：" + adapter.getItem(arg2));
                /* 将mySpinner 显示*/
                // gbtTimeBases = db.findAllByWhere(GbtTimeBase.class,"deviceId = '"+node.getId()+"'");
                for (GbtTimeBase gtb : gbtTimeBases
                        ) {
                    int id = Integer.parseInt(adapter.getItem(arg2));
                    int month = gtb.getMonth();
                    if (gtb.getTimeBaseId() == id) {

                        if ((month & 2) == 2) {
                            cbxJanuary.setChecked(true);
                        } else {
                            cbxJanuary.setChecked(false);
                        }
                        if ((month & 4) == 4) {
                            cbxFebruary.setChecked(true);
                        } else {
                            cbxFebruary.setChecked(false);
                        }
                        if ((month & 8) == 8) {
                            cbxMarch.setChecked(true);
                        } else {
                            cbxMarch.setChecked(false);
                        }
                        if ((month & 16) == 16) {
                            cbxApril.setChecked(true);
                        } else {
                            cbxApril.setChecked(false);
                        }
                        if ((month & 32) == 32) {
                            cbxMay.setChecked(true);
                        } else {
                            cbxMay.setChecked(false);
                        }
                        if ((month & 64) == 64) {
                            cbxJune.setChecked(true);
                        } else {
                            cbxJune.setChecked(false);
                        }
                        if ((month & 128) == 128) {
                            cbxJuly.setChecked(true);
                        } else {
                            cbxJuly.setChecked(false);
                        }
                        if ((month & 256) == 256) {
                            cbxAugust.setChecked(true);
                        } else {
                            cbxAugust.setChecked(false);
                        }
                        if ((month & 512) == 512) {
                            cbxSeptember.setChecked(true);
                        } else {
                            cbxSeptember.setChecked(false);
                        }
                        if ((month & 1024) == 1024) {
                            cbxOctober.setChecked(true);
                        } else {
                            cbxOctober.setChecked(false);
                        }
                        if ((month & 2048) == 2048) {
                            cbxNovember.setChecked(true);
                        } else {
                            cbxNovember.setChecked(false);
                        }
                        if ((month & 4096) == 4096) {
                            cbxDecember.setChecked(true);
                        } else {
                            cbxDecember.setChecked(false);
                        }
                        break;
                    } else {
                        disableChecked(month);
                    }

                }
                arg0.setVisibility(View.VISIBLE);
            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
                Toast.makeText(getActivity(), "您选择的是：NONE", Toast.LENGTH_LONG).show();
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
        return mInflate;
    }

    public void initTimeBaseID() {
        for (int i = 31; i <= 40; i++) {
            list.add(i + "");
        }
    }


    private void disableChecked(int month) {

        cbxJanuary.setChecked(false);

        cbxFebruary.setChecked(false);

        cbxMarch.setChecked(false);

        cbxApril.setChecked(false);

        cbxMay.setChecked(false);

        cbxJune.setChecked(false);

        cbxJuly.setChecked(false);

        cbxAugust.setChecked(false);

        cbxSeptember.setChecked(false);

        cbxOctober.setChecked(false);

        cbxNovember.setChecked(false);

        cbxDecember.setChecked(false);

    }

    /**
     * 将数据加载到LIST中，以便Spinner的使用
     */
    public void initSchedules() {
        Iterator<GbtSchedule> gbtScheduleIterator = gbtSchedules.iterator();
        while (gbtScheduleIterator.hasNext()) {
            GbtSchedule schedule = gbtScheduleIterator.next();
            if (schedule.getEventId() != 0) {
                int scheduleId = schedule.getScheduleId();
                if (!schedules.contains(scheduleId))
                    schedules.add(String.valueOf(scheduleId));
            }

        }
    }

    public void btMonthBtnSave() {
        TimeBaseService timeBaseService = new TimeBaseServiceImpl();
        int month = 0;
        if (cbxJanuary.isChecked()) {
            month = month | 2;
        } else {

        }
        if (cbxFebruary.isChecked()) {
            month = month | 4;
        } else {

        }
        if (cbxMarch.isChecked()) {
            month = month | 8;
        } else {

        }
        if (cbxApril.isChecked()) {
            month = month | 16;
        } else {

        }
        if (cbxMay.isChecked()) {
            month = month | 32;
        } else {

        }
        if (cbxJune.isChecked()) {
            month = month | 64;
        } else {

        }
        if (cbxJuly.isChecked()) {
            month = month | 128;
        } else {

        }
        if (cbxAugust.isChecked()) {
            month = month | 256;
        } else {

        }
        if (cbxSeptember.isChecked()) {
            month = month | 512;
        } else {

        }
        if (cbxOctober.isChecked()) {
            month = month | 1024;
        } else {

        }
        if (cbxNovember.isChecked()) {
            month = month | 2048;
        } else {

        }
        if (cbxDecember.isChecked()) {
            month = month | 4096;
        } else {

        }
        TscNode node = AndroidTscDefine.spToTscNode(AndroidTscDefine.getSharedPreferences(getActivity()));
        FinalDb db = AndroidTscDefine.getFinalDb(getActivity());
        GbtTimeBase gbtTimeBase = new GbtTimeBase();
        gbtTimeBase.setDay(0);
        gbtTimeBase.setMonth(month);
        int scheduleId = Integer.parseInt((String) sp_schedule.getSelectedItem());
        gbtTimeBase.setScheduleId(scheduleId);
        gbtTimeBase.setWeek(0);
        String timebaseid = (String) mySpinner.getSelectedItem();
        gbtTimeBase.setTimeBaseId(Integer.parseInt(timebaseid));
        gbtTimeBase.setDeviceId(node.getId());
        //如果在现有的数据库中存在了的timebaseID不再进行保存。
        List<Integer> timebaseids = new ArrayList<Integer>();
        gbtTimeBases = db.findAllByWhere(GbtTimeBase.class, "deviceId = '" + node.getId() + "'");
        for (GbtTimeBase g : gbtTimeBases
                ) {
            timebaseids.add(g.getTimeBaseId());
        }
        if (!timebaseids.contains(gbtTimeBase.getTimeBaseId())) {
            db.save(gbtTimeBase);
        }
        gbtTimeBases = db.findAllByWhere(GbtTimeBase.class, "deviceId = '" + node.getId() + "'");
        //timeBaseService.setTimeBaseByCalendar();
        // Toast.makeText(getActivity(),"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }

    public void btMonthBtnRead() {
        TscNode node = AndroidTscDefine.spToTscNode(AndroidTscDefine.getSharedPreferences(getActivity()));
        FinalDb db = AndroidTscDefine.getFinalDb(getActivity());
        gbtTimeBases = db.findAllByWhere(GbtTimeBase.class, "deviceId = '" + node.getId() + "'");
        TimeBaseService timeBaseService = new TimeBaseServiceImpl();
        Message message = timeBaseService.setTimeBaseByCalendar(gbtTimeBases, node);
        Toast.makeText(getActivity(), message.getMsg(), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btMonthBtnRead:
                btMonthBtnRead();
                break;
            case R.id.btMonthBtnSave:
                btMonthBtnSave();
                break;
        }
    }
}
