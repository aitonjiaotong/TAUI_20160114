package cn.com.aiton.taui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Toast;


public class DetectorActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏
        setContentView(R.layout.activity_detector);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.detector, menu);
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
//北方向
    public void northOther4(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void northOther3(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void northOther2(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void northOther1(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void northRight4(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void northRight3(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void northRight2(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void northRight1(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void northStriaght4(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void northStriaght3(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void northStriaght2(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void northStriaght1(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void northLeft4(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void northLeft3(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void northLeft2(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void northLeft1(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }

    //南方向
    public void southOther4(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void southOther3(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void southOther2(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void southOther1(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void southRight4(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void southRight3(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void southRight2(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void southRight1(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void southStriaght4(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void southStriaght3(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void southStriaght2(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void southStriaght1(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void southLeft4(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void southLeft3(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void southLeft2(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void southLeft1(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }

     //东方向
    public void eastOther4(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void eastOther3(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void eastOther2(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void eastOther1(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void eastRight4(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void eastRight3(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void eastRight2(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void eastRight1(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void eastStriaght4(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void eastStriaght3(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void eastStriaght2(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void eastStriaght1(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void eastLeft4(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void eastLeft3(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void eastLeft2(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void eastLeft1(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    //东方向
    public void westOther4(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void westOther3(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void westOther2(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void westOther1(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void westRight4(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void westRight3(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void westRight2(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void westRight1(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void westStriaght4(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void westStriaght3(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void westStriaght2(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void westStriaght1(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void westLeft4(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void westLeft3(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void westLeft2(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
    public void westLeft1(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }

    public void saveDetecotr(View view){
        Toast.makeText(this,"功能未开放，请联系厂家！",Toast.LENGTH_LONG).show();
    }
}
