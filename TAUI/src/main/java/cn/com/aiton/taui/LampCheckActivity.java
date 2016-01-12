package cn.com.aiton.taui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import net.tsz.afinal.FinalActivity;
import net.tsz.afinal.annotation.view.ViewInject;

import java.util.ArrayList;
import java.util.List;

import cn.com.aiton.domain.GbtLampCheck;
import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;
import cn.com.aiton.services.LampCheckService;
import cn.com.aiton.services.impl.LampCheckServiceImpl;
import cn.com.aiton.utils.AndroidTscDefine;


public class LampCheckActivity extends FinalActivity {
    @ViewInject(id=R.id.cb_hardcheck)
    CheckBox cb_hardcheck;
    @ViewInject(id=R.id.cb_softcheck)
    CheckBox cb_softcheck;
    LampCheckService lampCheckService;
    TscNode node;
    View lamp1;
    View lamp2;
    View lamp3;
    View lamp4;
    View lamp5;
    View lamp6;
    View lamp7;
    View lamp8;
    CheckBox lamp1_cb_r1;
    CheckBox lamp1_cb_y1;
    CheckBox lamp1_cb_g1;
    CheckBox lamp1_cb_r2;
    CheckBox lamp1_cb_y2;
    CheckBox lamp1_cb_g2;
    CheckBox lamp1_cb_r3;
    CheckBox lamp1_cb_y3;
    CheckBox lamp1_cb_g3;
    CheckBox lamp1_cb_r4;
    CheckBox lamp1_cb_y4;
    CheckBox lamp1_cb_g4;
    CheckBox lamp1_cb_all;
    CheckBox lamp2_cb_r1;
    CheckBox lamp2_cb_y1;
    CheckBox lamp2_cb_g1;
    CheckBox lamp2_cb_r2;
    CheckBox lamp2_cb_y2;
    CheckBox lamp2_cb_g2;
    CheckBox lamp2_cb_r3;
    CheckBox lamp2_cb_y3;
    CheckBox lamp2_cb_g3;
    CheckBox lamp2_cb_r4;
    CheckBox lamp2_cb_y4;
    CheckBox lamp2_cb_g4;
    CheckBox lamp2_cb_all;
    CheckBox lamp3_cb_r1;
    CheckBox lamp3_cb_y1;
    CheckBox lamp3_cb_g1;
    CheckBox lamp3_cb_r2;
    CheckBox lamp3_cb_y2;
    CheckBox lamp3_cb_g2;
    CheckBox lamp3_cb_r3;
    CheckBox lamp3_cb_y3;
    CheckBox lamp3_cb_g3;
    CheckBox lamp3_cb_r4;
    CheckBox lamp3_cb_y4;
    CheckBox lamp3_cb_g4;
    CheckBox lamp3_cb_all;
    CheckBox lamp4_cb_r1;
    CheckBox lamp4_cb_y1;
    CheckBox lamp4_cb_g1;
    CheckBox lamp4_cb_r2;
    CheckBox lamp4_cb_y2;
    CheckBox lamp4_cb_g2;
    CheckBox lamp4_cb_r3;
    CheckBox lamp4_cb_y3;
    CheckBox lamp4_cb_g3;
    CheckBox lamp4_cb_r4;
    CheckBox lamp4_cb_y4;
    CheckBox lamp4_cb_g4;
    CheckBox lamp4_cb_all;
    CheckBox lamp5_cb_r1;
    CheckBox lamp5_cb_y1;
    CheckBox lamp5_cb_g1;
    CheckBox lamp5_cb_r2;
    CheckBox lamp5_cb_y2;
    CheckBox lamp5_cb_g2;
    CheckBox lamp5_cb_r3;
    CheckBox lamp5_cb_y3;
    CheckBox lamp5_cb_g3;
    CheckBox lamp5_cb_r4;
    CheckBox lamp5_cb_y4;
    CheckBox lamp5_cb_g4;
    CheckBox lamp5_cb_all;
    CheckBox lamp6_cb_r1;
    CheckBox lamp6_cb_y1;
    CheckBox lamp6_cb_g1;
    CheckBox lamp6_cb_r2;
    CheckBox lamp6_cb_y2;
    CheckBox lamp6_cb_g2;
    CheckBox lamp6_cb_r3;
    CheckBox lamp6_cb_y3;
    CheckBox lamp6_cb_g3;
    CheckBox lamp6_cb_r4;
    CheckBox lamp6_cb_y4;
    CheckBox lamp6_cb_g4;
    CheckBox lamp6_cb_all;
    CheckBox lamp7_cb_r1;
    CheckBox lamp7_cb_y1;
    CheckBox lamp7_cb_g1;
    CheckBox lamp7_cb_r2;
    CheckBox lamp7_cb_y2;
    CheckBox lamp7_cb_g2;
    CheckBox lamp7_cb_r3;
    CheckBox lamp7_cb_y3;
    CheckBox lamp7_cb_g3;
    CheckBox lamp7_cb_r4;
    CheckBox lamp7_cb_y4;
    CheckBox lamp7_cb_g4;
    CheckBox lamp7_cb_all;
    CheckBox lamp8_cb_r1;
    CheckBox lamp8_cb_y1;
    CheckBox lamp8_cb_g1;
    CheckBox lamp8_cb_r2;
    CheckBox lamp8_cb_y2;
    CheckBox lamp8_cb_g2;
    CheckBox lamp8_cb_r3;
    CheckBox lamp8_cb_y3;
    CheckBox lamp8_cb_g3;
    CheckBox lamp8_cb_r4;
    CheckBox lamp8_cb_y4;
    CheckBox lamp8_cb_g4;
    CheckBox lamp8_cb_all;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏
        setContentView(R.layout.activity_lamp_check);
        lampCheckService = new LampCheckServiceImpl();
        lamp1 = (View)findViewById(R.id.lamp1);
        lamp2 = (View)findViewById(R.id.lamp2);
        lamp3 = (View)findViewById(R.id.lamp3);
        lamp4 = (View)findViewById(R.id.lamp4);
        lamp5 = (View)findViewById(R.id.lamp5);
        lamp6 = (View)findViewById(R.id.lamp6);
        lamp7 = (View)findViewById(R.id.lamp7);
        lamp8 = (View)findViewById(R.id.lamp8);
        lamp1_cb_r1 = (CheckBox)lamp1.findViewById(R.id.cb_r1);
        lamp1_cb_y1 = (CheckBox)lamp1.findViewById(R.id.cb_y1);
        lamp1_cb_g1 = (CheckBox)lamp1.findViewById(R.id.cb_g1);
        lamp1_cb_r2 = (CheckBox)lamp1.findViewById(R.id.cb_r2);
        lamp1_cb_y2 = (CheckBox)lamp1.findViewById(R.id.cb_y2);
        lamp1_cb_g2 = (CheckBox)lamp1.findViewById(R.id.cb_g2);
        lamp1_cb_r3 = (CheckBox)lamp1.findViewById(R.id.cb_r3);
        lamp1_cb_y3 = (CheckBox)lamp1.findViewById(R.id.cb_y3);
        lamp1_cb_g3 = (CheckBox)lamp1.findViewById(R.id.cb_g3);
        lamp1_cb_r4 = (CheckBox)lamp1.findViewById(R.id.cb_r4);
        lamp1_cb_y4 = (CheckBox)lamp1.findViewById(R.id.cb_y4);
        lamp1_cb_g4 = (CheckBox)lamp1.findViewById(R.id.cb_g4);
        lamp1_cb_all = (CheckBox)lamp1.findViewById(R.id.cb_all);
        lamp2_cb_r1 = (CheckBox)lamp2.findViewById(R.id.cb_r1);
        lamp2_cb_y1 = (CheckBox)lamp2.findViewById(R.id.cb_y1);
        lamp2_cb_g1 = (CheckBox)lamp2.findViewById(R.id.cb_g1);
        lamp2_cb_r2 = (CheckBox)lamp2.findViewById(R.id.cb_r2);
        lamp2_cb_y2 = (CheckBox)lamp2.findViewById(R.id.cb_y2);
        lamp2_cb_g2 = (CheckBox)lamp2.findViewById(R.id.cb_g2);
        lamp2_cb_r3 = (CheckBox)lamp2.findViewById(R.id.cb_r3);
        lamp2_cb_y3 = (CheckBox)lamp2.findViewById(R.id.cb_y3);
        lamp2_cb_g3 = (CheckBox)lamp2.findViewById(R.id.cb_g3);
        lamp2_cb_r4 = (CheckBox)lamp2.findViewById(R.id.cb_r4);
        lamp2_cb_y4 = (CheckBox)lamp2.findViewById(R.id.cb_y4);
        lamp2_cb_g4 = (CheckBox)lamp2.findViewById(R.id.cb_g4);
        lamp2_cb_all = (CheckBox)lamp2.findViewById(R.id.cb_all);
        lamp3_cb_r1 = (CheckBox)lamp3.findViewById(R.id.cb_r1);
        lamp3_cb_y1 = (CheckBox)lamp3.findViewById(R.id.cb_y1);
        lamp3_cb_g1 = (CheckBox)lamp3.findViewById(R.id.cb_g1);
        lamp3_cb_r2 = (CheckBox)lamp3.findViewById(R.id.cb_r2);
        lamp3_cb_y2 = (CheckBox)lamp3.findViewById(R.id.cb_y2);
        lamp3_cb_g2 = (CheckBox)lamp3.findViewById(R.id.cb_g2);
        lamp3_cb_r3 = (CheckBox)lamp3.findViewById(R.id.cb_r3);
        lamp3_cb_y3 = (CheckBox)lamp3.findViewById(R.id.cb_y3);
        lamp3_cb_g3 = (CheckBox)lamp3.findViewById(R.id.cb_g3);
        lamp3_cb_r4 = (CheckBox)lamp3.findViewById(R.id.cb_r4);
        lamp3_cb_y4 = (CheckBox)lamp3.findViewById(R.id.cb_y4);
        lamp3_cb_g4 = (CheckBox)lamp3.findViewById(R.id.cb_g4);
        lamp3_cb_all = (CheckBox)lamp3.findViewById(R.id.cb_all);
        lamp4_cb_r1 = (CheckBox)lamp4.findViewById(R.id.cb_r1);
        lamp4_cb_y1 = (CheckBox)lamp4.findViewById(R.id.cb_y1);
        lamp4_cb_g1 = (CheckBox)lamp4.findViewById(R.id.cb_g1);
        lamp4_cb_r2 = (CheckBox)lamp4.findViewById(R.id.cb_r2);
        lamp4_cb_y2 = (CheckBox)lamp4.findViewById(R.id.cb_y2);
        lamp4_cb_g2 = (CheckBox)lamp4.findViewById(R.id.cb_g2);
        lamp4_cb_r3 = (CheckBox)lamp4.findViewById(R.id.cb_r3);
        lamp4_cb_y3 = (CheckBox)lamp4.findViewById(R.id.cb_y3);
        lamp4_cb_g3 = (CheckBox)lamp4.findViewById(R.id.cb_g3);
        lamp4_cb_r4 = (CheckBox)lamp4.findViewById(R.id.cb_r4);
        lamp4_cb_y4 = (CheckBox)lamp4.findViewById(R.id.cb_y4);
        lamp4_cb_g4 = (CheckBox)lamp4.findViewById(R.id.cb_g4);
        lamp4_cb_all = (CheckBox)lamp4.findViewById(R.id.cb_all);
        lamp5_cb_r1 = (CheckBox)lamp5.findViewById(R.id.cb_r1);
        lamp5_cb_y1 = (CheckBox)lamp5.findViewById(R.id.cb_y1);
        lamp5_cb_g1 = (CheckBox)lamp5.findViewById(R.id.cb_g1);
        lamp5_cb_r2 = (CheckBox)lamp5.findViewById(R.id.cb_r2);
        lamp5_cb_y2 = (CheckBox)lamp5.findViewById(R.id.cb_y2);
        lamp5_cb_g2 = (CheckBox)lamp5.findViewById(R.id.cb_g2);
        lamp5_cb_r3 = (CheckBox)lamp5.findViewById(R.id.cb_r3);
        lamp5_cb_y3 = (CheckBox)lamp5.findViewById(R.id.cb_y3);
        lamp5_cb_g3 = (CheckBox)lamp5.findViewById(R.id.cb_g3);
        lamp5_cb_r4 = (CheckBox)lamp5.findViewById(R.id.cb_r4);
        lamp5_cb_y4 = (CheckBox)lamp5.findViewById(R.id.cb_y4);
        lamp5_cb_g4 = (CheckBox)lamp5.findViewById(R.id.cb_g4);
        lamp5_cb_all = (CheckBox)lamp5.findViewById(R.id.cb_all);
        lamp6_cb_r1 = (CheckBox)lamp6.findViewById(R.id.cb_r1);
        lamp6_cb_y1 = (CheckBox)lamp6.findViewById(R.id.cb_y1);
        lamp6_cb_g1 = (CheckBox)lamp6.findViewById(R.id.cb_g1);
        lamp6_cb_r2 = (CheckBox)lamp6.findViewById(R.id.cb_r2);
        lamp6_cb_y2 = (CheckBox)lamp6.findViewById(R.id.cb_y2);
        lamp6_cb_g2 = (CheckBox)lamp6.findViewById(R.id.cb_g2);
        lamp6_cb_r3 = (CheckBox)lamp6.findViewById(R.id.cb_r3);
        lamp6_cb_y3 = (CheckBox)lamp6.findViewById(R.id.cb_y3);
        lamp6_cb_g3 = (CheckBox)lamp6.findViewById(R.id.cb_g3);
        lamp6_cb_r4 = (CheckBox)lamp6.findViewById(R.id.cb_r4);
        lamp6_cb_y4 = (CheckBox)lamp6.findViewById(R.id.cb_y4);
        lamp6_cb_g4 = (CheckBox)lamp6.findViewById(R.id.cb_g4);
        lamp6_cb_all = (CheckBox)lamp6.findViewById(R.id.cb_all);
        lamp7_cb_r1 = (CheckBox)lamp7.findViewById(R.id.cb_r1);
        lamp7_cb_y1 = (CheckBox)lamp7.findViewById(R.id.cb_y1);
        lamp7_cb_g1 = (CheckBox)lamp7.findViewById(R.id.cb_g1);
        lamp7_cb_r2 = (CheckBox)lamp7.findViewById(R.id.cb_r2);
        lamp7_cb_y2 = (CheckBox)lamp7.findViewById(R.id.cb_y2);
        lamp7_cb_g2 = (CheckBox)lamp7.findViewById(R.id.cb_g2);
        lamp7_cb_r3 = (CheckBox)lamp7.findViewById(R.id.cb_r3);
        lamp7_cb_y3 = (CheckBox)lamp7.findViewById(R.id.cb_y3);
        lamp7_cb_g3 = (CheckBox)lamp7.findViewById(R.id.cb_g3);
        lamp7_cb_r4 = (CheckBox)lamp7.findViewById(R.id.cb_r4);
        lamp7_cb_y4 = (CheckBox)lamp7.findViewById(R.id.cb_y4);
        lamp7_cb_g4 = (CheckBox)lamp7.findViewById(R.id.cb_g4);
        lamp7_cb_all = (CheckBox)lamp7.findViewById(R.id.cb_all);
        lamp8_cb_r1 = (CheckBox)lamp8.findViewById(R.id.cb_r1);
        lamp8_cb_y1 = (CheckBox)lamp8.findViewById(R.id.cb_y1);
        lamp8_cb_g1 = (CheckBox)lamp8.findViewById(R.id.cb_g1);
        lamp8_cb_r2 = (CheckBox)lamp8.findViewById(R.id.cb_r2);
        lamp8_cb_y2 = (CheckBox)lamp8.findViewById(R.id.cb_y2);
        lamp8_cb_g2 = (CheckBox)lamp8.findViewById(R.id.cb_g2);
        lamp8_cb_r3 = (CheckBox)lamp8.findViewById(R.id.cb_r3);
        lamp8_cb_y3 = (CheckBox)lamp8.findViewById(R.id.cb_y3);
        lamp8_cb_g3 = (CheckBox)lamp8.findViewById(R.id.cb_g3);
        lamp8_cb_r4 = (CheckBox)lamp8.findViewById(R.id.cb_r4);
        lamp8_cb_y4 = (CheckBox)lamp8.findViewById(R.id.cb_y4);
        lamp8_cb_g4 = (CheckBox)lamp8.findViewById(R.id.cb_g4);
        lamp8_cb_all = (CheckBox)lamp8.findViewById(R.id.cb_all);
        node = AndroidTscDefine.spToTscNode(AndroidTscDefine.getSharedPreferences(this));
        cb_hardcheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    lampCheckService.setLampCheckCloseALL(node);
                else
                    lampCheckService.setLampCheckOpenALL(node);
            }
        });
        cb_softcheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //lampCheckService.getLampCheck(node);
            }
        });
        lamp1_cb_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lamp1_cb_all.isChecked()) {
                    lamp1_cb_r1.setChecked(true);
                    lamp1_cb_y1.setChecked(true);
                    lamp1_cb_g1.setChecked(true);
                    lamp1_cb_r2.setChecked(true);
                    lamp1_cb_y2.setChecked(true);
                    lamp1_cb_g2.setChecked(true);
                    lamp1_cb_r3.setChecked(true);
                    lamp1_cb_y3.setChecked(true);
                    lamp1_cb_g3.setChecked(true);
                    lamp1_cb_r4.setChecked(true);
                    lamp1_cb_y4.setChecked(true);
                    lamp1_cb_g4.setChecked(true);
                } else {
                    lamp1_cb_r1.setChecked(false);
                    lamp1_cb_y1.setChecked(false);
                    lamp1_cb_g1.setChecked(false);
                    lamp1_cb_r2.setChecked(false);
                    lamp1_cb_y2.setChecked(false);
                    lamp1_cb_g2.setChecked(false);
                    lamp1_cb_r3.setChecked(false);
                    lamp1_cb_y3.setChecked(false);
                    lamp1_cb_g3.setChecked(false);
                    lamp1_cb_r4.setChecked(false);
                    lamp1_cb_y4.setChecked(false);
                    lamp1_cb_g4.setChecked(false);
                }
            }
        });
        lamp2_cb_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lamp2_cb_all.isChecked()) {
                    lamp2_cb_r1.setChecked(true);
                    lamp2_cb_y1.setChecked(true);
                    lamp2_cb_g1.setChecked(true);
                    lamp2_cb_r2.setChecked(true);
                    lamp2_cb_y2.setChecked(true);
                    lamp2_cb_g2.setChecked(true);
                    lamp2_cb_r3.setChecked(true);
                    lamp2_cb_y3.setChecked(true);
                    lamp2_cb_g3.setChecked(true);
                    lamp2_cb_r4.setChecked(true);
                    lamp2_cb_y4.setChecked(true);
                    lamp2_cb_g4.setChecked(true);
                } else {
                    lamp2_cb_r1.setChecked(false);
                    lamp2_cb_y1.setChecked(false);
                    lamp2_cb_g1.setChecked(false);
                    lamp2_cb_r2.setChecked(false);
                    lamp2_cb_y2.setChecked(false);
                    lamp2_cb_g2.setChecked(false);
                    lamp2_cb_r3.setChecked(false);
                    lamp2_cb_y3.setChecked(false);
                    lamp2_cb_g3.setChecked(false);
                    lamp2_cb_r4.setChecked(false);
                    lamp2_cb_y4.setChecked(false);
                    lamp2_cb_g4.setChecked(false);
                }
            }
        });
        lamp3_cb_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lamp3_cb_all.isChecked()) {
                    lamp3_cb_r1.setChecked(true);
                    lamp3_cb_y1.setChecked(true);
                    lamp3_cb_g1.setChecked(true);
                    lamp3_cb_r2.setChecked(true);
                    lamp3_cb_y2.setChecked(true);
                    lamp3_cb_g2.setChecked(true);
                    lamp3_cb_r3.setChecked(true);
                    lamp3_cb_y3.setChecked(true);
                    lamp3_cb_g3.setChecked(true);
                    lamp3_cb_r4.setChecked(true);
                    lamp3_cb_y4.setChecked(true);
                    lamp3_cb_g4.setChecked(true);
                } else {
                    lamp3_cb_r1.setChecked(false);
                    lamp3_cb_y1.setChecked(false);
                    lamp3_cb_g1.setChecked(false);
                    lamp3_cb_r2.setChecked(false);
                    lamp3_cb_y2.setChecked(false);
                    lamp3_cb_g2.setChecked(false);
                    lamp3_cb_r3.setChecked(false);
                    lamp3_cb_y3.setChecked(false);
                    lamp3_cb_g3.setChecked(false);
                    lamp3_cb_r4.setChecked(false);
                    lamp3_cb_y4.setChecked(false);
                    lamp3_cb_g4.setChecked(false);
                }
            }
        });
        lamp4_cb_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lamp4_cb_all.isChecked()) {
                    lamp4_cb_r1.setChecked(true);
                    lamp4_cb_y1.setChecked(true);
                    lamp4_cb_g1.setChecked(true);
                    lamp4_cb_r2.setChecked(true);
                    lamp4_cb_y2.setChecked(true);
                    lamp4_cb_g2.setChecked(true);
                    lamp4_cb_r3.setChecked(true);
                    lamp4_cb_y3.setChecked(true);
                    lamp4_cb_g3.setChecked(true);
                    lamp4_cb_r4.setChecked(true);
                    lamp4_cb_y4.setChecked(true);
                    lamp4_cb_g4.setChecked(true);
                } else {
                    lamp4_cb_r1.setChecked(false);
                    lamp4_cb_y1.setChecked(false);
                    lamp4_cb_g1.setChecked(false);
                    lamp4_cb_r2.setChecked(false);
                    lamp4_cb_y2.setChecked(false);
                    lamp4_cb_g2.setChecked(false);
                    lamp4_cb_r3.setChecked(false);
                    lamp4_cb_y3.setChecked(false);
                    lamp4_cb_g3.setChecked(false);
                    lamp4_cb_r4.setChecked(false);
                    lamp4_cb_y4.setChecked(false);
                    lamp4_cb_g4.setChecked(false);
                }
            }
        });
        lamp5_cb_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lamp5_cb_all.isChecked()) {
                    lamp5_cb_r1.setChecked(true);
                    lamp5_cb_y1.setChecked(true);
                    lamp5_cb_g1.setChecked(true);
                    lamp5_cb_r2.setChecked(true);
                    lamp5_cb_y2.setChecked(true);
                    lamp5_cb_g2.setChecked(true);
                    lamp5_cb_r3.setChecked(true);
                    lamp5_cb_y3.setChecked(true);
                    lamp5_cb_g3.setChecked(true);
                    lamp5_cb_r4.setChecked(true);
                    lamp5_cb_y4.setChecked(true);
                    lamp5_cb_g4.setChecked(true);
                } else {
                    lamp5_cb_r1.setChecked(false);
                    lamp5_cb_y1.setChecked(false);
                    lamp5_cb_g1.setChecked(false);
                    lamp5_cb_r2.setChecked(false);
                    lamp5_cb_y2.setChecked(false);
                    lamp5_cb_g2.setChecked(false);
                    lamp5_cb_r3.setChecked(false);
                    lamp5_cb_y3.setChecked(false);
                    lamp5_cb_g3.setChecked(false);
                    lamp5_cb_r4.setChecked(false);
                    lamp5_cb_y4.setChecked(false);
                    lamp5_cb_g4.setChecked(false);
                }
            }
        });
        lamp6_cb_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lamp6_cb_all.isChecked()) {
                    lamp6_cb_r1.setChecked(true);
                    lamp6_cb_y1.setChecked(true);
                    lamp6_cb_g1.setChecked(true);
                    lamp6_cb_r2.setChecked(true);
                    lamp6_cb_y2.setChecked(true);
                    lamp6_cb_g2.setChecked(true);
                    lamp6_cb_r3.setChecked(true);
                    lamp6_cb_y3.setChecked(true);
                    lamp6_cb_g3.setChecked(true);
                    lamp6_cb_r4.setChecked(true);
                    lamp6_cb_y4.setChecked(true);
                    lamp6_cb_g4.setChecked(true);
                } else {
                    lamp6_cb_r1.setChecked(false);
                    lamp6_cb_y1.setChecked(false);
                    lamp6_cb_g1.setChecked(false);
                    lamp6_cb_r2.setChecked(false);
                    lamp6_cb_y2.setChecked(false);
                    lamp6_cb_g2.setChecked(false);
                    lamp6_cb_r3.setChecked(false);
                    lamp6_cb_y3.setChecked(false);
                    lamp6_cb_g3.setChecked(false);
                    lamp6_cb_r4.setChecked(false);
                    lamp6_cb_y4.setChecked(false);
                    lamp6_cb_g4.setChecked(false);
                }
            }
        });
        lamp7_cb_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lamp7_cb_all.isChecked()) {
                    lamp7_cb_r1.setChecked(true);
                    lamp7_cb_y1.setChecked(true);
                    lamp7_cb_g1.setChecked(true);
                    lamp7_cb_r2.setChecked(true);
                    lamp7_cb_y2.setChecked(true);
                    lamp7_cb_g2.setChecked(true);
                    lamp7_cb_r3.setChecked(true);
                    lamp7_cb_y3.setChecked(true);
                    lamp7_cb_g3.setChecked(true);
                    lamp7_cb_r4.setChecked(true);
                    lamp7_cb_y4.setChecked(true);
                    lamp7_cb_g4.setChecked(true);
                } else {
                    lamp7_cb_r1.setChecked(false);
                    lamp7_cb_y1.setChecked(false);
                    lamp7_cb_g1.setChecked(false);
                    lamp7_cb_r2.setChecked(false);
                    lamp7_cb_y2.setChecked(false);
                    lamp7_cb_g2.setChecked(false);
                    lamp7_cb_r3.setChecked(false);
                    lamp7_cb_y3.setChecked(false);
                    lamp7_cb_g3.setChecked(false);
                    lamp7_cb_r4.setChecked(false);
                    lamp7_cb_y4.setChecked(false);
                    lamp7_cb_g4.setChecked(false);
                }
            }
        });
        lamp8_cb_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lamp8_cb_all.isChecked()) {
                    lamp8_cb_r1.setChecked(true);
                    lamp8_cb_y1.setChecked(true);
                    lamp8_cb_g1.setChecked(true);
                    lamp8_cb_r2.setChecked(true);
                    lamp8_cb_y2.setChecked(true);
                    lamp8_cb_g2.setChecked(true);
                    lamp8_cb_r3.setChecked(true);
                    lamp8_cb_y3.setChecked(true);
                    lamp8_cb_g3.setChecked(true);
                    lamp8_cb_r4.setChecked(true);
                    lamp8_cb_y4.setChecked(true);
                    lamp8_cb_g4.setChecked(true);
                } else {
                    lamp8_cb_r1.setChecked(false);
                    lamp8_cb_y1.setChecked(false);
                    lamp8_cb_g1.setChecked(false);
                    lamp8_cb_r2.setChecked(false);
                    lamp8_cb_y2.setChecked(false);
                    lamp8_cb_g2.setChecked(false);
                    lamp8_cb_r3.setChecked(false);
                    lamp8_cb_y3.setChecked(false);
                    lamp8_cb_g3.setChecked(false);
                    lamp8_cb_r4.setChecked(false);
                    lamp8_cb_y4.setChecked(false);
                    lamp8_cb_g4.setChecked(false);
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.lamp_check, menu);
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
    public void btnSave(View view){
        List<GbtLampCheck> gbtLampChecks = new ArrayList<GbtLampCheck>();
       // GbtLampCheck gbtLampCheck;
        if(lamp1_cb_r1.isChecked()){
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(1);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(1);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp1_cb_y1.isChecked()){
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(2);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(2);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp1_cb_g1.isChecked()){
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(3);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(3);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp1_cb_r2.isChecked()){
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(4);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(4);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp1_cb_y2.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(5);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(5);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp1_cb_g2.isChecked()){
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(6);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(6);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp1_cb_r3.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(7);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(7);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp1_cb_y3.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(8);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(8);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp1_cb_g3.isChecked()){
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(9);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(9);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp1_cb_r4.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(10);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(10);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp1_cb_y4.isChecked()){
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(11);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(11);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp1_cb_g4.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(12);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(12);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp1_cb_all.isChecked()){
           // gbtLampCheck = new GbtLampCheck();
            //gbtLampCheck.setLampId(13);
           // gbtLampCheck.setLampFlag(1);
        }else{
           // gbtLampCheck = new GbtLampCheck();
           // gbtLampCheck.setLampId(13);
           // gbtLampCheck.setLampFlag(0);
        }
        if(lamp2_cb_r1.isChecked()){
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(13);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(13);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp2_cb_y1.isChecked()){
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(14);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(14);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp2_cb_g1.isChecked()){
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(15);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(15);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp2_cb_r2.isChecked()){
            GbtLampCheck    gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(16);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(16);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp2_cb_y2.isChecked()){
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(17);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(17);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp2_cb_g2.isChecked()){
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(18);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(18);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp2_cb_r3.isChecked()){
            GbtLampCheck    gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(19);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(19);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp2_cb_y3.isChecked()){
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(20);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(20);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp2_cb_g3.isChecked()){
            GbtLampCheck    gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(21);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(21);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp2_cb_r4.isChecked()){
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(22);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(22);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp2_cb_y4.isChecked()){
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(23);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(23);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp2_cb_g4.isChecked()){
            GbtLampCheck    gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(24);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck    gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(24);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp2_cb_all.isChecked()){
            //gbtLampCheck = new GbtLampCheck();
           // gbtLampCheck.setLampId(26);
           // gbtLampCheck.setLampFlag(1);
        }else{
          //  gbtLampCheck = new GbtLampCheck();
         //   gbtLampCheck.setLampId(26);
          //  gbtLampCheck.setLampFlag(0);
        }
        if(lamp3_cb_r1.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(25);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(25);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp3_cb_y1.isChecked()){
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(26);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(26);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp3_cb_g1.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(27);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(27);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp3_cb_r2.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(28);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(28);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp3_cb_y2.isChecked()){
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(29);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(29);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp3_cb_g2.isChecked()){
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(30);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(30);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp3_cb_r3.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(31);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(31);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp3_cb_y3.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(32);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(32);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp3_cb_g3.isChecked()){
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(33);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(33);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp3_cb_r4.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(34);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(34);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp3_cb_y4.isChecked()){
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(35);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(35);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp3_cb_g4.isChecked()){
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(36);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(36);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp3_cb_all.isChecked()){
           // gbtLampCheck = new GbtLampCheck();
          //  gbtLampCheck.setLampId(39);
          //  gbtLampCheck.setLampFlag(1);
        }else{
         //   gbtLampCheck = new GbtLampCheck();
         //   gbtLampCheck.setLampId(39);
         //   gbtLampCheck.setLampFlag(0);
        }
        if(lamp4_cb_r1.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(37);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(37);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp4_cb_y1.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(38);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(38);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp4_cb_g1.isChecked()){
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(39);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(39);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp4_cb_r2.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(40);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(40);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp4_cb_y2.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(41);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(41);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp4_cb_g2.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(42);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(42);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp4_cb_r3.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(43);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(43);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp4_cb_y3.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(44);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(44);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp4_cb_g3.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(45);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(45);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp4_cb_r4.isChecked()){
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(46);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(46);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp4_cb_y4.isChecked()){
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(47);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(47);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp4_cb_g4.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(48);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(48);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp4_cb_all.isChecked()){
          //  gbtLampCheck = new GbtLampCheck();
          //  gbtLampCheck.setLampId(52);
           // gbtLampCheck.setLampFlag(1);
        }else{
          //  gbtLampCheck = new GbtLampCheck();
          //  gbtLampCheck.setLampId(52);
          //  gbtLampCheck.setLampFlag(0);
        }
        if(lamp5_cb_r1.isChecked()){
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(49);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(49);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp5_cb_y1.isChecked()){
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(50);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(50);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp5_cb_g1.isChecked()){
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(51);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(51);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp5_cb_r2.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(52);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(52);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp5_cb_y2.isChecked()){
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(53);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(53);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp5_cb_g2.isChecked()){
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(54);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(54);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp5_cb_r3.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(55);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(55);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp5_cb_y3.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(56);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(56);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp5_cb_g3.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(57);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(57);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp5_cb_r4.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(58);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(58);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp5_cb_y4.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(59);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(59);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp5_cb_g4.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(60);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(60);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp5_cb_all.isChecked()){
           // gbtLampCheck = new GbtLampCheck();
           // gbtLampCheck.setLampId(26);
          //  gbtLampCheck.setLampFlag(1);
        }else{
          //  gbtLampCheck = new GbtLampCheck();
           // gbtLampCheck.setLampId(26);
          //  gbtLampCheck.setLampFlag(0);
        }
        if(lamp6_cb_r1.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(61);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(61);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp6_cb_y1.isChecked()){
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(62);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(62);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp6_cb_g1.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(63);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(63);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp6_cb_r2.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(64);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(64);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp6_cb_y2.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(65);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(65);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp6_cb_g2.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(66);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(66);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp6_cb_r3.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(67);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(67);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp6_cb_y3.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(68);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(68);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp6_cb_g3.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(69);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(69);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp6_cb_r4.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(70);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(70);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp6_cb_y4.isChecked()){
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(71);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(71);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp6_cb_g4.isChecked()){
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(72);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(72);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp6_cb_all.isChecked()){
           // gbtLampCheck = new GbtLampCheck();
           // gbtLampCheck.setLampId(74);
           // gbtLampCheck.setLampFlag(1);
        }else{
          //  gbtLampCheck = new GbtLampCheck();
          //  gbtLampCheck.setLampId(74);
          //  gbtLampCheck.setLampFlag(0);
        }
        if(lamp7_cb_r1.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(73);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(73);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp7_cb_y1.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(74);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(74);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp7_cb_g1.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(75);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(75);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp7_cb_r2.isChecked()){
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(76);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(76);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp7_cb_y2.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(77);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(77);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp7_cb_g2.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(78);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(78);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp7_cb_r3.isChecked()){
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(79);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(79);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp7_cb_y3.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(80);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(80);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp7_cb_g3.isChecked()){
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(81);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(81);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp7_cb_r4.isChecked()){
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(82);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(82);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp7_cb_y4.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(83);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(83);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp7_cb_g4.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(84);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck   gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(84);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp7_cb_all.isChecked()){
          //  gbtLampCheck = new GbtLampCheck();
         //   gbtLampCheck.setLampId(86);
         //   gbtLampCheck.setLampFlag(1);
        }else{
         //   gbtLampCheck = new GbtLampCheck();
         //   gbtLampCheck.setLampId(86);
         //   gbtLampCheck.setLampFlag(0);
        }
        if(lamp8_cb_r1.isChecked()){
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(85);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(85);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp8_cb_y1.isChecked()){
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(86);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(86);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp8_cb_g1.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(87);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(87);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp8_cb_r2.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(88);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(88);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp8_cb_y2.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(89);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(89);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp8_cb_g2.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(90);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(90);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp8_cb_r3.isChecked()){
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(91);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(91);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp8_cb_y3.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(92);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(92);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp8_cb_g3.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(93);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(93);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp8_cb_r4.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(94);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(94);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp8_cb_y4.isChecked()){
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(95);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(95);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp8_cb_g4.isChecked()){
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(96);
            gbtLampCheck.setLampFlag(1);
            gbtLampChecks.add(gbtLampCheck);
        }else{
            GbtLampCheck  gbtLampCheck = new GbtLampCheck();
            gbtLampCheck.setLampId(96);
            gbtLampCheck.setLampFlag(0);
            gbtLampChecks.add(gbtLampCheck);
        }
        if(lamp8_cb_all.isChecked()){
            //gbtLampCheck = new GbtLampCheck();
            //gbtLampCheck.setLampId(26);
            //gbtLampCheck.setLampFlag(1);
        }else{
            //gbtLampCheck = new GbtLampCheck();
            //gbtLampCheck.setLampId(26);
           // gbtLampCheck.setLampFlag(0);
        }
           // gbtLampChecks.add()
        Message m = lampCheckService.setLampCheck(gbtLampChecks,node);
     //   Toast.makeText(this,m.getMsg(),Toast.LENGTH_LONG).show();
    }
}
