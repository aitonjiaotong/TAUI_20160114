package cn.com.aiton.taui.fragment;


import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import net.tsz.afinal.FinalDb;

import java.util.Iterator;
import java.util.List;

import cn.com.aiton.domain.GbtDirec;
import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;
import cn.com.aiton.services.PhaseToDirecService;
import cn.com.aiton.services.impl.PhaseToDirecServiceImpl;
import cn.com.aiton.taui.R;
import cn.com.aiton.utils.AndroidTscDefine;
import cn.com.aiton.utils.GbtDefine;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment03 extends Fragment implements View.OnClickListener
{

    TextView tv_northleft;
    TextView tv_northstraight;
    TextView tv_northright;
    TextView tv_northother;
    TextView tv_northpedestrain1;
    TextView tv_northpedestrain2;
    TextView tv_northnone1;
    TextView tv_northnone2;

    TextView tv_eastleft;
    TextView tv_eaststraight;
    TextView tv_eastright;
    TextView tv_eastother;
    TextView tv_eastpedestrain1;
    TextView tv_eastpedestrain2;
    TextView tv_eastnone1;
    TextView tv_eastnone2;

    TextView tv_southleft;
    TextView tv_southstraight;
    TextView tv_southright;
    TextView tv_southother;
    TextView tv_southpedestrain1;
    TextView tv_southpedestrain2;
    TextView tv_southnone1;
    TextView tv_southnone2;

    TextView tv_westleft;
    TextView tv_weststraight;
    TextView tv_westright;
    TextView tv_westother;
    TextView tv_westpedestrain1;
    TextView tv_westpedestrain2;
    TextView tv_westnone1;
    TextView tv_westnone2;
    TextView tv_phase_config_alarm;
    private View mLayout;
    private ImageView northRight;
    private ImageView northOther;
    private ImageView northLeft;
    private ImageView northStriaght;
    private ImageView northPedestrain1;
    private ImageView northPedestrain2;
    private ImageView northNone1;
    private ImageView northNone2;
    private ImageView eastOther;
    private ImageView eastRight;
    private ImageView eastStriaght;
    private ImageView eastLeft;
    private ImageView eastPedestrain1;
    private ImageView eastPedestrain2;
    private ImageView eastNone2;
    private ImageView eastNone1;
    private ImageView southOther;
    private ImageView southRight;
    private ImageView southStraight;
    private ImageView southLeft;
    private ImageView southPedestrain2;
    private ImageView southPedestrain1;
    private ImageView southNone1;
    private ImageView southNone2;
    private ImageView westOther;
    private ImageView westRight;
    private ImageView westStriaght;
    private ImageView westLeft;
    private ImageView westPedestrain1;
    private ImageView westPedestrain2;
    private ImageView westNone1;
    private ImageView westNone2;
    private Button configSaveToTsc;
    private Button checkData;

    public Fragment03()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        mLayout = inflater.inflate(R.layout.fragment_fragment03, null);
        initUI();
        tv_phase_config_alarm.setMovementMethod(ScrollingMovementMethod.getInstance());
        FinalDb db = AndroidTscDefine.getFinalDb(getActivity());
        SharedPreferences sp = getActivity().getSharedPreferences(AndroidTscDefine.TSCNODE, getActivity().MODE_PRIVATE);
        TscNode node = AndroidTscDefine.spToTscNode(sp);
        List<GbtDirec> gbtDirecs = db.findAllByWhere(GbtDirec.class, "deviceId = '" + node.getId() + "'");
        Iterator<GbtDirec> gbtDirecIterator = gbtDirecs.iterator();
        while (gbtDirecIterator.hasNext())
        {
            displayPhaseToDirec(gbtDirecIterator.next());
        }
        setOnclick();
        return mLayout;
    }

    private void initUI()
    {
        tv_northleft = (TextView) mLayout.findViewById(R.id.tv_northLeft);
        tv_northstraight = (TextView) mLayout.findViewById(R.id.tv_northStriaght);
        tv_northright = (TextView) mLayout.findViewById(R.id.tv_northRight);
        tv_northother = (TextView) mLayout.findViewById(R.id.tv_northOther);
        tv_northpedestrain1 = (TextView) mLayout.findViewById(R.id.tv_northPedestrain1);
        tv_northpedestrain2 = (TextView) mLayout.findViewById(R.id.tv_northPedestrain2);
        tv_northnone1 = (TextView) mLayout.findViewById(R.id.tv_northnone1);
        tv_northnone2 = (TextView) mLayout.findViewById(R.id.tv_northnone2);
        tv_eastleft = (TextView) mLayout.findViewById(R.id.tv_eastLeft);
        tv_eaststraight = (TextView) mLayout.findViewById(R.id.tv_eastStraight);
        tv_eastright = (TextView) mLayout.findViewById(R.id.tv_eastRight);
        tv_eastother = (TextView) mLayout.findViewById(R.id.tv_eastOther);
        tv_eastpedestrain1 = (TextView) mLayout.findViewById(R.id.tv_eastPedestrain1);
        tv_eastpedestrain2 = (TextView) mLayout.findViewById(R.id.tv_eastPedestrain2);
        tv_eastnone1 = (TextView) mLayout.findViewById(R.id.tv_eastnone1);
        tv_eastnone2 = (TextView) mLayout.findViewById(R.id.tv_eastnone2);
        tv_southleft = (TextView) mLayout.findViewById(R.id.tv_southLeft);
        tv_southstraight = (TextView) mLayout.findViewById(R.id.tv_southStriaght);
        tv_southright = (TextView) mLayout.findViewById(R.id.tv_southRight);
        tv_southother = (TextView) mLayout.findViewById(R.id.tv_southOther);
        tv_southpedestrain1 = (TextView) mLayout.findViewById(R.id.tv_southPedestrain1);
        tv_southpedestrain2 = (TextView) mLayout.findViewById(R.id.tv_southPedestrain2);
        tv_southnone1 = (TextView) mLayout.findViewById(R.id.tv_southnone1);
        tv_southnone2 = (TextView) mLayout.findViewById(R.id.tv_southnone2);
        tv_westleft = (TextView) mLayout.findViewById(R.id.tv_westLeft);
        tv_weststraight = (TextView) mLayout.findViewById(R.id.tv_westStriaght);
        tv_westright = (TextView) mLayout.findViewById(R.id.tv_westRight);
        tv_westother = (TextView) mLayout.findViewById(R.id.tv_westOther);
        tv_westpedestrain1 = (TextView) mLayout.findViewById(R.id.tv_westPedestrain1);
        tv_westpedestrain2 = (TextView) mLayout.findViewById(R.id.tv_westPedestrain2);
        tv_westnone1 = (TextView) mLayout.findViewById(R.id.tv_westnone1);
        tv_westnone2 = (TextView) mLayout.findViewById(R.id.tv_westnone2);
        tv_phase_config_alarm = (TextView) mLayout.findViewById(R.id.tv_phase_config_alarm);


        northRight = (ImageView) mLayout.findViewById(R.id.northRight);
        northOther = (ImageView) mLayout.findViewById(R.id.northOther);
        northLeft = (ImageView) mLayout.findViewById(R.id.northLeft);
        northStriaght = (ImageView) mLayout.findViewById(R.id.northStriaght);
        northPedestrain1 = (ImageView) mLayout.findViewById(R.id.northPedestrain1);
        northPedestrain2 = (ImageView) mLayout.findViewById(R.id.northPedestrain2);
        northNone1 = (ImageView) mLayout.findViewById(R.id.northNone1);
        northNone2 = (ImageView) mLayout.findViewById(R.id.northNone2);
        eastOther = (ImageView) mLayout.findViewById(R.id.eastOther);
        eastRight = (ImageView) mLayout.findViewById(R.id.eastRight);
        eastStriaght = (ImageView) mLayout.findViewById(R.id.eastStriaght);
        eastLeft = (ImageView) mLayout.findViewById(R.id.eastLeft);
        eastPedestrain1 = (ImageView) mLayout.findViewById(R.id.eastPedestrain1);
        eastPedestrain2 = (ImageView) mLayout.findViewById(R.id.eastPedestrain2);
        eastNone2 = (ImageView) mLayout.findViewById(R.id.eastNone2);
        eastNone1 = (ImageView) mLayout.findViewById(R.id.eastNone1);
        southOther = (ImageView) mLayout.findViewById(R.id.southOther);
        southRight = (ImageView) mLayout.findViewById(R.id.southRight);
        southStraight = (ImageView) mLayout.findViewById(R.id.southStriaght);
        southLeft = (ImageView) mLayout.findViewById(R.id.southLeft);
        southPedestrain2 = (ImageView) mLayout.findViewById(R.id.southPedestrain2);
        southPedestrain1 = (ImageView) mLayout.findViewById(R.id.southPedestrain1);
        southNone1 = (ImageView) mLayout.findViewById(R.id.southNone1);
        southNone2 = (ImageView) mLayout.findViewById(R.id.southNone2);
        westOther = (ImageView) mLayout.findViewById(R.id.westOther);
        westRight = (ImageView) mLayout.findViewById(R.id.westRight);
        westStriaght = (ImageView) mLayout.findViewById(R.id.westStriaght);
        westLeft = (ImageView) mLayout.findViewById(R.id.westLeft);
        westPedestrain1 = (ImageView) mLayout.findViewById(R.id.westPedestrain1);
        westPedestrain2 = (ImageView) mLayout.findViewById(R.id.westPedestrain2);
        westNone1 = (ImageView) mLayout.findViewById(R.id.westNone1);
        westNone2 = (ImageView) mLayout.findViewById(R.id.westNone2);

        configSaveToTsc = (Button) mLayout.findViewById(R.id.configSaveToTsc);
        checkData = (Button) mLayout.findViewById(R.id.checkData);
    }

    /**
     * 根据方向对象，显示如果主相位有数据便是显示主相位，
     * 如果主相位没有数据，跟随相位有数据，显示跟随相位的数据
     *
     * @param gbtDirec
     * @return
     */
    private int phaseOrOverlap(GbtDirec gbtDirec)
    {
        if (gbtDirec.getPhaseId() != 0)
        {
            return gbtDirec.getPhaseId();
        } else
        {
            if (gbtDirec.getOverlapId() != 0)
            {
                return gbtDirec.getOverlapId();
            } else
            {
                return 0;
            }
        }
    }

    /**
     * 根据信号机方向对象数据来在界面上显示 方向的相位号。
     *
     * @param gbtDirec
     */
    private void displayPhaseToDirec(GbtDirec gbtDirec)
    {
        switch (gbtDirec.getDirecId())
        {
            case GbtDefine.I_NORTH_LEFT:
                tv_northleft.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_NORTH_STRAIGHT:
                tv_northstraight.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_NORTH_RIGHT:
                tv_northright.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_NORTH_OTHER:
                tv_northother.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_NORTH_PEDESTRAIN_ONE:
                tv_northpedestrain1.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_NORTH_PEDESTRAIN_TWO:
                tv_northpedestrain2.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_EAST_LEFT:
                tv_eastleft.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_EAST_STRAIGHT:
                tv_eaststraight.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_EAST_RIGHT:
                tv_eastright.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_EAST_OTHER:
                tv_eastother.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_EAST_PEDESTRAIN_ONE:
                tv_eastpedestrain1.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_EAST_PEDESTRAIN_TWO:
                tv_eastpedestrain2.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_SOUTH_LEFT:
                tv_southleft.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_SOUTH_STRAIGHT:
                tv_southstraight.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_SOUTH_RIGHT:
                tv_southright.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_SOUTH_OTHER:
                tv_southother.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_SOUTH_PEDESTRAIN_ONE:
                tv_southpedestrain1.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_SOUTH_PEDESTRAIN_TWO:
                tv_southpedestrain2.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_WEST_LEFT:
                tv_westleft.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_WEST_STRAIGHT:
                tv_weststraight.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_WEST_RIGHT:
                tv_westright.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_WEST_OTHER:
                tv_westother.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_WEST_PEDESTRAIN_ONE:
                tv_westpedestrain1.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_WEST_PEDESTRAIN_TWO:
                tv_westpedestrain2.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_NORTH_NONE1:
                tv_northnone1.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_EAST_NONE1:
                tv_eastnone1.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_SOUTH_NONE1:
                tv_southnone1.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_WEST_NONE1:
                tv_westnone1.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_NORTH_NONE2:
                tv_northnone2.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_EAST_NONE2:
                tv_eastnone2.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_SOUTH_NONE2:
                tv_southnone2.setText("" + phaseOrOverlap(gbtDirec));
                break;
            case GbtDefine.I_WEST_NONE2:
                tv_westnone2.setText("" + phaseOrOverlap(gbtDirec));
                break;

            default:

        }
    }

    public void northRight()
    {
        showDialog(getActivity(), GbtDefine.I_NORTH_RIGHT);
    }

    public void northOther()
    {
        showDialog(getActivity(), GbtDefine.I_NORTH_OTHER);
    }

    public void northLeft()
    {
        showDialog(getActivity(), GbtDefine.I_NORTH_LEFT);
    }

    public void northStriaght()
    {
        showDialog(getActivity(), GbtDefine.I_NORTH_STRAIGHT);
    }

    public void northPedestrain1()
    {
        showDialog(getActivity(), GbtDefine.I_NORTH_PEDESTRAIN_ONE);
    }

    public void northPedestrain2()
    {
        showDialog(getActivity(), GbtDefine.I_NORTH_PEDESTRAIN_TWO);
    }

    public void northNone1()
    {
        showDialog(getActivity(), GbtDefine.I_NORTH_NONE1);
    }

    public void northNone2()
    {
        showDialog(getActivity(), GbtDefine.I_NORTH_NONE2);
    }

    public void eastOther()
    {
        showDialog(getActivity(), GbtDefine.I_EAST_OTHER);
    }

    public void eastRight()
    {
        showDialog(getActivity(), GbtDefine.I_EAST_RIGHT);
    }

    public void eastStriaght()
    {
        showDialog(getActivity(), GbtDefine.I_EAST_STRAIGHT);
    }

    public void eastLeft()
    {
        showDialog(getActivity(), GbtDefine.I_EAST_LEFT);
    }

    public void eastPedestrain1()
    {
        showDialog(getActivity(), GbtDefine.I_EAST_PEDESTRAIN_ONE);
    }

    public void eastPedestrain2()
    {
        showDialog(getActivity(), GbtDefine.I_EAST_PEDESTRAIN_TWO);
    }

    public void eastNone2()
    {
        showDialog(getActivity(), GbtDefine.I_EAST_NONE2);
    }

    public void eastNone1()
    {
        showDialog(getActivity(), GbtDefine.I_EAST_NONE1);
    }

    public void southOther()
    {
        showDialog(getActivity(), GbtDefine.I_SOUTH_OTHER);
    }

    public void southRight()
    {
        showDialog(getActivity(), GbtDefine.I_SOUTH_RIGHT);
    }

    public void southStraight()
    {
        showDialog(getActivity(), GbtDefine.I_SOUTH_STRAIGHT);
    }

    public void southLeft()
    {
        showDialog(getActivity(), GbtDefine.I_SOUTH_LEFT);
    }

    public void southPedestrain2()
    {
        showDialog(getActivity(), GbtDefine.I_SOUTH_PEDESTRAIN_TWO);
    }

    public void southPedestrain1()
    {
        showDialog(getActivity(), GbtDefine.I_SOUTH_PEDESTRAIN_ONE);
    }

    public void southNone1()
    {
        showDialog(getActivity(), GbtDefine.I_SOUTH_NONE1);
    }

    public void southNone2()
    {
        showDialog(getActivity(), GbtDefine.I_SOUTH_NONE2);
    }

    public void westOther()
    {
        showDialog(getActivity(), GbtDefine.I_WEST_OTHER);
    }

    public void westRight()
    {
        showDialog(getActivity(), GbtDefine.I_WEST_RIGHT);
    }

    public void westStriaght()
    {
        showDialog(getActivity(), GbtDefine.I_WEST_STRAIGHT);
    }

    public void westLeft()
    {
        showDialog(getActivity(), GbtDefine.I_WEST_LEFT);
    }

    public void westPedestrain1()
    {
        showDialog(getActivity(), GbtDefine.I_WEST_PEDESTRAIN_ONE);
    }

    public void westPedestrain2()
    {
        showDialog(getActivity(), GbtDefine.I_WEST_PEDESTRAIN_TWO);
    }

    public void westNone1()
    {
        showDialog(getActivity(), GbtDefine.I_WEST_NONE1);
    }

    public void westNone2()
    {
        showDialog(getActivity(), GbtDefine.I_WEST_NONE2);
    }

    /**
     * 根据，主相位 或 跟随相位。将方向上的相位ID及方向保存到GBTDirec对象中。
     *
     * @param isPhase true 主相位    false 跟随相位
     * @param phaseid 相位ID
     * @param direc   方向
     */
    private void updateDirecInDb(boolean isPhase, int phaseid, int direc)
    {
        FinalDb db = AndroidTscDefine.getFinalDb(getActivity());
        TscNode node = AndroidTscDefine.spToTscNode(AndroidTscDefine.getSharedPreferences(getActivity()));
        List<GbtDirec> gbtDirecs = db.findAllByWhere(GbtDirec.class, "direcId = '" + direc + "' and deviceId = '" + node.getId() + "'");
        if (gbtDirecs.size() == 0)
        {
            GbtDirec gbtDirectemp = new GbtDirec();
            gbtDirectemp.setDeviceId(node.getId());
            gbtDirectemp.setDirecId(direc);
            gbtDirectemp.setRoadCount(1);

            if (isPhase)
            {
                gbtDirectemp.setPhaseId(phaseid);
            } else
            {
                gbtDirectemp.setOverlapId(phaseid);
            }
            db.save(gbtDirectemp);
        } else if (gbtDirecs.size() == 1)
        {
            GbtDirec gbtDirec = gbtDirecs.get(0);
            if (isPhase)
            {
                gbtDirec.setPhaseId(phaseid);
                gbtDirec.setOverlapId(0);
            } else
            {
                gbtDirec.setPhaseId(0);
                gbtDirec.setOverlapId(phaseid);
            }
            db.update(gbtDirec);
        } else
        {
            Toast.makeText(getActivity(), "在本地数据库中查找到重复的方向数据，请到加载页面删除数据后重新加载！", Toast.LENGTH_LONG).show();
        }


        GbtDirec g12 = db.findAllByWhere(GbtDirec.class, "direcId = '" + direc + "' and deviceId = '" + node.getId() + "'").get(0);
        // Toast.makeText(this,g12.getPhaseId(),Toast.LENGTH_LONG).show();
    }

    public final static int SUCCESS = 1;
    public final static int FAILURE = 0;
    Handler sendHandler = new Handler()
    {
        @Override
        public void handleMessage(android.os.Message msg)
        {
            switch (msg.what)
            {
                case SUCCESS:
                    Toast.makeText(getActivity(), "信号机接收数据成功！", Toast.LENGTH_LONG).show();
                    break;
                case FAILURE:
                    Toast.makeText(getActivity(), "信号机接收数据失败！", Toast.LENGTH_LONG).show();
                    break;
                default:
            }
            super.handleMessage(msg);
        }
    };

    Runnable runnable = new Runnable()
    {
        @Override
        public void run()
        {
            PhaseToDirecService ptds = new PhaseToDirecServiceImpl();
            Message message = ptds.setPhaseToDirec(sendGbtDirecs, sendTscNode);
            android.os.Message msg = new android.os.Message();
            if (message.isBoo())
            {
                msg.what = SUCCESS;
            } else
            {
                msg.what = FAILURE;
            }
            sendHandler.sendMessage(msg);
        }
    };
    TscNode sendTscNode;
    List<GbtDirec> sendGbtDirecs;

    /**
     * 主要是将更改后的相位，方向数据保存到信号机中。以便信号机在下一个周期立刻生效
     */
    public void configSaveToTsc()
    {
        sendTscNode = AndroidTscDefine.spToTscNode(AndroidTscDefine.getSharedPreferences(getActivity()));
        sendGbtDirecs = AndroidTscDefine.getFinalDb(getActivity()).findAllByWhere(GbtDirec.class, "deviceId = '" + sendTscNode.getId() + "'");
        Thread t1 = new Thread(runnable);
        t1.start();
    }

    public void checkData()
    {
        TscNode node = AndroidTscDefine.spToTscNode(AndroidTscDefine.getSharedPreferences(getActivity()));
        List<GbtDirec> gbtDirecs = AndroidTscDefine.getFinalDb(getActivity()).findAllByWhere(GbtDirec.class, "deviceId = '" + node.getId() + "'");
        Iterator<GbtDirec> gbtDirecIterator = gbtDirecs.iterator();
        while (gbtDirecIterator.hasNext())
        {
            GbtDirec gbtDirec = gbtDirecIterator.next();
            if (gbtDirec.getDirecId() == 0)
            {
                tv_phase_config_alarm.append("方向的ID存在0的严重数据异常，请联系厂家！！！");
            }
            if (gbtDirec.getPhaseId() == 0 && gbtDirec.getOverlapId() == 0)
            {
                tv_phase_config_alarm.append("方向上的主相位与跟随相位都没有绑定，请重新配置！");
            }
            if (gbtDirec.getRoadCount() == 0)
            {
                tv_phase_config_alarm.append("方向上的车道数据为0，请联系厂家！");
            }
        }
    }

    /**
     * 将修改的方向上的相位ID变更后，并将数据修改后的ID  保存到数据库中。
     *
     * @param phaseid 相位ID
     * @param direc   方向
     * @param isPhase true 主相位，false 跟随 相位
     */

    private void setPhaseToTextViewAndDb(int phaseid, int direc, boolean isPhase)
    {
        switch (direc)
        {
            case GbtDefine.I_NORTH_LEFT:
                tv_northleft.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_NORTH_STRAIGHT:
                tv_northstraight.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_NORTH_RIGHT:
                tv_northright.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_NORTH_OTHER:
                tv_northother.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_NORTH_PEDESTRAIN_ONE:
                tv_northpedestrain1.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_NORTH_PEDESTRAIN_TWO:
                tv_northpedestrain2.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_NORTH_NONE1:
                tv_northnone1.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_NORTH_NONE2:
                tv_northnone2.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_EAST_LEFT:
                tv_eastleft.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_EAST_STRAIGHT:
                tv_eaststraight.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_EAST_RIGHT:
                tv_eastright.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_EAST_OTHER:
                tv_eastother.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_EAST_PEDESTRAIN_ONE:
                tv_eastpedestrain1.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_EAST_PEDESTRAIN_TWO:
                tv_eastpedestrain2.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_EAST_NONE1:
                tv_eastnone1.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_EAST_NONE2:
                tv_eastnone2.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_SOUTH_LEFT:
                tv_southleft.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_SOUTH_STRAIGHT:
                tv_southstraight.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_SOUTH_RIGHT:
                tv_southright.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_SOUTH_OTHER:
                tv_southother.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_SOUTH_PEDESTRAIN_ONE:
                tv_southpedestrain1.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_SOUTH_PEDESTRAIN_TWO:
                tv_southpedestrain2.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_SOUTH_NONE1:
                tv_southnone1.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_SOUTH_NONE2:
                tv_southnone2.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_WEST_LEFT:
                tv_westleft.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_WEST_STRAIGHT:
                tv_weststraight.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_WEST_RIGHT:
                tv_westright.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_WEST_OTHER:
                tv_westother.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_WEST_PEDESTRAIN_ONE:
                tv_westpedestrain1.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_WEST_PEDESTRAIN_TWO:
                tv_westpedestrain2.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_WEST_NONE1:
                tv_westnone1.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            case GbtDefine.I_WEST_NONE2:
                tv_westnone2.setText(phaseid + "");
                updateDirecInDb(isPhase, phaseid, direc);
                break;
            default:

        }
    }

    //显示基本的AlertDialog，显示内容有相位ID的选择，主相位与跟随相位的选择
    private void showDialog(Context context, final int direc)
    {
        LayoutInflater inflater = LayoutInflater.from(getActivity());
        final View textEntryView = inflater.inflate(
                R.layout.phase_dialoglayout, null);
        final NumberPicker edtInput = (NumberPicker) textEntryView.findViewById(R.id.np_phase);
        final RadioButton rb_phase = (RadioButton) textEntryView.findViewById(R.id.rb_phase);
        final RadioButton rb_overlap = (RadioButton) textEntryView.findViewById(R.id.rb_overlap);
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
                new DialogInterface.OnClickListener()
                {
                    /**
                     * 点击确认按钮后，根据主相位选中，还是跟随相位选中。来更新界面上的相位号及数据库的数据
                     * @param dialog
                     * @param whichButton
                     */
                    public void onClick(DialogInterface dialog, int whichButton)
                    {

                        if (rb_phase.isChecked())
                        {
                            int phaseid = edtInput.getValue();
                            setPhaseToTextViewAndDb(phaseid, direc, true);
                        } else if (rb_overlap.isChecked())
                        {
                            int overlapid = edtInput.getValue();
                            setPhaseToTextViewAndDb(overlapid, direc, false);
                        } else
                        {
                            Toast.makeText(getActivity(), "请选择相位类型，跟随相位或主相位！", Toast.LENGTH_LONG).show();
                        }
                    }
                });
        builder.setNegativeButton("取消",
                new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int whichButton)
                    {
//                        setTitle("");
                    }
                });
        builder.show();
    }

    private void setOnclick()
    {
        northRight.setOnClickListener(this);
        northOther.setOnClickListener(this);
        northLeft.setOnClickListener(this);
        northStriaght.setOnClickListener(this);
        northPedestrain1.setOnClickListener(this);
        northPedestrain2.setOnClickListener(this);
        northNone1.setOnClickListener(this);
        northNone2.setOnClickListener(this);
        eastOther.setOnClickListener(this);
        eastRight.setOnClickListener(this);
        eastStriaght.setOnClickListener(this);
        eastLeft.setOnClickListener(this);
        eastPedestrain1.setOnClickListener(this);
        eastPedestrain2.setOnClickListener(this);
        eastNone2.setOnClickListener(this);
        eastNone1.setOnClickListener(this);
        southOther.setOnClickListener(this);
        southRight.setOnClickListener(this);
        southStraight.setOnClickListener(this);
        southLeft.setOnClickListener(this);
        southPedestrain2.setOnClickListener(this);
        southPedestrain1.setOnClickListener(this);
        southNone1.setOnClickListener(this);
        southNone2.setOnClickListener(this);
        westOther.setOnClickListener(this);
        westRight.setOnClickListener(this);
        westStriaght.setOnClickListener(this);
        westLeft.setOnClickListener(this);
        westPedestrain1.setOnClickListener(this);
        westPedestrain2.setOnClickListener(this);
        westNone1.setOnClickListener(this);
        westNone2.setOnClickListener(this);

        configSaveToTsc.setOnClickListener(this);
        checkData.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.northRight:
                northRight();
                break;
            case R.id.northOther:
                northOther();
                break;
            case R.id.northLeft:
                northLeft();
                break;
            case R.id.northStriaght:
                northStriaght();
                break;
            case R.id.northPedestrain1:
                northPedestrain1();
                break;
            case R.id.northPedestrain2:
                northPedestrain2();
                break;
            case R.id.northNone1:
                northNone1();
                break;
            case R.id.northNone2:
                northNone2();
                break;
            case R.id.eastOther:
                eastOther();
                break;
            case R.id.eastRight:
                eastRight();
                break;
            case R.id.eastStriaght:
                eastStriaght();
                break;
            case R.id.eastLeft:
                eastLeft();
                break;
            case R.id.eastPedestrain1:
                eastPedestrain1();
                break;
            case R.id.eastPedestrain2:
                eastPedestrain2();
                break;
            case R.id.eastNone2:
                eastNone2();
                break;
            case R.id.eastNone1:
                eastNone1();
                break;
            case R.id.southOther:
                southOther();
                break;
            case R.id.southRight:
                southRight();
                break;
            case R.id.southStraight:
                southStraight();
                break;
            case R.id.southLeft:
                southLeft();
                break;
            case R.id.southPedestrain2:
                southPedestrain2();
                break;
            case R.id.southPedestrain1:
                southPedestrain1();
                break;
            case R.id.southNone1:
                southNone1();
                break;
            case R.id.southNone2:
                southNone2();
                break;
            case R.id.westOther:
                westOther();
                break;
            case R.id.westRight:
                westRight();
                break;
            case R.id.westStriaght:
                westStriaght();
                break;
            case R.id.westLeft:
                westLeft();
                break;
            case R.id.westPedestrain1:
                westPedestrain1();
                break;
            case R.id.westPedestrain2:
                westPedestrain2();
                break;
            case R.id.westNone1:
                westNone1();
                break;
            case R.id.westNone2:
                westNone2();
                break;

            case R.id.configSaveToTsc:
                configSaveToTsc();
                break;
            case R.id.checkData:
                checkData();
                break;

        }
    }
}
