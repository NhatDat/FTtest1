package com.example.fttest1.Fragment.Profile;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fttest1.Fragment.Profile.ProfileDetailFragment;
import com.example.fttest1.R;

public class ProfileFragment extends Fragment {

    TextView txt_edit_profile;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        txt_edit_profile = view.findViewById(R.id.txt_edit_profile);

        txt_edit_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new ProfileDetailFragment());
                fr.commit();
            }
        });

        return view;
    }
}