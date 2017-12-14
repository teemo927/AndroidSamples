package com.kelvin.mvpsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.kelvin.mvpsample.feature.login.LoginActivity;
import com.kelvin.mvpsample.feature.register.RegisterActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_login)
    Button mBtnLogin;
    @BindView(R.id.btn_register)
    Button mBtnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_login)
    public void login(View view) {
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }

    @OnClick(R.id.btn_register)
    public void register(View view) {
        startActivity(new Intent(MainActivity.this, RegisterActivity.class));
    }
}
