package cn.com.aiton.taui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import cn.com.aiton.taui.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment06 extends Fragment implements View.OnClickListener {

    private ImageView mNorthOther4;
    private ImageView mNorthOther3;
    private ImageView mNorthOther2;
    private ImageView mNorthOther1;
    private ImageView mNorthRight4;
    private ImageView mNorthRight3;
    private ImageView mNorthRight2;
    private ImageView mNorthRight1;
    private ImageView mNorthStriaght4;
    private ImageView mNorthStriaght3;
    private ImageView mNorthStriaght2;
    private ImageView mNorthStriaght1;
    private ImageView mNorthLeft4;
    private ImageView mNorthLeft3;
    private ImageView mNorthLeft2;
    private ImageView mNorthLeft1;
    private ImageView mWestLeft4;
    private ImageView mWestLeft3;
    private ImageView mWestLeft2;
    private ImageView mWestLeft1;
    private ImageView mWestStriaght4;
    private ImageView mWestStriaght3;
    private ImageView mWestStriaght2;
    private ImageView mWestStriaght1;
    private ImageView mWestRight4;
    private ImageView mWestRight3;
    private ImageView mWestRight2;
    private ImageView mWestRight1;
    private ImageView mWestOther4;
    private ImageView mWestOther3;
    private ImageView mWestOther2;
    private ImageView mWestOther1;
    private ImageView mEastOther1;
    private ImageView mEastOther2;
    private ImageView mEastOther3;
    private ImageView mEastOther4;
    private ImageView mEastRight1;
    private ImageView mEastRight2;
    private ImageView mEastRight3;
    private ImageView mEastRight4;
    private ImageView mEastStriaght1;
    private ImageView mEastStriaght2;
    private ImageView mEastStriaght3;
    private ImageView mEastStriaght4;
    private ImageView mEastLeft1;
    private ImageView mEastLeft2;
    private ImageView mEastLeft3;
    private ImageView mEastLeft4;
    private ImageView mSouthOther1;
    private ImageView mSouthOther2;
    private ImageView mSouthOther3;
    private ImageView mSouthOther4;
    private ImageView mSouthRight1;
    private ImageView mSouthRight2;
    private ImageView mSouthRight3;
    private ImageView mSouthRight4;
    private ImageView mSouthStriaght1;
    private ImageView mSouthStriaght2;
    private ImageView mSouthStriaght3;
    private ImageView mSouthStriaght4;
    private ImageView mSouthLeft1;
    private ImageView mSouthLeft2;
    private ImageView mSouthLeft3;
    private ImageView mSouthLeft4;
    private Button mSaveDetecotr;
    private View mInflate;

    // End Of Content View Elements

    private void bindViews() {

        mNorthOther4 = (ImageView) mInflate.findViewById(R.id.northOther4);
        mNorthOther3 = (ImageView) mInflate.findViewById(R.id.northOther3);
        mNorthOther2 = (ImageView) mInflate.findViewById(R.id.northOther2);
        mNorthOther1 = (ImageView) mInflate.findViewById(R.id.northOther1);
        mNorthRight4 = (ImageView) mInflate.findViewById(R.id.northRight4);
        mNorthRight3 = (ImageView) mInflate.findViewById(R.id.northRight3);
        mNorthRight2 = (ImageView) mInflate.findViewById(R.id.northRight2);
        mNorthRight1 = (ImageView) mInflate.findViewById(R.id.northRight1);
        mNorthStriaght4 = (ImageView) mInflate.findViewById(R.id.northStriaght4);
        mNorthStriaght3 = (ImageView) mInflate.findViewById(R.id.northStriaght3);
        mNorthStriaght2 = (ImageView) mInflate.findViewById(R.id.northStriaght2);
        mNorthStriaght1 = (ImageView) mInflate.findViewById(R.id.northStriaght1);
        mNorthLeft4 = (ImageView) mInflate.findViewById(R.id.northLeft4);
        mNorthLeft3 = (ImageView) mInflate.findViewById(R.id.northLeft3);
        mNorthLeft2 = (ImageView) mInflate.findViewById(R.id.northLeft2);
        mNorthLeft1 = (ImageView) mInflate.findViewById(R.id.northLeft1);
        mWestLeft4 = (ImageView) mInflate.findViewById(R.id.westLeft4);
        mWestLeft3 = (ImageView) mInflate.findViewById(R.id.westLeft3);
        mWestLeft2 = (ImageView) mInflate.findViewById(R.id.westLeft2);
        mWestLeft1 = (ImageView) mInflate.findViewById(R.id.westLeft1);
        mWestStriaght4 = (ImageView) mInflate.findViewById(R.id.westStriaght4);
        mWestStriaght3 = (ImageView) mInflate.findViewById(R.id.westStriaght3);
        mWestStriaght2 = (ImageView) mInflate.findViewById(R.id.westStriaght2);
        mWestStriaght1 = (ImageView) mInflate.findViewById(R.id.westStriaght1);
        mWestRight4 = (ImageView) mInflate.findViewById(R.id.westRight4);
        mWestRight4 = (ImageView) mInflate.findViewById(R.id.westRight4);
        mWestRight2 = (ImageView) mInflate.findViewById(R.id.westRight2);
        mWestRight1 = (ImageView) mInflate.findViewById(R.id.westRight1);
        mWestOther4 = (ImageView) mInflate.findViewById(R.id.westOther4);
        mWestOther3 = (ImageView) mInflate.findViewById(R.id.westOther3);
        mWestOther2 = (ImageView) mInflate.findViewById(R.id.westOther2);
        mWestOther1 = (ImageView) mInflate.findViewById(R.id.westOther1);
        mEastOther1 = (ImageView) mInflate.findViewById(R.id.eastOther1);
        mEastOther2 = (ImageView) mInflate.findViewById(R.id.eastOther2);
        mEastOther3 = (ImageView) mInflate.findViewById(R.id.eastOther3);
        mEastOther4 = (ImageView) mInflate.findViewById(R.id.eastOther4);
        mEastRight1 = (ImageView) mInflate.findViewById(R.id.eastRight1);
        mEastRight2 = (ImageView) mInflate.findViewById(R.id.eastRight2);
        mEastRight3 = (ImageView) mInflate.findViewById(R.id.eastRight3);
        mEastRight4 = (ImageView) mInflate.findViewById(R.id.eastRight4);
        mEastStriaght1 = (ImageView) mInflate.findViewById(R.id.eastStriaght1);
        mEastStriaght2 = (ImageView) mInflate.findViewById(R.id.eastStriaght2);
        mEastStriaght3 = (ImageView) mInflate.findViewById(R.id.eastStriaght3);
        mEastStriaght4 = (ImageView) mInflate.findViewById(R.id.eastStriaght4);
        mEastLeft1 = (ImageView) mInflate.findViewById(R.id.eastLeft1);
        mEastLeft2 = (ImageView) mInflate.findViewById(R.id.eastLeft2);
        mEastLeft3 = (ImageView) mInflate.findViewById(R.id.eastLeft3);
        mEastLeft4 = (ImageView) mInflate.findViewById(R.id.eastLeft4);
        mSouthOther1 = (ImageView) mInflate.findViewById(R.id.southOther1);
        mSouthOther2 = (ImageView) mInflate.findViewById(R.id.southOther2);
        mSouthOther3 = (ImageView) mInflate.findViewById(R.id.southOther3);
        mSouthOther4 = (ImageView) mInflate.findViewById(R.id.southOther4);
        mSouthRight1 = (ImageView) mInflate.findViewById(R.id.southRight1);
        mSouthRight2 = (ImageView) mInflate.findViewById(R.id.southRight2);
        mSouthRight3 = (ImageView) mInflate.findViewById(R.id.southRight3);
        mSouthRight4 = (ImageView) mInflate.findViewById(R.id.southRight4);
        mSouthStriaght1 = (ImageView) mInflate.findViewById(R.id.southStriaght1);
        mSouthStriaght2 = (ImageView) mInflate.findViewById(R.id.southStriaght2);
        mSouthStriaght3 = (ImageView) mInflate.findViewById(R.id.southStriaght3);
        mSouthStriaght4 = (ImageView) mInflate.findViewById(R.id.southStriaght4);
        mSouthLeft1 = (ImageView) mInflate.findViewById(R.id.southLeft1);
        mSouthLeft2 = (ImageView) mInflate.findViewById(R.id.southLeft2);
        mSouthLeft3 = (ImageView) mInflate.findViewById(R.id.southLeft3);
        mSouthLeft4 = (ImageView) mInflate.findViewById(R.id.southLeft4);
        mSaveDetecotr = (Button) mInflate.findViewById(R.id.saveDetecotr);
    }

    public Fragment06() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for getActivity() fragment
        mInflate = inflater.inflate(R.layout.fragment_fragment06, null);
        bindViews();
        setListener();
        return mInflate;
    }

    private void setListener() {
        mNorthOther4.setOnClickListener(this);
        mNorthOther3.setOnClickListener(this);
        mNorthOther2.setOnClickListener(this);
        mNorthOther1.setOnClickListener(this);
        mNorthRight4.setOnClickListener(this);
        mNorthRight3.setOnClickListener(this);
        mNorthRight2.setOnClickListener(this);
        mNorthRight1.setOnClickListener(this);
        mNorthStriaght4.setOnClickListener(this);
        mNorthStriaght3.setOnClickListener(this);
        mNorthStriaght2.setOnClickListener(this);
        mNorthStriaght1.setOnClickListener(this);
        mNorthLeft4.setOnClickListener(this);
        mNorthLeft3.setOnClickListener(this);
        mNorthLeft2.setOnClickListener(this);
        mNorthLeft1.setOnClickListener(this);
        mWestLeft4.setOnClickListener(this);
        mWestLeft3.setOnClickListener(this);
        mWestLeft2.setOnClickListener(this);
        mWestLeft1.setOnClickListener(this);
        mWestStriaght4.setOnClickListener(this);
        mWestStriaght3.setOnClickListener(this);
        mWestStriaght2.setOnClickListener(this);
        mWestStriaght1.setOnClickListener(this);
        mWestRight4.setOnClickListener(this);
        mWestRight4.setOnClickListener(this);
        mWestRight2.setOnClickListener(this);
        mWestRight1.setOnClickListener(this);
        mWestOther4.setOnClickListener(this);
        mWestOther3.setOnClickListener(this);
        mWestOther2.setOnClickListener(this);
        mWestOther1.setOnClickListener(this);
        mEastOther1.setOnClickListener(this);
        mEastOther2.setOnClickListener(this);
        mEastOther3.setOnClickListener(this);
        mEastOther4.setOnClickListener(this);
        mEastRight1.setOnClickListener(this);
        mEastRight2.setOnClickListener(this);
        mEastRight3.setOnClickListener(this);
        mEastRight4.setOnClickListener(this);
        mEastStriaght1.setOnClickListener(this);
        mEastStriaght2.setOnClickListener(this);
        mEastStriaght3.setOnClickListener(this);
        mEastStriaght4.setOnClickListener(this);
        mEastLeft1.setOnClickListener(this);
        mEastLeft2.setOnClickListener(this);
        mEastLeft3.setOnClickListener(this);
        mEastLeft4.setOnClickListener(this);
        mSouthOther1.setOnClickListener(this);
        mSouthOther2.setOnClickListener(this);
        mSouthOther3.setOnClickListener(this);
        mSouthOther4.setOnClickListener(this);
        mSouthRight1.setOnClickListener(this);
        mSouthRight2.setOnClickListener(this);
        mSouthRight3.setOnClickListener(this);
        mSouthRight4.setOnClickListener(this);
        mSouthStriaght1.setOnClickListener(this);
        mSouthStriaght2.setOnClickListener(this);
        mSouthStriaght3.setOnClickListener(this);
        mSouthStriaght4.setOnClickListener(this);
        mSouthLeft1.setOnClickListener(this);
        mSouthLeft2.setOnClickListener(this);
        mSouthLeft3.setOnClickListener(this);
        mSouthLeft4.setOnClickListener(this);
        mSaveDetecotr.setOnClickListener(this);
    }

    //北方向
    public void northOther4() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void northOther3() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void northOther2() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void northOther1() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void northRight4() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void northRight3() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void northRight2() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void northRight1() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void northStriaght4() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void northStriaght3() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void northStriaght2() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void northStriaght1() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void northLeft4() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void northLeft3() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void northLeft2() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void northLeft1() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    //南方向
    public void southOther4() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void southOther3() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void southOther2() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void southOther1() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void southRight4() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void southRight3() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void southRight2() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void southRight1() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void southStriaght4() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void southStriaght3() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void southStriaght2() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void southStriaght1() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void southLeft4() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void southLeft3() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void southLeft2() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void southLeft1() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    //东方向
    public void eastOther4() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void eastOther3() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void eastOther2() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void eastOther1() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void eastRight4() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void eastRight3() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void eastRight2() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void eastRight1() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void eastStriaght4() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void eastStriaght3() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void eastStriaght2() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void eastStriaght1() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void eastLeft4() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void eastLeft3() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void eastLeft2() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void eastLeft1() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    //东方向
    public void westOther4() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void westOther3() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void westOther2() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void westOther1() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void westRight4() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void westRight3() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void westRight2() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void westRight1() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void westStriaght4() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void westStriaght3() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void westStriaght2() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void westStriaght1() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void westLeft4() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void westLeft3() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void westLeft2() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void westLeft1() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    public void saveDetecotr() {
        Toast.makeText(getActivity(), "功能未开放，请联系厂家！", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.northOther4:
                northOther4();
                break;
            case R.id.northOther3:
                northOther3();
                break;
            case R.id.northOther2:
                northOther2();
                break;
            case R.id.northOther1:
                northOther1();
                break;
            case R.id.northRight4:
                northRight4();
                break;
            case R.id.northRight3:
                northRight3();
                break;
            case R.id.northRight2:
                northRight2();
                break;
            case R.id.northRight1:
                northRight1();
                break;
            case R.id.northStriaght4:
                northStriaght4();
                break;
            case R.id.northStriaght3:
                northStriaght3();
                break;
            case R.id.northStriaght2:
                northStriaght2();
                break;
            case R.id.northStriaght1:
                northStriaght1();
                break;
            case R.id.northLeft4:
                northLeft4();
                break;
            case R.id.northLeft3:
                northLeft3();
                break;
            case R.id.northLeft2:
                northLeft2();
                break;
            case R.id.northLeft1:
                northLeft1();
                break;
            case R.id.westLeft4:
                westLeft4();
                break;
            case R.id.westLeft3:
                westLeft3();
                break;
            case R.id.westLeft2:
                westLeft2();
                break;
            case R.id.westLeft1:
                westLeft1();
                break;
            case R.id.westStriaght4:
                westStriaght4();
                break;
            case R.id.westStriaght3:
                westStriaght3();
                break;
            case R.id.westStriaght2:
                westStriaght2();
                break;
            case R.id.westStriaght1:
                westStriaght1();
                break;
            case R.id.westRight4:
                westRight4();
                break;
            case R.id.westRight3:
                westRight3();
                break;
            case R.id.westRight2:
                westRight2();
                break;
            case R.id.westRight1:
                westRight1();
                break;
            case R.id.westOther4:
                westOther4();
                break;
            case R.id.westOther3:
                westOther3();
                break;
            case R.id.westOther2:
                westOther2();
                break;
            case R.id.westOther1:
                westOther1();
                break;
            case R.id.eastOther1:
                eastOther1();
                break;
            case R.id.eastOther2:
                eastOther2();
                break;
            case R.id.eastOther3:
                eastOther3();
                break;
            case R.id.eastOther4:
                eastOther4();
                break;
            case R.id.eastRight1:
                eastRight1();
                break;
            case R.id.eastRight2:
                eastRight2();
                break;
            case R.id.eastRight3:
                eastRight3();
                break;
            case R.id.eastRight4:
                eastRight4();
                break;
            case R.id.eastStriaght1:
                eastStriaght1();
                break;
            case R.id.eastStriaght2:
                eastStriaght2();
                break;
            case R.id.eastStriaght3:
                eastStriaght3();
                break;
            case R.id.eastStriaght4:
                eastStriaght4();
                break;
            case R.id.eastLeft1:
                eastLeft1();
                break;
            case R.id.eastLeft2:
                eastLeft2();
                break;
            case R.id.eastLeft3:
                eastLeft3();
                break;
            case R.id.eastLeft4:
                eastLeft4();
                break;
            case R.id.southOther1:
                southOther1();
                break;
            case R.id.southOther2:
                southOther2();
                break;
            case R.id.southOther3:
                southOther3();
                break;
            case R.id.southOther4:
                southOther4();
                break;
            case R.id.southRight1:
                southRight1();
                break;
            case R.id.southRight2:
                southRight2();
                break;
            case R.id.southRight3:
                southRight3();
                break;
            case R.id.southRight4:
                southRight4();
                break;
            case R.id.southStriaght1:
                southStriaght1();
                break;
            case R.id.southStriaght2:
                southStriaght2();
                break;
            case R.id.southStriaght3:
                southStriaght3();
                break;
            case R.id.southStriaght4:
                southStriaght4();
                break;
            case R.id.southLeft1:
                southLeft1();
                break;
            case R.id.southLeft2:
                southLeft2();
                break;
            case R.id.southLeft3:
                southLeft3();
                break;
            case R.id.southLeft4:
                southLeft4();
                break;
            case R.id.saveDetecotr:
                saveDetecotr();
                break;
        }
    }
}
