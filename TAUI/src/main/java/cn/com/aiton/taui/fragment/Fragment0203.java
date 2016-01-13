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

import cn.com.aiton.domain.GbtSchedule;
import cn.com.aiton.domain.GbtTimeBase;
import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;
import cn.com.aiton.services.TimeBaseService;
import cn.com.aiton.services.impl.TimeBaseServiceImpl;
import cn.com.aiton.taui.R;
import cn.com.aiton.utils.AndroidTscDefine;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment0203 extends Fragment implements View.OnClickListener {


    private View mInflate;

    public Fragment0203() {
        // Required empty public constructor
    }

    List<GbtTimeBase> gbtTimeBases;
    List<GbtSchedule> gbtSchedules;
    private List<String> list = new ArrayList<String>();
    private List<String> schedules = new ArrayList<String>();
    private Spinner mySpinner;
    private ArrayAdapter<String> adapter;
    private Spinner sp_schedule;
    private ArrayAdapter<String> adapter_schedule;
    CheckBox cb_jan;
    CheckBox cb_feb;
    CheckBox cb_mar;
    CheckBox cb_apr;
    CheckBox cb_may;
    CheckBox cb_jun;
    CheckBox cb_jul;
    CheckBox cb_aug;
    CheckBox cb_sep;
    CheckBox cb_oct;
    CheckBox cb_nov;
    CheckBox cb_dec;

    CheckBox cb_1;
    CheckBox cb_2;
    CheckBox cb_3;
    CheckBox cb_4;
    CheckBox cb_5;
    CheckBox cb_6;
    CheckBox cb_7;
    CheckBox cb_8;
    CheckBox cb_9;
    CheckBox cb_10;

    CheckBox cb_11;
    CheckBox cb_12;
    CheckBox cb_13;
    CheckBox cb_14;
    CheckBox cb_15;
    CheckBox cb_16;
    CheckBox cb_17;
    CheckBox cb_18;
    CheckBox cb_19;
    CheckBox cb_20;
    CheckBox cb_21;
    CheckBox cb_22;
    CheckBox cb_23;
    CheckBox cb_24;
    CheckBox cb_25;
    CheckBox cb_26;
    CheckBox cb_27;
    CheckBox cb_28;
    CheckBox cb_29;
    CheckBox cb_30;


    CheckBox cb_31;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for getActivity() fragment
        mInflate = inflater.inflate(R.layout.fragment_fragment0203, null);
        mInflate.findViewById(R.id.btDayBtnRead).setOnClickListener(this);
        mInflate.findViewById(R.id.btDayBtnSubmit).setOnClickListener(this);
        
        initUI();
        
        TscNode node = AndroidTscDefine.spToTscNode(AndroidTscDefine.getSharedPreferences(getActivity()));
        FinalDb db = AndroidTscDefine.getFinalDb(getActivity());
        gbtTimeBases = db.findAllByWhere(GbtTimeBase.class, "deviceId = '" + node.getId() + "'");
        gbtSchedules = db.findAllByWhere(GbtSchedule.class, "deviceId = '" + node.getId() + "'");
        initTimeBaseID();
        initSchedules();


        sp_schedule = (Spinner) mInflate.findViewById(R.id.sp_day_schedule);
        adapter_schedule = new ArrayAdapter<String>(getActivity(), R.layout.spinner_style, schedules);
        adapter_schedule.setDropDownViewResource(R.layout.spinner_style_item);
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

        mySpinner = (Spinner) mInflate.findViewById(R.id.sp_day_basetime_id);
        //第二步：为下拉列表定义一个适配器，这里就用到里前面定义的list。
        adapter = new ArrayAdapter<String>(getActivity(), R.layout.spinner_style, list);
        //第三步：为适配器设置下拉列表下拉时的菜单样式。
        adapter.setDropDownViewResource(R.layout.spinner_style_item);
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
                int id = Integer.parseInt(adapter.getItem(arg2));
                for (GbtTimeBase gtb : gbtTimeBases
                        ) {
                    long day = gtb.getDay();
                    int month = gtb.getMonth();
                    if (gtb.getTimeBaseId() == id) {

                        if ((month & 2) == 2) {
                            cb_jan.setChecked(true);
                        } else {
                            cb_jan.setChecked(false);
                        }
                        if ((month & 4) == 4) {
                            cb_feb.setChecked(true);
                        } else {
                            cb_feb.setChecked(false);
                        }
                        if ((month & 8) == 8) {
                            cb_mar.setChecked(true);
                        } else {
                            cb_mar.setChecked(false);
                        }
                        if ((month & 16) == 16) {
                            cb_apr.setChecked(true);
                        } else {
                            cb_apr.setChecked(false);
                        }
                        if ((month & 32) == 32) {
                            cb_may.setChecked(true);
                        } else {
                            cb_may.setChecked(false);
                        }
                        if ((month & 64) == 64) {
                            cb_jun.setChecked(true);
                        } else {
                            cb_jun.setChecked(false);
                        }
                        if ((month & 128) == 128) {
                            cb_jul.setChecked(true);
                        } else {
                            cb_jul.setChecked(false);
                        }
                        if ((month & 256) == 256) {
                            cb_aug.setChecked(true);
                        } else {
                            cb_aug.setChecked(false);
                        }
                        if ((month & 512) == 512) {
                            cb_sep.setChecked(true);
                        } else {
                            cb_sep.setChecked(false);
                        }
                        if ((month & 1024) == 1024) {
                            cb_oct.setChecked(true);
                        } else {
                            cb_oct.setChecked(false);
                        }
                        if ((month & 2048) == 2048) {
                            cb_nov.setChecked(true);
                        } else {
                            cb_nov.setChecked(false);
                        }
                        if ((month & 4096) == 4096) {
                            cb_dec.setChecked(true);
                        } else {
                            cb_dec.setChecked(false);
                        }

                        if ((day & 2) == 2) {
                            cb_1.setChecked(true);
                        } else {
                            cb_1.setChecked(false);
                        }
                        if ((day & 4) == 4) {
                            cb_2.setChecked(true);
                        } else {
                            cb_2.setChecked(false);
                        }
                        if ((day & 8) == 8) {
                            cb_3.setChecked(true);
                        } else {
                            cb_3.setChecked(false);
                        }
                        if ((day & 16) == 16) {
                            cb_4.setChecked(true);
                        } else {
                            cb_4.setChecked(false);
                        }
                        if ((day & 32) == 32) {
                            cb_5.setChecked(true);
                        } else {
                            cb_5.setChecked(false);
                        }
                        if ((day & 64) == 64) {
                            cb_6.setChecked(true);
                        } else {
                            cb_6.setChecked(false);
                        }
                        if ((day & 128) == 128) {
                            cb_7.setChecked(true);
                        } else {
                            cb_7.setChecked(false);
                        }
                        if ((day & 256) == 256) {
                            cb_8.setChecked(true);
                        } else {
                            cb_8.setChecked(false);
                        }
                        if ((day & 512) == 512) {
                            cb_9.setChecked(true);
                        } else {
                            cb_9.setChecked(false);
                        }
                        if ((day & 1024) == 1024) {
                            cb_10.setChecked(true);
                        } else {
                            cb_10.setChecked(false);
                        }
                        if ((day & 2048) == 2048) {
                            cb_11.setChecked(true);
                        } else {
                            cb_11.setChecked(false);
                        }
                        if ((day & 4096) == 4096) {
                            cb_12.setChecked(true);
                        } else {
                            cb_12.setChecked(false);
                        }
                        if ((day & 8192) == 8192) {
                            cb_13.setChecked(true);
                        } else {
                            cb_13.setChecked(false);
                        }
                        if ((day & 16384) == 16384) {
                            cb_14.setChecked(true);
                        } else {
                            cb_14.setChecked(false);
                        }
                        if ((day & 32768) == 32768) {
                            cb_15.setChecked(true);
                        } else {
                            cb_15.setChecked(false);
                        }
                        if ((day & 65536) == 65536) {
                            cb_16.setChecked(true);
                        } else {
                            cb_16.setChecked(false);
                        }
                        if ((day & 131072) == 131072) {
                            cb_17.setChecked(true);
                        } else {
                            cb_17.setChecked(false);
                        }
                        if ((day & 262144) == 262144) {
                            cb_18.setChecked(true);
                        } else {
                            cb_18.setChecked(false);
                        }
                        if ((day & 524288) == 524288) {
                            cb_19.setChecked(true);
                        } else {
                            cb_19.setChecked(false);
                        }
                        if ((day & 1048576) == 1048576) {
                            cb_20.setChecked(true);
                        } else {
                            cb_20.setChecked(false);
                        }
                        if ((day & 2097152) == 2097152) {
                            cb_21.setChecked(true);
                        } else {
                            cb_21.setChecked(false);
                        }
                        if ((day & 4194304) == 4194304) {
                            cb_22.setChecked(true);
                        } else {
                            cb_22.setChecked(false);
                        }
                        if ((day & 8388608) == 8388608) {
                            cb_23.setChecked(true);
                        } else {
                            cb_23.setChecked(false);
                        }
                        if ((day & 16777216) == 16777216) {
                            cb_24.setChecked(true);
                        } else {
                            cb_24.setChecked(false);
                        }
                        if ((day & 33554432) == 33554432) {
                            cb_25.setChecked(true);
                        } else {
                            cb_25.setChecked(false);
                        }
                        if ((day & 67108864) == 67108864) {
                            cb_26.setChecked(true);
                        } else {
                            cb_26.setChecked(false);
                        }
                        if ((day & 134217728) == 134217728) {
                            cb_27.setChecked(true);
                        } else {
                            cb_27.setChecked(false);
                        }
                        if ((day & 268435456) == 268435456) {
                            cb_28.setChecked(true);
                        } else {
                            cb_28.setChecked(false);
                        }
                        if ((day & 536870912) == 536870912) {
                            cb_29.setChecked(true);
                        } else {
                            cb_29.setChecked(false);
                        }
                        if ((day & 1073741824) == 1073741824) {
                            cb_30.setChecked(true);
                        } else {
                            cb_30.setChecked(false);
                        }
                        if ((day & 2147483648L) == 2147483648L) {
                            cb_31.setChecked(true);
                        } else {
                            cb_31.setChecked(false);
                        }
                        break;
                    } else {
                        disabledChecked();
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

    private void initUI() {
        cb_jan=(CheckBox)mInflate.findViewById( R.id.cb_jan);
        cb_feb=(CheckBox)mInflate.findViewById( R.id.cb_feb);
        cb_mar=(CheckBox)mInflate.findViewById( R.id.cb_mar);
        cb_apr=(CheckBox)mInflate.findViewById( R.id.cb_apr);
        cb_may=(CheckBox)mInflate.findViewById( R.id.cb_may);
        cb_jun=(CheckBox)mInflate.findViewById( R.id.cb_jun);
        cb_jul=(CheckBox)mInflate.findViewById( R.id.cb_jul);
        cb_aug=(CheckBox)mInflate.findViewById( R.id.cb_aug);
        cb_sep=(CheckBox)mInflate.findViewById( R.id.cb_sep);
        cb_oct=(CheckBox)mInflate.findViewById( R.id.cb_oct);
        cb_nov=(CheckBox)mInflate.findViewById( R.id.cb_nov);
        cb_dec=(CheckBox)mInflate.findViewById( R.id.cb_dec);
        cb_1=(CheckBox)mInflate.findViewById( R.id.cb_1);
        cb_2=(CheckBox)mInflate.findViewById( R.id.cb_2);
        cb_3=(CheckBox)mInflate.findViewById( R.id.cb_3);
        cb_4=(CheckBox)mInflate.findViewById( R.id.cb_4);
        cb_5=(CheckBox)mInflate.findViewById( R.id.cb_5);
        cb_6=(CheckBox)mInflate.findViewById( R.id.cb_6);
        cb_7=(CheckBox)mInflate.findViewById( R.id.cb_7);
        cb_8=(CheckBox)mInflate.findViewById( R.id.cb_8);
        cb_9=(CheckBox)mInflate.findViewById( R.id.cb_9);
        cb_10=(CheckBox)mInflate.findViewById( R.id.cb_10);
        cb_11=(CheckBox)mInflate.findViewById( R.id.cb_11);
        cb_12=(CheckBox)mInflate.findViewById( R.id.cb_12);
        cb_13=(CheckBox)mInflate.findViewById( R.id.cb_13);
        cb_14=(CheckBox)mInflate.findViewById( R.id.cb_14);
        cb_15=(CheckBox)mInflate.findViewById( R.id.cb_15);
        cb_16=(CheckBox)mInflate.findViewById( R.id.cb_16);
        cb_17=(CheckBox)mInflate.findViewById( R.id.cb_17);
        cb_18=(CheckBox)mInflate.findViewById( R.id.cb_18);
        cb_19=(CheckBox)mInflate.findViewById( R.id.cb_19);
        cb_20=(CheckBox)mInflate.findViewById( R.id.cb_20);
        cb_21=(CheckBox)mInflate.findViewById( R.id.cb_21);
        cb_22=(CheckBox)mInflate.findViewById( R.id.cb_22);
        cb_23=(CheckBox)mInflate.findViewById( R.id.cb_23);
        cb_24=(CheckBox)mInflate.findViewById( R.id.cb_24);
        cb_25=(CheckBox)mInflate.findViewById( R.id.cb_25);
        cb_26=(CheckBox)mInflate.findViewById( R.id.cb_26);
        cb_27=(CheckBox)mInflate.findViewById( R.id.cb_27);
        cb_28=(CheckBox)mInflate.findViewById( R.id.cb_28);
        cb_29= (CheckBox)mInflate.findViewById( R.id.cb_29);
        cb_30=(CheckBox)mInflate.findViewById( R.id.cb_30);
        cb_31=(CheckBox)mInflate.findViewById( R.id.cb_31);
    }

    private void disabledChecked() {

        cb_jan.setChecked(false);
        cb_feb.setChecked(false);
        cb_mar.setChecked(false);
        cb_apr.setChecked(false);
        cb_may.setChecked(false);
        cb_jun.setChecked(false);
        cb_jul.setChecked(false);
        cb_aug.setChecked(false);
        cb_sep.setChecked(false);
        cb_oct.setChecked(false);
        cb_nov.setChecked(false);
        cb_dec.setChecked(false);
        cb_1.setChecked(false);
        cb_2.setChecked(false);
        cb_3.setChecked(false);
        cb_4.setChecked(false);
        cb_5.setChecked(false);
        cb_6.setChecked(false);
        cb_7.setChecked(false);
        cb_8.setChecked(false);
        cb_9.setChecked(false);
        cb_10.setChecked(false);
        cb_11.setChecked(false);
        cb_12.setChecked(false);
        cb_13.setChecked(false);
        cb_14.setChecked(false);
        cb_15.setChecked(false);
        cb_16.setChecked(false);
        cb_17.setChecked(false);
        cb_18.setChecked(false);
        cb_19.setChecked(false);
        cb_20.setChecked(false);
        cb_21.setChecked(false);
        cb_22.setChecked(false);
        cb_23.setChecked(false);
        cb_24.setChecked(false);
        cb_25.setChecked(false);
        cb_26.setChecked(false);
        cb_27.setChecked(false);
        cb_28.setChecked(false);
        cb_29.setChecked(false);
        cb_30.setChecked(false);
        cb_31.setChecked(false);
    }

    public void initTimeBaseID() {
        for (int i = 1; i <= 20; i++) {
            list.add(i + "");
        }
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
                schedules.add(String.valueOf(scheduleId));
            }

        }
    }

    public void btDayBtnSubmit() {
        int month = 0;
        if (cb_jan.isChecked()) {
            month = month | 2;
        } else {

        }
        if (cb_feb.isChecked()) {
            month = month | 4;
        } else {

        }
        if (cb_mar.isChecked()) {
            month = month | 8;
        } else {

        }
        if (cb_apr.isChecked()) {
            month = month | 16;
        } else {

        }
        if (cb_may.isChecked()) {
            month = month | 32;
        } else {

        }
        if (cb_jun.isChecked()) {
            month = month | 64;
        } else {

        }
        if (cb_jul.isChecked()) {
            month = month | 128;
        } else {

        }
        if (cb_aug.isChecked()) {
            month = month | 256;
        } else {

        }
        if (cb_sep.isChecked()) {
            month = month | 512;
        } else {

        }
        if (cb_oct.isChecked()) {
            month = month | 1024;
        } else {

        }
        if (cb_nov.isChecked()) {
            month = month | 2048;
        } else {

        }
        if (cb_dec.isChecked()) {
            month = month | 4096;
        } else {

        }
        long day = 0;
        if (cb_1.isChecked()) {
            day = day | 2;
        } else {

        }
        if (cb_2.isChecked()) {
            day = day | 4;
        } else {

        }
        if (cb_3.isChecked()) {
            day = day | 8;
        } else {

        }
        if (cb_4.isChecked()) {
            day = day | 16;
        } else {

        }
        if (cb_5.isChecked()) {
            day = day | 32;
        } else {

        }
        if (cb_6.isChecked()) {
            day = day | 64;
        } else {

        }
        if (cb_7.isChecked()) {
            day = day | 128;
        } else {

        }
        if (cb_8.isChecked()) {
            day = day | 256;
        } else {

        }
        if (cb_9.isChecked()) {
            day = day | 512;
        } else {

        }
        if (cb_10.isChecked()) {
            day = day | 1024;
        } else {

        }
        if (cb_11.isChecked()) {
            day = day | 2048;
        } else {

        }
        if (cb_12.isChecked()) {
            day = day | 4096;
        } else {

        }
        if (cb_13.isChecked()) {
            day = day | 8192;
        } else {

        }
        if (cb_14.isChecked()) {
            day = day | 16384;
        } else {

        }
        if (cb_15.isChecked()) {
            day = day | 32768;
        } else {

        }
        if (cb_16.isChecked()) {
            day = day | 65536;
        } else {

        }
        if (cb_17.isChecked()) {
            day = day | 131072;
        } else {

        }
        if (cb_18.isChecked()) {
            day = day | 262144;
        } else {

        }
        if (cb_19.isChecked()) {
            day = day | 524288;
        } else {

        }
        if (cb_20.isChecked()) {
            day = day | 1048576;
        } else {

        }
        if (cb_21.isChecked()) {
            day = day | 2097152;
        } else {

        }
        if (cb_22.isChecked()) {
            day = day | 4194304;
        } else {

        }
        if (cb_23.isChecked()) {
            day = day | 8388608;
        } else {

        }
        if (cb_24.isChecked()) {
            day = day | 16777216;
        } else {

        }
        if (cb_25.isChecked()) {
            day = day | 33554432;
        } else {

        }
        if (cb_26.isChecked()) {
            day = day | 67108864;
        } else {

        }
        if (cb_27.isChecked()) {
            day = day | 134217728;
        } else {

        }
        if (cb_28.isChecked()) {
            day = day | 268435456;
        } else {

        }
        if (cb_29.isChecked()) {
            day = day | 536870912;
        } else {

        }
        if (cb_30.isChecked()) {
            day = day | 1073741824;
        } else {

        }
        if (cb_31.isChecked()) {
            day = day | 2147483648L;
        } else {

        }
        TscNode node = AndroidTscDefine.spToTscNode(AndroidTscDefine.getSharedPreferences(getActivity()));
        FinalDb db = AndroidTscDefine.getFinalDb(getActivity());
        GbtTimeBase gbtTimeBase = new GbtTimeBase();
        gbtTimeBase.setDay(day);
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
    }

    public void btDayBtnRead() {
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
            case R.id.btDayBtnRead:
                btDayBtnRead();
                break;
            case R.id.btDayBtnSubmit:
                btDayBtnSubmit();
                break;
        }
    }
}
