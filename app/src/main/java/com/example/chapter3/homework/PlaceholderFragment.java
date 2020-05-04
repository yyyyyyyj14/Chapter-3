package com.example.chapter3.homework;


import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceholderFragment extends Fragment {

    private ObjectAnimator alphaAnimator;
    private ArrayAdapter<String> adapter;
    private View inflate;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO ex3-3: 修改 fragment_placeholder，添加 loading 控件和列表视图控件


        inflate = inflater.inflate(R.layout.fragment_placeholder, container, false);
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        inflate.findViewById(R.id.ls).setAlpha(0f);

        inflate.postDelayed(new Runnable() {
            @Override
            public void run() {
                // 这里会在 5s 后执行
                // TODO ex3-4：实现动画，将 lottie 控件淡出，列表数据淡入


                inflate.findViewById(R.id.animation_loading).animate().alpha(0f).setDuration(1000);

                inflate.findViewById(R.id.ls).setVisibility(View.VISIBLE);
                inflate.findViewById(R.id.ls).animate().alpha(1f).setDuration(1000);


            }
        }, 5000);
    }

}
