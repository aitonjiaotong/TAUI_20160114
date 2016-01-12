package cn.com.aiton.taui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.com.aiton.taui.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment0204 extends Fragment {


    private View mInflate;

    public Fragment0204() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        if (mInflate == null) {
            mInflate = inflater.inflate(R.layout.fragment_fragment0204, null);

//        }
        return mInflate;
    }


}
