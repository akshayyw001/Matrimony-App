package com.example.matrimony.authenticate.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.matrimony.Common.Base.BaseActivity;
import com.example.matrimony.R;

public class SplashActivity extends BaseActivity implements View.OnClickListener {
    private Context context = SplashActivity.this;
    private Button btn_login, btn_signup;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        InitView();
    }

    @Override
    public void InitView() {


        btn_login = (Button) findViewById(R.id.btn_login);
        btn_signup = (Button) findViewById(R.id.btn_signup);

        btn_login.setOnClickListener(this);
        btn_signup.setOnClickListener(this);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_splash;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login: {
                startActivity(new Intent(context, LoginActivity.class));

            }
            break;
            case R.id.btn_signup: {
                startActivity(new Intent(context, SignUpActivity.class));

            }
            break;
        }
    }
}