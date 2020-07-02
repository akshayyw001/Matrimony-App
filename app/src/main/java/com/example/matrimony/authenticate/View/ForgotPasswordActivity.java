package com.example.matrimony.authenticate.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.matrimony.Common.Base.BaseActivity;
import com.example.matrimony.R;

public class ForgotPasswordActivity extends BaseActivity implements View.OnClickListener {
    private Context context = ForgotPasswordActivity.this;
    private Button btn_forgot;
    private EditText edt_mobile_number, edt_mobile_otp;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        InitView();
    }

    @Override
    public void InitView() {

        edt_mobile_number = (EditText) findViewById(R.id.edt_mobile_number);
        edt_mobile_otp = (EditText) findViewById(R.id.edt_mobile_otp);
        btn_forgot = (Button) findViewById(R.id.btn_forgot);

        btn_forgot.setOnClickListener(this);

    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_forgot_password;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_forgot: {
                startActivity(new Intent(context, LoginActivity.class));
                finish();

            }
            break;
        }
    }
}