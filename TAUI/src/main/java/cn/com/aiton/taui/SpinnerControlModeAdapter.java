package cn.com.aiton.taui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import cn.com.aiton.domain.GbtControlModel;

/**
 * Created by Administrator on 2015/6/21.
 */
public class SpinnerControlModeAdapter extends BaseAdapter{
    private List<GbtControlModel> gbtControlModels;
    private Context context;
    public SpinnerControlModeAdapter(){

    }
    public static List<String> getData(){
        List<String> list = new ArrayList<String>();
        for (int i=1;i<=16;i++){

            list.add(i+"");
        }
        return list;
    }

    @Override
    public int getCount() {
        return gbtControlModels.size();
    }

    @Override
    public Object getItem(int i) {
        return gbtControlModels.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.schedule_spinner_control_mode_item,null);
        if(view != null){
            TextView tv_value = (TextView)view.findViewById(R.id.tv_value);
            TextView tv_name = (TextView)view.findViewById(R.id.tv_name);
            tv_value.setText(gbtControlModels.get(i).getValue()+"");
            tv_name.setText(gbtControlModels.get(i).getName());
        }
        return view;
    }

    public SpinnerControlModeAdapter(List<GbtControlModel> gbtControlModels, Context context) {
        this.gbtControlModels = gbtControlModels;
        this.context = context;
    }
}
