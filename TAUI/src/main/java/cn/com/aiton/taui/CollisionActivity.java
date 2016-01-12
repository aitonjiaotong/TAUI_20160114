package cn.com.aiton.taui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
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
import cn.com.aiton.domain.TscNode;
import cn.com.aiton.utils.AndroidTscDefine;
import cn.com.aiton.utils.GbtDefine;


public class CollisionActivity extends Activity {
    View collision1;
    View collision2;
    View collision3;
    View collision4;
    View collision5;
    View collision6;
    View collision7;
    View collision8;
    View collision9;
    View collision10;
    View collision11;
    View collision12;
    View collision13;
    View collision14;
    View collision15;
    View collision16;
    View collision17;
    View collision18;
    View collision19;
    View collision20;
    View collision21;
    View collision22;
    View collision23;
    View collision24;
    View collision25;
    View collision26;
    View collision27;
    View collision28;
    View collision29;
    View collision30;
    View collision31;
    View collision32;
    ImageView collision1_small_northLeft ;
    ImageView collision1_small_northStriaght;
    ImageView collision1_small_northRight;
    ImageView collision1_small_northOther;
    ImageView collision1_small_northPedestrain1;
    ImageView collision1_small_northPedestrain2;
    ImageView collision1_small_northNone1;
    ImageView collision1_small_northNone2;
    ImageView collision1_small_eastLeft;
    ImageView collision1_small_eastStriaght;
    ImageView collision1_small_eastRight ;
    ImageView collision1_small_eastOther;
    ImageView collision1_small_eastPedestrain1;
    ImageView collision1_small_eastPedestrain2;
    ImageView collision1_small_eastNone1 ;
    ImageView collision1_small_eastNone2;
    ImageView collision1_small_southLeft;
    ImageView collision1_small_southStriaght;
    ImageView collision1_small_southRight;
    ImageView collision1_small_southOther;
    ImageView collision1_small_southPedestrain1;
    ImageView collision1_small_southPedestrain2;
    ImageView collision1_small_southNone1 ;
    ImageView collision1_small_southNone2 ;
    ImageView collision1_small_westLeft;
    ImageView collision1_small_westStriaght ;
    ImageView collision1_small_westRight;
    ImageView collision1_small_westOther;
    ImageView collision1_small_westPedestrain1;
    ImageView collision1_small_westPedestrain2;
    ImageView collision1_small_westNone1;
    ImageView collision1_small_westNone2;
    ImageView collision2_small_northLeft ;
    ImageView collision2_small_northStriaght;
    ImageView collision2_small_northRight;
    ImageView collision2_small_northOther;
    ImageView collision2_small_northPedestrain1;
    ImageView collision2_small_northPedestrain2;
    ImageView collision2_small_northNone1;
    ImageView collision2_small_northNone2;
    ImageView collision2_small_eastLeft;
    ImageView collision2_small_eastStriaght;
    ImageView collision2_small_eastRight ;
    ImageView collision2_small_eastOther;
    ImageView collision2_small_eastPedestrain1;
    ImageView collision2_small_eastPedestrain2;
    ImageView collision2_small_eastNone1 ;
    ImageView collision2_small_eastNone2;
    ImageView collision2_small_southLeft;
    ImageView collision2_small_southStriaght;
    ImageView collision2_small_southRight;
    ImageView collision2_small_southOther;
    ImageView collision2_small_southPedestrain1;
    ImageView collision2_small_southPedestrain2;
    ImageView collision2_small_southNone1 ;
    ImageView collision2_small_southNone2 ;
    ImageView collision2_small_westLeft;
    ImageView collision2_small_westStriaght ;
    ImageView collision2_small_westRight;
    ImageView collision2_small_westOther;
    ImageView collision2_small_westPedestrain1;
    ImageView collision2_small_westPedestrain2;
    ImageView collision2_small_westNone1;
    ImageView collision2_small_westNone2;
    ImageView collision3_small_northLeft ;
    ImageView collision3_small_northStriaght;
    ImageView collision3_small_northRight;
    ImageView collision3_small_northOther;
    ImageView collision3_small_northPedestrain1;
    ImageView collision3_small_northPedestrain2;
    ImageView collision3_small_northNone1;
    ImageView collision3_small_northNone2;
    ImageView collision3_small_eastLeft;
    ImageView collision3_small_eastStriaght;
    ImageView collision3_small_eastRight ;
    ImageView collision3_small_eastOther;
    ImageView collision3_small_eastPedestrain1;
    ImageView collision3_small_eastPedestrain2;
    ImageView collision3_small_eastNone1 ;
    ImageView collision3_small_eastNone2;
    ImageView collision3_small_southLeft;
    ImageView collision3_small_southStriaght;
    ImageView collision3_small_southRight;
    ImageView collision3_small_southOther;
    ImageView collision3_small_southPedestrain1;
    ImageView collision3_small_southPedestrain2;
    ImageView collision3_small_southNone1 ;
    ImageView collision3_small_southNone2 ;
    ImageView collision3_small_westLeft;
    ImageView collision3_small_westStriaght ;
    ImageView collision3_small_westRight;
    ImageView collision3_small_westOther;
    ImageView collision3_small_westPedestrain1;
    ImageView collision3_small_westPedestrain2;
    ImageView collision3_small_westNone1;
    ImageView collision3_small_westNone2;
    ImageView collision4_small_northLeft ;
    ImageView collision4_small_northStriaght;
    ImageView collision4_small_northRight;
    ImageView collision4_small_northOther;
    ImageView collision4_small_northPedestrain1;
    ImageView collision4_small_northPedestrain2;
    ImageView collision4_small_northNone1;
    ImageView collision4_small_northNone2;
    ImageView collision4_small_eastLeft;
    ImageView collision4_small_eastStriaght;
    ImageView collision4_small_eastRight ;
    ImageView collision4_small_eastOther;
    ImageView collision4_small_eastPedestrain1;
    ImageView collision4_small_eastPedestrain2;
    ImageView collision4_small_eastNone1 ;
    ImageView collision4_small_eastNone2;
    ImageView collision4_small_southLeft;
    ImageView collision4_small_southStriaght;
    ImageView collision4_small_southRight;
    ImageView collision4_small_southOther;
    ImageView collision4_small_southPedestrain1;
    ImageView collision4_small_southPedestrain2;
    ImageView collision4_small_southNone1 ;
    ImageView collision4_small_southNone2 ;
    ImageView collision4_small_westLeft;
    ImageView collision4_small_westStriaght ;
    ImageView collision4_small_westRight;
    ImageView collision4_small_westOther;
    ImageView collision4_small_westPedestrain1;
    ImageView collision4_small_westPedestrain2;
    ImageView collision4_small_westNone1;
    ImageView collision4_small_westNone2;
    ImageView collision5_small_northLeft ;
    ImageView collision5_small_northStriaght;
    ImageView collision5_small_northRight;
    ImageView collision5_small_northOther;
    ImageView collision5_small_northPedestrain1;
    ImageView collision5_small_northPedestrain2;
    ImageView collision5_small_northNone1;
    ImageView collision5_small_northNone2;
    ImageView collision5_small_eastLeft;
    ImageView collision5_small_eastStriaght;
    ImageView collision5_small_eastRight ;
    ImageView collision5_small_eastOther;
    ImageView collision5_small_eastPedestrain1;
    ImageView collision5_small_eastPedestrain2;
    ImageView collision5_small_eastNone1 ;
    ImageView collision5_small_eastNone2;
    ImageView collision5_small_southLeft;
    ImageView collision5_small_southStriaght;
    ImageView collision5_small_southRight;
    ImageView collision5_small_southOther;
    ImageView collision5_small_southPedestrain1;
    ImageView collision5_small_southPedestrain2;
    ImageView collision5_small_southNone1 ;
    ImageView collision5_small_southNone2 ;
    ImageView collision5_small_westLeft;
    ImageView collision5_small_westStriaght ;
    ImageView collision5_small_westRight;
    ImageView collision5_small_westOther;
    ImageView collision5_small_westPedestrain1;
    ImageView collision5_small_westPedestrain2;
    ImageView collision5_small_westNone1;
    ImageView collision5_small_westNone2;
    ImageView collision6_small_northLeft ;
    ImageView collision6_small_northStriaght;
    ImageView collision6_small_northRight;
    ImageView collision6_small_northOther;
    ImageView collision6_small_northPedestrain1;
    ImageView collision6_small_northPedestrain2;
    ImageView collision6_small_northNone1;
    ImageView collision6_small_northNone2;
    ImageView collision6_small_eastLeft;
    ImageView collision6_small_eastStriaght;
    ImageView collision6_small_eastRight ;
    ImageView collision6_small_eastOther;
    ImageView collision6_small_eastPedestrain1;
    ImageView collision6_small_eastPedestrain2;
    ImageView collision6_small_eastNone1 ;
    ImageView collision6_small_eastNone2;
    ImageView collision6_small_southLeft;
    ImageView collision6_small_southStriaght;
    ImageView collision6_small_southRight;
    ImageView collision6_small_southOther;
    ImageView collision6_small_southPedestrain1;
    ImageView collision6_small_southPedestrain2;
    ImageView collision6_small_southNone1 ;
    ImageView collision6_small_southNone2 ;
    ImageView collision6_small_westLeft;
    ImageView collision6_small_westStriaght ;
    ImageView collision6_small_westRight;
    ImageView collision6_small_westOther;
    ImageView collision6_small_westPedestrain1;
    ImageView collision6_small_westPedestrain2;
    ImageView collision6_small_westNone1;
    ImageView collision6_small_westNone2;
    ImageView collision7_small_northLeft ;
    ImageView collision7_small_northStriaght;
    ImageView collision7_small_northRight;
    ImageView collision7_small_northOther;
    ImageView collision7_small_northPedestrain1;
    ImageView collision7_small_northPedestrain2;
    ImageView collision7_small_northNone1;
    ImageView collision7_small_northNone2;
    ImageView collision7_small_eastLeft;
    ImageView collision7_small_eastStriaght;
    ImageView collision7_small_eastRight ;
    ImageView collision7_small_eastOther;
    ImageView collision7_small_eastPedestrain1;
    ImageView collision7_small_eastPedestrain2;
    ImageView collision7_small_eastNone1 ;
    ImageView collision7_small_eastNone2;
    ImageView collision7_small_southLeft;
    ImageView collision7_small_southStriaght;
    ImageView collision7_small_southRight;
    ImageView collision7_small_southOther;
    ImageView collision7_small_southPedestrain1;
    ImageView collision7_small_southPedestrain2;
    ImageView collision7_small_southNone1 ;
    ImageView collision7_small_southNone2 ;
    ImageView collision7_small_westLeft;
    ImageView collision7_small_westStriaght ;
    ImageView collision7_small_westRight;
    ImageView collision7_small_westOther;
    ImageView collision7_small_westPedestrain1;
    ImageView collision7_small_westPedestrain2;
    ImageView collision7_small_westNone1;
    ImageView collision7_small_westNone2;
    ImageView collision8_small_northLeft ;
    ImageView collision8_small_northStriaght;
    ImageView collision8_small_northRight;
    ImageView collision8_small_northOther;
    ImageView collision8_small_northPedestrain1;
    ImageView collision8_small_northPedestrain2;
    ImageView collision8_small_northNone1;
    ImageView collision8_small_northNone2;
    ImageView collision8_small_eastLeft;
    ImageView collision8_small_eastStriaght;
    ImageView collision8_small_eastRight ;
    ImageView collision8_small_eastOther;
    ImageView collision8_small_eastPedestrain1;
    ImageView collision8_small_eastPedestrain2;
    ImageView collision8_small_eastNone1 ;
    ImageView collision8_small_eastNone2;
    ImageView collision8_small_southLeft;
    ImageView collision8_small_southStriaght;
    ImageView collision8_small_southRight;
    ImageView collision8_small_southOther;
    ImageView collision8_small_southPedestrain1;
    ImageView collision8_small_southPedestrain2;
    ImageView collision8_small_southNone1 ;
    ImageView collision8_small_southNone2 ;
    ImageView collision8_small_westLeft;
    ImageView collision8_small_westStriaght ;
    ImageView collision8_small_westRight;
    ImageView collision8_small_westOther;
    ImageView collision8_small_westPedestrain1;
    ImageView collision8_small_westPedestrain2;
    ImageView collision8_small_westNone1;
    ImageView collision8_small_westNone2;
    ImageView collision9_small_northLeft ;
    ImageView collision9_small_northStriaght;
    ImageView collision9_small_northRight;
    ImageView collision9_small_northOther;
    ImageView collision9_small_northPedestrain1;
    ImageView collision9_small_northPedestrain2;
    ImageView collision9_small_northNone1;
    ImageView collision9_small_northNone2;
    ImageView collision9_small_eastLeft;
    ImageView collision9_small_eastStriaght;
    ImageView collision9_small_eastRight ;
    ImageView collision9_small_eastOther;
    ImageView collision9_small_eastPedestrain1;
    ImageView collision9_small_eastPedestrain2;
    ImageView collision9_small_eastNone1 ;
    ImageView collision9_small_eastNone2;
    ImageView collision9_small_southLeft;
    ImageView collision9_small_southStriaght;
    ImageView collision9_small_southRight;
    ImageView collision9_small_southOther;
    ImageView collision9_small_southPedestrain1;
    ImageView collision9_small_southPedestrain2;
    ImageView collision9_small_southNone1 ;
    ImageView collision9_small_southNone2 ;
    ImageView collision9_small_westLeft;
    ImageView collision9_small_westStriaght ;
    ImageView collision9_small_westRight;
    ImageView collision9_small_westOther;
    ImageView collision9_small_westPedestrain1;
    ImageView collision9_small_westPedestrain2;
    ImageView collision9_small_westNone1;
    ImageView collision9_small_westNone2;
    ImageView collision10_small_northLeft ;
    ImageView collision10_small_northStriaght;
    ImageView collision10_small_northRight;
    ImageView collision10_small_northOther;
    ImageView collision10_small_northPedestrain1;
    ImageView collision10_small_northPedestrain2;
    ImageView collision10_small_northNone1;
    ImageView collision10_small_northNone2;
    ImageView collision10_small_eastLeft;
    ImageView collision10_small_eastStriaght;
    ImageView collision10_small_eastRight ;
    ImageView collision10_small_eastOther;
    ImageView collision10_small_eastPedestrain1;
    ImageView collision10_small_eastPedestrain2;
    ImageView collision10_small_eastNone1 ;
    ImageView collision10_small_eastNone2;
    ImageView collision10_small_southLeft;
    ImageView collision10_small_southStriaght;
    ImageView collision10_small_southRight;
    ImageView collision10_small_southOther;
    ImageView collision10_small_southPedestrain1;
    ImageView collision10_small_southPedestrain2;
    ImageView collision10_small_southNone1 ;
    ImageView collision10_small_southNone2 ;
    ImageView collision10_small_westLeft;
    ImageView collision10_small_westStriaght ;
    ImageView collision10_small_westRight;
    ImageView collision10_small_westOther;
    ImageView collision10_small_westPedestrain1;
    ImageView collision10_small_westPedestrain2;
    ImageView collision10_small_westNone1;
    ImageView collision10_small_westNone2;
    ImageView collision11_small_northLeft ;
    ImageView collision11_small_northStriaght;
    ImageView collision11_small_northRight;
    ImageView collision11_small_northOther;
    ImageView collision11_small_northPedestrain1;
    ImageView collision11_small_northPedestrain2;
    ImageView collision11_small_northNone1;
    ImageView collision11_small_northNone2;
    ImageView collision11_small_eastLeft;
    ImageView collision11_small_eastStriaght;
    ImageView collision11_small_eastRight ;
    ImageView collision11_small_eastOther;
    ImageView collision11_small_eastPedestrain1;
    ImageView collision11_small_eastPedestrain2;
    ImageView collision11_small_eastNone1 ;
    ImageView collision11_small_eastNone2;
    ImageView collision11_small_southLeft;
    ImageView collision11_small_southStriaght;
    ImageView collision11_small_southRight;
    ImageView collision11_small_southOther;
    ImageView collision11_small_southPedestrain1;
    ImageView collision11_small_southPedestrain2;
    ImageView collision11_small_southNone1 ;
    ImageView collision11_small_southNone2 ;
    ImageView collision11_small_westLeft;
    ImageView collision11_small_westStriaght ;
    ImageView collision11_small_westRight;
    ImageView collision11_small_westOther;
    ImageView collision11_small_westPedestrain1;
    ImageView collision11_small_westPedestrain2;
    ImageView collision11_small_westNone1;
    ImageView collision11_small_westNone2;
    ImageView collision12_small_northLeft ;
    ImageView collision12_small_northStriaght;
    ImageView collision12_small_northRight;
    ImageView collision12_small_northOther;
    ImageView collision12_small_northPedestrain1;
    ImageView collision12_small_northPedestrain2;
    ImageView collision12_small_northNone1;
    ImageView collision12_small_northNone2;
    ImageView collision12_small_eastLeft;
    ImageView collision12_small_eastStriaght;
    ImageView collision12_small_eastRight ;
    ImageView collision12_small_eastOther;
    ImageView collision12_small_eastPedestrain1;
    ImageView collision12_small_eastPedestrain2;
    ImageView collision12_small_eastNone1 ;
    ImageView collision12_small_eastNone2;
    ImageView collision12_small_southLeft;
    ImageView collision12_small_southStriaght;
    ImageView collision12_small_southRight;
    ImageView collision12_small_southOther;
    ImageView collision12_small_southPedestrain1;
    ImageView collision12_small_southPedestrain2;
    ImageView collision12_small_southNone1 ;
    ImageView collision12_small_southNone2 ;
    ImageView collision12_small_westLeft;
    ImageView collision12_small_westStriaght ;
    ImageView collision12_small_westRight;
    ImageView collision12_small_westOther;
    ImageView collision12_small_westPedestrain1;
    ImageView collision12_small_westPedestrain2;
    ImageView collision12_small_westNone1;
    ImageView collision12_small_westNone2;
    ImageView collision13_small_northLeft ;
    ImageView collision13_small_northStriaght;
    ImageView collision13_small_northRight;
    ImageView collision13_small_northOther;
    ImageView collision13_small_northPedestrain1;
    ImageView collision13_small_northPedestrain2;
    ImageView collision13_small_northNone1;
    ImageView collision13_small_northNone2;
    ImageView collision13_small_eastLeft;
    ImageView collision13_small_eastStriaght;
    ImageView collision13_small_eastRight ;
    ImageView collision13_small_eastOther;
    ImageView collision13_small_eastPedestrain1;
    ImageView collision13_small_eastPedestrain2;
    ImageView collision13_small_eastNone1 ;
    ImageView collision13_small_eastNone2;
    ImageView collision13_small_southLeft;
    ImageView collision13_small_southStriaght;
    ImageView collision13_small_southRight;
    ImageView collision13_small_southOther;
    ImageView collision13_small_southPedestrain1;
    ImageView collision13_small_southPedestrain2;
    ImageView collision13_small_southNone1 ;
    ImageView collision13_small_southNone2 ;
    ImageView collision13_small_westLeft;
    ImageView collision13_small_westStriaght ;
    ImageView collision13_small_westRight;
    ImageView collision13_small_westOther;
    ImageView collision13_small_westPedestrain1;
    ImageView collision13_small_westPedestrain2;
    ImageView collision13_small_westNone1;
    ImageView collision13_small_westNone2;
    ImageView collision14_small_northLeft ;
    ImageView collision14_small_northStriaght;
    ImageView collision14_small_northRight;
    ImageView collision14_small_northOther;
    ImageView collision14_small_northPedestrain1;
    ImageView collision14_small_northPedestrain2;
    ImageView collision14_small_northNone1;
    ImageView collision14_small_northNone2;
    ImageView collision14_small_eastLeft;
    ImageView collision14_small_eastStriaght;
    ImageView collision14_small_eastRight ;
    ImageView collision14_small_eastOther;
    ImageView collision14_small_eastPedestrain1;
    ImageView collision14_small_eastPedestrain2;
    ImageView collision14_small_eastNone1 ;
    ImageView collision14_small_eastNone2;
    ImageView collision14_small_southLeft;
    ImageView collision14_small_southStriaght;
    ImageView collision14_small_southRight;
    ImageView collision14_small_southOther;
    ImageView collision14_small_southPedestrain1;
    ImageView collision14_small_southPedestrain2;
    ImageView collision14_small_southNone1 ;
    ImageView collision14_small_southNone2 ;
    ImageView collision14_small_westLeft;
    ImageView collision14_small_westStriaght ;
    ImageView collision14_small_westRight;
    ImageView collision14_small_westOther;
    ImageView collision14_small_westPedestrain1;
    ImageView collision14_small_westPedestrain2;
    ImageView collision14_small_westNone1;
    ImageView collision14_small_westNone2;
    ImageView collision15_small_northLeft ;
    ImageView collision15_small_northStriaght;
    ImageView collision15_small_northRight;
    ImageView collision15_small_northOther;
    ImageView collision15_small_northPedestrain1;
    ImageView collision15_small_northPedestrain2;
    ImageView collision15_small_northNone1;
    ImageView collision15_small_northNone2;
    ImageView collision15_small_eastLeft;
    ImageView collision15_small_eastStriaght;
    ImageView collision15_small_eastRight ;
    ImageView collision15_small_eastOther;
    ImageView collision15_small_eastPedestrain1;
    ImageView collision15_small_eastPedestrain2;
    ImageView collision15_small_eastNone1 ;
    ImageView collision15_small_eastNone2;
    ImageView collision15_small_southLeft;
    ImageView collision15_small_southStriaght;
    ImageView collision15_small_southRight;
    ImageView collision15_small_southOther;
    ImageView collision15_small_southPedestrain1;
    ImageView collision15_small_southPedestrain2;
    ImageView collision15_small_southNone1 ;
    ImageView collision15_small_southNone2 ;
    ImageView collision15_small_westLeft;
    ImageView collision15_small_westStriaght ;
    ImageView collision15_small_westRight;
    ImageView collision15_small_westOther;
    ImageView collision15_small_westPedestrain1;
    ImageView collision15_small_westPedestrain2;
    ImageView collision15_small_westNone1;
    ImageView collision15_small_westNone2;
    ImageView collision16_small_northLeft ;
    ImageView collision16_small_northStriaght;
    ImageView collision16_small_northRight;
    ImageView collision16_small_northOther;
    ImageView collision16_small_northPedestrain1;
    ImageView collision16_small_northPedestrain2;
    ImageView collision16_small_northNone1;
    ImageView collision16_small_northNone2;
    ImageView collision16_small_eastLeft;
    ImageView collision16_small_eastStriaght;
    ImageView collision16_small_eastRight ;
    ImageView collision16_small_eastOther;
    ImageView collision16_small_eastPedestrain1;
    ImageView collision16_small_eastPedestrain2;
    ImageView collision16_small_eastNone1 ;
    ImageView collision16_small_eastNone2;
    ImageView collision16_small_southLeft;
    ImageView collision16_small_southStriaght;
    ImageView collision16_small_southRight;
    ImageView collision16_small_southOther;
    ImageView collision16_small_southPedestrain1;
    ImageView collision16_small_southPedestrain2;
    ImageView collision16_small_southNone1 ;
    ImageView collision16_small_southNone2 ;
    ImageView collision16_small_westLeft;
    ImageView collision16_small_westStriaght ;
    ImageView collision16_small_westRight;
    ImageView collision16_small_westOther;
    ImageView collision16_small_westPedestrain1;
    ImageView collision16_small_westPedestrain2;
    ImageView collision16_small_westNone1;
    ImageView collision16_small_westNone2;
    ImageView collision17_small_northLeft ;
    ImageView collision17_small_northStriaght;
    ImageView collision17_small_northRight;
    ImageView collision17_small_northOther;
    ImageView collision17_small_northPedestrain1;
    ImageView collision17_small_northPedestrain2;
    ImageView collision17_small_northNone1;
    ImageView collision17_small_northNone2;
    ImageView collision17_small_eastLeft;
    ImageView collision17_small_eastStriaght;
    ImageView collision17_small_eastRight ;
    ImageView collision17_small_eastOther;
    ImageView collision17_small_eastPedestrain1;
    ImageView collision17_small_eastPedestrain2;
    ImageView collision17_small_eastNone1 ;
    ImageView collision17_small_eastNone2;
    ImageView collision17_small_southLeft;
    ImageView collision17_small_southStriaght;
    ImageView collision17_small_southRight;
    ImageView collision17_small_southOther;
    ImageView collision17_small_southPedestrain1;
    ImageView collision17_small_southPedestrain2;
    ImageView collision17_small_southNone1 ;
    ImageView collision17_small_southNone2 ;
    ImageView collision17_small_westLeft;
    ImageView collision17_small_westStriaght ;
    ImageView collision17_small_westRight;
    ImageView collision17_small_westOther;
    ImageView collision17_small_westPedestrain1;
    ImageView collision17_small_westPedestrain2;
    ImageView collision17_small_westNone1;
    ImageView collision17_small_westNone2;
    ImageView collision18_small_northLeft ;
    ImageView collision18_small_northStriaght;
    ImageView collision18_small_northRight;
    ImageView collision18_small_northOther;
    ImageView collision18_small_northPedestrain1;
    ImageView collision18_small_northPedestrain2;
    ImageView collision18_small_northNone1;
    ImageView collision18_small_northNone2;
    ImageView collision18_small_eastLeft;
    ImageView collision18_small_eastStriaght;
    ImageView collision18_small_eastRight ;
    ImageView collision18_small_eastOther;
    ImageView collision18_small_eastPedestrain1;
    ImageView collision18_small_eastPedestrain2;
    ImageView collision18_small_eastNone1 ;
    ImageView collision18_small_eastNone2;
    ImageView collision18_small_southLeft;
    ImageView collision18_small_southStriaght;
    ImageView collision18_small_southRight;
    ImageView collision18_small_southOther;
    ImageView collision18_small_southPedestrain1;
    ImageView collision18_small_southPedestrain2;
    ImageView collision18_small_southNone1 ;
    ImageView collision18_small_southNone2 ;
    ImageView collision18_small_westLeft;
    ImageView collision18_small_westStriaght ;
    ImageView collision18_small_westRight;
    ImageView collision18_small_westOther;
    ImageView collision18_small_westPedestrain1;
    ImageView collision18_small_westPedestrain2;
    ImageView collision18_small_westNone1;
    ImageView collision18_small_westNone2;
    ImageView collision19_small_northLeft ;
    ImageView collision19_small_northStriaght;
    ImageView collision19_small_northRight;
    ImageView collision19_small_northOther;
    ImageView collision19_small_northPedestrain1;
    ImageView collision19_small_northPedestrain2;
    ImageView collision19_small_northNone1;
    ImageView collision19_small_northNone2;
    ImageView collision19_small_eastLeft;
    ImageView collision19_small_eastStriaght;
    ImageView collision19_small_eastRight ;
    ImageView collision19_small_eastOther;
    ImageView collision19_small_eastPedestrain1;
    ImageView collision19_small_eastPedestrain2;
    ImageView collision19_small_eastNone1 ;
    ImageView collision19_small_eastNone2;
    ImageView collision19_small_southLeft;
    ImageView collision19_small_southStriaght;
    ImageView collision19_small_southRight;
    ImageView collision19_small_southOther;
    ImageView collision19_small_southPedestrain1;
    ImageView collision19_small_southPedestrain2;
    ImageView collision19_small_southNone1 ;
    ImageView collision19_small_southNone2 ;
    ImageView collision19_small_westLeft;
    ImageView collision19_small_westStriaght ;
    ImageView collision19_small_westRight;
    ImageView collision19_small_westOther;
    ImageView collision19_small_westPedestrain1;
    ImageView collision19_small_westPedestrain2;
    ImageView collision19_small_westNone1;
    ImageView collision19_small_westNone2;
    ImageView collision20_small_northLeft ;
    ImageView collision20_small_northStriaght;
    ImageView collision20_small_northRight;
    ImageView collision20_small_northOther;
    ImageView collision20_small_northPedestrain1;
    ImageView collision20_small_northPedestrain2;
    ImageView collision20_small_northNone1;
    ImageView collision20_small_northNone2;
    ImageView collision20_small_eastLeft;
    ImageView collision20_small_eastStriaght;
    ImageView collision20_small_eastRight ;
    ImageView collision20_small_eastOther;
    ImageView collision20_small_eastPedestrain1;
    ImageView collision20_small_eastPedestrain2;
    ImageView collision20_small_eastNone1 ;
    ImageView collision20_small_eastNone2;
    ImageView collision20_small_southLeft;
    ImageView collision20_small_southStriaght;
    ImageView collision20_small_southRight;
    ImageView collision20_small_southOther;
    ImageView collision20_small_southPedestrain1;
    ImageView collision20_small_southPedestrain2;
    ImageView collision20_small_southNone1 ;
    ImageView collision20_small_southNone2 ;
    ImageView collision20_small_westLeft;
    ImageView collision20_small_westStriaght ;
    ImageView collision20_small_westRight;
    ImageView collision20_small_westOther;
    ImageView collision20_small_westPedestrain1;
    ImageView collision20_small_westPedestrain2;
    ImageView collision20_small_westNone1;
    ImageView collision20_small_westNone2;
    ImageView collision21_small_northLeft ;
    ImageView collision21_small_northStriaght;
    ImageView collision21_small_northRight;
    ImageView collision21_small_northOther;
    ImageView collision21_small_northPedestrain1;
    ImageView collision21_small_northPedestrain2;
    ImageView collision21_small_northNone1;
    ImageView collision21_small_northNone2;
    ImageView collision21_small_eastLeft;
    ImageView collision21_small_eastStriaght;
    ImageView collision21_small_eastRight ;
    ImageView collision21_small_eastOther;
    ImageView collision21_small_eastPedestrain1;
    ImageView collision21_small_eastPedestrain2;
    ImageView collision21_small_eastNone1 ;
    ImageView collision21_small_eastNone2;
    ImageView collision21_small_southLeft;
    ImageView collision21_small_southStriaght;
    ImageView collision21_small_southRight;
    ImageView collision21_small_southOther;
    ImageView collision21_small_southPedestrain1;
    ImageView collision21_small_southPedestrain2;
    ImageView collision21_small_southNone1 ;
    ImageView collision21_small_southNone2 ;
    ImageView collision21_small_westLeft;
    ImageView collision21_small_westStriaght ;
    ImageView collision21_small_westRight;
    ImageView collision21_small_westOther;
    ImageView collision21_small_westPedestrain1;
    ImageView collision21_small_westPedestrain2;
    ImageView collision21_small_westNone1;
    ImageView collision21_small_westNone2;
    ImageView collision22_small_northLeft ;
    ImageView collision22_small_northStriaght;
    ImageView collision22_small_northRight;
    ImageView collision22_small_northOther;
    ImageView collision22_small_northPedestrain1;
    ImageView collision22_small_northPedestrain2;
    ImageView collision22_small_northNone1;
    ImageView collision22_small_northNone2;
    ImageView collision22_small_eastLeft;
    ImageView collision22_small_eastStriaght;
    ImageView collision22_small_eastRight ;
    ImageView collision22_small_eastOther;
    ImageView collision22_small_eastPedestrain1;
    ImageView collision22_small_eastPedestrain2;
    ImageView collision22_small_eastNone1 ;
    ImageView collision22_small_eastNone2;
    ImageView collision22_small_southLeft;
    ImageView collision22_small_southStriaght;
    ImageView collision22_small_southRight;
    ImageView collision22_small_southOther;
    ImageView collision22_small_southPedestrain1;
    ImageView collision22_small_southPedestrain2;
    ImageView collision22_small_southNone1 ;
    ImageView collision22_small_southNone2 ;
    ImageView collision22_small_westLeft;
    ImageView collision22_small_westStriaght ;
    ImageView collision22_small_westRight;
    ImageView collision22_small_westOther;
    ImageView collision22_small_westPedestrain1;
    ImageView collision22_small_westPedestrain2;
    ImageView collision22_small_westNone1;
    ImageView collision22_small_westNone2;
    ImageView collision23_small_northLeft ;
    ImageView collision23_small_northStriaght;
    ImageView collision23_small_northRight;
    ImageView collision23_small_northOther;
    ImageView collision23_small_northPedestrain1;
    ImageView collision23_small_northPedestrain2;
    ImageView collision23_small_northNone1;
    ImageView collision23_small_northNone2;
    ImageView collision23_small_eastLeft;
    ImageView collision23_small_eastStriaght;
    ImageView collision23_small_eastRight ;
    ImageView collision23_small_eastOther;
    ImageView collision23_small_eastPedestrain1;
    ImageView collision23_small_eastPedestrain2;
    ImageView collision23_small_eastNone1 ;
    ImageView collision23_small_eastNone2;
    ImageView collision23_small_southLeft;
    ImageView collision23_small_southStriaght;
    ImageView collision23_small_southRight;
    ImageView collision23_small_southOther;
    ImageView collision23_small_southPedestrain1;
    ImageView collision23_small_southPedestrain2;
    ImageView collision23_small_southNone1 ;
    ImageView collision23_small_southNone2 ;
    ImageView collision23_small_westLeft;
    ImageView collision23_small_westStriaght ;
    ImageView collision23_small_westRight;
    ImageView collision23_small_westOther;
    ImageView collision23_small_westPedestrain1;
    ImageView collision23_small_westPedestrain2;
    ImageView collision23_small_westNone1;
    ImageView collision23_small_westNone2;
    ImageView collision24_small_northLeft ;
    ImageView collision24_small_northStriaght;
    ImageView collision24_small_northRight;
    ImageView collision24_small_northOther;
    ImageView collision24_small_northPedestrain1;
    ImageView collision24_small_northPedestrain2;
    ImageView collision24_small_northNone1;
    ImageView collision24_small_northNone2;
    ImageView collision24_small_eastLeft;
    ImageView collision24_small_eastStriaght;
    ImageView collision24_small_eastRight ;
    ImageView collision24_small_eastOther;
    ImageView collision24_small_eastPedestrain1;
    ImageView collision24_small_eastPedestrain2;
    ImageView collision24_small_eastNone1 ;
    ImageView collision24_small_eastNone2;
    ImageView collision24_small_southLeft;
    ImageView collision24_small_southStriaght;
    ImageView collision24_small_southRight;
    ImageView collision24_small_southOther;
    ImageView collision24_small_southPedestrain1;
    ImageView collision24_small_southPedestrain2;
    ImageView collision24_small_southNone1 ;
    ImageView collision24_small_southNone2 ;
    ImageView collision24_small_westLeft;
    ImageView collision24_small_westStriaght ;
    ImageView collision24_small_westRight;
    ImageView collision24_small_westOther;
    ImageView collision24_small_westPedestrain1;
    ImageView collision24_small_westPedestrain2;
    ImageView collision24_small_westNone1;
    ImageView collision24_small_westNone2;
    ImageView collision25_small_northLeft ;
    ImageView collision25_small_northStriaght;
    ImageView collision25_small_northRight;
    ImageView collision25_small_northOther;
    ImageView collision25_small_northPedestrain1;
    ImageView collision25_small_northPedestrain2;
    ImageView collision25_small_northNone1;
    ImageView collision25_small_northNone2;
    ImageView collision25_small_eastLeft;
    ImageView collision25_small_eastStriaght;
    ImageView collision25_small_eastRight ;
    ImageView collision25_small_eastOther;
    ImageView collision25_small_eastPedestrain1;
    ImageView collision25_small_eastPedestrain2;
    ImageView collision25_small_eastNone1 ;
    ImageView collision25_small_eastNone2;
    ImageView collision25_small_southLeft;
    ImageView collision25_small_southStriaght;
    ImageView collision25_small_southRight;
    ImageView collision25_small_southOther;
    ImageView collision25_small_southPedestrain1;
    ImageView collision25_small_southPedestrain2;
    ImageView collision25_small_southNone1 ;
    ImageView collision25_small_southNone2 ;
    ImageView collision25_small_westLeft;
    ImageView collision25_small_westStriaght ;
    ImageView collision25_small_westRight;
    ImageView collision25_small_westOther;
    ImageView collision25_small_westPedestrain1;
    ImageView collision25_small_westPedestrain2;
    ImageView collision25_small_westNone1;
    ImageView collision25_small_westNone2;
    ImageView collision26_small_northLeft ;
    ImageView collision26_small_northStriaght;
    ImageView collision26_small_northRight;
    ImageView collision26_small_northOther;
    ImageView collision26_small_northPedestrain1;
    ImageView collision26_small_northPedestrain2;
    ImageView collision26_small_northNone1;
    ImageView collision26_small_northNone2;
    ImageView collision26_small_eastLeft;
    ImageView collision26_small_eastStriaght;
    ImageView collision26_small_eastRight ;
    ImageView collision26_small_eastOther;
    ImageView collision26_small_eastPedestrain1;
    ImageView collision26_small_eastPedestrain2;
    ImageView collision26_small_eastNone1 ;
    ImageView collision26_small_eastNone2;
    ImageView collision26_small_southLeft;
    ImageView collision26_small_southStriaght;
    ImageView collision26_small_southRight;
    ImageView collision26_small_southOther;
    ImageView collision26_small_southPedestrain1;
    ImageView collision26_small_southPedestrain2;
    ImageView collision26_small_southNone1 ;
    ImageView collision26_small_southNone2 ;
    ImageView collision26_small_westLeft;
    ImageView collision26_small_westStriaght ;
    ImageView collision26_small_westRight;
    ImageView collision26_small_westOther;
    ImageView collision26_small_westPedestrain1;
    ImageView collision26_small_westPedestrain2;
    ImageView collision26_small_westNone1;
    ImageView collision26_small_westNone2;
    ImageView collision27_small_northLeft ;
    ImageView collision27_small_northStriaght;
    ImageView collision27_small_northRight;
    ImageView collision27_small_northOther;
    ImageView collision27_small_northPedestrain1;
    ImageView collision27_small_northPedestrain2;
    ImageView collision27_small_northNone1;
    ImageView collision27_small_northNone2;
    ImageView collision27_small_eastLeft;
    ImageView collision27_small_eastStriaght;
    ImageView collision27_small_eastRight ;
    ImageView collision27_small_eastOther;
    ImageView collision27_small_eastPedestrain1;
    ImageView collision27_small_eastPedestrain2;
    ImageView collision27_small_eastNone1 ;
    ImageView collision27_small_eastNone2;
    ImageView collision27_small_southLeft;
    ImageView collision27_small_southStriaght;
    ImageView collision27_small_southRight;
    ImageView collision27_small_southOther;
    ImageView collision27_small_southPedestrain1;
    ImageView collision27_small_southPedestrain2;
    ImageView collision27_small_southNone1 ;
    ImageView collision27_small_southNone2 ;
    ImageView collision27_small_westLeft;
    ImageView collision27_small_westStriaght ;
    ImageView collision27_small_westRight;
    ImageView collision27_small_westOther;
    ImageView collision27_small_westPedestrain1;
    ImageView collision27_small_westPedestrain2;
    ImageView collision27_small_westNone1;
    ImageView collision27_small_westNone2;
    ImageView collision28_small_northLeft ;
    ImageView collision28_small_northStriaght;
    ImageView collision28_small_northRight;
    ImageView collision28_small_northOther;
    ImageView collision28_small_northPedestrain1;
    ImageView collision28_small_northPedestrain2;
    ImageView collision28_small_northNone1;
    ImageView collision28_small_northNone2;
    ImageView collision28_small_eastLeft;
    ImageView collision28_small_eastStriaght;
    ImageView collision28_small_eastRight ;
    ImageView collision28_small_eastOther;
    ImageView collision28_small_eastPedestrain1;
    ImageView collision28_small_eastPedestrain2;
    ImageView collision28_small_eastNone1 ;
    ImageView collision28_small_eastNone2;
    ImageView collision28_small_southLeft;
    ImageView collision28_small_southStriaght;
    ImageView collision28_small_southRight;
    ImageView collision28_small_southOther;
    ImageView collision28_small_southPedestrain1;
    ImageView collision28_small_southPedestrain2;
    ImageView collision28_small_southNone1 ;
    ImageView collision28_small_southNone2 ;
    ImageView collision28_small_westLeft;
    ImageView collision28_small_westStriaght ;
    ImageView collision28_small_westRight;
    ImageView collision28_small_westOther;
    ImageView collision28_small_westPedestrain1;
    ImageView collision28_small_westPedestrain2;
    ImageView collision28_small_westNone1;
    ImageView collision28_small_westNone2;
    ImageView collision29_small_northLeft ;
    ImageView collision29_small_northStriaght;
    ImageView collision29_small_northRight;
    ImageView collision29_small_northOther;
    ImageView collision29_small_northPedestrain1;
    ImageView collision29_small_northPedestrain2;
    ImageView collision29_small_northNone1;
    ImageView collision29_small_northNone2;
    ImageView collision29_small_eastLeft;
    ImageView collision29_small_eastStriaght;
    ImageView collision29_small_eastRight ;
    ImageView collision29_small_eastOther;
    ImageView collision29_small_eastPedestrain1;
    ImageView collision29_small_eastPedestrain2;
    ImageView collision29_small_eastNone1 ;
    ImageView collision29_small_eastNone2;
    ImageView collision29_small_southLeft;
    ImageView collision29_small_southStriaght;
    ImageView collision29_small_southRight;
    ImageView collision29_small_southOther;
    ImageView collision29_small_southPedestrain1;
    ImageView collision29_small_southPedestrain2;
    ImageView collision29_small_southNone1 ;
    ImageView collision29_small_southNone2 ;
    ImageView collision29_small_westLeft;
    ImageView collision29_small_westStriaght ;
    ImageView collision29_small_westRight;
    ImageView collision29_small_westOther;
    ImageView collision29_small_westPedestrain1;
    ImageView collision29_small_westPedestrain2;
    ImageView collision29_small_westNone1;
    ImageView collision29_small_westNone2;
    ImageView collision30_small_northLeft ;
    ImageView collision30_small_northStriaght;
    ImageView collision30_small_northRight;
    ImageView collision30_small_northOther;
    ImageView collision30_small_northPedestrain1;
    ImageView collision30_small_northPedestrain2;
    ImageView collision30_small_northNone1;
    ImageView collision30_small_northNone2;
    ImageView collision30_small_eastLeft;
    ImageView collision30_small_eastStriaght;
    ImageView collision30_small_eastRight ;
    ImageView collision30_small_eastOther;
    ImageView collision30_small_eastPedestrain1;
    ImageView collision30_small_eastPedestrain2;
    ImageView collision30_small_eastNone1 ;
    ImageView collision30_small_eastNone2;
    ImageView collision30_small_southLeft;
    ImageView collision30_small_southStriaght;
    ImageView collision30_small_southRight;
    ImageView collision30_small_southOther;
    ImageView collision30_small_southPedestrain1;
    ImageView collision30_small_southPedestrain2;
    ImageView collision30_small_southNone1 ;
    ImageView collision30_small_southNone2 ;
    ImageView collision30_small_westLeft;
    ImageView collision30_small_westStriaght ;
    ImageView collision30_small_westRight;
    ImageView collision30_small_westOther;
    ImageView collision30_small_westPedestrain1;
    ImageView collision30_small_westPedestrain2;
    ImageView collision30_small_westNone1;
    ImageView collision30_small_westNone2;
    ImageView collision31_small_northLeft ;
    ImageView collision31_small_northStriaght;
    ImageView collision31_small_northRight;
    ImageView collision31_small_northOther;
    ImageView collision31_small_northPedestrain1;
    ImageView collision31_small_northPedestrain2;
    ImageView collision31_small_northNone1;
    ImageView collision31_small_northNone2;
    ImageView collision31_small_eastLeft;
    ImageView collision31_small_eastStriaght;
    ImageView collision31_small_eastRight ;
    ImageView collision31_small_eastOther;
    ImageView collision31_small_eastPedestrain1;
    ImageView collision31_small_eastPedestrain2;
    ImageView collision31_small_eastNone1 ;
    ImageView collision31_small_eastNone2;
    ImageView collision31_small_southLeft;
    ImageView collision31_small_southStriaght;
    ImageView collision31_small_southRight;
    ImageView collision31_small_southOther;
    ImageView collision31_small_southPedestrain1;
    ImageView collision31_small_southPedestrain2;
    ImageView collision31_small_southNone1 ;
    ImageView collision31_small_southNone2 ;
    ImageView collision31_small_westLeft;
    ImageView collision31_small_westStriaght ;
    ImageView collision31_small_westRight;
    ImageView collision31_small_westOther;
    ImageView collision31_small_westPedestrain1;
    ImageView collision31_small_westPedestrain2;
    ImageView collision31_small_westNone1;
    ImageView collision31_small_westNone2;
    ImageView collision32_small_northLeft ;
    ImageView collision32_small_northStriaght;
    ImageView collision32_small_northRight;
    ImageView collision32_small_northOther;
    ImageView collision32_small_northPedestrain1;
    ImageView collision32_small_northPedestrain2;
    ImageView collision32_small_northNone1;
    ImageView collision32_small_northNone2;
    ImageView collision32_small_eastLeft;
    ImageView collision32_small_eastStriaght;
    ImageView collision32_small_eastRight ;
    ImageView collision32_small_eastOther;
    ImageView collision32_small_eastPedestrain1;
    ImageView collision32_small_eastPedestrain2;
    ImageView collision32_small_eastNone1 ;
    ImageView collision32_small_eastNone2;
    ImageView collision32_small_southLeft;
    ImageView collision32_small_southStriaght;
    ImageView collision32_small_southRight;
    ImageView collision32_small_southOther;
    ImageView collision32_small_southPedestrain1;
    ImageView collision32_small_southPedestrain2;
    ImageView collision32_small_southNone1 ;
    ImageView collision32_small_southNone2 ;
    ImageView collision32_small_westLeft;
    ImageView collision32_small_westStriaght ;
    ImageView collision32_small_westRight;
    ImageView collision32_small_westOther;
    ImageView collision32_small_westPedestrain1;
    ImageView collision32_small_westPedestrain2;
    ImageView collision32_small_westNone1;
    ImageView collision32_small_westNone2;

