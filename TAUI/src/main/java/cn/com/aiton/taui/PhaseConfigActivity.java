package cn.com.aiton.taui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import net.tsz.afinal.FinalActivity;
import net.tsz.afinal.FinalDb;
import net.tsz.afinal.annotation.view.ViewInject;

import java.util.Iterator;
import java.util.List;

import cn.com.aiton.domain.GbtDirec;
import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;
import cn.com.aiton.services.PhaseToDirecService;
import cn.com.aiton.services.impl.PhaseToDirecServiceImpl;
import cn.com.aiton.utils.AndroidTscDefine;
import cn.com.aiton.utils.ByteUtils;
import cn.com.aiton.utils.GbtDefine;


public class PhaseConfigActivity extends FinalActivity {


    @ViewInject(id=R.id.tv_northleft)
    TextView tv_northleft;
    @ViewInject(id=R.id.tv_northstraight)
    TextView tv_northstraight;
    @ViewInject(id=R.id.tv_northright)
    TextView tv_northright;
    @ViewInject(id=R.id.tv_northother)
    TextView tv_northother;
    @ViewInject(id=R.id.tv_northpedestrain1)
    TextView tv_northpedestrain1;
    @ViewInject(id=R.id.tv_northpedestrain2)
    TextView tv_northpedestrain2;
    @ViewInject(id=R.id.tv_northnone1)
    TextView tv_northnone1;
    @ViewInject(id=R.id.tv_northnone2)
    TextView tv_northnone2;

    @ViewInject(id=R.id.tv_eastleft)
    TextView tv_eastleft;
    @ViewInject(id=R.id.tv_eaststraight)
    TextView tv_eaststraight;
    @ViewInject(id=R.id.tv_eastright)
    TextView tv_eastright;
    @ViewInject(id=R.id.tv_eastother)
    TextView tv_eastother;
    @ViewInject(id=R.id.tv_eastpedestrain1)
    TextView tv_eastpedestrain1;
    @ViewInject(id=R.id.tv_eastpedestrain2)
    TextView tv_eastpedestrain2;
    @ViewInject(id=R.id.tv_eastnone1)
    TextView tv_eastnone1;
    @ViewInject(id=R.id.tv_eastnone2)
    TextView tv_eastnone2;

    @ViewInject(id=R.id.tv_southleft)
    TextView tv_southleft;
    @ViewInject(id=R.id.tv_southstraight)
    TextView tv_southstraight;
    @ViewInject(id=R.id.tv_southright)
    TextView tv_southright;
    @ViewInject(id=R.id.tv_southother)
    TextView tv_southother;
    @ViewInject(id=R.id.tv_southpedestrain1)
    TextView tv_southpedestrain1;
    @ViewInject(id=R.id.tv_southpedestrain2)
    TextView tv_southpedestrain2;
    @ViewInject(id=R.id.tv_southnone1)
    TextView tv_southnone1;
    @ViewInject(id=R.id.tv_southnone2)
    TextView tv_southnone2;

