package cn.com.aiton.taui;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import net.tsz.afinal.FinalActivity;
import net.tsz.afinal.FinalDb;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import cn.com.aiton.domain.ExtReportState;
import cn.com.aiton.domain.GbtChannel;
import cn.com.aiton.domain.GbtDirec;
import cn.com.aiton.domain.TscNode;
import cn.com.aiton.services.MunualControlService;
import cn.com.aiton.services.impl.MunualControlServiceImpl;
import cn.com.aiton.utils.AndroidTscDefine;
import cn.com.aiton.utils.ExtReportUtils;
import cn.com.aiton.utils.GbtDefine;
import cn.com.aiton.utils.TscDbUtils;
import cn.com.aiton.utils.UdpClientSocket;


public class ManaulActivity extends FinalActivity {
    public final static int SUCCESS = 1;
    public final static int FAILURE = 0;

    private MunualControlService mcs = null;
    TscNode node;

    List<GbtChannel> gbtChannelList;
    List<GbtDirec> gbtDirecList;
    ImageView northLeft ;
    ImageView northStriaght;
    ImageView northRight;
    ImageView northOther;
    ImageView northNone1;
    ImageView northNone2;
    ImageView northPedestrain1;
    ImageView northPedestrain2;

    ImageView eastLeft;
    ImageView eastStriaght;
    ImageView eastRight;
    ImageView eastOther;
    ImageView eastNone1;
    ImageView eastNone2;
    ImageView eastPedestrain1;
    ImageView eastPedestrain2;

    ImageView southLeft;
    ImageView southStriaght;
    ImageView southRight ;
    ImageView southOther;
    ImageView southNone1;
    ImageView southNone2;
    ImageView southPedestrain1;
    ImageView southPedestrain2;

    ImageView westLeft ;
    ImageView westStriaght;
    ImageView westRight;
    ImageView westOther;
    ImageView westNone1;
    ImageView westNone2;
    ImageView westPedestrain1;
    ImageView westPedestrain2;
    private Thread thread;

    public void updateRed(GbtDirec gbtDirec){
        switch (gbtDirec.getDirecId()){
            case GbtDefine.I_NORTH_LEFT:
                northLeft.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_NORTH_STRAIGHT:
                northStriaght.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_NORTH_RIGHT:
                northRight.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_NORTH_OTHER:
                northOther.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_NORTH_NONE1:
                northNone1.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_NORTH_NONE2:
                northNone2.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_NORTH_PEDESTRAIN_ONE:
                northPedestrain1.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_NORTH_PEDESTRAIN_TWO:
                northPedestrain2.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_EAST_LEFT:
                eastLeft.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_EAST_STRAIGHT:
                eastStriaght.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_EAST_RIGHT:
                eastRight.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_EAST_OTHER:
                eastOther.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_EAST_PEDESTRAIN_ONE:
                eastPedestrain1.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_EAST_PEDESTRAIN_TWO:
                eastPedestrain2.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_EAST_NONE1:
                eastNone1.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_EAST_NONE2:
                eastNone2.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_SOUTH_LEFT:
                southLeft.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_SOUTH_STRAIGHT:
                southStriaght.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_SOUTH_RIGHT:
                southRight.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_SOUTH_OTHER:
                southOther.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_SOUTH_PEDESTRAIN_ONE:
                southPedestrain1.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_SOUTH_PEDESTRAIN_TWO:
                southPedestrain2.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_SOUTH_NONE1:
                southNone1.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_SOUTH_NONE2:
                southNone2.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_WEST_LEFT:
                westLeft.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_WEST_STRAIGHT:
                westStriaght.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_WEST_RIGHT:
                westRight.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_WEST_OTHER:
                westOther.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_WEST_PEDESTRAIN_ONE:
                westPedestrain1.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_WEST_PEDESTRAIN_TWO:
                westPedestrain2.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_WEST_NONE1:
                westNone1.setImageResource(R.drawable.redone);
                break;
            case GbtDefine.I_WEST_NONE2:
                westNone2.setImageResource(R.drawable.redone);
                break;
            default:
                break;
        }

    }

