package cn.com.aiton.taui;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.opengl.Visibility;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import net.tsz.afinal.FinalDb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cn.com.aiton.domain.GbtDirec;
import cn.com.aiton.domain.GbtPhase;
import cn.com.aiton.domain.GbtStagePattern;
import cn.com.aiton.domain.GbtTimePattern;
import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;
import cn.com.aiton.services.PhaseToDirecService;
import cn.com.aiton.services.StagePatternService;
import cn.com.aiton.services.impl.PhaseToDirecServiceImpl;
import cn.com.aiton.services.impl.StagePatternServiceImpl;
import cn.com.aiton.utils.AndroidTscDefine;
import cn.com.aiton.utils.GbtDefine;


public class StageActivity extends Activity {
    View stage1;
    View stage2;
    View stage3;
    View stage4;
    View stage5;
    View stage6;
    View stage7;
    View stage8;
    View stage9;
    View stage10;
    View stage11;
    View stage12;
    View stage13;
    View stage14;
    View stage15;
    View stage16;
    View stage17;
    View stage18;
    View stage19;
    View stage20;
    View stage21;
    View stage22;
    View stage23;
    View stage24;
    View stage25;
    View stage26;
    View stage27;
    View stage28;
    View stage29;
    View stage30;
    View stage31;
    View stage32;
    ImageView stage1_small_northLeft ;
    ImageView stage1_small_northStriaght;
    ImageView stage1_small_northRight;
    ImageView stage1_small_northOther;
    ImageView stage1_small_northPedestrain1;
    ImageView stage1_small_northPedestrain2;
    ImageView stage1_small_northNone1;
    ImageView stage1_small_northNone2;
    ImageView stage1_small_eastLeft;
    ImageView stage1_small_eastStriaght;
    ImageView stage1_small_eastRight ;
    ImageView stage1_small_eastOther;
    ImageView stage1_small_eastPedestrain1;
    ImageView stage1_small_eastPedestrain2;
    ImageView stage1_small_eastNone1 ;
    ImageView stage1_small_eastNone2;
    ImageView stage1_small_southLeft;
    ImageView stage1_small_southStriaght;
    ImageView stage1_small_southRight;
    ImageView stage1_small_southOther;
    ImageView stage1_small_southPedestrain1;
    ImageView stage1_small_southPedestrain2;
    ImageView stage1_small_southNone1 ;
    ImageView stage1_small_southNone2 ;
    ImageView stage1_small_westLeft;
    ImageView stage1_small_westStriaght ;
    ImageView stage1_small_westRight;
    ImageView stage1_small_westOther;
    ImageView stage1_small_westPedestrain1;
    ImageView stage1_small_westPedestrain2;
    ImageView stage1_small_westNone1;
    ImageView stage1_small_westNone2;

    ImageView stage2_small_northLeft ;
    ImageView stage2_small_northStriaght;
    ImageView stage2_small_northRight;
    ImageView stage2_small_northOther;
    ImageView stage2_small_northPedestrain1;
    ImageView stage2_small_northPedestrain2;
    ImageView stage2_small_northNone1;
    ImageView stage2_small_northNone2;
    ImageView stage2_small_eastLeft;
    ImageView stage2_small_eastStriaght;
    ImageView stage2_small_eastRight ;
    ImageView stage2_small_eastOther;
    ImageView stage2_small_eastPedestrain1;
    ImageView stage2_small_eastPedestrain2;
    ImageView stage2_small_eastNone1 ;
    ImageView stage2_small_eastNone2;
    ImageView stage2_small_southLeft;
    ImageView stage2_small_southStriaght;
    ImageView stage2_small_southRight;
    ImageView stage2_small_southOther;
    ImageView stage2_small_southPedestrain1;
    ImageView stage2_small_southPedestrain2;
    ImageView stage2_small_southNone1 ;
    ImageView stage2_small_southNone2 ;
    ImageView stage2_small_westLeft;
    ImageView stage2_small_westStriaght ;
    ImageView stage2_small_westRight;
    ImageView stage2_small_westOther;
    ImageView stage2_small_westPedestrain1;
    ImageView stage2_small_westPedestrain2;
    ImageView stage2_small_westNone1;
    ImageView stage2_small_westNone2;

    ImageView stage3_small_northLeft ;
    ImageView stage3_small_northStriaght;
    ImageView stage3_small_northRight;
    ImageView stage3_small_northOther;
    ImageView stage3_small_northPedestrain1;
    ImageView stage3_small_northPedestrain2;
    ImageView stage3_small_northNone1;
    ImageView stage3_small_northNone2;
    ImageView stage3_small_eastLeft;
    ImageView stage3_small_eastStriaght;
    ImageView stage3_small_eastRight ;
    ImageView stage3_small_eastOther;
    ImageView stage3_small_eastPedestrain1;
    ImageView stage3_small_eastPedestrain2;
    ImageView stage3_small_eastNone1 ;
    ImageView stage3_small_eastNone2;
    ImageView stage3_small_southLeft;
    ImageView stage3_small_southStriaght;
    ImageView stage3_small_southRight;
    ImageView stage3_small_southOther;
    ImageView stage3_small_southPedestrain1;
    ImageView stage3_small_southPedestrain2;
    ImageView stage3_small_southNone1 ;
    ImageView stage3_small_southNone2 ;
    ImageView stage3_small_westLeft;
    ImageView stage3_small_westStriaght ;
    ImageView stage3_small_westRight;
    ImageView stage3_small_westOther;
    ImageView stage3_small_westPedestrain1;
    ImageView stage3_small_westPedestrain2;
    ImageView stage3_small_westNone1;
    ImageView stage3_small_westNone2;

    ImageView stage4_small_northLeft ;
    ImageView stage4_small_northStriaght;
    ImageView stage4_small_northRight;
    ImageView stage4_small_northOther;
    ImageView stage4_small_northPedestrain1;
    ImageView stage4_small_northPedestrain2;
    ImageView stage4_small_northNone1;
    ImageView stage4_small_northNone2;
    ImageView stage4_small_eastLeft;
    ImageView stage4_small_eastStriaght;
    ImageView stage4_small_eastRight ;
    ImageView stage4_small_eastOther;
    ImageView stage4_small_eastPedestrain1;
    ImageView stage4_small_eastPedestrain2;
    ImageView stage4_small_eastNone1 ;
    ImageView stage4_small_eastNone2;
    ImageView stage4_small_southLeft;
    ImageView stage4_small_southStriaght;
    ImageView stage4_small_southRight;
    ImageView stage4_small_southOther;
    ImageView stage4_small_southPedestrain1;
    ImageView stage4_small_southPedestrain2;
    ImageView stage4_small_southNone1 ;
    ImageView stage4_small_southNone2 ;
    ImageView stage4_small_westLeft;
    ImageView stage4_small_westStriaght ;
    ImageView stage4_small_westRight;
    ImageView stage4_small_westOther;
    ImageView stage4_small_westPedestrain1;
    ImageView stage4_small_westPedestrain2;
    ImageView stage4_small_westNone1;
    ImageView stage4_small_westNone2;

    ImageView stage5_small_northLeft ;
    ImageView stage5_small_northStriaght;
    ImageView stage5_small_northRight;
    ImageView stage5_small_northOther;
    ImageView stage5_small_northPedestrain1;
    ImageView stage5_small_northPedestrain2;
    ImageView stage5_small_northNone1;
    ImageView stage5_small_northNone2;
    ImageView stage5_small_eastLeft;
    ImageView stage5_small_eastStriaght;
    ImageView stage5_small_eastRight ;
    ImageView stage5_small_eastOther;
    ImageView stage5_small_eastPedestrain1;
    ImageView stage5_small_eastPedestrain2;
    ImageView stage5_small_eastNone1 ;
    ImageView stage5_small_eastNone2;
    ImageView stage5_small_southLeft;
    ImageView stage5_small_southStriaght;
    ImageView stage5_small_southRight;
    ImageView stage5_small_southOther;
    ImageView stage5_small_southPedestrain1;
    ImageView stage5_small_southPedestrain2;
    ImageView stage5_small_southNone1 ;
    ImageView stage5_small_southNone2 ;
    ImageView stage5_small_westLeft;
    ImageView stage5_small_westStriaght ;
    ImageView stage5_small_westRight;
    ImageView stage5_small_westOther;
    ImageView stage5_small_westPedestrain1;
    ImageView stage5_small_westPedestrain2;
    ImageView stage5_small_westNone1;
    ImageView stage5_small_westNone2;

    ImageView stage6_small_northLeft ;
    ImageView stage6_small_northStriaght;
    ImageView stage6_small_northRight;
    ImageView stage6_small_northOther;
    ImageView stage6_small_northPedestrain1;
    ImageView stage6_small_northPedestrain2;
    ImageView stage6_small_northNone1;
    ImageView stage6_small_northNone2;
    ImageView stage6_small_eastLeft;
    ImageView stage6_small_eastStriaght;
    ImageView stage6_small_eastRight ;
    ImageView stage6_small_eastOther;
    ImageView stage6_small_eastPedestrain1;
    ImageView stage6_small_eastPedestrain2;
    ImageView stage6_small_eastNone1 ;
    ImageView stage6_small_eastNone2;
    ImageView stage6_small_southLeft;
    ImageView stage6_small_southStriaght;
    ImageView stage6_small_southRight;
    ImageView stage6_small_southOther;
    ImageView stage6_small_southPedestrain1;
    ImageView stage6_small_southPedestrain2;
    ImageView stage6_small_southNone1 ;
    ImageView stage6_small_southNone2 ;
    ImageView stage6_small_westLeft;
    ImageView stage6_small_westStriaght ;
    ImageView stage6_small_westRight;
    ImageView stage6_small_westOther;
    ImageView stage6_small_westPedestrain1;
    ImageView stage6_small_westPedestrain2;
    ImageView stage6_small_westNone1;
    ImageView stage6_small_westNone2;

    ImageView stage7_small_northLeft ;
    ImageView stage7_small_northStriaght;
    ImageView stage7_small_northRight;
    ImageView stage7_small_northOther;
    ImageView stage7_small_northPedestrain1;
    ImageView stage7_small_northPedestrain2;
    ImageView stage7_small_northNone1;
    ImageView stage7_small_northNone2;
    ImageView stage7_small_eastLeft;
    ImageView stage7_small_eastStriaght;
    ImageView stage7_small_eastRight ;
    ImageView stage7_small_eastOther;
    ImageView stage7_small_eastPedestrain1;
    ImageView stage7_small_eastPedestrain2;
    ImageView stage7_small_eastNone1 ;
    ImageView stage7_small_eastNone2;
    ImageView stage7_small_southLeft;
    ImageView stage7_small_southStriaght;
    ImageView stage7_small_southRight;
    ImageView stage7_small_southOther;
    ImageView stage7_small_southPedestrain1;
    ImageView stage7_small_southPedestrain2;
    ImageView stage7_small_southNone1 ;
    ImageView stage7_small_southNone2 ;
    ImageView stage7_small_westLeft;
    ImageView stage7_small_westStriaght ;
    ImageView stage7_small_westRight;
    ImageView stage7_small_westOther;
    ImageView stage7_small_westPedestrain1;
    ImageView stage7_small_westPedestrain2;
    ImageView stage7_small_westNone1;
    ImageView stage7_small_westNone2;

    ImageView stage8_small_northLeft ;
    ImageView stage8_small_northStriaght;
    ImageView stage8_small_northRight;
    ImageView stage8_small_northOther;
    ImageView stage8_small_northPedestrain1;
    ImageView stage8_small_northPedestrain2;
    ImageView stage8_small_northNone1;
    ImageView stage8_small_northNone2;
    ImageView stage8_small_eastLeft;
    ImageView stage8_small_eastStriaght;
    ImageView stage8_small_eastRight ;
    ImageView stage8_small_eastOther;
    ImageView stage8_small_eastPedestrain1;
    ImageView stage8_small_eastPedestrain2;
    ImageView stage8_small_eastNone1 ;
    ImageView stage8_small_eastNone2;
    ImageView stage8_small_southLeft;
    ImageView stage8_small_southStriaght;
    ImageView stage8_small_southRight;
    ImageView stage8_small_southOther;
    ImageView stage8_small_southPedestrain1;
    ImageView stage8_small_southPedestrain2;
    ImageView stage8_small_southNone1 ;
    ImageView stage8_small_southNone2 ;
    ImageView stage8_small_westLeft;
    ImageView stage8_small_westStriaght ;
    ImageView stage8_small_westRight;
    ImageView stage8_small_westOther;
    ImageView stage8_small_westPedestrain1;
    ImageView stage8_small_westPedestrain2;
    ImageView stage8_small_westNone1;
    ImageView stage8_small_westNone2;

    ImageView stage9_small_northLeft ;
    ImageView stage9_small_northStriaght;
    ImageView stage9_small_northRight;
    ImageView stage9_small_northOther;
    ImageView stage9_small_northPedestrain1;
    ImageView stage9_small_northPedestrain2;
    ImageView stage9_small_northNone1;
    ImageView stage9_small_northNone2;
    ImageView stage9_small_eastLeft;
    ImageView stage9_small_eastStriaght;
    ImageView stage9_small_eastRight ;
    ImageView stage9_small_eastOther;
    ImageView stage9_small_eastPedestrain1;
    ImageView stage9_small_eastPedestrain2;
    ImageView stage9_small_eastNone1 ;
    ImageView stage9_small_eastNone2;
    ImageView stage9_small_southLeft;
    ImageView stage9_small_southStriaght;
    ImageView stage9_small_southRight;
    ImageView stage9_small_southOther;
    ImageView stage9_small_southPedestrain1;
    ImageView stage9_small_southPedestrain2;
    ImageView stage9_small_southNone1 ;
    ImageView stage9_small_southNone2 ;
    ImageView stage9_small_westLeft;
    ImageView stage9_small_westStriaght ;
    ImageView stage9_small_westRight;
    ImageView stage9_small_westOther;
    ImageView stage9_small_westPedestrain1;
    ImageView stage9_small_westPedestrain2;
    ImageView stage9_small_westNone1;
    ImageView stage9_small_westNone2;

    ImageView stage10_small_northLeft ;
    ImageView stage10_small_northStriaght;
    ImageView stage10_small_northRight;
    ImageView stage10_small_northOther;
    ImageView stage10_small_northPedestrain1;
    ImageView stage10_small_northPedestrain2;
    ImageView stage10_small_northNone1;
    ImageView stage10_small_northNone2;
    ImageView stage10_small_eastLeft;
    ImageView stage10_small_eastStriaght;
    ImageView stage10_small_eastRight ;
    ImageView stage10_small_eastOther;
    ImageView stage10_small_eastPedestrain1;
    ImageView stage10_small_eastPedestrain2;
    ImageView stage10_small_eastNone1 ;
    ImageView stage10_small_eastNone2;
    ImageView stage10_small_southLeft;
    ImageView stage10_small_southStriaght;
    ImageView stage10_small_southRight;
    ImageView stage10_small_southOther;
    ImageView stage10_small_southPedestrain1;
    ImageView stage10_small_southPedestrain2;
    ImageView stage10_small_southNone1 ;
    ImageView stage10_small_southNone2 ;
    ImageView stage10_small_westLeft;
    ImageView stage10_small_westStriaght ;
    ImageView stage10_small_westRight;
    ImageView stage10_small_westOther;
    ImageView stage10_small_westPedestrain1;
    ImageView stage10_small_westPedestrain2;
    ImageView stage10_small_westNone1;
    ImageView stage10_small_westNone2;

    ImageView stage11_small_northLeft ;
    ImageView stage11_small_northStriaght;
    ImageView stage11_small_northRight;
    ImageView stage11_small_northOther;
    ImageView stage11_small_northPedestrain1;
    ImageView stage11_small_northPedestrain2;
    ImageView stage11_small_northNone1;
    ImageView stage11_small_northNone2;
    ImageView stage11_small_eastLeft;
    ImageView stage11_small_eastStriaght;
    ImageView stage11_small_eastRight ;
    ImageView stage11_small_eastOther;
    ImageView stage11_small_eastPedestrain1;
    ImageView stage11_small_eastPedestrain2;
    ImageView stage11_small_eastNone1 ;
    ImageView stage11_small_eastNone2;
    ImageView stage11_small_southLeft;
    ImageView stage11_small_southStriaght;
    ImageView stage11_small_southRight;
    ImageView stage11_small_southOther;
    ImageView stage11_small_southPedestrain1;
    ImageView stage11_small_southPedestrain2;
    ImageView stage11_small_southNone1 ;
    ImageView stage11_small_southNone2 ;
    ImageView stage11_small_westLeft;
    ImageView stage11_small_westStriaght ;
    ImageView stage11_small_westRight;
    ImageView stage11_small_westOther;
    ImageView stage11_small_westPedestrain1;
    ImageView stage11_small_westPedestrain2;
    ImageView stage11_small_westNone1;
    ImageView stage11_small_westNone2;

    ImageView stage12_small_northLeft ;
    ImageView stage12_small_northStriaght;
    ImageView stage12_small_northRight;
    ImageView stage12_small_northOther;
    ImageView stage12_small_northPedestrain1;
    ImageView stage12_small_northPedestrain2;
    ImageView stage12_small_northNone1;
    ImageView stage12_small_northNone2;
    ImageView stage12_small_eastLeft;
    ImageView stage12_small_eastStriaght;
    ImageView stage12_small_eastRight ;
    ImageView stage12_small_eastOther;
    ImageView stage12_small_eastPedestrain1;
    ImageView stage12_small_eastPedestrain2;
    ImageView stage12_small_eastNone1 ;
    ImageView stage12_small_eastNone2;
    ImageView stage12_small_southLeft;
    ImageView stage12_small_southStriaght;
    ImageView stage12_small_southRight;
    ImageView stage12_small_southOther;
    ImageView stage12_small_southPedestrain1;
    ImageView stage12_small_southPedestrain2;
    ImageView stage12_small_southNone1 ;
    ImageView stage12_small_southNone2 ;
    ImageView stage12_small_westLeft;
    ImageView stage12_small_westStriaght ;
    ImageView stage12_small_westRight;
    ImageView stage12_small_westOther;
    ImageView stage12_small_westPedestrain1;
    ImageView stage12_small_westPedestrain2;
    ImageView stage12_small_westNone1;
    ImageView stage12_small_westNone2;

    ImageView stage13_small_northLeft ;
    ImageView stage13_small_northStriaght;
    ImageView stage13_small_northRight;
    ImageView stage13_small_northOther;
    ImageView stage13_small_northPedestrain1;
    ImageView stage13_small_northPedestrain2;
    ImageView stage13_small_northNone1;
    ImageView stage13_small_northNone2;
    ImageView stage13_small_eastLeft;
    ImageView stage13_small_eastStriaght;
    ImageView stage13_small_eastRight ;
    ImageView stage13_small_eastOther;
    ImageView stage13_small_eastPedestrain1;
    ImageView stage13_small_eastPedestrain2;
    ImageView stage13_small_eastNone1 ;
    ImageView stage13_small_eastNone2;
    ImageView stage13_small_southLeft;
    ImageView stage13_small_southStriaght;
    ImageView stage13_small_southRight;
    ImageView stage13_small_southOther;
    ImageView stage13_small_southPedestrain1;
    ImageView stage13_small_southPedestrain2;
    ImageView stage13_small_southNone1 ;
    ImageView stage13_small_southNone2 ;
    ImageView stage13_small_westLeft;
    ImageView stage13_small_westStriaght ;
    ImageView stage13_small_westRight;
    ImageView stage13_small_westOther;
    ImageView stage13_small_westPedestrain1;
    ImageView stage13_small_westPedestrain2;
    ImageView stage13_small_westNone1;
    ImageView stage13_small_westNone2;

    ImageView stage14_small_northLeft ;
    ImageView stage14_small_northStriaght;
    ImageView stage14_small_northRight;
    ImageView stage14_small_northOther;
    ImageView stage14_small_northPedestrain1;
    ImageView stage14_small_northPedestrain2;
    ImageView stage14_small_northNone1;
    ImageView stage14_small_northNone2;
    ImageView stage14_small_eastLeft;
    ImageView stage14_small_eastStriaght;
    ImageView stage14_small_eastRight ;
    ImageView stage14_small_eastOther;
    ImageView stage14_small_eastPedestrain1;
    ImageView stage14_small_eastPedestrain2;
    ImageView stage14_small_eastNone1 ;
    ImageView stage14_small_eastNone2;
    ImageView stage14_small_southLeft;
    ImageView stage14_small_southStriaght;
    ImageView stage14_small_southRight;
    ImageView stage14_small_southOther;
    ImageView stage14_small_southPedestrain1;
    ImageView stage14_small_southPedestrain2;
    ImageView stage14_small_southNone1 ;
    ImageView stage14_small_southNone2 ;
    ImageView stage14_small_westLeft;
    ImageView stage14_small_westStriaght ;
    ImageView stage14_small_westRight;
    ImageView stage14_small_westOther;
    ImageView stage14_small_westPedestrain1;
    ImageView stage14_small_westPedestrain2;
    ImageView stage14_small_westNone1;
    ImageView stage14_small_westNone2;

    ImageView stage15_small_northLeft ;
    ImageView stage15_small_northStriaght;
    ImageView stage15_small_northRight;
    ImageView stage15_small_northOther;
    ImageView stage15_small_northPedestrain1;
    ImageView stage15_small_northPedestrain2;
    ImageView stage15_small_northNone1;
    ImageView stage15_small_northNone2;
    ImageView stage15_small_eastLeft;
    ImageView stage15_small_eastStriaght;
    ImageView stage15_small_eastRight ;
    ImageView stage15_small_eastOther;
    ImageView stage15_small_eastPedestrain1;
    ImageView stage15_small_eastPedestrain2;
    ImageView stage15_small_eastNone1 ;
    ImageView stage15_small_eastNone2;
    ImageView stage15_small_southLeft;
    ImageView stage15_small_southStriaght;
    ImageView stage15_small_southRight;
    ImageView stage15_small_southOther;
    ImageView stage15_small_southPedestrain1;
    ImageView stage15_small_southPedestrain2;
    ImageView stage15_small_southNone1 ;
    ImageView stage15_small_southNone2 ;
    ImageView stage15_small_westLeft;
    ImageView stage15_small_westStriaght ;
    ImageView stage15_small_westRight;
    ImageView stage15_small_westOther;
    ImageView stage15_small_westPedestrain1;
    ImageView stage15_small_westPedestrain2;
    ImageView stage15_small_westNone1;
    ImageView stage15_small_westNone2;

    ImageView stage16_small_northLeft ;
    ImageView stage16_small_northStriaght;
    ImageView stage16_small_northRight;
    ImageView stage16_small_northOther;
    ImageView stage16_small_northPedestrain1;
    ImageView stage16_small_northPedestrain2;
    ImageView stage16_small_northNone1;
    ImageView stage16_small_northNone2;
    ImageView stage16_small_eastLeft;
    ImageView stage16_small_eastStriaght;
    ImageView stage16_small_eastRight ;
    ImageView stage16_small_eastOther;
    ImageView stage16_small_eastPedestrain1;
    ImageView stage16_small_eastPedestrain2;
    ImageView stage16_small_eastNone1 ;
    ImageView stage16_small_eastNone2;
    ImageView stage16_small_southLeft;
    ImageView stage16_small_southStriaght;
    ImageView stage16_small_southRight;
    ImageView stage16_small_southOther;
    ImageView stage16_small_southPedestrain1;
    ImageView stage16_small_southPedestrain2;
    ImageView stage16_small_southNone1 ;
    ImageView stage16_small_southNone2 ;
    ImageView stage16_small_westLeft;
    ImageView stage16_small_westStriaght ;
    ImageView stage16_small_westRight;
    ImageView stage16_small_westOther;
    ImageView stage16_small_westPedestrain1;
    ImageView stage16_small_westPedestrain2;
    ImageView stage16_small_westNone1;
    ImageView stage16_small_westNone2;
    List<GbtStagePattern> gbtStagePatterns;
    List<GbtTimePattern> gbtTimePatterns;
    List<GbtDirec> gbtDirecs;
    List<GbtPhase> gbtPhases;

    ImageView stage_northLeft;
    ImageView stage_northStraight;
    ImageView stage_northRight;
    ImageView stage_northOther;
    ImageView stage_northPedestrain1;
    ImageView stage_northPedestrain2;
    ImageView stage_west_turn_around;
    ImageView stage_west_left_straight_right;
    ImageView stage_eastOther;
    ImageView stage_eastRight;
    ImageView stage_eastStriaght;
    ImageView stage_eastLeft;
    ImageView stage_eastPedestrain1;
    ImageView stage_eastPedestrain2;
    ImageView stage_north_turn_around;
    ImageView stage_north_left_straight_right;
    ImageView stage_southLeft;
    ImageView stage_southStriaght;
    ImageView stage_southRight;
    ImageView stage_southOther;
    ImageView stage_southPedestrain1;
    ImageView stage_southPedestrain2;
    ImageView stage_east_turn_around;
    ImageView stage_east_left_straight_right;
    ImageView stage_westOther;
    ImageView stage_westRight;
    ImageView stage_westStriaght;
    ImageView stage_westLeft;
    ImageView stage_westPedestrain1;
    ImageView stage_westPedestrain2;
    ImageView stage_south_turn_around;
    ImageView stage_south_left_straight_right;
    private int selected_id = 1;
    private NumberPicker np_stage_pattern_id;

    /**
     * 阶段对象初始化为集合Views对象
     */
    List<View> views = new ArrayList<View>();
    private void initViews(){
        views.add(stage1);
        views.add(stage2);
        views.add(stage3);
        views.add(stage4);
        views.add(stage5);
        views.add(stage6);
        views.add(stage7);
        views.add(stage8);
        views.add(stage9);
        views.add(stage10);
        views.add(stage11);
        views.add(stage12);
        views.add(stage13);
        views.add(stage14);
        views.add(stage15);
        views.add(stage16);
    }

