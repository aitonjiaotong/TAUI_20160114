package cn.com.aiton.taui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import cn.com.aiton.domain.GbtControlModel;
import cn.com.aiton.domain.TimePatterDesc;

/**
 * Created by Administrator on 2015/7/18.
 */
public class SpinnerTimePatternAdapter  extends BaseAdapter {
    private List<TimePatterDesc> timePatterDescs;
    private Context context;
    @Override
    public int getCount() {
        return timePatterDescs.size();
    }

    public SpinnerTimePatternAdapter(List<TimePatterDesc> timePatterDescs, Context context) {
        this.timePatterDescs = timePatterDescs;
        this.context = context;
    }

    @Override
    public Object getItem(int i) {
        return timePatterDescs.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.schedule_spinner_time_pattern_item,null);
        if(view != null){
            TextView tv_value = (TextView)view.findViewById(R.id.tv_timepattern_value);
            TextView tv_name = (TextView)view.findViewById(R.id.tv_timepattern_name);
            tv_value.setText(timePatterDescs.get(i).getValue()+"");
            tv_name.setText(timePatterDescs.get(i).getName());
        }
        return view;
    }
}