    public void updateGreen(GbtDirec gbtDirec){
        switch (gbtDirec.getDirecId()){
            case GbtDefine.I_NORTH_LEFT:
                northLeft.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_NORTH_STRAIGHT:
                northStriaght.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_NORTH_RIGHT:
                northRight.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_NORTH_OTHER:
                northOther.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_NORTH_NONE1:
                northNone1.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_NORTH_NONE2:
                northNone2.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_NORTH_PEDESTRAIN_ONE:
                northPedestrain1.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_NORTH_PEDESTRAIN_TWO:
                northPedestrain2.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_EAST_LEFT:
                eastLeft.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_EAST_STRAIGHT:
                eastStriaght.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_EAST_RIGHT:
                eastRight.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_EAST_OTHER:
                eastOther.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_EAST_PEDESTRAIN_ONE:
                eastPedestrain1.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_EAST_PEDESTRAIN_TWO:
                eastPedestrain2.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_EAST_NONE1:
                eastNone1.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_EAST_NONE2:
                eastNone2.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_SOUTH_LEFT:
                southLeft.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_SOUTH_STRAIGHT:
                southStriaght.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_SOUTH_RIGHT:
                southRight.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_SOUTH_OTHER:
                southOther.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_SOUTH_PEDESTRAIN_ONE:
                southPedestrain1.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_SOUTH_PEDESTRAIN_TWO:
                southPedestrain2.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_SOUTH_NONE1:
                southNone1.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_SOUTH_NONE2:
                southNone2.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_WEST_LEFT:
                westLeft.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_WEST_STRAIGHT:
                westStriaght.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_WEST_RIGHT:
                westRight.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_WEST_OTHER:
                westOther.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_WEST_PEDESTRAIN_ONE:
                westPedestrain1.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_WEST_PEDESTRAIN_TWO:
                westPedestrain2.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_WEST_NONE1:
                westNone1.setImageResource(R.drawable.greenone);
                break;
            case GbtDefine.I_WEST_NONE2:
                westNone2.setImageResource(R.drawable.greenone);
                break;
            default:
                break;
        }

    }

    public void updateYellow(GbtDirec gbtDirec){
        switch (gbtDirec.getDirecId()){
            case GbtDefine.I_NORTH_LEFT:
                northLeft.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_NORTH_STRAIGHT:
                northStriaght.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_NORTH_RIGHT:
                northRight.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_NORTH_OTHER:
                northOther.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_NORTH_NONE1:
                northNone1.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_NORTH_NONE2:
                northNone2.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_NORTH_PEDESTRAIN_ONE:
                northPedestrain1.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_NORTH_PEDESTRAIN_TWO:
                northPedestrain2.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_EAST_LEFT:
                eastLeft.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_EAST_STRAIGHT:
                eastStriaght.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_EAST_RIGHT:
                eastRight.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_EAST_OTHER:
                eastOther.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_EAST_PEDESTRAIN_ONE:
                eastPedestrain1.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_EAST_PEDESTRAIN_TWO:
                eastPedestrain2.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_EAST_NONE1:
                eastNone1.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_EAST_NONE2:
                eastNone2.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_SOUTH_LEFT:
                southLeft.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_SOUTH_STRAIGHT:
                southStriaght.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_SOUTH_RIGHT:
                southRight.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_SOUTH_OTHER:
                southOther.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_SOUTH_PEDESTRAIN_ONE:
                southPedestrain1.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_SOUTH_PEDESTRAIN_TWO:
                southPedestrain2.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_SOUTH_NONE1:
                southNone1.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_SOUTH_NONE2:
                southNone2.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_WEST_LEFT:
                westLeft.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_WEST_STRAIGHT:
                westStriaght.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_WEST_RIGHT:
                westRight.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_WEST_OTHER:
                westOther.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_WEST_PEDESTRAIN_ONE:
                westPedestrain1.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_WEST_PEDESTRAIN_TWO:
                westPedestrain2.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_WEST_NONE1:
                westNone1.setImageResource(R.drawable.yellowone);
                break;
            case GbtDefine.I_WEST_NONE2:
                westNone2.setImageResource(R.drawable.yellowone);
                break;
            default:
                break;
        }
    }
    private Handler mhandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case SUCCESS:
                    Bundle bundle = msg.getData();
                    ExtReportState ers = (ExtReportState)bundle.getSerializable("ers");
                    TextView tv = (TextView)findViewById(R.id.tv_countdown);
                    String countdown = String.valueOf(ers.getStageTotalTime() - ers.getStageRunTime());
                    tv.setText(countdown);
                    List<Integer> listChannelGreen = ers.getListChannelGreenStatus();
                 //   Collections.reverse(listChannelGreen);
                    List<Integer> listChannelRed = ers.getListChannelRedStatus();
                 //   Collections.reverse(listChannelRed);
                    List<Integer> listChannelYellow = ers.getListChannelYellowStatus();
                  //  Collections.reverse(listChannelYellow);
                    //System.out.println(listChannelRed);
                   // System.out.println(listChannelYellow);