    List<GbtStagePattern> gbtStagePatterns;
    List<GbtTimePattern> gbtTimePatterns;
    List<GbtDirec> gbtDirecs;
    List<GbtPhase> gbtPhases;

    ImageView collision_northLeft;
    ImageView collision_northStraight;
    ImageView collision_northRight;
    ImageView collision_northOther;
    ImageView collision_northPedestrain1;
    ImageView collision_northPedestrain2;
    ImageView collision_northNone1;
    ImageView collision_northNone2;
    ImageView collision_eastOther;
    ImageView collision_eastRight;
    ImageView collision_eastStriaght;
    ImageView collision_eastLeft;
    ImageView collision_eastPedestrain1;
    ImageView collision_eastPedestrain2;
    ImageView collision_eastNone1;
    ImageView collision_eastNone2;
    ImageView collision_southLeft;
    ImageView collision_southStriaght;
    ImageView collision_southRight;
    ImageView collision_southOther;
    ImageView collision_southPedestrain1;
    ImageView collision_southPedestrain2;
    ImageView collision_southNone1;
    ImageView collision_southNone2;
    ImageView collision_westOther;
    ImageView collision_westRight;
    ImageView collision_westStriaght;
    ImageView collision_westLeft;
    ImageView collision_westPedestrain1;
    ImageView collision_westPedestrain2;
    ImageView collision_westNone1;
    ImageView collision_westNone2;
    private int selected_id = 1;


