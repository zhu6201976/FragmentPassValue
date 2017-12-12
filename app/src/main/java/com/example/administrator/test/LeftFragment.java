package com.example.administrator.test;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by My on 2017/12/12.
 */

public class LeftFragment extends Fragment {

    private EditText et_first;
    private EditText et_second;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_left, null);
        et_first = (EditText) view.findViewById(R.id.et_first);
        et_second = (EditText) view.findViewById(R.id.et_second);
        Button bt_equal = (Button) view.findViewById(R.id.bt_equal);

        bt_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first = et_first.getText().toString().trim();
                String second = et_second.getText().toString().trim();
                if (first.isEmpty() || second.isEmpty()) {
                    Toast.makeText(inflater.getContext(), "please input", Toast.LENGTH_SHORT).show();
                } else {
                    int result = Integer.parseInt(first) + Integer.parseInt(second);
                    FragmentManager fragmentManager = getFragmentManager();
                    RightFragment rightFragment = (com.example.administrator.test.RightFragment) fragmentManager.findFragmentByTag("right");
                    rightFragment.setText(result + "");
                }
            }
        });
        return view;

    }
}