                  //  System.out.println(listChannelGreen);
                    for(int i=0;i<listChannelGreen.size();i++){
                        for(int j=0;j<gbtChannelList.size();j++){
                            GbtChannel gbtchannel = gbtChannelList.get(j);
                            if((i+1)==gbtchannel.getChannelId()) {
                                for (int k = 0; k < gbtDirecList.size(); k++) {
                                    GbtDirec direc = gbtDirecList.get(k);
                                    if(direc.getPhaseId()!=0 ){
                                        if(direc.getPhaseId() == gbtchannel.getControlSource() && gbtchannel.getControlType() != 0x04){
                                            if(listChannelRed.get(i) == 1){
                                                updateLampColor(direc, GbtDefine.LAMP_RED);
                                                break;
                                            }else if (listChannelYellow.get(i) == 1){
                                                updateLampColor(direc, GbtDefine.LAMP_YELLOW);
                                                break;
                                            }else if (listChannelGreen.get(i) == 1){
                                                updateLampColor(direc, GbtDefine.LAMP_GREEN);
                                                break;
                                            }
                                        }
                                    }else{
                                        if(direc.getOverlapId() !=0){
                                            if(direc.getOverlapId()== gbtchannel.getControlSource() && gbtchannel.getControlType() == 0x04){
                                                if(listChannelRed.get(i) == 1){
                                                    updateLampColor(direc, GbtDefine.LAMP_RED);
                                                    break;
                                                }else if (listChannelYellow.get(i) == 1){
                                                    updateLampColor(direc, GbtDefine.LAMP_YELLOW);
                                                    break;
                                                }else if (listChannelGreen.get(i) == 1){
                                                    updateLampColor(direc, GbtDefine.LAMP_GREEN);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
/*
                    for(int i=0;i<listChannelGreen.size();i++){
                        for(int j=0;j<gbtChannelList.size();j++){
                            GbtChannel gbtchannel = gbtChannelList.get(j);
                            if((i+1)==gbtchannel.getChannelId()){
                                for(int k=0;k<gbtDirecList.size();k++){
                                    GbtDirec direc = gbtDirecList.get(k);
                                    if(direc.getPhaseId()!=0 ){
                                        if(direc.getPhaseId() ==gbtchannel.getControlSource() ){
                                            if (listChannelGreen.get(i)==1){
                                                upateGreen(direc);

                                            }
                                        }
                                    }else{
                                        if (direc.getOverlapId() != 0){
                                            if(direc.getOverlapId() == gbtchannel.getControlSource()){
                                                if (listChannelGreen.get(i)==1){
                                                    upateGreen(direc);

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }

                for(int a=0;a<listChannelRed.size();a++){
                   for(int b=0;b<gbtChannelList.size();b++){
                        GbtChannel gbtchannel = gbtChannelList.get(b);
                        if((a+1)==gbtchannel.getChannelId()){
                            for(int c=0;c<gbtDirecList.size();c++){
                                GbtDirec direc = gbtDirecList.get(c);
                                if(direc.getPhaseId()!=0 ){
                                    if(direc.getPhaseId() ==gbtchannel.getControlSource() ){
                                        if (listChannelRed.get(a)==1){
                                            updateRed(direc);

                                        }
                                    }
                                }else{
                                    if (direc.getOverlapId() != 0){
                                        if(direc.getOverlapId() == gbtchannel.getControlSource()){
                                            if (listChannelRed.get(a)==1){
                                                updateRed(direc);

                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                }
*/
                    /*
                for(int x=0;x<listChannelYellow.size();x++) {
                    for(int y=0;y<gbtChannelList.size();y++){
                        GbtChannel gbtchannel =gbtChannelList.get(y);
                        if((x+1)==gbtchannel.getChannelId()){
                            for(int z=0;z<gbtDirecList.size();z++){
                                GbtDirec direc =gbtDirecList.get(z);
                                if(direc.getPhaseId()!=0 ){
                                    if(direc.getPhaseId() ==gbtchannel.getControlSource() ){
                                        if (listChannelYellow.get(x)==1){
                                            updateYellow(direc);

                                        }
                                    }
                                }else{
                                    if (direc.getOverlapId() != 0){
                                        if(direc.getOverlapId() == gbtchannel.getControlSource()){
                                            if (listChannelYellow.get(x)==1){
                                                updateYellow(direc);

                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                }

*/
                    break;
                case FAILURE:

                    break;
                default:
                    break;
            }
            super.handleMessage(msg);
        }
    };

    private void updateLampColor(GbtDirec direc, byte lampRed) {
        if(direc == null){
            return;
        }
        //byte direcbyte = (byte)direc.getDirecId();
        if(lampRed == GbtDefine.LAMP_RED){
            updateRed(direc);
        }else if(lampRed == GbtDefine.LAMP_YELLOW){
            updateYellow(direc);
        }else if(lampRed == GbtDefine.LAMP_GREEN){
            updateGreen(direc);
        }else {
            return;
        }
    }

    Runnable runnable = new Runnable() {
        private Random random = new Random();
        private String uuid = UUID.randomUUID().toString();
        DatagramPacket packet;
        private DatagramSocket datagramSocket = null; // 连接对象
        byte[] buffer=new byte[1024];
        DatagramSocket udpClientSocket;
        DatagramPacket udpSendPacket;
        DatagramPacket udpReceivePacket;
        InetAddress hostAddress;
        UdpClientSocket ucs ;
        @Override
        public void run() {
            // TODO Auto-generated method stub
            ArrayList list = new ArrayList();
            try {
                //init();
                FinalDb db = FinalDb.create(ManaulActivity.this,AndroidTscDefine.DBNAME);
                gbtChannelList = TscDbUtils.getGbtChannelsByNode(db,node);
                gbtDirecList = TscDbUtils.getGbtDirecsByNode(db,node);

                ucs = new UdpClientSocket();
                ucs.send(node.getIpAddress(),node.getPort(),GbtDefine.REPORT_TSC_STATUS);

                System.out.println("客户端发送连接请求");
            } catch (Exception exce) {
                exce.printStackTrace();
            }
            while (true) {
                try {
                    Message msg = new Message();
                    msg.what = SUCCESS;

                    byte[] bytes = ucs.receiveByte(node.getIpAddress(),node.getPort());
                   // System.out.println("bytes : "+Integer.toHexString(bytes[0])+" "+Integer.toHexString(bytes[1])+" "+Integer.toHexString(bytes[2])+" "+Integer.toHexString(bytes[3])+" "+Integer.toHexString(bytes[4])+" "+Integer.toHexString(bytes[5])+" "+Integer.toHexString(bytes[6])+" "+Integer.toHexString(bytes[7])+" "+Integer.toHexString(bytes[8])+" "+Integer.toHexString(bytes[9])+" "+Integer.toHexString(bytes[10])+" "+Integer.toHexString(bytes[11])+" "+Integer.toHexString(bytes[12])+" "+Integer.toHexString(bytes[13])+" "+Integer.toHexString(bytes[14])+" "+Integer.toHexString(bytes[15])+" "+Integer.toHexString(bytes[16])+" "+Integer.toHexString(bytes[17])+" "+Integer.toHexString(bytes[18])+" "+Integer.toHexString(bytes[19])+" "+Integer.toHexString(bytes[20])+" "+Integer.toHexString(bytes[21])+" "+Integer.toHexString(bytes[22])+" "+Integer.toHexString(bytes[23])+" "+ Integer.toHexString(bytes[24])+" "+ Integer.toHexString(bytes[25])+" "+ Integer.toHexString(bytes[26])+" "+ Integer.toHexString(bytes[27])+" "+ Integer.toHexString(bytes[28]));
                    Bundle bundle = new Bundle();
                    ExtReportState ers = ExtReportUtils.byte2ReportState(bytes);

                    bundle.putSerializable("ers", ers);
                    msg.setData(bundle);
                    //发送消息到Handler
                    mhandler.sendMessage(msg);
                    //Thread.sleep(1000);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                   // Toast.makeText(ManaulActivity.this,"信号机成功回复当前方案信息！",Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        }

        /**
         * 接收数据包，该方法会造成线程阻塞
         * @return
         * @throws java.io.IOException
         */
        public void receive(DatagramPacket packet) throws Exception {
            try {
                datagramSocket.receive(packet);
            } catch (Exception e) {
                throw e;
            }
        }

        /**
         * 发送数据包到指定地点
         * @param packet
         * @throws java.io.IOException
         */
        public void sendDate(DatagramPacket packet) {
            try {
                datagramSocket.send(packet);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /**
         * 初始化客户端连接
         * @throws SocketException
         */
        public void init() throws SocketException {
            try {
                datagramSocket = new DatagramSocket(random.nextInt(9999));
                datagramSocket.setSoTimeout(10 * 1000);
                System.out.println("客户端启动成功");
            } catch (Exception e) {
                datagramSocket = null;
                System.out.println("客户端启动失败");
                e.printStackTrace();
            }
        }


    };
    public void initViews(){
        northLeft = (ImageView)findViewById(R.id.m_northLeft);
        northStriaght = (ImageView)findViewById(R.id.m_northStriaght);
        northRight = (ImageView)findViewById(R.id.m_northRight);
        northOther = (ImageView)findViewById(R.id.m_northOther);
        northNone1 = (ImageView)findViewById(R.id.m_northNone1);
        northNone2 = (ImageView)findViewById(R.id.m_northNone2);
        northPedestrain1 = (ImageView)findViewById(R.id.m_northPedestrain1);
        northPedestrain2 = (ImageView)findViewById(R.id.m_northPedestrain2);
        eastLeft = (ImageView)findViewById(R.id.m_eastLeft);
        eastStriaght = (ImageView)findViewById(R.id.m_eastStriaght);
        eastRight = (ImageView)findViewById(R.id.m_eastRight);
        eastOther = (ImageView)findViewById(R.id.m_eastOther);
        eastNone1 = (ImageView)findViewById(R.id.m_eastNone1);
        eastNone2 = (ImageView)findViewById(R.id.m_eastNone2);
        eastPedestrain1 = (ImageView)findViewById(R.id.m_eastPedestrain1);
        eastPedestrain2 = (ImageView)findViewById(R.id.m_eastPedestrain2);
        southLeft = (ImageView)findViewById(R.id.m_southLeft);
        southStriaght = (ImageView)findViewById(R.id.m_southStriaght);
        southRight = (ImageView)findViewById(R.id.m_southRight);
        southOther = (ImageView)findViewById(R.id.m_southOther);
        southNone1 = (ImageView)findViewById(R.id.m_southNone1);
        southNone2 = (ImageView)findViewById(R.id.m_southNone2);
        southPedestrain1 = (ImageView)findViewById(R.id.m_southPedestrain1);
        southPedestrain2 = (ImageView)findViewById(R.id.m_southPedestrain2);
        westLeft = (ImageView)findViewById(R.id.m_westLeft);
        westStriaght = (ImageView)findViewById(R.id.m_westStriaght);
        westRight = (ImageView)findViewById(R.id.m_westRight);
        westOther = (ImageView)findViewById(R.id.m_westOther);
        westNone1  = (ImageView)findViewById(R.id.m_westNone1);
        westNone2 = (ImageView)findViewById(R.id.m_westNone2);
        westPedestrain1 = (ImageView)findViewById(R.id.m_westPedestrain1);
        westPedestrain2 = (ImageView)findViewById(R.id.m_westPedestrain2);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manaul);
        initViews();
        Context ctx = ManaulActivity.this;
        SharedPreferences sp = ctx.getSharedPreferences(AndroidTscDefine.TSCNODE, MODE_PRIVATE);
        node = AndroidTscDefine.spToTscNode(sp);
        thread = new Thread(runnable);
        thread.start();
        mcs = new MunualControlServiceImpl();
        RadioGroup rg_control = (RadioGroup)findViewById(R.id.rg_control);
        rg_control.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int radioId = radioGroup.getCheckedRadioButtonId();
                if (radioId == R.id.rb_munual){
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                mcs.switchMunual(node);
                            }
                        }).start();

                }else if(radioId == R.id.rb_self){
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            mcs.switchSelf(node);
                        }
                    }).start();

                }
            }
        });
    }

