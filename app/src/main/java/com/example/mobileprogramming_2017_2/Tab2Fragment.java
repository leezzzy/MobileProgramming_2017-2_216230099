package com.example.mobileprogramming_2017_2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab2Fragment extends Fragment {


    public Tab2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // 이 프래그먼트의 레이아웃을 인플레이트한다.
        return inflater.inflate(R.layout.fragment_tab2, container, false);
    }

}
