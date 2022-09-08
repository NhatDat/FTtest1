package com.example.fttest1.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fttest1.Fragment.Profile.ProfileFragment;
import com.example.fttest1.PostActivity;
import com.example.fttest1.R;


public class HomeFragment extends Fragment {

    TextView txt_post;
    ImageView search_bar, inbox, avatar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        txt_post =view.findViewById(R.id.post);
        avatar =view.findViewById(R.id.avatar);
       // inbox =view.findViewById(R.id.inbox);
        search_bar =view.findViewById(R.id.search_bar);




        //================CLICK_ACTION=============
        txt_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), PostActivity.class);
                startActivity(intent);
            }
        });

        avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new ProfileFragment());
                fr.addToBackStack(null);
                fr.commit();
            }
        });

        search_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new SearchFragment());
                fr.addToBackStack(null);
                fr.commit();
            }
        });

        return view;


    }
}