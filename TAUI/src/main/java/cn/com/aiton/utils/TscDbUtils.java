package cn.com.aiton.utils;

import net.tsz.afinal.FinalDb;

import java.util.ArrayList;
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
import cn.com.aiton.domain.GbtTrafficStatistics;
import cn.com.aiton.domain.TscNode;

/**
 * Created by Administrator on 2014/11/27.
 */
public class TscDbUtils {
    public static List<GbtDirec> getGbtDirecsByNode(FinalDb db,TscNode node){
        List<GbtDirec> gbtDirecs = new ArrayList<GbtDirec>();
        gbtDirecs = db.findAllByWhere(GbtDirec.class,"deviceId = '"+node.getId()+"'");
        return gbtDirecs;
    }
    public static List<GbtChannel> getGbtChannelsByNode(FinalDb db,TscNode node){
        List<GbtChannel> gbtChannels = new ArrayList<GbtChannel>();

        gbtChannels = db.findAllByWhere(GbtChannel.class,"deviceId = '"+node.getId()+"'");
        return gbtChannels;
    }
    public static List<TscNode> getTscNodeByIPAddress(FinalDb db,String ipaddress){
        List<TscNode> tscNodes = db.findAllByWhere(TscNode.class,"ipAddress = '"+ipaddress+"'");
        return  tscNodes;
    }
    public static List<GbtCollision> getGbtCollisionsByNode(FinalDb db,TscNode node){
        List<GbtCollision> gbtCollisions = new ArrayList<GbtCollision>();
        gbtCollisions = db.findAllByWhere(GbtCollision.class,"deviceId = '"+node.getId()+"'");
        return gbtCollisions;
    }

    public static List<GbtDetector> getGbtDetectorsByNode(FinalDb db,TscNode node){
        List<GbtDetector> gbtDetectors = new ArrayList<GbtDetector>();
        gbtDetectors = db.findAllByWhere(GbtDetector.class,"deviceId = '"+node.getId()+"'");
        return  gbtDetectors;
    }
    public static List<GbtEventLog> getGbtEventLogsByNode(FinalDb db,TscNode node){
        List<GbtEventLog> gbtEventLogs = new ArrayList<GbtEventLog>();
        gbtEventLogs = db.findAllByWhere(GbtEventLog.class,"deviceId = '"+node.getId()+"'");
        return gbtEventLogs;
    }
    public static List<GbtLampCheck> getGbtLampChecksByNode(FinalDb db,TscNode node){
        List<GbtLampCheck> gbtLampChecks = new ArrayList<GbtLampCheck>();
        gbtLampChecks = db.findAllByWhere(GbtLampCheck.class,"deviceId = '"+node.getId()+"'");
        return gbtLampChecks;
    }
    public static List<GbtModule> getGbtModulesByNode(FinalDb db,TscNode node){
        List<GbtModule> gbtModules = new ArrayList<GbtModule>();
        gbtModules = db.findAllByWhere(GbtModule.class,"deviceId = '"+node.getId()+"'");
        return gbtModules;
    }
    public static List<GbtOverlap> getGbtOverlapsByNode(FinalDb db,TscNode node){
        List<GbtOverlap> gbtOverlaps = new ArrayList<GbtOverlap>();
        gbtOverlaps = db.findAllByWhere(GbtOverlap.class,"deviceId = '"+node.getId()+"'");
        return gbtOverlaps;
    }
    public static List<GbtPhase> getGbtPhasesByNode(FinalDb db,TscNode node){
        List<GbtPhase> gbtPhases = new ArrayList<GbtPhase>();
        gbtPhases = db.findAllByWhere(GbtPhase.class,"deviceId = '"+node.getId()+"'");
        return gbtPhases;
    }
    public static List<GbtSchedule> getGbtSchedulesByNode(FinalDb db,TscNode node){
        List<GbtSchedule> gbtSchedules = new ArrayList<GbtSchedule>();
        gbtSchedules = db.findAllByWhere(GbtSchedule.class,"deviceId = '"+node.getId()+"'");
        return gbtSchedules;
    }
    public static List<GbtStagePattern> getGbtStagePatternsByNode(FinalDb db,TscNode node){
        List<GbtStagePattern> gbtStagePatterns = new ArrayList<GbtStagePattern>();
        gbtStagePatterns = db.findAllByWhere(GbtStagePattern.class,"deviceId = '"+node.getId()+"'");
        return gbtStagePatterns;
    }
    public static List<GbtTimeBase> getGbtTimeBasesByNode(FinalDb db,TscNode node){
        List<GbtTimeBase> gbtTimeBases = new ArrayList<GbtTimeBase>();
        gbtTimeBases = db.findAllByWhere(GbtTimeBase.class,"deviceId = '"+node.getId()+"'");
        return gbtTimeBases;
    }
    public static List<GbtTimePattern> getGbtTimePatternsByNode(FinalDb db,TscNode node){
        List<GbtTimePattern> gbtTimePatterns = new ArrayList<GbtTimePattern>();
        gbtTimePatterns = db.findAllByWhere(GbtTimePattern.class,"deviceId = '"+node.getId()+"'");
        return gbtTimePatterns;
    }
    public static List<GbtTrafficStatistics> getGbtTrafficStatisticsesByNode(FinalDb db,TscNode node){
        List<GbtTrafficStatistics> gbtTrafficStatisticses = new ArrayList<GbtTrafficStatistics>();
        gbtTrafficStatisticses = db.findAllByWhere(GbtTrafficStatistics.class,"deviceId = '"+node.getId()+"'");
        return gbtTrafficStatisticses;
    }
}
