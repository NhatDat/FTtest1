package com.example.fttest1.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fttest1.Fragment.Profile.ProfileFragment;
import com.example.fttest1.R;

public class MenuFragment extends Fragment {

    ImageView search_bar,avatar;
    TextView tv_name,tv_see;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        search_bar =view.findViewById(R.id.search_bar);
        avatar =view.findViewById(R.id.avatar);
        tv_name =view.findViewById(R.id.tv_name);
        tv_see =view.findViewById(R.id.tv_see);

        search_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new SearchFragment());
                fr.commit();
            }
        });

        avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new ProfileFragment());
                fr.commit();
            }
        });
        tv_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new ProfileFragment());
                fr.commit();
            }
        });
        tv_see.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new ProfileFragment());
                fr.commit();
            }
        });

        return view;
    }

}