    List<View> views = new ArrayList<View>();
    private void initViews(){
        views.add(collision1);
        views.add(collision2);
        views.add(collision3);
        views.add(collision4);
        views.add(collision5);
        views.add(collision6);
        views.add(collision7);
        views.add(collision8);
        views.add(collision9);
        views.add(collision10);
        views.add(collision11);
        views.add(collision12);
        views.add(collision13);
        views.add(collision14);
        views.add(collision15);
        views.add(collision16);
        views.add(collision17);
        views.add(collision18);
        views.add(collision19);
        views.add(collision20);
        views.add(collision21);
        views.add(collision22);
        views.add(collision23);
        views.add(collision24);
        views.add(collision25);
        views.add(collision26);
        views.add(collision27);
        views.add(collision28);
        views.add(collision29);
        views.add(collision30);
        views.add(collision31);
        views.add(collision32);
    }
    List<ImageView> imageViews = new ArrayList<ImageView>();
    private void initImageViews(){
        imageViews.add(collision_northLeft);
        imageViews.add(collision_northStraight);
        imageViews.add(collision_northRight);
        imageViews.add(collision_northOther);
        imageViews.add(collision_northPedestrain1);
        imageViews.add(collision_northPedestrain2);
        imageViews.add(collision_westNone1);
        imageViews.add(collision_westNone2);
        imageViews.add(collision_eastOther);
        imageViews.add(collision_eastRight);
        imageViews.add(collision_eastStriaght);
        imageViews.add(collision_eastLeft);
        imageViews.add(collision_eastPedestrain1);
        imageViews.add(collision_eastPedestrain2);
        imageViews.add(collision_northNone1);
        imageViews.add(collision_northNone2);
        imageViews.add(collision_southLeft);
        imageViews.add(collision_southStriaght);
        imageViews.add(collision_southRight);
        imageViews.add(collision_southOther);
        imageViews.add(collision_southPedestrain1);
        imageViews.add(collision_southPedestrain2);
        imageViews.add(collision_eastNone1);
        imageViews.add(collision_eastNone2);
        imageViews.add(collision_westOther);
        imageViews.add(collision_westRight);
        imageViews.add(collision_westStriaght);
        imageViews.add(collision_westLeft);
        imageViews.add(collision_westPedestrain1);
        imageViews.add(collision_westPedestrain2);
        imageViews.add(collision_southNone1);
        imageViews.add(collision_southNone2);

        imageViews.add(collision1_small_northLeft                );
        imageViews.add(collision1_small_northStriaght            );
        imageViews.add(collision1_small_northRight               );
        imageViews.add(collision1_small_northOther               );
        imageViews.add(collision1_small_northPedestrain1         );
        imageViews.add(collision1_small_northPedestrain2         );
        imageViews.add(collision1_small_northNone1        );
        imageViews.add(collision1_small_northNone2);
        imageViews.add(collision1_small_eastLeft                 );
        imageViews.add(collision1_small_eastStriaght             );
        imageViews.add(collision1_small_eastRight                );
        imageViews.add(collision1_small_eastOther                );
        imageViews.add(collision1_small_eastPedestrain1          );
        imageViews.add(collision1_small_eastPedestrain2          );
        imageViews.add(collision1_small_eastNone1         );
        imageViews.add(collision1_small_eastNone2 );
        imageViews.add(collision1_small_southLeft                );
        imageViews.add(collision1_small_southStriaght            );
        imageViews.add(collision1_small_southRight               );
        imageViews.add(collision1_small_southOther               );
        imageViews.add(collision1_small_southPedestrain1         );
        imageViews.add(collision1_small_southPedestrain2         );
        imageViews.add(collision1_small_southNone1        );
        imageViews.add(collision1_small_southNone2);
        imageViews.add(collision1_small_westLeft                 );
        imageViews.add(collision1_small_westStriaght             );
        imageViews.add(collision1_small_westRight                );
        imageViews.add(collision1_small_westOther                );
        imageViews.add(collision1_small_westPedestrain1          );
        imageViews.add(collision1_small_westPedestrain2          );
        imageViews.add(collision1_small_westNone1         );
        imageViews.add(collision1_small_westNone2 );
        imageViews.add(collision2_small_northLeft                );
        imageViews.add(collision2_small_northStriaght            );
        imageViews.add(collision2_small_northRight               );
        imageViews.add(collision2_small_northOther               );
        imageViews.add(collision2_small_northPedestrain1         );
        imageViews.add(collision2_small_northPedestrain2         );
        imageViews.add(collision2_small_northNone1        );
        imageViews.add(collision2_small_northNone2);
        imageViews.add(collision2_small_eastLeft                 );
        imageViews.add(collision2_small_eastStriaght             );
        imageViews.add(collision2_small_eastRight                );
        imageViews.add(collision2_small_eastOther                );
        imageViews.add(collision2_small_eastPedestrain1          );
        imageViews.add(collision2_small_eastPedestrain2          );
        imageViews.add(collision2_small_eastNone1         );
        imageViews.add(collision2_small_eastNone2 );
        imageViews.add(collision2_small_southLeft                );
        imageViews.add(collision2_small_southStriaght            );
        imageViews.add(collision2_small_southRight               );
        imageViews.add(collision2_small_southOther               );
        imageViews.add(collision2_small_southPedestrain1         );
        imageViews.add(collision2_small_southPedestrain2         );
        imageViews.add(collision2_small_southNone1        );
        imageViews.add(collision2_small_southNone2);
        imageViews.add(collision2_small_westLeft                 );
        imageViews.add(collision2_small_westStriaght             );
        imageViews.add(collision2_small_westRight                );
        imageViews.add(collision2_small_westOther                );
        imageViews.add(collision2_small_westPedestrain1          );
        imageViews.add(collision2_small_westPedestrain2          );
        imageViews.add(collision2_small_westNone1         );
        imageViews.add(collision2_small_westNone2 );
        imageViews.add(collision3_small_northLeft                );
        imageViews.add(collision3_small_northStriaght            );
        imageViews.add(collision3_small_northRight               );
        imageViews.add(collision3_small_northOther               );
        imageViews.add(collision3_small_northPedestrain1         );
        imageViews.add(collision3_small_northPedestrain2         );
        imageViews.add(collision3_small_northNone1        );
        imageViews.add(collision3_small_northNone2);
        imageViews.add(collision3_small_eastLeft                 );
        imageViews.add(collision3_small_eastStriaght             );
        imageViews.add(collision3_small_eastRight                );
        imageViews.add(collision3_small_eastOther                );
        imageViews.add(collision3_small_eastPedestrain1          );
        imageViews.add(collision3_small_eastPedestrain2          );
        imageViews.add(collision3_small_eastNone1         );
        imageViews.add(collision3_small_eastNone2 );
        imageViews.add(collision3_small_southLeft                );
        imageViews.add(collision3_small_southStriaght            );
        imageViews.add(collision3_small_southRight               );
        imageViews.add(collision3_small_southOther               );
        imageViews.add(collision3_small_southPedestrain1         );
        imageViews.add(collision3_small_southPedestrain2         );
        imageViews.add(collision3_small_southNone1        );
        imageViews.add(collision3_small_southNone2);
        imageViews.add(collision3_small_westLeft                 );
        imageViews.add(collision3_small_westStriaght             );
        imageViews.add(collision3_small_westRight                );
        imageViews.add(collision3_small_westOther                );
        imageViews.add(collision3_small_westPedestrain1          );
        imageViews.add(collision3_small_westPedestrain2          );
        imageViews.add(collision3_small_westNone1         );
        imageViews.add(collision3_small_westNone2 );
        imageViews.add(collision4_small_northLeft                );
        imageViews.add(collision4_small_northStriaght            );
        imageViews.add(collision4_small_northRight               );
        imageViews.add(collision4_small_northOther               );
        imageViews.add(collision4_small_northPedestrain1         );
        imageViews.add(collision4_small_northPedestrain2         );
        imageViews.add(collision4_small_northNone1        );
        imageViews.add(collision4_small_northNone2);
        imageViews.add(collision4_small_eastLeft                 );
        imageViews.add(collision4_small_eastStriaght             );
        imageViews.add(collision4_small_eastRight                );
        imageViews.add(collision4_small_eastOther                );
        imageViews.add(collision4_small_eastPedestrain1          );
        imageViews.add(collision4_small_eastPedestrain2          );
        imageViews.add(collision4_small_eastNone1         );
        imageViews.add(collision4_small_eastNone2 );
        imageViews.add(collision4_small_southLeft                );
        imageViews.add(collision4_small_southStriaght            );
        imageViews.add(collision4_small_southRight               );
        imageViews.add(collision4_small_southOther               );
        imageViews.add(collision4_small_southPedestrain1         );
        imageViews.add(collision4_small_southPedestrain2         );
        imageViews.add(collision4_small_southNone1        );
        imageViews.add(collision4_small_southNone2);
        imageViews.add(collision4_small_westLeft                 );
        imageViews.add(collision4_small_westStriaght             );
        imageViews.add(collision4_small_westRight                );
        imageViews.add(collision4_small_westOther                );
        imageViews.add(collision4_small_westPedestrain1          );
        imageViews.add(collision4_small_westPedestrain2          );
        imageViews.add(collision4_small_westNone1         );
        imageViews.add(collision4_small_westNone2 );
        imageViews.add(collision5_small_northLeft                );
        imageViews.add(collision5_small_northStriaght            );
        imageViews.add(collision5_small_northRight               );
        imageViews.add(collision5_small_northOther               );
        imageViews.add(collision5_small_northPedestrain1         );
        imageViews.add(collision5_small_northPedestrain2         );
        imageViews.add(collision5_small_northNone1        );
        imageViews.add(collision5_small_northNone2);
        imageViews.add(collision5_small_eastLeft                 );
        imageViews.add(collision5_small_eastStriaght             );
        imageViews.add(collision5_small_eastRight                );
        imageViews.add(collision5_small_eastOther                );
        imageViews.add(collision5_small_eastPedestrain1          );
        imageViews.add(collision5_small_eastPedestrain2          );
        imageViews.add(collision5_small_eastNone1         );
        imageViews.add(collision5_small_eastNone2 );
        imageViews.add(collision5_small_southLeft                );
        imageViews.add(collision5_small_southStriaght            );
        imageViews.add(collision5_small_southRight               );
        imageViews.add(collision5_small_southOther               );
        imageViews.add(collision5_small_southPedestrain1         );
        imageViews.add(collision5_small_southPedestrain2         );
        imageViews.add(collision5_small_southNone1        );
        imageViews.add(collision5_small_southNone2);
        imageViews.add(collision5_small_westLeft                 );
        imageViews.add(collision5_small_westStriaght             );
        imageViews.add(collision5_small_westRight                );
        imageViews.add(collision5_small_westOther                );
        imageViews.add(collision5_small_westPedestrain1          );
        imageViews.add(collision5_small_westPedestrain2          );
        imageViews.add(collision5_small_westNone1         );
        imageViews.add(collision5_small_westNone2 );
        imageViews.add(collision6_small_northLeft                );
        imageViews.add(collision6_small_northStriaght            );
        imageViews.add(collision6_small_northRight               );
        imageViews.add(collision6_small_northOther               );
        imageViews.add(collision6_small_northPedestrain1         );
        imageViews.add(collision6_small_northPedestrain2         );
        imageViews.add(collision6_small_northNone1        );
        imageViews.add(collision6_small_northNone2);
        imageViews.add(collision6_small_eastLeft                 );
        imageViews.add(collision6_small_eastStriaght             );
        imageViews.add(collision6_small_eastRight                );
        imageViews.add(collision6_small_eastOther                );
        imageViews.add(collision6_small_eastPedestrain1          );
        imageViews.add(collision6_small_eastPedestrain2          );
        imageViews.add(collision6_small_eastNone1         );
        imageViews.add(collision6_small_eastNone2 );
        imageViews.add(collision6_small_southLeft                );
        imageViews.add(collision6_small_southStriaght            );
        imageViews.add(collision6_small_southRight               );
        imageViews.add(collision6_small_southOther               );
        imageViews.add(collision6_small_southPedestrain1         );
        imageViews.add(collision6_small_southPedestrain2         );
        imageViews.add(collision6_small_southNone1        );
        imageViews.add(collision6_small_southNone2);
        imageViews.add(collision6_small_westLeft                 );
        imageViews.add(collision6_small_westStriaght             );
        imageViews.add(collision6_small_westRight                );
        imageViews.add(collision6_small_westOther                );
        imageViews.add(collision6_small_westPedestrain1          );
        imageViews.add(collision6_small_westPedestrain2          );
        imageViews.add(collision6_small_westNone1         );
        imageViews.add(collision6_small_westNone2 );
        imageViews.add(collision7_small_northLeft                );
        imageViews.add(collision7_small_northStriaght            );
        imageViews.add(collision7_small_northRight               );
        imageViews.add(collision7_small_northOther               );
        imageViews.add(collision7_small_northPedestrain1         );
        imageViews.add(collision7_small_northPedestrain2         );
        imageViews.add(collision7_small_northNone1        );
        imageViews.add(collision7_small_northNone2);
        imageViews.add(collision7_small_eastLeft                 );
        imageViews.add(collision7_small_eastStriaght             );
        imageViews.add(collision7_small_eastRight                );
        imageViews.add(collision7_small_eastOther                );
        imageViews.add(collision7_small_eastPedestrain1          );
        imageViews.add(collision7_small_eastPedestrain2          );
        imageViews.add(collision7_small_eastNone1         );
        imageViews.add(collision7_small_eastNone2 );
        imageViews.add(collision7_small_southLeft                );
        imageViews.add(collision7_small_southStriaght            );
        imageViews.add(collision7_small_southRight               );
        imageViews.add(collision7_small_southOther               );
        imageViews.add(collision7_small_southPedestrain1         );
        imageViews.add(collision7_small_southPedestrain2         );
        imageViews.add(collision7_small_southNone1        );
        imageViews.add(collision7_small_southNone2);
        imageViews.add(collision7_small_westLeft                 );
        imageViews.add(collision7_small_westStriaght             );
        imageViews.add(collision7_small_westRight                );
        imageViews.add(collision7_small_westOther                );
        imageViews.add(collision7_small_westPedestrain1          );
        imageViews.add(collision7_small_westPedestrain2          );
        imageViews.add(collision7_small_westNone1         );
        imageViews.add(collision7_small_westNone2 );
        imageViews.add(collision8_small_northLeft                );
        imageViews.add(collision8_small_northStriaght            );
        imageViews.add(collision8_small_northRight               );
        imageViews.add(collision8_small_northOther               );
        imageViews.add(collision8_small_northPedestrain1         );
        imageViews.add(collision8_small_northPedestrain2         );
        imageViews.add(collision8_small_northNone1        );
        imageViews.add(collision8_small_northNone2);
        imageViews.add(collision8_small_eastLeft                 );
        imageViews.add(collision8_small_eastStriaght             );
        imageViews.add(collision8_small_eastRight                );
        imageViews.add(collision8_small_eastOther                );
        imageViews.add(collision8_small_eastPedestrain1          );
        imageViews.add(collision8_small_eastPedestrain2          );
        imageViews.add(collision8_small_eastNone1         );
        imageViews.add(collision8_small_eastNone2 );
        imageViews.add(collision8_small_southLeft                );
        imageViews.add(collision8_small_southStriaght            );
        imageViews.add(collision8_small_southRight               );
        imageViews.add(collision8_small_southOther               );
        imageViews.add(collision8_small_southPedestrain1         );
        imageViews.add(collision8_small_southPedestrain2         );
        imageViews.add(collision8_small_southNone1        );
        imageViews.add(collision8_small_southNone2);
        imageViews.add(collision8_small_westLeft                 );
        imageViews.add(collision8_small_westStriaght             );
        imageViews.add(collision8_small_westRight                );
        imageViews.add(collision8_small_westOther                );
        imageViews.add(collision8_small_westPedestrain1          );
        imageViews.add(collision8_small_westPedestrain2          );
        imageViews.add(collision8_small_westNone1         );
        imageViews.add(collision8_small_westNone2 );
        imageViews.add(collision9_small_northLeft                );
        imageViews.add(collision9_small_northStriaght            );
        imageViews.add(collision9_small_northRight               );
        imageViews.add(collision9_small_northOther               );
        imageViews.add(collision9_small_northPedestrain1         );
        imageViews.add(collision9_small_northPedestrain2         );
        imageViews.add(collision9_small_northNone1        );
        imageViews.add(collision9_small_northNone2);
        imageViews.add(collision9_small_eastLeft                 );
        imageViews.add(collision9_small_eastStriaght             );
        imageViews.add(collision9_small_eastRight                );
        imageViews.add(collision9_small_eastOther                );
        imageViews.add(collision9_small_eastPedestrain1          );
        imageViews.add(collision9_small_eastPedestrain2          );
        imageViews.add(collision9_small_eastNone1         );
        imageViews.add(collision9_small_eastNone2 );
        imageViews.add(collision9_small_southLeft                );
        imageViews.add(collision9_small_southStriaght            );
        imageViews.add(collision9_small_southRight               );
        imageViews.add(collision9_small_southOther               );
        imageViews.add(collision9_small_southPedestrain1         );
        imageViews.add(collision9_small_southPedestrain2         );
        imageViews.add(collision9_small_southNone1        );
        imageViews.add(collision9_small_southNone2);
        imageViews.add(collision9_small_westLeft                 );
        imageViews.add(collision9_small_westStriaght             );
        imageViews.add(collision9_small_westRight                );
        imageViews.add(collision9_small_westOther                );
        imageViews.add(collision9_small_westPedestrain1          );
        imageViews.add(collision9_small_westPedestrain2          );
        imageViews.add(collision9_small_westNone1         );
        imageViews.add(collision9_small_westNone2 );
        imageViews.add(collision10_small_northLeft               );
        imageViews.add(collision10_small_northStriaght           );
        imageViews.add(collision10_small_northRight              );
        imageViews.add(collision10_small_northOther              );
        imageViews.add(collision10_small_northPedestrain1        );
        imageViews.add(collision10_small_northPedestrain2        );
        imageViews.add(collision10_small_northNone1       );
        imageViews.add(collision10_small_northNone2);
        imageViews.add(collision10_small_eastLeft                );
        imageViews.add(collision10_small_eastStriaght            );
        imageViews.add(collision10_small_eastRight               );
        imageViews.add(collision10_small_eastOther               );
        imageViews.add(collision10_small_eastPedestrain1         );
        imageViews.add(collision10_small_eastPedestrain2         );
        imageViews.add(collision10_small_eastNone1        );
        imageViews.add(collision10_small_eastNone2);
        imageViews.add(collision10_small_southLeft               );
        imageViews.add(collision10_small_southStriaght           );
        imageViews.add(collision10_small_southRight              );
        imageViews.add(collision10_small_southOther              );
        imageViews.add(collision10_small_southPedestrain1        );
        imageViews.add(collision10_small_southPedestrain2        );
        imageViews.add(collision10_small_southNone1       );
        imageViews.add(collision10_small_southNone2);
        imageViews.add(collision10_small_westLeft                );
        imageViews.add(collision10_small_westStriaght            );
        imageViews.add(collision10_small_westRight               );
        imageViews.add(collision10_small_westOther               );
        imageViews.add(collision10_small_westPedestrain1         );
        imageViews.add(collision10_small_westPedestrain2         );
        imageViews.add(collision10_small_westNone1        );
        imageViews.add(collision10_small_westNone2);
        imageViews.add(collision11_small_northLeft               );
        imageViews.add(collision11_small_northStriaght           );
        imageViews.add(collision11_small_northRight              );
        imageViews.add(collision11_small_northOther              );
        imageViews.add(collision11_small_northPedestrain1        );
        imageViews.add(collision11_small_northPedestrain2        );
        imageViews.add(collision11_small_northNone1       );
        imageViews.add(collision11_small_northNone2);
        imageViews.add(collision11_small_eastLeft                );
        imageViews.add(collision11_small_eastStriaght            );
        imageViews.add(collision11_small_eastRight               );
        imageViews.add(collision11_small_eastOther               );
        imageViews.add(collision11_small_eastPedestrain1         );
        imageViews.add(collision11_small_eastPedestrain2         );
        imageViews.add(collision11_small_eastNone1        );
        imageViews.add(collision11_small_eastNone2);
        imageViews.add(collision11_small_southLeft               );
        imageViews.add(collision11_small_southStriaght           );
        imageViews.add(collision11_small_southRight              );
        imageViews.add(collision11_small_southOther              );
        imageViews.add(collision11_small_southPedestrain1        );
        imageViews.add(collision11_small_southPedestrain2        );
        imageViews.add(collision11_small_southNone1       );
        imageViews.add(collision11_small_southNone2);
        imageViews.add(collision11_small_westLeft                );
        imageViews.add(collision11_small_westStriaght            );
        imageViews.add(collision11_small_westRight               );
        imageViews.add(collision11_small_westOther               );
        imageViews.add(collision11_small_westPedestrain1         );
        imageViews.add(collision11_small_westPedestrain2         );
        imageViews.add(collision11_small_westNone1        );
        imageViews.add(collision11_small_westNone2);
        imageViews.add(collision12_small_northLeft               );
        imageViews.add(collision12_small_northStriaght           );
        imageViews.add(collision12_small_northRight              );
        imageViews.add(collision12_small_northOther              );
        imageViews.add(collision12_small_northPedestrain1        );
        imageViews.add(collision12_small_northPedestrain2        );
        imageViews.add(collision12_small_northNone1       );
        imageViews.add(collision12_small_northNone2);
        imageViews.add(collision12_small_eastLeft                );
        imageViews.add(collision12_small_eastStriaght            );
        imageViews.add(collision12_small_eastRight               );
        imageViews.add(collision12_small_eastOther               );
        imageViews.add(collision12_small_eastPedestrain1         );
        imageViews.add(collision12_small_eastPedestrain2         );
        imageViews.add(collision12_small_eastNone1        );
        imageViews.add(collision12_small_eastNone2);
        imageViews.add(collision12_small_southLeft               );
        imageViews.add(collision12_small_southStriaght           );
        imageViews.add(collision12_small_southRight              );
        imageViews.add(collision12_small_southOther              );
        imageViews.add(collision12_small_southPedestrain1        );
        imageViews.add(collision12_small_southPedestrain2        );
        imageViews.add(collision12_small_southNone1       );
        imageViews.add(collision12_small_southNone2);
        imageViews.add(collision12_small_westLeft                );
        imageViews.add(collision12_small_westStriaght            );
        imageViews.add(collision12_small_westRight               );
        imageViews.add(collision12_small_westOther               );
        imageViews.add(collision12_small_westPedestrain1         );
        imageViews.add(collision12_small_westPedestrain2         );
        imageViews.add(collision12_small_westNone1        );
        imageViews.add(collision12_small_westNone2);
        imageViews.add(collision13_small_northLeft               );
        imageViews.add(collision13_small_northStriaght           );
        imageViews.add(collision13_small_northRight              );
        imageViews.add(collision13_small_northOther              );
        imageViews.add(collision13_small_northPedestrain1        );
        imageViews.add(collision13_small_northPedestrain2        );
        imageViews.add(collision13_small_northNone1       );
        imageViews.add(collision13_small_northNone2);
        imageViews.add(collision13_small_eastLeft                );
        imageViews.add(collision13_small_eastStriaght            );
        imageViews.add(collision13_small_eastRight               );
        imageViews.add(collision13_small_eastOther               );
        imageViews.add(collision13_small_eastPedestrain1         );
        imageViews.add(collision13_small_eastPedestrain2         );
        imageViews.add(collision13_small_eastNone1        );
        imageViews.add(collision13_small_eastNone2);
        imageViews.add(collision13_small_southLeft               );
        imageViews.add(collision13_small_southStriaght           );
        imageViews.add(collision13_small_southRight              );
        imageViews.add(collision13_small_southOther              );
        imageViews.add(collision13_small_southPedestrain1        );
        imageViews.add(collision13_small_southPedestrain2        );
        imageViews.add(collision13_small_southNone1       );
        imageViews.add(collision13_small_southNone2);
        imageViews.add(collision13_small_westLeft                );
        imageViews.add(collision13_small_westStriaght            );
        imageViews.add(collision13_small_westRight               );
        imageViews.add(collision13_small_westOther               );
        imageViews.add(collision13_small_westPedestrain1         );
        imageViews.add(collision13_small_westPedestrain2         );
        imageViews.add(collision13_small_westNone1        );
        imageViews.add(collision13_small_westNone2);
        imageViews.add(collision14_small_northLeft               );
        imageViews.add(collision14_small_northStriaght           );
        imageViews.add(collision14_small_northRight              );
        imageViews.add(collision14_small_northOther              );
        imageViews.add(collision14_small_northPedestrain1        );
        imageViews.add(collision14_small_northPedestrain2        );
        imageViews.add(collision14_small_northNone1       );
        imageViews.add(collision14_small_northNone2);
        imageViews.add(collision14_small_eastLeft                );
        imageViews.add(collision14_small_eastStriaght            );
        imageViews.add(collision14_small_eastRight               );
        imageViews.add(collision14_small_eastOther               );
        imageViews.add(collision14_small_eastPedestrain1         );
        imageViews.add(collision14_small_eastPedestrain2         );
        imageViews.add(collision14_small_eastNone1        );
        imageViews.add(collision14_small_eastNone2);
        imageViews.add(collision14_small_southLeft               );
        imageViews.add(collision14_small_southStriaght           );
        imageViews.add(collision14_small_southRight              );
        imageViews.add(collision14_small_southOther              );
        imageViews.add(collision14_small_southPedestrain1        );
        imageViews.add(collision14_small_southPedestrain2        );
        imageViews.add(collision14_small_southNone1       );
        imageViews.add(collision14_small_southNone2);
        imageViews.add(collision14_small_westLeft                );
        imageViews.add(collision14_small_westStriaght            );
        imageViews.add(collision14_small_westRight               );
        imageViews.add(collision14_small_westOther               );
        imageViews.add(collision14_small_westPedestrain1         );
        imageViews.add(collision14_small_westPedestrain2         );
        imageViews.add(collision14_small_westNone1        );
        imageViews.add(collision14_small_westNone2);
        imageViews.add(collision15_small_northLeft               );
        imageViews.add(collision15_small_northStriaght           );
        imageViews.add(collision15_small_northRight              );
        imageViews.add(collision15_small_northOther              );
        imageViews.add(collision15_small_northPedestrain1        );
        imageViews.add(collision15_small_northPedestrain2        );
        imageViews.add(collision15_small_northNone1       );
        imageViews.add(collision15_small_northNone2);
        imageViews.add(collision15_small_eastLeft                );
        imageViews.add(collision15_small_eastStriaght            );
        imageViews.add(collision15_small_eastRight               );
        imageViews.add(collision15_small_eastOther               );
        imageViews.add(collision15_small_eastPedestrain1         );
        imageViews.add(collision15_small_eastPedestrain2         );
        imageViews.add(collision15_small_eastNone1        );
        imageViews.add(collision15_small_eastNone2);
        imageViews.add(collision15_small_southLeft               );
        imageViews.add(collision15_small_southStriaght           );
        imageViews.add(collision15_small_southRight              );
        imageViews.add(collision15_small_southOther              );
        imageViews.add(collision15_small_southPedestrain1        );
        imageViews.add(collision15_small_southPedestrain2        );
        imageViews.add(collision15_small_southNone1       );
        imageViews.add(collision15_small_southNone2);
        imageViews.add(collision15_small_westLeft                );
        imageViews.add(collision15_small_westStriaght            );
        imageViews.add(collision15_small_westRight               );
        imageViews.add(collision15_small_westOther               );
        imageViews.add(collision15_small_westPedestrain1         );
        imageViews.add(collision15_small_westPedestrain2         );
        imageViews.add(collision15_small_westNone1        );
        imageViews.add(collision15_small_westNone2);
        imageViews.add(collision16_small_northLeft                   );
        imageViews.add(collision16_small_northStriaght               );
        imageViews.add(collision16_small_northRight                  );
        imageViews.add(collision16_small_northOther                  );
        imageViews.add(collision16_small_northPedestrain1            );
        imageViews.add(collision16_small_northPedestrain2            );
        imageViews.add(collision16_small_northNone1           );
        imageViews.add(collision16_small_northNone2   );
        imageViews.add(collision16_small_eastLeft                    );
        imageViews.add(collision16_small_eastStriaght                );
        imageViews.add(collision16_small_eastRight                   );
        imageViews.add(collision16_small_eastOther                   );
        imageViews.add(collision16_small_eastPedestrain1             );
        imageViews.add(collision16_small_eastPedestrain2             );
        imageViews.add(collision16_small_eastNone1            );
        imageViews.add(collision16_small_eastNone2    );
        imageViews.add(collision16_small_southLeft                   );
        imageViews.add(collision16_small_southStriaght               );
        imageViews.add(collision16_small_southRight                  );
        imageViews.add(collision16_small_southOther                  );
        imageViews.add(collision16_small_southPedestrain1            );
        imageViews.add(collision16_small_southPedestrain2            );
        imageViews.add(collision16_small_southNone1           );
        imageViews.add(collision16_small_southNone2   );
        imageViews.add(collision16_small_westLeft                    );
        imageViews.add(collision16_small_westStriaght                );
        imageViews.add(collision16_small_westRight                   );
        imageViews.add(collision16_small_westOther                   );
        imageViews.add(collision16_small_westPedestrain1             );
        imageViews.add(collision16_small_westPedestrain2             );
        imageViews.add(collision16_small_westNone1            );
        imageViews.add(collision16_small_westNone2    );
        imageViews.add(collision17_small_northLeft                   );
        imageViews.add(collision17_small_northStriaght               );
        imageViews.add(collision17_small_northRight                  );
        imageViews.add(collision17_small_northOther                  );
        imageViews.add(collision17_small_northPedestrain1            );
        imageViews.add(collision17_small_northPedestrain2            );
        imageViews.add(collision17_small_northNone1           );
        imageViews.add(collision17_small_northNone2   );
        imageViews.add(collision17_small_eastLeft                    );
        imageViews.add(collision17_small_eastStriaght                );
        imageViews.add(collision17_small_eastRight                   );
        imageViews.add(collision17_small_eastOther                   );
        imageViews.add(collision17_small_eastPedestrain1             );
        imageViews.add(collision17_small_eastPedestrain2             );
        imageViews.add(collision17_small_eastNone1            );
        imageViews.add(collision17_small_eastNone2    );
        imageViews.add(collision17_small_southLeft                   );
        imageViews.add(collision17_small_southStriaght               );
        imageViews.add(collision17_small_southRight                  );
        imageViews.add(collision17_small_southOther                  );
        imageViews.add(collision17_small_southPedestrain1            );
        imageViews.add(collision17_small_southPedestrain2            );
        imageViews.add(collision17_small_southNone1           );
        imageViews.add(collision17_small_southNone2   );
        imageViews.add(collision17_small_westLeft                    );
        imageViews.add(collision17_small_westStriaght                );
        imageViews.add(collision17_small_westRight                   );
        imageViews.add(collision17_small_westOther                   );
        imageViews.add(collision17_small_westPedestrain1             );
        imageViews.add(collision17_small_westPedestrain2             );
        imageViews.add(collision17_small_westNone1            );
        imageViews.add(collision17_small_westNone2    );
        imageViews.add(collision18_small_northLeft                   );
        imageViews.add(collision18_small_northStriaght               );
        imageViews.add(collision18_small_northRight                  );
        imageViews.add(collision18_small_northOther                  );
        imageViews.add(collision18_small_northPedestrain1            );
        imageViews.add(collision18_small_northPedestrain2            );
        imageViews.add(collision18_small_northNone1           );
        imageViews.add(collision18_small_northNone2   );
        imageViews.add(collision18_small_eastLeft                    );
        imageViews.add(collision18_small_eastStriaght                );
        imageViews.add(collision18_small_eastRight                   );
        imageViews.add(collision18_small_eastOther                   );
        imageViews.add(collision18_small_eastPedestrain1             );
        imageViews.add(collision18_small_eastPedestrain2             );
        imageViews.add(collision18_small_eastNone1            );
        imageViews.add(collision18_small_eastNone2    );
        imageViews.add(collision18_small_southLeft                   );
        imageViews.add(collision18_small_southStriaght               );
        imageViews.add(collision18_small_southRight                  );
        imageViews.add(collision18_small_southOther                  );
        imageViews.add(collision18_small_southPedestrain1            );
        imageViews.add(collision18_small_southPedestrain2            );
        imageViews.add(collision18_small_southNone1           );
        imageViews.add(collision18_small_southNone2   );
        imageViews.add(collision18_small_westLeft                    );
        imageViews.add(collision18_small_westStriaght                );
        imageViews.add(collision18_small_westRight                   );
        imageViews.add(collision18_small_westOther                   );
        imageViews.add(collision18_small_westPedestrain1             );
        imageViews.add(collision18_small_westPedestrain2             );
        imageViews.add(collision18_small_westNone1            );
        imageViews.add(collision18_small_westNone2    );
        imageViews.add(collision19_small_northLeft                   );
        imageViews.add(collision19_small_northStriaght               );
        imageViews.add(collision19_small_northRight                  );
        imageViews.add(collision19_small_northOther                  );
        imageViews.add(collision19_small_northPedestrain1            );
        imageViews.add(collision19_small_northPedestrain2            );
        imageViews.add(collision19_small_northNone1           );
        imageViews.add(collision19_small_northNone2   );
        imageViews.add(collision19_small_eastLeft                    );
        imageViews.add(collision19_small_eastStriaght                );
        imageViews.add(collision19_small_eastRight                   );
        imageViews.add(collision19_small_eastOther                   );
        imageViews.add(collision19_small_eastPedestrain1             );
        imageViews.add(collision19_small_eastPedestrain2             );
        imageViews.add(collision19_small_eastNone1            );
        imageViews.add(collision19_small_eastNone2    );
        imageViews.add(collision19_small_southLeft                   );
        imageViews.add(collision19_small_southStriaght               );
        imageViews.add(collision19_small_southRight                  );
        imageViews.add(collision19_small_southOther                  );
        imageViews.add(collision19_small_southPedestrain1            );
        imageViews.add(collision19_small_southPedestrain2            );
        imageViews.add(collision19_small_southNone1           );
        imageViews.add(collision19_small_southNone2   );
        imageViews.add(collision19_small_westLeft                    );
        imageViews.add(collision19_small_westStriaght                );
        imageViews.add(collision19_small_westRight                   );
        imageViews.add(collision19_small_westOther                   );
        imageViews.add(collision19_small_westPedestrain1             );
        imageViews.add(collision19_small_westPedestrain2             );
        imageViews.add(collision19_small_westNone1            );
        imageViews.add(collision19_small_westNone2    );
        imageViews.add(collision20_small_northLeft                   );
        imageViews.add(collision20_small_northStriaght               );
        imageViews.add(collision20_small_northRight                  );
        imageViews.add(collision20_small_northOther                  );
        imageViews.add(collision20_small_northPedestrain1            );
        imageViews.add(collision20_small_northPedestrain2            );
        imageViews.add(collision20_small_northNone1           );
        imageViews.add(collision20_small_northNone2   );
        imageViews.add(collision20_small_eastLeft                    );
        imageViews.add(collision20_small_eastStriaght                );
        imageViews.add(collision20_small_eastRight                   );
        imageViews.add(collision20_small_eastOther                   );
        imageViews.add(collision20_small_eastPedestrain1             );
        imageViews.add(collision20_small_eastPedestrain2             );
        imageViews.add(collision20_small_eastNone1            );
        imageViews.add(collision20_small_eastNone2    );
        imageViews.add(collision20_small_southLeft                   );
        imageViews.add(collision20_small_southStriaght               );
        imageViews.add(collision20_small_southRight                  );
        imageViews.add(collision20_small_southOther                  );
        imageViews.add(collision20_small_southPedestrain1            );
        imageViews.add(collision20_small_southPedestrain2            );
        imageViews.add(collision20_small_southNone1           );
        imageViews.add(collision20_small_southNone2   );
        imageViews.add(collision20_small_westLeft                    );
        imageViews.add(collision20_small_westStriaght                );
        imageViews.add(collision20_small_westRight                   );
        imageViews.add(collision20_small_westOther                   );
        imageViews.add(collision20_small_westPedestrain1             );
        imageViews.add(collision20_small_westPedestrain2             );
        imageViews.add(collision20_small_westNone1            );
        imageViews.add(collision20_small_westNone2    );
        imageViews.add(collision21_small_northLeft                   );
        imageViews.add(collision21_small_northStriaght               );
        imageViews.add(collision21_small_northRight                  );
        imageViews.add(collision21_small_northOther                  );
        imageViews.add(collision21_small_northPedestrain1            );
        imageViews.add(collision21_small_northPedestrain2            );
        imageViews.add(collision21_small_northNone1           );
        imageViews.add(collision21_small_northNone2   );
        imageViews.add(collision21_small_eastLeft                    );
        imageViews.add(collision21_small_eastStriaght                );
        imageViews.add(collision21_small_eastRight                   );
        imageViews.add(collision21_small_eastOther                   );
        imageViews.add(collision21_small_eastPedestrain1             );
        imageViews.add(collision21_small_eastPedestrain2             );
        imageViews.add(collision21_small_eastNone1            );
        imageViews.add(collision21_small_eastNone2    );
        imageViews.add(collision21_small_southLeft                   );
        imageViews.add(collision21_small_southStriaght               );
        imageViews.add(collision21_small_southRight                  );
        imageViews.add(collision21_small_southOther                  );
        imageViews.add(collision21_small_southPedestrain1            );
        imageViews.add(collision21_small_southPedestrain2            );
        imageViews.add(collision21_small_southNone1           );
        imageViews.add(collision21_small_southNone2   );
        imageViews.add(collision21_small_westLeft                    );
        imageViews.add(collision21_small_westStriaght                );
        imageViews.add(collision21_small_westRight                   );
        imageViews.add(collision21_small_westOther                   );
        imageViews.add(collision21_small_westPedestrain1             );
        imageViews.add(collision21_small_westPedestrain2             );
        imageViews.add(collision21_small_westNone1            );
        imageViews.add(collision21_small_westNone2    );
        imageViews.add(collision22_small_northLeft                   );
        imageViews.add(collision22_small_northStriaght               );
        imageViews.add(collision22_small_northRight                  );
        imageViews.add(collision22_small_northOther                  );
        imageViews.add(collision22_small_northPedestrain1            );
        imageViews.add(collision22_small_northPedestrain2            );
        imageViews.add(collision22_small_northNone1           );
        imageViews.add(collision22_small_northNone2   );
        imageViews.add(collision22_small_eastLeft                    );
        imageViews.add(collision22_small_eastStriaght                );
        imageViews.add(collision22_small_eastRight                   );
        imageViews.add(collision22_small_eastOther                   );
        imageViews.add(collision22_small_eastPedestrain1             );
        imageViews.add(collision22_small_eastPedestrain2             );
        imageViews.add(collision22_small_eastNone1            );
        imageViews.add(collision22_small_eastNone2    );
        imageViews.add(collision22_small_southLeft                   );
        imageViews.add(collision22_small_southStriaght               );
        imageViews.add(collision22_small_southRight                  );
        imageViews.add(collision22_small_southOther                  );
        imageViews.add(collision22_small_southPedestrain1            );
        imageViews.add(collision22_small_southPedestrain2            );
        imageViews.add(collision22_small_southNone1           );
        imageViews.add(collision22_small_southNone2   );
        imageViews.add(collision22_small_westLeft                    );
        imageViews.add(collision22_small_westStriaght                );
        imageViews.add(collision22_small_westRight                   );
        imageViews.add(collision22_small_westOther                   );
        imageViews.add(collision22_small_westPedestrain1             );
        imageViews.add(collision22_small_westPedestrain2             );
        imageViews.add(collision22_small_westNone1            );
        imageViews.add(collision22_small_westNone2    );
        imageViews.add(collision23_small_northLeft                   );
        imageViews.add(collision23_small_northStriaght               );
        imageViews.add(collision23_small_northRight                  );
        imageViews.add(collision23_small_northOther                  );
        imageViews.add(collision23_small_northPedestrain1            );
        imageViews.add(collision23_small_northPedestrain2            );
        imageViews.add(collision23_small_northNone1           );
        imageViews.add(collision23_small_northNone2   );
        imageViews.add(collision23_small_eastLeft                    );
        imageViews.add(collision23_small_eastStriaght                );
        imageViews.add(collision23_small_eastRight                   );
        imageViews.add(collision23_small_eastOther                   );
        imageViews.add(collision23_small_eastPedestrain1             );
        imageViews.add(collision23_small_eastPedestrain2             );
        imageViews.add(collision23_small_eastNone1            );
        imageViews.add(collision23_small_eastNone2    );
        imageViews.add(collision23_small_southLeft                   );
        imageViews.add(collision23_small_southStriaght               );
        imageViews.add(collision23_small_southRight                  );
        imageViews.add(collision23_small_southOther                  );
        imageViews.add(collision23_small_southPedestrain1            );
        imageViews.add(collision23_small_southPedestrain2            );
        imageViews.add(collision23_small_southNone1           );
        imageViews.add(collision23_small_southNone2   );
        imageViews.add(collision23_small_westLeft                    );
        imageViews.add(collision23_small_westStriaght                );
        imageViews.add(collision23_small_westRight                   );
        imageViews.add(collision23_small_westOther                   );
        imageViews.add(collision23_small_westPedestrain1             );
        imageViews.add(collision23_small_westPedestrain2             );
        imageViews.add(collision23_small_westNone1            );
        imageViews.add(collision23_small_westNone2    );
        imageViews.add(collision24_small_northLeft                   );
        imageViews.add(collision24_small_northStriaght               );
        imageViews.add(collision24_small_northRight                  );
        imageViews.add(collision24_small_northOther                  );
        imageViews.add(collision24_small_northPedestrain1            );
        imageViews.add(collision24_small_northPedestrain2            );
        imageViews.add(collision24_small_northNone1           );
        imageViews.add(collision24_small_northNone2   );
        imageViews.add(collision24_small_eastLeft                    );
        imageViews.add(collision24_small_eastStriaght                );
        imageViews.add(collision24_small_eastRight                   );
        imageViews.add(collision24_small_eastOther                   );
        imageViews.add(collision24_small_eastPedestrain1             );
        imageViews.add(collision24_small_eastPedestrain2             );
        imageViews.add(collision24_small_eastNone1            );
        imageViews.add(collision24_small_eastNone2    );
        imageViews.add(collision24_small_southLeft                   );
        imageViews.add(collision24_small_southStriaght               );
        imageViews.add(collision24_small_southRight                  );
        imageViews.add(collision24_small_southOther                  );
        imageViews.add(collision24_small_southPedestrain1            );
        imageViews.add(collision24_small_southPedestrain2            );
        imageViews.add(collision24_small_southNone1           );
        imageViews.add(collision24_small_southNone2   );
        imageViews.add(collision24_small_westLeft                    );
        imageViews.add(collision24_small_westStriaght                );
        imageViews.add(collision24_small_westRight                   );
        imageViews.add(collision24_small_westOther                   );
        imageViews.add(collision24_small_westPedestrain1             );
        imageViews.add(collision24_small_westPedestrain2             );
        imageViews.add(collision24_small_westNone1            );
        imageViews.add(collision24_small_westNone2    );
        imageViews.add(collision25_small_northLeft                   );
        imageViews.add(collision25_small_northStriaght               );
        imageViews.add(collision25_small_northRight                  );
        imageViews.add(collision25_small_northOther                  );
        imageViews.add(collision25_small_northPedestrain1            );
        imageViews.add(collision25_small_northPedestrain2            );
        imageViews.add(collision25_small_northNone1           );
        imageViews.add(collision25_small_northNone2   );
        imageViews.add(collision25_small_eastLeft                    );
        imageViews.add(collision25_small_eastStriaght                );
        imageViews.add(collision25_small_eastRight                   );
        imageViews.add(collision25_small_eastOther                   );
        imageViews.add(collision25_small_eastPedestrain1             );
        imageViews.add(collision25_small_eastPedestrain2             );
        imageViews.add(collision25_small_eastNone1            );
        imageViews.add(collision25_small_eastNone2    );
        imageViews.add(collision25_small_southLeft                   );
        imageViews.add(collision25_small_southStriaght               );
        imageViews.add(collision25_small_southRight                  );
        imageViews.add(collision25_small_southOther                  );
        imageViews.add(collision25_small_southPedestrain1            );
        imageViews.add(collision25_small_southPedestrain2            );
        imageViews.add(collision25_small_southNone1           );
        imageViews.add(collision25_small_southNone2   );
        imageViews.add(collision25_small_westLeft                    );
        imageViews.add(collision25_small_westStriaght                );
        imageViews.add(collision25_small_westRight                   );
        imageViews.add(collision25_small_westOther                   );
        imageViews.add(collision25_small_westPedestrain1             );
        imageViews.add(collision25_small_westPedestrain2             );
        imageViews.add(collision25_small_westNone1            );
        imageViews.add(collision25_small_westNone2    );
        imageViews.add(collision26_small_northLeft                   );
        imageViews.add(collision26_small_northStriaght               );
        imageViews.add(collision26_small_northRight                  );
        imageViews.add(collision26_small_northOther                  );
        imageViews.add(collision26_small_northPedestrain1            );
        imageViews.add(collision26_small_northPedestrain2            );
        imageViews.add(collision26_small_northNone1           );
        imageViews.add(collision26_small_northNone2   );
        imageViews.add(collision26_small_eastLeft                    );
        imageViews.add(collision26_small_eastStriaght                );
        imageViews.add(collision26_small_eastRight                   );
        imageViews.add(collision26_small_eastOther                   );
        imageViews.add(collision26_small_eastPedestrain1             );
        imageViews.add(collision26_small_eastPedestrain2             );
        imageViews.add(collision26_small_eastNone1            );
        imageViews.add(collision26_small_eastNone2    );
        imageViews.add(collision26_small_southLeft                   );
        imageViews.add(collision26_small_southStriaght               );
        imageViews.add(collision26_small_southRight                  );
        imageViews.add(collision26_small_southOther                  );
        imageViews.add(collision26_small_southPedestrain1            );
        imageViews.add(collision26_small_southPedestrain2            );
        imageViews.add(collision26_small_southNone1           );
        imageViews.add(collision26_small_southNone2   );
        imageViews.add(collision26_small_westLeft                    );
        imageViews.add(collision26_small_westStriaght                );
        imageViews.add(collision26_small_westRight                   );
        imageViews.add(collision26_small_westOther                   );
        imageViews.add(collision26_small_westPedestrain1             );
        imageViews.add(collision26_small_westPedestrain2             );
        imageViews.add(collision26_small_westNone1            );
        imageViews.add(collision26_small_westNone2    );
        imageViews.add(collision27_small_northLeft                   );
        imageViews.add(collision27_small_northStriaght               );
        imageViews.add(collision27_small_northRight                  );
        imageViews.add(collision27_small_northOther                  );
        imageViews.add(collision27_small_northPedestrain1            );
        imageViews.add(collision27_small_northPedestrain2            );
        imageViews.add(collision27_small_northNone1           );
        imageViews.add(collision27_small_northNone2   );
        imageViews.add(collision27_small_eastLeft                    );
        imageViews.add(collision27_small_eastStriaght                );
        imageViews.add(collision27_small_eastRight                   );
        imageViews.add(collision27_small_eastOther                   );
        imageViews.add(collision27_small_eastPedestrain1             );
        imageViews.add(collision27_small_eastPedestrain2             );
        imageViews.add(collision27_small_eastNone1            );
        imageViews.add(collision27_small_eastNone2    );
        imageViews.add(collision27_small_southLeft                   );
        imageViews.add(collision27_small_southStriaght               );
        imageViews.add(collision27_small_southRight                  );
        imageViews.add(collision27_small_southOther                  );
        imageViews.add(collision27_small_southPedestrain1            );
        imageViews.add(collision27_small_southPedestrain2            );
        imageViews.add(collision27_small_southNone1           );
        imageViews.add(collision27_small_southNone2   );
        imageViews.add(collision27_small_westLeft                    );
        imageViews.add(collision27_small_westStriaght                );
        imageViews.add(collision27_small_westRight                   );
        imageViews.add(collision27_small_westOther                   );
        imageViews.add(collision27_small_westPedestrain1             );
        imageViews.add(collision27_small_westPedestrain2             );
        imageViews.add(collision27_small_westNone1            );
        imageViews.add(collision27_small_westNone2    );
        imageViews.add(collision28_small_northLeft                   );
        imageViews.add(collision28_small_northStriaght               );
        imageViews.add(collision28_small_northRight                  );
        imageViews.add(collision28_small_northOther                  );
        imageViews.add(collision28_small_northPedestrain1            );
        imageViews.add(collision28_small_northPedestrain2            );
        imageViews.add(collision28_small_northNone1           );
        imageViews.add(collision28_small_northNone2   );
        imageViews.add(collision28_small_eastLeft                    );
        imageViews.add(collision28_small_eastStriaght                );
        imageViews.add(collision28_small_eastRight                   );
        imageViews.add(collision28_small_eastOther                   );
        imageViews.add(collision28_small_eastPedestrain1             );
        imageViews.add(collision28_small_eastPedestrain2             );
        imageViews.add(collision28_small_eastNone1            );
        imageViews.add(collision28_small_eastNone2    );
        imageViews.add(collision28_small_southLeft                   );
        imageViews.add(collision28_small_southStriaght               );
        imageViews.add(collision28_small_southRight                  );
        imageViews.add(collision28_small_southOther                  );
        imageViews.add(collision28_small_southPedestrain1            );
        imageViews.add(collision28_small_southPedestrain2            );
        imageViews.add(collision28_small_southNone1           );
        imageViews.add(collision28_small_southNone2   );
        imageViews.add(collision28_small_westLeft                    );
        imageViews.add(collision28_small_westStriaght                );
        imageViews.add(collision28_small_westRight                   );
        imageViews.add(collision28_small_westOther                   );
        imageViews.add(collision28_small_westPedestrain1             );
        imageViews.add(collision28_small_westPedestrain2             );
        imageViews.add(collision28_small_westNone1            );
        imageViews.add(collision28_small_westNone2    );
        imageViews.add(collision29_small_northLeft                   );
        imageViews.add(collision29_small_northStriaght               );
        imageViews.add(collision29_small_northRight                  );
        imageViews.add(collision29_small_northOther                  );
        imageViews.add(collision29_small_northPedestrain1            );
        imageViews.add(collision29_small_northPedestrain2            );
        imageViews.add(collision29_small_northNone1           );
        imageViews.add(collision29_small_northNone2   );
        imageViews.add(collision29_small_eastLeft                    );
        imageViews.add(collision29_small_eastStriaght                );
        imageViews.add(collision29_small_eastRight                   );
        imageViews.add(collision29_small_eastOther                   );
        imageViews.add(collision29_small_eastPedestrain1             );
        imageViews.add(collision29_small_eastPedestrain2             );
        imageViews.add(collision29_small_eastNone1            );
        imageViews.add(collision29_small_eastNone2    );
        imageViews.add(collision29_small_southLeft                   );
        imageViews.add(collision29_small_southStriaght               );
        imageViews.add(collision29_small_southRight                  );
        imageViews.add(collision29_small_southOther                  );
        imageViews.add(collision29_small_southPedestrain1            );
        imageViews.add(collision29_small_southPedestrain2            );
        imageViews.add(collision29_small_southNone1           );
        imageViews.add(collision29_small_southNone2   );
        imageViews.add(collision29_small_westLeft                    );
        imageViews.add(collision29_small_westStriaght                );
        imageViews.add(collision29_small_westRight                   );
        imageViews.add(collision29_small_westOther                   );
        imageViews.add(collision29_small_westPedestrain1             );
        imageViews.add(collision29_small_westPedestrain2             );
        imageViews.add(collision29_small_westNone1            );
        imageViews.add(collision29_small_westNone2    );
        imageViews.add(collision30_small_northLeft                   );
        imageViews.add(collision30_small_northStriaght               );
        imageViews.add(collision30_small_northRight                  );
        imageViews.add(collision30_small_northOther                  );
        imageViews.add(collision30_small_northPedestrain1            );
        imageViews.add(collision30_small_northPedestrain2            );
        imageViews.add(collision30_small_northNone1           );
        imageViews.add(collision30_small_northNone2   );
        imageViews.add(collision30_small_eastLeft                    );
        imageViews.add(collision30_small_eastStriaght                );
        imageViews.add(collision30_small_eastRight                   );
        imageViews.add(collision30_small_eastOther                   );
        imageViews.add(collision30_small_eastPedestrain1             );
        imageViews.add(collision30_small_eastPedestrain2             );
        imageViews.add(collision30_small_eastNone1            );
        imageViews.add(collision30_small_eastNone2    );
        imageViews.add(collision30_small_southLeft                   );
        imageViews.add(collision30_small_southStriaght               );
        imageViews.add(collision30_small_southRight                  );
        imageViews.add(collision30_small_southOther                  );
        imageViews.add(collision30_small_southPedestrain1            );
        imageViews.add(collision30_small_southPedestrain2            );
        imageViews.add(collision30_small_southNone1           );
        imageViews.add(collision30_small_southNone2   );
        imageViews.add(collision30_small_westLeft                    );
        imageViews.add(collision30_small_westStriaght                );
        imageViews.add(collision30_small_westRight                   );
        imageViews.add(collision30_small_westOther                   );
        imageViews.add(collision30_small_westPedestrain1             );
        imageViews.add(collision30_small_westPedestrain2             );
        imageViews.add(collision30_small_westNone1            );
        imageViews.add(collision30_small_westNone2    );
        imageViews.add(collision31_small_northLeft                   );
        imageViews.add(collision31_small_northStriaght               );
        imageViews.add(collision31_small_northRight                  );
        imageViews.add(collision31_small_northOther                  );
        imageViews.add(collision31_small_northPedestrain1            );
        imageViews.add(collision31_small_northPedestrain2            );
        imageViews.add(collision31_small_northNone1           );
        imageViews.add(collision31_small_northNone2   );
        imageViews.add(collision31_small_eastLeft                    );
        imageViews.add(collision31_small_eastStriaght                );
        imageViews.add(collision31_small_eastRight                   );
        imageViews.add(collision31_small_eastOther                   );
        imageViews.add(collision31_small_eastPedestrain1             );
        imageViews.add(collision31_small_eastPedestrain2             );
        imageViews.add(collision31_small_eastNone1            );
        imageViews.add(collision31_small_eastNone2    );
        imageViews.add(collision31_small_southLeft                   );
        imageViews.add(collision31_small_southStriaght               );
        imageViews.add(collision31_small_southRight                  );
        imageViews.add(collision31_small_southOther                  );
        imageViews.add(collision31_small_southPedestrain1            );
        imageViews.add(collision31_small_southPedestrain2            );
        imageViews.add(collision31_small_southNone1           );
        imageViews.add(collision31_small_southNone2   );
        imageViews.add(collision31_small_westLeft                    );
        imageViews.add(collision31_small_westStriaght                );
        imageViews.add(collision31_small_westRight                   );
        imageViews.add(collision31_small_westOther                   );
        imageViews.add(collision31_small_westPedestrain1             );
        imageViews.add(collision31_small_westPedestrain2             );
        imageViews.add(collision31_small_westNone1            );
        imageViews.add(collision31_small_westNone2    );
        imageViews.add(collision32_small_northLeft                   );
        imageViews.add(collision32_small_northStriaght               );
        imageViews.add(collision32_small_northRight                  );
        imageViews.add(collision32_small_northOther                  );
        imageViews.add(collision32_small_northPedestrain1            );
        imageViews.add(collision32_small_northPedestrain2            );
        imageViews.add(collision32_small_northNone1           );
        imageViews.add(collision32_small_northNone2   );
        imageViews.add(collision32_small_eastLeft                    );
        imageViews.add(collision32_small_eastStriaght                );
        imageViews.add(collision32_small_eastRight                   );
        imageViews.add(collision32_small_eastOther                   );
        imageViews.add(collision32_small_eastPedestrain1             );
        imageViews.add(collision32_small_eastPedestrain2             );
        imageViews.add(collision32_small_eastNone1            );
        imageViews.add(collision32_small_eastNone2    );
        imageViews.add(collision32_small_southLeft                   );
        imageViews.add(collision32_small_southStriaght               );
        imageViews.add(collision32_small_southRight                  );
        imageViews.add(collision32_small_southOther                  );
        imageViews.add(collision32_small_southPedestrain1            );
        imageViews.add(collision32_small_southPedestrain2            );
        imageViews.add(collision32_small_southNone1           );
        imageViews.add(collision32_small_southNone2   );
        imageViews.add(collision32_small_westLeft                    );
        imageViews.add(collision32_small_westStriaght                );
        imageViews.add(collision32_small_westRight                   );
        imageViews.add(collision32_small_westOther                   );
        imageViews.add(collision32_small_westPedestrain1             );
        imageViews.add(collision32_small_westPedestrain2             );
        imageViews.add(collision32_small_westNone1            );
        imageViews.add(collision32_small_westNone2    );
    }

