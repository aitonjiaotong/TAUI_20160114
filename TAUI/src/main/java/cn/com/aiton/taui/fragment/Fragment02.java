package cn.com.aiton.taui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import cn.com.aiton.taui.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment02 extends Fragment implements View.OnClickListener {


    private View mInflate;
    private Button mButton;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private ViewPager mViewPager;
    private Fragment0201 mFragment0201;
    private Fragment0202 mFragment0202;
    private Fragment0203 mFragment0203;
    private Fragment0204 mFragment0204;

    public Fragment02() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
            mInflate = inflater.inflate(R.layout.fragment_fragment02, null);
            initUI();
            setListener();
        initFragment();
        return mInflate;
    }

    private void initFragment() {
        mFragment0201 = new Fragment0201();
        mFragment0202 = new Fragment0202();
        mFragment0203 = new Fragment0203();
        mFragment0204 = new Fragment0204();
    }


    private void setListener() {
        mButton.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        mButton4.setOnClickListener(this);
    }

    private void initUI() {
        mButton = (Button) mInflate.findViewById(R.id.button);
        mButton2 = (Button) mInflate.findViewById(R.id.button2);
        mButton3 = (Button) mInflate.findViewById(R.id.button3);
        mButton4 = (Button) mInflate.findViewById(R.id.button4);
        mViewPager = (ViewPager) mInflate.findViewById(R.id.viewpager);
        mViewPager.setOffscreenPageLimit(2);
        mViewPager.setAdapter(new MyViewPagerAdapter(getChildFragmentManager()));
    }

    class MyViewPagerAdapter extends FragmentPagerAdapter {

        public MyViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position==0){
                return mFragment0201;
            }else if (position==1){
                return mFragment0202;
            }else if (position==2){
                return mFragment0203;
            }else if (position==3){
                return mFragment0204;
            }
            return null;
        }

        @Override
        public int getCount() {
            return 4;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:

                break;
            case R.id.button2:

                break;
            case R.id.button3:

                break;
            case R.id.button4:

                break;
        }
    }
}
