package com.cxm.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Toolbar mtoolbar;
    private TextView m_navname_tv, m_navdis_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniview();
    }
    public void iniview() {
        m_navdis_tv = findViewById(R.id.nav_head_dis_tv);
        m_navname_tv = findViewById(R.id.nav_head_name_tv);
        mtoolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);
    }
}