    /**
     * 将大图中的方向图片初始化为ImageViews集合对象
     */
    List<ImageView> imageViews = new ArrayList<ImageView>();
    private void initImageViews(){
        imageViews.add(stage_northLeft);
        imageViews.add(stage_northStraight);
        imageViews.add(stage_northRight);
        imageViews.add(stage_northOther);
        imageViews.add(stage_northPedestrain1);
        imageViews.add(stage_northPedestrain2);
        imageViews.add(stage_west_turn_around);
        imageViews.add(stage_west_left_straight_right);
        imageViews.add(stage_eastOther);
        imageViews.add(stage_eastRight);
        imageViews.add(stage_eastStriaght);
        imageViews.add(stage_eastLeft);
        imageViews.add(stage_eastPedestrain1);
        imageViews.add(stage_eastPedestrain2);
        imageViews.add(stage_north_turn_around);
        imageViews.add(stage_north_left_straight_right);
        imageViews.add(stage_southLeft);
        imageViews.add(stage_southStriaght);
        imageViews.add(stage_southRight);
        imageViews.add(stage_southOther);
        imageViews.add(stage_southPedestrain1);
        imageViews.add(stage_southPedestrain2);
        imageViews.add(stage_east_turn_around);
        imageViews.add(stage_east_left_straight_right);
        imageViews.add(stage_westOther);
        imageViews.add(stage_westRight);
        imageViews.add(stage_westStriaght);
        imageViews.add(stage_westLeft);
        imageViews.add(stage_westPedestrain1);
        imageViews.add(stage_westPedestrain2);
        imageViews.add(stage_south_turn_around);
        imageViews.add(stage_south_left_straight_right);

        imageViews.add(stage16_small_northLeft                   );
        imageViews.add(stage16_small_northStriaght               );
        imageViews.add(stage16_small_northRight                  );
        imageViews.add(stage16_small_northOther                  );
        imageViews.add(stage16_small_northPedestrain1            );
        imageViews.add(stage16_small_northPedestrain2            );
        imageViews.add(stage16_small_northNone1           );
        imageViews.add(stage16_small_northNone2   );
        imageViews.add(stage16_small_eastLeft                    );
        imageViews.add(stage16_small_eastStriaght                );
        imageViews.add(stage16_small_eastRight                   );
        imageViews.add(stage16_small_eastOther                   );
        imageViews.add(stage16_small_eastPedestrain1             );
        imageViews.add(stage16_small_eastPedestrain2             );
        imageViews.add(stage16_small_eastNone1            );
        imageViews.add(stage16_small_eastNone2    );
        imageViews.add(stage16_small_southLeft                   );
        imageViews.add(stage16_small_southStriaght               );
        imageViews.add(stage16_small_southRight                  );
        imageViews.add(stage16_small_southOther                  );
        imageViews.add(stage16_small_southPedestrain1            );
        imageViews.add(stage16_small_southPedestrain2            );
        imageViews.add(stage16_small_southNone1           );
        imageViews.add(stage16_small_southNone2   );
        imageViews.add(stage16_small_westLeft                    );
        imageViews.add(stage16_small_westStriaght                );
        imageViews.add(stage16_small_westRight                   );
        imageViews.add(stage16_small_westOther                   );
        imageViews.add(stage16_small_westPedestrain1             );
        imageViews.add(stage16_small_westPedestrain2             );
        imageViews.add(stage16_small_westNone1            );
        imageViews.add(stage16_small_westNone2    );

        imageViews.add(stage1_small_northLeft                );
        imageViews.add(stage1_small_northStriaght            );
        imageViews.add(stage1_small_northRight               );
        imageViews.add(stage1_small_northOther               );
        imageViews.add(stage1_small_northPedestrain1         );
        imageViews.add(stage1_small_northPedestrain2         );
        imageViews.add(stage1_small_northNone1        );
        imageViews.add(stage1_small_northNone2);
        imageViews.add(stage1_small_eastLeft                 );
        imageViews.add(stage1_small_eastStriaght             );
        imageViews.add(stage1_small_eastRight                );
        imageViews.add(stage1_small_eastOther                );
        imageViews.add(stage1_small_eastPedestrain1          );
        imageViews.add(stage1_small_eastPedestrain2          );
        imageViews.add(stage1_small_eastNone1         );
        imageViews.add(stage1_small_eastNone2 );
        imageViews.add(stage1_small_southLeft                );
        imageViews.add(stage1_small_southStriaght            );
        imageViews.add(stage1_small_southRight               );
        imageViews.add(stage1_small_southOther               );
        imageViews.add(stage1_small_southPedestrain1         );
        imageViews.add(stage1_small_southPedestrain2         );
        imageViews.add(stage1_small_southNone1        );
        imageViews.add(stage1_small_southNone2);
        imageViews.add(stage1_small_westLeft                 );
        imageViews.add(stage1_small_westStriaght             );
        imageViews.add(stage1_small_westRight                );
        imageViews.add(stage1_small_westOther                );
        imageViews.add(stage1_small_westPedestrain1          );
        imageViews.add(stage1_small_westPedestrain2          );
        imageViews.add(stage1_small_westNone1         );
        imageViews.add(stage1_small_westNone2 );

        imageViews.add(stage2_small_northLeft                );
        imageViews.add(stage2_small_northStriaght            );
        imageViews.add(stage2_small_northRight               );
        imageViews.add(stage2_small_northOther               );
        imageViews.add(stage2_small_northPedestrain1         );
        imageViews.add(stage2_small_northPedestrain2         );
        imageViews.add(stage2_small_northNone1        );
        imageViews.add(stage2_small_northNone2);
        imageViews.add(stage2_small_eastLeft                 );
        imageViews.add(stage2_small_eastStriaght             );
        imageViews.add(stage2_small_eastRight                );
        imageViews.add(stage2_small_eastOther                );
        imageViews.add(stage2_small_eastPedestrain1          );
        imageViews.add(stage2_small_eastPedestrain2          );
        imageViews.add(stage2_small_eastNone1         );
        imageViews.add(stage2_small_eastNone2 );
        imageViews.add(stage2_small_southLeft                );
        imageViews.add(stage2_small_southStriaght            );
        imageViews.add(stage2_small_southRight               );
        imageViews.add(stage2_small_southOther               );
        imageViews.add(stage2_small_southPedestrain1         );
        imageViews.add(stage2_small_southPedestrain2         );
        imageViews.add(stage2_small_southNone1        );
        imageViews.add(stage2_small_southNone2);
        imageViews.add(stage2_small_westLeft                 );
        imageViews.add(stage2_small_westStriaght             );
        imageViews.add(stage2_small_westRight                );
        imageViews.add(stage2_small_westOther                );
        imageViews.add(stage2_small_westPedestrain1          );
        imageViews.add(stage2_small_westPedestrain2          );
        imageViews.add(stage2_small_westNone1         );
        imageViews.add(stage2_small_westNone2 );

        imageViews.add(stage3_small_northLeft                );
        imageViews.add(stage3_small_northStriaght            );
        imageViews.add(stage3_small_northRight               );
        imageViews.add(stage3_small_northOther               );
        imageViews.add(stage3_small_northPedestrain1         );
        imageViews.add(stage3_small_northPedestrain2         );
        imageViews.add(stage3_small_northNone1        );
        imageViews.add(stage3_small_northNone2);
        imageViews.add(stage3_small_eastLeft                 );
        imageViews.add(stage3_small_eastStriaght             );
        imageViews.add(stage3_small_eastRight                );
        imageViews.add(stage3_small_eastOther                );
        imageViews.add(stage3_small_eastPedestrain1          );
        imageViews.add(stage3_small_eastPedestrain2          );
        imageViews.add(stage3_small_eastNone1         );
        imageViews.add(stage3_small_eastNone2 );
        imageViews.add(stage3_small_southLeft                );
        imageViews.add(stage3_small_southStriaght            );
        imageViews.add(stage3_small_southRight               );
        imageViews.add(stage3_small_southOther               );
        imageViews.add(stage3_small_southPedestrain1         );
        imageViews.add(stage3_small_southPedestrain2         );
        imageViews.add(stage3_small_southNone1        );
        imageViews.add(stage3_small_southNone2);
        imageViews.add(stage3_small_westLeft                 );
        imageViews.add(stage3_small_westStriaght             );
        imageViews.add(stage3_small_westRight                );
        imageViews.add(stage3_small_westOther                );
        imageViews.add(stage3_small_westPedestrain1          );
        imageViews.add(stage3_small_westPedestrain2          );
        imageViews.add(stage3_small_westNone1         );
        imageViews.add(stage3_small_westNone2 );

        imageViews.add(stage4_small_northLeft                );
        imageViews.add(stage4_small_northStriaght            );
        imageViews.add(stage4_small_northRight               );
        imageViews.add(stage4_small_northOther               );
        imageViews.add(stage4_small_northPedestrain1         );
        imageViews.add(stage4_small_northPedestrain2         );
        imageViews.add(stage4_small_northNone1        );
        imageViews.add(stage4_small_northNone2);
        imageViews.add(stage4_small_eastLeft                 );
        imageViews.add(stage4_small_eastStriaght             );
        imageViews.add(stage4_small_eastRight                );
        imageViews.add(stage4_small_eastOther                );
        imageViews.add(stage4_small_eastPedestrain1          );
        imageViews.add(stage4_small_eastPedestrain2          );
        imageViews.add(stage4_small_eastNone1         );
        imageViews.add(stage4_small_eastNone2 );
        imageViews.add(stage4_small_southLeft                );
        imageViews.add(stage4_small_southStriaght            );
        imageViews.add(stage4_small_southRight               );
        imageViews.add(stage4_small_southOther               );
        imageViews.add(stage4_small_southPedestrain1         );
        imageViews.add(stage4_small_southPedestrain2         );
        imageViews.add(stage4_small_southNone1        );
        imageViews.add(stage4_small_southNone2);
        imageViews.add(stage4_small_westLeft                 );
        imageViews.add(stage4_small_westStriaght             );
        imageViews.add(stage4_small_westRight                );
        imageViews.add(stage4_small_westOther                );
        imageViews.add(stage4_small_westPedestrain1          );
        imageViews.add(stage4_small_westPedestrain2          );
        imageViews.add(stage4_small_westNone1         );
        imageViews.add(stage4_small_westNone2 );

        imageViews.add(stage5_small_northLeft                );
        imageViews.add(stage5_small_northStriaght            );
        imageViews.add(stage5_small_northRight               );
        imageViews.add(stage5_small_northOther               );
        imageViews.add(stage5_small_northPedestrain1         );
        imageViews.add(stage5_small_northPedestrain2         );
        imageViews.add(stage5_small_northNone1        );
        imageViews.add(stage5_small_northNone2);
        imageViews.add(stage5_small_eastLeft                 );
        imageViews.add(stage5_small_eastStriaght             );
        imageViews.add(stage5_small_eastRight                );
        imageViews.add(stage5_small_eastOther                );
        imageViews.add(stage5_small_eastPedestrain1          );
        imageViews.add(stage5_small_eastPedestrain2          );
        imageViews.add(stage5_small_eastNone1         );
        imageViews.add(stage5_small_eastNone2 );
        imageViews.add(stage5_small_southLeft                );
        imageViews.add(stage5_small_southStriaght            );
        imageViews.add(stage5_small_southRight               );
        imageViews.add(stage5_small_southOther               );
        imageViews.add(stage5_small_southPedestrain1         );
        imageViews.add(stage5_small_southPedestrain2         );
        imageViews.add(stage5_small_southNone1        );
        imageViews.add(stage5_small_southNone2);
        imageViews.add(stage5_small_westLeft                 );
        imageViews.add(stage5_small_westStriaght             );
        imageViews.add(stage5_small_westRight                );
        imageViews.add(stage5_small_westOther                );
        imageViews.add(stage5_small_westPedestrain1          );
        imageViews.add(stage5_small_westPedestrain2          );
        imageViews.add(stage5_small_westNone1         );
        imageViews.add(stage5_small_westNone2 );

        imageViews.add(stage6_small_northLeft                );
        imageViews.add(stage6_small_northStriaght            );
        imageViews.add(stage6_small_northRight               );
        imageViews.add(stage6_small_northOther               );
        imageViews.add(stage6_small_northPedestrain1         );
        imageViews.add(stage6_small_northPedestrain2         );
        imageViews.add(stage6_small_northNone1        );
        imageViews.add(stage6_small_northNone2);
        imageViews.add(stage6_small_eastLeft                 );
        imageViews.add(stage6_small_eastStriaght             );
        imageViews.add(stage6_small_eastRight                );
        imageViews.add(stage6_small_eastOther                );
        imageViews.add(stage6_small_eastPedestrain1          );
        imageViews.add(stage6_small_eastPedestrain2          );
        imageViews.add(stage6_small_eastNone1         );
        imageViews.add(stage6_small_eastNone2 );
        imageViews.add(stage6_small_southLeft                );
        imageViews.add(stage6_small_southStriaght            );
        imageViews.add(stage6_small_southRight               );
        imageViews.add(stage6_small_southOther               );
        imageViews.add(stage6_small_southPedestrain1         );
        imageViews.add(stage6_small_southPedestrain2         );
        imageViews.add(stage6_small_southNone1        );
        imageViews.add(stage6_small_southNone2);
        imageViews.add(stage6_small_westLeft                 );
        imageViews.add(stage6_small_westStriaght             );
        imageViews.add(stage6_small_westRight                );
        imageViews.add(stage6_small_westOther                );
        imageViews.add(stage6_small_westPedestrain1          );
        imageViews.add(stage6_small_westPedestrain2          );
        imageViews.add(stage6_small_westNone1         );
        imageViews.add(stage6_small_westNone2 );

        imageViews.add(stage7_small_northLeft                );
        imageViews.add(stage7_small_northStriaght            );
        imageViews.add(stage7_small_northRight               );
        imageViews.add(stage7_small_northOther               );
        imageViews.add(stage7_small_northPedestrain1         );
        imageViews.add(stage7_small_northPedestrain2         );
        imageViews.add(stage7_small_northNone1        );
        imageViews.add(stage7_small_northNone2);
        imageViews.add(stage7_small_eastLeft                 );
        imageViews.add(stage7_small_eastStriaght             );
        imageViews.add(stage7_small_eastRight                );
        imageViews.add(stage7_small_eastOther                );
        imageViews.add(stage7_small_eastPedestrain1          );
        imageViews.add(stage7_small_eastPedestrain2          );
        imageViews.add(stage7_small_eastNone1         );
        imageViews.add(stage7_small_eastNone2 );
        imageViews.add(stage7_small_southLeft                );
        imageViews.add(stage7_small_southStriaght            );
        imageViews.add(stage7_small_southRight               );
        imageViews.add(stage7_small_southOther               );
        imageViews.add(stage7_small_southPedestrain1         );
        imageViews.add(stage7_small_southPedestrain2         );
        imageViews.add(stage7_small_southNone1        );
        imageViews.add(stage7_small_southNone2);
        imageViews.add(stage7_small_westLeft                 );
        imageViews.add(stage7_small_westStriaght             );
        imageViews.add(stage7_small_westRight                );
        imageViews.add(stage7_small_westOther                );
        imageViews.add(stage7_small_westPedestrain1          );
        imageViews.add(stage7_small_westPedestrain2          );
        imageViews.add(stage7_small_westNone1         );
        imageViews.add(stage7_small_westNone2 );

        imageViews.add(stage8_small_northLeft                );
        imageViews.add(stage8_small_northStriaght            );
        imageViews.add(stage8_small_northRight               );
        imageViews.add(stage8_small_northOther               );
        imageViews.add(stage8_small_northPedestrain1         );
        imageViews.add(stage8_small_northPedestrain2         );
        imageViews.add(stage8_small_northNone1        );
        imageViews.add(stage8_small_northNone2);
        imageViews.add(stage8_small_eastLeft                 );
        imageViews.add(stage8_small_eastStriaght             );
        imageViews.add(stage8_small_eastRight                );
        imageViews.add(stage8_small_eastOther                );
        imageViews.add(stage8_small_eastPedestrain1          );
        imageViews.add(stage8_small_eastPedestrain2          );
        imageViews.add(stage8_small_eastNone1         );
        imageViews.add(stage8_small_eastNone2 );
        imageViews.add(stage8_small_southLeft                );
        imageViews.add(stage8_small_southStriaght            );
        imageViews.add(stage8_small_southRight               );
        imageViews.add(stage8_small_southOther               );
        imageViews.add(stage8_small_southPedestrain1         );
        imageViews.add(stage8_small_southPedestrain2         );
        imageViews.add(stage8_small_southNone1        );
        imageViews.add(stage8_small_southNone2);
        imageViews.add(stage8_small_westLeft                 );
        imageViews.add(stage8_small_westStriaght             );
        imageViews.add(stage8_small_westRight                );
        imageViews.add(stage8_small_westOther                );
        imageViews.add(stage8_small_westPedestrain1          );
        imageViews.add(stage8_small_westPedestrain2          );
        imageViews.add(stage8_small_westNone1         );
        imageViews.add(stage8_small_westNone2 );

        imageViews.add(stage9_small_northLeft                );
        imageViews.add(stage9_small_northStriaght            );
        imageViews.add(stage9_small_northRight               );
        imageViews.add(stage9_small_northOther               );
        imageViews.add(stage9_small_northPedestrain1         );
        imageViews.add(stage9_small_northPedestrain2         );
        imageViews.add(stage9_small_northNone1        );
        imageViews.add(stage9_small_northNone2);
        imageViews.add(stage9_small_eastLeft                 );
        imageViews.add(stage9_small_eastStriaght             );
        imageViews.add(stage9_small_eastRight                );
        imageViews.add(stage9_small_eastOther                );
        imageViews.add(stage9_small_eastPedestrain1          );
        imageViews.add(stage9_small_eastPedestrain2          );
        imageViews.add(stage9_small_eastNone1         );
        imageViews.add(stage9_small_eastNone2 );
        imageViews.add(stage9_small_southLeft                );
        imageViews.add(stage9_small_southStriaght            );
        imageViews.add(stage9_small_southRight               );
        imageViews.add(stage9_small_southOther               );
        imageViews.add(stage9_small_southPedestrain1         );
        imageViews.add(stage9_small_southPedestrain2         );
        imageViews.add(stage9_small_southNone1        );
        imageViews.add(stage9_small_southNone2);
        imageViews.add(stage9_small_westLeft                 );
        imageViews.add(stage9_small_westStriaght             );
        imageViews.add(stage9_small_westRight                );
        imageViews.add(stage9_small_westOther                );
        imageViews.add(stage9_small_westPedestrain1          );
        imageViews.add(stage9_small_westPedestrain2          );
        imageViews.add(stage9_small_westNone1         );
        imageViews.add(stage9_small_westNone2 );

        imageViews.add(stage10_small_northLeft               );
        imageViews.add(stage10_small_northStriaght           );
        imageViews.add(stage10_small_northRight              );
        imageViews.add(stage10_small_northOther              );
        imageViews.add(stage10_small_northPedestrain1        );
        imageViews.add(stage10_small_northPedestrain2        );
        imageViews.add(stage10_small_northNone1       );
        imageViews.add(stage10_small_northNone2);
        imageViews.add(stage10_small_eastLeft                );
        imageViews.add(stage10_small_eastStriaght            );
        imageViews.add(stage10_small_eastRight               );
        imageViews.add(stage10_small_eastOther               );
        imageViews.add(stage10_small_eastPedestrain1         );
        imageViews.add(stage10_small_eastPedestrain2         );
        imageViews.add(stage10_small_eastNone1        );
        imageViews.add(stage10_small_eastNone2);
        imageViews.add(stage10_small_southLeft               );
        imageViews.add(stage10_small_southStriaght           );
        imageViews.add(stage10_small_southRight              );
        imageViews.add(stage10_small_southOther              );
        imageViews.add(stage10_small_southPedestrain1        );
        imageViews.add(stage10_small_southPedestrain2        );
        imageViews.add(stage10_small_southNone1       );
        imageViews.add(stage10_small_southNone2);
        imageViews.add(stage10_small_westLeft                );
        imageViews.add(stage10_small_westStriaght            );
        imageViews.add(stage10_small_westRight               );
        imageViews.add(stage10_small_westOther               );
        imageViews.add(stage10_small_westPedestrain1         );
        imageViews.add(stage10_small_westPedestrain2         );
        imageViews.add(stage10_small_westNone1        );
        imageViews.add(stage10_small_westNone2);

        imageViews.add(stage11_small_northLeft               );
        imageViews.add(stage11_small_northStriaght           );
        imageViews.add(stage11_small_northRight              );
        imageViews.add(stage11_small_northOther              );
        imageViews.add(stage11_small_northPedestrain1        );
        imageViews.add(stage11_small_northPedestrain2        );
        imageViews.add(stage11_small_northNone1       );
        imageViews.add(stage11_small_northNone2);
        imageViews.add(stage11_small_eastLeft                );
        imageViews.add(stage11_small_eastStriaght            );
        imageViews.add(stage11_small_eastRight               );
        imageViews.add(stage11_small_eastOther               );
        imageViews.add(stage11_small_eastPedestrain1         );
        imageViews.add(stage11_small_eastPedestrain2         );
        imageViews.add(stage11_small_eastNone1        );
        imageViews.add(stage11_small_eastNone2);
        imageViews.add(stage11_small_southLeft               );
        imageViews.add(stage11_small_southStriaght           );
        imageViews.add(stage11_small_southRight              );
        imageViews.add(stage11_small_southOther              );
        imageViews.add(stage11_small_southPedestrain1        );
        imageViews.add(stage11_small_southPedestrain2        );
        imageViews.add(stage11_small_southNone1       );
        imageViews.add(stage11_small_southNone2);
        imageViews.add(stage11_small_westLeft                );
        imageViews.add(stage11_small_westStriaght            );
        imageViews.add(stage11_small_westRight               );
        imageViews.add(stage11_small_westOther               );
        imageViews.add(stage11_small_westPedestrain1         );
        imageViews.add(stage11_small_westPedestrain2         );
        imageViews.add(stage11_small_westNone1        );
        imageViews.add(stage11_small_westNone2);

        imageViews.add(stage12_small_northLeft               );
        imageViews.add(stage12_small_northStriaght           );
        imageViews.add(stage12_small_northRight              );
        imageViews.add(stage12_small_northOther              );
        imageViews.add(stage12_small_northPedestrain1        );
        imageViews.add(stage12_small_northPedestrain2        );
        imageViews.add(stage12_small_northNone1       );
        imageViews.add(stage12_small_northNone2);
        imageViews.add(stage12_small_eastLeft                );
        imageViews.add(stage12_small_eastStriaght            );
        imageViews.add(stage12_small_eastRight               );
        imageViews.add(stage12_small_eastOther               );
        imageViews.add(stage12_small_eastPedestrain1         );
        imageViews.add(stage12_small_eastPedestrain2         );
        imageViews.add(stage12_small_eastNone1        );
        imageViews.add(stage12_small_eastNone2);
        imageViews.add(stage12_small_southLeft               );
        imageViews.add(stage12_small_southStriaght           );
        imageViews.add(stage12_small_southRight              );
        imageViews.add(stage12_small_southOther              );
        imageViews.add(stage12_small_southPedestrain1        );
        imageViews.add(stage12_small_southPedestrain2        );
        imageViews.add(stage12_small_southNone1       );
        imageViews.add(stage12_small_southNone2);
        imageViews.add(stage12_small_westLeft                );
        imageViews.add(stage12_small_westStriaght            );
        imageViews.add(stage12_small_westRight               );
        imageViews.add(stage12_small_westOther               );
        imageViews.add(stage12_small_westPedestrain1         );
        imageViews.add(stage12_small_westPedestrain2         );
        imageViews.add(stage12_small_westNone1        );
        imageViews.add(stage12_small_westNone2);

        imageViews.add(stage13_small_northLeft               );
        imageViews.add(stage13_small_northStriaght           );
        imageViews.add(stage13_small_northRight              );
        imageViews.add(stage13_small_northOther              );
        imageViews.add(stage13_small_northPedestrain1        );
        imageViews.add(stage13_small_northPedestrain2        );
        imageViews.add(stage13_small_northNone1       );
        imageViews.add(stage13_small_northNone2);
        imageViews.add(stage13_small_eastLeft                );
        imageViews.add(stage13_small_eastStriaght            );
        imageViews.add(stage13_small_eastRight               );
        imageViews.add(stage13_small_eastOther               );
        imageViews.add(stage13_small_eastPedestrain1         );
        imageViews.add(stage13_small_eastPedestrain2         );
        imageViews.add(stage13_small_eastNone1        );
        imageViews.add(stage13_small_eastNone2);
        imageViews.add(stage13_small_southLeft               );
        imageViews.add(stage13_small_southStriaght           );
        imageViews.add(stage13_small_southRight              );
        imageViews.add(stage13_small_southOther              );
        imageViews.add(stage13_small_southPedestrain1        );
        imageViews.add(stage13_small_southPedestrain2        );
        imageViews.add(stage13_small_southNone1       );
        imageViews.add(stage13_small_southNone2);
        imageViews.add(stage13_small_westLeft                );
        imageViews.add(stage13_small_westStriaght            );
        imageViews.add(stage13_small_westRight               );
        imageViews.add(stage13_small_westOther               );
        imageViews.add(stage13_small_westPedestrain1         );
        imageViews.add(stage13_small_westPedestrain2         );
        imageViews.add(stage13_small_westNone1        );
        imageViews.add(stage13_small_westNone2);

        imageViews.add(stage14_small_northLeft               );
        imageViews.add(stage14_small_northStriaght           );
        imageViews.add(stage14_small_northRight              );
        imageViews.add(stage14_small_northOther              );
        imageViews.add(stage14_small_northPedestrain1        );
        imageViews.add(stage14_small_northPedestrain2        );
        imageViews.add(stage14_small_northNone1       );
        imageViews.add(stage14_small_northNone2);
        imageViews.add(stage14_small_eastLeft                );
        imageViews.add(stage14_small_eastStriaght            );
        imageViews.add(stage14_small_eastRight               );
        imageViews.add(stage14_small_eastOther               );
        imageViews.add(stage14_small_eastPedestrain1         );
        imageViews.add(stage14_small_eastPedestrain2         );
        imageViews.add(stage14_small_eastNone1        );
        imageViews.add(stage14_small_eastNone2);
        imageViews.add(stage14_small_southLeft               );
        imageViews.add(stage14_small_southStriaght           );
        imageViews.add(stage14_small_southRight              );
        imageViews.add(stage14_small_southOther              );
        imageViews.add(stage14_small_southPedestrain1        );
        imageViews.add(stage14_small_southPedestrain2        );
        imageViews.add(stage14_small_southNone1       );
        imageViews.add(stage14_small_southNone2);
        imageViews.add(stage14_small_westLeft                );
        imageViews.add(stage14_small_westStriaght            );
        imageViews.add(stage14_small_westRight               );
        imageViews.add(stage14_small_westOther               );
        imageViews.add(stage14_small_westPedestrain1         );
        imageViews.add(stage14_small_westPedestrain2         );
        imageViews.add(stage14_small_westNone1        );
        imageViews.add(stage14_small_westNone2);

        imageViews.add(stage15_small_northLeft               );
        imageViews.add(stage15_small_northStriaght           );
        imageViews.add(stage15_small_northRight              );
        imageViews.add(stage15_small_northOther              );
        imageViews.add(stage15_small_northPedestrain1        );
        imageViews.add(stage15_small_northPedestrain2        );
        imageViews.add(stage15_small_northNone1       );
        imageViews.add(stage15_small_northNone2);
        imageViews.add(stage15_small_eastLeft                );
        imageViews.add(stage15_small_eastStriaght            );
        imageViews.add(stage15_small_eastRight               );
        imageViews.add(stage15_small_eastOther               );
        imageViews.add(stage15_small_eastPedestrain1         );
        imageViews.add(stage15_small_eastPedestrain2         );
        imageViews.add(stage15_small_eastNone1        );
        imageViews.add(stage15_small_eastNone2);
        imageViews.add(stage15_small_southLeft               );
        imageViews.add(stage15_small_southStriaght           );
        imageViews.add(stage15_small_southRight              );
        imageViews.add(stage15_small_southOther              );
        imageViews.add(stage15_small_southPedestrain1        );
        imageViews.add(stage15_small_southPedestrain2        );
        imageViews.add(stage15_small_southNone1       );
        imageViews.add(stage15_small_southNone2);
        imageViews.add(stage15_small_westLeft                );
        imageViews.add(stage15_small_westStriaght            );
        imageViews.add(stage15_small_westRight               );
        imageViews.add(stage15_small_westOther               );
        imageViews.add(stage15_small_westPedestrain1         );
        imageViews.add(stage15_small_westPedestrain2         );
        imageViews.add(stage15_small_westNone1        );
        imageViews.add(stage15_small_westNone2);
    }

    /**
     * 显示小图的所有阶段
     * @param gbtStagePattern
     */
    private void displayStageView(GbtStagePattern gbtStagePattern){
        switch(gbtStagePattern.getStageId()){
            case 1:
                stage1.setVisibility(View.VISIBLE);
                TextView tv_stageId1 = (TextView)stage1.findViewById(R.id.tv_stageId);
                tv_stageId1.setText("1");
                break;
            case 2:
                stage2.setVisibility(View.VISIBLE);
                TextView tv_stageId2 = (TextView)stage2.findViewById(R.id.tv_stageId);
                tv_stageId2.setText("2");
                break;
            case 3:
                stage3.setVisibility(View.VISIBLE);
                TextView tv_stageId3 = (TextView)stage3.findViewById(R.id.tv_stageId);
                tv_stageId3.setText("3");
                break;
            case 4:
                stage4.setVisibility(View.VISIBLE);
                TextView tv_stageId4 = (TextView)stage4.findViewById(R.id.tv_stageId);
                tv_stageId4.setText("4");
                break;
            case 5:
                stage5.setVisibility(View.VISIBLE);
                TextView tv_stageId5 = (TextView)stage5.findViewById(R.id.tv_stageId);
                tv_stageId5.setText("5");
                break;
            case 6:
                stage6.setVisibility(View.VISIBLE);
                TextView tv_stageId6 = (TextView)stage6.findViewById(R.id.tv_stageId);
                tv_stageId6.setText("6");
                break;
            case 7:
                stage7.setVisibility(View.VISIBLE);
                TextView tv_stageId7 = (TextView)stage7.findViewById(R.id.tv_stageId);
                tv_stageId7.setText("7");
                break;
            case 8:
                stage8.setVisibility(View.VISIBLE);
                TextView tv_stageId8 = (TextView)stage8.findViewById(R.id.tv_stageId);
                tv_stageId8.setText("8");
                break;
            case 9:
                stage9.setVisibility(View.VISIBLE);
                TextView tv_stageId9 = (TextView)stage9.findViewById(R.id.tv_stageId);
                tv_stageId9.setText("9");
                break;
            case 10:
                stage10.setVisibility(View.VISIBLE);
                TextView tv_stageId10 = (TextView)stage10.findViewById(R.id.tv_stageId);
                tv_stageId10.setText("10");
                break;
            case 11:
                stage11.setVisibility(View.VISIBLE);
                TextView tv_stageId11 = (TextView)stage11.findViewById(R.id.tv_stageId);
                tv_stageId11.setText("11");
                break;
            case 12:
                stage12.setVisibility(View.VISIBLE);
                TextView tv_stageId12 = (TextView)stage12.findViewById(R.id.tv_stageId);
                tv_stageId12.setText("12");
                break;
            case 13:
                stage13.setVisibility(View.VISIBLE);
                TextView tv_stageId13 = (TextView)stage13.findViewById(R.id.tv_stageId);
                tv_stageId13.setText("13");
                break;
            case 14:
                stage14.setVisibility(View.VISIBLE);
                TextView tv_stageId14 = (TextView)stage14.findViewById(R.id.tv_stageId);
                tv_stageId14.setText("14");
                break;
            case 15:
                stage15.setVisibility(View.VISIBLE);
                TextView tv_stageId15 = (TextView)stage15.findViewById(R.id.tv_stageId);
                tv_stageId15.setText("15");
                break;
            case 16:
                stage16.setVisibility(View.VISIBLE);
                TextView tv_stageId16 = (TextView)stage16.findViewById(R.id.tv_stageId);
                tv_stageId16.setText("16");
                break;
            default:

        }
    }

    /**
     * 将所有大图上的方向重置为红灯
     */
    private void resetBigMapRed(){
         stage_northLeft.setImageResource(R.drawable.redone);
         stage_northStraight.setImageResource(R.drawable.redone);
         stage_northRight.setImageResource(R.drawable.redone);
         stage_northOther.setImageResource(R.drawable.redone);
         stage_northPedestrain1.setImageResource(R.drawable.redone);
         stage_northPedestrain2.setImageResource(R.drawable.redone);
         stage_west_turn_around.setImageResource(R.drawable.redone);
         stage_west_left_straight_right.setImageResource(R.drawable.redone);
         stage_eastOther.setImageResource(R.drawable.redone);
         stage_eastRight.setImageResource(R.drawable.redone);
         stage_eastStriaght.setImageResource(R.drawable.redone);
         stage_eastLeft.setImageResource(R.drawable.redone);
         stage_eastPedestrain1.setImageResource(R.drawable.redone);
         stage_eastPedestrain2.setImageResource(R.drawable.redone);
         stage_north_turn_around.setImageResource(R.drawable.redone);
         stage_north_left_straight_right.setImageResource(R.drawable.redone);
         stage_southLeft.setImageResource(R.drawable.redone);
         stage_southStriaght.setImageResource(R.drawable.redone);
         stage_southRight.setImageResource(R.drawable.redone);
         stage_southOther.setImageResource(R.drawable.redone);
         stage_southPedestrain1.setImageResource(R.drawable.redone);
         stage_southPedestrain2.setImageResource(R.drawable.redone);
         stage_east_turn_around.setImageResource(R.drawable.redone);
         stage_east_left_straight_right.setImageResource(R.drawable.redone);
         stage_westOther.setImageResource(R.drawable.redone);
         stage_westRight.setImageResource(R.drawable.redone);
         stage_westStriaght.setImageResource(R.drawable.redone);
         stage_westLeft.setImageResource(R.drawable.redone);
         stage_westPedestrain1.setImageResource(R.drawable.redone);
         stage_westPedestrain2.setImageResource(R.drawable.redone);
         stage_south_turn_around.setImageResource(R.drawable.redone);
        stage_south_left_straight_right.setImageResource(R.drawable.redone);
    }

    /**
     * 将所有方向重置为红灯
     */
    private void resetAllRed(){
        Iterator<ImageView> imageViewIterator = imageViews.iterator();
        while(imageViewIterator.hasNext()){
            imageViewIterator.next().setImageResource(R.drawable.redone);
        }
    }

    /**
     * 设置单个方向的绿灯
     * @param imageView
     */
    private void setGreenOne(ImageView imageView){
        imageView.setImageResource(R.drawable.greenone);
    }

