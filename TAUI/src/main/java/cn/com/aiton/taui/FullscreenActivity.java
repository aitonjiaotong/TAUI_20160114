package cn.com.aiton.taui;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import net.tsz.afinal.FinalActivity;
import net.tsz.afinal.FinalDb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import cn.com.aiton.domain.TscNode;
import cn.com.aiton.utils.AndroidTscDefine;


public class FullscreenActivity extends FinalActivity {
    ArrayList<HashMap<String, String>> arraylistTsc = new ArrayList<HashMap<String, String>>();
    private GridView mGv_tsc;
    private MyAdapter mMyAdapter;

    private void initData() {
        FinalDb db = FinalDb.create(FullscreenActivity.this, AndroidTscDefine.DBNAME);
        List<TscNode> nodes = db.findAll(TscNode.class);
        Iterator<TscNode> tscNodeIterator = nodes.iterator();
        while (tscNodeIterator.hasNext()) {
            HashMap<String, String> map = new HashMap<String, String>();
            TscNode node = tscNodeIterator.next();
            map.put("ipaddress", node.getIpAddress());
            map.put("devicename", node.getDeviceName());
            arraylistTsc.add(map);
        }
    }
    //当AdapterView被单击(触摸屏或者键盘)，则返回的Item单击事件
    class ItemClickListener implements AdapterView.OnItemClickListener {
        public void onItemClick(AdapterView<?> arg0,//The AdapterView where the click happened
                                View arg1,//The view within the AdapterView that was clicked
                                int arg2,//The position of the view in the adapter
                                long arg3//The row id of the item that was clicked
        ) {
            //在本例中arg2=arg3
            HashMap<String, String> item = arraylistTsc.get(arg2);
            //显示所选Item的ItemText
            String ipaddress = item.get("ipaddress");
            FinalDb db = FinalDb.create(FullscreenActivity.this, AndroidTscDefine.DBNAME);
            List<TscNode> tscNodes = db.findAllByWhere(TscNode.class, "ipAddress ='" + ipaddress + "'");
            TscNode node = tscNodes.get(0);
            Context ctx = FullscreenActivity.this;
            SharedPreferences sp = ctx.getSharedPreferences(AndroidTscDefine.TSCNODE, MODE_PRIVATE);
            AndroidTscDefine.tscNodeToSP(node, sp);
            Intent intent = new Intent();
            intent.setClass(FullscreenActivity.this, PhaseActivity01.class);
            Bundle bundle = new Bundle();
            TscNode tn = new TscNode();
            bundle.putSerializable("tn", tn);
            startActivity(intent);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);
        initUI();
        initData();
        initListener();
    }

    private void initListener() {
        mGv_tsc.setOnItemClickListener(new ItemClickListener());
    }

    private void initUI() {
        mGv_tsc = (GridView) findViewById(R.id.gv_tsc);
        mMyAdapter = new MyAdapter();
        mGv_tsc.setAdapter(mMyAdapter);
    }

    class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return arraylistTsc.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View inflate = getLayoutInflater().inflate(R.layout.lv_tsc01, null);
            TextView itemTitle = (TextView) inflate.findViewById(R.id.itemTitle);
            TextView itemIPAddress = (TextView) inflate.findViewById(R.id.itemIPAddress);
            itemTitle.setText(arraylistTsc.get(position).get("devicename"));
            itemIPAddress.setText(arraylistTsc.get(position).get("ipaddress"));
            return inflate;
        }
    }
    /**
     *
     * @param view
     */
    public void broadCastIp(View view){
//        thread = new Thread(runnable);
//        thread.start();
//
//        Thread thread1 = new Thread(runnableSend);
//        thread1.start();
        new Thread(){
            public void run(){
                new AnotherTask().execute("JSON");
            }
        }.start();
    }
    private class AnotherTask extends AsyncTask<String, Void, String> {
        @Override
        protected void onPostExecute(String result) {
            mMyAdapter.notifyDataSetChanged();
            Toast.makeText(FullscreenActivity.this,"更新完成",Toast.LENGTH_SHORT).show();
        }
        @Override
        protected String doInBackground(String... params) {
            //耗时的操作
            HashMap<String,String> map = new HashMap<String, String>();
            arraylistTsc.clear();
            FinalDb db = FinalDb.create(FullscreenActivity.this,AndroidTscDefine.DBNAME);
            List<TscNode> nodes = db.findAll(TscNode.class);
            Iterator<TscNode> tscNodeIterator = nodes.iterator();
            while (tscNodeIterator.hasNext()){

                TscNode node = tscNodeIterator.next();
                map.put("ipaddress", node.getIpAddress());
                map.put("devicename",node.getDeviceName());
                arraylistTsc.add(map);
            }
            return params[0];
        }
    }
    public void loadTsc(View view) {
        Intent intent = new Intent();
        intent.setClass(this, LoadActivity.class);
        startActivity(intent);
    }
}