    private void resetBigMapOff(){
        collision_northLeft.setImageResource(R.drawable.offone);
        collision_northStraight.setImageResource(R.drawable.redone);
        collision_northRight.setImageResource(R.drawable.redone);
        collision_northOther.setImageResource(R.drawable.redone);
        collision_northPedestrain1.setImageResource(R.drawable.redone);
        collision_northPedestrain2.setImageResource(R.drawable.redone);
        collision_westNone1.setImageResource(R.drawable.redone);
        collision_westNone2.setImageResource(R.drawable.redone);
        collision_eastOther.setImageResource(R.drawable.redone);
        collision_eastRight.setImageResource(R.drawable.redone);
        collision_eastStriaght.setImageResource(R.drawable.redone);
        collision_eastLeft.setImageResource(R.drawable.redone);
        collision_eastPedestrain1.setImageResource(R.drawable.redone);
        collision_eastPedestrain2.setImageResource(R.drawable.redone);
        collision_northNone1.setImageResource(R.drawable.redone);
        collision_northNone2.setImageResource(R.drawable.redone);
        collision_southLeft.setImageResource(R.drawable.redone);
        collision_southStriaght.setImageResource(R.drawable.redone);
        collision_southRight.setImageResource(R.drawable.redone);
        collision_southOther.setImageResource(R.drawable.redone);
        collision_southPedestrain1.setImageResource(R.drawable.redone);
        collision_southPedestrain2.setImageResource(R.drawable.redone);
        collision_eastNone1.setImageResource(R.drawable.redone);
        collision_eastNone2.setImageResource(R.drawable.redone);
        collision_westOther.setImageResource(R.drawable.redone);
        collision_westRight.setImageResource(R.drawable.redone);
        collision_westStriaght.setImageResource(R.drawable.redone);
        collision_westLeft.setImageResource(R.drawable.redone);
        collision_westPedestrain1.setImageResource(R.drawable.redone);
        collision_westPedestrain2.setImageResource(R.drawable.redone);
        collision_southNone1.setImageResource(R.drawable.redone);
        collision_southNone2.setImageResource(R.drawable.redone);
    }
    private void resetBigMapRed(){
        collision_northLeft.setImageResource(R.drawable.redone);
        collision_northStraight.setImageResource(R.drawable.redone);
        collision_northRight.setImageResource(R.drawable.redone);
        collision_northOther.setImageResource(R.drawable.redone);
        collision_northPedestrain1.setImageResource(R.drawable.redone);
        collision_northPedestrain2.setImageResource(R.drawable.redone);
        collision_westNone1.setImageResource(R.drawable.redone);
        collision_westNone2.setImageResource(R.drawable.redone);
        collision_eastOther.setImageResource(R.drawable.redone);
        collision_eastRight.setImageResource(R.drawable.redone);
        collision_eastStriaght.setImageResource(R.drawable.redone);
        collision_eastLeft.setImageResource(R.drawable.redone);
        collision_eastPedestrain1.setImageResource(R.drawable.redone);
        collision_eastPedestrain2.setImageResource(R.drawable.redone);
        collision_northNone1.setImageResource(R.drawable.redone);
        collision_northNone2.setImageResource(R.drawable.redone);
        collision_southLeft.setImageResource(R.drawable.redone);
        collision_southStriaght.setImageResource(R.drawable.redone);
        collision_southRight.setImageResource(R.drawable.redone);
        collision_southOther.setImageResource(R.drawable.redone);
        collision_southPedestrain1.setImageResource(R.drawable.redone);
        collision_southPedestrain2.setImageResource(R.drawable.redone);
        collision_eastNone1.setImageResource(R.drawable.redone);
        collision_eastNone2.setImageResource(R.drawable.redone);
        collision_westOther.setImageResource(R.drawable.redone);
        collision_westRight.setImageResource(R.drawable.redone);
        collision_westStriaght.setImageResource(R.drawable.redone);
        collision_westLeft.setImageResource(R.drawable.redone);
        collision_westPedestrain1.setImageResource(R.drawable.redone);
        collision_westPedestrain2.setImageResource(R.drawable.redone);
        collision_southNone1.setImageResource(R.drawable.redone);
        collision_southNone2.setImageResource(R.drawable.redone);
    }
    private void resetAllRed(){
        Iterator<ImageView> imageViewIterator = imageViews.iterator();
        while(imageViewIterator.hasNext()){
            imageViewIterator.next().setImageResource(R.drawable.redone);
        }
    }
    private void setGreenOne(ImageView imageView){
        imageView.setImageResource(R.drawable.greenone);
    }

