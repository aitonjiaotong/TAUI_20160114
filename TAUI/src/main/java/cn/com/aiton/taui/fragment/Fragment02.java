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
    private ViewPager mViewPager;
    private Fragment0201 mFragment0201;
    private Fragment0202 mFragment0202;
    private Fragment0203 mFragment0203;
    private Fragment0204 mFragment0204;
    private Button[] btnTabs = new Button[4];
    private int[] btnTabsID = new int[]{
            R.id.button,
            R.id.button2,
            R.id.button3,
            R.id.button4
    };

    public Fragment02() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mInflate = inflater.inflate(R.layout.fragment_fragment02, null);
        initUI();
        initTabs();
        setListener();
        initFragment();
        return mInflate;
    }

    private void initTabs() {
        selectBtn(0);
    }

    private void selectBtn(int m) {
        btnTabs[m%4].setBackgroundResource(R.color.top_view_color);
        btnTabs[(m+1)%4].setBackgroundResource(R.color.btn02);
        btnTabs[(m+2)%4].setBackgroundResource(R.color.btn02);
        btnTabs[(m+3)%4].setBackgroundResource(R.color.btn02);
    }

    private void initFragment() {
        mFragment0201 = new Fragment0201();
        mFragment0202 = new Fragment0202();
        mFragment0203 = new Fragment0203();
        mFragment0204 = new Fragment0204();
    }


    private void setListener() {
        for (int i = 0; i < btnTabs.length; i++) {
            btnTabs[i].setOnClickListener(this);
        }
    }

    private void initUI() {
        for (int i = 0; i < btnTabs.length; i++) {
            btnTabs[i] = (Button) mInflate.findViewById(btnTabsID[i]);
        }
        mViewPager = (ViewPager) mInflate.findViewById(R.id.viewpager);
        mViewPager.setOffscreenPageLimit(2);
        mViewPager.setAdapter(new MyViewPagerAdapter(getChildFragmentManager()));
        mViewPager.setOnPageChangeListener(new MyPageChangeListener());
    }

    class MyPageChangeListener implements ViewPager.OnPageChangeListener {

        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
            selectBtn(i);
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    }
    class MyViewPagerAdapter extends FragmentPagerAdapter {

        public MyViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return mFragment0201;
            } else if (position == 1) {
                return mFragment0202;
            } else if (position == 2) {
                return mFragment0203;
            } else if (position == 3) {
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
                mViewPager.setCurrentItem(0);
                break;
            case R.id.button2:
                mViewPager.setCurrentItem(1);

                break;
            case R.id.button3:
                mViewPager.setCurrentItem(2);

                break;
            case R.id.button4:
                mViewPager.setCurrentItem(3);

                break;
        }
    }
}
