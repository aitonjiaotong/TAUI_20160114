package cn.com.aiton.taui;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import net.tsz.afinal.FinalDb;

import java.util.Iterator;
import java.util.List;

import cn.com.aiton.domain.GbtChannel;
import cn.com.aiton.domain.GbtCollision;
import cn.com.aiton.domain.GbtDetector;
import cn.com.aiton.domain.GbtDirec;
import cn.com.aiton.domain.GbtEventLog;
import cn.com.aiton.domain.GbtLampCheck;
import cn.com.aiton.domain.GbtModule;
import cn.com.aiton.domain.GbtOverlap;
import cn.com.aiton.domain.GbtPhase;
import cn.com.aiton.domain.GbtSchedule;
import cn.com.aiton.domain.GbtStagePattern;
import cn.com.aiton.domain.GbtTimeBase;
import cn.com.aiton.domain.GbtTimePattern;
import cn.com.aiton.domain.TscNode;
import cn.com.aiton.services.ChannelService;
import cn.com.aiton.services.CollisionService;
import cn.com.aiton.services.DetectorService;
import cn.com.aiton.services.LampCheckService;
import cn.com.aiton.services.LogEventService;
import cn.com.aiton.services.ModuleService;
import cn.com.aiton.services.OverlapPhaseService;
import cn.com.aiton.services.PatternService;
import cn.com.aiton.services.PhaseService;
import cn.com.aiton.services.PhaseToDirecService;
import cn.com.aiton.services.ScheduleService;
import cn.com.aiton.services.StagePatternService;
import cn.com.aiton.services.TimeBaseService;
import cn.com.aiton.services.impl.ChannelServiceImpl;
import cn.com.aiton.services.impl.CollisionServiceImpl;
import cn.com.aiton.services.impl.DetectorServiceImpl;
import cn.com.aiton.services.impl.LampCheckServiceImpl;
import cn.com.aiton.services.impl.LogEventServiceImpl;
import cn.com.aiton.services.impl.ModuleServiceImpl;
import cn.com.aiton.services.impl.OverlapPhaseServiceImpl;
import cn.com.aiton.services.impl.PatternServiceImpl;
import cn.com.aiton.services.impl.PhaseServiceImpl;
import cn.com.aiton.services.impl.PhaseToDirecServiceImpl;
import cn.com.aiton.services.impl.ScheduleServiceImpl;
import cn.com.aiton.services.impl.StagePatternServiceImpl;
import cn.com.aiton.services.impl.TimeBaseServiceImpl;
import cn.com.aiton.utils.AndroidTscDefine;
import cn.com.aiton.utils.TscDbUtils;