    /**
     * 设备小图中的绿色灯
     * @param gbtDirec
     * @param gbtStagePattern
     */
    private void setSmallGreenOne(GbtDirec gbtDirec,GbtStagePattern gbtStagePattern){
        if(gbtStagePattern.getStageId() ==1) {
            if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT) {
                setGreenOne(collision1_small_northLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT) {
                setGreenOne(collision1_small_northStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT) {
                setGreenOne(collision1_small_northRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER) {
                setGreenOne(collision1_small_northOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE) {
                setGreenOne(collision1_small_northPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO) {
                setGreenOne(collision1_small_northPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1) {
                setGreenOne(collision1_small_northNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2) {
                setGreenOne(collision1_small_northNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT) {
                setGreenOne(collision1_small_eastLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT) {
                setGreenOne(collision1_small_eastStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT) {
                setGreenOne(collision1_small_eastRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER) {
                setGreenOne(collision1_small_eastOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE) {
                setGreenOne(collision1_small_eastPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO) {
                setGreenOne(collision1_small_eastPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1) {
                setGreenOne(collision1_small_eastNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2) {
                setGreenOne(collision1_small_eastNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT) {
                setGreenOne(collision1_small_southLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT) {
                setGreenOne(collision1_small_southStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT) {
                setGreenOne(collision1_small_southRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER) {
                setGreenOne(collision1_small_southOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE) {
                setGreenOne(collision1_small_southPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO) {
                setGreenOne(collision1_small_southPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1) {
                setGreenOne(collision1_small_southNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2) {
                setGreenOne(collision1_small_southNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT) {
                setGreenOne(collision1_small_westLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT) {
                setGreenOne(collision1_small_westStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT) {
                setGreenOne(collision1_small_westRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE) {
                setGreenOne(collision1_small_westPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO) {
                setGreenOne(collision1_small_westPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1) {
                setGreenOne(collision1_small_westNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision1_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==2) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(collision2_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(collision2_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(collision2_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(collision2_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(collision2_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(collision2_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(collision2_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(collision2_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(collision2_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(collision2_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(collision2_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(collision2_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(collision2_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(collision2_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(collision2_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(collision2_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(collision2_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(collision2_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(collision2_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(collision2_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(collision2_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(collision2_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(collision2_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(collision2_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(collision2_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(collision2_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(collision2_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(collision2_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(collision2_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(collision2_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision2_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==3) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(collision3_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(collision3_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(collision3_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(collision3_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(collision3_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(collision3_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(collision3_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(collision3_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(collision3_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(collision3_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(collision3_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(collision3_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(collision3_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(collision3_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(collision3_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(collision3_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(collision3_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(collision3_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(collision3_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(collision3_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(collision3_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(collision3_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(collision3_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(collision3_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(collision3_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(collision3_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(collision3_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(collision3_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(collision3_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(collision3_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision3_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==4) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(collision4_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(collision4_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(collision4_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(collision4_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(collision4_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(collision4_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(collision4_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(collision4_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(collision4_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(collision4_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(collision4_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(collision4_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(collision4_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(collision4_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(collision4_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(collision4_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(collision4_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(collision4_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(collision4_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(collision4_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(collision4_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(collision4_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(collision4_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(collision4_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(collision4_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(collision4_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(collision4_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(collision4_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(collision4_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(collision4_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision4_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==5) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(collision5_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(collision5_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(collision5_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(collision5_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(collision5_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(collision5_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(collision5_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(collision5_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(collision5_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(collision5_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(collision5_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(collision5_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(collision5_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(collision5_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(collision5_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(collision5_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(collision5_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(collision5_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(collision5_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(collision5_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(collision5_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(collision5_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(collision5_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(collision5_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(collision5_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(collision5_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(collision5_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(collision5_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(collision5_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(collision5_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision5_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==6) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(collision6_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(collision6_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(collision6_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(collision6_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(collision6_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(collision6_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(collision6_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(collision6_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(collision6_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(collision6_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(collision6_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(collision6_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(collision6_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(collision6_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(collision6_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(collision6_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(collision6_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(collision6_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(collision6_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(collision6_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(collision6_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(collision6_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(collision6_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(collision6_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(collision6_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(collision6_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(collision6_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(collision6_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(collision6_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(collision6_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision6_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==7) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(collision7_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(collision7_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(collision7_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(collision7_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(collision7_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(collision7_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(collision7_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(collision7_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(collision7_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(collision7_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(collision7_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(collision7_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(collision7_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(collision7_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(collision7_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(collision7_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(collision7_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(collision7_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(collision7_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(collision7_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(collision7_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(collision7_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(collision7_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(collision7_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(collision7_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(collision7_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(collision7_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(collision7_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(collision7_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(collision7_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision7_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==8) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(collision8_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(collision8_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(collision8_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(collision8_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(collision8_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(collision8_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(collision8_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(collision8_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(collision8_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(collision8_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(collision8_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(collision8_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(collision8_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(collision8_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(collision8_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(collision8_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(collision8_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(collision8_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(collision8_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(collision8_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(collision8_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(collision8_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(collision8_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(collision8_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(collision8_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(collision8_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(collision8_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(collision8_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(collision8_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(collision8_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision8_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==9) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(collision9_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(collision9_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(collision9_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(collision9_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(collision9_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(collision9_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(collision9_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(collision9_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(collision9_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(collision9_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(collision9_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(collision9_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(collision9_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(collision9_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(collision9_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(collision9_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(collision9_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(collision9_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(collision9_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(collision9_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(collision9_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(collision9_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(collision9_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(collision9_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(collision9_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(collision9_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(collision9_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(collision9_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(collision9_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(collision9_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision9_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==10) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(collision10_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(collision10_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(collision10_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(collision10_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(collision10_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(collision10_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(collision10_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(collision10_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(collision10_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(collision10_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(collision10_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(collision10_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(collision10_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(collision10_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(collision10_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(collision10_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(collision10_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(collision10_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(collision10_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(collision10_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(collision10_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(collision10_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(collision10_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(collision10_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(collision10_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(collision10_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(collision10_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(collision10_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(collision10_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(collision10_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision10_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==11) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(collision11_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(collision11_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(collision11_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(collision11_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(collision11_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(collision11_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(collision11_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(collision11_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(collision11_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(collision11_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(collision11_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(collision11_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(collision11_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(collision11_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(collision11_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(collision11_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(collision11_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(collision11_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(collision11_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(collision11_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(collision11_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(collision11_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(collision11_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(collision11_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(collision11_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(collision11_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(collision11_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(collision11_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(collision11_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(collision11_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision11_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==12) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(collision12_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(collision12_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(collision12_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(collision12_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(collision12_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(collision12_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(collision12_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(collision12_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(collision12_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(collision12_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(collision12_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(collision12_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(collision12_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(collision12_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(collision12_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(collision12_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(collision12_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(collision12_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(collision12_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(collision12_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(collision12_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(collision12_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(collision12_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(collision12_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(collision12_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(collision12_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(collision12_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(collision12_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(collision12_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(collision12_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision12_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==13) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(collision13_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(collision13_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(collision13_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(collision13_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(collision13_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(collision13_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(collision13_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(collision13_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(collision13_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(collision13_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(collision13_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(collision13_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(collision13_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(collision13_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(collision13_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(collision13_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(collision13_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(collision13_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(collision13_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(collision13_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(collision13_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(collision13_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(collision13_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(collision13_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(collision13_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(collision13_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(collision13_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(collision13_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(collision13_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(collision13_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision13_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==14) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(collision14_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(collision14_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(collision14_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(collision14_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(collision14_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(collision14_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(collision14_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(collision14_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(collision14_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(collision14_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(collision14_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(collision14_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(collision14_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(collision14_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(collision14_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(collision14_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(collision14_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(collision14_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(collision14_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(collision14_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(collision14_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(collision14_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(collision14_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(collision14_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(collision14_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(collision14_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(collision14_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(collision14_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(collision14_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(collision14_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision14_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==15) {
            if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT){
                setGreenOne(collision15_small_northLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT){
                setGreenOne(collision15_small_northStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT){
                setGreenOne(collision15_small_northRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER){
                setGreenOne(collision15_small_northOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE){
                setGreenOne(collision15_small_northPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO){
                setGreenOne(collision15_small_northPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1){
                setGreenOne(collision15_small_northNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2){
                setGreenOne(collision15_small_northNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT){
                setGreenOne(collision15_small_eastLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT){
                setGreenOne(collision15_small_eastStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT){
                setGreenOne(collision15_small_eastRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER){
                setGreenOne(collision15_small_eastOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE){
                setGreenOne(collision15_small_eastPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO){
                setGreenOne(collision15_small_eastPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1){
                setGreenOne(collision15_small_eastNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2){
                setGreenOne(collision15_small_eastNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT){
                setGreenOne(collision15_small_southLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT){
                setGreenOne(collision15_small_southStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT){
                setGreenOne(collision15_small_southRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER){
                setGreenOne(collision15_small_southOther);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE){
                setGreenOne(collision15_small_southPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO){
                setGreenOne(collision15_small_southPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1){
                setGreenOne(collision15_small_southNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2){
                setGreenOne(collision15_small_southNone2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT){
                setGreenOne(collision15_small_westLeft);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT){
                setGreenOne(collision15_small_westStriaght);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT){
                setGreenOne(collision15_small_westRight);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE){
                setGreenOne(collision15_small_westPedestrain1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO){
                setGreenOne(collision15_small_westPedestrain2);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1){
                setGreenOne(collision15_small_westNone1);
            }else if(gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision15_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==16) {
            if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT) {
                setGreenOne(collision16_small_northLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT) {
                setGreenOne(collision16_small_northStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT) {
                setGreenOne(collision16_small_northRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER) {
                setGreenOne(collision16_small_northOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE) {
                setGreenOne(collision16_small_northPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO) {
                setGreenOne(collision16_small_northPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1) {
                setGreenOne(collision16_small_northNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2) {
                setGreenOne(collision16_small_northNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT) {
                setGreenOne(collision16_small_eastLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT) {
                setGreenOne(collision16_small_eastStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT) {
                setGreenOne(collision16_small_eastRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER) {
                setGreenOne(collision16_small_eastOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE) {
                setGreenOne(collision16_small_eastPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO) {
                setGreenOne(collision16_small_eastPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1) {
                setGreenOne(collision16_small_eastNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2) {
                setGreenOne(collision16_small_eastNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT) {
                setGreenOne(collision16_small_southLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT) {
                setGreenOne(collision16_small_southStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT) {
                setGreenOne(collision16_small_southRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER) {
                setGreenOne(collision16_small_southOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE) {
                setGreenOne(collision16_small_southPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO) {
                setGreenOne(collision16_small_southPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1) {
                setGreenOne(collision16_small_southNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2) {
                setGreenOne(collision16_small_southNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT) {
                setGreenOne(collision16_small_westLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT) {
                setGreenOne(collision16_small_westStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT) {
                setGreenOne(collision16_small_westRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE) {
                setGreenOne(collision16_small_westPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO) {
                setGreenOne(collision16_small_westPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1) {
                setGreenOne(collision16_small_westNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision16_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==17) {
            if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT) {
                setGreenOne(collision17_small_northLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT) {
                setGreenOne(collision17_small_northStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT) {
                setGreenOne(collision17_small_northRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER) {
                setGreenOne(collision17_small_northOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE) {
                setGreenOne(collision17_small_northPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO) {
                setGreenOne(collision17_small_northPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1) {
                setGreenOne(collision17_small_northNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2) {
                setGreenOne(collision17_small_northNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT) {
                setGreenOne(collision17_small_eastLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT) {
                setGreenOne(collision17_small_eastStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT) {
                setGreenOne(collision17_small_eastRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER) {
                setGreenOne(collision17_small_eastOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE) {
                setGreenOne(collision17_small_eastPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO) {
                setGreenOne(collision17_small_eastPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1) {
                setGreenOne(collision17_small_eastNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2) {
                setGreenOne(collision17_small_eastNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT) {
                setGreenOne(collision17_small_southLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT) {
                setGreenOne(collision17_small_southStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT) {
                setGreenOne(collision17_small_southRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER) {
                setGreenOne(collision17_small_southOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE) {
                setGreenOne(collision17_small_southPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO) {
                setGreenOne(collision17_small_southPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1) {
                setGreenOne(collision17_small_southNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2) {
                setGreenOne(collision17_small_southNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT) {
                setGreenOne(collision17_small_westLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT) {
                setGreenOne(collision17_small_westStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT) {
                setGreenOne(collision17_small_westRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE) {
                setGreenOne(collision17_small_westPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO) {
                setGreenOne(collision17_small_westPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1) {
                setGreenOne(collision17_small_westNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision17_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==18) {
            if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT) {
                setGreenOne(collision18_small_northLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT) {
                setGreenOne(collision18_small_northStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT) {
                setGreenOne(collision18_small_northRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER) {
                setGreenOne(collision18_small_northOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE) {
                setGreenOne(collision18_small_northPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO) {
                setGreenOne(collision18_small_northPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1) {
                setGreenOne(collision18_small_northNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2) {
                setGreenOne(collision18_small_northNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT) {
                setGreenOne(collision18_small_eastLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT) {
                setGreenOne(collision18_small_eastStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT) {
                setGreenOne(collision18_small_eastRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER) {
                setGreenOne(collision18_small_eastOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE) {
                setGreenOne(collision18_small_eastPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO) {
                setGreenOne(collision18_small_eastPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1) {
                setGreenOne(collision18_small_eastNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2) {
                setGreenOne(collision18_small_eastNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT) {
                setGreenOne(collision18_small_southLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT) {
                setGreenOne(collision18_small_southStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT) {
                setGreenOne(collision18_small_southRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER) {
                setGreenOne(collision18_small_southOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE) {
                setGreenOne(collision18_small_southPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO) {
                setGreenOne(collision18_small_southPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1) {
                setGreenOne(collision18_small_southNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2) {
                setGreenOne(collision18_small_southNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT) {
                setGreenOne(collision18_small_westLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT) {
                setGreenOne(collision18_small_westStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT) {
                setGreenOne(collision18_small_westRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE) {
                setGreenOne(collision18_small_westPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO) {
                setGreenOne(collision18_small_westPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1) {
                setGreenOne(collision18_small_westNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision18_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==19) {
            if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT) {
                setGreenOne(collision19_small_northLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT) {
                setGreenOne(collision19_small_northStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT) {
                setGreenOne(collision19_small_northRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER) {
                setGreenOne(collision19_small_northOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE) {
                setGreenOne(collision19_small_northPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO) {
                setGreenOne(collision19_small_northPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1) {
                setGreenOne(collision19_small_northNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2) {
                setGreenOne(collision19_small_northNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT) {
                setGreenOne(collision19_small_eastLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT) {
                setGreenOne(collision19_small_eastStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT) {
                setGreenOne(collision19_small_eastRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER) {
                setGreenOne(collision19_small_eastOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE) {
                setGreenOne(collision19_small_eastPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO) {
                setGreenOne(collision19_small_eastPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1) {
                setGreenOne(collision19_small_eastNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2) {
                setGreenOne(collision19_small_eastNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT) {
                setGreenOne(collision19_small_southLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT) {
                setGreenOne(collision19_small_southStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT) {
                setGreenOne(collision19_small_southRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER) {
                setGreenOne(collision19_small_southOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE) {
                setGreenOne(collision19_small_southPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO) {
                setGreenOne(collision19_small_southPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1) {
                setGreenOne(collision19_small_southNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2) {
                setGreenOne(collision19_small_southNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT) {
                setGreenOne(collision19_small_westLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT) {
                setGreenOne(collision19_small_westStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT) {
                setGreenOne(collision19_small_westRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE) {
                setGreenOne(collision19_small_westPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO) {
                setGreenOne(collision19_small_westPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1) {
                setGreenOne(collision19_small_westNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision19_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==20) {
            if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT) {
                setGreenOne(collision20_small_northLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT) {
                setGreenOne(collision20_small_northStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT) {
                setGreenOne(collision20_small_northRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER) {
                setGreenOne(collision20_small_northOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE) {
                setGreenOne(collision20_small_northPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO) {
                setGreenOne(collision20_small_northPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1) {
                setGreenOne(collision20_small_northNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2) {
                setGreenOne(collision20_small_northNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT) {
                setGreenOne(collision20_small_eastLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT) {
                setGreenOne(collision20_small_eastStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT) {
                setGreenOne(collision20_small_eastRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER) {
                setGreenOne(collision20_small_eastOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE) {
                setGreenOne(collision20_small_eastPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO) {
                setGreenOne(collision20_small_eastPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1) {
                setGreenOne(collision20_small_eastNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2) {
                setGreenOne(collision20_small_eastNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT) {
                setGreenOne(collision20_small_southLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT) {
                setGreenOne(collision20_small_southStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT) {
                setGreenOne(collision20_small_southRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER) {
                setGreenOne(collision20_small_southOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE) {
                setGreenOne(collision20_small_southPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO) {
                setGreenOne(collision20_small_southPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1) {
                setGreenOne(collision20_small_southNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2) {
                setGreenOne(collision20_small_southNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT) {
                setGreenOne(collision20_small_westLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT) {
                setGreenOne(collision20_small_westStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT) {
                setGreenOne(collision20_small_westRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE) {
                setGreenOne(collision20_small_westPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO) {
                setGreenOne(collision20_small_westPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1) {
                setGreenOne(collision20_small_westNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision20_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==21) {
            if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT) {
                setGreenOne(collision21_small_northLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT) {
                setGreenOne(collision21_small_northStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT) {
                setGreenOne(collision21_small_northRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER) {
                setGreenOne(collision21_small_northOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE) {
                setGreenOne(collision21_small_northPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO) {
                setGreenOne(collision21_small_northPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1) {
                setGreenOne(collision21_small_northNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2) {
                setGreenOne(collision21_small_northNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT) {
                setGreenOne(collision21_small_eastLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT) {
                setGreenOne(collision21_small_eastStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT) {
                setGreenOne(collision21_small_eastRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER) {
                setGreenOne(collision21_small_eastOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE) {
                setGreenOne(collision21_small_eastPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO) {
                setGreenOne(collision21_small_eastPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1) {
                setGreenOne(collision21_small_eastNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2) {
                setGreenOne(collision21_small_eastNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT) {
                setGreenOne(collision21_small_southLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT) {
                setGreenOne(collision21_small_southStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT) {
                setGreenOne(collision21_small_southRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER) {
                setGreenOne(collision21_small_southOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE) {
                setGreenOne(collision21_small_southPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO) {
                setGreenOne(collision21_small_southPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1) {
                setGreenOne(collision21_small_southNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2) {
                setGreenOne(collision21_small_southNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT) {
                setGreenOne(collision21_small_westLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT) {
                setGreenOne(collision21_small_westStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT) {
                setGreenOne(collision21_small_westRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE) {
                setGreenOne(collision21_small_westPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO) {
                setGreenOne(collision21_small_westPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1) {
                setGreenOne(collision21_small_westNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision21_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==22) {
            if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT) {
                setGreenOne(collision22_small_northLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT) {
                setGreenOne(collision22_small_northStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT) {
                setGreenOne(collision22_small_northRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER) {
                setGreenOne(collision22_small_northOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE) {
                setGreenOne(collision22_small_northPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO) {
                setGreenOne(collision22_small_northPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1) {
                setGreenOne(collision22_small_northNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2) {
                setGreenOne(collision22_small_northNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT) {
                setGreenOne(collision22_small_eastLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT) {
                setGreenOne(collision22_small_eastStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT) {
                setGreenOne(collision22_small_eastRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER) {
                setGreenOne(collision22_small_eastOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE) {
                setGreenOne(collision22_small_eastPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO) {
                setGreenOne(collision22_small_eastPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1) {
                setGreenOne(collision22_small_eastNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2) {
                setGreenOne(collision22_small_eastNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT) {
                setGreenOne(collision22_small_southLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT) {
                setGreenOne(collision22_small_southStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT) {
                setGreenOne(collision22_small_southRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER) {
                setGreenOne(collision22_small_southOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE) {
                setGreenOne(collision22_small_southPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO) {
                setGreenOne(collision22_small_southPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1) {
                setGreenOne(collision22_small_southNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2) {
                setGreenOne(collision22_small_southNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT) {
                setGreenOne(collision22_small_westLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT) {
                setGreenOne(collision22_small_westStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT) {
                setGreenOne(collision22_small_westRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE) {
                setGreenOne(collision22_small_westPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO) {
                setGreenOne(collision22_small_westPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1) {
                setGreenOne(collision22_small_westNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision22_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==23) {
            if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT) {
                setGreenOne(collision23_small_northLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT) {
                setGreenOne(collision23_small_northStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT) {
                setGreenOne(collision23_small_northRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER) {
                setGreenOne(collision23_small_northOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE) {
                setGreenOne(collision23_small_northPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO) {
                setGreenOne(collision23_small_northPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1) {
                setGreenOne(collision23_small_northNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2) {
                setGreenOne(collision23_small_northNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT) {
                setGreenOne(collision23_small_eastLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT) {
                setGreenOne(collision23_small_eastStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT) {
                setGreenOne(collision23_small_eastRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER) {
                setGreenOne(collision23_small_eastOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE) {
                setGreenOne(collision23_small_eastPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO) {
                setGreenOne(collision23_small_eastPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1) {
                setGreenOne(collision23_small_eastNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2) {
                setGreenOne(collision23_small_eastNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT) {
                setGreenOne(collision23_small_southLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT) {
                setGreenOne(collision23_small_southStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT) {
                setGreenOne(collision23_small_southRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER) {
                setGreenOne(collision23_small_southOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE) {
                setGreenOne(collision23_small_southPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO) {
                setGreenOne(collision23_small_southPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1) {
                setGreenOne(collision23_small_southNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2) {
                setGreenOne(collision23_small_southNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT) {
                setGreenOne(collision23_small_westLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT) {
                setGreenOne(collision23_small_westStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT) {
                setGreenOne(collision23_small_westRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE) {
                setGreenOne(collision23_small_westPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO) {
                setGreenOne(collision23_small_westPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1) {
                setGreenOne(collision23_small_westNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision23_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==24) {
            if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT) {
                setGreenOne(collision24_small_northLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT) {
                setGreenOne(collision24_small_northStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT) {
                setGreenOne(collision24_small_northRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER) {
                setGreenOne(collision24_small_northOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE) {
                setGreenOne(collision24_small_northPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO) {
                setGreenOne(collision24_small_northPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1) {
                setGreenOne(collision24_small_northNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2) {
                setGreenOne(collision24_small_northNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT) {
                setGreenOne(collision24_small_eastLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT) {
                setGreenOne(collision24_small_eastStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT) {
                setGreenOne(collision24_small_eastRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER) {
                setGreenOne(collision24_small_eastOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE) {
                setGreenOne(collision24_small_eastPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO) {
                setGreenOne(collision24_small_eastPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1) {
                setGreenOne(collision24_small_eastNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2) {
                setGreenOne(collision24_small_eastNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT) {
                setGreenOne(collision24_small_southLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT) {
                setGreenOne(collision24_small_southStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT) {
                setGreenOne(collision24_small_southRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER) {
                setGreenOne(collision24_small_southOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE) {
                setGreenOne(collision24_small_southPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO) {
                setGreenOne(collision24_small_southPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1) {
                setGreenOne(collision24_small_southNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2) {
                setGreenOne(collision24_small_southNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT) {
                setGreenOne(collision24_small_westLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT) {
                setGreenOne(collision24_small_westStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT) {
                setGreenOne(collision24_small_westRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE) {
                setGreenOne(collision24_small_westPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO) {
                setGreenOne(collision24_small_westPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1) {
                setGreenOne(collision24_small_westNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision24_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==25) {
            if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT) {
                setGreenOne(collision25_small_northLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT) {
                setGreenOne(collision25_small_northStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT) {
                setGreenOne(collision25_small_northRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER) {
                setGreenOne(collision25_small_northOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE) {
                setGreenOne(collision25_small_northPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO) {
                setGreenOne(collision25_small_northPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1) {
                setGreenOne(collision25_small_northNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2) {
                setGreenOne(collision25_small_northNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT) {
                setGreenOne(collision25_small_eastLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT) {
                setGreenOne(collision25_small_eastStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT) {
                setGreenOne(collision25_small_eastRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER) {
                setGreenOne(collision25_small_eastOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE) {
                setGreenOne(collision25_small_eastPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO) {
                setGreenOne(collision25_small_eastPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1) {
                setGreenOne(collision25_small_eastNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2) {
                setGreenOne(collision25_small_eastNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT) {
                setGreenOne(collision25_small_southLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT) {
                setGreenOne(collision25_small_southStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT) {
                setGreenOne(collision25_small_southRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER) {
                setGreenOne(collision25_small_southOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE) {
                setGreenOne(collision25_small_southPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO) {
                setGreenOne(collision25_small_southPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1) {
                setGreenOne(collision25_small_southNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2) {
                setGreenOne(collision25_small_southNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT) {
                setGreenOne(collision25_small_westLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT) {
                setGreenOne(collision25_small_westStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT) {
                setGreenOne(collision25_small_westRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE) {
                setGreenOne(collision25_small_westPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO) {
                setGreenOne(collision25_small_westPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1) {
                setGreenOne(collision25_small_westNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision25_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==26) {
            if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT) {
                setGreenOne(collision26_small_northLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT) {
                setGreenOne(collision26_small_northStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT) {
                setGreenOne(collision26_small_northRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER) {
                setGreenOne(collision26_small_northOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE) {
                setGreenOne(collision26_small_northPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO) {
                setGreenOne(collision26_small_northPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1) {
                setGreenOne(collision26_small_northNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2) {
                setGreenOne(collision26_small_northNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT) {
                setGreenOne(collision26_small_eastLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT) {
                setGreenOne(collision26_small_eastStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT) {
                setGreenOne(collision26_small_eastRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER) {
                setGreenOne(collision26_small_eastOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE) {
                setGreenOne(collision26_small_eastPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO) {
                setGreenOne(collision26_small_eastPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1) {
                setGreenOne(collision26_small_eastNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2) {
                setGreenOne(collision26_small_eastNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT) {
                setGreenOne(collision26_small_southLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT) {
                setGreenOne(collision26_small_southStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT) {
                setGreenOne(collision26_small_southRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER) {
                setGreenOne(collision26_small_southOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE) {
                setGreenOne(collision26_small_southPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO) {
                setGreenOne(collision26_small_southPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1) {
                setGreenOne(collision26_small_southNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2) {
                setGreenOne(collision26_small_southNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT) {
                setGreenOne(collision26_small_westLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT) {
                setGreenOne(collision26_small_westStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT) {
                setGreenOne(collision26_small_westRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE) {
                setGreenOne(collision26_small_westPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO) {
                setGreenOne(collision26_small_westPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1) {
                setGreenOne(collision26_small_westNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision26_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==27) {
            if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT) {
                setGreenOne(collision27_small_northLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT) {
                setGreenOne(collision27_small_northStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT) {
                setGreenOne(collision27_small_northRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER) {
                setGreenOne(collision27_small_northOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE) {
                setGreenOne(collision27_small_northPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO) {
                setGreenOne(collision27_small_northPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1) {
                setGreenOne(collision27_small_northNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2) {
                setGreenOne(collision27_small_northNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT) {
                setGreenOne(collision27_small_eastLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT) {
                setGreenOne(collision27_small_eastStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT) {
                setGreenOne(collision27_small_eastRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER) {
                setGreenOne(collision27_small_eastOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE) {
                setGreenOne(collision27_small_eastPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO) {
                setGreenOne(collision27_small_eastPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1) {
                setGreenOne(collision27_small_eastNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2) {
                setGreenOne(collision27_small_eastNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT) {
                setGreenOne(collision27_small_southLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT) {
                setGreenOne(collision27_small_southStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT) {
                setGreenOne(collision27_small_southRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER) {
                setGreenOne(collision27_small_southOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE) {
                setGreenOne(collision27_small_southPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO) {
                setGreenOne(collision27_small_southPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1) {
                setGreenOne(collision27_small_southNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2) {
                setGreenOne(collision27_small_southNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT) {
                setGreenOne(collision27_small_westLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT) {
                setGreenOne(collision27_small_westStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT) {
                setGreenOne(collision27_small_westRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE) {
                setGreenOne(collision27_small_westPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO) {
                setGreenOne(collision27_small_westPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1) {
                setGreenOne(collision27_small_westNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision27_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==28) {
            if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT) {
                setGreenOne(collision28_small_northLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT) {
                setGreenOne(collision28_small_northStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT) {
                setGreenOne(collision28_small_northRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER) {
                setGreenOne(collision28_small_northOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE) {
                setGreenOne(collision28_small_northPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO) {
                setGreenOne(collision28_small_northPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1) {
                setGreenOne(collision28_small_northNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2) {
                setGreenOne(collision28_small_northNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT) {
                setGreenOne(collision28_small_eastLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT) {
                setGreenOne(collision28_small_eastStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT) {
                setGreenOne(collision28_small_eastRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER) {
                setGreenOne(collision28_small_eastOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE) {
                setGreenOne(collision28_small_eastPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO) {
                setGreenOne(collision28_small_eastPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1) {
                setGreenOne(collision28_small_eastNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2) {
                setGreenOne(collision28_small_eastNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT) {
                setGreenOne(collision28_small_southLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT) {
                setGreenOne(collision28_small_southStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT) {
                setGreenOne(collision28_small_southRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER) {
                setGreenOne(collision28_small_southOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE) {
                setGreenOne(collision28_small_southPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO) {
                setGreenOne(collision28_small_southPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1) {
                setGreenOne(collision28_small_southNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2) {
                setGreenOne(collision28_small_southNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT) {
                setGreenOne(collision28_small_westLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT) {
                setGreenOne(collision28_small_westStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT) {
                setGreenOne(collision28_small_westRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE) {
                setGreenOne(collision28_small_westPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO) {
                setGreenOne(collision28_small_westPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1) {
                setGreenOne(collision28_small_westNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision28_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==29) {
            if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT) {
                setGreenOne(collision29_small_northLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT) {
                setGreenOne(collision29_small_northStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT) {
                setGreenOne(collision29_small_northRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER) {
                setGreenOne(collision29_small_northOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE) {
                setGreenOne(collision29_small_northPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO) {
                setGreenOne(collision29_small_northPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1) {
                setGreenOne(collision29_small_northNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2) {
                setGreenOne(collision29_small_northNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT) {
                setGreenOne(collision29_small_eastLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT) {
                setGreenOne(collision29_small_eastStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT) {
                setGreenOne(collision29_small_eastRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER) {
                setGreenOne(collision29_small_eastOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE) {
                setGreenOne(collision29_small_eastPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO) {
                setGreenOne(collision29_small_eastPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1) {
                setGreenOne(collision29_small_eastNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2) {
                setGreenOne(collision29_small_eastNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT) {
                setGreenOne(collision29_small_southLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT) {
                setGreenOne(collision29_small_southStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT) {
                setGreenOne(collision29_small_southRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER) {
                setGreenOne(collision29_small_southOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE) {
                setGreenOne(collision29_small_southPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO) {
                setGreenOne(collision29_small_southPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1) {
                setGreenOne(collision29_small_southNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2) {
                setGreenOne(collision29_small_southNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT) {
                setGreenOne(collision29_small_westLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT) {
                setGreenOne(collision29_small_westStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT) {
                setGreenOne(collision29_small_westRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE) {
                setGreenOne(collision29_small_westPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO) {
                setGreenOne(collision29_small_westPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1) {
                setGreenOne(collision29_small_westNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision29_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==30) {
            if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT) {
                setGreenOne(collision30_small_northLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT) {
                setGreenOne(collision30_small_northStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT) {
                setGreenOne(collision30_small_northRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER) {
                setGreenOne(collision30_small_northOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE) {
                setGreenOne(collision30_small_northPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO) {
                setGreenOne(collision30_small_northPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1) {
                setGreenOne(collision30_small_northNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2) {
                setGreenOne(collision30_small_northNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT) {
                setGreenOne(collision30_small_eastLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT) {
                setGreenOne(collision30_small_eastStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT) {
                setGreenOne(collision30_small_eastRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER) {
                setGreenOne(collision30_small_eastOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE) {
                setGreenOne(collision30_small_eastPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO) {
                setGreenOne(collision30_small_eastPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1) {
                setGreenOne(collision30_small_eastNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2) {
                setGreenOne(collision30_small_eastNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT) {
                setGreenOne(collision30_small_southLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT) {
                setGreenOne(collision30_small_southStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT) {
                setGreenOne(collision30_small_southRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER) {
                setGreenOne(collision30_small_southOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE) {
                setGreenOne(collision30_small_southPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO) {
                setGreenOne(collision30_small_southPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1) {
                setGreenOne(collision30_small_southNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2) {
                setGreenOne(collision30_small_southNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT) {
                setGreenOne(collision30_small_westLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT) {
                setGreenOne(collision30_small_westStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT) {
                setGreenOne(collision30_small_westRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE) {
                setGreenOne(collision30_small_westPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO) {
                setGreenOne(collision30_small_westPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1) {
                setGreenOne(collision30_small_westNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision30_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==31) {
            if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT) {
                setGreenOne(collision31_small_northLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT) {
                setGreenOne(collision31_small_northStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT) {
                setGreenOne(collision31_small_northRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER) {
                setGreenOne(collision31_small_northOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE) {
                setGreenOne(collision31_small_northPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO) {
                setGreenOne(collision31_small_northPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1) {
                setGreenOne(collision31_small_northNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2) {
                setGreenOne(collision31_small_northNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT) {
                setGreenOne(collision31_small_eastLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT) {
                setGreenOne(collision31_small_eastStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT) {
                setGreenOne(collision31_small_eastRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER) {
                setGreenOne(collision31_small_eastOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE) {
                setGreenOne(collision31_small_eastPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO) {
                setGreenOne(collision31_small_eastPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1) {
                setGreenOne(collision31_small_eastNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2) {
                setGreenOne(collision31_small_eastNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT) {
                setGreenOne(collision31_small_southLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT) {
                setGreenOne(collision31_small_southStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT) {
                setGreenOne(collision31_small_southRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER) {
                setGreenOne(collision31_small_southOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE) {
                setGreenOne(collision31_small_southPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO) {
                setGreenOne(collision31_small_southPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1) {
                setGreenOne(collision31_small_southNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2) {
                setGreenOne(collision31_small_southNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT) {
                setGreenOne(collision31_small_westLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT) {
                setGreenOne(collision31_small_westStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT) {
                setGreenOne(collision31_small_westRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE) {
                setGreenOne(collision31_small_westPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO) {
                setGreenOne(collision31_small_westPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1) {
                setGreenOne(collision31_small_westNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision31_small_westNone2);
            }
        }else if(gbtStagePattern.getStageId() ==32) {
            if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_LEFT) {
                setGreenOne(collision32_small_northLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_STRAIGHT) {
                setGreenOne(collision32_small_northStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_RIGHT) {
                setGreenOne(collision32_small_northRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_OTHER) {
                setGreenOne(collision32_small_northOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_ONE) {
                setGreenOne(collision32_small_northPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_PEDESTRAIN_TWO) {
                setGreenOne(collision32_small_northPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE1) {
                setGreenOne(collision32_small_northNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_NORTH_NONE2) {
                setGreenOne(collision32_small_northNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_LEFT) {
                setGreenOne(collision32_small_eastLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_STRAIGHT) {
                setGreenOne(collision32_small_eastStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_RIGHT) {
                setGreenOne(collision32_small_eastRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_OTHER) {
                setGreenOne(collision32_small_eastOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_ONE) {
                setGreenOne(collision32_small_eastPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_PEDESTRAIN_TWO) {
                setGreenOne(collision32_small_eastPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE1) {
                setGreenOne(collision32_small_eastNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_EAST_NONE2) {
                setGreenOne(collision32_small_eastNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_LEFT) {
                setGreenOne(collision32_small_southLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_STRAIGHT) {
                setGreenOne(collision32_small_southStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_RIGHT) {
                setGreenOne(collision32_small_southRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_OTHER) {
                setGreenOne(collision32_small_southOther);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_ONE) {
                setGreenOne(collision32_small_southPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_PEDESTRAIN_TWO) {
                setGreenOne(collision32_small_southPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE1) {
                setGreenOne(collision32_small_southNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_SOUTH_NONE2) {
                setGreenOne(collision32_small_southNone2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_LEFT) {
                setGreenOne(collision32_small_westLeft);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_STRAIGHT) {
                setGreenOne(collision32_small_westStriaght);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_RIGHT) {
                setGreenOne(collision32_small_westRight);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_ONE) {
                setGreenOne(collision32_small_westPedestrain1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_PEDESTRAIN_TWO) {
                setGreenOne(collision32_small_westPedestrain2);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE1) {
                setGreenOne(collision32_small_westNone1);
            } else if (gbtDirec.getDirecId() == GbtDefine.I_WEST_NONE2) {
                setGreenOne(collision32_small_westNone2);
            }
        }
    }

    /**
     * 设备小图的编号
     */
    private void displaySmall(){
        collision1.setVisibility(View.VISIBLE);
        TextView tv_stageId1 = (TextView)collision1.findViewById(R.id.tv_stageId);
        tv_stageId1.setText("1");
        collision2.setVisibility(View.VISIBLE);
        TextView tv_stageId2 = (TextView)collision2.findViewById(R.id.tv_stageId);
        tv_stageId2.setText("2");
        collision3.setVisibility(View.VISIBLE);
        TextView tv_stageId3 = (TextView)collision3.findViewById(R.id.tv_stageId);
        tv_stageId3.setText("3");
        collision4.setVisibility(View.VISIBLE);
        TextView tv_stageId4 = (TextView)collision4.findViewById(R.id.tv_stageId);
        tv_stageId4.setText("4");
        collision5.setVisibility(View.VISIBLE);
        TextView tv_stageId5 = (TextView)collision5.findViewById(R.id.tv_stageId);
        tv_stageId5.setText("5");
        collision6.setVisibility(View.VISIBLE);
        TextView tv_stageId6 = (TextView)collision6.findViewById(R.id.tv_stageId);
        tv_stageId6.setText("6");
        collision7.setVisibility(View.VISIBLE);
        TextView tv_stageId7 = (TextView)collision7.findViewById(R.id.tv_stageId);
        tv_stageId7.setText("7");
        collision8.setVisibility(View.VISIBLE);
        TextView tv_stageId8 = (TextView)collision8.findViewById(R.id.tv_stageId);
        tv_stageId8.setText("8");
        collision9.setVisibility(View.VISIBLE);
        TextView tv_stageId9 = (TextView)collision9.findViewById(R.id.tv_stageId);
        tv_stageId9.setText("9");
        collision10.setVisibility(View.VISIBLE);
        TextView tv_stageId10 = (TextView)collision10.findViewById(R.id.tv_stageId);
        tv_stageId10.setText("10");
        collision11.setVisibility(View.VISIBLE);
        TextView tv_stageId11 = (TextView)collision11.findViewById(R.id.tv_stageId);
        tv_stageId11.setText("11");
        collision12.setVisibility(View.VISIBLE);
        TextView tv_stageId12 = (TextView)collision12.findViewById(R.id.tv_stageId);
        tv_stageId12.setText("12");
        collision13.setVisibility(View.VISIBLE);
        TextView tv_stageId13 = (TextView)collision13.findViewById(R.id.tv_stageId);
        tv_stageId13.setText("13");
        collision14.setVisibility(View.VISIBLE);
        TextView tv_stageId14 = (TextView)collision14.findViewById(R.id.tv_stageId);
        tv_stageId14.setText("14");
        collision15.setVisibility(View.VISIBLE);
        TextView tv_stageId15 = (TextView)collision15.findViewById(R.id.tv_stageId);
        tv_stageId15.setText("15");
        collision16.setVisibility(View.VISIBLE);
        TextView tv_stageId16 = (TextView)collision16.findViewById(R.id.tv_stageId);
        tv_stageId16.setText("16");
        collision17.setVisibility(View.VISIBLE);
        TextView tv_stageId17 = (TextView)collision17.findViewById(R.id.tv_stageId);
        tv_stageId17.setText("17");
        collision18.setVisibility(View.VISIBLE);
        TextView tv_stageId18 = (TextView)collision18.findViewById(R.id.tv_stageId);
        tv_stageId18.setText("18");
        collision19.setVisibility(View.VISIBLE);
        TextView tv_stageId19 = (TextView)collision19.findViewById(R.id.tv_stageId);
        tv_stageId19.setText("19");
        collision20.setVisibility(View.VISIBLE);
        TextView tv_stageId20 = (TextView)collision20.findViewById(R.id.tv_stageId);
        tv_stageId20.setText("20");
        collision21.setVisibility(View.VISIBLE);
        TextView tv_stageId21 = (TextView)collision21.findViewById(R.id.tv_stageId);
        tv_stageId21.setText("21");
        collision22.setVisibility(View.VISIBLE);
        TextView tv_stageId22 = (TextView)collision22.findViewById(R.id.tv_stageId);
        tv_stageId22.setText("22");
        collision23.setVisibility(View.VISIBLE);
        TextView tv_stageId23 = (TextView)collision23.findViewById(R.id.tv_stageId);
        tv_stageId23.setText("23");
        collision24.setVisibility(View.VISIBLE);
        TextView tv_stageId24 = (TextView)collision24.findViewById(R.id.tv_stageId);
        tv_stageId24.setText("24");
        collision25.setVisibility(View.VISIBLE);
        TextView tv_stageId25 = (TextView)collision25.findViewById(R.id.tv_stageId);
        tv_stageId25.setText("25");
        collision26.setVisibility(View.VISIBLE);
        TextView tv_stageId26 = (TextView)collision26.findViewById(R.id.tv_stageId);
        tv_stageId26.setText("26");
        collision27.setVisibility(View.VISIBLE);
        TextView tv_stageId27 = (TextView)collision27.findViewById(R.id.tv_stageId);
        tv_stageId27.setText("27");
        collision28.setVisibility(View.VISIBLE);
        TextView tv_stageId28 = (TextView)collision28.findViewById(R.id.tv_stageId);
        tv_stageId28.setText("28");
        collision29.setVisibility(View.VISIBLE);
        TextView tv_stageId29 = (TextView)collision29.findViewById(R.id.tv_stageId);
        tv_stageId29.setText("29");
        collision30.setVisibility(View.VISIBLE);
        TextView tv_stageId30 = (TextView)collision30.findViewById(R.id.tv_stageId);
        tv_stageId30.setText("30");
        collision31.setVisibility(View.VISIBLE);
        TextView tv_stageId31 = (TextView)collision31.findViewById(R.id.tv_stageId);
        tv_stageId31.setText("31");
        collision32.setVisibility(View.VISIBLE);
        TextView tv_stageId32 = (TextView)collision32.findViewById(R.id.tv_stageId);
        tv_stageId32.setText("32");
    }
    private void hiddenImageViews(){
        Iterator<ImageView> imageViewIterator = imageViews.iterator();
        while(imageViewIterator.hasNext()){
            imageViewIterator.next().setVisibility(View.INVISIBLE);
        }

    }
    private void hiddenViews(){
        Iterator<View> viewIterator = views.iterator();
        while(viewIterator.hasNext()){
            viewIterator.next().setVisibility(View.INVISIBLE );
        }
    }

    public void collisionWestNone2(View view){
        Toast.makeText(this,"功能未开放,请向厂家索要全功能版本！",Toast.LENGTH_LONG).show();
    }

    public void collisionWestNone1(View view){
        Toast.makeText(this,"功能未开放,请向厂家索要全功能版本！",Toast.LENGTH_LONG).show();
    }
    public void collisionNorthOther(View view){
        Toast.makeText(this,"功能未开放,请向厂家索要全功能版本！",Toast.LENGTH_LONG).show();
    }
    public void collisionNorthRight(View view){
        Toast.makeText(this,"功能未开放,请向厂家索要全功能版本！",Toast.LENGTH_LONG).show();
    }
    public void collisionNorthStriaght(View view){
        showToast();
    }
    public void collisionNorthLeft(View view){
        showToast();
    }
    public void collisionNorthPedestrain1(View view){
        showToast();
    }
    public void collisionNorthPedestrain2(View view){
        showToast();
    }
    public void collisionNorthNone1(View view){
        showToast();
    }
    public void collisionNorthNone2(View view){
        showToast();
    }
    public void collisionEastPedestrain1(View view){
        showToast();
    }
    public void collisionEastPedestrain2(View view){
        showToast();
    }
    public void collisionEastOther(View view){
        showToast();
    }
    public void collisionEastRight(View view){
        showToast();
    }
    public void collisionEastStriaght(View view){
        showToast();
    }
    public void collisionEastLeft(View view){
        showToast();
    }
    public void collisionEastNone1(View view){
        showToast();
    }
    public void collisionEastNone2(View view){
        showToast();
    }
    public void collisionSouthPedestrain2(View view){
        showToast();
    }
    public void collisionSouthPedestrain1(View view){
        showToast();
    }
    public void collisionSouthOther(View view){
        showToast();
    }
    public void collisionSouthRight(View view){
        showToast();
}
    public void collisionSouthStraight(View view){
        showToast();
    }
    public void collisionSouthLeft(View view){
        showToast();
    }
    public void collisionSouthNone2(View view){
        showToast();
    }
    public void collisionSouthNone1(View view){
        showToast();
    }
    public void collisionWestPedestrain1(View view){
        showToast();
    }
    public void collisionWestPedestrain2(View view){
        showToast();
    }
    public void collisionWestLeft(View view){
        showToast();
    }
    public void collisionWestStriaght(View view){
        showToast();
    }
    public void collisionWestRight(View view){
        showToast();
    }
public void collisionWestOther(View view){
    showToast();
}
    public void showToast(){
        Toast.makeText(this,"功能未开放,请向厂家索要全功能版本！",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏
        setContentView(R.layout.activity_collision);
        initView();
        displaySmall();
        resetBigMapOff();
        TscNode node = AndroidTscDefine.spToTscNode(AndroidTscDefine.getSharedPreferences(this));
        FinalDb db = AndroidTscDefine.getFinalDb(this);
        gbtStagePatterns = db.findAllByWhere(GbtStagePattern.class,"deviceId = '"+node.getId()+"'");
        gbtTimePatterns = db.findAllByWhere(GbtTimePattern.class,"deviceId = '"+node.getId()+"'");
        gbtDirecs = db.findAllByWhere(GbtDirec.class,"deviceId = '"+node.getId()+"' and phaseId !='0' or overlapId != '0'");
        gbtPhases = db.findAllByWhere(GbtPhase.class,"deviceId = '"+node.getId()+"'");

        collision1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
        collision32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.collision, menu);
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

    private void initView(){
        collision1 = findViewById(R.id.collision1);
        collision2 = findViewById(R.id.collision2);
        collision3 = findViewById(R.id.collision3);
        collision4 = findViewById(R.id.collision4);
        collision5 = findViewById(R.id.collision5);
        collision6 = findViewById(R.id.collision6);
        collision7 = findViewById(R.id.collision7);
        collision8 = findViewById(R.id.collision8);
        collision9 = findViewById(R.id.collision9);
        collision10 = findViewById(R.id.collision10);
        collision11 = findViewById(R.id.collision11);
        collision12 = findViewById(R.id.collision12);
        collision13 = findViewById(R.id.collision13);
        collision14 = findViewById(R.id.collision14);
        collision15 = findViewById(R.id.collision15);
        collision16 = findViewById(R.id.collision16);
        collision17 = findViewById(R.id.collision17);
        collision18 = findViewById(R.id.collision18);
        collision19 = findViewById(R.id.collision19);
        collision20 = findViewById(R.id.collision20);
        collision21 = findViewById(R.id.collision21);
        collision22 = findViewById(R.id.collision22);
        collision23 = findViewById(R.id.collision23);
        collision24 = findViewById(R.id.collision24);
        collision25 = findViewById(R.id.collision25);
        collision26 = findViewById(R.id.collision26);
        collision27 = findViewById(R.id.collision27);
        collision28 = findViewById(R.id.collision28);
        collision29 = findViewById(R.id.collision29);
        collision30 = findViewById(R.id.collision30);
        collision31 = findViewById(R.id.collision31);
        collision32 = findViewById(R.id.collision32);
        collision1_small_northLeft = (ImageView)collision1.findViewById(R.id.small_northLeft);
        collision1_small_northStriaght = (ImageView)collision1.findViewById(R.id.small_northStraight);
        collision1_small_northRight = (ImageView)collision1.findViewById(R.id.small_northRight);
        collision1_small_northOther = (ImageView)collision1.findViewById(R.id.small_northOther);
        collision1_small_northPedestrain1 = (ImageView)collision1.findViewById(R.id.small_northPedestrain1);
        collision1_small_northPedestrain2 = (ImageView)collision1.findViewById(R.id.small_northPedestrain2);
        collision1_small_northNone1 = (ImageView)collision1.findViewById(R.id.small_northNone1);
        collision1_small_northNone2 = (ImageView)collision1.findViewById(R.id.small_northNone2);
        collision1_small_eastLeft = (ImageView)collision1.findViewById(R.id.small_eastLeft);
        collision1_small_eastStriaght = (ImageView)collision1.findViewById(R.id.small_eastStraight);
        collision1_small_eastRight = (ImageView)collision1.findViewById(R.id.small_eastRight);
        collision1_small_eastOther = (ImageView)collision1.findViewById(R.id.small_eastOther);
        collision1_small_eastPedestrain1 = (ImageView)collision1.findViewById(R.id.small_eastPedestrain1);
        collision1_small_eastPedestrain2 = (ImageView)collision1.findViewById(R.id.small_eastPedestrain2);
        collision1_small_eastNone1 = (ImageView)collision1.findViewById(R.id.small_eastNone1);
        collision1_small_eastNone2 = (ImageView)collision1.findViewById(R.id.small_eastNone2);
        collision1_small_southLeft = (ImageView)collision1.findViewById(R.id.small_southLeft);
        collision1_small_southStriaght = (ImageView)collision1.findViewById(R.id.small_southStraight);
        collision1_small_southRight = (ImageView)collision1.findViewById(R.id.small_southRight);
        collision1_small_southOther = (ImageView)collision1.findViewById(R.id.small_southOther);
        collision1_small_southPedestrain1 = (ImageView)collision1.findViewById(R.id.small_southPedestrain1);
        collision1_small_southPedestrain2 = (ImageView)collision1.findViewById(R.id.small_southPedestrain2);
        collision1_small_southNone1 = (ImageView)collision1.findViewById(R.id.small_southNone1);
        collision1_small_southNone2 = (ImageView)collision1.findViewById(R.id.small_southNone2);
        collision1_small_westLeft = (ImageView)collision1.findViewById(R.id.small_westLeft);
        collision1_small_westStriaght = (ImageView)collision1.findViewById(R.id.small_westStraight);
        collision1_small_westRight = (ImageView)collision1.findViewById(R.id.small_westRight);
        collision1_small_westOther = (ImageView)collision1.findViewById(R.id.small_westOther);
        collision1_small_westPedestrain1 = (ImageView)collision1.findViewById(R.id.small_westPedestrain1);
        collision1_small_westPedestrain2 = (ImageView)collision1.findViewById(R.id.small_westPedestrain2);
        collision1_small_westNone1 = (ImageView)collision1.findViewById(R.id.small_westNone1);
        collision1_small_westNone2 = (ImageView)collision1.findViewById(R.id.small_westNone2);
        collision2_small_northLeft = 									(ImageView)collision2.findViewById(R.id.small_northLeft);
        collision2_small_northStriaght = 							(ImageView)collision2.findViewById(R.id.small_northStraight);
        collision2_small_northRight = 								(ImageView)collision2.findViewById(R.id.small_northRight);
        collision2_small_northOther = 								(ImageView)collision2.findViewById(R.id.small_northOther);
        collision2_small_northPedestrain1 = 					(ImageView)collision2.findViewById(R.id.small_northPedestrain1);
        collision2_small_northPedestrain2 = 					(ImageView)collision2.findViewById(R.id.small_northPedestrain2);
        collision2_small_northNone1 = 					(ImageView)collision2.findViewById(R.id.small_northNone1);
        collision2_small_northNone2 = 	(ImageView)collision2.findViewById(R.id.small_northNone2);
        collision2_small_eastLeft = 									(ImageView)collision2.findViewById(R.id.small_eastLeft);
        collision2_small_eastStriaght = 							(ImageView)collision2.findViewById(R.id.small_eastStraight);
        collision2_small_eastRight = 									(ImageView)collision2.findViewById(R.id.small_eastRight);
        collision2_small_eastOther = 									(ImageView)collision2.findViewById(R.id.small_eastOther);
        collision2_small_eastPedestrain1 = 						(ImageView)collision2.findViewById(R.id.small_eastPedestrain1);
        collision2_small_eastPedestrain2 = 						(ImageView)collision2.findViewById(R.id.small_eastPedestrain2);
        collision2_small_eastNone1 = 					(ImageView)collision2.findViewById(R.id.small_eastNone1);
        collision2_small_eastNone2 = 	(ImageView)collision2.findViewById(R.id.small_eastNone2);
        collision2_small_southLeft = 									(ImageView)collision2.findViewById(R.id.small_southLeft);
        collision2_small_southStriaght = 							(ImageView)collision2.findViewById(R.id.small_southStraight);
        collision2_small_southRight = 								(ImageView)collision2.findViewById(R.id.small_southRight);
        collision2_small_southOther = 								(ImageView)collision2.findViewById(R.id.small_southOther);
        collision2_small_southPedestrain1 = 					(ImageView)collision2.findViewById(R.id.small_southPedestrain1);
        collision2_small_southPedestrain2 = 					(ImageView)collision2.findViewById(R.id.small_southPedestrain2);
        collision2_small_southNone1 = 					(ImageView)collision2.findViewById(R.id.small_southNone1);
        collision2_small_southNone2 = 	(ImageView)collision2.findViewById(R.id.small_southNone2);
        collision2_small_westLeft = 									(ImageView)collision2.findViewById(R.id.small_westLeft);
        collision2_small_westStriaght = 							(ImageView)collision2.findViewById(R.id.small_westStraight);
        collision2_small_westRight = 									(ImageView)collision2.findViewById(R.id.small_westRight);
        collision2_small_westOther = 									(ImageView)collision2.findViewById(R.id.small_westOther);
        collision2_small_westPedestrain1 = 						(ImageView)collision2.findViewById(R.id.small_westPedestrain1);
        collision2_small_westPedestrain2 = 						(ImageView)collision2.findViewById(R.id.small_westPedestrain2);
        collision2_small_westNone1 = 					(ImageView)collision2.findViewById(R.id.small_westNone1);
        collision2_small_westNone2 = 	(ImageView)collision2.findViewById(R.id.small_westNone2);
        collision3_small_northLeft = 									(ImageView)collision3.findViewById(R.id.small_northLeft);
        collision3_small_northStriaght = 							(ImageView)collision3.findViewById(R.id.small_northStraight);
        collision3_small_northRight = 								(ImageView)collision3.findViewById(R.id.small_northRight);
        collision3_small_northOther = 								(ImageView)collision3.findViewById(R.id.small_northOther);
        collision3_small_northPedestrain1 = 					(ImageView)collision3.findViewById(R.id.small_northPedestrain1);
        collision3_small_northPedestrain2 = 					(ImageView)collision3.findViewById(R.id.small_northPedestrain2);
        collision3_small_northNone1 = 					(ImageView)collision3.findViewById(R.id.small_northNone1);
        collision3_small_northNone2 = 	(ImageView)collision3.findViewById(R.id.small_northNone2);
        collision3_small_eastLeft = 									(ImageView)collision3.findViewById(R.id.small_eastLeft);
        collision3_small_eastStriaght = 							(ImageView)collision3.findViewById(R.id.small_eastStraight);
        collision3_small_eastRight = 									(ImageView)collision3.findViewById(R.id.small_eastRight);
        collision3_small_eastOther = 									(ImageView)collision3.findViewById(R.id.small_eastOther);
        collision3_small_eastPedestrain1 = 						(ImageView)collision3.findViewById(R.id.small_eastPedestrain1);
        collision3_small_eastPedestrain2 = 						(ImageView)collision3.findViewById(R.id.small_eastPedestrain2);
        collision3_small_eastNone1 = 					(ImageView)collision3.findViewById(R.id.small_eastNone1);
        collision3_small_eastNone2 = 	(ImageView)collision3.findViewById(R.id.small_eastNone2);
        collision3_small_southLeft = 									(ImageView)collision3.findViewById(R.id.small_southLeft);
        collision3_small_southStriaght = 							(ImageView)collision3.findViewById(R.id.small_southStraight);
        collision3_small_southRight = 								(ImageView)collision3.findViewById(R.id.small_southRight);
        collision3_small_southOther = 								(ImageView)collision3.findViewById(R.id.small_southOther);
        collision3_small_southPedestrain1 = 					(ImageView)collision3.findViewById(R.id.small_southPedestrain1);
        collision3_small_southPedestrain2 = 					(ImageView)collision3.findViewById(R.id.small_southPedestrain2);
        collision3_small_southNone1 = 					(ImageView)collision3.findViewById(R.id.small_southNone1);
        collision3_small_southNone2 = 	(ImageView)collision3.findViewById(R.id.small_southNone2);
        collision3_small_westLeft = 									(ImageView)collision3.findViewById(R.id.small_westLeft);
        collision3_small_westStriaght = 							(ImageView)collision3.findViewById(R.id.small_westStraight);
        collision3_small_westRight = 									(ImageView)collision3.findViewById(R.id.small_westRight);
        collision3_small_westOther = 									(ImageView)collision3.findViewById(R.id.small_westOther);
        collision3_small_westPedestrain1 = 						(ImageView)collision3.findViewById(R.id.small_westPedestrain1);
        collision3_small_westPedestrain2 = 						(ImageView)collision3.findViewById(R.id.small_westPedestrain2);
        collision3_small_westNone1 = 					(ImageView)collision3.findViewById(R.id.small_westNone1);
        collision3_small_westNone2 = 	(ImageView)collision3.findViewById(R.id.small_westNone2);
        collision4_small_northLeft = 									(ImageView)collision4.findViewById(R.id.small_northLeft);
        collision4_small_northStriaght = 							(ImageView)collision4.findViewById(R.id.small_northStraight);
        collision4_small_northRight = 								(ImageView)collision4.findViewById(R.id.small_northRight);
        collision4_small_northOther = 								(ImageView)collision4.findViewById(R.id.small_northOther);
        collision4_small_northPedestrain1 = 					(ImageView)collision4.findViewById(R.id.small_northPedestrain1);
        collision4_small_northPedestrain2 = 					(ImageView)collision4.findViewById(R.id.small_northPedestrain2);
        collision4_small_northNone1 = 					(ImageView)collision4.findViewById(R.id.small_northNone1);
        collision4_small_northNone2 = 	(ImageView)collision4.findViewById(R.id.small_northNone2);
        collision4_small_eastLeft = 									(ImageView)collision4.findViewById(R.id.small_eastLeft);
        collision4_small_eastStriaght = 							(ImageView)collision4.findViewById(R.id.small_eastStraight);
        collision4_small_eastRight = 									(ImageView)collision4.findViewById(R.id.small_eastRight);
        collision4_small_eastOther = 									(ImageView)collision4.findViewById(R.id.small_eastOther);
        collision4_small_eastPedestrain1 = 						(ImageView)collision4.findViewById(R.id.small_eastPedestrain1);
        collision4_small_eastPedestrain2 = 						(ImageView)collision4.findViewById(R.id.small_eastPedestrain2);
        collision4_small_eastNone1 = 					(ImageView)collision4.findViewById(R.id.small_eastNone1);
        collision4_small_eastNone2 = 	(ImageView)collision4.findViewById(R.id.small_eastNone2);
        collision4_small_southLeft = 									(ImageView)collision4.findViewById(R.id.small_southLeft);
        collision4_small_southStriaght = 							(ImageView)collision4.findViewById(R.id.small_southStraight);
        collision4_small_southRight = 								(ImageView)collision4.findViewById(R.id.small_southRight);
        collision4_small_southOther = 								(ImageView)collision4.findViewById(R.id.small_southOther);
        collision4_small_southPedestrain1 = 					(ImageView)collision4.findViewById(R.id.small_southPedestrain1);
        collision4_small_southPedestrain2 = 					(ImageView)collision4.findViewById(R.id.small_southPedestrain2);
        collision4_small_southNone1 = 					(ImageView)collision4.findViewById(R.id.small_southNone1);
        collision4_small_southNone2 = 	(ImageView)collision4.findViewById(R.id.small_southNone2);
        collision4_small_westLeft = 									(ImageView)collision4.findViewById(R.id.small_westLeft);
        collision4_small_westStriaght = 							(ImageView)collision4.findViewById(R.id.small_westStraight);
        collision4_small_westRight = 									(ImageView)collision4.findViewById(R.id.small_westRight);
        collision4_small_westOther = 									(ImageView)collision4.findViewById(R.id.small_westOther);
        collision4_small_westPedestrain1 = 						(ImageView)collision4.findViewById(R.id.small_westPedestrain1);
        collision4_small_westPedestrain2 = 						(ImageView)collision4.findViewById(R.id.small_westPedestrain2);
        collision4_small_westNone1 = 					(ImageView)collision4.findViewById(R.id.small_westNone1);
        collision4_small_westNone2 = 	(ImageView)collision4.findViewById(R.id.small_westNone2);
        collision5_small_northLeft = 									(ImageView)collision5.findViewById(R.id.small_northLeft);
        collision5_small_northStriaght = 							(ImageView)collision5.findViewById(R.id.small_northStraight);
        collision5_small_northRight = 								(ImageView)collision5.findViewById(R.id.small_northRight);
        collision5_small_northOther = 								(ImageView)collision5.findViewById(R.id.small_northOther);
        collision5_small_northPedestrain1 = 					(ImageView)collision5.findViewById(R.id.small_northPedestrain1);
        collision5_small_northPedestrain2 = 					(ImageView)collision5.findViewById(R.id.small_northPedestrain2);
        collision5_small_northNone1 = 					(ImageView)collision5.findViewById(R.id.small_northNone1);
        collision5_small_northNone2 = 	(ImageView)collision5.findViewById(R.id.small_northNone2);
        collision5_small_eastLeft = 									(ImageView)collision5.findViewById(R.id.small_eastLeft);
        collision5_small_eastStriaght = 							(ImageView)collision5.findViewById(R.id.small_eastStraight);
        collision5_small_eastRight = 									(ImageView)collision5.findViewById(R.id.small_eastRight);
        collision5_small_eastOther = 									(ImageView)collision5.findViewById(R.id.small_eastOther);
        collision5_small_eastPedestrain1 = 						(ImageView)collision5.findViewById(R.id.small_eastPedestrain1);
        collision5_small_eastPedestrain2 = 						(ImageView)collision5.findViewById(R.id.small_eastPedestrain2);
        collision5_small_eastNone1 = 					(ImageView)collision5.findViewById(R.id.small_eastNone1);
        collision5_small_eastNone2 = 	(ImageView)collision5.findViewById(R.id.small_eastNone2);
        collision5_small_southLeft = 									(ImageView)collision5.findViewById(R.id.small_southLeft);
        collision5_small_southStriaght = 							(ImageView)collision5.findViewById(R.id.small_southStraight);
        collision5_small_southRight = 								(ImageView)collision5.findViewById(R.id.small_southRight);
        collision5_small_southOther = 								(ImageView)collision5.findViewById(R.id.small_southOther);
        collision5_small_southPedestrain1 = 					(ImageView)collision5.findViewById(R.id.small_southPedestrain1);
        collision5_small_southPedestrain2 = 					(ImageView)collision5.findViewById(R.id.small_southPedestrain2);
        collision5_small_southNone1 = 					(ImageView)collision5.findViewById(R.id.small_southNone1);
        collision5_small_southNone2 = 	(ImageView)collision5.findViewById(R.id.small_southNone2);
        collision5_small_westLeft = 									(ImageView)collision5.findViewById(R.id.small_westLeft);
        collision5_small_westStriaght = 							(ImageView)collision5.findViewById(R.id.small_westStraight);
        collision5_small_westRight = 									(ImageView)collision5.findViewById(R.id.small_westRight);
        collision5_small_westOther = 									(ImageView)collision5.findViewById(R.id.small_westOther);
        collision5_small_westPedestrain1 = 						(ImageView)collision5.findViewById(R.id.small_westPedestrain1);
        collision5_small_westPedestrain2 = 						(ImageView)collision5.findViewById(R.id.small_westPedestrain2);
        collision5_small_westNone1 = 					(ImageView)collision5.findViewById(R.id.small_westNone1);
        collision5_small_westNone2 = 	(ImageView)collision5.findViewById(R.id.small_westNone2);
        collision6_small_northLeft = 									(ImageView)collision6.findViewById(R.id.small_northLeft);
        collision6_small_northStriaght = 							(ImageView)collision6.findViewById(R.id.small_northStraight);
        collision6_small_northRight = 								(ImageView)collision6.findViewById(R.id.small_northRight);
        collision6_small_northOther = 								(ImageView)collision6.findViewById(R.id.small_northOther);
        collision6_small_northPedestrain1 = 					(ImageView)collision6.findViewById(R.id.small_northPedestrain1);
        collision6_small_northPedestrain2 = 					(ImageView)collision6.findViewById(R.id.small_northPedestrain2);
        collision6_small_northNone1 = 					(ImageView)collision6.findViewById(R.id.small_northNone1);
        collision6_small_northNone2 = 	(ImageView)collision6.findViewById(R.id.small_northNone2);
        collision6_small_eastLeft = 									(ImageView)collision6.findViewById(R.id.small_eastLeft);
        collision6_small_eastStriaght = 							(ImageView)collision6.findViewById(R.id.small_eastStraight);
        collision6_small_eastRight = 									(ImageView)collision6.findViewById(R.id.small_eastRight);
        collision6_small_eastOther = 									(ImageView)collision6.findViewById(R.id.small_eastOther);
        collision6_small_eastPedestrain1 = 						(ImageView)collision6.findViewById(R.id.small_eastPedestrain1);
        collision6_small_eastPedestrain2 = 						(ImageView)collision6.findViewById(R.id.small_eastPedestrain2);
        collision6_small_eastNone1 = 					(ImageView)collision6.findViewById(R.id.small_eastNone1);
        collision6_small_eastNone2 = 	(ImageView)collision6.findViewById(R.id.small_eastNone2);
        collision6_small_southLeft = 									(ImageView)collision6.findViewById(R.id.small_southLeft);
        collision6_small_southStriaght = 							(ImageView)collision6.findViewById(R.id.small_southStraight);
        collision6_small_southRight = 								(ImageView)collision6.findViewById(R.id.small_southRight);
        collision6_small_southOther = 								(ImageView)collision6.findViewById(R.id.small_southOther);
        collision6_small_southPedestrain1 = 					(ImageView)collision6.findViewById(R.id.small_southPedestrain1);
        collision6_small_southPedestrain2 = 					(ImageView)collision6.findViewById(R.id.small_southPedestrain2);
        collision6_small_southNone1 = 					(ImageView)collision6.findViewById(R.id.small_southNone1);
        collision6_small_southNone2 = 	(ImageView)collision6.findViewById(R.id.small_southNone2);
        collision6_small_westLeft = 									(ImageView)collision6.findViewById(R.id.small_westLeft);
        collision6_small_westStriaght = 							(ImageView)collision6.findViewById(R.id.small_westStraight);
        collision6_small_westRight = 									(ImageView)collision6.findViewById(R.id.small_westRight);
        collision6_small_westOther = 									(ImageView)collision6.findViewById(R.id.small_westOther);
        collision6_small_westPedestrain1 = 						(ImageView)collision6.findViewById(R.id.small_westPedestrain1);
        collision6_small_westPedestrain2 = 						(ImageView)collision6.findViewById(R.id.small_westPedestrain2);
        collision6_small_westNone1 = 					(ImageView)collision6.findViewById(R.id.small_westNone1);
        collision6_small_westNone2 = 	(ImageView)collision6.findViewById(R.id.small_westNone2);
        collision7_small_northLeft = 									(ImageView)collision7.findViewById(R.id.small_northLeft);
        collision7_small_northStriaght = 							(ImageView)collision7.findViewById(R.id.small_northStraight);
        collision7_small_northRight = 								(ImageView)collision7.findViewById(R.id.small_northRight);
        collision7_small_northOther = 								(ImageView)collision7.findViewById(R.id.small_northOther);
        collision7_small_northPedestrain1 = 					(ImageView)collision7.findViewById(R.id.small_northPedestrain1);
        collision7_small_northPedestrain2 = 					(ImageView)collision7.findViewById(R.id.small_northPedestrain2);
        collision7_small_northNone1 = 					(ImageView)collision7.findViewById(R.id.small_northNone1);
        collision7_small_northNone2 = 	(ImageView)collision7.findViewById(R.id.small_northNone2);
        collision7_small_eastLeft = 									(ImageView)collision7.findViewById(R.id.small_eastLeft);
        collision7_small_eastStriaght = 							(ImageView)collision7.findViewById(R.id.small_eastStraight);
        collision7_small_eastRight = 									(ImageView)collision7.findViewById(R.id.small_eastRight);
        collision7_small_eastOther = 									(ImageView)collision7.findViewById(R.id.small_eastOther);
        collision7_small_eastPedestrain1 = 						(ImageView)collision7.findViewById(R.id.small_eastPedestrain1);
        collision7_small_eastPedestrain2 = 						(ImageView)collision7.findViewById(R.id.small_eastPedestrain2);
        collision7_small_eastNone1 = 					(ImageView)collision7.findViewById(R.id.small_eastNone1);
        collision7_small_eastNone2 = 	(ImageView)collision7.findViewById(R.id.small_eastNone2);
        collision7_small_southLeft = 									(ImageView)collision7.findViewById(R.id.small_southLeft);
        collision7_small_southStriaght = 							(ImageView)collision7.findViewById(R.id.small_southStraight);
        collision7_small_southRight = 								(ImageView)collision7.findViewById(R.id.small_southRight);
        collision7_small_southOther = 								(ImageView)collision7.findViewById(R.id.small_southOther);
        collision7_small_southPedestrain1 = 					(ImageView)collision7.findViewById(R.id.small_southPedestrain1);
        collision7_small_southPedestrain2 = 					(ImageView)collision7.findViewById(R.id.small_southPedestrain2);
        collision7_small_southNone1 = 					(ImageView)collision7.findViewById(R.id.small_southNone1);
        collision7_small_southNone2 = 	(ImageView)collision7.findViewById(R.id.small_southNone2);
        collision7_small_westLeft = 									(ImageView)collision7.findViewById(R.id.small_westLeft);
        collision7_small_westStriaght = 							(ImageView)collision7.findViewById(R.id.small_westStraight);
        collision7_small_westRight = 									(ImageView)collision7.findViewById(R.id.small_westRight);
        collision7_small_westOther = 									(ImageView)collision7.findViewById(R.id.small_westOther);
        collision7_small_westPedestrain1 = 						(ImageView)collision7.findViewById(R.id.small_westPedestrain1);
        collision7_small_westPedestrain2 = 						(ImageView)collision7.findViewById(R.id.small_westPedestrain2);
        collision7_small_westNone1 = 					(ImageView)collision7.findViewById(R.id.small_westNone1);
        collision7_small_westNone2 = 	(ImageView)collision7.findViewById(R.id.small_westNone2);
        collision8_small_northLeft = 									(ImageView)collision8.findViewById(R.id.small_northLeft);
        collision8_small_northStriaght = 							(ImageView)collision8.findViewById(R.id.small_northStraight);
        collision8_small_northRight = 								(ImageView)collision8.findViewById(R.id.small_northRight);
        collision8_small_northOther = 								(ImageView)collision8.findViewById(R.id.small_northOther);
        collision8_small_northPedestrain1 = 					(ImageView)collision8.findViewById(R.id.small_northPedestrain1);
        collision8_small_northPedestrain2 = 					(ImageView)collision8.findViewById(R.id.small_northPedestrain2);
        collision8_small_northNone1 = 					(ImageView)collision8.findViewById(R.id.small_northNone1);
        collision8_small_northNone2 = 	(ImageView)collision8.findViewById(R.id.small_northNone2);
        collision8_small_eastLeft = 									(ImageView)collision8.findViewById(R.id.small_eastLeft);
        collision8_small_eastStriaght = 							(ImageView)collision8.findViewById(R.id.small_eastStraight);
        collision8_small_eastRight = 									(ImageView)collision8.findViewById(R.id.small_eastRight);
        collision8_small_eastOther = 									(ImageView)collision8.findViewById(R.id.small_eastOther);
        collision8_small_eastPedestrain1 = 						(ImageView)collision8.findViewById(R.id.small_eastPedestrain1);
        collision8_small_eastPedestrain2 = 						(ImageView)collision8.findViewById(R.id.small_eastPedestrain2);
        collision8_small_eastNone1 = 					(ImageView)collision8.findViewById(R.id.small_eastNone1);
        collision8_small_eastNone2 = 	(ImageView)collision8.findViewById(R.id.small_eastNone2);
        collision8_small_southLeft = 									(ImageView)collision8.findViewById(R.id.small_southLeft);
        collision8_small_southStriaght = 							(ImageView)collision8.findViewById(R.id.small_southStraight);
        collision8_small_southRight = 								(ImageView)collision8.findViewById(R.id.small_southRight);
        collision8_small_southOther = 								(ImageView)collision8.findViewById(R.id.small_southOther);
        collision8_small_southPedestrain1 = 					(ImageView)collision8.findViewById(R.id.small_southPedestrain1);
        collision8_small_southPedestrain2 = 					(ImageView)collision8.findViewById(R.id.small_southPedestrain2);
        collision8_small_southNone1 = 					(ImageView)collision8.findViewById(R.id.small_southNone1);
        collision8_small_southNone2 = 	(ImageView)collision8.findViewById(R.id.small_southNone2);
        collision8_small_westLeft = 									(ImageView)collision8.findViewById(R.id.small_westLeft);
        collision8_small_westStriaght = 							(ImageView)collision8.findViewById(R.id.small_westStraight);
        collision8_small_westRight = 									(ImageView)collision8.findViewById(R.id.small_westRight);
        collision8_small_westOther = 									(ImageView)collision8.findViewById(R.id.small_westOther);
        collision8_small_westPedestrain1 = 						(ImageView)collision8.findViewById(R.id.small_westPedestrain1);
        collision8_small_westPedestrain2 = 						(ImageView)collision8.findViewById(R.id.small_westPedestrain2);
        collision8_small_westNone1 = 					(ImageView)collision8.findViewById(R.id.small_westNone1);
        collision8_small_westNone2 = 	(ImageView)collision8.findViewById(R.id.small_westNone2);
        collision9_small_northLeft = 									(ImageView)collision9.findViewById(R.id.small_northLeft);
        collision9_small_northStriaght = 							(ImageView)collision9.findViewById(R.id.small_northStraight);
        collision9_small_northRight = 								(ImageView)collision9.findViewById(R.id.small_northRight);
        collision9_small_northOther = 								(ImageView)collision9.findViewById(R.id.small_northOther);
        collision9_small_northPedestrain1 = 					(ImageView)collision9.findViewById(R.id.small_northPedestrain1);
        collision9_small_northPedestrain2 = 					(ImageView)collision9.findViewById(R.id.small_northPedestrain2);
        collision9_small_northNone1 = 					(ImageView)collision9.findViewById(R.id.small_northNone1);
        collision9_small_northNone2 = 	(ImageView)collision9.findViewById(R.id.small_northNone2);
        collision9_small_eastLeft = 									(ImageView)collision9.findViewById(R.id.small_eastLeft);
        collision9_small_eastStriaght = 							(ImageView)collision9.findViewById(R.id.small_eastStraight);
        collision9_small_eastRight = 									(ImageView)collision9.findViewById(R.id.small_eastRight);
        collision9_small_eastOther = 									(ImageView)collision9.findViewById(R.id.small_eastOther);
        collision9_small_eastPedestrain1 = 						(ImageView)collision9.findViewById(R.id.small_eastPedestrain1);
        collision9_small_eastPedestrain2 = 						(ImageView)collision9.findViewById(R.id.small_eastPedestrain2);
        collision9_small_eastNone1 = 					(ImageView)collision9.findViewById(R.id.small_eastNone1);
        collision9_small_eastNone2 = 	(ImageView)collision9.findViewById(R.id.small_eastNone2);
        collision9_small_southLeft = 									(ImageView)collision9.findViewById(R.id.small_southLeft);
        collision9_small_southStriaght = 							(ImageView)collision9.findViewById(R.id.small_southStraight);
        collision9_small_southRight = 								(ImageView)collision9.findViewById(R.id.small_southRight);
        collision9_small_southOther = 								(ImageView)collision9.findViewById(R.id.small_southOther);
        collision9_small_southPedestrain1 = 					(ImageView)collision9.findViewById(R.id.small_southPedestrain1);
        collision9_small_southPedestrain2 = 					(ImageView)collision9.findViewById(R.id.small_southPedestrain2);
        collision9_small_southNone1 = 					(ImageView)collision9.findViewById(R.id.small_southNone1);
        collision9_small_southNone2 = 	(ImageView)collision9.findViewById(R.id.small_southNone2);
        collision9_small_westLeft = 									(ImageView)collision9.findViewById(R.id.small_westLeft);
        collision9_small_westStriaght = 							(ImageView)collision9.findViewById(R.id.small_westStraight);
        collision9_small_westRight = 									(ImageView)collision9.findViewById(R.id.small_westRight);
        collision9_small_westOther = 									(ImageView)collision9.findViewById(R.id.small_westOther);
        collision9_small_westPedestrain1 = 						(ImageView)collision9.findViewById(R.id.small_westPedestrain1);
        collision9_small_westPedestrain2 = 						(ImageView)collision9.findViewById(R.id.small_westPedestrain2);
        collision9_small_westNone1 = 					(ImageView)collision9.findViewById(R.id.small_westNone1);
        collision9_small_westNone2 = 	(ImageView)collision9.findViewById(R.id.small_westNone2);
        collision10_small_northLeft = 									(ImageView)collision10.findViewById(R.id.small_northLeft);
        collision10_small_northStriaght = 							(ImageView)collision10.findViewById(R.id.small_northStraight);
        collision10_small_northRight = 								(ImageView)collision10.findViewById(R.id.small_northRight);
        collision10_small_northOther = 								(ImageView)collision10.findViewById(R.id.small_northOther);
        collision10_small_northPedestrain1 = 					(ImageView)collision10.findViewById(R.id.small_northPedestrain1);
        collision10_small_northPedestrain2 = 					(ImageView)collision10.findViewById(R.id.small_northPedestrain2);
        collision10_small_northNone1 = 					(ImageView)collision10.findViewById(R.id.small_northNone1);
        collision10_small_northNone2 = 	(ImageView)collision10.findViewById(R.id.small_northNone2);
        collision10_small_eastLeft = 									(ImageView)collision10.findViewById(R.id.small_eastLeft);
        collision10_small_eastStriaght = 							(ImageView)collision10.findViewById(R.id.small_eastStraight);
        collision10_small_eastRight = 									(ImageView)collision10.findViewById(R.id.small_eastRight);
        collision10_small_eastOther = 									(ImageView)collision10.findViewById(R.id.small_eastOther);
        collision10_small_eastPedestrain1 = 						(ImageView)collision10.findViewById(R.id.small_eastPedestrain1);
        collision10_small_eastPedestrain2 = 						(ImageView)collision10.findViewById(R.id.small_eastPedestrain2);
        collision10_small_eastNone1 = 					(ImageView)collision10.findViewById(R.id.small_eastNone1);
        collision10_small_eastNone2 = 	(ImageView)collision10.findViewById(R.id.small_eastNone2);
        collision10_small_southLeft = 									(ImageView)collision10.findViewById(R.id.small_southLeft);
        collision10_small_southStriaght = 							(ImageView)collision10.findViewById(R.id.small_southStraight);
        collision10_small_southRight = 								(ImageView)collision10.findViewById(R.id.small_southRight);
        collision10_small_southOther = 								(ImageView)collision10.findViewById(R.id.small_southOther);
        collision10_small_southPedestrain1 = 					(ImageView)collision10.findViewById(R.id.small_southPedestrain1);
        collision10_small_southPedestrain2 = 					(ImageView)collision10.findViewById(R.id.small_southPedestrain2);
        collision10_small_southNone1 = 					(ImageView)collision10.findViewById(R.id.small_southNone1);
        collision10_small_southNone2 = 	(ImageView)collision10.findViewById(R.id.small_southNone2);
        collision10_small_westLeft = 									(ImageView)collision10.findViewById(R.id.small_westLeft);
        collision10_small_westStriaght = 							(ImageView)collision10.findViewById(R.id.small_westStraight);
        collision10_small_westRight = 									(ImageView)collision10.findViewById(R.id.small_westRight);
        collision10_small_westOther = 									(ImageView)collision10.findViewById(R.id.small_westOther);
        collision10_small_westPedestrain1 = 						(ImageView)collision10.findViewById(R.id.small_westPedestrain1);
        collision10_small_westPedestrain2 = 						(ImageView)collision10.findViewById(R.id.small_westPedestrain2);
        collision10_small_westNone1 = 					(ImageView)collision10.findViewById(R.id.small_westNone1);
        collision10_small_westNone2 = 	(ImageView)collision10.findViewById(R.id.small_westNone2);
        collision11_small_northLeft = 									(ImageView)collision11.findViewById(R.id.small_northLeft);
        collision11_small_northStriaght = 							(ImageView)collision11.findViewById(R.id.small_northStraight);
        collision11_small_northRight = 								(ImageView)collision11.findViewById(R.id.small_northRight);
        collision11_small_northOther = 								(ImageView)collision11.findViewById(R.id.small_northOther);
        collision11_small_northPedestrain1 = 					(ImageView)collision11.findViewById(R.id.small_northPedestrain1);
        collision11_small_northPedestrain2 = 					(ImageView)collision11.findViewById(R.id.small_northPedestrain2);
        collision11_small_northNone1 = 					(ImageView)collision11.findViewById(R.id.small_northNone1);
        collision11_small_northNone2 = 	(ImageView)collision11.findViewById(R.id.small_northNone2);
        collision11_small_eastLeft = 									(ImageView)collision11.findViewById(R.id.small_eastLeft);
        collision11_small_eastStriaght = 							(ImageView)collision11.findViewById(R.id.small_eastStraight);
        collision11_small_eastRight = 									(ImageView)collision11.findViewById(R.id.small_eastRight);
        collision11_small_eastOther = 									(ImageView)collision11.findViewById(R.id.small_eastOther);
        collision11_small_eastPedestrain1 = 						(ImageView)collision11.findViewById(R.id.small_eastPedestrain1);
        collision11_small_eastPedestrain2 = 						(ImageView)collision11.findViewById(R.id.small_eastPedestrain2);
        collision11_small_eastNone1 = 					(ImageView)collision11.findViewById(R.id.small_eastNone1);
        collision11_small_eastNone2 = 	(ImageView)collision11.findViewById(R.id.small_eastNone2);
        collision11_small_southLeft = 									(ImageView)collision11.findViewById(R.id.small_southLeft);
        collision11_small_southStriaght = 							(ImageView)collision11.findViewById(R.id.small_southStraight);
        collision11_small_southRight = 								(ImageView)collision11.findViewById(R.id.small_southRight);
        collision11_small_southOther = 								(ImageView)collision11.findViewById(R.id.small_southOther);
        collision11_small_southPedestrain1 = 					(ImageView)collision11.findViewById(R.id.small_southPedestrain1);
        collision11_small_southPedestrain2 = 					(ImageView)collision11.findViewById(R.id.small_southPedestrain2);
        collision11_small_southNone1 = 					(ImageView)collision11.findViewById(R.id.small_southNone1);
        collision11_small_southNone2 = 	(ImageView)collision11.findViewById(R.id.small_southNone2);
        collision11_small_westLeft = 									(ImageView)collision11.findViewById(R.id.small_westLeft);
        collision11_small_westStriaght = 							(ImageView)collision11.findViewById(R.id.small_westStraight);
        collision11_small_westRight = 									(ImageView)collision11.findViewById(R.id.small_westRight);
        collision11_small_westOther = 									(ImageView)collision11.findViewById(R.id.small_westOther);
        collision11_small_westPedestrain1 = 						(ImageView)collision11.findViewById(R.id.small_westPedestrain1);
        collision11_small_westPedestrain2 = 						(ImageView)collision11.findViewById(R.id.small_westPedestrain2);
        collision11_small_westNone1 = 					(ImageView)collision11.findViewById(R.id.small_westNone1);
        collision11_small_westNone2 = 	(ImageView)collision11.findViewById(R.id.small_westNone2);
        collision12_small_northLeft = 									(ImageView)collision12.findViewById(R.id.small_northLeft);
        collision12_small_northStriaght = 							(ImageView)collision12.findViewById(R.id.small_northStraight);
        collision12_small_northRight = 								(ImageView)collision12.findViewById(R.id.small_northRight);
        collision12_small_northOther = 								(ImageView)collision12.findViewById(R.id.small_northOther);
        collision12_small_northPedestrain1 = 					(ImageView)collision12.findViewById(R.id.small_northPedestrain1);
        collision12_small_northPedestrain2 = 					(ImageView)collision12.findViewById(R.id.small_northPedestrain2);
        collision12_small_northNone1 = 					(ImageView)collision12.findViewById(R.id.small_northNone1);
        collision12_small_northNone2 = 	(ImageView)collision12.findViewById(R.id.small_northNone2);
        collision12_small_eastLeft = 									(ImageView)collision12.findViewById(R.id.small_eastLeft);
        collision12_small_eastStriaght = 							(ImageView)collision12.findViewById(R.id.small_eastStraight);
        collision12_small_eastRight = 									(ImageView)collision12.findViewById(R.id.small_eastRight);
        collision12_small_eastOther = 									(ImageView)collision12.findViewById(R.id.small_eastOther);
        collision12_small_eastPedestrain1 = 						(ImageView)collision12.findViewById(R.id.small_eastPedestrain1);
        collision12_small_eastPedestrain2 = 						(ImageView)collision12.findViewById(R.id.small_eastPedestrain2);
        collision12_small_eastNone1 = 					(ImageView)collision12.findViewById(R.id.small_eastNone1);
        collision12_small_eastNone2 = 	(ImageView)collision12.findViewById(R.id.small_eastNone2);
        collision12_small_southLeft = 									(ImageView)collision12.findViewById(R.id.small_southLeft);
        collision12_small_southStriaght = 							(ImageView)collision12.findViewById(R.id.small_southStraight);
        collision12_small_southRight = 								(ImageView)collision12.findViewById(R.id.small_southRight);
        collision12_small_southOther = 								(ImageView)collision12.findViewById(R.id.small_southOther);
        collision12_small_southPedestrain1 = 					(ImageView)collision12.findViewById(R.id.small_southPedestrain1);
        collision12_small_southPedestrain2 = 					(ImageView)collision12.findViewById(R.id.small_southPedestrain2);
        collision12_small_southNone1 = 					(ImageView)collision12.findViewById(R.id.small_southNone1);
        collision12_small_southNone2 = 	(ImageView)collision12.findViewById(R.id.small_southNone2);
        collision12_small_westLeft = 									(ImageView)collision12.findViewById(R.id.small_westLeft);
        collision12_small_westStriaght = 							(ImageView)collision12.findViewById(R.id.small_westStraight);
        collision12_small_westRight = 									(ImageView)collision12.findViewById(R.id.small_westRight);
        collision12_small_westOther = 									(ImageView)collision12.findViewById(R.id.small_westOther);
        collision12_small_westPedestrain1 = 						(ImageView)collision12.findViewById(R.id.small_westPedestrain1);
        collision12_small_westPedestrain2 = 						(ImageView)collision12.findViewById(R.id.small_westPedestrain2);
        collision12_small_westNone1 = 					(ImageView)collision12.findViewById(R.id.small_westNone1);
        collision12_small_westNone2 = 	(ImageView)collision12.findViewById(R.id.small_westNone2);
        collision13_small_northLeft = 									(ImageView)collision13.findViewById(R.id.small_northLeft);
        collision13_small_northStriaght = 							(ImageView)collision13.findViewById(R.id.small_northStraight);
        collision13_small_northRight = 								(ImageView)collision13.findViewById(R.id.small_northRight);
        collision13_small_northOther = 								(ImageView)collision13.findViewById(R.id.small_northOther);
        collision13_small_northPedestrain1 = 					(ImageView)collision13.findViewById(R.id.small_northPedestrain1);
        collision13_small_northPedestrain2 = 					(ImageView)collision13.findViewById(R.id.small_northPedestrain2);
        collision13_small_northNone1 = 					(ImageView)collision13.findViewById(R.id.small_northNone1);
        collision13_small_northNone2 = 	(ImageView)collision13.findViewById(R.id.small_northNone2);
        collision13_small_eastLeft = 									(ImageView)collision13.findViewById(R.id.small_eastLeft);
        collision13_small_eastStriaght = 							(ImageView)collision13.findViewById(R.id.small_eastStraight);
        collision13_small_eastRight = 									(ImageView)collision13.findViewById(R.id.small_eastRight);
        collision13_small_eastOther = 									(ImageView)collision13.findViewById(R.id.small_eastOther);
        collision13_small_eastPedestrain1 = 						(ImageView)collision13.findViewById(R.id.small_eastPedestrain1);
        collision13_small_eastPedestrain2 = 						(ImageView)collision13.findViewById(R.id.small_eastPedestrain2);
        collision13_small_eastNone1 = 					(ImageView)collision13.findViewById(R.id.small_eastNone1);
        collision13_small_eastNone2 = 	(ImageView)collision13.findViewById(R.id.small_eastNone2);
        collision13_small_southLeft = 									(ImageView)collision13.findViewById(R.id.small_southLeft);
        collision13_small_southStriaght = 							(ImageView)collision13.findViewById(R.id.small_southStraight);
        collision13_small_southRight = 								(ImageView)collision13.findViewById(R.id.small_southRight);
        collision13_small_southOther = 								(ImageView)collision13.findViewById(R.id.small_southOther);
        collision13_small_southPedestrain1 = 					(ImageView)collision13.findViewById(R.id.small_southPedestrain1);
        collision13_small_southPedestrain2 = 					(ImageView)collision13.findViewById(R.id.small_southPedestrain2);
        collision13_small_southNone1 = 					(ImageView)collision13.findViewById(R.id.small_southNone1);
        collision13_small_southNone2 = 	(ImageView)collision13.findViewById(R.id.small_southNone2);
        collision13_small_westLeft = 									(ImageView)collision13.findViewById(R.id.small_westLeft);
        collision13_small_westStriaght = 							(ImageView)collision13.findViewById(R.id.small_westStraight);
        collision13_small_westRight = 									(ImageView)collision13.findViewById(R.id.small_westRight);
        collision13_small_westOther = 									(ImageView)collision13.findViewById(R.id.small_westOther);
        collision13_small_westPedestrain1 = 						(ImageView)collision13.findViewById(R.id.small_westPedestrain1);
        collision13_small_westPedestrain2 = 						(ImageView)collision13.findViewById(R.id.small_westPedestrain2);
        collision13_small_westNone1 = 					(ImageView)collision13.findViewById(R.id.small_westNone1);
        collision13_small_westNone2 = 	(ImageView)collision13.findViewById(R.id.small_westNone2);
        collision14_small_northLeft = 									(ImageView)collision14.findViewById(R.id.small_northLeft);
        collision14_small_northStriaght = 							(ImageView)collision14.findViewById(R.id.small_northStraight);
        collision14_small_northRight = 								(ImageView)collision14.findViewById(R.id.small_northRight);
        collision14_small_northOther = 								(ImageView)collision14.findViewById(R.id.small_northOther);
        collision14_small_northPedestrain1 = 					(ImageView)collision14.findViewById(R.id.small_northPedestrain1);
        collision14_small_northPedestrain2 = 					(ImageView)collision14.findViewById(R.id.small_northPedestrain2);
        collision14_small_northNone1 = 					(ImageView)collision14.findViewById(R.id.small_northNone1);
        collision14_small_northNone2 = 	(ImageView)collision14.findViewById(R.id.small_northNone2);
        collision14_small_eastLeft = 									(ImageView)collision14.findViewById(R.id.small_eastLeft);
        collision14_small_eastStriaght = 							(ImageView)collision14.findViewById(R.id.small_eastStraight);
        collision14_small_eastRight = 									(ImageView)collision14.findViewById(R.id.small_eastRight);
        collision14_small_eastOther = 									(ImageView)collision14.findViewById(R.id.small_eastOther);
        collision14_small_eastPedestrain1 = 						(ImageView)collision14.findViewById(R.id.small_eastPedestrain1);
        collision14_small_eastPedestrain2 = 						(ImageView)collision14.findViewById(R.id.small_eastPedestrain2);
        collision14_small_eastNone1 = 					(ImageView)collision14.findViewById(R.id.small_eastNone1);
        collision14_small_eastNone2 = 	(ImageView)collision14.findViewById(R.id.small_eastNone2);
        collision14_small_southLeft = 									(ImageView)collision14.findViewById(R.id.small_southLeft);
        collision14_small_southStriaght = 							(ImageView)collision14.findViewById(R.id.small_southStraight);
        collision14_small_southRight = 								(ImageView)collision14.findViewById(R.id.small_southRight);
        collision14_small_southOther = 								(ImageView)collision14.findViewById(R.id.small_southOther);
        collision14_small_southPedestrain1 = 					(ImageView)collision14.findViewById(R.id.small_southPedestrain1);
        collision14_small_southPedestrain2 = 					(ImageView)collision14.findViewById(R.id.small_southPedestrain2);
        collision14_small_southNone1 = 					(ImageView)collision14.findViewById(R.id.small_southNone1);
        collision14_small_southNone2 = 	(ImageView)collision14.findViewById(R.id.small_southNone2);
        collision14_small_westLeft = 									(ImageView)collision14.findViewById(R.id.small_westLeft);
        collision14_small_westStriaght = 							(ImageView)collision14.findViewById(R.id.small_westStraight);
        collision14_small_westRight = 									(ImageView)collision14.findViewById(R.id.small_westRight);
        collision14_small_westOther = 									(ImageView)collision14.findViewById(R.id.small_westOther);
        collision14_small_westPedestrain1 = 						(ImageView)collision14.findViewById(R.id.small_westPedestrain1);
        collision14_small_westPedestrain2 = 						(ImageView)collision14.findViewById(R.id.small_westPedestrain2);
        collision14_small_westNone1 = 					(ImageView)collision14.findViewById(R.id.small_westNone1);
        collision14_small_westNone2 = 	(ImageView)collision14.findViewById(R.id.small_westNone2);
        collision15_small_northLeft = 									(ImageView)collision15.findViewById(R.id.small_northLeft);
        collision15_small_northStriaght = 							(ImageView)collision15.findViewById(R.id.small_northStraight);
        collision15_small_northRight = 								(ImageView)collision15.findViewById(R.id.small_northRight);
        collision15_small_northOther = 								(ImageView)collision15.findViewById(R.id.small_northOther);
        collision15_small_northPedestrain1 = 					(ImageView)collision15.findViewById(R.id.small_northPedestrain1);
        collision15_small_northPedestrain2 = 					(ImageView)collision15.findViewById(R.id.small_northPedestrain2);
        collision15_small_northNone1 = 					(ImageView)collision15.findViewById(R.id.small_northNone1);
        collision15_small_northNone2 = 	(ImageView)collision15.findViewById(R.id.small_northNone2);
        collision15_small_eastLeft = 									(ImageView)collision15.findViewById(R.id.small_eastLeft);
        collision15_small_eastStriaght = 							(ImageView)collision15.findViewById(R.id.small_eastStraight);
        collision15_small_eastRight = 									(ImageView)collision15.findViewById(R.id.small_eastRight);
        collision15_small_eastOther = 									(ImageView)collision15.findViewById(R.id.small_eastOther);
        collision15_small_eastPedestrain1 = 						(ImageView)collision15.findViewById(R.id.small_eastPedestrain1);
        collision15_small_eastPedestrain2 = 						(ImageView)collision15.findViewById(R.id.small_eastPedestrain2);
        collision15_small_eastNone1 = 					(ImageView)collision15.findViewById(R.id.small_eastNone1);
        collision15_small_eastNone2 = 	(ImageView)collision15.findViewById(R.id.small_eastNone2);
        collision15_small_southLeft = 									(ImageView)collision15.findViewById(R.id.small_southLeft);
        collision15_small_southStriaght = 							(ImageView)collision15.findViewById(R.id.small_southStraight);
        collision15_small_southRight = 								(ImageView)collision15.findViewById(R.id.small_southRight);
        collision15_small_southOther = 								(ImageView)collision15.findViewById(R.id.small_southOther);
        collision15_small_southPedestrain1 = 					(ImageView)collision15.findViewById(R.id.small_southPedestrain1);
        collision15_small_southPedestrain2 = 					(ImageView)collision15.findViewById(R.id.small_southPedestrain2);
        collision15_small_southNone1 = 					(ImageView)collision15.findViewById(R.id.small_southNone1);
        collision15_small_southNone2 = 	(ImageView)collision15.findViewById(R.id.small_southNone2);
        collision15_small_westLeft = 									(ImageView)collision15.findViewById(R.id.small_westLeft);
        collision15_small_westStriaght = 							(ImageView)collision15.findViewById(R.id.small_westStraight);
        collision15_small_westRight = 									(ImageView)collision15.findViewById(R.id.small_westRight);
        collision15_small_westOther = 									(ImageView)collision15.findViewById(R.id.small_westOther);
        collision15_small_westPedestrain1 = 						(ImageView)collision15.findViewById(R.id.small_westPedestrain1);
        collision15_small_westPedestrain2 = 						(ImageView)collision15.findViewById(R.id.small_westPedestrain2);
        collision15_small_westNone1 = 					(ImageView)collision15.findViewById(R.id.small_westNone1);
        collision15_small_westNone2 = 	(ImageView)collision15.findViewById(R.id.small_westNone2);
        collision16_small_northLeft = 									(ImageView)collision16.findViewById(R.id.small_northLeft);
        collision16_small_northStriaght = 							(ImageView)collision16.findViewById(R.id.small_northStraight);
        collision16_small_northRight = 								(ImageView)collision16.findViewById(R.id.small_northRight);
        collision16_small_northOther = 								(ImageView)collision16.findViewById(R.id.small_northOther);
        collision16_small_northPedestrain1 = 					(ImageView)collision16.findViewById(R.id.small_northPedestrain1);
        collision16_small_northPedestrain2 = 					(ImageView)collision16.findViewById(R.id.small_northPedestrain2);
        collision16_small_northNone1 = 					(ImageView)collision16.findViewById(R.id.small_northNone1);
        collision16_small_northNone2 = 	(ImageView)collision16.findViewById(R.id.small_northNone2);
        collision16_small_eastLeft = 									(ImageView)collision16.findViewById(R.id.small_eastLeft);
        collision16_small_eastStriaght = 							(ImageView)collision16.findViewById(R.id.small_eastStraight);
        collision16_small_eastRight = 									(ImageView)collision16.findViewById(R.id.small_eastRight);
        collision16_small_eastOther = 									(ImageView)collision16.findViewById(R.id.small_eastOther);
        collision16_small_eastPedestrain1 = 						(ImageView)collision16.findViewById(R.id.small_eastPedestrain1);
        collision16_small_eastPedestrain2 = 						(ImageView)collision16.findViewById(R.id.small_eastPedestrain2);
        collision16_small_eastNone1 = 					(ImageView)collision16.findViewById(R.id.small_eastNone1);
        collision16_small_eastNone2 = 	(ImageView)collision16.findViewById(R.id.small_eastNone2);
        collision16_small_southLeft = 									(ImageView)collision16.findViewById(R.id.small_southLeft);
        collision16_small_southStriaght = 							(ImageView)collision16.findViewById(R.id.small_southStraight);
        collision16_small_southRight = 								(ImageView)collision16.findViewById(R.id.small_southRight);
        collision16_small_southOther = 								(ImageView)collision16.findViewById(R.id.small_southOther);
        collision16_small_southPedestrain1 = 					(ImageView)collision16.findViewById(R.id.small_southPedestrain1);
        collision16_small_southPedestrain2 = 					(ImageView)collision16.findViewById(R.id.small_southPedestrain2);
        collision16_small_southNone1 = 					(ImageView)collision16.findViewById(R.id.small_southNone1);
        collision16_small_southNone2 = 	(ImageView)collision16.findViewById(R.id.small_southNone2);
        collision16_small_westLeft = 									(ImageView)collision16.findViewById(R.id.small_westLeft);
        collision16_small_westStriaght = 							(ImageView)collision16.findViewById(R.id.small_westStraight);
        collision16_small_westRight = 									(ImageView)collision16.findViewById(R.id.small_westRight);
        collision16_small_westOther = 									(ImageView)collision16.findViewById(R.id.small_westOther);
        collision16_small_westPedestrain1 = 						(ImageView)collision16.findViewById(R.id.small_westPedestrain1);
        collision16_small_westPedestrain2 = 						(ImageView)collision16.findViewById(R.id.small_westPedestrain2);
        collision16_small_westNone1 = 					(ImageView)collision16.findViewById(R.id.small_westNone1);
        collision16_small_westNone2 = 	(ImageView)collision16.findViewById(R.id.small_westNone2);
        collision17_small_northLeft = 									(ImageView)collision17.findViewById(R.id.small_northLeft);
        collision17_small_northStriaght = 							(ImageView)collision17.findViewById(R.id.small_northStraight);
        collision17_small_northRight = 									(ImageView)collision17.findViewById(R.id.small_northRight);
        collision17_small_northOther = 									(ImageView)collision17.findViewById(R.id.small_northOther);
        collision17_small_northPedestrain1 = 						(ImageView)collision17.findViewById(R.id.small_northPedestrain1);
        collision17_small_northPedestrain2 = 						(ImageView)collision17.findViewById(R.id.small_northPedestrain2);
        collision17_small_northNone1 = 					(ImageView)collision17.findViewById(R.id.small_northNone1);
        collision17_small_northNone2 = 	(ImageView)collision17.findViewById(R.id.small_northNone2);
        collision17_small_eastLeft = 										(ImageView)collision17.findViewById(R.id.small_eastLeft);
        collision17_small_eastStriaght = 								(ImageView)collision17.findViewById(R.id.small_eastStraight);
        collision17_small_eastRight = 									(ImageView)collision17.findViewById(R.id.small_eastRight);
        collision17_small_eastOther = 									(ImageView)collision17.findViewById(R.id.small_eastOther);
        collision17_small_eastPedestrain1 = 						(ImageView)collision17.findViewById(R.id.small_eastPedestrain1);
        collision17_small_eastPedestrain2 = 						(ImageView)collision17.findViewById(R.id.small_eastPedestrain2);
        collision17_small_eastNone1 = 						(ImageView)collision17.findViewById(R.id.small_eastNone1);
        collision17_small_eastNone2 = 		(ImageView)collision17.findViewById(R.id.small_eastNone2);
        collision17_small_southLeft = 									(ImageView)collision17.findViewById(R.id.small_southLeft);
        collision17_small_southStriaght = 							(ImageView)collision17.findViewById(R.id.small_southStraight);
        collision17_small_southRight = 									(ImageView)collision17.findViewById(R.id.small_southRight);
        collision17_small_southOther = 									(ImageView)collision17.findViewById(R.id.small_southOther);
        collision17_small_southPedestrain1 = 						(ImageView)collision17.findViewById(R.id.small_southPedestrain1);
        collision17_small_southPedestrain2 = 						(ImageView)collision17.findViewById(R.id.small_southPedestrain2);
        collision17_small_southNone1 = 					(ImageView)collision17.findViewById(R.id.small_southNone1);
        collision17_small_southNone2 = 	(ImageView)collision17.findViewById(R.id.small_southNone2);
        collision17_small_westLeft = 										(ImageView)collision17.findViewById(R.id.small_westLeft);
        collision17_small_westStriaght = 								(ImageView)collision17.findViewById(R.id.small_westStraight);
        collision17_small_westRight = 									(ImageView)collision17.findViewById(R.id.small_westRight);
        collision17_small_westOther = 									(ImageView)collision17.findViewById(R.id.small_westOther);
        collision17_small_westPedestrain1 = 						(ImageView)collision17.findViewById(R.id.small_westPedestrain1);
        collision17_small_westPedestrain2 = 						(ImageView)collision17.findViewById(R.id.small_westPedestrain2);
        collision17_small_westNone1 = 					(ImageView)collision17.findViewById(R.id.small_westNone1);
        collision17_small_westNone2 = 	(ImageView)collision17.findViewById(R.id.small_westNone2);
        collision18_small_northLeft = 									(ImageView)collision18.findViewById(R.id.small_northLeft);
        collision18_small_northStriaght = 							(ImageView)collision18.findViewById(R.id.small_northStraight);
        collision18_small_northRight = 								(ImageView)collision18.findViewById(R.id.small_northRight);
        collision18_small_northOther = 								(ImageView)collision18.findViewById(R.id.small_northOther);
        collision18_small_northPedestrain1 = 					(ImageView)collision18.findViewById(R.id.small_northPedestrain1);
        collision18_small_northPedestrain2 = 					(ImageView)collision18.findViewById(R.id.small_northPedestrain2);
        collision18_small_northNone1 = 					(ImageView)collision18.findViewById(R.id.small_northNone1);
        collision18_small_northNone2 = 	(ImageView)collision18.findViewById(R.id.small_northNone2);
        collision18_small_eastLeft = 									(ImageView)collision18.findViewById(R.id.small_eastLeft);
        collision18_small_eastStriaght = 							(ImageView)collision18.findViewById(R.id.small_eastStraight);
        collision18_small_eastRight = 									(ImageView)collision18.findViewById(R.id.small_eastRight);
        collision18_small_eastOther = 									(ImageView)collision18.findViewById(R.id.small_eastOther);
        collision18_small_eastPedestrain1 = 						(ImageView)collision18.findViewById(R.id.small_eastPedestrain1);
        collision18_small_eastPedestrain2 = 						(ImageView)collision18.findViewById(R.id.small_eastPedestrain2);
        collision18_small_eastNone1 = 					(ImageView)collision18.findViewById(R.id.small_eastNone1);
        collision18_small_eastNone2 = 	(ImageView)collision18.findViewById(R.id.small_eastNone2);
        collision18_small_southLeft = 									(ImageView)collision18.findViewById(R.id.small_southLeft);
        collision18_small_southStriaght = 							(ImageView)collision18.findViewById(R.id.small_southStraight);
        collision18_small_southRight = 								(ImageView)collision18.findViewById(R.id.small_southRight);
        collision18_small_southOther = 								(ImageView)collision18.findViewById(R.id.small_southOther);
        collision18_small_southPedestrain1 = 					(ImageView)collision18.findViewById(R.id.small_southPedestrain1);
        collision18_small_southPedestrain2 = 					(ImageView)collision18.findViewById(R.id.small_southPedestrain2);
        collision18_small_southNone1 = 					(ImageView)collision18.findViewById(R.id.small_southNone1);
        collision18_small_southNone2 = 	(ImageView)collision18.findViewById(R.id.small_southNone2);
        collision18_small_westLeft = 									(ImageView)collision18.findViewById(R.id.small_westLeft);
        collision18_small_westStriaght = 							(ImageView)collision18.findViewById(R.id.small_westStraight);
        collision18_small_westRight = 									(ImageView)collision18.findViewById(R.id.small_westRight);
        collision18_small_westOther = 									(ImageView)collision18.findViewById(R.id.small_westOther);
        collision18_small_westPedestrain1 = 						(ImageView)collision18.findViewById(R.id.small_westPedestrain1);
        collision18_small_westPedestrain2 = 						(ImageView)collision18.findViewById(R.id.small_westPedestrain2);
        collision18_small_westNone1 = 					(ImageView)collision18.findViewById(R.id.small_westNone1);
        collision18_small_westNone2 = 	(ImageView)collision18.findViewById(R.id.small_westNone2);
        collision19_small_northLeft = 									(ImageView)collision19.findViewById(R.id.small_northLeft);
        collision19_small_northStriaght = 							(ImageView)collision19.findViewById(R.id.small_northStraight);
        collision19_small_northRight = 								(ImageView)collision19.findViewById(R.id.small_northRight);
        collision19_small_northOther = 								(ImageView)collision19.findViewById(R.id.small_northOther);
        collision19_small_northPedestrain1 = 					(ImageView)collision19.findViewById(R.id.small_northPedestrain1);
        collision19_small_northPedestrain2 = 					(ImageView)collision19.findViewById(R.id.small_northPedestrain2);
        collision19_small_northNone1 = 					(ImageView)collision19.findViewById(R.id.small_northNone1);
        collision19_small_northNone2 = 	(ImageView)collision19.findViewById(R.id.small_northNone2);
        collision19_small_eastLeft = 									(ImageView)collision19.findViewById(R.id.small_eastLeft);
        collision19_small_eastStriaght = 							(ImageView)collision19.findViewById(R.id.small_eastStraight);
        collision19_small_eastRight = 									(ImageView)collision19.findViewById(R.id.small_eastRight);
        collision19_small_eastOther = 									(ImageView)collision19.findViewById(R.id.small_eastOther);
        collision19_small_eastPedestrain1 = 						(ImageView)collision19.findViewById(R.id.small_eastPedestrain1);
        collision19_small_eastPedestrain2 = 						(ImageView)collision19.findViewById(R.id.small_eastPedestrain2);
        collision19_small_eastNone1 = 					(ImageView)collision19.findViewById(R.id.small_eastNone1);
        collision19_small_eastNone2 = 	(ImageView)collision19.findViewById(R.id.small_eastNone2);
        collision19_small_southLeft = 									(ImageView)collision19.findViewById(R.id.small_southLeft);
        collision19_small_southStriaght = 							(ImageView)collision19.findViewById(R.id.small_southStraight);
        collision19_small_southRight = 								(ImageView)collision19.findViewById(R.id.small_southRight);
        collision19_small_southOther = 								(ImageView)collision19.findViewById(R.id.small_southOther);
        collision19_small_southPedestrain1 = 					(ImageView)collision19.findViewById(R.id.small_southPedestrain1);
        collision19_small_southPedestrain2 = 					(ImageView)collision19.findViewById(R.id.small_southPedestrain2);
        collision19_small_southNone1 = 					(ImageView)collision19.findViewById(R.id.small_southNone1);
        collision19_small_southNone2 = 	(ImageView)collision19.findViewById(R.id.small_southNone2);
        collision19_small_westLeft = 									(ImageView)collision19.findViewById(R.id.small_westLeft);
        collision19_small_westStriaght = 							(ImageView)collision19.findViewById(R.id.small_westStraight);
        collision19_small_westRight = 									(ImageView)collision19.findViewById(R.id.small_westRight);
        collision19_small_westOther = 									(ImageView)collision19.findViewById(R.id.small_westOther);
        collision19_small_westPedestrain1 = 						(ImageView)collision19.findViewById(R.id.small_westPedestrain1);
        collision19_small_westPedestrain2 = 						(ImageView)collision19.findViewById(R.id.small_westPedestrain2);
        collision19_small_westNone1 = 					(ImageView)collision19.findViewById(R.id.small_westNone1);
        collision19_small_westNone2 = 	(ImageView)collision19.findViewById(R.id.small_westNone2);
        collision20_small_northLeft = 									(ImageView)collision20.findViewById(R.id.small_northLeft);
        collision20_small_northStriaght = 							(ImageView)collision20.findViewById(R.id.small_northStraight);
        collision20_small_northRight = 								(ImageView)collision20.findViewById(R.id.small_northRight);
        collision20_small_northOther = 								(ImageView)collision20.findViewById(R.id.small_northOther);
        collision20_small_northPedestrain1 = 					(ImageView)collision20.findViewById(R.id.small_northPedestrain1);
        collision20_small_northPedestrain2 = 					(ImageView)collision20.findViewById(R.id.small_northPedestrain2);
        collision20_small_northNone1 = 					(ImageView)collision20.findViewById(R.id.small_northNone1);
        collision20_small_northNone2 = 	(ImageView)collision20.findViewById(R.id.small_northNone2);
        collision20_small_eastLeft = 									(ImageView)collision20.findViewById(R.id.small_eastLeft);
        collision20_small_eastStriaght = 							(ImageView)collision20.findViewById(R.id.small_eastStraight);
        collision20_small_eastRight = 									(ImageView)collision20.findViewById(R.id.small_eastRight);
        collision20_small_eastOther = 									(ImageView)collision20.findViewById(R.id.small_eastOther);
        collision20_small_eastPedestrain1 = 						(ImageView)collision20.findViewById(R.id.small_eastPedestrain1);
        collision20_small_eastPedestrain2 = 						(ImageView)collision20.findViewById(R.id.small_eastPedestrain2);
        collision20_small_eastNone1 = 					(ImageView)collision20.findViewById(R.id.small_eastNone1);
        collision20_small_eastNone2 = 	(ImageView)collision20.findViewById(R.id.small_eastNone2);
        collision20_small_southLeft = 									(ImageView)collision20.findViewById(R.id.small_southLeft);
        collision20_small_southStriaght = 							(ImageView)collision20.findViewById(R.id.small_southStraight);
        collision20_small_southRight = 								(ImageView)collision20.findViewById(R.id.small_southRight);
        collision20_small_southOther = 								(ImageView)collision20.findViewById(R.id.small_southOther);
        collision20_small_southPedestrain1 = 					(ImageView)collision20.findViewById(R.id.small_southPedestrain1);
        collision20_small_southPedestrain2 = 					(ImageView)collision20.findViewById(R.id.small_southPedestrain2);
        collision20_small_southNone1 = 					(ImageView)collision20.findViewById(R.id.small_southNone1);
        collision20_small_southNone2 = 	(ImageView)collision20.findViewById(R.id.small_southNone2);
        collision20_small_westLeft = 									(ImageView)collision20.findViewById(R.id.small_westLeft);
        collision20_small_westStriaght = 							(ImageView)collision20.findViewById(R.id.small_westStraight);
        collision20_small_westRight = 									(ImageView)collision20.findViewById(R.id.small_westRight);
        collision20_small_westOther = 									(ImageView)collision20.findViewById(R.id.small_westOther);
        collision20_small_westPedestrain1 = 						(ImageView)collision20.findViewById(R.id.small_westPedestrain1);
        collision20_small_westPedestrain2 = 						(ImageView)collision20.findViewById(R.id.small_westPedestrain2);
        collision20_small_westNone1 = 					(ImageView)collision20.findViewById(R.id.small_westNone1);
        collision20_small_westNone2 = 	(ImageView)collision20.findViewById(R.id.small_westNone2);
        collision21_small_northLeft = 									(ImageView)collision21.findViewById(R.id.small_northLeft);
        collision21_small_northStriaght = 							(ImageView)collision21.findViewById(R.id.small_northStraight);
        collision21_small_northRight = 								(ImageView)collision21.findViewById(R.id.small_northRight);
        collision21_small_northOther = 								(ImageView)collision21.findViewById(R.id.small_northOther);
        collision21_small_northPedestrain1 = 					(ImageView)collision21.findViewById(R.id.small_northPedestrain1);
        collision21_small_northPedestrain2 = 					(ImageView)collision21.findViewById(R.id.small_northPedestrain2);
        collision21_small_northNone1 = 					(ImageView)collision21.findViewById(R.id.small_northNone1);
        collision21_small_northNone2 = 	(ImageView)collision21.findViewById(R.id.small_northNone2);
        collision21_small_eastLeft = 									(ImageView)collision21.findViewById(R.id.small_eastLeft);
        collision21_small_eastStriaght = 							(ImageView)collision21.findViewById(R.id.small_eastStraight);
        collision21_small_eastRight = 									(ImageView)collision21.findViewById(R.id.small_eastRight);
        collision21_small_eastOther = 									(ImageView)collision21.findViewById(R.id.small_eastOther);
        collision21_small_eastPedestrain1 = 						(ImageView)collision21.findViewById(R.id.small_eastPedestrain1);
        collision21_small_eastPedestrain2 = 						(ImageView)collision21.findViewById(R.id.small_eastPedestrain2);
        collision21_small_eastNone1 = 					(ImageView)collision21.findViewById(R.id.small_eastNone1);
        collision21_small_eastNone2 = 	(ImageView)collision21.findViewById(R.id.small_eastNone2);
        collision21_small_southLeft = 									(ImageView)collision21.findViewById(R.id.small_southLeft);
        collision21_small_southStriaght = 							(ImageView)collision21.findViewById(R.id.small_southStraight);
        collision21_small_southRight = 								(ImageView)collision21.findViewById(R.id.small_southRight);
        collision21_small_southOther = 								(ImageView)collision21.findViewById(R.id.small_southOther);
        collision21_small_southPedestrain1 = 					(ImageView)collision21.findViewById(R.id.small_southPedestrain1);
        collision21_small_southPedestrain2 = 					(ImageView)collision21.findViewById(R.id.small_southPedestrain2);
        collision21_small_southNone1 = 					(ImageView)collision21.findViewById(R.id.small_southNone1);
        collision21_small_southNone2 = 	(ImageView)collision21.findViewById(R.id.small_southNone2);
        collision21_small_westLeft = 									(ImageView)collision21.findViewById(R.id.small_westLeft);
        collision21_small_westStriaght = 							(ImageView)collision21.findViewById(R.id.small_westStraight);
        collision21_small_westRight = 									(ImageView)collision21.findViewById(R.id.small_westRight);
        collision21_small_westOther = 									(ImageView)collision21.findViewById(R.id.small_westOther);
        collision21_small_westPedestrain1 = 						(ImageView)collision21.findViewById(R.id.small_westPedestrain1);
        collision21_small_westPedestrain2 = 						(ImageView)collision21.findViewById(R.id.small_westPedestrain2);
        collision21_small_westNone1 = 					(ImageView)collision21.findViewById(R.id.small_westNone1);
        collision21_small_westNone2 = 	(ImageView)collision21.findViewById(R.id.small_westNone2);
        collision22_small_northLeft = 									(ImageView)collision22.findViewById(R.id.small_northLeft);
        collision22_small_northStriaght = 							(ImageView)collision22.findViewById(R.id.small_northStraight);
        collision22_small_northRight = 								(ImageView)collision22.findViewById(R.id.small_northRight);
        collision22_small_northOther = 								(ImageView)collision22.findViewById(R.id.small_northOther);
        collision22_small_northPedestrain1 = 					(ImageView)collision22.findViewById(R.id.small_northPedestrain1);
        collision22_small_northPedestrain2 = 					(ImageView)collision22.findViewById(R.id.small_northPedestrain2);
        collision22_small_northNone1 = 					(ImageView)collision22.findViewById(R.id.small_northNone1);
        collision22_small_northNone2 = 	(ImageView)collision22.findViewById(R.id.small_northNone2);
        collision22_small_eastLeft = 									(ImageView)collision22.findViewById(R.id.small_eastLeft);
        collision22_small_eastStriaght = 							(ImageView)collision22.findViewById(R.id.small_eastStraight);
        collision22_small_eastRight = 									(ImageView)collision22.findViewById(R.id.small_eastRight);
        collision22_small_eastOther = 									(ImageView)collision22.findViewById(R.id.small_eastOther);
        collision22_small_eastPedestrain1 = 						(ImageView)collision22.findViewById(R.id.small_eastPedestrain1);
        collision22_small_eastPedestrain2 = 						(ImageView)collision22.findViewById(R.id.small_eastPedestrain2);
        collision22_small_eastNone1 = 					(ImageView)collision22.findViewById(R.id.small_eastNone1);
        collision22_small_eastNone2 = 	(ImageView)collision22.findViewById(R.id.small_eastNone2);
        collision22_small_southLeft = 									(ImageView)collision22.findViewById(R.id.small_southLeft);
        collision22_small_southStriaght = 							(ImageView)collision22.findViewById(R.id.small_southStraight);
        collision22_small_southRight = 								(ImageView)collision22.findViewById(R.id.small_southRight);
        collision22_small_southOther = 								(ImageView)collision22.findViewById(R.id.small_southOther);
        collision22_small_southPedestrain1 = 					(ImageView)collision22.findViewById(R.id.small_southPedestrain1);
        collision22_small_southPedestrain2 = 					(ImageView)collision22.findViewById(R.id.small_southPedestrain2);
        collision22_small_southNone1 = 					(ImageView)collision22.findViewById(R.id.small_southNone1);
        collision22_small_southNone2 = 	(ImageView)collision22.findViewById(R.id.small_southNone2);
        collision22_small_westLeft = 									(ImageView)collision22.findViewById(R.id.small_westLeft);
        collision22_small_westStriaght = 							(ImageView)collision22.findViewById(R.id.small_westStraight);
        collision22_small_westRight = 									(ImageView)collision22.findViewById(R.id.small_westRight);
        collision22_small_westOther = 									(ImageView)collision22.findViewById(R.id.small_westOther);
        collision22_small_westPedestrain1 = 						(ImageView)collision22.findViewById(R.id.small_westPedestrain1);
        collision22_small_westPedestrain2 = 						(ImageView)collision22.findViewById(R.id.small_westPedestrain2);
        collision22_small_westNone1 = 					(ImageView)collision22.findViewById(R.id.small_westNone1);
        collision22_small_westNone2 = 	(ImageView)collision22.findViewById(R.id.small_westNone2);
        collision23_small_northLeft = 									(ImageView)collision23.findViewById(R.id.small_northLeft);
        collision23_small_northStriaght = 							(ImageView)collision23.findViewById(R.id.small_northStraight);
        collision23_small_northRight = 								(ImageView)collision23.findViewById(R.id.small_northRight);
        collision23_small_northOther = 								(ImageView)collision23.findViewById(R.id.small_northOther);
        collision23_small_northPedestrain1 = 					(ImageView)collision23.findViewById(R.id.small_northPedestrain1);
        collision23_small_northPedestrain2 = 					(ImageView)collision23.findViewById(R.id.small_northPedestrain2);
        collision23_small_northNone1 = 					(ImageView)collision23.findViewById(R.id.small_northNone1);
        collision23_small_northNone2 = 	(ImageView)collision23.findViewById(R.id.small_northNone2);
        collision23_small_eastLeft = 									(ImageView)collision23.findViewById(R.id.small_eastLeft);
        collision23_small_eastStriaght = 							(ImageView)collision23.findViewById(R.id.small_eastStraight);
        collision23_small_eastRight = 									(ImageView)collision23.findViewById(R.id.small_eastRight);
        collision23_small_eastOther = 									(ImageView)collision23.findViewById(R.id.small_eastOther);
        collision23_small_eastPedestrain1 = 						(ImageView)collision23.findViewById(R.id.small_eastPedestrain1);
        collision23_small_eastPedestrain2 = 						(ImageView)collision23.findViewById(R.id.small_eastPedestrain2);
        collision23_small_eastNone1 = 					(ImageView)collision23.findViewById(R.id.small_eastNone1);
        collision23_small_eastNone2 = 	(ImageView)collision23.findViewById(R.id.small_eastNone2);
        collision23_small_southLeft = 									(ImageView)collision23.findViewById(R.id.small_southLeft);
        collision23_small_southStriaght = 							(ImageView)collision23.findViewById(R.id.small_southStraight);
        collision23_small_southRight = 								(ImageView)collision23.findViewById(R.id.small_southRight);
        collision23_small_southOther = 								(ImageView)collision23.findViewById(R.id.small_southOther);
        collision23_small_southPedestrain1 = 					(ImageView)collision23.findViewById(R.id.small_southPedestrain1);
        collision23_small_southPedestrain2 = 					(ImageView)collision23.findViewById(R.id.small_southPedestrain2);
        collision23_small_southNone1 = 					(ImageView)collision23.findViewById(R.id.small_southNone1);
        collision23_small_southNone2 = 	(ImageView)collision23.findViewById(R.id.small_southNone2);
        collision23_small_westLeft = 									(ImageView)collision23.findViewById(R.id.small_westLeft);
        collision23_small_westStriaght = 							(ImageView)collision23.findViewById(R.id.small_westStraight);
        collision23_small_westRight = 									(ImageView)collision23.findViewById(R.id.small_westRight);
        collision23_small_westOther = 									(ImageView)collision23.findViewById(R.id.small_westOther);
        collision23_small_westPedestrain1 = 						(ImageView)collision23.findViewById(R.id.small_westPedestrain1);
        collision23_small_westPedestrain2 = 						(ImageView)collision23.findViewById(R.id.small_westPedestrain2);
        collision23_small_westNone1 = 					(ImageView)collision23.findViewById(R.id.small_westNone1);
        collision23_small_westNone2 = 	(ImageView)collision23.findViewById(R.id.small_westNone2);
        collision24_small_northLeft = 									(ImageView)collision24.findViewById(R.id.small_northLeft);
        collision24_small_northStriaght = 							(ImageView)collision24.findViewById(R.id.small_northStraight);
        collision24_small_northRight = 								(ImageView)collision24.findViewById(R.id.small_northRight);
        collision24_small_northOther = 								(ImageView)collision24.findViewById(R.id.small_northOther);
        collision24_small_northPedestrain1 = 					(ImageView)collision24.findViewById(R.id.small_northPedestrain1);
        collision24_small_northPedestrain2 = 					(ImageView)collision24.findViewById(R.id.small_northPedestrain2);
        collision24_small_northNone1 = 					(ImageView)collision24.findViewById(R.id.small_northNone1);
        collision24_small_northNone2 = 	(ImageView)collision24.findViewById(R.id.small_northNone2);
        collision24_small_eastLeft = 									(ImageView)collision24.findViewById(R.id.small_eastLeft);
        collision24_small_eastStriaght = 							(ImageView)collision24.findViewById(R.id.small_eastStraight);
        collision24_small_eastRight = 									(ImageView)collision24.findViewById(R.id.small_eastRight);
        collision24_small_eastOther = 									(ImageView)collision24.findViewById(R.id.small_eastOther);
        collision24_small_eastPedestrain1 = 						(ImageView)collision24.findViewById(R.id.small_eastPedestrain1);
        collision24_small_eastPedestrain2 = 						(ImageView)collision24.findViewById(R.id.small_eastPedestrain2);
        collision24_small_eastNone1 = 					(ImageView)collision24.findViewById(R.id.small_eastNone1);
        collision24_small_eastNone2 = 	(ImageView)collision24.findViewById(R.id.small_eastNone2);
        collision24_small_southLeft = 									(ImageView)collision24.findViewById(R.id.small_southLeft);
        collision24_small_southStriaght = 							(ImageView)collision24.findViewById(R.id.small_southStraight);
        collision24_small_southRight = 								(ImageView)collision24.findViewById(R.id.small_southRight);
        collision24_small_southOther = 								(ImageView)collision24.findViewById(R.id.small_southOther);
        collision24_small_southPedestrain1 = 					(ImageView)collision24.findViewById(R.id.small_southPedestrain1);
        collision24_small_southPedestrain2 = 					(ImageView)collision24.findViewById(R.id.small_southPedestrain2);
        collision24_small_southNone1 = 					(ImageView)collision24.findViewById(R.id.small_southNone1);
        collision24_small_southNone2 = 	(ImageView)collision24.findViewById(R.id.small_southNone2);
        collision24_small_westLeft = 									(ImageView)collision24.findViewById(R.id.small_westLeft);
        collision24_small_westStriaght = 							(ImageView)collision24.findViewById(R.id.small_westStraight);
        collision24_small_westRight = 									(ImageView)collision24.findViewById(R.id.small_westRight);
        collision24_small_westOther = 									(ImageView)collision24.findViewById(R.id.small_westOther);
        collision24_small_westPedestrain1 = 						(ImageView)collision24.findViewById(R.id.small_westPedestrain1);
        collision24_small_westPedestrain2 = 						(ImageView)collision24.findViewById(R.id.small_westPedestrain2);
        collision24_small_westNone1 = 					(ImageView)collision24.findViewById(R.id.small_westNone1);
        collision24_small_westNone2 = 	(ImageView)collision24.findViewById(R.id.small_westNone2);
        collision25_small_northLeft = 									(ImageView)collision25.findViewById(R.id.small_northLeft);
        collision25_small_northStriaght = 							(ImageView)collision25.findViewById(R.id.small_northStraight);
        collision25_small_northRight = 								(ImageView)collision25.findViewById(R.id.small_northRight);
        collision25_small_northOther = 								(ImageView)collision25.findViewById(R.id.small_northOther);
        collision25_small_northPedestrain1 = 					(ImageView)collision25.findViewById(R.id.small_northPedestrain1);
        collision25_small_northPedestrain2 = 					(ImageView)collision25.findViewById(R.id.small_northPedestrain2);
        collision25_small_northNone1 = 					(ImageView)collision25.findViewById(R.id.small_northNone1);
        collision25_small_northNone2 = 	(ImageView)collision25.findViewById(R.id.small_northNone2);
        collision25_small_eastLeft = 									(ImageView)collision25.findViewById(R.id.small_eastLeft);
        collision25_small_eastStriaght = 							(ImageView)collision25.findViewById(R.id.small_eastStraight);
        collision25_small_eastRight = 									(ImageView)collision25.findViewById(R.id.small_eastRight);
        collision25_small_eastOther = 									(ImageView)collision25.findViewById(R.id.small_eastOther);
        collision25_small_eastPedestrain1 = 						(ImageView)collision25.findViewById(R.id.small_eastPedestrain1);
        collision25_small_eastPedestrain2 = 						(ImageView)collision25.findViewById(R.id.small_eastPedestrain2);
        collision25_small_eastNone1 = 					(ImageView)collision25.findViewById(R.id.small_eastNone1);
        collision25_small_eastNone2 = 	(ImageView)collision25.findViewById(R.id.small_eastNone2);
        collision25_small_southLeft = 									(ImageView)collision25.findViewById(R.id.small_southLeft);
        collision25_small_southStriaght = 							(ImageView)collision25.findViewById(R.id.small_southStraight);
        collision25_small_southRight = 								(ImageView)collision25.findViewById(R.id.small_southRight);
        collision25_small_southOther = 								(ImageView)collision25.findViewById(R.id.small_southOther);
        collision25_small_southPedestrain1 = 					(ImageView)collision25.findViewById(R.id.small_southPedestrain1);
        collision25_small_southPedestrain2 = 					(ImageView)collision25.findViewById(R.id.small_southPedestrain2);
        collision25_small_southNone1 = 					(ImageView)collision25.findViewById(R.id.small_southNone1);
        collision25_small_southNone2 = 	(ImageView)collision25.findViewById(R.id.small_southNone2);
        collision25_small_westLeft = 									(ImageView)collision25.findViewById(R.id.small_westLeft);
        collision25_small_westStriaght = 							(ImageView)collision25.findViewById(R.id.small_westStraight);
        collision25_small_westRight = 									(ImageView)collision25.findViewById(R.id.small_westRight);
        collision25_small_westOther = 									(ImageView)collision25.findViewById(R.id.small_westOther);
        collision25_small_westPedestrain1 = 						(ImageView)collision25.findViewById(R.id.small_westPedestrain1);
        collision25_small_westPedestrain2 = 						(ImageView)collision25.findViewById(R.id.small_westPedestrain2);
        collision25_small_westNone1 = 					(ImageView)collision25.findViewById(R.id.small_westNone1);
        collision25_small_westNone2 = 	(ImageView)collision25.findViewById(R.id.small_westNone2);
        collision26_small_northLeft = 									(ImageView)collision26.findViewById(R.id.small_northLeft);
        collision26_small_northStriaght = 							(ImageView)collision26.findViewById(R.id.small_northStraight);
        collision26_small_northRight = 									(ImageView)collision26.findViewById(R.id.small_northRight);
        collision26_small_northOther = 									(ImageView)collision26.findViewById(R.id.small_northOther);
        collision26_small_northPedestrain1 = 						(ImageView)collision26.findViewById(R.id.small_northPedestrain1);
        collision26_small_northPedestrain2 = 						(ImageView)collision26.findViewById(R.id.small_northPedestrain2);
        collision26_small_northNone1 = 					(ImageView)collision26.findViewById(R.id.small_northNone1);
        collision26_small_northNone2 = 	(ImageView)collision26.findViewById(R.id.small_northNone2);
        collision26_small_eastLeft = 										(ImageView)collision26.findViewById(R.id.small_eastLeft);
        collision26_small_eastStriaght = 								(ImageView)collision26.findViewById(R.id.small_eastStraight);
        collision26_small_eastRight = 									(ImageView)collision26.findViewById(R.id.small_eastRight);
        collision26_small_eastOther = 									(ImageView)collision26.findViewById(R.id.small_eastOther);
        collision26_small_eastPedestrain1 = 						(ImageView)collision26.findViewById(R.id.small_eastPedestrain1);
        collision26_small_eastPedestrain2 = 						(ImageView)collision26.findViewById(R.id.small_eastPedestrain2);
        collision26_small_eastNone1 = 						(ImageView)collision26.findViewById(R.id.small_eastNone1);
        collision26_small_eastNone2 = 		(ImageView)collision26.findViewById(R.id.small_eastNone2);
        collision26_small_southLeft = 									(ImageView)collision26.findViewById(R.id.small_southLeft);
        collision26_small_southStriaght = 							(ImageView)collision26.findViewById(R.id.small_southStraight);
        collision26_small_southRight = 									(ImageView)collision26.findViewById(R.id.small_southRight);
        collision26_small_southOther = 									(ImageView)collision26.findViewById(R.id.small_southOther);
        collision26_small_southPedestrain1 = 						(ImageView)collision26.findViewById(R.id.small_southPedestrain1);
        collision26_small_southPedestrain2 = 						(ImageView)collision26.findViewById(R.id.small_southPedestrain2);
        collision26_small_southNone1 = 					(ImageView)collision26.findViewById(R.id.small_southNone1);
        collision26_small_southNone2 = 	(ImageView)collision26.findViewById(R.id.small_southNone2);
        collision26_small_westLeft = 										(ImageView)collision26.findViewById(R.id.small_westLeft);
        collision26_small_westStriaght = 								(ImageView)collision26.findViewById(R.id.small_westStraight);
        collision26_small_westRight = 									(ImageView)collision26.findViewById(R.id.small_westRight);
        collision26_small_westOther = 									(ImageView)collision26.findViewById(R.id.small_westOther);
        collision26_small_westPedestrain1 = 						(ImageView)collision26.findViewById(R.id.small_westPedestrain1);
        collision26_small_westPedestrain2 = 						(ImageView)collision26.findViewById(R.id.small_westPedestrain2);
        collision26_small_westNone1 = 						(ImageView)collision26.findViewById(R.id.small_westNone1);
        collision26_small_westNone2 = 		(ImageView)collision26.findViewById(R.id.small_westNone2);
        collision27_small_northLeft = 									(ImageView)collision27.findViewById(R.id.small_northLeft);
        collision27_small_northStriaght = 							(ImageView)collision27.findViewById(R.id.small_northStraight);
        collision27_small_northRight = 									(ImageView)collision27.findViewById(R.id.small_northRight);
        collision27_small_northOther = 									(ImageView)collision27.findViewById(R.id.small_northOther);
        collision27_small_northPedestrain1 = 						(ImageView)collision27.findViewById(R.id.small_northPedestrain1);
        collision27_small_northPedestrain2 = 						(ImageView)collision27.findViewById(R.id.small_northPedestrain2);
        collision27_small_northNone1 = 					(ImageView)collision27.findViewById(R.id.small_northNone1);
        collision27_small_northNone2 = 	(ImageView)collision27.findViewById(R.id.small_northNone2);
        collision27_small_eastLeft = 										(ImageView)collision27.findViewById(R.id.small_eastLeft);
        collision27_small_eastStriaght = 								(ImageView)collision27.findViewById(R.id.small_eastStraight);
        collision27_small_eastRight = 									(ImageView)collision27.findViewById(R.id.small_eastRight);
        collision27_small_eastOther = 									(ImageView)collision27.findViewById(R.id.small_eastOther);
        collision27_small_eastPedestrain1 = 						(ImageView)collision27.findViewById(R.id.small_eastPedestrain1);
        collision27_small_eastPedestrain2 = 						(ImageView)collision27.findViewById(R.id.small_eastPedestrain2);
        collision27_small_eastNone1 = 						(ImageView)collision27.findViewById(R.id.small_eastNone1);
        collision27_small_eastNone2 = 		(ImageView)collision27.findViewById(R.id.small_eastNone2);
        collision27_small_southLeft = 									(ImageView)collision27.findViewById(R.id.small_southLeft);
        collision27_small_southStriaght = 							(ImageView)collision27.findViewById(R.id.small_southStraight);
        collision27_small_southRight = 									(ImageView)collision27.findViewById(R.id.small_southRight);
        collision27_small_southOther = 									(ImageView)collision27.findViewById(R.id.small_southOther);
        collision27_small_southPedestrain1 = 						(ImageView)collision27.findViewById(R.id.small_southPedestrain1);
        collision27_small_southPedestrain2 = 						(ImageView)collision27.findViewById(R.id.small_southPedestrain2);
        collision27_small_southNone1 = 					(ImageView)collision27.findViewById(R.id.small_southNone1);
        collision27_small_southNone2 = 	(ImageView)collision27.findViewById(R.id.small_southNone2);
        collision27_small_westLeft = 										(ImageView)collision27.findViewById(R.id.small_westLeft);
        collision27_small_westStriaght = 								(ImageView)collision27.findViewById(R.id.small_westStraight);
        collision27_small_westRight = 									(ImageView)collision27.findViewById(R.id.small_westRight);
        collision27_small_westOther = 									(ImageView)collision27.findViewById(R.id.small_westOther);
        collision27_small_westPedestrain1 = 						(ImageView)collision27.findViewById(R.id.small_westPedestrain1);
        collision27_small_westPedestrain2 = 						(ImageView)collision27.findViewById(R.id.small_westPedestrain2);
        collision27_small_westNone1 = 						(ImageView)collision27.findViewById(R.id.small_westNone1);
        collision27_small_westNone2 = 		(ImageView)collision27.findViewById(R.id.small_westNone2);
        collision28_small_northLeft = 									(ImageView)collision28.findViewById(R.id.small_northLeft);
        collision28_small_northStriaght = 							(ImageView)collision28.findViewById(R.id.small_northStraight);
        collision28_small_northRight = 									(ImageView)collision28.findViewById(R.id.small_northRight);
        collision28_small_northOther = 									(ImageView)collision28.findViewById(R.id.small_northOther);
        collision28_small_northPedestrain1 = 						(ImageView)collision28.findViewById(R.id.small_northPedestrain1);
        collision28_small_northPedestrain2 = 						(ImageView)collision28.findViewById(R.id.small_northPedestrain2);
        collision28_small_northNone1 = 					(ImageView)collision28.findViewById(R.id.small_northNone1);
        collision28_small_northNone2 = 	(ImageView)collision28.findViewById(R.id.small_northNone2);
        collision28_small_eastLeft = 										(ImageView)collision28.findViewById(R.id.small_eastLeft);
        collision28_small_eastStriaght = 								(ImageView)collision28.findViewById(R.id.small_eastStraight);
        collision28_small_eastRight = 									(ImageView)collision28.findViewById(R.id.small_eastRight);
        collision28_small_eastOther = 									(ImageView)collision28.findViewById(R.id.small_eastOther);
        collision28_small_eastPedestrain1 = 						(ImageView)collision28.findViewById(R.id.small_eastPedestrain1);
        collision28_small_eastPedestrain2 = 						(ImageView)collision28.findViewById(R.id.small_eastPedestrain2);
        collision28_small_eastNone1 = 						(ImageView)collision28.findViewById(R.id.small_eastNone1);
        collision28_small_eastNone2 = 		(ImageView)collision28.findViewById(R.id.small_eastNone2);
        collision28_small_southLeft = 									(ImageView)collision28.findViewById(R.id.small_southLeft);
        collision28_small_southStriaght = 							(ImageView)collision28.findViewById(R.id.small_southStraight);
        collision28_small_southRight = 									(ImageView)collision28.findViewById(R.id.small_southRight);
        collision28_small_southOther = 									(ImageView)collision28.findViewById(R.id.small_southOther);
        collision28_small_southPedestrain1 = 						(ImageView)collision28.findViewById(R.id.small_southPedestrain1);
        collision28_small_southPedestrain2 = 						(ImageView)collision28.findViewById(R.id.small_southPedestrain2);
        collision28_small_southNone1 = 					(ImageView)collision28.findViewById(R.id.small_southNone1);
        collision28_small_southNone2 = 	(ImageView)collision28.findViewById(R.id.small_southNone2);
        collision28_small_westLeft = 										(ImageView)collision28.findViewById(R.id.small_westLeft);
        collision28_small_westStriaght = 								(ImageView)collision28.findViewById(R.id.small_westStraight);
        collision28_small_westRight = 									(ImageView)collision28.findViewById(R.id.small_westRight);
        collision28_small_westOther = 									(ImageView)collision28.findViewById(R.id.small_westOther);
        collision28_small_westPedestrain1 = 						(ImageView)collision28.findViewById(R.id.small_westPedestrain1);
        collision28_small_westPedestrain2 = 						(ImageView)collision28.findViewById(R.id.small_westPedestrain2);
        collision28_small_westNone1 = 						(ImageView)collision28.findViewById(R.id.small_westNone1);
        collision28_small_westNone2 = 		(ImageView)collision28.findViewById(R.id.small_westNone2);
        collision29_small_northLeft = 									(ImageView)collision29.findViewById(R.id.small_northLeft);
        collision29_small_northStriaght = 							(ImageView)collision29.findViewById(R.id.small_northStraight);
        collision29_small_northRight = 									(ImageView)collision29.findViewById(R.id.small_northRight);
        collision29_small_northOther = 									(ImageView)collision29.findViewById(R.id.small_northOther);
        collision29_small_northPedestrain1 = 						(ImageView)collision29.findViewById(R.id.small_northPedestrain1);
        collision29_small_northPedestrain2 = 						(ImageView)collision29.findViewById(R.id.small_northPedestrain2);
        collision29_small_northNone1 = 					(ImageView)collision29.findViewById(R.id.small_northNone1);
        collision29_small_northNone2 = 	(ImageView)collision29.findViewById(R.id.small_northNone2);
        collision29_small_eastLeft = 										(ImageView)collision29.findViewById(R.id.small_eastLeft);
        collision29_small_eastStriaght = 								(ImageView)collision29.findViewById(R.id.small_eastStraight);
        collision29_small_eastRight = 									(ImageView)collision29.findViewById(R.id.small_eastRight);
        collision29_small_eastOther = 									(ImageView)collision29.findViewById(R.id.small_eastOther);
        collision29_small_eastPedestrain1 = 						(ImageView)collision29.findViewById(R.id.small_eastPedestrain1);
        collision29_small_eastPedestrain2 = 						(ImageView)collision29.findViewById(R.id.small_eastPedestrain2);
        collision29_small_eastNone1 = 						(ImageView)collision29.findViewById(R.id.small_eastNone1);
        collision29_small_eastNone2 = 		(ImageView)collision29.findViewById(R.id.small_eastNone2);
        collision29_small_southLeft = 									(ImageView)collision29.findViewById(R.id.small_southLeft);
        collision29_small_southStriaght = 							(ImageView)collision29.findViewById(R.id.small_southStraight);
        collision29_small_southRight = 									(ImageView)collision29.findViewById(R.id.small_southRight);
        collision29_small_southOther = 									(ImageView)collision29.findViewById(R.id.small_southOther);
        collision29_small_southPedestrain1 = 						(ImageView)collision29.findViewById(R.id.small_southPedestrain1);
        collision29_small_southPedestrain2 = 						(ImageView)collision29.findViewById(R.id.small_southPedestrain2);
        collision29_small_southNone1 = 					(ImageView)collision29.findViewById(R.id.small_southNone1);
        collision29_small_southNone2 = 	(ImageView)collision29.findViewById(R.id.small_southNone2);
        collision29_small_westLeft = 										(ImageView)collision29.findViewById(R.id.small_westLeft);
        collision29_small_westStriaght = 								(ImageView)collision29.findViewById(R.id.small_westStraight);
        collision29_small_westRight = 									(ImageView)collision29.findViewById(R.id.small_westRight);
        collision29_small_westOther = 									(ImageView)collision29.findViewById(R.id.small_westOther);
        collision29_small_westPedestrain1 = 						(ImageView)collision29.findViewById(R.id.small_westPedestrain1);
        collision29_small_westPedestrain2 = 						(ImageView)collision29.findViewById(R.id.small_westPedestrain2);
        collision29_small_westNone1 = 						(ImageView)collision29.findViewById(R.id.small_westNone1);
        collision29_small_westNone2 = 		(ImageView)collision29.findViewById(R.id.small_westNone2);
        collision30_small_northLeft = 									(ImageView)collision30.findViewById(R.id.small_northLeft);
        collision30_small_northStriaght = 							(ImageView)collision30.findViewById(R.id.small_northStraight);
        collision30_small_northRight = 									(ImageView)collision30.findViewById(R.id.small_northRight);
        collision30_small_northOther = 									(ImageView)collision30.findViewById(R.id.small_northOther);
        collision30_small_northPedestrain1 = 						(ImageView)collision30.findViewById(R.id.small_northPedestrain1);
        collision30_small_northPedestrain2 = 						(ImageView)collision30.findViewById(R.id.small_northPedestrain2);
        collision30_small_northNone1 = 					(ImageView)collision30.findViewById(R.id.small_northNone1);
        collision30_small_northNone2 = 	(ImageView)collision30.findViewById(R.id.small_northNone2);
        collision30_small_eastLeft = 										(ImageView)collision30.findViewById(R.id.small_eastLeft);
        collision30_small_eastStriaght = 								(ImageView)collision30.findViewById(R.id.small_eastStraight);
        collision30_small_eastRight = 									(ImageView)collision30.findViewById(R.id.small_eastRight);
        collision30_small_eastOther = 									(ImageView)collision30.findViewById(R.id.small_eastOther);
        collision30_small_eastPedestrain1 = 						(ImageView)collision30.findViewById(R.id.small_eastPedestrain1);
        collision30_small_eastPedestrain2 = 						(ImageView)collision30.findViewById(R.id.small_eastPedestrain2);
        collision30_small_eastNone1 = 						(ImageView)collision30.findViewById(R.id.small_eastNone1);
        collision30_small_eastNone2 = 		(ImageView)collision30.findViewById(R.id.small_eastNone2);
        collision30_small_southLeft = 									(ImageView)collision30.findViewById(R.id.small_southLeft);
        collision30_small_southStriaght = 							(ImageView)collision30.findViewById(R.id.small_southStraight);
        collision30_small_southRight = 									(ImageView)collision30.findViewById(R.id.small_southRight);
        collision30_small_southOther = 									(ImageView)collision30.findViewById(R.id.small_southOther);
        collision30_small_southPedestrain1 = 						(ImageView)collision30.findViewById(R.id.small_southPedestrain1);
        collision30_small_southPedestrain2 = 						(ImageView)collision30.findViewById(R.id.small_southPedestrain2);
        collision30_small_southNone1 = 					(ImageView)collision30.findViewById(R.id.small_southNone1);
        collision30_small_southNone2 = 	(ImageView)collision30.findViewById(R.id.small_southNone2);
        collision30_small_westLeft = 										(ImageView)collision30.findViewById(R.id.small_westLeft);
        collision30_small_westStriaght = 								(ImageView)collision30.findViewById(R.id.small_westStraight);
        collision30_small_westRight = 									(ImageView)collision30.findViewById(R.id.small_westRight);
        collision30_small_westOther = 									(ImageView)collision30.findViewById(R.id.small_westOther);
        collision30_small_westPedestrain1 = 						(ImageView)collision30.findViewById(R.id.small_westPedestrain1);
        collision30_small_westPedestrain2 = 						(ImageView)collision30.findViewById(R.id.small_westPedestrain2);
        collision30_small_westNone1 = 						(ImageView)collision30.findViewById(R.id.small_westNone1);
        collision30_small_westNone2 = 		(ImageView)collision30.findViewById(R.id.small_westNone2);
        collision31_small_northLeft = 									(ImageView)collision31.findViewById(R.id.small_northLeft);
        collision31_small_northStriaght = 							(ImageView)collision31.findViewById(R.id.small_northStraight);
        collision31_small_northRight = 									(ImageView)collision31.findViewById(R.id.small_northRight);
        collision31_small_northOther = 									(ImageView)collision31.findViewById(R.id.small_northOther);
        collision31_small_northPedestrain1 = 						(ImageView)collision31.findViewById(R.id.small_northPedestrain1);
        collision31_small_northPedestrain2 = 						(ImageView)collision31.findViewById(R.id.small_northPedestrain2);
        collision31_small_northNone1 = 					(ImageView)collision31.findViewById(R.id.small_northNone1);
        collision31_small_northNone2 = 	(ImageView)collision31.findViewById(R.id.small_northNone2);
        collision31_small_eastLeft = 										(ImageView)collision31.findViewById(R.id.small_eastLeft);
        collision31_small_eastStriaght = 								(ImageView)collision31.findViewById(R.id.small_eastStraight);
        collision31_small_eastRight = 									(ImageView)collision31.findViewById(R.id.small_eastRight);
        collision31_small_eastOther = 									(ImageView)collision31.findViewById(R.id.small_eastOther);
        collision31_small_eastPedestrain1 = 						(ImageView)collision31.findViewById(R.id.small_eastPedestrain1);
        collision31_small_eastPedestrain2 = 						(ImageView)collision31.findViewById(R.id.small_eastPedestrain2);
        collision31_small_eastNone1 = 						(ImageView)collision31.findViewById(R.id.small_eastNone1);
        collision31_small_eastNone2 = 		(ImageView)collision31.findViewById(R.id.small_eastNone2);
        collision31_small_southLeft = 									(ImageView)collision31.findViewById(R.id.small_southLeft);
        collision31_small_southStriaght = 							(ImageView)collision31.findViewById(R.id.small_southStraight);
        collision31_small_southRight = 									(ImageView)collision31.findViewById(R.id.small_southRight);
        collision31_small_southOther = 									(ImageView)collision31.findViewById(R.id.small_southOther);
        collision31_small_southPedestrain1 = 						(ImageView)collision31.findViewById(R.id.small_southPedestrain1);
        collision31_small_southPedestrain2 = 						(ImageView)collision31.findViewById(R.id.small_southPedestrain2);
        collision31_small_southNone1 = 					(ImageView)collision31.findViewById(R.id.small_southNone1);
        collision31_small_southNone2 = 	(ImageView)collision31.findViewById(R.id.small_southNone2);
        collision31_small_westLeft = 										(ImageView)collision31.findViewById(R.id.small_westLeft);
        collision31_small_westStriaght = 								(ImageView)collision31.findViewById(R.id.small_westStraight);
        collision31_small_westRight = 									(ImageView)collision31.findViewById(R.id.small_westRight);
        collision31_small_westOther = 									(ImageView)collision31.findViewById(R.id.small_westOther);
        collision31_small_westPedestrain1 = 						(ImageView)collision31.findViewById(R.id.small_westPedestrain1);
        collision31_small_westPedestrain2 = 						(ImageView)collision31.findViewById(R.id.small_westPedestrain2);
        collision31_small_westNone1 = 						(ImageView)collision31.findViewById(R.id.small_westNone1);
        collision31_small_westNone2 = 		(ImageView)collision31.findViewById(R.id.small_westNone2);
        collision32_small_northLeft = 									(ImageView)collision32.findViewById(R.id.small_northLeft);
        collision32_small_northStriaght = 							(ImageView)collision32.findViewById(R.id.small_northStraight);
        collision32_small_northRight = 									(ImageView)collision32.findViewById(R.id.small_northRight);
        collision32_small_northOther = 									(ImageView)collision32.findViewById(R.id.small_northOther);
        collision32_small_northPedestrain1 = 						(ImageView)collision32.findViewById(R.id.small_northPedestrain1);
        collision32_small_northPedestrain2 = 						(ImageView)collision32.findViewById(R.id.small_northPedestrain2);
        collision32_small_northNone1 = 					(ImageView)collision32.findViewById(R.id.small_northNone1);
        collision32_small_northNone2 = 	(ImageView)collision32.findViewById(R.id.small_northNone2);
        collision32_small_eastLeft = 										(ImageView)collision32.findViewById(R.id.small_eastLeft);
        collision32_small_eastStriaght = 								(ImageView)collision32.findViewById(R.id.small_eastStraight);
        collision32_small_eastRight = 									(ImageView)collision32.findViewById(R.id.small_eastRight);
        collision32_small_eastOther = 									(ImageView)collision32.findViewById(R.id.small_eastOther);
        collision32_small_eastPedestrain1 = 						(ImageView)collision32.findViewById(R.id.small_eastPedestrain1);
        collision32_small_eastPedestrain2 = 						(ImageView)collision32.findViewById(R.id.small_eastPedestrain2);
        collision32_small_eastNone1 = 						(ImageView)collision32.findViewById(R.id.small_eastNone1);
        collision32_small_eastNone2 = 		(ImageView)collision32.findViewById(R.id.small_eastNone2);
        collision32_small_southLeft = 									(ImageView)collision32.findViewById(R.id.small_southLeft);
        collision32_small_southStriaght = 							(ImageView)collision32.findViewById(R.id.small_southStraight);
        collision32_small_southRight = 									(ImageView)collision32.findViewById(R.id.small_southRight);
        collision32_small_southOther = 									(ImageView)collision32.findViewById(R.id.small_southOther);
        collision32_small_southPedestrain1 = 						(ImageView)collision32.findViewById(R.id.small_southPedestrain1);
        collision32_small_southPedestrain2 = 						(ImageView)collision32.findViewById(R.id.small_southPedestrain2);
        collision32_small_southNone1 = 					(ImageView)collision32.findViewById(R.id.small_southNone1);
        collision32_small_southNone2 = 	(ImageView)collision32.findViewById(R.id.small_southNone2);
        collision32_small_westLeft = 										(ImageView)collision32.findViewById(R.id.small_westLeft);
        collision32_small_westStriaght = 								(ImageView)collision32.findViewById(R.id.small_westStraight);
        collision32_small_westRight = 									(ImageView)collision32.findViewById(R.id.small_westRight);
        collision32_small_westOther = 									(ImageView)collision32.findViewById(R.id.small_westOther);
        collision32_small_westPedestrain1 = 						(ImageView)collision32.findViewById(R.id.small_westPedestrain1);
        collision32_small_westPedestrain2 = 						(ImageView)collision32.findViewById(R.id.small_westPedestrain2);
        collision32_small_westNone1 = 						(ImageView)collision32.findViewById(R.id.small_westNone1);
        collision32_small_westNone2 = 		(ImageView)collision32.findViewById(R.id.small_westNone2);
        collision_northLeft = (ImageView)findViewById(R.id.collision_northLeft);
        collision_northStraight = (ImageView)findViewById(R.id.collision_northStriaght);
        collision_northRight = (ImageView)findViewById(R.id.collision_northRight);
        collision_northOther = (ImageView)findViewById(R.id.collision_northOther);
        collision_northPedestrain1 = (ImageView)findViewById(R.id.collision_northPedestrain1);
        collision_northPedestrain2 = (ImageView)findViewById(R.id.collision_northPedestrain2);
        collision_northNone1 = (ImageView)findViewById(R.id.collision_northNone1);
        collision_northNone2 = (ImageView)findViewById(R.id.collision_northNone2);
        collision_eastOther = (ImageView)findViewById(R.id.collision_eastOther);
        collision_eastRight = (ImageView)findViewById(R.id.collision_eastRight);
        collision_eastStriaght = (ImageView)findViewById(R.id.collision_eastStriaght);
        collision_eastLeft = (ImageView)findViewById(R.id.collision_eastLeft);
        collision_eastPedestrain1 = (ImageView)findViewById(R.id.collision_eastPedestrain1);
        collision_eastPedestrain2 = (ImageView)findViewById(R.id.collision_eastPedestrain2);
        collision_eastNone1 = (ImageView)findViewById(R.id.collision_eastNone1);
        collision_eastNone2 = (ImageView)findViewById(R.id.collision_eastNone2);
        collision_southLeft = (ImageView)findViewById(R.id.collision_southLeft);
        collision_southStriaght = (ImageView)findViewById(R.id.collision_southStraight);
        collision_southRight = (ImageView)findViewById(R.id.collision_southRight);
        collision_southOther = (ImageView)findViewById(R.id.collision_southOther);
        collision_southPedestrain1 = (ImageView)findViewById(R.id.collision_southPedestrain1);
        collision_southPedestrain2 = (ImageView)findViewById(R.id.collision_southPedestrain2);
        collision_southNone1 = (ImageView)findViewById(R.id.collision_southNone1);
        collision_southNone2 = (ImageView)findViewById(R.id.collision_southNone2);
        collision_westOther = (ImageView)findViewById(R.id.collision_westOther);
        collision_westRight = (ImageView)findViewById(R.id.collision_westRight);
        collision_westStriaght = (ImageView)findViewById(R.id.collision_westStriaght);
        collision_westLeft = (ImageView)findViewById(R.id.collision_westLeft);
        collision_westPedestrain1 = (ImageView)findViewById(R.id.collision_westPedestrain1);
        collision_westPedestrain2 = (ImageView)findViewById(R.id.collision_westPedestrain2);
        collision_westNone1 = (ImageView)findViewById(R.id.collision_westNone1);
        collision_westNone2 = (ImageView)findViewById(R.id.collision_westNone2);
    }

}
