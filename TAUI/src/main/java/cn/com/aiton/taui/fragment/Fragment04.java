package cn.com.aiton.taui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import cn.com.aiton.taui.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment04 extends Fragment
{

    TextView tv_northleft;
    TextView tv_northstraight;
    TextView tv_northright;
    TextView tv_northother;
    TextView tv_northpedestrain1;
    TextView tv_northpedestrain2;
    TextView tv_northnone1;
    TextView tv_northnone2;

    TextView tv_eastleft;
    TextView tv_eaststraight;
    TextView tv_eastright;
    TextView tv_eastother;
    TextView tv_eastpedestrain1;
    TextView tv_eastpedestrain2;
    TextView tv_eastnone1;
    TextView tv_eastnone2;

    TextView tv_southleft;
    TextView tv_southstraight;
    TextView tv_southright;
    TextView tv_southother;
    TextView tv_southpedestrain1;
    TextView tv_southpedestrain2;
    TextView tv_southnone1;
    TextView tv_southnone2;

    TextView tv_westleft;
    TextView tv_weststraight;
    TextView tv_westright;
    TextView tv_westother;
    TextView tv_westpedestrain1;
    TextView tv_westpedestrain2;
    TextView tv_westnone1;
    TextView tv_westnone2;
    TextView tv_phase_config_alarm;
    private ImageView northRight;
    private ImageView northOther;
    private ImageView northLeft;
    private ImageView northStriaght;
    private ImageView northPedestrain1;
    private ImageView northPedestrain2;
    private ImageView northNone1;
    private ImageView northNone2;
    private ImageView eastOther;
    private ImageView eastRight;
    private ImageView eastStriaght;
    private ImageView eastLeft;
    private ImageView eastPedestrain1;
    private ImageView eastPedestrain2;
    private ImageView eastNone2;
    private ImageView eastNone1;
    private ImageView southOther;
    private ImageView southRight;
    private ImageView southStraight;
    private ImageView southLeft;
    private ImageView southPedestrain2;
    private ImageView southPedestrain1;
    private ImageView southNone1;
    private ImageView southNone2;
    private ImageView westOther;
    private ImageView westRight;
    private ImageView westStriaght;
    private ImageView westLeft;
    private ImageView westPedestrain1;
    private ImageView westPedestrain2;
    private ImageView westNone1;
    private ImageView westNone2;
    private Button configSaveToTsc;
    private Button checkData;
    private View mLayout;

    public Fragment04()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        mLayout = inflater.inflate(R.layout.fragment_fragment04, null);
        initUI();
        return mLayout;
    }



    private void initUI()
    {
        tv_northleft = (TextView) mLayout.findViewById(R.id.tv_northleft);
        tv_northstraight = (TextView) mLayout.findViewById(R.id.tv_northstraight);
        tv_northright = (TextView) mLayout.findViewById(R.id.tv_northright);
        tv_northother = (TextView) mLayout.findViewById(R.id.tv_northother);
        tv_northpedestrain1 = (TextView) mLayout.findViewById(R.id.tv_northpedestrain1);
        tv_northpedestrain2 = (TextView) mLayout.findViewById(R.id.tv_northpedestrain2);
        tv_northnone1 = (TextView) mLayout.findViewById(R.id.tv_northnone1);
        tv_northnone2 = (TextView) mLayout.findViewById(R.id.tv_northnone2);
        tv_eastleft = (TextView) mLayout.findViewById(R.id.tv_eastleft);
        tv_eaststraight = (TextView) mLayout.findViewById(R.id.tv_eaststraight);
        tv_eastright = (TextView) mLayout.findViewById(R.id.tv_eastright);
        tv_eastother = (TextView) mLayout.findViewById(R.id.tv_eastother);
        tv_eastpedestrain1 = (TextView) mLayout.findViewById(R.id.tv_eastpedestrain1);
        tv_eastpedestrain2 = (TextView) mLayout.findViewById(R.id.tv_eastpedestrain2);
        tv_eastnone1 = (TextView) mLayout.findViewById(R.id.tv_eastnone1);
        tv_eastnone2 = (TextView) mLayout.findViewById(R.id.tv_eastnone2);
        tv_southleft = (TextView) mLayout.findViewById(R.id.tv_southleft);
        tv_southstraight = (TextView) mLayout.findViewById(R.id.tv_southstraight);
        tv_southright = (TextView) mLayout.findViewById(R.id.tv_southright);
        tv_southother = (TextView) mLayout.findViewById(R.id.tv_southother);
        tv_southpedestrain1 = (TextView) mLayout.findViewById(R.id.tv_southpedestrain1);
        tv_southpedestrain2 = (TextView) mLayout.findViewById(R.id.tv_southpedestrain2);
        tv_southnone1 = (TextView) mLayout.findViewById(R.id.tv_southnone1);
        tv_southnone2 = (TextView) mLayout.findViewById(R.id.tv_southnone2);
        tv_westleft = (TextView) mLayout.findViewById(R.id.tv_westleft);
        tv_weststraight = (TextView) mLayout.findViewById(R.id.tv_weststraight);
        tv_westright = (TextView) mLayout.findViewById(R.id.tv_westright);
        tv_westother = (TextView) mLayout.findViewById(R.id.tv_westother);
        tv_westpedestrain1 = (TextView) mLayout.findViewById(R.id.tv_westpedestrain1);
        tv_westpedestrain2 = (TextView) mLayout.findViewById(R.id.tv_westpedestrain2);
        tv_westnone1 = (TextView) mLayout.findViewById(R.id.tv_westnone1);
        tv_westnone2 = (TextView) mLayout.findViewById(R.id.tv_westnone2);
        tv_phase_config_alarm = (TextView) mLayout.findViewById(R.id.tv_phase_config_alarm);


        northRight = (ImageView) mLayout.findViewById(R.id.northRight);
        northOther = (ImageView) mLayout.findViewById(R.id.northOther);
        northLeft = (ImageView) mLayout.findViewById(R.id.northLeft);
        northStriaght = (ImageView) mLayout.findViewById(R.id.northStriaght);
        northPedestrain1 = (ImageView) mLayout.findViewById(R.id.northPedestrain1);
        northPedestrain2 = (ImageView) mLayout.findViewById(R.id.northPedestrain2);
        northNone1 = (ImageView) mLayout.findViewById(R.id.northNone1);
        northNone2 = (ImageView) mLayout.findViewById(R.id.northNone2);
        eastOther = (ImageView) mLayout.findViewById(R.id.eastOther);
        eastRight = (ImageView) mLayout.findViewById(R.id.eastRight);
        eastStriaght = (ImageView) mLayout.findViewById(R.id.eastStriaght);
        eastLeft = (ImageView) mLayout.findViewById(R.id.eastLeft);
        eastPedestrain1 = (ImageView) mLayout.findViewById(R.id.eastPedestrain1);
        eastPedestrain2 = (ImageView) mLayout.findViewById(R.id.eastPedestrain2);
        eastNone2 = (ImageView) mLayout.findViewById(R.id.eastNone2);
        eastNone1 = (ImageView) mLayout.findViewById(R.id.eastNone1);
        southOther = (ImageView) mLayout.findViewById(R.id.southOther);
        southRight = (ImageView) mLayout.findViewById(R.id.southRight);
        southStraight = (ImageView) mLayout.findViewById(R.id.southStriaght);
        southLeft = (ImageView) mLayout.findViewById(R.id.southLeft);
        southPedestrain2 = (ImageView) mLayout.findViewById(R.id.southPedestrain2);
        southPedestrain1 = (ImageView) mLayout.findViewById(R.id.southPedestrain1);
        southNone1 = (ImageView) mLayout.findViewById(R.id.southNone1);
        southNone2 = (ImageView) mLayout.findViewById(R.id.southNone2);
        westOther = (ImageView) mLayout.findViewById(R.id.westOther);
        westRight = (ImageView) mLayout.findViewById(R.id.westRight);
        westStriaght = (ImageView) mLayout.findViewById(R.id.westStriaght);
        westLeft = (ImageView) mLayout.findViewById(R.id.westLeft);
        westPedestrain1 = (ImageView) mLayout.findViewById(R.id.westPedestrain1);
        westPedestrain2 = (ImageView) mLayout.findViewById(R.id.westPedestrain2);
        westNone1 = (ImageView) mLayout.findViewById(R.id.westNone1);
        westNone2 = (ImageView) mLayout.findViewById(R.id.westNone2);

        configSaveToTsc = (Button) mLayout.findViewById(R.id.configSaveToTsc);
        checkData = (Button) mLayout.findViewById(R.id.checkData);
    }


}
