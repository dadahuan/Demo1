package com.example.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txt_set)
    TextView txtSet;
    @BindView(R.id.sv_search)
    SearchView svSearch;
    @BindView(R.id.ll_user)
    LinearLayout llUser;
    @BindView(R.id.btn_fighit)
    ToggleButton btnFighit;
    @BindView(R.id.txt_link)
    TextView txtLink;
    @BindView(R.id.ll_wireless)
    LinearLayout llWireless;
    @BindView(R.id.txt_switch)
    TextView txtSwitch;
    @BindView(R.id.ll_bluetooth)
    LinearLayout llBluetooth;
    @BindView(R.id.ll_honeycomb)
    LinearLayout llHoneycomb;
    @BindView(R.id.txt_hsswitch)
    TextView txtHsswitch;
    @BindView(R.id.ll_hotspot)
    LinearLayout llHotspot;
    @BindView(R.id.ll_inform)
    LinearLayout llInform;
    @BindView(R.id.ll_sound)
    LinearLayout llSound;
    @BindView(R.id.ll_notdisturb)
    LinearLayout llNotdisturb;
    @BindView(R.id.ll_screentime)
    LinearLayout llScreentime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }
    /**
     * 
     * 点击事件
     * @anthor:  LiuHuan
     * 2019/7/12 14:45
     */
    @OnClick({R.id.txt_set, R.id.sv_search, R.id.ll_user, R.id.btn_fighit, R.id.txt_link, R.id.ll_wireless, R.id.txt_switch, R.id.ll_bluetooth, R.id.ll_honeycomb, R.id.txt_hsswitch, R.id.ll_hotspot, R.id.ll_inform, R.id.ll_sound, R.id.ll_notdisturb, R.id.ll_screentime})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.txt_set:
                Intent intent=new Intent(this,ShowActivity.class);
//                intent.putExtra("id",);
                startActivity(intent);
                break;
            case R.id.sv_search:
                break;
            case R.id.ll_user:
                break;
            case R.id.btn_fighit:
                break;
            case R.id.txt_link:
                break;
            case R.id.ll_wireless:
                break;
            case R.id.txt_switch:
                break;
            case R.id.ll_bluetooth:
                break;
            case R.id.ll_honeycomb:
                break;
            case R.id.txt_hsswitch:
                break;
            case R.id.ll_hotspot:
                break;
            case R.id.ll_inform:
                break;
            case R.id.ll_sound:
                break;
            case R.id.ll_notdisturb:
                break;
            case R.id.ll_screentime:
                break;
        }
    }
}