public class LoadActivity extends Activity {
    public final static int SUCCESS = 1;
    public final static int FAILURE = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load01);
    }


    public void deleteTsc(View view){
        FinalDb db = FinalDb.create(this,AndroidTscDefine.DBNAME);
        db.deleteAll(TscNode.class);
        db.deleteAll(GbtChannel.class);
        db.deleteAll(GbtCollision.class);
        db.deleteAll(GbtDetector.class);
        db.deleteAll(GbtLampCheck.class);
        db.deleteAll(GbtEventLog.class);
        db.deleteAll(GbtModule.class);
        db.deleteAll(GbtOverlap.class);
        db.deleteAll(GbtTimePattern.class);
        db.deleteAll(GbtPhase.class);
        db.deleteAll(GbtDirec.class);
        db.deleteAll(GbtSchedule.class);
        db.deleteAll(GbtStagePattern.class);
        db.deleteAll(GbtTimeBase.class);
        finish();
    }
    public void loadTsc(View view){
        EditText etname = (EditText)findViewById(R.id.txtName);
        EditText etipaddress = (EditText)findViewById(R.id.txtIPAddress);
        FinalDb db = FinalDb.create(this,AndroidTscDefine.DBNAME);
        TscNode node = new TscNode();
        node.setDeviceName(etname.getText().toString());
        node.setGroupId(1);
        node.setGroupSequence(1);
        node.setIpAddress(etipaddress.getText().toString());
        node.setLatitude(0);
        node.setLinkType(1);
        node.setLongitude(0);
        node.setPort(5435);
        node.setProtocolType(1);
        node.setVersion("1.0");


        List<TscNode> tscNodes = db.findAllByWhere(TscNode.class,"ipAddress ='"+node.getIpAddress()+"'");
        if(tscNodes.size()==1){
            Toast.makeText(this, "目标IP地址的已经存在，请在管理中删除再进行加载！", Toast.LENGTH_LONG).show();
        }else if(tscNodes.size()==0){
            InitDbByNode initDbByNode = new InitDbByNode(node);
            Thread thread1 = new Thread(initDbByNode);
            thread1.start();
            finish();
        }


    }
    public class InitDbByNode implements Runnable {
        private TscNode node;

        public InitDbByNode(TscNode node) {
            this.node = node;
        }

        public void run() {
            FinalDb db = FinalDb.create(LoadActivity.this, AndroidTscDefine.DBNAME);
            db.save(node);
            int id = TscDbUtils.getTscNodeByIPAddress(db,node.getIpAddress()).get(0).getId();
            ChannelService channelService = new ChannelServiceImpl();
            List<GbtChannel> gbtChannelList = channelService.getChannel(node);
            Iterator<GbtChannel> iteratorChannel = gbtChannelList.iterator();
            while(iteratorChannel.hasNext()){
                GbtChannel channel = iteratorChannel.next();
                channel.setDeviceId(id);
                db.save(channel);
            }
            CollisionService collisionService = new CollisionServiceImpl();
            List<GbtCollision> gbtCollisions = collisionService.getCollisionBy32Phase(node);
            Iterator<GbtCollision> gbtCollisionIterator = gbtCollisions.iterator();
            while(gbtCollisionIterator.hasNext()){
                GbtCollision collision =  gbtCollisionIterator.next();
                collision.setDeviceId(id);
                db.save(collision);
            }
            DetectorService detectorService = new DetectorServiceImpl();
            List<GbtDetector> gbtDetectors = detectorService.getDetector(node);
            Iterator<GbtDetector> gbtDetectorIterator = gbtDetectors.iterator();
            while (gbtDetectorIterator.hasNext()){
                GbtDetector detector = gbtDetectorIterator.next();
                detector.setDeviceId(id);
                db.save(detector);
            }

            LampCheckService lampCheckService = new LampCheckServiceImpl();
            List<GbtLampCheck> gbtLampChecks = lampCheckService.getLampCheck(node);
            Iterator<GbtLampCheck> gbtLampCheckIterator = gbtLampChecks.iterator();
            while(gbtLampCheckIterator.hasNext()){
                GbtLampCheck lampCheck = gbtLampCheckIterator.next();
                lampCheck.setDeviceId(id);
                db.save(lampCheck);
            }
            LogEventService logEventService = new LogEventServiceImpl();
            List<GbtEventLog> gbtEventLogs = logEventService.getEventLog(node);
            Iterator<GbtEventLog> gbtEventLogIterator = gbtEventLogs.iterator();
            while(gbtEventLogIterator.hasNext()){
                GbtEventLog eventLog = gbtEventLogIterator.next();
                eventLog.setDeviceId(id);
                db.save(eventLog);
            }
            ModuleService moduleService = new ModuleServiceImpl();
            List<GbtModule> gbtModules = moduleService.getModule(node);
            Iterator<GbtModule> gbtModuleIterator = gbtModules.iterator();
            while(gbtModuleIterator.hasNext()){
                GbtModule module = gbtModuleIterator.next();
                module.setDeviceId(id);
                db.save(module);
            }
            OverlapPhaseService overlapPhaseService = new OverlapPhaseServiceImpl();
            List<GbtOverlap> gbtOverlaps = overlapPhaseService.getOverlapPhase(node);
            Iterator<GbtOverlap> gbtOverlapIterator = gbtOverlaps.iterator();
            while(gbtOverlapIterator.hasNext()){
                GbtOverlap overlap = gbtOverlapIterator.next();
                overlap.setDeviceId(id);
                db.save(overlap);
            }

            PatternService patternService = new PatternServiceImpl();
            List<GbtTimePattern> gbtTimePatterns = patternService.getTimePattern(node);
            Iterator<GbtTimePattern> gbtTimePatternIterator = gbtTimePatterns.iterator();
            while(gbtTimePatternIterator.hasNext()){
                GbtTimePattern timePattern = gbtTimePatternIterator.next();
                timePattern.setDeviceId(id);
                db.save(timePattern);
            }

            PhaseService phaseService = new PhaseServiceImpl();
            List<GbtPhase> gbtPhases = phaseService.getPhase(node);
            Iterator<GbtPhase> gbtPhaseIterator = gbtPhases.iterator();
            while(gbtPhaseIterator.hasNext()){
                GbtPhase phase = gbtPhaseIterator.next();
                phase.setDeviceId(id);
                db.save(phase);
            }
            PhaseToDirecService phaseToDirecService = new PhaseToDirecServiceImpl();
            List<GbtDirec> gbtDirecs = phaseToDirecService.getPhaseToDirec(node);
            Iterator<GbtDirec> gbtDirecIterator = gbtDirecs.iterator();
            while(gbtDirecIterator.hasNext()){
                GbtDirec direc = gbtDirecIterator.next();
                direc.setDeviceId(id);
                db.save(direc);
            }
            ScheduleService scheduleService = new ScheduleServiceImpl();
            List<GbtSchedule> gbtSchedules = scheduleService.getSchedule(node);
            Iterator<GbtSchedule> gbtScheduleIterator = gbtSchedules.iterator();
            while(gbtScheduleIterator.hasNext()){
                GbtSchedule schedule = gbtScheduleIterator.next();
                schedule.setDeviceId(id);
                db.save(schedule);
            }
            StagePatternService stagePatternService = new StagePatternServiceImpl();
            List<GbtStagePattern> gbtStagePatterns = stagePatternService.getStagePattern32Phase(node);
            Iterator<GbtStagePattern> gbtStagePatternIterator = gbtStagePatterns.iterator();
            while(gbtStagePatternIterator.hasNext()){
                GbtStagePattern stagePattern = gbtStagePatternIterator.next();
                stagePattern.setDeviceId(id);
                db.save(stagePattern);
            }
            TimeBaseService timeBaseService = new TimeBaseServiceImpl();
            List<GbtTimeBase> gbtTimeBases = timeBaseService.getTimeBase(node);
            Iterator<GbtTimeBase> gbtTimeBaseIterator = gbtTimeBases.iterator();
            while(gbtTimeBaseIterator.hasNext()){
                GbtTimeBase timeBase = gbtTimeBaseIterator.next();
                timeBase.setDeviceId(id);
                db.save(timeBase);
            }
            Message msg = new Message();
            msg.what = SUCCESS;
            initDbhandler.sendMessage(msg);
        }
    }
    final Handler initDbhandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case SUCCESS:
                    Toast.makeText(LoadActivity.this,"数据导入成功！",Toast.LENGTH_LONG).show();
                    break;
                case FAILURE:
                    Toast.makeText(LoadActivity.this,"数据导入失败！",Toast.LENGTH_LONG).show();
                    break;
                default:
                    break;
            }
            super.handleMessage(msg);
        }
    };
}