    cn.com.aiton.domain.Message msg;
    public void btnNextStep(View view){


        new Thread(new Runnable() {
            @Override
            public void run() {
                msg = mcs.switchNextStep(node);
            }
        }).start();
        if(msg == null || !msg.isBoo()){
            Toast.makeText(this,"下一步操作失败！",Toast.LENGTH_LONG).show();
        }
    }
    public void btnNextPhase(View view){
        new Thread(new Runnable() {
            @Override
            public void run() {

                msg = mcs.switchNextPhase(node);
            }
        }).start();
        if(msg == null || !msg.isBoo()){
            Toast.makeText(this,"下一步操作失败！",Toast.LENGTH_LONG).show();
        }
    }
    public void btnNextDirec(View view){
        new Thread(new Runnable() {
            @Override
            public void run() {
                msg = mcs.switchNextDirec(node);
            }
        }).start();
        if(msg == null || !msg.isBoo()){
            Toast.makeText(this,"下一步操作失败！",Toast.LENGTH_LONG).show();
        }
    }
    public void btnNorth(View view){
        new Thread(new Runnable() {
            @Override
            public void run() {
                msg = mcs.switchNorth(node);
            }
        }).start();
        if(msg == null || !msg.isBoo()){
            Toast.makeText(this,"下一步操作失败！",Toast.LENGTH_LONG).show();
        }
    }
    public void btnEast(View view){
        new Thread(new Runnable() {
            @Override
            public void run() {
                msg = mcs.switchEast(node);
            }
        }).start();
        if(msg == null || !msg.isBoo()){
            Toast.makeText(this,"下一步操作失败！",Toast.LENGTH_LONG).show();
        }
    }
    public void btnSouth(View view){
        new Thread(new Runnable() {
            @Override
            public void run() {
                msg = mcs.switchSouth(node);
            }
        }).start();
        if(msg == null || !msg.isBoo()){
            Toast.makeText(this,"下一步操作失败！",Toast.LENGTH_LONG).show();
        }
    }
    public void btnWest(View view){
        new Thread(new Runnable() {
            @Override
            public void run() {
                msg = mcs.switchWest(node);
            }
        }).start();
        if(msg == null || !msg.isBoo()){
            Toast.makeText(this,"下一步操作失败！",Toast.LENGTH_LONG).show();
        }
    }
}
