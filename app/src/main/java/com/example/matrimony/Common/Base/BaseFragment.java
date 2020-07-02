package com.example.matrimony.Common.Base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.matrimony.Common.Presenter.IBaseFragment;

public abstract class BaseFragment extends Fragment implements IBaseFragment {

    private View layoutView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutResourceId(), container, false);

        setLayoutView(view);
        return view;
    }

    protected abstract int getLayoutResourceId();

    public View getLayoutView() {
        return layoutView;
    }

    public void setLayoutView(View layoutView) {
        this.layoutView = layoutView;
    }

}