    @ViewInject(id=R.id.tv_westleft)
    TextView tv_westleft;
    @ViewInject(id=R.id.tv_weststraight)
    TextView tv_weststraight;
    @ViewInject(id=R.id.tv_westright)
    TextView tv_westright;
    @ViewInject(id=R.id.tv_westother)
    TextView tv_westother;
    @ViewInject(id=R.id.tv_westpedestrain1)
    TextView tv_westpedestrain1;
    @ViewInject(id=R.id.tv_westpedestrain2)
    TextView tv_westpedestrain2;
    @ViewInject(id=R.id.tv_westnone1)
    TextView tv_westnone1;
    @ViewInject(id=R.id.tv_westnone2)
    TextView tv_westnone2;
    @ViewInject(id=R.id.tv_phase_config_alarm)
    TextView tv_phase_config_alarm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏
        setContentView(R.layout.activity_phase_config);
        tv_phase_config_alarm.setMovementMethod(ScrollingMovementMethod.getInstance());
        FinalDb db = AndroidTscDefine.getFinalDb(PhaseConfigActivity.this);
        SharedPreferences sp = this.getSharedPreferences(AndroidTscDefine.TSCNODE, MODE_PRIVATE);
        TscNode node = AndroidTscDefine.spToTscNode(sp);
        List<GbtDirec> gbtDirecs = db.findAllByWhere(GbtDirec.class,"deviceId = '"+node.getId()+"'");
        Iterator<GbtDirec> gbtDirecIterator = gbtDirecs.iterator();
        while(gbtDirecIterator.hasNext()){
            displayPhaseToDirec(gbtDirecIterator.next());
        }
    }

    /**
     * 根据方向对象，显示如果主相位有数据便是显示主相位，
     * 如果主相位没有数据，跟随相位有数据，显示跟随相位的数据
     * @param gbtDirec
     * @return
     */
    private int phaseOrOverlap(GbtDirec gbtDirec){
        if(gbtDirec.getPhaseId() != 0){
            return gbtDirec.getPhaseId();
        }else{
            if( gbtDirec.getOverlapId() != 0){
                return gbtDirec.getOverlapId();
            }else{
                return 0;
            }
        }
    }

    /**
     * 根据信号机方向对象数据来在界面上显示 方向的相位号。
     * @param gbtDirec
     */
    private void displayPhaseToDirec(GbtDirec gbtDirec){
       switch(gbtDirec.getDirecId()){
           case GbtDefine.I_NORTH_LEFT:
               tv_northleft.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_NORTH_STRAIGHT:
               tv_northstraight.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_NORTH_RIGHT:
               tv_northright.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_NORTH_OTHER:
               tv_northother.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_NORTH_PEDESTRAIN_ONE:
               tv_northpedestrain1.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_NORTH_PEDESTRAIN_TWO:
               tv_northpedestrain2.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_EAST_LEFT:
               tv_eastleft.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_EAST_STRAIGHT:
               tv_eaststraight.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_EAST_RIGHT:
               tv_eastright.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_EAST_OTHER:
               tv_eastother.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_EAST_PEDESTRAIN_ONE:
               tv_eastpedestrain1.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_EAST_PEDESTRAIN_TWO:
               tv_eastpedestrain2.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_SOUTH_LEFT:
               tv_southleft.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_SOUTH_STRAIGHT:
               tv_southstraight.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_SOUTH_RIGHT:
               tv_southright.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_SOUTH_OTHER:
               tv_southother.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_SOUTH_PEDESTRAIN_ONE:
               tv_southpedestrain1.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_SOUTH_PEDESTRAIN_TWO:
               tv_southpedestrain2.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_WEST_LEFT:
               tv_westleft.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_WEST_STRAIGHT:
               tv_weststraight.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_WEST_RIGHT:
               tv_westright.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_WEST_OTHER:
               tv_westother.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_WEST_PEDESTRAIN_ONE:
               tv_westpedestrain1.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_WEST_PEDESTRAIN_TWO:
               tv_westpedestrain2.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_NORTH_NONE1:
               tv_northnone1.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_EAST_NONE1:
               tv_eastnone1.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_SOUTH_NONE1:
               tv_southnone1.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_WEST_NONE1:
               tv_westnone1.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_NORTH_NONE2:
               tv_northnone2.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_EAST_NONE2:
               tv_eastnone2.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_SOUTH_NONE2:
               tv_southnone2.setText(""+phaseOrOverlap(gbtDirec));
               break;
           case GbtDefine.I_WEST_NONE2:
               tv_westnone2.setText(""+phaseOrOverlap(gbtDirec));
               break;

           default:

       }
    }
    public void northRight(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_NORTH_RIGHT);
    }
    public void northOther(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_NORTH_OTHER);
    }
    public void northLeft(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_NORTH_LEFT);
    }
    public void northStriaght(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_NORTH_STRAIGHT);
    }
    public void northPedestrain1(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_NORTH_PEDESTRAIN_ONE);
    }
    public void northPedestrain2(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_NORTH_PEDESTRAIN_TWO);
    }
    public void northNone1(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_NORTH_NONE1);
    }
    public void northNone2(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_NORTH_NONE2);
    }

    public void eastOther(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_EAST_OTHER);
    }
    public void eastRight(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_EAST_RIGHT);
    }
    public void eastStriaght(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_EAST_STRAIGHT);
    }
    public void eastLeft(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_EAST_LEFT);
    }
    public void eastPedestrain1(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_EAST_PEDESTRAIN_ONE);
    }
    public void eastPedestrain2(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_EAST_PEDESTRAIN_TWO);
    }
    public void eastNone2(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_EAST_NONE2);
    }
    public void eastNone1(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_EAST_NONE1);
    }

    public void southOther(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_SOUTH_OTHER);
    }
    public void southRight(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_SOUTH_RIGHT);
    }
    public void southStraight(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_SOUTH_STRAIGHT);
    }
    public void southLeft(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_SOUTH_LEFT);
    }
    public void southPedestrain2(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_SOUTH_PEDESTRAIN_TWO);
    }
    public void southPedestrain1(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_SOUTH_PEDESTRAIN_ONE);
    }
    public void southNone1(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_SOUTH_NONE1);
    }
    public void southNone2(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_SOUTH_NONE2);
    }

    public void westOther(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_WEST_OTHER);
    }
    public void westRight(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_WEST_RIGHT);
    }
    public void westStriaght(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_WEST_STRAIGHT);
    }
    public void westLeft(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_WEST_LEFT);
    }
    public void westPedestrain1(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_WEST_PEDESTRAIN_ONE);
    }
    public void westPedestrain2(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_WEST_PEDESTRAIN_TWO);
    }
    public void westNone1(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_WEST_NONE1);
    }
    public void westNone2(View view){
        showDialog(PhaseConfigActivity.this,GbtDefine.I_WEST_NONE2);
    }

    /**
     *  根据，主相位 或 跟随相位。将方向上的相位ID及方向保存到GBTDirec对象中。
     * @param isPhase   true 主相位    false 跟随相位
     * @param phaseid   相位ID
     * @param direc         方向
     */
    private void updateDirecInDb(boolean isPhase, int phaseid,int direc){
        FinalDb db = AndroidTscDefine.getFinalDb(PhaseConfigActivity.this);
        TscNode node = AndroidTscDefine.spToTscNode(AndroidTscDefine.getSharedPreferences(PhaseConfigActivity.this));
        List<GbtDirec> gbtDirecs = db.findAllByWhere(GbtDirec.class,"direcId = '"+direc+"' and deviceId = '"+node.getId()+"'");
        if(gbtDirecs.size() ==0){
            GbtDirec gbtDirectemp = new GbtDirec();
            gbtDirectemp.setDeviceId(node.getId());
            gbtDirectemp.setDirecId(direc);
            gbtDirectemp.setRoadCount(1);

            if(isPhase){
                gbtDirectemp.setPhaseId(phaseid);
            }else{
                gbtDirectemp.setOverlapId(phaseid);
            }
            db.save(gbtDirectemp);
        }else if (gbtDirecs.size() ==1){
            GbtDirec gbtDirec = gbtDirecs.get(0);
            if (isPhase){
                gbtDirec.setPhaseId(phaseid);
                gbtDirec.setOverlapId(0);
            }else{
                gbtDirec.setPhaseId(0);
                gbtDirec.setOverlapId(phaseid);
            }
            db.update(gbtDirec);
        }else {
            Toast.makeText(this,"在本地数据库中查找到重复的方向数据，请到加载页面删除数据后重新加载！",Toast.LENGTH_LONG).show();
        }


        GbtDirec g12 = db.findAllByWhere(GbtDirec.class,"direcId = '"+direc+"' and deviceId = '"+node.getId()+"'").get(0);
       // Toast.makeText(this,g12.getPhaseId(),Toast.LENGTH_LONG).show();
    }
    public final static int SUCCESS = 1;
    public final static int FAILURE = 0;
    Handler sendHandler = new Handler(){
        @Override
        public void handleMessage(android.os.Message msg) {
            switch (msg.what){
                case SUCCESS:
                    Toast.makeText(PhaseConfigActivity.this,"信号机接收数据成功！",Toast.LENGTH_LONG).show();
                    break;
                case FAILURE:
                    Toast.makeText(PhaseConfigActivity.this,"信号机接收数据失败！",Toast.LENGTH_LONG).show();
                    break;
                default:
            }
            super.handleMessage(msg);
        }
    };

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            PhaseToDirecService ptds = new PhaseToDirecServiceImpl();
            Message message = ptds.setPhaseToDirec(sendGbtDirecs,sendTscNode);
            android.os.Message msg = new android.os.Message();
            if(message.isBoo()){
                msg.what = SUCCESS;
            }else{
                msg.what = FAILURE;
            }
            sendHandler.sendMessage(msg);
        }
    };
    TscNode sendTscNode;
    List<GbtDirec> sendGbtDirecs;

    /**
     * 主要是将更改后的相位，方向数据保存到信号机中。以便信号机在下一个周期立刻生效
     * @param view
     */
    public void configSaveToTsc(View view){
        sendTscNode = AndroidTscDefine.spToTscNode(AndroidTscDefine.getSharedPreferences(this));
        sendGbtDirecs = AndroidTscDefine.getFinalDb(this).findAllByWhere(GbtDirec.class,"deviceId = '"+sendTscNode.getId()+"'");
        Thread t1 = new Thread(runnable);
        t1.start();
    }
    public void checkData(View view){
        TscNode node= AndroidTscDefine.spToTscNode(AndroidTscDefine.getSharedPreferences(this));
        List<GbtDirec> gbtDirecs = AndroidTscDefine.getFinalDb(this).findAllByWhere(GbtDirec.class, "deviceId = '" + node.getId() + "'");
        Iterator<GbtDirec> gbtDirecIterator = gbtDirecs.iterator();
        while (gbtDirecIterator.hasNext()){
            GbtDirec gbtDirec = gbtDirecIterator.next();
            if(gbtDirec.getDirecId() == 0){
                tv_phase_config_alarm.append("方向的ID存在0的严重数据异常，请联系厂家！！！");
        }
            if(gbtDirec.getPhaseId() == 0 && gbtDirec.getOverlapId()==0){
                tv_phase_config_alarm.append("方向上的主相位与跟随相位都没有绑定，请重新配置！");
            }
            if(gbtDirec.getRoadCount() == 0){
                tv_phase_config_alarm.append("方向上的车道数据为0，请联系厂家！");
            }
        }
    }

    /**
     * 将修改的方向上的相位ID变更后，并将数据修改后的ID  保存到数据库中。
     * @param phaseid    相位ID
     * @param direc         方向
     * @param isPhase       true 主相位，false 跟随 相位
     */

    private void setPhaseToTextViewAndDb(int phaseid,int direc,boolean isPhase){
        switch(direc){
            case GbtDefine.I_NORTH_LEFT:
                tv_northleft.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_NORTH_STRAIGHT:
                tv_northstraight.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_NORTH_RIGHT:
                tv_northright.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_NORTH_OTHER:
                tv_northother.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_NORTH_PEDESTRAIN_ONE:
                tv_northpedestrain1.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_NORTH_PEDESTRAIN_TWO:
                tv_northpedestrain2.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_NORTH_NONE1:
                tv_northnone1.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_NORTH_NONE2:
                tv_northnone2.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_EAST_LEFT:
                tv_eastleft.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_EAST_STRAIGHT:
                tv_eaststraight.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_EAST_RIGHT:
                tv_eastright.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_EAST_OTHER:
                tv_eastother.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_EAST_PEDESTRAIN_ONE:
                tv_eastpedestrain1.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_EAST_PEDESTRAIN_TWO:
                tv_eastpedestrain2.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_EAST_NONE1:
                tv_eastnone1.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_EAST_NONE2:
                tv_eastnone2.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_SOUTH_LEFT:
                tv_southleft.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_SOUTH_STRAIGHT:
                tv_southstraight.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_SOUTH_RIGHT:
                tv_southright.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_SOUTH_OTHER:
                tv_southother.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_SOUTH_PEDESTRAIN_ONE:
                tv_southpedestrain1.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_SOUTH_PEDESTRAIN_TWO:
                tv_southpedestrain2.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_SOUTH_NONE1:
                tv_southnone1.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_SOUTH_NONE2:
                tv_southnone2.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_WEST_LEFT:
                tv_westleft.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_WEST_STRAIGHT:
                tv_weststraight.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_WEST_RIGHT:
                tv_westright.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_WEST_OTHER:
                tv_westother.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_WEST_PEDESTRAIN_ONE:
                tv_westpedestrain1.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_WEST_PEDESTRAIN_TWO:
                tv_westpedestrain2.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_WEST_NONE1:
                tv_westnone1.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            case GbtDefine.I_WEST_NONE2:
                tv_westnone2.setText(phaseid+"");
                updateDirecInDb(isPhase,phaseid,direc);
                break;
            default:

        }
    }
    //显示基本的AlertDialog，显示内容有相位ID的选择，主相位与跟随相位的选择
    private void showDialog(Context context, final int direc) {
        LayoutInflater inflater = LayoutInflater.from(this);
        final View textEntryView = inflater.inflate(
                R.layout.phase_dialoglayout, null);
        final NumberPicker edtInput=(NumberPicker)textEntryView.findViewById(R.id.np_phase);
        final RadioButton rb_phase=(RadioButton)textEntryView.findViewById(R.id.rb_phase);
        final RadioButton rb_overlap=(RadioButton)textEntryView.findViewById(R.id.rb_overlap);
        edtInput.setMinValue(1);
        edtInput.setMaxValue(32);
        edtInput.setValue(1);
        edtInput.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(R.drawable.tsc_page_phase);
        builder.setTitle("相位配置");
        builder.setView(textEntryView);
        builder.setPositiveButton("确认",
                new DialogInterface.OnClickListener() {
                    /**
                     * 点击确认按钮后，根据主相位选中，还是跟随相位选中。来更新界面上的相位号及数据库的数据
                     * @param dialog
                     * @param whichButton
                     */
                    public void onClick(DialogInterface dialog, int whichButton) {

                        if(rb_phase.isChecked()){
                            int phaseid = edtInput.getValue();
                            setPhaseToTextViewAndDb(phaseid,direc,true);
                        }else if(rb_overlap.isChecked()){
                            int overlapid = edtInput.getValue();
                            setPhaseToTextViewAndDb(overlapid,direc,false);
                        }else{
                            Toast.makeText(PhaseConfigActivity.this,"请选择相位类型，跟随相位或主相位！",Toast.LENGTH_LONG).show();
                        }
                    }
                });
        builder.setNegativeButton("取消",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        setTitle("");
                    }
                });
        builder.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.phase_config, menu);
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
}