    /**
     * 显示小图上的绿灯放行
     * @param gbtDirec
     * @param gbtStagePattern
     */
    private void setSmallGreenOne(GbtDirec gbtDirec,GbtStagePattern gbtStagePattern){
        if(gbtStagePattern.getStageId() ==1) {
            if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT) {
                setGreenOne(stage1_small_northLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT) {
                setGreenOne(stage1_small_northStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT) {
                setGreenOne(stage1_small_northRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER) {
                setGreenOne(stage1_small_northOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE) {
                setGreenOne(stage1_small_northPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO) {
                setGreenOne(stage1_small_northPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1) {
                setGreenOne(stage1_small_northNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2) {
                setGreenOne(stage1_small_northNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT) {
                setGreenOne(stage1_small_eastLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT) {
                setGreenOne(stage1_small_eastStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT) {
                setGreenOne(stage1_small_eastRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER) {
                setGreenOne(stage1_small_eastOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE) {
                setGreenOne(stage1_small_eastPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO) {
                setGreenOne(stage1_small_eastPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1) {
                setGreenOne(stage1_small_eastNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2) {
                setGreenOne(stage1_small_eastNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT) {
                setGreenOne(stage1_small_southLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT) {
                setGreenOne(stage1_small_southStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT) {
                setGreenOne(stage1_small_southRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER) {
                setGreenOne(stage1_small_southOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE) {
                setGreenOne(stage1_small_southPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO) {
                setGreenOne(stage1_small_southPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1) {
                setGreenOne(stage1_small_southNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2) {
                setGreenOne(stage1_small_southNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT) {
                setGreenOne(stage1_small_westLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT) {
                setGreenOne(stage1_small_westStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT) {
                setGreenOne(stage1_small_westRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE) {
                setGreenOne(stage1_small_westPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO) {
                setGreenOne(stage1_small_westPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1) {
                setGreenOne(stage1_small_westNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(stage1_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==2) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(stage2_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(stage2_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(stage2_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(stage2_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(stage2_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(stage2_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(stage2_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(stage2_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(stage2_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(stage2_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(stage2_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(stage2_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(stage2_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(stage2_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(stage2_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(stage2_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(stage2_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(stage2_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(stage2_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(stage2_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(stage2_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(stage2_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(stage2_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(stage2_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(stage2_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(stage2_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(stage2_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(stage2_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(stage2_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(stage2_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(stage2_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==3) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(stage3_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(stage3_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(stage3_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(stage3_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(stage3_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(stage3_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(stage3_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(stage3_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(stage3_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(stage3_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(stage3_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(stage3_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(stage3_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(stage3_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(stage3_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(stage3_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(stage3_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(stage3_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(stage3_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(stage3_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(stage3_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(stage3_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(stage3_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(stage3_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(stage3_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(stage3_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(stage3_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(stage3_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(stage3_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(stage3_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(stage3_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==4) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(stage4_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(stage4_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(stage4_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(stage4_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(stage4_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(stage4_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(stage4_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(stage4_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(stage4_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(stage4_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(stage4_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(stage4_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(stage4_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(stage4_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(stage4_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(stage4_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(stage4_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(stage4_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(stage4_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(stage4_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(stage4_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(stage4_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(stage4_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(stage4_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(stage4_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(stage4_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(stage4_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(stage4_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(stage4_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(stage4_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(stage4_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==5) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(stage5_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(stage5_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(stage5_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(stage5_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(stage5_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(stage5_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(stage5_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(stage5_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(stage5_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(stage5_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(stage5_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(stage5_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(stage5_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(stage5_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(stage5_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(stage5_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(stage5_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(stage5_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(stage5_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(stage5_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(stage5_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(stage5_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(stage5_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(stage5_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(stage5_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(stage5_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(stage5_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(stage5_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(stage5_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(stage5_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(stage5_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==6) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(stage6_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(stage6_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(stage6_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(stage6_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(stage6_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(stage6_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(stage6_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(stage6_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(stage6_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(stage6_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(stage6_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(stage6_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(stage6_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(stage6_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(stage6_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(stage6_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(stage6_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(stage6_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(stage6_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(stage6_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(stage6_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(stage6_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(stage6_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(stage6_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(stage6_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(stage6_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(stage6_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(stage6_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(stage6_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(stage6_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(stage6_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==7) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(stage7_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(stage7_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(stage7_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(stage7_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(stage7_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(stage7_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(stage7_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(stage7_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(stage7_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(stage7_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(stage7_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(stage7_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(stage7_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(stage7_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(stage7_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(stage7_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(stage7_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(stage7_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(stage7_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(stage7_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(stage7_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(stage7_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(stage7_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(stage7_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(stage7_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(stage7_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(stage7_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(stage7_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(stage7_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(stage7_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(stage7_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==8) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(stage8_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(stage8_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(stage8_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(stage8_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(stage8_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(stage8_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(stage8_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(stage8_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(stage8_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(stage8_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(stage8_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(stage8_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(stage8_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(stage8_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(stage8_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(stage8_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(stage8_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(stage8_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(stage8_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(stage8_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(stage8_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(stage8_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(stage8_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(stage8_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(stage8_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(stage8_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(stage8_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(stage8_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(stage8_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(stage8_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(stage8_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==9) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(stage9_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(stage9_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(stage9_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(stage9_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(stage9_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(stage9_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(stage9_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(stage9_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(stage9_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(stage9_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(stage9_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(stage9_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(stage9_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(stage9_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(stage9_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(stage9_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(stage9_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(stage9_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(stage9_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(stage9_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(stage9_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(stage9_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(stage9_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(stage9_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(stage9_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(stage9_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(stage9_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(stage9_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(stage9_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(stage9_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(stage9_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==10) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(stage10_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(stage10_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(stage10_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(stage10_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(stage10_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(stage10_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(stage10_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(stage10_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(stage10_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(stage10_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(stage10_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(stage10_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(stage10_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(stage10_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(stage10_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(stage10_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(stage10_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(stage10_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(stage10_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(stage10_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(stage10_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(stage10_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(stage10_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(stage10_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(stage10_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(stage10_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(stage10_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(stage10_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(stage10_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(stage10_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(stage10_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==11) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(stage11_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(stage11_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(stage11_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(stage11_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(stage11_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(stage11_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(stage11_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(stage11_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(stage11_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(stage11_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(stage11_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(stage11_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(stage11_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(stage11_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(stage11_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(stage11_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(stage11_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(stage11_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(stage11_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(stage11_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(stage11_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(stage11_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(stage11_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(stage11_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(stage11_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(stage11_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(stage11_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(stage11_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(stage11_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(stage11_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(stage11_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==12) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(stage12_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(stage12_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(stage12_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(stage12_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(stage12_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(stage12_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(stage12_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(stage12_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(stage12_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(stage12_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(stage12_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(stage12_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(stage12_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(stage12_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(stage12_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(stage12_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(stage12_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(stage12_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(stage12_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(stage12_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(stage12_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(stage12_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(stage12_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(stage12_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(stage12_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(stage12_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(stage12_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(stage12_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(stage12_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(stage12_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(stage12_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==13) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(stage13_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(stage13_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(stage13_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(stage13_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(stage13_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(stage13_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(stage13_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(stage13_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(stage13_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(stage13_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(stage13_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(stage13_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(stage13_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(stage13_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(stage13_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(stage13_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(stage13_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(stage13_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(stage13_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(stage13_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(stage13_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(stage13_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(stage13_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(stage13_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(stage13_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(stage13_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(stage13_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(stage13_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(stage13_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(stage13_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(stage13_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==14) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(stage14_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(stage14_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(stage14_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(stage14_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(stage14_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(stage14_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(stage14_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(stage14_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(stage14_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(stage14_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(stage14_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(stage14_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(stage14_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(stage14_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(stage14_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(stage14_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(stage14_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(stage14_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(stage14_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(stage14_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(stage14_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(stage14_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(stage14_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(stage14_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(stage14_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(stage14_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(stage14_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(stage14_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(stage14_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(stage14_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(stage14_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==15) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(stage15_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(stage15_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(stage15_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(stage15_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(stage15_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(stage15_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(stage15_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(stage15_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(stage15_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(stage15_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(stage15_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(stage15_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(stage15_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(stage15_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(stage15_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(stage15_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(stage15_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(stage15_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(stage15_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(stage15_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(stage15_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(stage15_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(stage15_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(stage15_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(stage15_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(stage15_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(stage15_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(stage15_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(stage15_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(stage15_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(stage15_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==16) {
            if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT) {
                setGreenOne(stage16_small_northLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT) {
                setGreenOne(stage16_small_northStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT) {
                setGreenOne(stage16_small_northRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER) {
                setGreenOne(stage16_small_northOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE) {
                setGreenOne(stage16_small_northPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO) {
                setGreenOne(stage16_small_northPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1) {
                setGreenOne(stage16_small_northNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2) {
                setGreenOne(stage16_small_northNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT) {
                setGreenOne(stage16_small_eastLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT) {
                setGreenOne(stage16_small_eastStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT) {
                setGreenOne(stage16_small_eastRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER) {
                setGreenOne(stage16_small_eastOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE) {
                setGreenOne(stage16_small_eastPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO) {
                setGreenOne(stage16_small_eastPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1) {
                setGreenOne(stage16_small_eastNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2) {
                setGreenOne(stage16_small_eastNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT) {
                setGreenOne(stage16_small_southLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT) {
                setGreenOne(stage16_small_southStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT) {
                setGreenOne(stage16_small_southRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER) {
                setGreenOne(stage16_small_southOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE) {
                setGreenOne(stage16_small_southPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO) {
                setGreenOne(stage16_small_southPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1) {
                setGreenOne(stage16_small_southNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2) {
                setGreenOne(stage16_small_southNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT) {
                setGreenOne(stage16_small_westLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT) {
                setGreenOne(stage16_small_westStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT) {
                setGreenOne(stage16_small_westRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE) {
                setGreenOne(stage16_small_westPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO) {
                setGreenOne(stage16_small_westPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1) {
                setGreenOne(stage16_small_westNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(stage16_small_westNone2);
            }
        }
    }

    /**
     * * 根据阶段配时表与方向表，显示所有阶段小图上的绿灯。其它都为红灯。
     * @param gbtStagePattern
     * @param gbtDirecs
     */
    private void displayGreen2Small(GbtStagePattern gbtStagePattern,List<GbtDirec> gbtDirecs){
        int ap = gbtStagePattern.getAllowPhase();
        Iterator<GbtDirec> gbtDirecIterator = gbtDirecs.iterator();
        for (int i = 0; i < 32; i++)
        {
            if (((ap >> i) & 0x01) == 0x01)
            {
                while (gbtDirecIterator.hasNext())
                {
                    GbtDirec gbtDirec = gbtDirecIterator.next();
                    if (gbtDirec.getPhaseId() != 0)
                    {
                        if (gbtDirec.getPhaseId() == (i + 1))
                        {
                            //小图上显示绿灯
                            setSmallGreenOne(gbtDirec, gbtStagePattern);
                            //Define.NORTH_LEFT
                        }
                    }
                }
            }
        }
    }

    /**
     * 隐藏所有方向图标
     */
    private void hiddenImageViews(){
        Iterator<ImageView> imageViewIterator = imageViews.iterator();
        while(imageViewIterator.hasNext()){
            imageViewIterator.next().setVisibility(View.INVISIBLE);
        }

    }

    /**
     * 隐藏所有阶段小图
     */
    private void hiddenViews(){
        Iterator<View> viewIterator = views.iterator();
        while(viewIterator.hasNext()){
            viewIterator.next().setVisibility(View.INVISIBLE );
        }
    }

    /**
     * 根据方向表数据，对方向上的图片进行显示或隐藏
     */
    private void displayOrHidden(){
        Iterator<GbtDirec> gbtDirecIterator = gbtDirecs.iterator();
        while(gbtDirecIterator.hasNext()){
            GbtDirec gbtDirec = gbtDirecIterator.next();
            if(gbtDirec.getOverlapId() !=0 || gbtDirec.getPhaseId() !=0){
                displayImageView(gbtDirec);
            }else{
                hiddenImageView(gbtDirec);
            }
        }
    }

    /**
     * 根据方向数据，显示大图上的绿灯
     * @param gbtDirec
     */
    private void setBigGreenOne(GbtDirec gbtDirec){
        if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
            setGreenOne(stage_northLeft);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
            setGreenOne(stage_northStraight);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
            setGreenOne(stage_northRight);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
            setGreenOne(stage_northOther);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
            setGreenOne(stage_northPedestrain1);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
            setGreenOne(stage_northPedestrain2);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
            setGreenOne(stage_north_turn_around);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
            setGreenOne(stage_north_left_straight_right);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
            setGreenOne(stage_eastLeft);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
            setGreenOne(stage_eastStriaght);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
            setGreenOne(stage_eastRight);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
            setGreenOne(stage_eastOther);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
            setGreenOne(stage_eastPedestrain1);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
            setGreenOne(stage_eastPedestrain2);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
            setGreenOne(stage_east_turn_around);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
            setGreenOne(stage_east_left_straight_right);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
            setGreenOne(stage_southLeft);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
            setGreenOne(stage_southStriaght);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
            setGreenOne(stage_southRight);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
            setGreenOne(stage_southOther);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
            setGreenOne(stage_southPedestrain1);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
            setGreenOne(stage_southPedestrain2);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
            setGreenOne(stage_south_turn_around);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
            setGreenOne(stage_south_left_straight_right);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
            setGreenOne(stage_westLeft);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
            setGreenOne(stage_westStriaght);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
            setGreenOne(stage_westRight);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
            setGreenOne(stage_westPedestrain1);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
            setGreenOne(stage_westPedestrain2);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
            setGreenOne(stage_west_turn_around);
        }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
            setGreenOne(stage_west_left_straight_right);
        }
    }

    /**
     * 将小图中的配置反应到大图中。
     */
    private void small2BigMap(){
        //selected_id
        int stageid = np_stage_pattern_id.getValue();
        Iterator<GbtStagePattern> gbtStagePatternIterator = gbtStagePatterns.iterator();
        while(gbtStagePatternIterator.hasNext()){
            GbtStagePattern gbtStagePattern = gbtStagePatternIterator.next();
            if(gbtStagePattern.getStageId() == selected_id && gbtStagePattern.getStagePatternId() == stageid){
                int ap = gbtStagePattern.getAllowPhase();
                Iterator<GbtDirec> gbtDirecIterator = gbtDirecs.iterator();
                for (int i = 0; i < 32; i++)
                {
                    if (((ap >> i) & 0x01) == 0x01)
                    {
                        while (gbtDirecIterator.hasNext())
                        {
                            GbtDirec gbtDirec = gbtDirecIterator.next();
                            if (gbtDirec.getPhaseId() != 0)
                            {
                                if (gbtDirec.getPhaseId() == (i + 1))
                                {
                                    //初始化
                                    setBigGreenOne(gbtDirec);
                                    //Define.NORTH_LEFT
                                }
                            }
                        }
                    }
                }
            }
        }


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏
        setContentView(R.layout.activity_stage);
        initView();
        initViews();
        initImageViews();
        hiddenViews();
        hiddenImageViews();
        //得到数据库中对像的数据
        TscNode node = AndroidTscDefine.spToTscNode(AndroidTscDefine.getSharedPreferences(this));
        FinalDb db = AndroidTscDefine.getFinalDb(this);
        gbtStagePatterns = db.findAllByWhere(GbtStagePattern.class,"deviceId = '"+node.getId()+"'");
        gbtTimePatterns = db.findAllByWhere(GbtTimePattern.class,"deviceId = '"+node.getId()+"'");
        gbtDirecs = db.findAllByWhere(GbtDirec.class,"deviceId = '"+node.getId()+"' and phaseId !='0' or overlapId != '0'");
        gbtPhases = db.findAllByWhere(GbtPhase.class,"deviceId = '"+node.getId()+"'");

        Iterator<GbtStagePattern> gbtStagePatternIterator = gbtStagePatterns.iterator();
        while(gbtStagePatternIterator.hasNext()){
            GbtStagePattern gbtStagePattern = gbtStagePatternIterator.next();
            if(gbtStagePattern.getStagePatternId() == 1){
                displayStageView(gbtStagePattern);
                displayGreen2Small(gbtStagePattern,gbtDirecs);
            }
        }
        displayOrHidden();

        stage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected_id = 1;
                resetBigMapRed();
                small2BigMap();
                Toast.makeText(StageActivity.this,"你选中了 1 相位,请配置放行相位！",Toast.LENGTH_SHORT).show();
            }
        });
        stage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected_id = 2;
                resetBigMapRed();
                small2BigMap();
                Toast.makeText(StageActivity.this,"你选中了 2 相位,请配置放行相位！",Toast.LENGTH_SHORT).show();
            }
        });
        stage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected_id = 3;
                resetBigMapRed();
                small2BigMap();
                Toast.makeText(StageActivity.this,"你选中了 3 相位,请配置放行相位！",Toast.LENGTH_SHORT).show();
            }
        });
        stage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected_id = 4;
                resetBigMapRed();
                small2BigMap();
                Toast.makeText(StageActivity.this,"你选中了 4 相位,请配置放行相位！",Toast.LENGTH_SHORT).show();
            }
        });
        stage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected_id = 5;
                resetBigMapRed();
                small2BigMap();
                Toast.makeText(StageActivity.this,"你选中了 5 相位,请配置放行相位！",Toast.LENGTH_SHORT).show();
            }
        });
        stage6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected_id = 6;
                resetBigMapRed();
                small2BigMap();
                Toast.makeText(StageActivity.this,"你选中了 6 相位,请配置放行相位！",Toast.LENGTH_SHORT).show();
            }
        });
        stage7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected_id =7;
                resetBigMapRed();
                small2BigMap();
                Toast.makeText(StageActivity.this,"你选中了 7 相位,请配置放行相位！",Toast.LENGTH_SHORT).show();
            }
        });
        stage8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected_id = 8;
                resetBigMapRed();
                small2BigMap();
                Toast.makeText(StageActivity.this,"你选中了 8 相位,请配置放行相位！",Toast.LENGTH_SHORT).show();
            }
        });
        stage9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected_id = 9;
                resetBigMapRed();
                small2BigMap();
                Toast.makeText(StageActivity.this,"你选中了 9 相位,请配置放行相位！",Toast.LENGTH_SHORT).show();
            }
        });
        stage10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected_id = 10;
                resetBigMapRed();
                small2BigMap();
                Toast.makeText(StageActivity.this,"你选中了 10 相位,请配置放行相位！",Toast.LENGTH_SHORT).show();
            }
        });
        stage11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected_id = 11;
                resetBigMapRed();
                small2BigMap();
                Toast.makeText(StageActivity.this,"你选中了 11 相位,请配置放行相位！",Toast.LENGTH_SHORT).show();
            }
        });
        stage12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected_id = 12;
                resetBigMapRed();
                small2BigMap();
                Toast.makeText(StageActivity.this,"你选中了 12 相位,请配置放行相位！",Toast.LENGTH_SHORT).show();
            }
        });
        stage13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected_id = 13;
                resetBigMapRed();
                small2BigMap();
                Toast.makeText(StageActivity.this,"你选中了 13 相位,请配置放行相位！",Toast.LENGTH_SHORT).show();
            }
        });
        stage14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected_id = 14;
                resetBigMapRed();
                small2BigMap();
                Toast.makeText(StageActivity.this,"你选中了 14 相位,请配置放行相位！",Toast.LENGTH_SHORT).show();
            }
        });
        stage15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected_id = 15;
                resetBigMapRed();
                small2BigMap();
                Toast.makeText(StageActivity.this,"你选中了 15 相位,请配置放行相位！",Toast.LENGTH_SHORT).show();
            }
        });
        stage16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected_id = 16;
                resetBigMapRed();
                small2BigMap();
                Toast.makeText(StageActivity.this,"你选中了 16 相位,请配置放行相位！",Toast.LENGTH_SHORT).show();
            }
        });

        np_stage_pattern_id = (NumberPicker)findViewById(R.id.np_stage_pattern_id);
        np_stage_pattern_id.setMinValue(1);
        np_stage_pattern_id.setMaxValue(16);
        np_stage_pattern_id.setValue(1);
        np_stage_pattern_id.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                Iterator<GbtStagePattern> gbtStagePatternIterator = gbtStagePatterns.iterator();
                hiddenViews();
                hiddenImageViews();
                resetAllRed();

                displayOrHidden();
                while(gbtStagePatternIterator.hasNext()){
                    GbtStagePattern gbtStagePattern = gbtStagePatternIterator.next();
                    if(gbtStagePattern.getStagePatternId() == newVal){

                        displayStageView(gbtStagePattern);
                        displayGreen2Small(gbtStagePattern,gbtDirecs);
                    }

                }
            }
        });
    }

    public void stageBtnCreate(View v){
        Iterator<View> viewIterator = views.iterator();
        int visibleCount = 0;
        while(viewIterator.hasNext()){
            View view = viewIterator.next();
            if(View.VISIBLE ==view.getVisibility()){
                visibleCount++;
            }
        }
        View vi = views.get(visibleCount);
        vi.setVisibility(View.VISIBLE);
        TextView tv = (TextView)vi.findViewById(R.id.tv_stageId);
        tv.setText(""+(visibleCount+1));
        selected_id = visibleCount+1;
        Iterator<GbtStagePattern> gbtStagePatternIterator = gbtStagePatterns.iterator();
        while(gbtStagePatternIterator.hasNext()){
            GbtStagePattern gbtStagePattern = gbtStagePatternIterator.next();
            if(gbtStagePattern.getStagePatternId() == np_stage_pattern_id.getValue()){
                if(gbtStagePattern.getStageId() == 0){
                    gbtStagePattern.setStageId(visibleCount+1);
                    break;
                }
            }
        }
        Toast.makeText(this,(visibleCount+1)+"相位已经创建！",Toast.LENGTH_SHORT).show();
    }
    public void stageBtnSave(View v){

        Thread t1 = new Thread(runnable);
        t1.start();
        Toast.makeText(this,"",Toast.LENGTH_SHORT).show();
    }
    /**
     * 对指定相位，进行allowPhase对应位的置为1
     * @param gbtStagePattern
     * @param gbtDirec
     */
    private void setAllowPhase(GbtStagePattern gbtStagePattern,GbtDirec gbtDirec){
        if(gbtStagePattern.getStageId() == selected_id){
            int allowPhase = gbtStagePattern.getAllowPhase();
            allowPhase = allowPhase | (1<<(gbtDirec.getPhaseId()-1));
            gbtStagePattern.setAllowPhase(allowPhase);
        }
    }

    /**
     * 设置相位
     * @param direc
     */
    private void setAllowPhaseByDirec(int direc){
        Iterator<GbtStagePattern> gbtStagePatternIterator = gbtStagePatterns.iterator();
        Iterator<GbtDirec> gbtDirecIterator = gbtDirecs.iterator();
        while(gbtDirecIterator.hasNext()){
            GbtDirec gbtDirec = gbtDirecIterator.next();
            if(gbtDirec.getDirecId() == direc){

                if(gbtDirec.getPhaseId() != 0){
                    while(gbtStagePatternIterator.hasNext()){
                        GbtStagePattern gbtStagePattern = gbtStagePatternIterator.next();
                        if(gbtStagePattern.getStagePatternId()== np_stage_pattern_id.getValue()){
                            setAllowPhase(gbtStagePattern,gbtDirec);
                        }

                    }
                }
                /*   在阶段配时中，跟随相位不用考虑。
                跟随相位   -  >   找到相应的主相位   -> 跟随相位属性进行放行

                else if(gbtDirec.getOverlapId() !=0){
                    while(gbtStagePatternIterator.hasNext()){
                        GbtStagePattern gbtStagePattern = gbtStagePatternIterator.next();
                        if(gbtStagePattern.getStageId() == selected_id){
                            int allowPhase = gbtStagePattern.getAllowPhase();
                            allowPhase = allowPhase | (1<<gbtDirec.getOverlapId());
                            gbtStagePattern.setAllowPhase(allowPhase);
                        }
                    }
                }*/
            }
        }

    }

    /**
     * 设置指定相位，为红灯不进行放行。
     * 这个方法只能对协议数据进行构建。
     * @param gbtStagePattern
     * @param gbtDirec
     */
    private void setNoAllowPhase(GbtStagePattern gbtStagePattern,GbtDirec gbtDirec){
        if(gbtStagePattern.getStageId() == selected_id){
            int allowPhase = gbtStagePattern.getAllowPhase();
            int j = ~(1<<(gbtDirec.getPhaseId()-1));
            allowPhase = allowPhase & j;
            gbtStagePattern.setAllowPhase(allowPhase);
        }
    }

    /**
     * 将绿灯放行，设置成红灯
     * @param direc
     */
    private void setNoAllowPhaseByDirec(int direc){
        Iterator<GbtStagePattern> gbtStagePatternIterator = gbtStagePatterns.iterator();
        Iterator<GbtDirec> gbtDirecIterator = gbtDirecs.iterator();
        while(gbtDirecIterator.hasNext()){
            GbtDirec gbtDirec = gbtDirecIterator.next();
            if(gbtDirec.getDirecId() == direc){

                if(gbtDirec.getPhaseId() != 0){
                    while(gbtStagePatternIterator.hasNext()){
                        GbtStagePattern gbtStagePattern = gbtStagePatternIterator.next();
                        if(gbtStagePattern.getStagePatternId()== np_stage_pattern_id.getValue()) {
                            setNoAllowPhase(gbtStagePattern, gbtDirec);
                        }
                    }
                }
                /*   在阶段配时中，跟随相位不用考虑。
                跟随相位   -  >   找到相应的主相位   -> 跟随相位属性进行放行

                else if(gbtDirec.getOverlapId() !=0){
                    while(gbtStagePatternIterator.hasNext()){
                        GbtStagePattern gbtStagePattern = gbtStagePatternIterator.next();
                        if(gbtStagePattern.getStageId() == selected_id){
                            int allowPhase = gbtStagePattern.getAllowPhase();
                            allowPhase = allowPhase | (1<<gbtDirec.getOverlapId());
                            gbtStagePattern.setAllowPhase(allowPhase);
                        }
                    }
                }*/
            }
        }

    }


    private void changeDirec2Red(int direc){
        if(direc == GbtDefine.I_NORTH_OTHER){
            stage_northOther.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_NORTH_LEFT){
            stage_northLeft.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_NORTH_STRAIGHT){
            stage_northStraight.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_NORTH_RIGHT){
            stage_northRight.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
            stage_northPedestrain1.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
            stage_northPedestrain2.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_NORTH_NONE1){
            stage_north_turn_around.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_NORTH_NONE2){
            stage_north_left_straight_right.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_EAST_LEFT){
            stage_eastLeft.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_EAST_STRAIGHT){
            stage_eastStriaght.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_EAST_RIGHT){
            stage_eastRight.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_EAST_OTHER){
            stage_eastOther.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_EAST_PEDESTRAIN_ONE){
            stage_eastPedestrain1.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_EAST_PEDESTRAIN_TWO){
            stage_eastPedestrain2.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_EAST_NONE1){
            stage_east_turn_around.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_EAST_NONE2){
            stage_east_left_straight_right.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_SOUTH_LEFT){
            stage_southLeft.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_SOUTH_STRAIGHT){
            stage_southStriaght.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_SOUTH_RIGHT){
            stage_southRight.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_SOUTH_OTHER){
            stage_southOther.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
            stage_southPedestrain1.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
            stage_southPedestrain2.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_SOUTH_NONE1){
            stage_south_turn_around.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_SOUTH_NONE2){
            stage_south_left_straight_right.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_WEST_LEFT){
            stage_westLeft.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_WEST_STRAIGHT){
            stage_westStriaght.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_WEST_RIGHT){
            stage_westRight.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_WEST_OTHER){
            stage_westOther.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_WEST_PEDESTRAIN_ONE){
            stage_westPedestrain1.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_WEST_PEDESTRAIN_TWO){
            stage_westPedestrain2.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_WEST_NONE1){
            stage_west_turn_around.setImageResource(R.drawable.redone);
        }else if(direc == GbtDefine.I_WEST_NONE2){
            stage_west_left_straight_right.setImageResource(R.drawable.redone);
        }
    }

    private void changeDirec2Green(int direc){
        if(direc == GbtDefine.I_NORTH_OTHER){
            stage_northOther.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_NORTH_LEFT){
            stage_northLeft.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_NORTH_STRAIGHT){
            stage_northStraight.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_NORTH_RIGHT){
            stage_northRight.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
            stage_northPedestrain1.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
            stage_northPedestrain2.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_NORTH_NONE1){
            stage_north_turn_around.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_NORTH_NONE2){
            stage_north_left_straight_right.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_EAST_LEFT){
            stage_eastLeft.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_EAST_STRAIGHT){
            stage_eastStriaght.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_EAST_RIGHT){
            stage_eastRight.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_EAST_OTHER){
            stage_eastOther.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_EAST_PEDESTRAIN_ONE){
            stage_eastPedestrain1.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_EAST_PEDESTRAIN_TWO){
            stage_eastPedestrain2.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_EAST_NONE1){
            stage_east_turn_around.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_EAST_NONE2){
            stage_east_left_straight_right.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_SOUTH_LEFT){
            stage_southLeft.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_SOUTH_STRAIGHT){
            stage_southStriaght.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_SOUTH_RIGHT){
            stage_southRight.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_SOUTH_OTHER){
            stage_southOther.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
            stage_southPedestrain1.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
            stage_southPedestrain2.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_SOUTH_NONE1){
            stage_south_turn_around.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_SOUTH_NONE2){
            stage_south_left_straight_right.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_WEST_LEFT){
            stage_westLeft.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_WEST_STRAIGHT){
            stage_westStriaght.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_WEST_RIGHT){
            stage_westRight.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_WEST_OTHER){
            stage_westOther.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_WEST_PEDESTRAIN_ONE){
            stage_westPedestrain1.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_WEST_PEDESTRAIN_TWO){
            stage_westPedestrain2.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_WEST_NONE1){
            stage_west_turn_around.setImageResource(R.drawable.greenone);
        }else if(direc == GbtDefine.I_WEST_NONE2){
            stage_west_left_straight_right.setImageResource(R.drawable.greenone);
        }
    }

    private void changeDirec2RedBySmall(int direc){
        if(direc == GbtDefine.I_NORTH_OTHER){
            switch(selected_id){
                case 1:
                    stage1_small_northOther.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_northOther.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_northOther.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_northOther.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_northOther.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_northOther.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_northOther.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_northOther.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_northOther.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_northOther.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_northOther.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_northOther.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_northOther.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_northOther.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_northOther.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_northOther.setImageResource(R.drawable.redone);
                    break;
            }

        }else if(direc == GbtDefine.I_NORTH_LEFT){
            switch(selected_id){
                case 1:
                    stage1_small_northLeft.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_northLeft.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_northLeft.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_northLeft.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_northLeft.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_northLeft.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_northLeft.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_northLeft.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_northLeft.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_northLeft.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_northLeft.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_northLeft.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_northLeft.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_northLeft.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_northLeft.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_northLeft.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_NORTH_STRAIGHT){
            switch(selected_id){
                case 1:
                    stage1_small_northStriaght.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_northStriaght.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_northStriaght.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_northStriaght.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_northStriaght.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_northStriaght.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_northStriaght.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_northStriaght.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_northStriaght.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_northStriaght.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_northStriaght.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_northStriaght.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_northStriaght.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_northStriaght.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_northStriaght.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_northStriaght.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_NORTH_RIGHT){
            switch(selected_id){
                case 1:
                    stage1_small_northRight.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_northRight.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_northRight.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_northRight.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_northRight.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_northRight.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_northRight.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_northRight.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_northRight.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_northRight.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_northRight.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_northRight.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_northRight.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_northRight.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_northRight.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_northRight.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
            switch(selected_id){
                case 1:
                    stage1_small_northPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_northPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_northPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_northPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_northPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_northPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_northPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_northPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_northPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_northPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_northPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_northPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_northPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_northPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_northPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_northPedestrain1.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
            switch(selected_id){
                case 1:
                    stage1_small_northPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_northPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_northPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_northPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_northPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_northPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_northPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_northPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_northPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_northPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_northPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_northPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_northPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_northPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_northPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_northPedestrain2.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_NORTH_NONE1){
            switch(selected_id){
                case 1:
                    stage1_small_northNone1.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_northNone1.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_northNone1.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_northNone1.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_northNone1.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_northNone1.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_northNone1.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_northNone1.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_northNone1.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_northNone1.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_northNone1.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_northNone1.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_northNone1.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_northNone1.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_northNone1.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_northNone1.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_NORTH_NONE2){
            switch(selected_id){
                case 1:
                    stage1_small_northNone2.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_northNone2.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_northNone2.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_northNone2.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_northNone2.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_northNone2.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_northNone2.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_northNone2.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_northNone2.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_northNone2.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_northNone2.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_northNone2.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_northNone2.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_northNone2.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_northNone2.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_northNone2.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_EAST_LEFT){
            switch(selected_id){
                case 1:
                    stage1_small_eastLeft.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_eastLeft.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_eastLeft.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_eastLeft.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_eastLeft.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_eastLeft.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_eastLeft.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_eastLeft.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_eastLeft.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_eastLeft.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_eastLeft.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_eastLeft.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_eastLeft.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_eastLeft.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_eastLeft.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_eastLeft.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_EAST_STRAIGHT){
            switch(selected_id){
                case 1:
                    stage1_small_eastStriaght.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_eastStriaght.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_eastStriaght.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_eastStriaght.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_eastStriaght.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_eastStriaght.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_eastStriaght.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_eastStriaght.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_eastStriaght.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_eastStriaght.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_eastStriaght.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_eastStriaght.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_eastStriaght.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_eastStriaght.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_eastStriaght.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_eastStriaght.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_EAST_RIGHT){
            switch(selected_id){
                case 1:
                    stage1_small_eastRight.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_eastRight.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_eastRight.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_eastRight.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_eastRight.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_eastRight.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_eastRight.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_eastRight.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_eastRight.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_eastRight.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_eastRight.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_eastRight.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_eastRight.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_eastRight.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_eastRight.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_eastRight.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_EAST_OTHER){
            switch(selected_id){
                case 1:
                    stage1_small_eastOther.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_eastOther.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_eastOther.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_eastOther.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_eastOther.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_eastOther.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_eastOther.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_eastOther.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_eastOther.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_eastOther.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_eastOther.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_eastOther.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_eastOther.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_eastOther.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_eastOther.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_eastOther.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_EAST_PEDESTRAIN_ONE){
            switch(selected_id){
                case 1:
                    stage1_small_eastPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_eastPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_eastPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_eastPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_eastPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_eastPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_eastPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_eastPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_eastPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_eastPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_eastPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_eastPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_eastPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_eastPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_eastPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_eastPedestrain1.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_EAST_PEDESTRAIN_TWO){
            switch(selected_id){
                case 1:
                    stage1_small_eastPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_eastPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_eastPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_eastPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_eastPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_eastPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_eastPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_eastPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_eastPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_eastPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_eastPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_eastPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_eastPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_eastPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_eastPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_eastPedestrain2.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_EAST_NONE1){
            switch(selected_id){
                case 1:
                    stage1_small_eastNone1.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_eastNone1.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_eastNone1.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_eastNone1.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_eastNone1.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_eastNone1.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_eastNone1.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_eastNone1.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_eastNone1.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_eastNone1.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_eastNone1.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_eastNone1.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_eastNone1.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_eastNone1.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_eastNone1.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_eastNone1.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_EAST_NONE2){
            switch(selected_id){
                case 1:
                    stage1_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_southNone2.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_SOUTH_LEFT){
            switch(selected_id){
                case 1:
                    stage1_small_southLeft.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_southLeft.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_southLeft.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_southLeft.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_southLeft.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_southLeft.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_southLeft.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_southLeft.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_southLeft.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_southLeft.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_southLeft.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_southLeft.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_southLeft.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_southLeft.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_southLeft.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_southLeft.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_SOUTH_STRAIGHT){
            switch(selected_id){
                case 1:
                    stage1_small_southStriaght.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_southStriaght.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_southStriaght.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_southStriaght.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_southStriaght.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_southStriaght.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_southStriaght.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_southStriaght.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_southStriaght.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_southStriaght.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_southStriaght.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_southStriaght.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_southStriaght.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_southStriaght.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_southStriaght.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_southStriaght.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_SOUTH_RIGHT){
            switch(selected_id){
                case 1:
                    stage1_small_southRight.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_southRight.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_southRight.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_southRight.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_southRight.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_southRight.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_southRight.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_southRight.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_southRight.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_southRight.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_southRight.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_southRight.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_southRight.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_southRight.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_southRight.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_southRight.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_SOUTH_OTHER){
            switch(selected_id){
                case 1:
                    stage1_small_southOther.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_southOther.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_southOther.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_southOther.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_southOther.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_southOther.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_southOther.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_southOther.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_southOther.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_southOther.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_southOther.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_southOther.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_southOther.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_southOther.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_southOther.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_southOther.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
            switch(selected_id){
                case 1:
                    stage1_small_southPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_southPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_southPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_southPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_southPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_southPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_southPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_southPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_southPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_southPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_southPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_southPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_southPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_southPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_southPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_southPedestrain1.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
            switch(selected_id){
                case 1:
                    stage1_small_southPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_southPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_southPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_southPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_southPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_southPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_southPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_southPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_southPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_southPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_southPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_southPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_southPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_southPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_southPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_southPedestrain2.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_SOUTH_NONE1){
            switch(selected_id){
                case 1:
                    stage1_small_southNone1.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_southNone1.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_southNone1.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_southNone1.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_southNone1.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_southNone1.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_southNone1.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_southNone1.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_southNone1.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_southNone1.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_southNone1.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_southNone1.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_southNone1.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_southNone1.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_southNone1.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_southNone1.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_SOUTH_NONE2){
            switch(selected_id){
                case 1:
                    stage1_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_southNone2.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_southNone2.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_WEST_LEFT){
            switch(selected_id){
                case 1:
                    stage1_small_westLeft.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_westLeft.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_westLeft.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_westLeft.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_westLeft.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_westLeft.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_westLeft.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_westLeft.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_westLeft.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_westLeft.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_westLeft.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_westLeft.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_westLeft.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_westLeft.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_westLeft.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_westLeft.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_WEST_STRAIGHT){
            switch(selected_id){
                case 1:
                    stage1_small_westStriaght.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_westStriaght.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_westStriaght.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_westStriaght.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_westStriaght.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_westStriaght.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_westStriaght.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_westStriaght.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_westStriaght.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_westStriaght.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_westStriaght.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_westStriaght.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_westStriaght.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_westStriaght.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_westStriaght.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_westStriaght.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_WEST_RIGHT){
            switch(selected_id){
                case 1:
                    stage1_small_westRight.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_westRight.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_westRight.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_westRight.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_westRight.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_westRight.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_westRight.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_westRight.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_westRight.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_westRight.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_westRight.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_westRight.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_westRight.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_westRight.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_westRight.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_westRight.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_WEST_OTHER){
            switch(selected_id){
                case 1:
                    stage1_small_westOther.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_westOther.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_westOther.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_westOther.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_westOther.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_westOther.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_westOther.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_westOther.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_westOther.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_westOther.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_westOther.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_westOther.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_westOther.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_westOther.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_westOther.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_westOther.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_WEST_PEDESTRAIN_ONE){
            switch(selected_id){
                case 1:
                    stage1_small_westPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_westPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_westPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_westPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_westPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_westPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_westPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_westPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_westPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_westPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_westPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_westPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_westPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_westPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_westPedestrain1.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_westPedestrain1.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_WEST_PEDESTRAIN_TWO){
            switch(selected_id){
                case 1:
                    stage1_small_westPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_westPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_westPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_westPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_westPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_westPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_westPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_westPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_westPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_westPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_westPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_westPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_westPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_westPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_westPedestrain2.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_westPedestrain2.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_WEST_NONE1){
            switch(selected_id){
                case 1:
                    stage1_small_westNone1.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_westNone1.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_westNone1.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_westNone1.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_westNone1.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_westNone1.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_westNone1.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_westNone1.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_westNone1.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_westNone1.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_westNone1.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_westNone1.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_westNone1.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_westNone1.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_westNone1.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_westNone1.setImageResource(R.drawable.redone);
                    break;
            }
        }else if(direc == GbtDefine.I_WEST_NONE2){
            switch(selected_id){
                case 1:
                    stage1_small_westNone2.setImageResource(R.drawable.redone);
                    break;
                case 2:
                    stage2_small_westNone2.setImageResource(R.drawable.redone);
                    break;
                case 3:
                    stage3_small_westNone2.setImageResource(R.drawable.redone);
                    break;
                case 4:
                    stage4_small_westNone2.setImageResource(R.drawable.redone);
                    break;
                case 5:
                    stage5_small_westNone2.setImageResource(R.drawable.redone);
                    break;
                case 6:
                    stage6_small_westNone2.setImageResource(R.drawable.redone);
                    break;
                case 7:
                    stage7_small_westNone2.setImageResource(R.drawable.redone);
                    break;
                case 8:
                    stage8_small_westNone2.setImageResource(R.drawable.redone);
                    break;
                case 9:
                    stage9_small_westNone2.setImageResource(R.drawable.redone);
                    break;
                case 10:
                    stage10_small_westNone2.setImageResource(R.drawable.redone);
                    break;
                case 11:
                    stage11_small_westNone2.setImageResource(R.drawable.redone);
                    break;
                case 12:
                    stage12_small_westNone2.setImageResource(R.drawable.redone);
                    break;
                case 13:
                    stage13_small_westNone2.setImageResource(R.drawable.redone);
                    break;
                case 14:
                    stage14_small_westNone2.setImageResource(R.drawable.redone);
                    break;
                case 15:
                    stage15_small_westNone2.setImageResource(R.drawable.redone);
                    break;
                case 16:
                    stage16_small_westNone2.setImageResource(R.drawable.redone);
                    break;
            }
        }
    }

    private void changeDirec2GreenBySmall(int direc){
        if(direc == GbtDefine.I_NORTH_OTHER){
            switch(selected_id){
                case 1:
                    stage1_small_northOther.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_northOther.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_northOther.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_northOther.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_northOther.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_northOther.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_northOther.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_northOther.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_northOther.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_northOther.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_northOther.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_northOther.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_northOther.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_northOther.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_northOther.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_northOther.setImageResource(R.drawable.greenone);
                    break;
            }

        }else if(direc == GbtDefine.I_NORTH_LEFT){
            switch(selected_id){
                case 1:
                    stage1_small_northLeft.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_northLeft.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_northLeft.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_northLeft.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_northLeft.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_northLeft.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_northLeft.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_northLeft.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_northLeft.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_northLeft.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_northLeft.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_northLeft.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_northLeft.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_northLeft.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_northLeft.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_northLeft.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_NORTH_STRAIGHT){
            switch(selected_id){
                case 1:
                    stage1_small_northStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_northStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_northStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_northStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_northStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_northStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_northStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_northStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_northStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_northStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_northStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_northStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_northStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_northStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_northStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_northStriaght.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_NORTH_RIGHT){
            switch(selected_id){
                case 1:
                    stage1_small_northRight.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_northRight.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_northRight.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_northRight.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_northRight.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_northRight.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_northRight.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_northRight.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_northRight.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_northRight.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_northRight.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_northRight.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_northRight.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_northRight.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_northRight.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_northRight.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
            switch(selected_id){
                case 1:
                    stage1_small_northPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_northPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_northPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_northPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_northPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_northPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_northPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_northPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_northPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_northPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_northPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_northPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_northPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_northPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_northPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_northPedestrain1.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
            switch(selected_id){
                case 1:
                    stage1_small_northPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_northPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_northPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_northPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_northPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_northPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_northPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_northPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_northPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_northPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_northPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_northPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_northPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_northPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_northPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_northPedestrain2.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_NORTH_NONE1){
            switch(selected_id){
                case 1:
                    stage1_small_northNone1.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_northNone1.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_northNone1.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_northNone1.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_northNone1.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_northNone1.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_northNone1.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_northNone1.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_northNone1.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_northNone1.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_northNone1.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_northNone1.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_northNone1.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_northNone1.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_northNone1.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_northNone1.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_NORTH_NONE2){
            switch(selected_id){
                case 1:
                    stage1_small_northNone2.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_northNone2.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_northNone2.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_northNone2.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_northNone2.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_northNone2.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_northNone2.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_northNone2.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_northNone2.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_northNone2.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_northNone2.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_northNone2.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_northNone2.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_northNone2.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_northNone2.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_northNone2.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_EAST_LEFT){
            switch(selected_id){
                case 1:
                    stage1_small_eastLeft.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_eastLeft.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_eastLeft.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_eastLeft.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_eastLeft.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_eastLeft.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_eastLeft.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_eastLeft.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_eastLeft.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_eastLeft.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_eastLeft.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_eastLeft.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_eastLeft.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_eastLeft.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_eastLeft.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_eastLeft.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_EAST_STRAIGHT){
            switch(selected_id){
                case 1:
                    stage1_small_eastStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_eastStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_eastStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_eastStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_eastStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_eastStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_eastStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_eastStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_eastStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_eastStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_eastStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_eastStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_eastStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_eastStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_eastStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_eastStriaght.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_EAST_RIGHT){
            switch(selected_id){
                case 1:
                    stage1_small_eastRight.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_eastRight.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_eastRight.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_eastRight.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_eastRight.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_eastRight.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_eastRight.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_eastRight.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_eastRight.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_eastRight.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_eastRight.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_eastRight.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_eastRight.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_eastRight.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_eastRight.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_eastRight.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_EAST_OTHER){
            switch(selected_id){
                case 1:
                    stage1_small_eastOther.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_eastOther.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_eastOther.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_eastOther.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_eastOther.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_eastOther.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_eastOther.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_eastOther.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_eastOther.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_eastOther.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_eastOther.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_eastOther.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_eastOther.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_eastOther.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_eastOther.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_eastOther.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_EAST_PEDESTRAIN_ONE){
            switch(selected_id){
                case 1:
                    stage1_small_eastPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_eastPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_eastPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_eastPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_eastPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_eastPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_eastPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_eastPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_eastPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_eastPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_eastPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_eastPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_eastPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_eastPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_eastPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_eastPedestrain1.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_EAST_PEDESTRAIN_TWO){
            switch(selected_id){
                case 1:
                    stage1_small_eastPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_eastPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_eastPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_eastPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_eastPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_eastPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_eastPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_eastPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_eastPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_eastPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_eastPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_eastPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_eastPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_eastPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_eastPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_eastPedestrain2.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_EAST_NONE1){
            switch(selected_id){
                case 1:
                    stage1_small_eastNone1.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_eastNone1.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_eastNone1.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_eastNone1.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_eastNone1.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_eastNone1.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_eastNone1.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_eastNone1.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_eastNone1.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_eastNone1.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_eastNone1.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_eastNone1.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_eastNone1.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_eastNone1.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_eastNone1.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_eastNone1.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_EAST_NONE2){
            switch(selected_id){
                case 1:
                    stage1_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_SOUTH_LEFT){
            switch(selected_id){
                case 1:
                    stage1_small_southLeft.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_southLeft.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_southLeft.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_southLeft.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_southLeft.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_southLeft.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_southLeft.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_southLeft.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_southLeft.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_southLeft.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_southLeft.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_southLeft.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_southLeft.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_southLeft.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_southLeft.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_southLeft.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_SOUTH_STRAIGHT){
            switch(selected_id){
                case 1:
                    stage1_small_southStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_southStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_southStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_southStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_southStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_southStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_southStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_southStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_southStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_southStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_southStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_southStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_southStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_southStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_southStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_southStriaght.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_SOUTH_RIGHT){
            switch(selected_id){
                case 1:
                    stage1_small_southRight.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_southRight.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_southRight.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_southRight.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_southRight.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_southRight.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_southRight.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_southRight.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_southRight.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_southRight.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_southRight.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_southRight.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_southRight.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_southRight.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_southRight.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_southRight.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_SOUTH_OTHER){
            switch(selected_id){
                case 1:
                    stage1_small_southOther.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_southOther.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_southOther.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_southOther.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_southOther.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_southOther.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_southOther.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_southOther.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_southOther.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_southOther.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_southOther.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_southOther.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_southOther.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_southOther.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_southOther.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_southOther.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
            switch(selected_id){
                case 1:
                    stage1_small_southPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_southPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_southPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_southPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_southPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_southPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_southPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_southPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_southPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_southPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_southPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_southPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_southPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_southPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_southPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_southPedestrain1.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
            switch(selected_id){
                case 1:
                    stage1_small_southPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_southPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_southPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_southPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_southPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_southPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_southPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_southPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_southPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_southPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_southPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_southPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_southPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_southPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_southPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_southPedestrain2.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_SOUTH_NONE1){
            switch(selected_id){
                case 1:
                    stage1_small_southNone1.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_southNone1.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_southNone1.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_southNone1.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_southNone1.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_southNone1.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_southNone1.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_southNone1.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_southNone1.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_southNone1.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_southNone1.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_southNone1.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_southNone1.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_southNone1.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_southNone1.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_southNone1.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_SOUTH_NONE2){
            switch(selected_id){
                case 1:
                    stage1_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_southNone2.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_WEST_LEFT){
            switch(selected_id){
                case 1:
                    stage1_small_westLeft.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_westLeft.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_westLeft.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_westLeft.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_westLeft.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_westLeft.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_westLeft.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_westLeft.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_westLeft.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_westLeft.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_westLeft.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_westLeft.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_westLeft.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_westLeft.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_westLeft.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_westLeft.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_WEST_STRAIGHT){
            switch(selected_id){
                case 1:
                    stage1_small_westStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_westStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_westStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_westStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_westStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_westStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_westStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_westStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_westStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_westStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_westStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_westStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_westStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_westStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_westStriaght.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_westStriaght.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_WEST_RIGHT){
            switch(selected_id){
                case 1:
                    stage1_small_westRight.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_westRight.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_westRight.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_westRight.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_westRight.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_westRight.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_westRight.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_westRight.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_westRight.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_westRight.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_westRight.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_westRight.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_westRight.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_westRight.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_westRight.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_westRight.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_WEST_OTHER){
            switch(selected_id){
                case 1:
                    stage1_small_westOther.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_westOther.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_westOther.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_westOther.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_westOther.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_westOther.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_westOther.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_westOther.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_westOther.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_westOther.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_westOther.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_westOther.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_westOther.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_westOther.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_westOther.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_westOther.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_WEST_PEDESTRAIN_ONE){
            switch(selected_id){
                case 1:
                    stage1_small_westPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_westPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_westPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_westPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_westPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_westPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_westPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_westPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_westPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_westPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_westPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_westPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_westPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_westPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_westPedestrain1.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_westPedestrain1.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_WEST_PEDESTRAIN_TWO){
            switch(selected_id){
                case 1:
                    stage1_small_westPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_westPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_westPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_westPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_westPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_westPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_westPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_westPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_westPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_westPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_westPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_westPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_westPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_westPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_westPedestrain2.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_westPedestrain2.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_WEST_NONE1){
            switch(selected_id){
                case 1:
                    stage1_small_westNone1.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_westNone1.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_westNone1.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_westNone1.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_westNone1.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_westNone1.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_westNone1.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_westNone1.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_westNone1.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_westNone1.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_westNone1.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_westNone1.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_westNone1.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_westNone1.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_westNone1.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_westNone1.setImageResource(R.drawable.greenone);
                    break;
            }
        }else if(direc == GbtDefine.I_WEST_NONE2){
            switch(selected_id){
                case 1:
                    stage1_small_westNone2.setImageResource(R.drawable.greenone);
                    break;
                case 2:
                    stage2_small_westNone2.setImageResource(R.drawable.greenone);
                    break;
                case 3:
                    stage3_small_westNone2.setImageResource(R.drawable.greenone);
                    break;
                case 4:
                    stage4_small_westNone2.setImageResource(R.drawable.greenone);
                    break;
                case 5:
                    stage5_small_westNone2.setImageResource(R.drawable.greenone);
                    break;
                case 6:
                    stage6_small_westNone2.setImageResource(R.drawable.greenone);
                    break;
                case 7:
                    stage7_small_westNone2.setImageResource(R.drawable.greenone);
                    break;
                case 8:
                    stage8_small_westNone2.setImageResource(R.drawable.greenone);
                    break;
                case 9:
                    stage9_small_westNone2.setImageResource(R.drawable.greenone);
                    break;
                case 10:
                    stage10_small_westNone2.setImageResource(R.drawable.greenone);
                    break;
                case 11:
                    stage11_small_westNone2.setImageResource(R.drawable.greenone);
                    break;
                case 12:
                    stage12_small_westNone2.setImageResource(R.drawable.greenone);
                    break;
                case 13:
                    stage13_small_westNone2.setImageResource(R.drawable.greenone);
                    break;
                case 14:
                    stage14_small_westNone2.setImageResource(R.drawable.greenone);
                    break;
                case 15:
                    stage15_small_westNone2.setImageResource(R.drawable.greenone);
                    break;
                case 16:
                    stage16_small_westNone2.setImageResource(R.drawable.greenone);
                    break;
            }
        }
    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean north_other = false;
    public void northOther(View v){
        Toast.makeText(this,"北方向其它进行设置",Toast.LENGTH_SHORT).show();
        if(north_other){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_NORTH_OTHER);
            changeDirec2RedBySmall(GbtDefine.I_NORTH_OTHER);
            changeDirec2Red(GbtDefine.I_NORTH_OTHER);
            north_other = false;

        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_NORTH_OTHER);
            changeDirec2GreenBySmall(GbtDefine.I_NORTH_OTHER);
            changeDirec2Green(GbtDefine.I_NORTH_OTHER);
            north_other = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean north_right = false;
    public void northRight(View v){
        Toast.makeText(this,"北方向右转进行设置",Toast.LENGTH_SHORT).show();
        if(north_right){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_NORTH_RIGHT);
            changeDirec2RedBySmall(GbtDefine.I_NORTH_RIGHT);
            changeDirec2Red(GbtDefine.I_NORTH_RIGHT);
            north_right = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_NORTH_RIGHT);
            changeDirec2GreenBySmall(GbtDefine.I_NORTH_RIGHT);
            changeDirec2Green(GbtDefine.I_NORTH_RIGHT);
            north_right = true;
        }

    }

    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean north_straight = false;
    public void northStraight(View v){
        Toast.makeText(this,"北方向直行进行设置",Toast.LENGTH_SHORT).show();
        if(north_straight){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_NORTH_STRAIGHT);
            changeDirec2RedBySmall(GbtDefine.I_NORTH_STRAIGHT);
            changeDirec2Red(GbtDefine.I_NORTH_STRAIGHT);
            north_straight = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_NORTH_STRAIGHT);
            changeDirec2GreenBySmall(GbtDefine.I_NORTH_STRAIGHT);
            changeDirec2Green(GbtDefine.I_NORTH_STRAIGHT);
            north_straight = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean north_left = false;
    public void northLeft(View v){
        Toast.makeText(this,"北方向左转进行设置",Toast.LENGTH_SHORT).show();
        if(north_left){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_NORTH_LEFT);
            changeDirec2RedBySmall(GbtDefine.I_NORTH_LEFT);
            changeDirec2Red(GbtDefine.I_NORTH_LEFT);
            north_left = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_NORTH_LEFT);
            changeDirec2Green(GbtDefine.I_NORTH_LEFT);
            changeDirec2GreenBySmall(GbtDefine.I_NORTH_LEFT);
            north_left = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean north_pedestrain1 = false;
    public void northPedestrain1(View v){
        Toast.makeText(this,"北方向人行1进行设置",Toast.LENGTH_SHORT).show();
        if(north_pedestrain1){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_NORTH_PEDESTRAIN_ONE);
            changeDirec2RedBySmall(GbtDefine.I_NORTH_PEDESTRAIN_ONE);
            changeDirec2Red(GbtDefine.I_NORTH_PEDESTRAIN_ONE);
            north_pedestrain1 = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_NORTH_PEDESTRAIN_ONE);
            changeDirec2GreenBySmall(GbtDefine.I_NORTH_PEDESTRAIN_ONE);
            changeDirec2Green(GbtDefine.I_NORTH_PEDESTRAIN_ONE);
            north_pedestrain1 = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean north_pedestrain2 = false;
    public void northPedestrain2(View v){
        Toast.makeText(this,"北方向人行2进行设置",Toast.LENGTH_SHORT).show();
        if(north_pedestrain2){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_NORTH_PEDESTRAIN_TWO);
            changeDirec2RedBySmall(GbtDefine.I_NORTH_PEDESTRAIN_TWO);
            changeDirec2Red(GbtDefine.I_NORTH_PEDESTRAIN_TWO);
            north_pedestrain2 = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_NORTH_PEDESTRAIN_TWO);
            changeDirec2GreenBySmall(GbtDefine.I_NORTH_PEDESTRAIN_TWO);
            changeDirec2Green(GbtDefine.I_NORTH_PEDESTRAIN_TWO);
            north_pedestrain2 = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean north_turn_around = false;
    public void northTurnAround(View v){
        Toast.makeText(this,"北方向调头进行设置",Toast.LENGTH_SHORT).show();
        if(north_turn_around){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_NORTH_NONE1);
            changeDirec2RedBySmall(GbtDefine.I_NORTH_NONE1);
            changeDirec2Red(GbtDefine.I_NORTH_NONE1);
            north_turn_around = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_NORTH_NONE1);
            changeDirec2Green(GbtDefine.I_NORTH_NONE1);
            changeDirec2GreenBySmall(GbtDefine.I_NORTH_NONE1);
            north_turn_around = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean north_left_straight_right = false;
    public void northLeftStraightRight(View v){
        Toast.makeText(this,"北方向特殊进行设置",Toast.LENGTH_SHORT).show();
        if(north_left_straight_right){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_NORTH_NONE2);
            changeDirec2RedBySmall(GbtDefine.I_NORTH_NONE2);
            changeDirec2Red(GbtDefine.I_NORTH_NONE2);
            north_left_straight_right = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_NORTH_NONE2);
            changeDirec2GreenBySmall(GbtDefine.I_NORTH_NONE2);
            changeDirec2Green(GbtDefine.I_NORTH_NONE2);
            north_left_straight_right = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean east_other = false;
    public void eastOther(View v){
        Toast.makeText(this,"东方向其它进行设置",Toast.LENGTH_SHORT).show();
        if(east_other){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_EAST_OTHER);
            changeDirec2RedBySmall(GbtDefine.I_EAST_OTHER);
            changeDirec2Red(GbtDefine.I_EAST_OTHER);
            east_other = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_EAST_OTHER);
            changeDirec2GreenBySmall(GbtDefine.I_EAST_OTHER);
            changeDirec2Green(GbtDefine.I_EAST_OTHER);
            east_other = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean east_right = false;
    public void eastRight(View v){
        Toast.makeText(this,"东方向右转进行设置",Toast.LENGTH_SHORT).show();
        if(east_right){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_EAST_RIGHT);
            changeDirec2RedBySmall(GbtDefine.I_EAST_RIGHT);
            changeDirec2Red(GbtDefine.I_EAST_RIGHT);
            east_right = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_EAST_RIGHT);
            changeDirec2GreenBySmall(GbtDefine.I_EAST_RIGHT);
            changeDirec2Green(GbtDefine.I_EAST_RIGHT);
            east_right = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean east_straight = false;
    public void eastStraight(View v){
        Toast.makeText(this,"东方向直行进行设置",Toast.LENGTH_SHORT).show();
        if(east_straight){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_EAST_STRAIGHT);
            changeDirec2RedBySmall(GbtDefine.I_EAST_STRAIGHT);
            changeDirec2Red(GbtDefine.I_EAST_STRAIGHT);
            east_straight = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_EAST_STRAIGHT);
            changeDirec2GreenBySmall(GbtDefine.I_EAST_STRAIGHT);
            changeDirec2Green(GbtDefine.I_EAST_STRAIGHT);
            east_straight = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean east_left = false;
    public void eastLeft(View v){
        Toast.makeText(this,"东方向左转进行设置",Toast.LENGTH_SHORT).show();
        if(east_left){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_EAST_LEFT);
            changeDirec2RedBySmall(GbtDefine.I_EAST_LEFT);
            changeDirec2Red(GbtDefine.I_EAST_LEFT);
            east_left = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_EAST_LEFT);
            changeDirec2GreenBySmall(GbtDefine.I_EAST_LEFT);
            changeDirec2Green(GbtDefine.I_EAST_LEFT);
            east_left = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean east_pedestrain1 = false;
    public void eastPedestrain1(View v){
        Toast.makeText(this,"东方向人行1进行设置",Toast.LENGTH_SHORT).show();
        if(east_pedestrain1){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_EAST_PEDESTRAIN_ONE);
            changeDirec2RedBySmall(GbtDefine.I_EAST_PEDESTRAIN_ONE);
            changeDirec2Red(GbtDefine.I_EAST_PEDESTRAIN_ONE);
            east_pedestrain1 = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_EAST_PEDESTRAIN_ONE);
            changeDirec2GreenBySmall(GbtDefine.I_EAST_PEDESTRAIN_ONE);
            changeDirec2Green(GbtDefine.I_EAST_PEDESTRAIN_ONE);
            east_pedestrain1 = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean east_pedestrain2 = false;
    public void eastPedestrain2(View v){
        Toast.makeText(this,"东方向人行2进行设置",Toast.LENGTH_SHORT).show();
        if(east_pedestrain2){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_EAST_PEDESTRAIN_TWO);
            changeDirec2RedBySmall(GbtDefine.I_EAST_PEDESTRAIN_TWO);
            changeDirec2Red(GbtDefine.I_EAST_PEDESTRAIN_TWO);
            east_pedestrain2 = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_EAST_PEDESTRAIN_TWO);
            changeDirec2GreenBySmall(GbtDefine.I_EAST_PEDESTRAIN_TWO);
            changeDirec2Green(GbtDefine.I_EAST_PEDESTRAIN_TWO);
            east_pedestrain2 = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean east_turn_around = false;
    public void eastTurnAround(View v){
        Toast.makeText(this,"东方向调头进行设置",Toast.LENGTH_SHORT).show();
        if(east_turn_around){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_EAST_NONE1);
            changeDirec2RedBySmall(GbtDefine.I_EAST_NONE1);
            changeDirec2Red(GbtDefine.I_EAST_NONE1);
            east_turn_around = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_EAST_NONE1);
            changeDirec2GreenBySmall(GbtDefine.I_EAST_NONE1);
            changeDirec2Green(GbtDefine.I_EAST_NONE1);
            east_turn_around = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean east_left_straight_right = false;
    public void eastLeftStraightRight(View v){
        Toast.makeText(this,"东方向特殊进行设置",Toast.LENGTH_SHORT).show();
        if(east_left_straight_right){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_EAST_NONE2);
            changeDirec2RedBySmall(GbtDefine.I_EAST_NONE2);
            changeDirec2Red(GbtDefine.I_EAST_NONE2);
            east_left_straight_right = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_EAST_NONE2);
            changeDirec2GreenBySmall(GbtDefine.I_EAST_NONE2);
            changeDirec2Green(GbtDefine.I_EAST_NONE2);
            east_left_straight_right = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean south_other = false;
    public void southOther(View v){
        Toast.makeText(this,"南方向其它进行设置",Toast.LENGTH_SHORT).show();
        if(south_other){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_SOUTH_OTHER);
            changeDirec2RedBySmall(GbtDefine.I_SOUTH_OTHER);
            changeDirec2Red(GbtDefine.I_SOUTH_OTHER);
            south_other = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_SOUTH_OTHER);
            changeDirec2GreenBySmall(GbtDefine.I_SOUTH_OTHER);
            changeDirec2Green(GbtDefine.I_SOUTH_OTHER);
            south_other = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。southStraight
     */
    private boolean south_right = false;
    public void southRight(View v){
        Toast.makeText(this,"南方向右转进行设置",Toast.LENGTH_SHORT).show();
        if(south_right){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_SOUTH_RIGHT);
            changeDirec2RedBySmall(GbtDefine.I_SOUTH_RIGHT);
            changeDirec2Red(GbtDefine.I_SOUTH_RIGHT);
            south_right = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_SOUTH_RIGHT);
            changeDirec2GreenBySmall(GbtDefine.I_SOUTH_RIGHT);
            changeDirec2Green(GbtDefine.I_SOUTH_RIGHT);
            south_right = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean south_straight = false;
    public void southStraight(View v){
        Toast.makeText(this,"南方向直行进行设置",Toast.LENGTH_SHORT).show();
        if(south_straight){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_SOUTH_STRAIGHT);
            changeDirec2RedBySmall(GbtDefine.I_SOUTH_STRAIGHT);
            changeDirec2Red(GbtDefine.I_SOUTH_STRAIGHT);
            south_straight = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_SOUTH_STRAIGHT);
            changeDirec2GreenBySmall(GbtDefine.I_SOUTH_STRAIGHT);
            changeDirec2Green(GbtDefine.I_SOUTH_STRAIGHT);
            south_straight = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean south_left = false;
    public void southLeft(View v){
        Toast.makeText(this,"南方向左转进行设置",Toast.LENGTH_SHORT).show();
        if(south_left){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_SOUTH_LEFT);
            changeDirec2RedBySmall(GbtDefine.I_SOUTH_LEFT);
            changeDirec2Red(GbtDefine.I_SOUTH_LEFT);
            south_left = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_SOUTH_LEFT);
            changeDirec2GreenBySmall(GbtDefine.I_SOUTH_LEFT);
            changeDirec2Green(GbtDefine.I_SOUTH_LEFT);
            south_left = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean south_pedestrain1 = false;
    public void southPedestrain1(View v){
        Toast.makeText(this,"南方向人行1进行设置",Toast.LENGTH_SHORT).show();
        if(south_pedestrain1){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_SOUTH_PEDESTRAIN_ONE);
            changeDirec2RedBySmall(GbtDefine.I_SOUTH_PEDESTRAIN_ONE);
            changeDirec2Red(GbtDefine.I_SOUTH_PEDESTRAIN_ONE);
            south_pedestrain1 = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_SOUTH_PEDESTRAIN_ONE);
            changeDirec2GreenBySmall(GbtDefine.I_SOUTH_PEDESTRAIN_ONE);
            changeDirec2Green(GbtDefine.I_SOUTH_PEDESTRAIN_ONE);
            south_pedestrain1 = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean south_pedestrain2 = false;
    public void southPedestrain2(View v){
        Toast.makeText(this,"南方向人行2进行设置",Toast.LENGTH_SHORT).show();
        if(south_pedestrain2){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_SOUTH_PEDESTRAIN_TWO);
            changeDirec2RedBySmall(GbtDefine.I_SOUTH_PEDESTRAIN_TWO);
            changeDirec2Red(GbtDefine.I_SOUTH_PEDESTRAIN_TWO);
            south_pedestrain2 = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_SOUTH_PEDESTRAIN_TWO);
            changeDirec2GreenBySmall(GbtDefine.I_SOUTH_PEDESTRAIN_TWO);
            changeDirec2Green(GbtDefine.I_SOUTH_PEDESTRAIN_TWO);
            south_pedestrain2 = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean south_turn_around = false;
    public void southTurnAround(View v){
        Toast.makeText(this,"南方向调头进行设置",Toast.LENGTH_SHORT).show();
        if(south_turn_around){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_SOUTH_NONE1);
            changeDirec2RedBySmall(GbtDefine.I_SOUTH_NONE1);
            changeDirec2Red(GbtDefine.I_SOUTH_NONE1);
            south_turn_around = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_SOUTH_NONE1);
            changeDirec2GreenBySmall(GbtDefine.I_SOUTH_NONE1);
            changeDirec2Green(GbtDefine.I_SOUTH_NONE1);
            south_turn_around = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean south_left_straight_right = false;
    public void southLeftStraightRight(View v){
        Toast.makeText(this,"南方向特殊进行设置",Toast.LENGTH_SHORT).show();
        if(south_left_straight_right){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_SOUTH_NONE2);
            changeDirec2RedBySmall(GbtDefine.I_SOUTH_NONE2);
            changeDirec2Red(GbtDefine.I_SOUTH_NONE2);
            south_left_straight_right = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_SOUTH_NONE2);
            changeDirec2GreenBySmall(GbtDefine.I_SOUTH_NONE2);
            changeDirec2Green(GbtDefine.I_SOUTH_NONE2);
            south_left_straight_right = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean west_other = false;
    public void westOther(View v){
        Toast.makeText(this,"西方向其它进行设置",Toast.LENGTH_SHORT).show();
        if(west_other){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_WEST_OTHER);
            changeDirec2RedBySmall(GbtDefine.I_WEST_OTHER);
            changeDirec2Red(GbtDefine.I_WEST_OTHER);
            west_other = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_WEST_OTHER);
            changeDirec2GreenBySmall(GbtDefine.I_WEST_OTHER);
            changeDirec2Green(GbtDefine.I_WEST_OTHER);
            west_other = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean west_right = false;
    public void westRight(View v){
        Toast.makeText(this,"西方向右转进行设置",Toast.LENGTH_SHORT).show();
        if(west_right){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_WEST_RIGHT);
            changeDirec2RedBySmall(GbtDefine.I_WEST_RIGHT);
            changeDirec2Red(GbtDefine.I_WEST_RIGHT);
            west_right = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_WEST_RIGHT);
            changeDirec2GreenBySmall(GbtDefine.I_WEST_RIGHT);
            changeDirec2Green(GbtDefine.I_WEST_RIGHT);
            west_right = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean west_straight = false;
    public void westStraight(View v){
        Toast.makeText(this,"西方向直行进行设置",Toast.LENGTH_SHORT).show();
        if(west_straight){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_WEST_STRAIGHT);
            changeDirec2RedBySmall(GbtDefine.I_WEST_STRAIGHT);
            changeDirec2Red(GbtDefine.I_WEST_STRAIGHT);
            west_straight = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_WEST_STRAIGHT);
            changeDirec2GreenBySmall(GbtDefine.I_WEST_STRAIGHT);
            changeDirec2Green(GbtDefine.I_WEST_STRAIGHT);
            west_straight = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean west_left = false;
    public void westLeft(View v){
        Toast.makeText(this,"西方向左转进行设置",Toast.LENGTH_SHORT).show();
        if(west_left){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_WEST_LEFT);
            changeDirec2RedBySmall(GbtDefine.I_WEST_LEFT);
            changeDirec2Red(GbtDefine.I_WEST_LEFT);
            west_left = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_WEST_LEFT);
            changeDirec2GreenBySmall(GbtDefine.I_WEST_LEFT);
            changeDirec2Green(GbtDefine.I_WEST_LEFT);
            west_left = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean west_pedestrain2 = false;
    public void westPedestrain2(View v){
        Toast.makeText(this,"西方向人行2进行设置",Toast.LENGTH_SHORT).show();
        if(west_pedestrain2){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_WEST_PEDESTRAIN_TWO);
            changeDirec2RedBySmall(GbtDefine.I_WEST_PEDESTRAIN_TWO);
            changeDirec2Red(GbtDefine.I_WEST_PEDESTRAIN_TWO);
            west_pedestrain2 = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_WEST_PEDESTRAIN_TWO);
            changeDirec2GreenBySmall(GbtDefine.I_WEST_PEDESTRAIN_TWO);
            changeDirec2Green(GbtDefine.I_WEST_PEDESTRAIN_TWO);
            west_pedestrain2 = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean west_pedestrain1 = false;
    public void westPedestrain1(View v){
        Toast.makeText(this,"西方向人行1进行设置",Toast.LENGTH_SHORT).show();
        if(west_pedestrain1){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_WEST_PEDESTRAIN_ONE);
            changeDirec2RedBySmall(GbtDefine.I_WEST_PEDESTRAIN_ONE);
            changeDirec2Red(GbtDefine.I_WEST_PEDESTRAIN_ONE);
            west_pedestrain1 = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_WEST_PEDESTRAIN_ONE);
            changeDirec2GreenBySmall(GbtDefine.I_WEST_PEDESTRAIN_ONE);
            changeDirec2Green(GbtDefine.I_WEST_PEDESTRAIN_ONE);
            west_pedestrain1 = true;
        }

    }

    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean west_turn_around = false;
    public void westTurnAround(View v){
        Toast.makeText(this,"西方向调头进行设置",Toast.LENGTH_SHORT).show();
        if(west_turn_around){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_WEST_NONE1);
            changeDirec2RedBySmall(GbtDefine.I_WEST_NONE1);
            changeDirec2Red(GbtDefine.I_WEST_NONE1);
            west_turn_around = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_WEST_NONE1);
            changeDirec2GreenBySmall(GbtDefine.I_WEST_NONE1);
            changeDirec2Green(GbtDefine.I_WEST_NONE1);
            west_turn_around = true;
        }

    }
    /**
     * 点击相位图上，对相位进行配置。
     * 点击单数为放行，双数为不放行。
     */
    private boolean west_left_straight_right = false;
    public void westLeftStraightRight(View v){
        Toast.makeText(this,"西方向特殊进行设置",Toast.LENGTH_SHORT).show();
        if(west_left_straight_right){
            //当north_other 为true时，表示已经放行（绿灯）。此时的点击为红灯，不进行放行
            setNoAllowPhaseByDirec(GbtDefine.I_WEST_NONE2);
            changeDirec2RedBySmall(GbtDefine.I_WEST_NONE2);
            changeDirec2Red(GbtDefine.I_WEST_NONE2);
            west_left_straight_right = false;
        }else{
            //将未放行的相位设置成放行相位，也就是绿灯
            setAllowPhaseByDirec(GbtDefine.I_WEST_NONE2);
            changeDirec2GreenBySmall(GbtDefine.I_WEST_NONE2);
            changeDirec2Green(GbtDefine.I_WEST_NONE2);
            west_left_straight_right = true;
        }

    }



    /**
     * 显示方向的imageview 组件
     * @param gbtDirec
     */
    private void displayImageView(GbtDirec gbtDirec){
        if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
            stage_northLeft.setVisibility(View.VISIBLE);
            stage1_small_northLeft.setVisibility(View.VISIBLE);
            stage2_small_northLeft.setVisibility(View.VISIBLE);
            stage3_small_northLeft.setVisibility(View.VISIBLE);
            stage4_small_northLeft.setVisibility(View.VISIBLE);
            stage5_small_northLeft.setVisibility(View.VISIBLE);
            stage6_small_northLeft.setVisibility(View.VISIBLE);
            stage7_small_northLeft.setVisibility(View.VISIBLE);
            stage8_small_northLeft.setVisibility(View.VISIBLE);
            stage9_small_northLeft.setVisibility(View.VISIBLE);
            stage10_small_northLeft.setVisibility(View.VISIBLE);
            stage11_small_northLeft.setVisibility(View.VISIBLE);
            stage12_small_northLeft.setVisibility(View.VISIBLE);
            stage13_small_northLeft.setVisibility(View.VISIBLE);
            stage14_small_northLeft.setVisibility(View.VISIBLE);
            stage15_small_northLeft.setVisibility(View.VISIBLE);
            stage16_small_northLeft.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
            stage_northStraight.setVisibility(View.VISIBLE);
            stage1_small_northStriaght.setVisibility(View.VISIBLE);
            stage2_small_northStriaght.setVisibility(View.VISIBLE);
            stage3_small_northStriaght.setVisibility(View.VISIBLE);
            stage4_small_northStriaght.setVisibility(View.VISIBLE);
            stage5_small_northStriaght.setVisibility(View.VISIBLE);
            stage6_small_northStriaght.setVisibility(View.VISIBLE);
            stage7_small_northStriaght.setVisibility(View.VISIBLE);
            stage8_small_northStriaght.setVisibility(View.VISIBLE);
            stage9_small_northStriaght.setVisibility(View.VISIBLE);
            stage10_small_northStriaght.setVisibility(View.VISIBLE);
            stage11_small_northStriaght.setVisibility(View.VISIBLE);
            stage12_small_northStriaght.setVisibility(View.VISIBLE);
            stage13_small_northStriaght.setVisibility(View.VISIBLE);
            stage14_small_northStriaght.setVisibility(View.VISIBLE);
            stage15_small_northStriaght.setVisibility(View.VISIBLE);
            stage16_small_northStriaght.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
            stage_northRight.setVisibility(View.VISIBLE);
            stage1_small_northRight.setVisibility(View.VISIBLE);
            stage2_small_northRight.setVisibility(View.VISIBLE);
            stage3_small_northRight.setVisibility(View.VISIBLE);
            stage4_small_northRight.setVisibility(View.VISIBLE);
            stage5_small_northRight.setVisibility(View.VISIBLE);
            stage6_small_northRight.setVisibility(View.VISIBLE);
            stage7_small_northRight.setVisibility(View.VISIBLE);
            stage8_small_northRight.setVisibility(View.VISIBLE);
            stage9_small_northRight.setVisibility(View.VISIBLE);
            stage10_small_northRight.setVisibility(View.VISIBLE);
            stage11_small_northRight.setVisibility(View.VISIBLE);
            stage12_small_northRight.setVisibility(View.VISIBLE);
            stage13_small_northRight.setVisibility(View.VISIBLE);
            stage14_small_northRight.setVisibility(View.VISIBLE);
            stage15_small_northRight.setVisibility(View.VISIBLE);
            stage16_small_northRight.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
            stage_northOther.setVisibility(View.VISIBLE);
            stage1_small_northOther.setVisibility(View.VISIBLE);
            stage2_small_northOther.setVisibility(View.VISIBLE);
            stage3_small_northOther.setVisibility(View.VISIBLE);
            stage4_small_northOther.setVisibility(View.VISIBLE);
            stage5_small_northOther.setVisibility(View.VISIBLE);
            stage6_small_northOther.setVisibility(View.VISIBLE);
            stage7_small_northOther.setVisibility(View.VISIBLE);
            stage8_small_northOther.setVisibility(View.VISIBLE);
            stage9_small_northOther.setVisibility(View.VISIBLE);
            stage10_small_northOther.setVisibility(View.VISIBLE);
            stage11_small_northOther.setVisibility(View.VISIBLE);
            stage12_small_northOther.setVisibility(View.VISIBLE);
            stage13_small_northOther.setVisibility(View.VISIBLE);
            stage14_small_northOther.setVisibility(View.VISIBLE);
            stage15_small_northOther.setVisibility(View.VISIBLE);
            stage16_small_northOther.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
            stage_northPedestrain2.setVisibility(View.VISIBLE);
            stage1_small_northPedestrain2.setVisibility(View.VISIBLE);
            stage2_small_northPedestrain2.setVisibility(View.VISIBLE);
            stage3_small_northPedestrain2.setVisibility(View.VISIBLE);
            stage4_small_northPedestrain2.setVisibility(View.VISIBLE);
            stage5_small_northPedestrain2.setVisibility(View.VISIBLE);
            stage6_small_northPedestrain2.setVisibility(View.VISIBLE);
            stage7_small_northPedestrain2.setVisibility(View.VISIBLE);
            stage8_small_northPedestrain2.setVisibility(View.VISIBLE);
            stage9_small_northPedestrain2.setVisibility(View.VISIBLE);
            stage10_small_northPedestrain2.setVisibility(View.VISIBLE);
            stage11_small_northPedestrain2.setVisibility(View.VISIBLE);
            stage12_small_northPedestrain2.setVisibility(View.VISIBLE);
            stage13_small_northPedestrain2.setVisibility(View.VISIBLE);
            stage14_small_northPedestrain2.setVisibility(View.VISIBLE);
            stage15_small_northPedestrain2.setVisibility(View.VISIBLE);
            stage16_small_northPedestrain2.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
            stage_northPedestrain1.setVisibility(View.VISIBLE);
            stage1_small_northPedestrain1.setVisibility(View.VISIBLE);
            stage2_small_northPedestrain1.setVisibility(View.VISIBLE);
            stage3_small_northPedestrain1.setVisibility(View.VISIBLE);
            stage4_small_northPedestrain1.setVisibility(View.VISIBLE);
            stage5_small_northPedestrain1.setVisibility(View.VISIBLE);
            stage6_small_northPedestrain1.setVisibility(View.VISIBLE);
            stage7_small_northPedestrain1.setVisibility(View.VISIBLE);
            stage8_small_northPedestrain1.setVisibility(View.VISIBLE);
            stage9_small_northPedestrain1.setVisibility(View.VISIBLE);
            stage10_small_northPedestrain1.setVisibility(View.VISIBLE);
            stage11_small_northPedestrain1.setVisibility(View.VISIBLE);
            stage12_small_northPedestrain1.setVisibility(View.VISIBLE);
            stage13_small_northPedestrain1.setVisibility(View.VISIBLE);
            stage14_small_northPedestrain1.setVisibility(View.VISIBLE);
            stage15_small_northPedestrain1.setVisibility(View.VISIBLE);
            stage16_small_northPedestrain1.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
            stage_north_turn_around.setVisibility(View.VISIBLE);
            stage1_small_northNone1.setVisibility(View.VISIBLE);
            stage2_small_northNone1.setVisibility(View.VISIBLE);
            stage3_small_northNone1.setVisibility(View.VISIBLE);
            stage4_small_northNone1.setVisibility(View.VISIBLE);
            stage5_small_northNone1.setVisibility(View.VISIBLE);
            stage6_small_northNone1.setVisibility(View.VISIBLE);
            stage7_small_northNone1.setVisibility(View.VISIBLE);
            stage8_small_northNone1.setVisibility(View.VISIBLE);
            stage9_small_northNone1.setVisibility(View.VISIBLE);
            stage10_small_northNone1.setVisibility(View.VISIBLE);
            stage11_small_northNone1.setVisibility(View.VISIBLE);
            stage12_small_northNone1.setVisibility(View.VISIBLE);
            stage13_small_northNone1.setVisibility(View.VISIBLE);
            stage14_small_northNone1.setVisibility(View.VISIBLE);
            stage15_small_northNone1.setVisibility(View.VISIBLE);
            stage16_small_northNone1.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
            stage_north_left_straight_right.setVisibility(View.VISIBLE);
            stage1_small_northNone2.setVisibility(View.VISIBLE);
            stage2_small_northNone2.setVisibility(View.VISIBLE);
            stage3_small_northNone2.setVisibility(View.VISIBLE);
            stage4_small_northNone2.setVisibility(View.VISIBLE);
            stage5_small_northNone2.setVisibility(View.VISIBLE);
            stage6_small_northNone2.setVisibility(View.VISIBLE);
            stage7_small_northNone2.setVisibility(View.VISIBLE);
            stage8_small_northNone2.setVisibility(View.VISIBLE);
            stage9_small_northNone2.setVisibility(View.VISIBLE);
            stage10_small_northNone2.setVisibility(View.VISIBLE);
            stage11_small_northNone2.setVisibility(View.VISIBLE);
            stage12_small_northNone2.setVisibility(View.VISIBLE);
            stage13_small_northNone2.setVisibility(View.VISIBLE);
            stage14_small_northNone2.setVisibility(View.VISIBLE);
            stage15_small_northNone2.setVisibility(View.VISIBLE);
            stage16_small_northNone2.setVisibility(View.VISIBLE);
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
            stage_eastLeft.setVisibility(View.VISIBLE);
            stage1_small_eastLeft.setVisibility(View.VISIBLE);
            stage2_small_eastLeft.setVisibility(View.VISIBLE);
            stage3_small_eastLeft.setVisibility(View.VISIBLE);
            stage4_small_eastLeft.setVisibility(View.VISIBLE);
            stage5_small_eastLeft.setVisibility(View.VISIBLE);
            stage6_small_eastLeft.setVisibility(View.VISIBLE);
            stage7_small_eastLeft.setVisibility(View.VISIBLE);
            stage8_small_eastLeft.setVisibility(View.VISIBLE);
            stage9_small_eastLeft.setVisibility(View.VISIBLE);
            stage10_small_eastLeft.setVisibility(View.VISIBLE);
            stage11_small_eastLeft.setVisibility(View.VISIBLE);
            stage12_small_eastLeft.setVisibility(View.VISIBLE);
            stage13_small_eastLeft.setVisibility(View.VISIBLE);
            stage14_small_eastLeft.setVisibility(View.VISIBLE);
            stage15_small_eastLeft.setVisibility(View.VISIBLE);
            stage16_small_eastLeft.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
            stage_eastStriaght.setVisibility(View.VISIBLE);
            stage1_small_eastStriaght.setVisibility(View.VISIBLE);
            stage2_small_eastStriaght.setVisibility(View.VISIBLE);
            stage3_small_eastStriaght.setVisibility(View.VISIBLE);
            stage4_small_eastStriaght.setVisibility(View.VISIBLE);
            stage5_small_eastStriaght.setVisibility(View.VISIBLE);
            stage6_small_eastStriaght.setVisibility(View.VISIBLE);
            stage7_small_eastStriaght.setVisibility(View.VISIBLE);
            stage8_small_eastStriaght.setVisibility(View.VISIBLE);
            stage9_small_eastStriaght.setVisibility(View.VISIBLE);
            stage10_small_eastStriaght.setVisibility(View.VISIBLE);
            stage11_small_eastStriaght.setVisibility(View.VISIBLE);
            stage12_small_eastStriaght.setVisibility(View.VISIBLE);
            stage13_small_eastStriaght.setVisibility(View.VISIBLE);
            stage14_small_eastStriaght.setVisibility(View.VISIBLE);
            stage15_small_eastStriaght.setVisibility(View.VISIBLE);
            stage16_small_eastStriaght.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
            stage_eastRight.setVisibility(View.VISIBLE);
            stage1_small_eastRight.setVisibility(View.VISIBLE);
            stage2_small_eastRight.setVisibility(View.VISIBLE);
            stage3_small_eastRight.setVisibility(View.VISIBLE);
            stage4_small_eastRight.setVisibility(View.VISIBLE);
            stage5_small_eastRight.setVisibility(View.VISIBLE);
            stage6_small_eastRight.setVisibility(View.VISIBLE);
            stage7_small_eastRight.setVisibility(View.VISIBLE);
            stage8_small_eastRight.setVisibility(View.VISIBLE);
            stage9_small_eastRight.setVisibility(View.VISIBLE);
            stage10_small_eastRight.setVisibility(View.VISIBLE);
            stage11_small_eastRight.setVisibility(View.VISIBLE);
            stage12_small_eastRight.setVisibility(View.VISIBLE);
            stage13_small_eastRight.setVisibility(View.VISIBLE);
            stage14_small_eastRight.setVisibility(View.VISIBLE);
            stage15_small_eastRight.setVisibility(View.VISIBLE);
            stage16_small_eastRight.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
            stage_eastOther.setVisibility(View.VISIBLE);
            stage1_small_eastOther.setVisibility(View.VISIBLE);
            stage2_small_eastOther.setVisibility(View.VISIBLE);
            stage3_small_eastOther.setVisibility(View.VISIBLE);
            stage4_small_eastOther.setVisibility(View.VISIBLE);
            stage5_small_eastOther.setVisibility(View.VISIBLE);
            stage6_small_eastOther.setVisibility(View.VISIBLE);
            stage7_small_eastOther.setVisibility(View.VISIBLE);
            stage8_small_eastOther.setVisibility(View.VISIBLE);
            stage9_small_eastOther.setVisibility(View.VISIBLE);
            stage10_small_eastOther.setVisibility(View.VISIBLE);
            stage11_small_eastOther.setVisibility(View.VISIBLE);
            stage12_small_eastOther.setVisibility(View.VISIBLE);
            stage13_small_eastOther.setVisibility(View.VISIBLE);
            stage14_small_eastOther.setVisibility(View.VISIBLE);
            stage15_small_eastOther.setVisibility(View.VISIBLE);
            stage16_small_eastOther.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
            stage_eastPedestrain2.setVisibility(View.VISIBLE);
            stage1_small_eastPedestrain2.setVisibility(View.VISIBLE);
            stage2_small_eastPedestrain2.setVisibility(View.VISIBLE);
            stage3_small_eastPedestrain2.setVisibility(View.VISIBLE);
            stage4_small_eastPedestrain2.setVisibility(View.VISIBLE);
            stage5_small_eastPedestrain2.setVisibility(View.VISIBLE);
            stage6_small_eastPedestrain2.setVisibility(View.VISIBLE);
            stage7_small_eastPedestrain2.setVisibility(View.VISIBLE);
            stage8_small_eastPedestrain2.setVisibility(View.VISIBLE);
            stage9_small_eastPedestrain2.setVisibility(View.VISIBLE);
            stage10_small_eastPedestrain2.setVisibility(View.VISIBLE);
            stage11_small_eastPedestrain2.setVisibility(View.VISIBLE);
            stage12_small_eastPedestrain2.setVisibility(View.VISIBLE);
            stage13_small_eastPedestrain2.setVisibility(View.VISIBLE);
            stage14_small_eastPedestrain2.setVisibility(View.VISIBLE);
            stage15_small_eastPedestrain2.setVisibility(View.VISIBLE);
            stage16_small_eastPedestrain2.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
            stage_eastPedestrain1.setVisibility(View.VISIBLE);
            stage1_small_eastPedestrain1.setVisibility(View.VISIBLE);
            stage2_small_eastPedestrain1.setVisibility(View.VISIBLE);
            stage3_small_eastPedestrain1.setVisibility(View.VISIBLE);
            stage4_small_eastPedestrain1.setVisibility(View.VISIBLE);
            stage5_small_eastPedestrain1.setVisibility(View.VISIBLE);
            stage6_small_eastPedestrain1.setVisibility(View.VISIBLE);
            stage7_small_eastPedestrain1.setVisibility(View.VISIBLE);
            stage8_small_eastPedestrain1.setVisibility(View.VISIBLE);
            stage9_small_eastPedestrain1.setVisibility(View.VISIBLE);
            stage10_small_eastPedestrain1.setVisibility(View.VISIBLE);
            stage11_small_eastPedestrain1.setVisibility(View.VISIBLE);
            stage12_small_eastPedestrain1.setVisibility(View.VISIBLE);
            stage13_small_eastPedestrain1.setVisibility(View.VISIBLE);
            stage14_small_eastPedestrain1.setVisibility(View.VISIBLE);
            stage15_small_eastPedestrain1.setVisibility(View.VISIBLE);
            stage16_small_eastPedestrain1.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
            stage_east_turn_around.setVisibility(View.VISIBLE);
            stage1_small_eastNone1.setVisibility(View.VISIBLE);
            stage2_small_eastNone1.setVisibility(View.VISIBLE);
            stage3_small_eastNone1.setVisibility(View.VISIBLE);
            stage4_small_eastNone1.setVisibility(View.VISIBLE);
            stage5_small_eastNone1.setVisibility(View.VISIBLE);
            stage6_small_eastNone1.setVisibility(View.VISIBLE);
            stage7_small_eastNone1.setVisibility(View.VISIBLE);
            stage8_small_eastNone1.setVisibility(View.VISIBLE);
            stage9_small_eastNone1.setVisibility(View.VISIBLE);
            stage10_small_eastNone1.setVisibility(View.VISIBLE);
            stage11_small_eastNone1.setVisibility(View.VISIBLE);
            stage12_small_eastNone1.setVisibility(View.VISIBLE);
            stage13_small_eastNone1.setVisibility(View.VISIBLE);
            stage14_small_eastNone1.setVisibility(View.VISIBLE);
            stage15_small_eastNone1.setVisibility(View.VISIBLE);
            stage16_small_eastNone1.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
            stage_east_left_straight_right.setVisibility(View.VISIBLE);
            stage1_small_eastNone2.setVisibility(View.VISIBLE);
            stage2_small_eastNone2.setVisibility(View.VISIBLE);
            stage3_small_eastNone2.setVisibility(View.VISIBLE);
            stage4_small_eastNone2.setVisibility(View.VISIBLE);
            stage5_small_eastNone2.setVisibility(View.VISIBLE);
            stage6_small_eastNone2.setVisibility(View.VISIBLE);
            stage7_small_eastNone2.setVisibility(View.VISIBLE);
            stage8_small_eastNone2.setVisibility(View.VISIBLE);
            stage9_small_eastNone2.setVisibility(View.VISIBLE);
            stage10_small_eastNone2.setVisibility(View.VISIBLE);
            stage11_small_eastNone2.setVisibility(View.VISIBLE);
            stage12_small_eastNone2.setVisibility(View.VISIBLE);
            stage13_small_eastNone2.setVisibility(View.VISIBLE);
            stage14_small_eastNone2.setVisibility(View.VISIBLE);
            stage15_small_eastNone2.setVisibility(View.VISIBLE);
            stage16_small_eastNone2.setVisibility(View.VISIBLE);
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
            stage_southLeft.setVisibility(View.VISIBLE);
            stage1_small_southLeft.setVisibility(View.VISIBLE);
            stage2_small_southLeft.setVisibility(View.VISIBLE);
            stage3_small_southLeft.setVisibility(View.VISIBLE);
            stage4_small_southLeft.setVisibility(View.VISIBLE);
            stage5_small_southLeft.setVisibility(View.VISIBLE);
            stage6_small_southLeft.setVisibility(View.VISIBLE);
            stage7_small_southLeft.setVisibility(View.VISIBLE);
            stage8_small_southLeft.setVisibility(View.VISIBLE);
            stage9_small_southLeft.setVisibility(View.VISIBLE);
            stage10_small_southLeft.setVisibility(View.VISIBLE);
            stage11_small_southLeft.setVisibility(View.VISIBLE);
            stage12_small_southLeft.setVisibility(View.VISIBLE);
            stage13_small_southLeft.setVisibility(View.VISIBLE);
            stage14_small_southLeft.setVisibility(View.VISIBLE);
            stage15_small_southLeft.setVisibility(View.VISIBLE);
            stage16_small_southLeft.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
            stage_southStriaght.setVisibility(View.VISIBLE);
            stage1_small_southStriaght.setVisibility(View.VISIBLE);
            stage2_small_southStriaght.setVisibility(View.VISIBLE);
            stage3_small_southStriaght.setVisibility(View.VISIBLE);
            stage4_small_southStriaght.setVisibility(View.VISIBLE);
            stage5_small_southStriaght.setVisibility(View.VISIBLE);
            stage6_small_southStriaght.setVisibility(View.VISIBLE);
            stage7_small_southStriaght.setVisibility(View.VISIBLE);
            stage8_small_southStriaght.setVisibility(View.VISIBLE);
            stage9_small_southStriaght.setVisibility(View.VISIBLE);
            stage10_small_southStriaght.setVisibility(View.VISIBLE);
            stage11_small_southStriaght.setVisibility(View.VISIBLE);
            stage12_small_southStriaght.setVisibility(View.VISIBLE);
            stage13_small_southStriaght.setVisibility(View.VISIBLE);
            stage14_small_southStriaght.setVisibility(View.VISIBLE);
            stage15_small_southStriaght.setVisibility(View.VISIBLE);
            stage16_small_southStriaght.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
            stage_southRight.setVisibility(View.VISIBLE);
            stage1_small_southRight.setVisibility(View.VISIBLE);
            stage2_small_southRight.setVisibility(View.VISIBLE);
            stage3_small_southRight.setVisibility(View.VISIBLE);
            stage4_small_southRight.setVisibility(View.VISIBLE);
            stage5_small_southRight.setVisibility(View.VISIBLE);
            stage6_small_southRight.setVisibility(View.VISIBLE);
            stage7_small_southRight.setVisibility(View.VISIBLE);
            stage8_small_southRight.setVisibility(View.VISIBLE);
            stage9_small_southRight.setVisibility(View.VISIBLE);
            stage10_small_southRight.setVisibility(View.VISIBLE);
            stage11_small_southRight.setVisibility(View.VISIBLE);
            stage12_small_southRight.setVisibility(View.VISIBLE);
            stage13_small_southRight.setVisibility(View.VISIBLE);
            stage14_small_southRight.setVisibility(View.VISIBLE);
            stage15_small_southRight.setVisibility(View.VISIBLE);
            stage16_small_southRight.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
            stage_southOther.setVisibility(View.VISIBLE);
            stage1_small_southOther.setVisibility(View.VISIBLE);
            stage2_small_southOther.setVisibility(View.VISIBLE);
            stage3_small_southOther.setVisibility(View.VISIBLE);
            stage4_small_southOther.setVisibility(View.VISIBLE);
            stage5_small_southOther.setVisibility(View.VISIBLE);
            stage6_small_southOther.setVisibility(View.VISIBLE);
            stage7_small_southOther.setVisibility(View.VISIBLE);
            stage8_small_southOther.setVisibility(View.VISIBLE);
            stage9_small_southOther.setVisibility(View.VISIBLE);
            stage10_small_southOther.setVisibility(View.VISIBLE);
            stage11_small_southOther.setVisibility(View.VISIBLE);
            stage12_small_southOther.setVisibility(View.VISIBLE);
            stage13_small_southOther.setVisibility(View.VISIBLE);
            stage14_small_southOther.setVisibility(View.VISIBLE);
            stage15_small_southOther.setVisibility(View.VISIBLE);
            stage16_small_southOther.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
            stage_southPedestrain2.setVisibility(View.VISIBLE);
            stage1_small_southPedestrain2.setVisibility(View.VISIBLE);
            stage2_small_southPedestrain2.setVisibility(View.VISIBLE);
            stage3_small_southPedestrain2.setVisibility(View.VISIBLE);
            stage4_small_southPedestrain2.setVisibility(View.VISIBLE);
            stage5_small_southPedestrain2.setVisibility(View.VISIBLE);
            stage6_small_southPedestrain2.setVisibility(View.VISIBLE);
            stage7_small_southPedestrain2.setVisibility(View.VISIBLE);
            stage8_small_southPedestrain2.setVisibility(View.VISIBLE);
            stage9_small_southPedestrain2.setVisibility(View.VISIBLE);
            stage10_small_southPedestrain2.setVisibility(View.VISIBLE);
            stage11_small_southPedestrain2.setVisibility(View.VISIBLE);
            stage12_small_southPedestrain2.setVisibility(View.VISIBLE);
            stage13_small_southPedestrain2.setVisibility(View.VISIBLE);
            stage14_small_southPedestrain2.setVisibility(View.VISIBLE);
            stage15_small_southPedestrain2.setVisibility(View.VISIBLE);
            stage16_small_southPedestrain2.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
            stage_southPedestrain1.setVisibility(View.VISIBLE);
            stage1_small_southPedestrain1.setVisibility(View.VISIBLE);
            stage2_small_southPedestrain1.setVisibility(View.VISIBLE);
            stage3_small_southPedestrain1.setVisibility(View.VISIBLE);
            stage4_small_southPedestrain1.setVisibility(View.VISIBLE);
            stage5_small_southPedestrain1.setVisibility(View.VISIBLE);
            stage6_small_southPedestrain1.setVisibility(View.VISIBLE);
            stage7_small_southPedestrain1.setVisibility(View.VISIBLE);
            stage8_small_southPedestrain1.setVisibility(View.VISIBLE);
            stage9_small_southPedestrain1.setVisibility(View.VISIBLE);
            stage10_small_southPedestrain1.setVisibility(View.VISIBLE);
            stage11_small_southPedestrain1.setVisibility(View.VISIBLE);
            stage12_small_southPedestrain1.setVisibility(View.VISIBLE);
            stage13_small_southPedestrain1.setVisibility(View.VISIBLE);
            stage14_small_southPedestrain1.setVisibility(View.VISIBLE);
            stage15_small_southPedestrain1.setVisibility(View.VISIBLE);
            stage16_small_southPedestrain1.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
            stage_south_turn_around.setVisibility(View.VISIBLE);
            stage1_small_southNone1.setVisibility(View.VISIBLE);
            stage2_small_southNone1.setVisibility(View.VISIBLE);
            stage3_small_southNone1.setVisibility(View.VISIBLE);
            stage4_small_southNone1.setVisibility(View.VISIBLE);
            stage5_small_southNone1.setVisibility(View.VISIBLE);
            stage6_small_southNone1.setVisibility(View.VISIBLE);
            stage7_small_southNone1.setVisibility(View.VISIBLE);
            stage8_small_southNone1.setVisibility(View.VISIBLE);
            stage9_small_southNone1.setVisibility(View.VISIBLE);
            stage10_small_southNone1.setVisibility(View.VISIBLE);
            stage11_small_southNone1.setVisibility(View.VISIBLE);
            stage12_small_southNone1.setVisibility(View.VISIBLE);
            stage13_small_southNone1.setVisibility(View.VISIBLE);
            stage14_small_southNone1.setVisibility(View.VISIBLE);
            stage15_small_southNone1.setVisibility(View.VISIBLE);
            stage16_small_southNone1.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
            stage_south_left_straight_right.setVisibility(View.VISIBLE);
            stage1_small_southNone2.setVisibility(View.VISIBLE);
            stage2_small_southNone2.setVisibility(View.VISIBLE);
            stage3_small_southNone2.setVisibility(View.VISIBLE);
            stage4_small_southNone2.setVisibility(View.VISIBLE);
            stage5_small_southNone2.setVisibility(View.VISIBLE);
            stage6_small_southNone2.setVisibility(View.VISIBLE);
            stage7_small_southNone2.setVisibility(View.VISIBLE);
            stage8_small_southNone2.setVisibility(View.VISIBLE);
            stage9_small_southNone2.setVisibility(View.VISIBLE);
            stage10_small_southNone2.setVisibility(View.VISIBLE);
            stage11_small_southNone2.setVisibility(View.VISIBLE);
            stage12_small_southNone2.setVisibility(View.VISIBLE);
            stage13_small_southNone2.setVisibility(View.VISIBLE);
            stage14_small_southNone2.setVisibility(View.VISIBLE);
            stage15_small_southNone2.setVisibility(View.VISIBLE);
            stage16_small_southNone2.setVisibility(View.VISIBLE);
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
            stage_westLeft.setVisibility(View.VISIBLE);
            stage1_small_westLeft.setVisibility(View.VISIBLE);
            stage2_small_westLeft.setVisibility(View.VISIBLE);
            stage3_small_westLeft.setVisibility(View.VISIBLE);
            stage4_small_westLeft.setVisibility(View.VISIBLE);
            stage5_small_westLeft.setVisibility(View.VISIBLE);
            stage6_small_westLeft.setVisibility(View.VISIBLE);
            stage7_small_westLeft.setVisibility(View.VISIBLE);
            stage8_small_westLeft.setVisibility(View.VISIBLE);
            stage9_small_westLeft.setVisibility(View.VISIBLE);
            stage10_small_westLeft.setVisibility(View.VISIBLE);
            stage11_small_westLeft.setVisibility(View.VISIBLE);
            stage12_small_westLeft.setVisibility(View.VISIBLE);
            stage13_small_westLeft.setVisibility(View.VISIBLE);
            stage14_small_westLeft.setVisibility(View.VISIBLE);
            stage15_small_westLeft.setVisibility(View.VISIBLE);
            stage16_small_westLeft.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
            stage_westStriaght.setVisibility(View.VISIBLE);
            stage1_small_westStriaght.setVisibility(View.VISIBLE);
            stage2_small_westStriaght.setVisibility(View.VISIBLE);
            stage3_small_westStriaght.setVisibility(View.VISIBLE);
            stage4_small_westStriaght.setVisibility(View.VISIBLE);
            stage5_small_westStriaght.setVisibility(View.VISIBLE);
            stage6_small_westStriaght.setVisibility(View.VISIBLE);
            stage7_small_westStriaght.setVisibility(View.VISIBLE);
            stage8_small_westStriaght.setVisibility(View.VISIBLE);
            stage9_small_westStriaght.setVisibility(View.VISIBLE);
            stage10_small_westStriaght.setVisibility(View.VISIBLE);
            stage11_small_westStriaght.setVisibility(View.VISIBLE);
            stage12_small_westStriaght.setVisibility(View.VISIBLE);
            stage13_small_westStriaght.setVisibility(View.VISIBLE);
            stage14_small_westStriaght.setVisibility(View.VISIBLE);
            stage15_small_westStriaght.setVisibility(View.VISIBLE);
            stage16_small_westStriaght.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
            stage_westRight.setVisibility(View.VISIBLE);
            stage1_small_westRight.setVisibility(View.VISIBLE);
            stage2_small_westRight.setVisibility(View.VISIBLE);
            stage3_small_westRight.setVisibility(View.VISIBLE);
            stage4_small_westRight.setVisibility(View.VISIBLE);
            stage5_small_westRight.setVisibility(View.VISIBLE);
            stage6_small_westRight.setVisibility(View.VISIBLE);
            stage7_small_westRight.setVisibility(View.VISIBLE);
            stage8_small_westRight.setVisibility(View.VISIBLE);
            stage9_small_westRight.setVisibility(View.VISIBLE);
            stage10_small_westRight.setVisibility(View.VISIBLE);
            stage11_small_westRight.setVisibility(View.VISIBLE);
            stage12_small_westRight.setVisibility(View.VISIBLE);
            stage13_small_westRight.setVisibility(View.VISIBLE);
            stage14_small_westRight.setVisibility(View.VISIBLE);
            stage15_small_westRight.setVisibility(View.VISIBLE);
            stage16_small_westRight.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_WEST_OTHER){
            stage_westOther.setVisibility(View.VISIBLE);
            stage1_small_westOther.setVisibility(View.VISIBLE);
            stage2_small_westOther.setVisibility(View.VISIBLE);
            stage3_small_westOther.setVisibility(View.VISIBLE);
            stage4_small_westOther.setVisibility(View.VISIBLE);
            stage5_small_westOther.setVisibility(View.VISIBLE);
            stage6_small_westOther.setVisibility(View.VISIBLE);
            stage7_small_westOther.setVisibility(View.VISIBLE);
            stage8_small_westOther.setVisibility(View.VISIBLE);
            stage9_small_westOther.setVisibility(View.VISIBLE);
            stage10_small_westOther.setVisibility(View.VISIBLE);
            stage11_small_westOther.setVisibility(View.VISIBLE);
            stage12_small_westOther.setVisibility(View.VISIBLE);
            stage13_small_westOther.setVisibility(View.VISIBLE);
            stage14_small_westOther.setVisibility(View.VISIBLE);
            stage15_small_westOther.setVisibility(View.VISIBLE);
            stage16_small_westOther.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
            stage_westPedestrain2.setVisibility(View.VISIBLE);
            stage1_small_westPedestrain2.setVisibility(View.VISIBLE);
            stage2_small_westPedestrain2.setVisibility(View.VISIBLE);
            stage3_small_westPedestrain2.setVisibility(View.VISIBLE);
            stage4_small_westPedestrain2.setVisibility(View.VISIBLE);
            stage5_small_westPedestrain2.setVisibility(View.VISIBLE);
            stage6_small_westPedestrain2.setVisibility(View.VISIBLE);
            stage7_small_westPedestrain2.setVisibility(View.VISIBLE);
            stage8_small_westPedestrain2.setVisibility(View.VISIBLE);
            stage9_small_westPedestrain2.setVisibility(View.VISIBLE);
            stage10_small_westPedestrain2.setVisibility(View.VISIBLE);
            stage11_small_westPedestrain2.setVisibility(View.VISIBLE);
            stage12_small_westPedestrain2.setVisibility(View.VISIBLE);
            stage13_small_westPedestrain2.setVisibility(View.VISIBLE);
            stage14_small_westPedestrain2.setVisibility(View.VISIBLE);
            stage15_small_westPedestrain2.setVisibility(View.VISIBLE);
            stage16_small_westPedestrain2.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
            stage_westPedestrain1.setVisibility(View.VISIBLE);
            stage1_small_westPedestrain1.setVisibility(View.VISIBLE);
            stage2_small_westPedestrain1.setVisibility(View.VISIBLE);
            stage3_small_westPedestrain1.setVisibility(View.VISIBLE);
            stage4_small_westPedestrain1.setVisibility(View.VISIBLE);
            stage5_small_westPedestrain1.setVisibility(View.VISIBLE);
            stage6_small_westPedestrain1.setVisibility(View.VISIBLE);
            stage7_small_westPedestrain1.setVisibility(View.VISIBLE);
            stage8_small_westPedestrain1.setVisibility(View.VISIBLE);
            stage9_small_westPedestrain1.setVisibility(View.VISIBLE);
            stage10_small_westPedestrain1.setVisibility(View.VISIBLE);
            stage11_small_westPedestrain1.setVisibility(View.VISIBLE);
            stage12_small_westPedestrain1.setVisibility(View.VISIBLE);
            stage13_small_westPedestrain1.setVisibility(View.VISIBLE);
            stage14_small_westPedestrain1.setVisibility(View.VISIBLE);
            stage15_small_westPedestrain1.setVisibility(View.VISIBLE);
            stage16_small_westPedestrain1.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
            stage_west_turn_around.setVisibility(View.VISIBLE);
            stage1_small_westNone1.setVisibility(View.VISIBLE);
            stage2_small_westNone1.setVisibility(View.VISIBLE);
            stage3_small_westNone1.setVisibility(View.VISIBLE);
            stage4_small_westNone1.setVisibility(View.VISIBLE);
            stage5_small_westNone1.setVisibility(View.VISIBLE);
            stage6_small_westNone1.setVisibility(View.VISIBLE);
            stage7_small_westNone1.setVisibility(View.VISIBLE);
            stage8_small_westNone1.setVisibility(View.VISIBLE);
            stage9_small_westNone1.setVisibility(View.VISIBLE);
            stage10_small_westNone1.setVisibility(View.VISIBLE);
            stage11_small_westNone1.setVisibility(View.VISIBLE);
            stage12_small_westNone1.setVisibility(View.VISIBLE);
            stage13_small_westNone1.setVisibility(View.VISIBLE);
            stage14_small_westNone1.setVisibility(View.VISIBLE);
            stage15_small_westNone1.setVisibility(View.VISIBLE);
            stage16_small_westNone1.setVisibility(View.VISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2){
            stage_west_left_straight_right.setVisibility(View.VISIBLE);
            stage1_small_westNone2.setVisibility(View.VISIBLE);
            stage2_small_westNone2.setVisibility(View.VISIBLE);
            stage3_small_westNone2.setVisibility(View.VISIBLE);
            stage4_small_westNone2.setVisibility(View.VISIBLE);
            stage5_small_westNone2.setVisibility(View.VISIBLE);
            stage6_small_westNone2.setVisibility(View.VISIBLE);
            stage7_small_westNone2.setVisibility(View.VISIBLE);
            stage8_small_westNone2.setVisibility(View.VISIBLE);
            stage9_small_westNone2.setVisibility(View.VISIBLE);
            stage10_small_westNone2.setVisibility(View.VISIBLE);
            stage11_small_westNone2.setVisibility(View.VISIBLE);
            stage12_small_westNone2.setVisibility(View.VISIBLE);
            stage13_small_westNone2.setVisibility(View.VISIBLE);
            stage14_small_westNone2.setVisibility(View.VISIBLE);
            stage15_small_westNone2.setVisibility(View.VISIBLE);
            stage16_small_westNone2.setVisibility(View.VISIBLE);
        }
    }

    /**
     * 这里主要是在初始化的时候隐藏没有配置相位的方向
     * @param gbtDirec
     */
    private void hiddenImageView(GbtDirec gbtDirec){
        if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
            stage_northLeft.setVisibility(View.INVISIBLE);
            stage1_small_northLeft.setVisibility(View.INVISIBLE);
            stage2_small_northLeft.setVisibility(View.INVISIBLE);
            stage3_small_northLeft.setVisibility(View.INVISIBLE);
            stage4_small_northLeft.setVisibility(View.INVISIBLE);
            stage5_small_northLeft.setVisibility(View.INVISIBLE);
            stage6_small_northLeft.setVisibility(View.INVISIBLE);
            stage7_small_northLeft.setVisibility(View.INVISIBLE);
            stage8_small_northLeft.setVisibility(View.INVISIBLE);
            stage9_small_northLeft.setVisibility(View.INVISIBLE);
            stage10_small_northLeft.setVisibility(View.INVISIBLE);
            stage11_small_northLeft.setVisibility(View.INVISIBLE);
            stage12_small_northLeft.setVisibility(View.INVISIBLE);
            stage13_small_northLeft.setVisibility(View.INVISIBLE);
            stage14_small_northLeft.setVisibility(View.INVISIBLE);
            stage15_small_northLeft.setVisibility(View.INVISIBLE);
            stage16_small_northLeft.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
            stage_northStraight.setVisibility(View.INVISIBLE);
            stage1_small_northStriaght.setVisibility(View.INVISIBLE);
            stage2_small_northStriaght.setVisibility(View.INVISIBLE);
            stage3_small_northStriaght.setVisibility(View.INVISIBLE);
            stage4_small_northStriaght.setVisibility(View.INVISIBLE);
            stage5_small_northStriaght.setVisibility(View.INVISIBLE);
            stage6_small_northStriaght.setVisibility(View.INVISIBLE);
            stage7_small_northStriaght.setVisibility(View.INVISIBLE);
            stage8_small_northStriaght.setVisibility(View.INVISIBLE);
            stage9_small_northStriaght.setVisibility(View.INVISIBLE);
            stage10_small_northStriaght.setVisibility(View.INVISIBLE);
            stage11_small_northStriaght.setVisibility(View.INVISIBLE);
            stage12_small_northStriaght.setVisibility(View.INVISIBLE);
            stage13_small_northStriaght.setVisibility(View.INVISIBLE);
            stage14_small_northStriaght.setVisibility(View.INVISIBLE);
            stage15_small_northStriaght.setVisibility(View.INVISIBLE);
            stage16_small_northStriaght.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
            stage_northRight.setVisibility(View.INVISIBLE);
            stage1_small_northRight.setVisibility(View.INVISIBLE);
            stage2_small_northRight.setVisibility(View.INVISIBLE);
            stage3_small_northRight.setVisibility(View.INVISIBLE);
            stage4_small_northRight.setVisibility(View.INVISIBLE);
            stage5_small_northRight.setVisibility(View.INVISIBLE);
            stage6_small_northRight.setVisibility(View.INVISIBLE);
            stage7_small_northRight.setVisibility(View.INVISIBLE);
            stage8_small_northRight.setVisibility(View.INVISIBLE);
            stage9_small_northRight.setVisibility(View.INVISIBLE);
            stage10_small_northRight.setVisibility(View.INVISIBLE);
            stage11_small_northRight.setVisibility(View.INVISIBLE);
            stage12_small_northRight.setVisibility(View.INVISIBLE);
            stage13_small_northRight.setVisibility(View.INVISIBLE);
            stage14_small_northRight.setVisibility(View.INVISIBLE);
            stage15_small_northRight.setVisibility(View.INVISIBLE);
            stage16_small_northRight.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
            stage_northOther.setVisibility(View.INVISIBLE);
            stage1_small_northOther.setVisibility(View.INVISIBLE);
            stage2_small_northOther.setVisibility(View.INVISIBLE);
            stage3_small_northOther.setVisibility(View.INVISIBLE);
            stage4_small_northOther.setVisibility(View.INVISIBLE);
            stage5_small_northOther.setVisibility(View.INVISIBLE);
            stage6_small_northOther.setVisibility(View.INVISIBLE);
            stage7_small_northOther.setVisibility(View.INVISIBLE);
            stage8_small_northOther.setVisibility(View.INVISIBLE);
            stage9_small_northOther.setVisibility(View.INVISIBLE);
            stage10_small_northOther.setVisibility(View.INVISIBLE);
            stage11_small_northOther.setVisibility(View.INVISIBLE);
            stage12_small_northOther.setVisibility(View.INVISIBLE);
            stage13_small_northOther.setVisibility(View.INVISIBLE);
            stage14_small_northOther.setVisibility(View.INVISIBLE);
            stage15_small_northOther.setVisibility(View.INVISIBLE);
            stage16_small_northOther.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
            stage_northPedestrain2.setVisibility(View.INVISIBLE);
            stage1_small_northPedestrain2.setVisibility(View.INVISIBLE);
            stage2_small_northPedestrain2.setVisibility(View.INVISIBLE);
            stage3_small_northPedestrain2.setVisibility(View.INVISIBLE);
            stage4_small_northPedestrain2.setVisibility(View.INVISIBLE);
            stage5_small_northPedestrain2.setVisibility(View.INVISIBLE);
            stage6_small_northPedestrain2.setVisibility(View.INVISIBLE);
            stage7_small_northPedestrain2.setVisibility(View.INVISIBLE);
            stage8_small_northPedestrain2.setVisibility(View.INVISIBLE);
            stage9_small_northPedestrain2.setVisibility(View.INVISIBLE);
            stage10_small_northPedestrain2.setVisibility(View.INVISIBLE);
            stage11_small_northPedestrain2.setVisibility(View.INVISIBLE);
            stage12_small_northPedestrain2.setVisibility(View.INVISIBLE);
            stage13_small_northPedestrain2.setVisibility(View.INVISIBLE);
            stage14_small_northPedestrain2.setVisibility(View.INVISIBLE);
            stage15_small_northPedestrain2.setVisibility(View.INVISIBLE);
            stage16_small_northPedestrain2.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
            stage_northPedestrain1.setVisibility(View.INVISIBLE);
            stage1_small_northPedestrain1.setVisibility(View.INVISIBLE);
            stage2_small_northPedestrain1.setVisibility(View.INVISIBLE);
            stage3_small_northPedestrain1.setVisibility(View.INVISIBLE);
            stage4_small_northPedestrain1.setVisibility(View.INVISIBLE);
            stage5_small_northPedestrain1.setVisibility(View.INVISIBLE);
            stage6_small_northPedestrain1.setVisibility(View.INVISIBLE);
            stage7_small_northPedestrain1.setVisibility(View.INVISIBLE);
            stage8_small_northPedestrain1.setVisibility(View.INVISIBLE);
            stage9_small_northPedestrain1.setVisibility(View.INVISIBLE);
            stage10_small_northPedestrain1.setVisibility(View.INVISIBLE);
            stage11_small_northPedestrain1.setVisibility(View.INVISIBLE);
            stage12_small_northPedestrain1.setVisibility(View.INVISIBLE);
            stage13_small_northPedestrain1.setVisibility(View.INVISIBLE);
            stage14_small_northPedestrain1.setVisibility(View.INVISIBLE);
            stage15_small_northPedestrain1.setVisibility(View.INVISIBLE);
            stage16_small_northPedestrain1.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
            stage_north_turn_around.setVisibility(View.INVISIBLE);
            stage1_small_northNone1.setVisibility(View.INVISIBLE);
            stage2_small_northNone1.setVisibility(View.INVISIBLE);
            stage3_small_northNone1.setVisibility(View.INVISIBLE);
            stage4_small_northNone1.setVisibility(View.INVISIBLE);
            stage5_small_northNone1.setVisibility(View.INVISIBLE);
            stage6_small_northNone1.setVisibility(View.INVISIBLE);
            stage7_small_northNone1.setVisibility(View.INVISIBLE);
            stage8_small_northNone1.setVisibility(View.INVISIBLE);
            stage9_small_northNone1.setVisibility(View.INVISIBLE);
            stage10_small_northNone1.setVisibility(View.INVISIBLE);
            stage11_small_northNone1.setVisibility(View.INVISIBLE);
            stage12_small_northNone1.setVisibility(View.INVISIBLE);
            stage13_small_northNone1.setVisibility(View.INVISIBLE);
            stage14_small_northNone1.setVisibility(View.INVISIBLE);
            stage15_small_northNone1.setVisibility(View.INVISIBLE);
            stage16_small_northNone1.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
            stage_north_left_straight_right.setVisibility(View.INVISIBLE);
            stage1_small_northNone2.setVisibility(View.INVISIBLE);
            stage2_small_northNone2.setVisibility(View.INVISIBLE);
            stage3_small_northNone2.setVisibility(View.INVISIBLE);
            stage4_small_northNone2.setVisibility(View.INVISIBLE);
            stage5_small_northNone2.setVisibility(View.INVISIBLE);
            stage6_small_northNone2.setVisibility(View.INVISIBLE);
            stage7_small_northNone2.setVisibility(View.INVISIBLE);
            stage8_small_northNone2.setVisibility(View.INVISIBLE);
            stage9_small_northNone2.setVisibility(View.INVISIBLE);
            stage10_small_northNone2.setVisibility(View.INVISIBLE);
            stage11_small_northNone2.setVisibility(View.INVISIBLE);
            stage12_small_northNone2.setVisibility(View.INVISIBLE);
            stage13_small_northNone2.setVisibility(View.INVISIBLE);
            stage14_small_northNone2.setVisibility(View.INVISIBLE);
            stage15_small_northNone2.setVisibility(View.INVISIBLE);
            stage16_small_northNone2.setVisibility(View.INVISIBLE);
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
            stage_eastLeft.setVisibility(View.INVISIBLE);
            stage1_small_eastLeft.setVisibility(View.INVISIBLE);
            stage2_small_eastLeft.setVisibility(View.INVISIBLE);
            stage3_small_eastLeft.setVisibility(View.INVISIBLE);
            stage4_small_eastLeft.setVisibility(View.INVISIBLE);
            stage5_small_eastLeft.setVisibility(View.INVISIBLE);
            stage6_small_eastLeft.setVisibility(View.INVISIBLE);
            stage7_small_eastLeft.setVisibility(View.INVISIBLE);
            stage8_small_eastLeft.setVisibility(View.INVISIBLE);
            stage9_small_eastLeft.setVisibility(View.INVISIBLE);
            stage10_small_eastLeft.setVisibility(View.INVISIBLE);
            stage11_small_eastLeft.setVisibility(View.INVISIBLE);
            stage12_small_eastLeft.setVisibility(View.INVISIBLE);
            stage13_small_eastLeft.setVisibility(View.INVISIBLE);
            stage14_small_eastLeft.setVisibility(View.INVISIBLE);
            stage15_small_eastLeft.setVisibility(View.INVISIBLE);
            stage16_small_eastLeft.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
            stage_eastStriaght.setVisibility(View.INVISIBLE);
            stage1_small_eastStriaght.setVisibility(View.INVISIBLE);
            stage2_small_eastStriaght.setVisibility(View.INVISIBLE);
            stage3_small_eastStriaght.setVisibility(View.INVISIBLE);
            stage4_small_eastStriaght.setVisibility(View.INVISIBLE);
            stage5_small_eastStriaght.setVisibility(View.INVISIBLE);
            stage6_small_eastStriaght.setVisibility(View.INVISIBLE);
            stage7_small_eastStriaght.setVisibility(View.INVISIBLE);
            stage8_small_eastStriaght.setVisibility(View.INVISIBLE);
            stage9_small_eastStriaght.setVisibility(View.INVISIBLE);
            stage10_small_eastStriaght.setVisibility(View.INVISIBLE);
            stage11_small_eastStriaght.setVisibility(View.INVISIBLE);
            stage12_small_eastStriaght.setVisibility(View.INVISIBLE);
            stage13_small_eastStriaght.setVisibility(View.INVISIBLE);
            stage14_small_eastStriaght.setVisibility(View.INVISIBLE);
            stage15_small_eastStriaght.setVisibility(View.INVISIBLE);
            stage16_small_eastStriaght.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
            stage_eastRight.setVisibility(View.INVISIBLE);
            stage1_small_eastRight.setVisibility(View.INVISIBLE);
            stage2_small_eastRight.setVisibility(View.INVISIBLE);
            stage3_small_eastRight.setVisibility(View.INVISIBLE);
            stage4_small_eastRight.setVisibility(View.INVISIBLE);
            stage5_small_eastRight.setVisibility(View.INVISIBLE);
            stage6_small_eastRight.setVisibility(View.INVISIBLE);
            stage7_small_eastRight.setVisibility(View.INVISIBLE);
            stage8_small_eastRight.setVisibility(View.INVISIBLE);
            stage9_small_eastRight.setVisibility(View.INVISIBLE);
            stage10_small_eastRight.setVisibility(View.INVISIBLE);
            stage11_small_eastRight.setVisibility(View.INVISIBLE);
            stage12_small_eastRight.setVisibility(View.INVISIBLE);
            stage13_small_eastRight.setVisibility(View.INVISIBLE);
            stage14_small_eastRight.setVisibility(View.INVISIBLE);
            stage15_small_eastRight.setVisibility(View.INVISIBLE);
            stage16_small_eastRight.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
            stage_eastOther.setVisibility(View.INVISIBLE);
            stage1_small_eastOther.setVisibility(View.INVISIBLE);
            stage2_small_eastOther.setVisibility(View.INVISIBLE);
            stage3_small_eastOther.setVisibility(View.INVISIBLE);
            stage4_small_eastOther.setVisibility(View.INVISIBLE);
            stage5_small_eastOther.setVisibility(View.INVISIBLE);
            stage6_small_eastOther.setVisibility(View.INVISIBLE);
            stage7_small_eastOther.setVisibility(View.INVISIBLE);
            stage8_small_eastOther.setVisibility(View.INVISIBLE);
            stage9_small_eastOther.setVisibility(View.INVISIBLE);
            stage10_small_eastOther.setVisibility(View.INVISIBLE);
            stage11_small_eastOther.setVisibility(View.INVISIBLE);
            stage12_small_eastOther.setVisibility(View.INVISIBLE);
            stage13_small_eastOther.setVisibility(View.INVISIBLE);
            stage14_small_eastOther.setVisibility(View.INVISIBLE);
            stage15_small_eastOther.setVisibility(View.INVISIBLE);
            stage16_small_eastOther.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
            stage_eastPedestrain2.setVisibility(View.INVISIBLE);
            stage1_small_eastPedestrain2.setVisibility(View.INVISIBLE);
            stage2_small_eastPedestrain2.setVisibility(View.INVISIBLE);
            stage3_small_eastPedestrain2.setVisibility(View.INVISIBLE);
            stage4_small_eastPedestrain2.setVisibility(View.INVISIBLE);
            stage5_small_eastPedestrain2.setVisibility(View.INVISIBLE);
            stage6_small_eastPedestrain2.setVisibility(View.INVISIBLE);
            stage7_small_eastPedestrain2.setVisibility(View.INVISIBLE);
            stage8_small_eastPedestrain2.setVisibility(View.INVISIBLE);
            stage9_small_eastPedestrain2.setVisibility(View.INVISIBLE);
            stage10_small_eastPedestrain2.setVisibility(View.INVISIBLE);
            stage11_small_eastPedestrain2.setVisibility(View.INVISIBLE);
            stage12_small_eastPedestrain2.setVisibility(View.INVISIBLE);
            stage13_small_eastPedestrain2.setVisibility(View.INVISIBLE);
            stage14_small_eastPedestrain2.setVisibility(View.INVISIBLE);
            stage15_small_eastPedestrain2.setVisibility(View.INVISIBLE);
            stage16_small_eastPedestrain2.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
            stage_eastPedestrain1.setVisibility(View.INVISIBLE);
            stage1_small_eastPedestrain1.setVisibility(View.INVISIBLE);
            stage2_small_eastPedestrain1.setVisibility(View.INVISIBLE);
            stage3_small_eastPedestrain1.setVisibility(View.INVISIBLE);
            stage4_small_eastPedestrain1.setVisibility(View.INVISIBLE);
            stage5_small_eastPedestrain1.setVisibility(View.INVISIBLE);
            stage6_small_eastPedestrain1.setVisibility(View.INVISIBLE);
            stage7_small_eastPedestrain1.setVisibility(View.INVISIBLE);
            stage8_small_eastPedestrain1.setVisibility(View.INVISIBLE);
            stage9_small_eastPedestrain1.setVisibility(View.INVISIBLE);
            stage10_small_eastPedestrain1.setVisibility(View.INVISIBLE);
            stage11_small_eastPedestrain1.setVisibility(View.INVISIBLE);
            stage12_small_eastPedestrain1.setVisibility(View.INVISIBLE);
            stage13_small_eastPedestrain1.setVisibility(View.INVISIBLE);
            stage14_small_eastPedestrain1.setVisibility(View.INVISIBLE);
            stage15_small_eastPedestrain1.setVisibility(View.INVISIBLE);
            stage16_small_eastPedestrain1.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
            stage_east_turn_around.setVisibility(View.INVISIBLE);
            stage1_small_eastNone1.setVisibility(View.INVISIBLE);
            stage2_small_eastNone1.setVisibility(View.INVISIBLE);
            stage3_small_eastNone1.setVisibility(View.INVISIBLE);
            stage4_small_eastNone1.setVisibility(View.INVISIBLE);
            stage5_small_eastNone1.setVisibility(View.INVISIBLE);
            stage6_small_eastNone1.setVisibility(View.INVISIBLE);
            stage7_small_eastNone1.setVisibility(View.INVISIBLE);
            stage8_small_eastNone1.setVisibility(View.INVISIBLE);
            stage9_small_eastNone1.setVisibility(View.INVISIBLE);
            stage10_small_eastNone1.setVisibility(View.INVISIBLE);
            stage11_small_eastNone1.setVisibility(View.INVISIBLE);
            stage12_small_eastNone1.setVisibility(View.INVISIBLE);
            stage13_small_eastNone1.setVisibility(View.INVISIBLE);
            stage14_small_eastNone1.setVisibility(View.INVISIBLE);
            stage15_small_eastNone1.setVisibility(View.INVISIBLE);
            stage16_small_eastNone1.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
            stage_east_left_straight_right.setVisibility(View.INVISIBLE);
            stage1_small_eastNone2.setVisibility(View.INVISIBLE);
            stage2_small_eastNone2.setVisibility(View.INVISIBLE);
            stage3_small_eastNone2.setVisibility(View.INVISIBLE);
            stage4_small_eastNone2.setVisibility(View.INVISIBLE);
            stage5_small_eastNone2.setVisibility(View.INVISIBLE);
            stage6_small_eastNone2.setVisibility(View.INVISIBLE);
            stage7_small_eastNone2.setVisibility(View.INVISIBLE);
            stage8_small_eastNone2.setVisibility(View.INVISIBLE);
            stage9_small_eastNone2.setVisibility(View.INVISIBLE);
            stage10_small_eastNone2.setVisibility(View.INVISIBLE);
            stage11_small_eastNone2.setVisibility(View.INVISIBLE);
            stage12_small_eastNone2.setVisibility(View.INVISIBLE);
            stage13_small_eastNone2.setVisibility(View.INVISIBLE);
            stage14_small_eastNone2.setVisibility(View.INVISIBLE);
            stage15_small_eastNone2.setVisibility(View.INVISIBLE);
            stage16_small_eastNone2.setVisibility(View.INVISIBLE);
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
            stage_southLeft.setVisibility(View.INVISIBLE);
            stage1_small_southLeft.setVisibility(View.INVISIBLE);
            stage2_small_southLeft.setVisibility(View.INVISIBLE);
            stage3_small_southLeft.setVisibility(View.INVISIBLE);
            stage4_small_southLeft.setVisibility(View.INVISIBLE);
            stage5_small_southLeft.setVisibility(View.INVISIBLE);
            stage6_small_southLeft.setVisibility(View.INVISIBLE);
            stage7_small_southLeft.setVisibility(View.INVISIBLE);
            stage8_small_southLeft.setVisibility(View.INVISIBLE);
            stage9_small_southLeft.setVisibility(View.INVISIBLE);
            stage10_small_southLeft.setVisibility(View.INVISIBLE);
            stage11_small_southLeft.setVisibility(View.INVISIBLE);
            stage12_small_southLeft.setVisibility(View.INVISIBLE);
            stage13_small_southLeft.setVisibility(View.INVISIBLE);
            stage14_small_southLeft.setVisibility(View.INVISIBLE);
            stage15_small_southLeft.setVisibility(View.INVISIBLE);
            stage16_small_southLeft.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
            stage_southStriaght.setVisibility(View.INVISIBLE);
            stage1_small_southStriaght.setVisibility(View.INVISIBLE);
            stage2_small_southStriaght.setVisibility(View.INVISIBLE);
            stage3_small_southStriaght.setVisibility(View.INVISIBLE);
            stage4_small_southStriaght.setVisibility(View.INVISIBLE);
            stage5_small_southStriaght.setVisibility(View.INVISIBLE);
            stage6_small_southStriaght.setVisibility(View.INVISIBLE);
            stage7_small_southStriaght.setVisibility(View.INVISIBLE);
            stage8_small_southStriaght.setVisibility(View.INVISIBLE);
            stage9_small_southStriaght.setVisibility(View.INVISIBLE);
            stage10_small_southStriaght.setVisibility(View.INVISIBLE);
            stage11_small_southStriaght.setVisibility(View.INVISIBLE);
            stage12_small_southStriaght.setVisibility(View.INVISIBLE);
            stage13_small_southStriaght.setVisibility(View.INVISIBLE);
            stage14_small_southStriaght.setVisibility(View.INVISIBLE);
            stage15_small_southStriaght.setVisibility(View.INVISIBLE);
            stage16_small_southStriaght.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
            stage_southRight.setVisibility(View.INVISIBLE);
            stage1_small_southRight.setVisibility(View.INVISIBLE);
            stage2_small_southRight.setVisibility(View.INVISIBLE);
            stage3_small_southRight.setVisibility(View.INVISIBLE);
            stage4_small_southRight.setVisibility(View.INVISIBLE);
            stage5_small_southRight.setVisibility(View.INVISIBLE);
            stage6_small_southRight.setVisibility(View.INVISIBLE);
            stage7_small_southRight.setVisibility(View.INVISIBLE);
            stage8_small_southRight.setVisibility(View.INVISIBLE);
            stage9_small_southRight.setVisibility(View.INVISIBLE);
            stage10_small_southRight.setVisibility(View.INVISIBLE);
            stage11_small_southRight.setVisibility(View.INVISIBLE);
            stage12_small_southRight.setVisibility(View.INVISIBLE);
            stage13_small_southRight.setVisibility(View.INVISIBLE);
            stage14_small_southRight.setVisibility(View.INVISIBLE);
            stage15_small_southRight.setVisibility(View.INVISIBLE);
            stage16_small_southRight.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
            stage_southOther.setVisibility(View.INVISIBLE);
            stage1_small_southOther.setVisibility(View.INVISIBLE);
            stage2_small_southOther.setVisibility(View.INVISIBLE);
            stage3_small_southOther.setVisibility(View.INVISIBLE);
            stage4_small_southOther.setVisibility(View.INVISIBLE);
            stage5_small_southOther.setVisibility(View.INVISIBLE);
            stage6_small_southOther.setVisibility(View.INVISIBLE);
            stage7_small_southOther.setVisibility(View.INVISIBLE);
            stage8_small_southOther.setVisibility(View.INVISIBLE);
            stage9_small_southOther.setVisibility(View.INVISIBLE);
            stage10_small_southOther.setVisibility(View.INVISIBLE);
            stage11_small_southOther.setVisibility(View.INVISIBLE);
            stage12_small_southOther.setVisibility(View.INVISIBLE);
            stage13_small_southOther.setVisibility(View.INVISIBLE);
            stage14_small_southOther.setVisibility(View.INVISIBLE);
            stage15_small_southOther.setVisibility(View.INVISIBLE);
            stage16_small_southOther.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
            stage_southPedestrain2.setVisibility(View.INVISIBLE);
            stage1_small_southPedestrain2.setVisibility(View.INVISIBLE);
            stage2_small_southPedestrain2.setVisibility(View.INVISIBLE);
            stage3_small_southPedestrain2.setVisibility(View.INVISIBLE);
            stage4_small_southPedestrain2.setVisibility(View.INVISIBLE);
            stage5_small_southPedestrain2.setVisibility(View.INVISIBLE);
            stage6_small_southPedestrain2.setVisibility(View.INVISIBLE);
            stage7_small_southPedestrain2.setVisibility(View.INVISIBLE);
            stage8_small_southPedestrain2.setVisibility(View.INVISIBLE);
            stage9_small_southPedestrain2.setVisibility(View.INVISIBLE);
            stage10_small_southPedestrain2.setVisibility(View.INVISIBLE);
            stage11_small_southPedestrain2.setVisibility(View.INVISIBLE);
            stage12_small_southPedestrain2.setVisibility(View.INVISIBLE);
            stage13_small_southPedestrain2.setVisibility(View.INVISIBLE);
            stage14_small_southPedestrain2.setVisibility(View.INVISIBLE);
            stage15_small_southPedestrain2.setVisibility(View.INVISIBLE);
            stage16_small_southPedestrain2.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
            stage_southPedestrain1.setVisibility(View.INVISIBLE);
            stage1_small_southPedestrain1.setVisibility(View.INVISIBLE);
            stage2_small_southPedestrain1.setVisibility(View.INVISIBLE);
            stage3_small_southPedestrain1.setVisibility(View.INVISIBLE);
            stage4_small_southPedestrain1.setVisibility(View.INVISIBLE);
            stage5_small_southPedestrain1.setVisibility(View.INVISIBLE);
            stage6_small_southPedestrain1.setVisibility(View.INVISIBLE);
            stage7_small_southPedestrain1.setVisibility(View.INVISIBLE);
            stage8_small_southPedestrain1.setVisibility(View.INVISIBLE);
            stage9_small_southPedestrain1.setVisibility(View.INVISIBLE);
            stage10_small_southPedestrain1.setVisibility(View.INVISIBLE);
            stage11_small_southPedestrain1.setVisibility(View.INVISIBLE);
            stage12_small_southPedestrain1.setVisibility(View.INVISIBLE);
            stage13_small_southPedestrain1.setVisibility(View.INVISIBLE);
            stage14_small_southPedestrain1.setVisibility(View.INVISIBLE);
            stage15_small_southPedestrain1.setVisibility(View.INVISIBLE);
            stage16_small_southPedestrain1.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
            stage_south_turn_around.setVisibility(View.INVISIBLE);
            stage1_small_southNone1.setVisibility(View.INVISIBLE);
            stage2_small_southNone1.setVisibility(View.INVISIBLE);
            stage3_small_southNone1.setVisibility(View.INVISIBLE);
            stage4_small_southNone1.setVisibility(View.INVISIBLE);
            stage5_small_southNone1.setVisibility(View.INVISIBLE);
            stage6_small_southNone1.setVisibility(View.INVISIBLE);
            stage7_small_southNone1.setVisibility(View.INVISIBLE);
            stage8_small_southNone1.setVisibility(View.INVISIBLE);
            stage9_small_southNone1.setVisibility(View.INVISIBLE);
            stage10_small_southNone1.setVisibility(View.INVISIBLE);
            stage11_small_southNone1.setVisibility(View.INVISIBLE);
            stage12_small_southNone1.setVisibility(View.INVISIBLE);
            stage13_small_southNone1.setVisibility(View.INVISIBLE);
            stage14_small_southNone1.setVisibility(View.INVISIBLE);
            stage15_small_southNone1.setVisibility(View.INVISIBLE);
            stage16_small_southNone1.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
            stage_south_left_straight_right.setVisibility(View.INVISIBLE);
            stage1_small_southNone2.setVisibility(View.INVISIBLE);
            stage2_small_southNone2.setVisibility(View.INVISIBLE);
            stage3_small_southNone2.setVisibility(View.INVISIBLE);
            stage4_small_southNone2.setVisibility(View.INVISIBLE);
            stage5_small_southNone2.setVisibility(View.INVISIBLE);
            stage6_small_southNone2.setVisibility(View.INVISIBLE);
            stage7_small_southNone2.setVisibility(View.INVISIBLE);
            stage8_small_southNone2.setVisibility(View.INVISIBLE);
            stage9_small_southNone2.setVisibility(View.INVISIBLE);
            stage10_small_southNone2.setVisibility(View.INVISIBLE);
            stage11_small_southNone2.setVisibility(View.INVISIBLE);
            stage12_small_southNone2.setVisibility(View.INVISIBLE);
            stage13_small_southNone2.setVisibility(View.INVISIBLE);
            stage14_small_southNone2.setVisibility(View.INVISIBLE);
            stage15_small_southNone2.setVisibility(View.INVISIBLE);
            stage16_small_southNone2.setVisibility(View.INVISIBLE);
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
            stage_westLeft.setVisibility(View.INVISIBLE);
            stage1_small_westLeft.setVisibility(View.INVISIBLE);
            stage2_small_westLeft.setVisibility(View.INVISIBLE);
            stage3_small_westLeft.setVisibility(View.INVISIBLE);
            stage4_small_westLeft.setVisibility(View.INVISIBLE);
            stage5_small_westLeft.setVisibility(View.INVISIBLE);
            stage6_small_westLeft.setVisibility(View.INVISIBLE);
            stage7_small_westLeft.setVisibility(View.INVISIBLE);
            stage8_small_westLeft.setVisibility(View.INVISIBLE);
            stage9_small_westLeft.setVisibility(View.INVISIBLE);
            stage10_small_westLeft.setVisibility(View.INVISIBLE);
            stage11_small_westLeft.setVisibility(View.INVISIBLE);
            stage12_small_westLeft.setVisibility(View.INVISIBLE);
            stage13_small_westLeft.setVisibility(View.INVISIBLE);
            stage14_small_westLeft.setVisibility(View.INVISIBLE);
            stage15_small_westLeft.setVisibility(View.INVISIBLE);
            stage16_small_westLeft.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
            stage_westStriaght.setVisibility(View.INVISIBLE);
            stage1_small_westStriaght.setVisibility(View.INVISIBLE);
            stage2_small_westStriaght.setVisibility(View.INVISIBLE);
            stage3_small_westStriaght.setVisibility(View.INVISIBLE);
            stage4_small_westStriaght.setVisibility(View.INVISIBLE);
            stage5_small_westStriaght.setVisibility(View.INVISIBLE);
            stage6_small_westStriaght.setVisibility(View.INVISIBLE);
            stage7_small_westStriaght.setVisibility(View.INVISIBLE);
            stage8_small_westStriaght.setVisibility(View.INVISIBLE);
            stage9_small_westStriaght.setVisibility(View.INVISIBLE);
            stage10_small_westStriaght.setVisibility(View.INVISIBLE);
            stage11_small_westStriaght.setVisibility(View.INVISIBLE);
            stage12_small_westStriaght.setVisibility(View.INVISIBLE);
            stage13_small_westStriaght.setVisibility(View.INVISIBLE);
            stage14_small_westStriaght.setVisibility(View.INVISIBLE);
            stage15_small_westStriaght.setVisibility(View.INVISIBLE);
            stage16_small_westStriaght.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
            stage_westRight.setVisibility(View.INVISIBLE);
            stage1_small_westRight.setVisibility(View.INVISIBLE);
            stage2_small_westRight.setVisibility(View.INVISIBLE);
            stage3_small_westRight.setVisibility(View.INVISIBLE);
            stage4_small_westRight.setVisibility(View.INVISIBLE);
            stage5_small_westRight.setVisibility(View.INVISIBLE);
            stage6_small_westRight.setVisibility(View.INVISIBLE);
            stage7_small_westRight.setVisibility(View.INVISIBLE);
            stage8_small_westRight.setVisibility(View.INVISIBLE);
            stage9_small_westRight.setVisibility(View.INVISIBLE);
            stage10_small_westRight.setVisibility(View.INVISIBLE);
            stage11_small_westRight.setVisibility(View.INVISIBLE);
            stage12_small_westRight.setVisibility(View.INVISIBLE);
            stage13_small_westRight.setVisibility(View.INVISIBLE);
            stage14_small_westRight.setVisibility(View.INVISIBLE);
            stage15_small_westRight.setVisibility(View.INVISIBLE);
            stage16_small_westRight.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_WEST_OTHER){
            stage_westOther.setVisibility(View.INVISIBLE);
            stage1_small_westOther.setVisibility(View.INVISIBLE);
            stage2_small_westOther.setVisibility(View.INVISIBLE);
            stage3_small_westOther.setVisibility(View.INVISIBLE);
            stage4_small_westOther.setVisibility(View.INVISIBLE);
            stage5_small_westOther.setVisibility(View.INVISIBLE);
            stage6_small_westOther.setVisibility(View.INVISIBLE);
            stage7_small_westOther.setVisibility(View.INVISIBLE);
            stage8_small_westOther.setVisibility(View.INVISIBLE);
            stage9_small_westOther.setVisibility(View.INVISIBLE);
            stage10_small_westOther.setVisibility(View.INVISIBLE);
            stage11_small_westOther.setVisibility(View.INVISIBLE);
            stage12_small_westOther.setVisibility(View.INVISIBLE);
            stage13_small_westOther.setVisibility(View.INVISIBLE);
            stage14_small_westOther.setVisibility(View.INVISIBLE);
            stage15_small_westOther.setVisibility(View.INVISIBLE);
            stage16_small_westOther.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
            stage_westPedestrain2.setVisibility(View.INVISIBLE);
            stage1_small_westPedestrain2.setVisibility(View.INVISIBLE);
            stage2_small_westPedestrain2.setVisibility(View.INVISIBLE);
            stage3_small_westPedestrain2.setVisibility(View.INVISIBLE);
            stage4_small_westPedestrain2.setVisibility(View.INVISIBLE);
            stage5_small_westPedestrain2.setVisibility(View.INVISIBLE);
            stage6_small_westPedestrain2.setVisibility(View.INVISIBLE);
            stage7_small_westPedestrain2.setVisibility(View.INVISIBLE);
            stage8_small_westPedestrain2.setVisibility(View.INVISIBLE);
            stage9_small_westPedestrain2.setVisibility(View.INVISIBLE);
            stage10_small_westPedestrain2.setVisibility(View.INVISIBLE);
            stage11_small_westPedestrain2.setVisibility(View.INVISIBLE);
            stage12_small_westPedestrain2.setVisibility(View.INVISIBLE);
            stage13_small_westPedestrain2.setVisibility(View.INVISIBLE);
            stage14_small_westPedestrain2.setVisibility(View.INVISIBLE);
            stage15_small_westPedestrain2.setVisibility(View.INVISIBLE);
            stage16_small_westPedestrain2.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
            stage_westPedestrain1.setVisibility(View.INVISIBLE);
            stage1_small_westPedestrain1.setVisibility(View.INVISIBLE);
            stage2_small_westPedestrain1.setVisibility(View.INVISIBLE);
            stage3_small_westPedestrain1.setVisibility(View.INVISIBLE);
            stage4_small_westPedestrain1.setVisibility(View.INVISIBLE);
            stage5_small_westPedestrain1.setVisibility(View.INVISIBLE);
            stage6_small_westPedestrain1.setVisibility(View.INVISIBLE);
            stage7_small_westPedestrain1.setVisibility(View.INVISIBLE);
            stage8_small_westPedestrain1.setVisibility(View.INVISIBLE);
            stage9_small_westPedestrain1.setVisibility(View.INVISIBLE);
            stage10_small_westPedestrain1.setVisibility(View.INVISIBLE);
            stage11_small_westPedestrain1.setVisibility(View.INVISIBLE);
            stage12_small_westPedestrain1.setVisibility(View.INVISIBLE);
            stage13_small_westPedestrain1.setVisibility(View.INVISIBLE);
            stage14_small_westPedestrain1.setVisibility(View.INVISIBLE);
            stage15_small_westPedestrain1.setVisibility(View.INVISIBLE);
            stage16_small_westPedestrain1.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
            stage_west_turn_around.setVisibility(View.INVISIBLE);
            stage1_small_westNone1.setVisibility(View.INVISIBLE);
            stage2_small_westNone1.setVisibility(View.INVISIBLE);
            stage3_small_westNone1.setVisibility(View.INVISIBLE);
            stage4_small_westNone1.setVisibility(View.INVISIBLE);
            stage5_small_westNone1.setVisibility(View.INVISIBLE);
            stage6_small_westNone1.setVisibility(View.INVISIBLE);
            stage7_small_westNone1.setVisibility(View.INVISIBLE);
            stage8_small_westNone1.setVisibility(View.INVISIBLE);
            stage9_small_westNone1.setVisibility(View.INVISIBLE);
            stage10_small_westNone1.setVisibility(View.INVISIBLE);
            stage11_small_westNone1.setVisibility(View.INVISIBLE);
            stage12_small_westNone1.setVisibility(View.INVISIBLE);
            stage13_small_westNone1.setVisibility(View.INVISIBLE);
            stage14_small_westNone1.setVisibility(View.INVISIBLE);
            stage15_small_westNone1.setVisibility(View.INVISIBLE);
            stage16_small_westNone1.setVisibility(View.INVISIBLE);
        }
        if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2){
            stage_west_left_straight_right.setVisibility(View.INVISIBLE);
            stage1_small_westNone2.setVisibility(View.INVISIBLE);
            stage2_small_westNone2.setVisibility(View.INVISIBLE);
            stage3_small_westNone2.setVisibility(View.INVISIBLE);
            stage4_small_westNone2.setVisibility(View.INVISIBLE);
            stage5_small_westNone2.setVisibility(View.INVISIBLE);
            stage6_small_westNone2.setVisibility(View.INVISIBLE);
            stage7_small_westNone2.setVisibility(View.INVISIBLE);
            stage8_small_westNone2.setVisibility(View.INVISIBLE);
            stage9_small_westNone2.setVisibility(View.INVISIBLE);
            stage10_small_westNone2.setVisibility(View.INVISIBLE);
            stage11_small_westNone2.setVisibility(View.INVISIBLE);
            stage12_small_westNone2.setVisibility(View.INVISIBLE);
            stage13_small_westNone2.setVisibility(View.INVISIBLE);
            stage14_small_westNone2.setVisibility(View.INVISIBLE);
            stage15_small_westNone2.setVisibility(View.INVISIBLE);
            stage16_small_westNone2.setVisibility(View.INVISIBLE);
        }
    }

    /**
     * 初始化VIew对象
     */
    private void initView(){
        stage1 = findViewById(R.id.stage1);
        stage2 = findViewById(R.id.stage2);
        stage3 = findViewById(R.id.stage3);
        stage4 = findViewById(R.id.stage4);
        stage5 = findViewById(R.id.stage5);
        stage6 = findViewById(R.id.stage6);
        stage7 = findViewById(R.id.stage7);
        stage8 = findViewById(R.id.stage8);
        stage9 = findViewById(R.id.stage9);
        stage10 = findViewById(R.id.stage10);
        stage11 = findViewById(R.id.stage11);
        stage12 = findViewById(R.id.stage12);
        stage13 = findViewById(R.id.stage13);
        stage14 = findViewById(R.id.stage14);
        stage15 = findViewById(R.id.stage15);
        stage16 = findViewById(R.id.stage16);
        stage1_small_northLeft = (ImageView)stage1.findViewById(R.id.small_northLeft);
        stage1_small_northStriaght = (ImageView)stage1.findViewById(R.id.small_northStraight);
        stage1_small_northRight = (ImageView)stage1.findViewById(R.id.small_northRight);
        stage1_small_northOther = (ImageView)stage1.findViewById(R.id.small_northOther);
        stage1_small_northPedestrain1 = (ImageView)stage1.findViewById(R.id.small_northPedestrain1);
        stage1_small_northPedestrain2 = (ImageView)stage1.findViewById(R.id.small_northPedestrain2);
        stage1_small_northNone1 = (ImageView)stage1.findViewById(R.id.small_northNone1);
        stage1_small_northNone2 = (ImageView)stage1.findViewById(R.id.small_northNone2);
        stage1_small_eastLeft = (ImageView)stage1.findViewById(R.id.small_eastLeft);
        stage1_small_eastStriaght = (ImageView)stage1.findViewById(R.id.small_eastStraight);
        stage1_small_eastRight = (ImageView)stage1.findViewById(R.id.small_eastRight);
        stage1_small_eastOther = (ImageView)stage1.findViewById(R.id.small_eastOther);
        stage1_small_eastPedestrain1 = (ImageView)stage1.findViewById(R.id.small_eastPedestrain1);
        stage1_small_eastPedestrain2 = (ImageView)stage1.findViewById(R.id.small_eastPedestrain2);
        stage1_small_eastNone1 = (ImageView)stage1.findViewById(R.id.small_eastNone1);
        stage1_small_eastNone2 = (ImageView)stage1.findViewById(R.id.small_eastNone2);
        stage1_small_southLeft = (ImageView)stage1.findViewById(R.id.small_southLeft);
        stage1_small_southStriaght = (ImageView)stage1.findViewById(R.id.small_southStraight);
        stage1_small_southRight = (ImageView)stage1.findViewById(R.id.small_southRight);
        stage1_small_southOther = (ImageView)stage1.findViewById(R.id.small_southOther);
        stage1_small_southPedestrain1 = (ImageView)stage1.findViewById(R.id.small_southPedestrain1);
        stage1_small_southPedestrain2 = (ImageView)stage1.findViewById(R.id.small_southPedestrain2);
        stage1_small_southNone1 = (ImageView)stage1.findViewById(R.id.small_southNone1);
        stage1_small_southNone2 = (ImageView)stage1.findViewById(R.id.small_southNone2);
        stage1_small_westLeft = (ImageView)stage1.findViewById(R.id.small_westLeft);
        stage1_small_westStriaght = (ImageView)stage1.findViewById(R.id.small_westStraight);
        stage1_small_westRight = (ImageView)stage1.findViewById(R.id.small_westRight);
        stage1_small_westOther = (ImageView)stage1.findViewById(R.id.small_westOther);
        stage1_small_westPedestrain1 = (ImageView)stage1.findViewById(R.id.small_westPedestrain1);
        stage1_small_westPedestrain2 = (ImageView)stage1.findViewById(R.id.small_westPedestrain2);
        stage1_small_westNone1 = (ImageView)stage1.findViewById(R.id.small_westNone1);
        stage1_small_westNone2 = (ImageView)stage1.findViewById(R.id.small_westNone2);
        stage2_small_northLeft = 									(ImageView)stage2.findViewById(R.id.small_northLeft);
        stage2_small_northStriaght = 							(ImageView)stage2.findViewById(R.id.small_northStraight);
        stage2_small_northRight = 								(ImageView)stage2.findViewById(R.id.small_northRight);
        stage2_small_northOther = 								(ImageView)stage2.findViewById(R.id.small_northOther);
        stage2_small_northPedestrain1 = 					(ImageView)stage2.findViewById(R.id.small_northPedestrain1);
        stage2_small_northPedestrain2 = 					(ImageView)stage2.findViewById(R.id.small_northPedestrain2);
        stage2_small_northNone1 = 					(ImageView)stage2.findViewById(R.id.small_northNone1);
        stage2_small_northNone2 = 	(ImageView)stage2.findViewById(R.id.small_northNone2);
        stage2_small_eastLeft = 									(ImageView)stage2.findViewById(R.id.small_eastLeft);
        stage2_small_eastStriaght = 							(ImageView)stage2.findViewById(R.id.small_eastStraight);
        stage2_small_eastRight = 									(ImageView)stage2.findViewById(R.id.small_eastRight);
        stage2_small_eastOther = 									(ImageView)stage2.findViewById(R.id.small_eastOther);
        stage2_small_eastPedestrain1 = 						(ImageView)stage2.findViewById(R.id.small_eastPedestrain1);
        stage2_small_eastPedestrain2 = 						(ImageView)stage2.findViewById(R.id.small_eastPedestrain2);
        stage2_small_eastNone1 = 					(ImageView)stage2.findViewById(R.id.small_eastNone1);
        stage2_small_eastNone2 = 	(ImageView)stage2.findViewById(R.id.small_eastNone2);
        stage2_small_southLeft = 									(ImageView)stage2.findViewById(R.id.small_southLeft);
        stage2_small_southStriaght = 							(ImageView)stage2.findViewById(R.id.small_southStraight);
        stage2_small_southRight = 								(ImageView)stage2.findViewById(R.id.small_southRight);
        stage2_small_southOther = 								(ImageView)stage2.findViewById(R.id.small_southOther);
        stage2_small_southPedestrain1 = 					(ImageView)stage2.findViewById(R.id.small_southPedestrain1);
        stage2_small_southPedestrain2 = 					(ImageView)stage2.findViewById(R.id.small_southPedestrain2);
        stage2_small_southNone1 = 					(ImageView)stage2.findViewById(R.id.small_southNone1);
        stage2_small_southNone2 = 	(ImageView)stage2.findViewById(R.id.small_southNone2);
        stage2_small_westLeft = 									(ImageView)stage2.findViewById(R.id.small_westLeft);
        stage2_small_westStriaght = 							(ImageView)stage2.findViewById(R.id.small_westStraight);
        stage2_small_westRight = 									(ImageView)stage2.findViewById(R.id.small_westRight);
        stage2_small_westOther = 									(ImageView)stage2.findViewById(R.id.small_westOther);
        stage2_small_westPedestrain1 = 						(ImageView)stage2.findViewById(R.id.small_westPedestrain1);
        stage2_small_westPedestrain2 = 						(ImageView)stage2.findViewById(R.id.small_westPedestrain2);
        stage2_small_westNone1 = 					(ImageView)stage2.findViewById(R.id.small_westNone1);
        stage2_small_westNone2 = 	(ImageView)stage2.findViewById(R.id.small_westNone2);

        stage3_small_northLeft = 									(ImageView)stage3.findViewById(R.id.small_northLeft);
        stage3_small_northStriaght = 							(ImageView)stage3.findViewById(R.id.small_northStraight);
        stage3_small_northRight = 								(ImageView)stage3.findViewById(R.id.small_northRight);
        stage3_small_northOther = 								(ImageView)stage3.findViewById(R.id.small_northOther);
        stage3_small_northPedestrain1 = 					(ImageView)stage3.findViewById(R.id.small_northPedestrain1);
        stage3_small_northPedestrain2 = 					(ImageView)stage3.findViewById(R.id.small_northPedestrain2);
        stage3_small_northNone1 = 					(ImageView)stage3.findViewById(R.id.small_northNone1);
        stage3_small_northNone2 = 	(ImageView)stage3.findViewById(R.id.small_northNone2);
        stage3_small_eastLeft = 									(ImageView)stage3.findViewById(R.id.small_eastLeft);
        stage3_small_eastStriaght = 							(ImageView)stage3.findViewById(R.id.small_eastStraight);
        stage3_small_eastRight = 									(ImageView)stage3.findViewById(R.id.small_eastRight);
        stage3_small_eastOther = 									(ImageView)stage3.findViewById(R.id.small_eastOther);
        stage3_small_eastPedestrain1 = 						(ImageView)stage3.findViewById(R.id.small_eastPedestrain1);
        stage3_small_eastPedestrain2 = 						(ImageView)stage3.findViewById(R.id.small_eastPedestrain2);
        stage3_small_eastNone1 = 					(ImageView)stage3.findViewById(R.id.small_eastNone1);
        stage3_small_eastNone2 = 	(ImageView)stage3.findViewById(R.id.small_eastNone2);
        stage3_small_southLeft = 									(ImageView)stage3.findViewById(R.id.small_southLeft);
        stage3_small_southStriaght = 							(ImageView)stage3.findViewById(R.id.small_southStraight);
        stage3_small_southRight = 								(ImageView)stage3.findViewById(R.id.small_southRight);
        stage3_small_southOther = 								(ImageView)stage3.findViewById(R.id.small_southOther);
        stage3_small_southPedestrain1 = 					(ImageView)stage3.findViewById(R.id.small_southPedestrain1);
        stage3_small_southPedestrain2 = 					(ImageView)stage3.findViewById(R.id.small_southPedestrain2);
        stage3_small_southNone1 = 					(ImageView)stage3.findViewById(R.id.small_southNone1);
        stage3_small_southNone2 = 	(ImageView)stage3.findViewById(R.id.small_southNone2);
        stage3_small_westLeft = 									(ImageView)stage3.findViewById(R.id.small_westLeft);
        stage3_small_westStriaght = 							(ImageView)stage3.findViewById(R.id.small_westStraight);
        stage3_small_westRight = 									(ImageView)stage3.findViewById(R.id.small_westRight);
        stage3_small_westOther = 									(ImageView)stage3.findViewById(R.id.small_westOther);
        stage3_small_westPedestrain1 = 						(ImageView)stage3.findViewById(R.id.small_westPedestrain1);
        stage3_small_westPedestrain2 = 						(ImageView)stage3.findViewById(R.id.small_westPedestrain2);
        stage3_small_westNone1 = 					(ImageView)stage3.findViewById(R.id.small_westNone1);
        stage3_small_westNone2 = 	(ImageView)stage3.findViewById(R.id.small_westNone2);

        stage4_small_northLeft = 									(ImageView)stage4.findViewById(R.id.small_northLeft);
        stage4_small_northStriaght = 							(ImageView)stage4.findViewById(R.id.small_northStraight);
        stage4_small_northRight = 								(ImageView)stage4.findViewById(R.id.small_northRight);
        stage4_small_northOther = 								(ImageView)stage4.findViewById(R.id.small_northOther);
        stage4_small_northPedestrain1 = 					(ImageView)stage4.findViewById(R.id.small_northPedestrain1);
        stage4_small_northPedestrain2 = 					(ImageView)stage4.findViewById(R.id.small_northPedestrain2);
        stage4_small_northNone1 = 					(ImageView)stage4.findViewById(R.id.small_northNone1);
        stage4_small_northNone2 = 	(ImageView)stage4.findViewById(R.id.small_northNone2);
        stage4_small_eastLeft = 									(ImageView)stage4.findViewById(R.id.small_eastLeft);
        stage4_small_eastStriaght = 							(ImageView)stage4.findViewById(R.id.small_eastStraight);
        stage4_small_eastRight = 									(ImageView)stage4.findViewById(R.id.small_eastRight);
        stage4_small_eastOther = 									(ImageView)stage4.findViewById(R.id.small_eastOther);
        stage4_small_eastPedestrain1 = 						(ImageView)stage4.findViewById(R.id.small_eastPedestrain1);
        stage4_small_eastPedestrain2 = 						(ImageView)stage4.findViewById(R.id.small_eastPedestrain2);
        stage4_small_eastNone1 = 					(ImageView)stage4.findViewById(R.id.small_eastNone1);
        stage4_small_eastNone2 = 	(ImageView)stage4.findViewById(R.id.small_eastNone2);
        stage4_small_southLeft = 									(ImageView)stage4.findViewById(R.id.small_southLeft);
        stage4_small_southStriaght = 							(ImageView)stage4.findViewById(R.id.small_southStraight);
        stage4_small_southRight = 								(ImageView)stage4.findViewById(R.id.small_southRight);
        stage4_small_southOther = 								(ImageView)stage4.findViewById(R.id.small_southOther);
        stage4_small_southPedestrain1 = 					(ImageView)stage4.findViewById(R.id.small_southPedestrain1);
        stage4_small_southPedestrain2 = 					(ImageView)stage4.findViewById(R.id.small_southPedestrain2);
        stage4_small_southNone1 = 					(ImageView)stage4.findViewById(R.id.small_southNone1);
        stage4_small_southNone2 = 	(ImageView)stage4.findViewById(R.id.small_southNone2);
        stage4_small_westLeft = 									(ImageView)stage4.findViewById(R.id.small_westLeft);
        stage4_small_westStriaght = 							(ImageView)stage4.findViewById(R.id.small_westStraight);
        stage4_small_westRight = 									(ImageView)stage4.findViewById(R.id.small_westRight);
        stage4_small_westOther = 									(ImageView)stage4.findViewById(R.id.small_westOther);
        stage4_small_westPedestrain1 = 						(ImageView)stage4.findViewById(R.id.small_westPedestrain1);
        stage4_small_westPedestrain2 = 						(ImageView)stage4.findViewById(R.id.small_westPedestrain2);
        stage4_small_westNone1 = 					(ImageView)stage4.findViewById(R.id.small_westNone1);
        stage4_small_westNone2 = 	(ImageView)stage4.findViewById(R.id.small_westNone2);

        stage5_small_northLeft = 									(ImageView)stage5.findViewById(R.id.small_northLeft);
        stage5_small_northStriaght = 							(ImageView)stage5.findViewById(R.id.small_northStraight);
        stage5_small_northRight = 								(ImageView)stage5.findViewById(R.id.small_northRight);
        stage5_small_northOther = 								(ImageView)stage5.findViewById(R.id.small_northOther);
        stage5_small_northPedestrain1 = 					(ImageView)stage5.findViewById(R.id.small_northPedestrain1);
        stage5_small_northPedestrain2 = 					(ImageView)stage5.findViewById(R.id.small_northPedestrain2);
        stage5_small_northNone1 = 					(ImageView)stage5.findViewById(R.id.small_northNone1);
        stage5_small_northNone2 = 	(ImageView)stage5.findViewById(R.id.small_northNone2);
        stage5_small_eastLeft = 									(ImageView)stage5.findViewById(R.id.small_eastLeft);
        stage5_small_eastStriaght = 							(ImageView)stage5.findViewById(R.id.small_eastStraight);
        stage5_small_eastRight = 									(ImageView)stage5.findViewById(R.id.small_eastRight);
        stage5_small_eastOther = 									(ImageView)stage5.findViewById(R.id.small_eastOther);
        stage5_small_eastPedestrain1 = 						(ImageView)stage5.findViewById(R.id.small_eastPedestrain1);
        stage5_small_eastPedestrain2 = 						(ImageView)stage5.findViewById(R.id.small_eastPedestrain2);
        stage5_small_eastNone1 = 					(ImageView)stage5.findViewById(R.id.small_eastNone1);
        stage5_small_eastNone2 = 	(ImageView)stage5.findViewById(R.id.small_eastNone2);
        stage5_small_southLeft = 									(ImageView)stage5.findViewById(R.id.small_southLeft);
        stage5_small_southStriaght = 							(ImageView)stage5.findViewById(R.id.small_southStraight);
        stage5_small_southRight = 								(ImageView)stage5.findViewById(R.id.small_southRight);
        stage5_small_southOther = 								(ImageView)stage5.findViewById(R.id.small_southOther);
        stage5_small_southPedestrain1 = 					(ImageView)stage5.findViewById(R.id.small_southPedestrain1);
        stage5_small_southPedestrain2 = 					(ImageView)stage5.findViewById(R.id.small_southPedestrain2);
        stage5_small_southNone1 = 					(ImageView)stage5.findViewById(R.id.small_southNone1);
        stage5_small_southNone2 = 	(ImageView)stage5.findViewById(R.id.small_southNone2);
        stage5_small_westLeft = 									(ImageView)stage5.findViewById(R.id.small_westLeft);
        stage5_small_westStriaght = 							(ImageView)stage5.findViewById(R.id.small_westStraight);
        stage5_small_westRight = 									(ImageView)stage5.findViewById(R.id.small_westRight);
        stage5_small_westOther = 									(ImageView)stage5.findViewById(R.id.small_westOther);
        stage5_small_westPedestrain1 = 						(ImageView)stage5.findViewById(R.id.small_westPedestrain1);
        stage5_small_westPedestrain2 = 						(ImageView)stage5.findViewById(R.id.small_westPedestrain2);
        stage5_small_westNone1 = 					(ImageView)stage5.findViewById(R.id.small_westNone1);
        stage5_small_westNone2 = 	(ImageView)stage5.findViewById(R.id.small_westNone2);

        stage6_small_northLeft = 									(ImageView)stage6.findViewById(R.id.small_northLeft);
        stage6_small_northStriaght = 							(ImageView)stage6.findViewById(R.id.small_northStraight);
        stage6_small_northRight = 								(ImageView)stage6.findViewById(R.id.small_northRight);
        stage6_small_northOther = 								(ImageView)stage6.findViewById(R.id.small_northOther);
        stage6_small_northPedestrain1 = 					(ImageView)stage6.findViewById(R.id.small_northPedestrain1);
        stage6_small_northPedestrain2 = 					(ImageView)stage6.findViewById(R.id.small_northPedestrain2);
        stage6_small_northNone1 = 					(ImageView)stage6.findViewById(R.id.small_northNone1);
        stage6_small_northNone2 = 	(ImageView)stage6.findViewById(R.id.small_northNone2);
        stage6_small_eastLeft = 									(ImageView)stage6.findViewById(R.id.small_eastLeft);
        stage6_small_eastStriaght = 							(ImageView)stage6.findViewById(R.id.small_eastStraight);
        stage6_small_eastRight = 									(ImageView)stage6.findViewById(R.id.small_eastRight);
        stage6_small_eastOther = 									(ImageView)stage6.findViewById(R.id.small_eastOther);
        stage6_small_eastPedestrain1 = 						(ImageView)stage6.findViewById(R.id.small_eastPedestrain1);
        stage6_small_eastPedestrain2 = 						(ImageView)stage6.findViewById(R.id.small_eastPedestrain2);
        stage6_small_eastNone1 = 					(ImageView)stage6.findViewById(R.id.small_eastNone1);
        stage6_small_eastNone2 = 	(ImageView)stage6.findViewById(R.id.small_eastNone2);
        stage6_small_southLeft = 									(ImageView)stage6.findViewById(R.id.small_southLeft);
        stage6_small_southStriaght = 							(ImageView)stage6.findViewById(R.id.small_southStraight);
        stage6_small_southRight = 								(ImageView)stage6.findViewById(R.id.small_southRight);
        stage6_small_southOther = 								(ImageView)stage6.findViewById(R.id.small_southOther);
        stage6_small_southPedestrain1 = 					(ImageView)stage6.findViewById(R.id.small_southPedestrain1);
        stage6_small_southPedestrain2 = 					(ImageView)stage6.findViewById(R.id.small_southPedestrain2);
        stage6_small_southNone1 = 					(ImageView)stage6.findViewById(R.id.small_southNone1);
        stage6_small_southNone2 = 	(ImageView)stage6.findViewById(R.id.small_southNone2);
        stage6_small_westLeft = 									(ImageView)stage6.findViewById(R.id.small_westLeft);
        stage6_small_westStriaght = 							(ImageView)stage6.findViewById(R.id.small_westStraight);
        stage6_small_westRight = 									(ImageView)stage6.findViewById(R.id.small_westRight);
        stage6_small_westOther = 									(ImageView)stage6.findViewById(R.id.small_westOther);
        stage6_small_westPedestrain1 = 						(ImageView)stage6.findViewById(R.id.small_westPedestrain1);
        stage6_small_westPedestrain2 = 						(ImageView)stage6.findViewById(R.id.small_westPedestrain2);
        stage6_small_westNone1 = 					(ImageView)stage6.findViewById(R.id.small_westNone1);
        stage6_small_westNone2 = 	(ImageView)stage6.findViewById(R.id.small_westNone2);

        stage7_small_northLeft = 									(ImageView)stage7.findViewById(R.id.small_northLeft);
        stage7_small_northStriaght = 							(ImageView)stage7.findViewById(R.id.small_northStraight);
        stage7_small_northRight = 								(ImageView)stage7.findViewById(R.id.small_northRight);
        stage7_small_northOther = 								(ImageView)stage7.findViewById(R.id.small_northOther);
        stage7_small_northPedestrain1 = 					(ImageView)stage7.findViewById(R.id.small_northPedestrain1);
        stage7_small_northPedestrain2 = 					(ImageView)stage7.findViewById(R.id.small_northPedestrain2);
        stage7_small_northNone1 = 					(ImageView)stage7.findViewById(R.id.small_northNone1);
        stage7_small_northNone2 = 	(ImageView)stage7.findViewById(R.id.small_northNone2);
        stage7_small_eastLeft = 									(ImageView)stage7.findViewById(R.id.small_eastLeft);
        stage7_small_eastStriaght = 							(ImageView)stage7.findViewById(R.id.small_eastStraight);
        stage7_small_eastRight = 									(ImageView)stage7.findViewById(R.id.small_eastRight);
        stage7_small_eastOther = 									(ImageView)stage7.findViewById(R.id.small_eastOther);
        stage7_small_eastPedestrain1 = 						(ImageView)stage7.findViewById(R.id.small_eastPedestrain1);
        stage7_small_eastPedestrain2 = 						(ImageView)stage7.findViewById(R.id.small_eastPedestrain2);
        stage7_small_eastNone1 = 					(ImageView)stage7.findViewById(R.id.small_eastNone1);
        stage7_small_eastNone2 = 	(ImageView)stage7.findViewById(R.id.small_eastNone2);
        stage7_small_southLeft = 									(ImageView)stage7.findViewById(R.id.small_southLeft);
        stage7_small_southStriaght = 							(ImageView)stage7.findViewById(R.id.small_southStraight);
        stage7_small_southRight = 								(ImageView)stage7.findViewById(R.id.small_southRight);
        stage7_small_southOther = 								(ImageView)stage7.findViewById(R.id.small_southOther);
        stage7_small_southPedestrain1 = 					(ImageView)stage7.findViewById(R.id.small_southPedestrain1);
        stage7_small_southPedestrain2 = 					(ImageView)stage7.findViewById(R.id.small_southPedestrain2);
        stage7_small_southNone1 = 					(ImageView)stage7.findViewById(R.id.small_southNone1);
        stage7_small_southNone2 = 	(ImageView)stage7.findViewById(R.id.small_southNone2);
        stage7_small_westLeft = 									(ImageView)stage7.findViewById(R.id.small_westLeft);
        stage7_small_westStriaght = 							(ImageView)stage7.findViewById(R.id.small_westStraight);
        stage7_small_westRight = 									(ImageView)stage7.findViewById(R.id.small_westRight);
        stage7_small_westOther = 									(ImageView)stage7.findViewById(R.id.small_westOther);
        stage7_small_westPedestrain1 = 						(ImageView)stage7.findViewById(R.id.small_westPedestrain1);
        stage7_small_westPedestrain2 = 						(ImageView)stage7.findViewById(R.id.small_westPedestrain2);
        stage7_small_westNone1 = 					(ImageView)stage7.findViewById(R.id.small_westNone1);
        stage7_small_westNone2 = 	(ImageView)stage7.findViewById(R.id.small_westNone2);

        stage8_small_northLeft = 									(ImageView)stage8.findViewById(R.id.small_northLeft);
        stage8_small_northStriaght = 							(ImageView)stage8.findViewById(R.id.small_northStraight);
        stage8_small_northRight = 								(ImageView)stage8.findViewById(R.id.small_northRight);
        stage8_small_northOther = 								(ImageView)stage8.findViewById(R.id.small_northOther);
        stage8_small_northPedestrain1 = 					(ImageView)stage8.findViewById(R.id.small_northPedestrain1);
        stage8_small_northPedestrain2 = 					(ImageView)stage8.findViewById(R.id.small_northPedestrain2);
        stage8_small_northNone1 = 					(ImageView)stage8.findViewById(R.id.small_northNone1);
        stage8_small_northNone2 = 	(ImageView)stage8.findViewById(R.id.small_northNone2);
        stage8_small_eastLeft = 									(ImageView)stage8.findViewById(R.id.small_eastLeft);
        stage8_small_eastStriaght = 							(ImageView)stage8.findViewById(R.id.small_eastStraight);
        stage8_small_eastRight = 									(ImageView)stage8.findViewById(R.id.small_eastRight);
        stage8_small_eastOther = 									(ImageView)stage8.findViewById(R.id.small_eastOther);
        stage8_small_eastPedestrain1 = 						(ImageView)stage8.findViewById(R.id.small_eastPedestrain1);
        stage8_small_eastPedestrain2 = 						(ImageView)stage8.findViewById(R.id.small_eastPedestrain2);
        stage8_small_eastNone1 = 					(ImageView)stage8.findViewById(R.id.small_eastNone1);
        stage8_small_eastNone2 = 	(ImageView)stage8.findViewById(R.id.small_eastNone2);
        stage8_small_southLeft = 									(ImageView)stage8.findViewById(R.id.small_southLeft);
        stage8_small_southStriaght = 							(ImageView)stage8.findViewById(R.id.small_southStraight);
        stage8_small_southRight = 								(ImageView)stage8.findViewById(R.id.small_southRight);
        stage8_small_southOther = 								(ImageView)stage8.findViewById(R.id.small_southOther);
        stage8_small_southPedestrain1 = 					(ImageView)stage8.findViewById(R.id.small_southPedestrain1);
        stage8_small_southPedestrain2 = 					(ImageView)stage8.findViewById(R.id.small_southPedestrain2);
        stage8_small_southNone1 = 					(ImageView)stage8.findViewById(R.id.small_southNone1);
        stage8_small_southNone2 = 	(ImageView)stage8.findViewById(R.id.small_southNone2);
        stage8_small_westLeft = 									(ImageView)stage8.findViewById(R.id.small_westLeft);
        stage8_small_westStriaght = 							(ImageView)stage8.findViewById(R.id.small_westStraight);
        stage8_small_westRight = 									(ImageView)stage8.findViewById(R.id.small_westRight);
        stage8_small_westOther = 									(ImageView)stage8.findViewById(R.id.small_westOther);
        stage8_small_westPedestrain1 = 						(ImageView)stage8.findViewById(R.id.small_westPedestrain1);
        stage8_small_westPedestrain2 = 						(ImageView)stage8.findViewById(R.id.small_westPedestrain2);
        stage8_small_westNone1 = 					(ImageView)stage8.findViewById(R.id.small_westNone1);
        stage8_small_westNone2 = 	(ImageView)stage8.findViewById(R.id.small_westNone2);

        stage9_small_northLeft = 									(ImageView)stage9.findViewById(R.id.small_northLeft);
        stage9_small_northStriaght = 							(ImageView)stage9.findViewById(R.id.small_northStraight);
        stage9_small_northRight = 								(ImageView)stage9.findViewById(R.id.small_northRight);
        stage9_small_northOther = 								(ImageView)stage9.findViewById(R.id.small_northOther);
        stage9_small_northPedestrain1 = 					(ImageView)stage9.findViewById(R.id.small_northPedestrain1);
        stage9_small_northPedestrain2 = 					(ImageView)stage9.findViewById(R.id.small_northPedestrain2);
        stage9_small_northNone1 = 					(ImageView)stage9.findViewById(R.id.small_northNone1);
        stage9_small_northNone2 = 	(ImageView)stage9.findViewById(R.id.small_northNone2);
        stage9_small_eastLeft = 									(ImageView)stage9.findViewById(R.id.small_eastLeft);
        stage9_small_eastStriaght = 							(ImageView)stage9.findViewById(R.id.small_eastStraight);
        stage9_small_eastRight = 									(ImageView)stage9.findViewById(R.id.small_eastRight);
        stage9_small_eastOther = 									(ImageView)stage9.findViewById(R.id.small_eastOther);
        stage9_small_eastPedestrain1 = 						(ImageView)stage9.findViewById(R.id.small_eastPedestrain1);
        stage9_small_eastPedestrain2 = 						(ImageView)stage9.findViewById(R.id.small_eastPedestrain2);
        stage9_small_eastNone1 = 					(ImageView)stage9.findViewById(R.id.small_eastNone1);
        stage9_small_eastNone2 = 	(ImageView)stage9.findViewById(R.id.small_eastNone2);
        stage9_small_southLeft = 									(ImageView)stage9.findViewById(R.id.small_southLeft);
        stage9_small_southStriaght = 							(ImageView)stage9.findViewById(R.id.small_southStraight);
        stage9_small_southRight = 								(ImageView)stage9.findViewById(R.id.small_southRight);
        stage9_small_southOther = 								(ImageView)stage9.findViewById(R.id.small_southOther);
        stage9_small_southPedestrain1 = 					(ImageView)stage9.findViewById(R.id.small_southPedestrain1);
        stage9_small_southPedestrain2 = 					(ImageView)stage9.findViewById(R.id.small_southPedestrain2);
        stage9_small_southNone1 = 					(ImageView)stage9.findViewById(R.id.small_southNone1);
        stage9_small_southNone2 = 	(ImageView)stage9.findViewById(R.id.small_southNone2);
        stage9_small_westLeft = 									(ImageView)stage9.findViewById(R.id.small_westLeft);
        stage9_small_westStriaght = 							(ImageView)stage9.findViewById(R.id.small_westStraight);
        stage9_small_westRight = 									(ImageView)stage9.findViewById(R.id.small_westRight);
        stage9_small_westOther = 									(ImageView)stage9.findViewById(R.id.small_westOther);
        stage9_small_westPedestrain1 = 						(ImageView)stage9.findViewById(R.id.small_westPedestrain1);
        stage9_small_westPedestrain2 = 						(ImageView)stage9.findViewById(R.id.small_westPedestrain2);
        stage9_small_westNone1 = 					(ImageView)stage9.findViewById(R.id.small_westNone1);
        stage9_small_westNone2 = 	(ImageView)stage9.findViewById(R.id.small_westNone2);

        stage10_small_northLeft = 									(ImageView)stage10.findViewById(R.id.small_northLeft);
        stage10_small_northStriaght = 							(ImageView)stage10.findViewById(R.id.small_northStraight);
        stage10_small_northRight = 								(ImageView)stage10.findViewById(R.id.small_northRight);
        stage10_small_northOther = 								(ImageView)stage10.findViewById(R.id.small_northOther);
        stage10_small_northPedestrain1 = 					(ImageView)stage10.findViewById(R.id.small_northPedestrain1);
        stage10_small_northPedestrain2 = 					(ImageView)stage10.findViewById(R.id.small_northPedestrain2);
        stage10_small_northNone1 = 					(ImageView)stage10.findViewById(R.id.small_northNone1);
        stage10_small_northNone2 = 	(ImageView)stage10.findViewById(R.id.small_northNone2);
        stage10_small_eastLeft = 									(ImageView)stage10.findViewById(R.id.small_eastLeft);
        stage10_small_eastStriaght = 							(ImageView)stage10.findViewById(R.id.small_eastStraight);
        stage10_small_eastRight = 									(ImageView)stage10.findViewById(R.id.small_eastRight);
        stage10_small_eastOther = 									(ImageView)stage10.findViewById(R.id.small_eastOther);
        stage10_small_eastPedestrain1 = 						(ImageView)stage10.findViewById(R.id.small_eastPedestrain1);
        stage10_small_eastPedestrain2 = 						(ImageView)stage10.findViewById(R.id.small_eastPedestrain2);
        stage10_small_eastNone1 = 					(ImageView)stage10.findViewById(R.id.small_eastNone1);
        stage10_small_eastNone2 = 	(ImageView)stage10.findViewById(R.id.small_eastNone2);
        stage10_small_southLeft = 									(ImageView)stage10.findViewById(R.id.small_southLeft);
        stage10_small_southStriaght = 							(ImageView)stage10.findViewById(R.id.small_southStraight);
        stage10_small_southRight = 								(ImageView)stage10.findViewById(R.id.small_southRight);
        stage10_small_southOther = 								(ImageView)stage10.findViewById(R.id.small_southOther);
        stage10_small_southPedestrain1 = 					(ImageView)stage10.findViewById(R.id.small_southPedestrain1);
        stage10_small_southPedestrain2 = 					(ImageView)stage10.findViewById(R.id.small_southPedestrain2);
        stage10_small_southNone1 = 					(ImageView)stage10.findViewById(R.id.small_southNone1);
        stage10_small_southNone2 = 	(ImageView)stage10.findViewById(R.id.small_southNone2);
        stage10_small_westLeft = 									(ImageView)stage10.findViewById(R.id.small_westLeft);
        stage10_small_westStriaght = 							(ImageView)stage10.findViewById(R.id.small_westStraight);
        stage10_small_westRight = 									(ImageView)stage10.findViewById(R.id.small_westRight);
        stage10_small_westOther = 									(ImageView)stage10.findViewById(R.id.small_westOther);
        stage10_small_westPedestrain1 = 						(ImageView)stage10.findViewById(R.id.small_westPedestrain1);
        stage10_small_westPedestrain2 = 						(ImageView)stage10.findViewById(R.id.small_westPedestrain2);
        stage10_small_westNone1 = 					(ImageView)stage10.findViewById(R.id.small_westNone1);
        stage10_small_westNone2 = 	(ImageView)stage10.findViewById(R.id.small_westNone2);

        stage11_small_northLeft = 									(ImageView)stage11.findViewById(R.id.small_northLeft);
        stage11_small_northStriaght = 							(ImageView)stage11.findViewById(R.id.small_northStraight);
        stage11_small_northRight = 								(ImageView)stage11.findViewById(R.id.small_northRight);
        stage11_small_northOther = 								(ImageView)stage11.findViewById(R.id.small_northOther);
        stage11_small_northPedestrain1 = 					(ImageView)stage11.findViewById(R.id.small_northPedestrain1);
        stage11_small_northPedestrain2 = 					(ImageView)stage11.findViewById(R.id.small_northPedestrain2);
        stage11_small_northNone1 = 					(ImageView)stage11.findViewById(R.id.small_northNone1);
        stage11_small_northNone2 = 	(ImageView)stage11.findViewById(R.id.small_northNone2);
        stage11_small_eastLeft = 									(ImageView)stage11.findViewById(R.id.small_eastLeft);
        stage11_small_eastStriaght = 							(ImageView)stage11.findViewById(R.id.small_eastStraight);
        stage11_small_eastRight = 									(ImageView)stage11.findViewById(R.id.small_eastRight);
        stage11_small_eastOther = 									(ImageView)stage11.findViewById(R.id.small_eastOther);
        stage11_small_eastPedestrain1 = 						(ImageView)stage11.findViewById(R.id.small_eastPedestrain1);
        stage11_small_eastPedestrain2 = 						(ImageView)stage11.findViewById(R.id.small_eastPedestrain2);
        stage11_small_eastNone1 = 					(ImageView)stage11.findViewById(R.id.small_eastNone1);
        stage11_small_eastNone2 = 	(ImageView)stage11.findViewById(R.id.small_eastNone2);
        stage11_small_southLeft = 									(ImageView)stage11.findViewById(R.id.small_southLeft);
        stage11_small_southStriaght = 							(ImageView)stage11.findViewById(R.id.small_southStraight);
        stage11_small_southRight = 								(ImageView)stage11.findViewById(R.id.small_southRight);
        stage11_small_southOther = 								(ImageView)stage11.findViewById(R.id.small_southOther);
        stage11_small_southPedestrain1 = 					(ImageView)stage11.findViewById(R.id.small_southPedestrain1);
        stage11_small_southPedestrain2 = 					(ImageView)stage11.findViewById(R.id.small_southPedestrain2);
        stage11_small_southNone1 = 					(ImageView)stage11.findViewById(R.id.small_southNone1);
        stage11_small_southNone2 = 	(ImageView)stage11.findViewById(R.id.small_southNone2);
        stage11_small_westLeft = 									(ImageView)stage11.findViewById(R.id.small_westLeft);
        stage11_small_westStriaght = 							(ImageView)stage11.findViewById(R.id.small_westStraight);
        stage11_small_westRight = 									(ImageView)stage11.findViewById(R.id.small_westRight);
        stage11_small_westOther = 									(ImageView)stage11.findViewById(R.id.small_westOther);
        stage11_small_westPedestrain1 = 						(ImageView)stage11.findViewById(R.id.small_westPedestrain1);
        stage11_small_westPedestrain2 = 						(ImageView)stage11.findViewById(R.id.small_westPedestrain2);
        stage11_small_westNone1 = 					(ImageView)stage11.findViewById(R.id.small_westNone1);
        stage11_small_westNone2 = 	(ImageView)stage11.findViewById(R.id.small_westNone2);

        stage12_small_northLeft = 									(ImageView)stage12.findViewById(R.id.small_northLeft);
        stage12_small_northStriaght = 							(ImageView)stage12.findViewById(R.id.small_northStraight);
        stage12_small_northRight = 								(ImageView)stage12.findViewById(R.id.small_northRight);
        stage12_small_northOther = 								(ImageView)stage12.findViewById(R.id.small_northOther);
        stage12_small_northPedestrain1 = 					(ImageView)stage12.findViewById(R.id.small_northPedestrain1);
        stage12_small_northPedestrain2 = 					(ImageView)stage12.findViewById(R.id.small_northPedestrain2);
        stage12_small_northNone1 = 					(ImageView)stage12.findViewById(R.id.small_northNone1);
        stage12_small_northNone2 = 	(ImageView)stage12.findViewById(R.id.small_northNone2);
        stage12_small_eastLeft = 									(ImageView)stage12.findViewById(R.id.small_eastLeft);
        stage12_small_eastStriaght = 							(ImageView)stage12.findViewById(R.id.small_eastStraight);
        stage12_small_eastRight = 									(ImageView)stage12.findViewById(R.id.small_eastRight);
        stage12_small_eastOther = 									(ImageView)stage12.findViewById(R.id.small_eastOther);
        stage12_small_eastPedestrain1 = 						(ImageView)stage12.findViewById(R.id.small_eastPedestrain1);
        stage12_small_eastPedestrain2 = 						(ImageView)stage12.findViewById(R.id.small_eastPedestrain2);
        stage12_small_eastNone1 = 					(ImageView)stage12.findViewById(R.id.small_eastNone1);
        stage12_small_eastNone2 = 	(ImageView)stage12.findViewById(R.id.small_eastNone2);
        stage12_small_southLeft = 									(ImageView)stage12.findViewById(R.id.small_southLeft);
        stage12_small_southStriaght = 							(ImageView)stage12.findViewById(R.id.small_southStraight);
        stage12_small_southRight = 								(ImageView)stage12.findViewById(R.id.small_southRight);
        stage12_small_southOther = 								(ImageView)stage12.findViewById(R.id.small_southOther);
        stage12_small_southPedestrain1 = 					(ImageView)stage12.findViewById(R.id.small_southPedestrain1);
        stage12_small_southPedestrain2 = 					(ImageView)stage12.findViewById(R.id.small_southPedestrain2);
        stage12_small_southNone1 = 					(ImageView)stage12.findViewById(R.id.small_southNone1);
        stage12_small_southNone2 = 	(ImageView)stage12.findViewById(R.id.small_southNone2);
        stage12_small_westLeft = 									(ImageView)stage12.findViewById(R.id.small_westLeft);
        stage12_small_westStriaght = 							(ImageView)stage12.findViewById(R.id.small_westStraight);
        stage12_small_westRight = 									(ImageView)stage12.findViewById(R.id.small_westRight);
        stage12_small_westOther = 									(ImageView)stage12.findViewById(R.id.small_westOther);
        stage12_small_westPedestrain1 = 						(ImageView)stage12.findViewById(R.id.small_westPedestrain1);
        stage12_small_westPedestrain2 = 						(ImageView)stage12.findViewById(R.id.small_westPedestrain2);
        stage12_small_westNone1 = 					(ImageView)stage12.findViewById(R.id.small_westNone1);
        stage12_small_westNone2 = 	(ImageView)stage12.findViewById(R.id.small_westNone2);

        stage13_small_northLeft = 									(ImageView)stage13.findViewById(R.id.small_northLeft);
        stage13_small_northStriaght = 							(ImageView)stage13.findViewById(R.id.small_northStraight);
        stage13_small_northRight = 								(ImageView)stage13.findViewById(R.id.small_northRight);
        stage13_small_northOther = 								(ImageView)stage13.findViewById(R.id.small_northOther);
        stage13_small_northPedestrain1 = 					(ImageView)stage13.findViewById(R.id.small_northPedestrain1);
        stage13_small_northPedestrain2 = 					(ImageView)stage13.findViewById(R.id.small_northPedestrain2);
        stage13_small_northNone1 = 					(ImageView)stage13.findViewById(R.id.small_northNone1);
        stage13_small_northNone2 = 	(ImageView)stage13.findViewById(R.id.small_northNone2);
        stage13_small_eastLeft = 									(ImageView)stage13.findViewById(R.id.small_eastLeft);
        stage13_small_eastStriaght = 							(ImageView)stage13.findViewById(R.id.small_eastStraight);
        stage13_small_eastRight = 									(ImageView)stage13.findViewById(R.id.small_eastRight);
        stage13_small_eastOther = 									(ImageView)stage13.findViewById(R.id.small_eastOther);
        stage13_small_eastPedestrain1 = 						(ImageView)stage13.findViewById(R.id.small_eastPedestrain1);
        stage13_small_eastPedestrain2 = 						(ImageView)stage13.findViewById(R.id.small_eastPedestrain2);
        stage13_small_eastNone1 = 					(ImageView)stage13.findViewById(R.id.small_eastNone1);
        stage13_small_eastNone2 = 	(ImageView)stage13.findViewById(R.id.small_eastNone2);
        stage13_small_southLeft = 									(ImageView)stage13.findViewById(R.id.small_southLeft);
        stage13_small_southStriaght = 							(ImageView)stage13.findViewById(R.id.small_southStraight);
        stage13_small_southRight = 								(ImageView)stage13.findViewById(R.id.small_southRight);
        stage13_small_southOther = 								(ImageView)stage13.findViewById(R.id.small_southOther);
        stage13_small_southPedestrain1 = 					(ImageView)stage13.findViewById(R.id.small_southPedestrain1);
        stage13_small_southPedestrain2 = 					(ImageView)stage13.findViewById(R.id.small_southPedestrain2);
        stage13_small_southNone1 = 					(ImageView)stage13.findViewById(R.id.small_southNone1);
        stage13_small_southNone2 = 	(ImageView)stage13.findViewById(R.id.small_southNone2);
        stage13_small_westLeft = 									(ImageView)stage13.findViewById(R.id.small_westLeft);
        stage13_small_westStriaght = 							(ImageView)stage13.findViewById(R.id.small_westStraight);
        stage13_small_westRight = 									(ImageView)stage13.findViewById(R.id.small_westRight);
        stage13_small_westOther = 									(ImageView)stage13.findViewById(R.id.small_westOther);
        stage13_small_westPedestrain1 = 						(ImageView)stage13.findViewById(R.id.small_westPedestrain1);
        stage13_small_westPedestrain2 = 						(ImageView)stage13.findViewById(R.id.small_westPedestrain2);
        stage13_small_westNone1 = 					(ImageView)stage13.findViewById(R.id.small_westNone1);
        stage13_small_westNone2 = 	(ImageView)stage13.findViewById(R.id.small_westNone2);

        stage14_small_northLeft = 									(ImageView)stage14.findViewById(R.id.small_northLeft);
        stage14_small_northStriaght = 							(ImageView)stage14.findViewById(R.id.small_northStraight);
        stage14_small_northRight = 								(ImageView)stage14.findViewById(R.id.small_northRight);
        stage14_small_northOther = 								(ImageView)stage14.findViewById(R.id.small_northOther);
        stage14_small_northPedestrain1 = 					(ImageView)stage14.findViewById(R.id.small_northPedestrain1);
        stage14_small_northPedestrain2 = 					(ImageView)stage14.findViewById(R.id.small_northPedestrain2);
        stage14_small_northNone1 = 					(ImageView)stage14.findViewById(R.id.small_northNone1);
        stage14_small_northNone2 = 	(ImageView)stage14.findViewById(R.id.small_northNone2);
        stage14_small_eastLeft = 									(ImageView)stage14.findViewById(R.id.small_eastLeft);
        stage14_small_eastStriaght = 							(ImageView)stage14.findViewById(R.id.small_eastStraight);
        stage14_small_eastRight = 									(ImageView)stage14.findViewById(R.id.small_eastRight);
        stage14_small_eastOther = 									(ImageView)stage14.findViewById(R.id.small_eastOther);
        stage14_small_eastPedestrain1 = 						(ImageView)stage14.findViewById(R.id.small_eastPedestrain1);
        stage14_small_eastPedestrain2 = 						(ImageView)stage14.findViewById(R.id.small_eastPedestrain2);
        stage14_small_eastNone1 = 					(ImageView)stage14.findViewById(R.id.small_eastNone1);
        stage14_small_eastNone2 = 	(ImageView)stage14.findViewById(R.id.small_eastNone2);
        stage14_small_southLeft = 									(ImageView)stage14.findViewById(R.id.small_southLeft);
        stage14_small_southStriaght = 							(ImageView)stage14.findViewById(R.id.small_southStraight);
        stage14_small_southRight = 								(ImageView)stage14.findViewById(R.id.small_southRight);
        stage14_small_southOther = 								(ImageView)stage14.findViewById(R.id.small_southOther);
        stage14_small_southPedestrain1 = 					(ImageView)stage14.findViewById(R.id.small_southPedestrain1);
        stage14_small_southPedestrain2 = 					(ImageView)stage14.findViewById(R.id.small_southPedestrain2);
        stage14_small_southNone1 = 					(ImageView)stage14.findViewById(R.id.small_southNone1);
        stage14_small_southNone2 = 	(ImageView)stage14.findViewById(R.id.small_southNone2);
        stage14_small_westLeft = 									(ImageView)stage14.findViewById(R.id.small_westLeft);
        stage14_small_westStriaght = 							(ImageView)stage14.findViewById(R.id.small_westStraight);
        stage14_small_westRight = 									(ImageView)stage14.findViewById(R.id.small_westRight);
        stage14_small_westOther = 									(ImageView)stage14.findViewById(R.id.small_westOther);
        stage14_small_westPedestrain1 = 						(ImageView)stage14.findViewById(R.id.small_westPedestrain1);
        stage14_small_westPedestrain2 = 						(ImageView)stage14.findViewById(R.id.small_westPedestrain2);
        stage14_small_westNone1 = 					(ImageView)stage14.findViewById(R.id.small_westNone1);
        stage14_small_westNone2 = 	(ImageView)stage14.findViewById(R.id.small_westNone2);

        stage15_small_northLeft = 									(ImageView)stage15.findViewById(R.id.small_northLeft);
        stage15_small_northStriaght = 							(ImageView)stage15.findViewById(R.id.small_northStraight);
        stage15_small_northRight = 								(ImageView)stage15.findViewById(R.id.small_northRight);
        stage15_small_northOther = 								(ImageView)stage15.findViewById(R.id.small_northOther);
        stage15_small_northPedestrain1 = 					(ImageView)stage15.findViewById(R.id.small_northPedestrain1);
        stage15_small_northPedestrain2 = 					(ImageView)stage15.findViewById(R.id.small_northPedestrain2);
        stage15_small_northNone1 = 					(ImageView)stage15.findViewById(R.id.small_northNone1);
        stage15_small_northNone2 = 	(ImageView)stage15.findViewById(R.id.small_northNone2);
        stage15_small_eastLeft = 									(ImageView)stage15.findViewById(R.id.small_eastLeft);
        stage15_small_eastStriaght = 							(ImageView)stage15.findViewById(R.id.small_eastStraight);
        stage15_small_eastRight = 									(ImageView)stage15.findViewById(R.id.small_eastRight);
        stage15_small_eastOther = 									(ImageView)stage15.findViewById(R.id.small_eastOther);
        stage15_small_eastPedestrain1 = 						(ImageView)stage15.findViewById(R.id.small_eastPedestrain1);
        stage15_small_eastPedestrain2 = 						(ImageView)stage15.findViewById(R.id.small_eastPedestrain2);
        stage15_small_eastNone1 = 					(ImageView)stage15.findViewById(R.id.small_eastNone1);
        stage15_small_eastNone2 = 	(ImageView)stage15.findViewById(R.id.small_eastNone2);
        stage15_small_southLeft = 									(ImageView)stage15.findViewById(R.id.small_southLeft);
        stage15_small_southStriaght = 							(ImageView)stage15.findViewById(R.id.small_southStraight);
        stage15_small_southRight = 								(ImageView)stage15.findViewById(R.id.small_southRight);
        stage15_small_southOther = 								(ImageView)stage15.findViewById(R.id.small_southOther);
        stage15_small_southPedestrain1 = 					(ImageView)stage15.findViewById(R.id.small_southPedestrain1);
        stage15_small_southPedestrain2 = 					(ImageView)stage15.findViewById(R.id.small_southPedestrain2);
        stage15_small_southNone1 = 					(ImageView)stage15.findViewById(R.id.small_southNone1);
        stage15_small_southNone2 = 	(ImageView)stage15.findViewById(R.id.small_southNone2);
        stage15_small_westLeft = 									(ImageView)stage15.findViewById(R.id.small_westLeft);
        stage15_small_westStriaght = 							(ImageView)stage15.findViewById(R.id.small_westStraight);
        stage15_small_westRight = 									(ImageView)stage15.findViewById(R.id.small_westRight);
        stage15_small_westOther = 									(ImageView)stage15.findViewById(R.id.small_westOther);
        stage15_small_westPedestrain1 = 						(ImageView)stage15.findViewById(R.id.small_westPedestrain1);
        stage15_small_westPedestrain2 = 						(ImageView)stage15.findViewById(R.id.small_westPedestrain2);
        stage15_small_westNone1 = 					(ImageView)stage15.findViewById(R.id.small_westNone1);
        stage15_small_westNone2 = 	(ImageView)stage15.findViewById(R.id.small_westNone2);

        stage16_small_northLeft = 									(ImageView)stage16.findViewById(R.id.small_northLeft);
        stage16_small_northStriaght = 							(ImageView)stage16.findViewById(R.id.small_northStraight);
        stage16_small_northRight = 								(ImageView)stage16.findViewById(R.id.small_northRight);
        stage16_small_northOther = 								(ImageView)stage16.findViewById(R.id.small_northOther);
        stage16_small_northPedestrain1 = 					(ImageView)stage16.findViewById(R.id.small_northPedestrain1);
        stage16_small_northPedestrain2 = 					(ImageView)stage16.findViewById(R.id.small_northPedestrain2);
        stage16_small_northNone1 = 					(ImageView)stage16.findViewById(R.id.small_northNone1);
        stage16_small_northNone2 = 	(ImageView)stage16.findViewById(R.id.small_northNone2);
        stage16_small_eastLeft = 									(ImageView)stage16.findViewById(R.id.small_eastLeft);
        stage16_small_eastStriaght = 							(ImageView)stage16.findViewById(R.id.small_eastStraight);
        stage16_small_eastRight = 									(ImageView)stage16.findViewById(R.id.small_eastRight);
        stage16_small_eastOther = 									(ImageView)stage16.findViewById(R.id.small_eastOther);
        stage16_small_eastPedestrain1 = 						(ImageView)stage16.findViewById(R.id.small_eastPedestrain1);
        stage16_small_eastPedestrain2 = 						(ImageView)stage16.findViewById(R.id.small_eastPedestrain2);
        stage16_small_eastNone1 = 					(ImageView)stage16.findViewById(R.id.small_eastNone1);
        stage16_small_eastNone2 = 	(ImageView)stage16.findViewById(R.id.small_eastNone2);
        stage16_small_southLeft = 									(ImageView)stage16.findViewById(R.id.small_southLeft);
        stage16_small_southStriaght = 							(ImageView)stage16.findViewById(R.id.small_southStraight);
        stage16_small_southRight = 								(ImageView)stage16.findViewById(R.id.small_southRight);
        stage16_small_southOther = 								(ImageView)stage16.findViewById(R.id.small_southOther);
        stage16_small_southPedestrain1 = 					(ImageView)stage16.findViewById(R.id.small_southPedestrain1);
        stage16_small_southPedestrain2 = 					(ImageView)stage16.findViewById(R.id.small_southPedestrain2);
        stage16_small_southNone1 = 					(ImageView)stage16.findViewById(R.id.small_southNone1);
        stage16_small_southNone2 = 	(ImageView)stage16.findViewById(R.id.small_southNone2);
        stage16_small_westLeft = 									(ImageView)stage16.findViewById(R.id.small_westLeft);
        stage16_small_westStriaght = 							(ImageView)stage16.findViewById(R.id.small_westStraight);
        stage16_small_westRight = 									(ImageView)stage16.findViewById(R.id.small_westRight);
        stage16_small_westOther = 									(ImageView)stage16.findViewById(R.id.small_westOther);
        stage16_small_westPedestrain1 = 						(ImageView)stage16.findViewById(R.id.small_westPedestrain1);
        stage16_small_westPedestrain2 = 						(ImageView)stage16.findViewById(R.id.small_westPedestrain2);
        stage16_small_westNone1 = 					(ImageView)stage16.findViewById(R.id.small_westNone1);
        stage16_small_westNone2 = 	(ImageView)stage16.findViewById(R.id.small_westNone2);

         stage_northLeft = (ImageView)findViewById(R.id.stage_northLeft);
         stage_northStraight = (ImageView)findViewById(R.id.stage_northStraight);
         stage_northRight = (ImageView)findViewById(R.id.stage_northRight);
         stage_northOther = (ImageView)findViewById(R.id.stage_northOther);
         stage_northPedestrain1 = (ImageView)findViewById(R.id.stage_northPedestrain1);
         stage_northPedestrain2 = (ImageView)findViewById(R.id.stage_northPedestrain2);
         stage_west_turn_around = (ImageView)findViewById(R.id.stage_west_turn_around);
         stage_west_left_straight_right = (ImageView)findViewById(R.id.stage_west_left_straight_right);
         stage_eastOther = (ImageView)findViewById(R.id.stage_eastOther);
         stage_eastRight = (ImageView)findViewById(R.id.stage_eastRight);
         stage_eastStriaght = (ImageView)findViewById(R.id.stage_eastStraight);
         stage_eastLeft = (ImageView)findViewById(R.id.stage_eastLeft);
         stage_eastPedestrain1 = (ImageView)findViewById(R.id.stage_eastPedestrain1);
         stage_eastPedestrain2 = (ImageView)findViewById(R.id.stage_eastPedestrain2);
         stage_north_turn_around = (ImageView)findViewById(R.id.stage_north_turn_around);
         stage_north_left_straight_right = (ImageView)findViewById(R.id.stage_north_left_straight_right);
         stage_southLeft = (ImageView)findViewById(R.id.stage_southLeft);
         stage_southStriaght = (ImageView)findViewById(R.id.stage_southStraight);
         stage_southRight = (ImageView)findViewById(R.id.stage_southRight);
         stage_southOther = (ImageView)findViewById(R.id.stage_southOther);
         stage_southPedestrain1 = (ImageView)findViewById(R.id.stage_southPedestrain1);
         stage_southPedestrain2 = (ImageView)findViewById(R.id.stage_southPedestrain2);
         stage_east_turn_around = (ImageView)findViewById(R.id.stage_east_turn_around);
         stage_east_left_straight_right = (ImageView)findViewById(R.id.stage_east_left_straight_right);
         stage_westOther = (ImageView)findViewById(R.id.stage_westOther);
         stage_westRight = (ImageView)findViewById(R.id.stage_westRight);
         stage_westStriaght = (ImageView)findViewById(R.id.stage_westStraight);
         stage_westLeft = (ImageView)findViewById(R.id.stage_westLeft);
         stage_westPedestrain1 = (ImageView)findViewById(R.id.stage_westPedestrain1);
         stage_westPedestrain2 = (ImageView)findViewById(R.id.stage_westPedestrain2);
         stage_south_turn_around = (ImageView)findViewById(R.id.stage_south_turn_around);
         stage_south_left_straight_right = (ImageView)findViewById(R.id.stage_south_left_straight_right);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.stage, menu);
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

    public final static int SUCCESS = 1;
    public final static int FAILURE = 0;
    Handler sendHandler = new Handler(){
        @Override
        public void handleMessage(android.os.Message msg) {
            switch (msg.what){
                case SUCCESS:
                    Toast.makeText(StageActivity.this,"信号机接收数据成功！",Toast.LENGTH_LONG).show();
                    break;
                case FAILURE:
                    Toast.makeText(StageActivity.this,"信号机接收数据失败！",Toast.LENGTH_LONG).show();
                    break;
                default:
            }
            super.handleMessage(msg);
        }
    };

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            StagePatternService sps = new StagePatternServiceImpl();
            SharedPreferences sp = AndroidTscDefine.getSharedPreferences(StageActivity.this);
            TscNode node = AndroidTscDefine.spToTscNode(sp);
            Message message = sps.setStagePatternBy32Phase(node, gbtStagePatterns);

            android.os.Message msg = new android.os.Message();
            if(message.isBoo()){
                msg.what = SUCCESS;
            }else{
                msg.what = FAILURE;
            }
            sendHandler.sendMessage(msg);
        }
    };
}
