package com.example.matrimony.Common.Base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.matrimony.Common.Presenter.IBaseActivityView;

public abstract class BaseActivity extends AppCompatActivity implements IBaseActivityView {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResourceId());

    }


    public abstract void InitView();

    protected abstract int getLayoutResourceId();


}