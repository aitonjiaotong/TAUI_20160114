package cn.com.aiton.taui;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.View;
import android.widget.TextView;

import cn.com.aiton.taui.fragment.ManaulFragment;
import cn.com.aiton.taui.fragment.Fragment02;
import cn.com.aiton.taui.fragment.Fragment03;
import cn.com.aiton.taui.fragment.Fragment04;
import cn.com.aiton.taui.fragment.Fragment05;
import cn.com.aiton.taui.fragment.Fragment06;
import cn.com.aiton.taui.fragment.Fragment07;

public class PhaseActivity01 extends FragmentActivity {

    private String[] tabsItem = new String[]{
            "手控",
            "时基",
            "相位",
            "冲突",
            "配时",
            "检测器",
            "灯检"
    };
    private Class[] fragment = new Class[]{
            ManaulFragment.class,
            Fragment02.class,
            Fragment03.class,
            Fragment04.class,
            Fragment05.class,
            Fragment06.class,
            Fragment07.class
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase01);
        FragmentTabHost tabHost = (FragmentTabHost) findViewById(R.id.tabHost);
        tabHost.setup(this, getSupportFragmentManager(), R.id.realtab);
        for (int i = 0; i <tabsItem.length; i++) {
            View inflate = getLayoutInflater().inflate(R.layout.tabs_item, null);
            TextView tabs_text = (TextView) inflate.findViewById(R.id.tabs_text);
            tabs_text.setText(tabsItem[i]);
            tabHost.addTab(tabHost.newTabSpec(tabsItem[i]).setIndicator(inflate), fragment[i],null);
        }
    }
}
