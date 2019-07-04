package com.example.demo;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

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

}
