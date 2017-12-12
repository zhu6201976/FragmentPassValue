package com.example.administrator.test;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by My on 2017/12/12.
 */

public class RightFragment extends Fragment {

    private TextView tv_result;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_right, null);
        tv_result = (TextView) view.findViewById(R.id.tv_result);
        return view;
    }

    public void setText(String content) {
        tv_result.setText(content);
    }
}
