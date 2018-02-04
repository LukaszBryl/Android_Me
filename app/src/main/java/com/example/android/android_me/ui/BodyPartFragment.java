package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;


/**
 * Created by lukasz on 04.02.18.
 */

public class BodyPartFragment extends Fragment {

    public BodyPartFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // DONE (2) Create a new class called BodyPartFragment to display an image of an Android-Me body part
        // In this class, you'll need to implement an empty constructor and the onCreateView method

        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);
        // DONE (3) Show the first image in the list of head images
        // Soon, you'll update this image display code to show any image you want
        ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_image_view);
        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));
        return rootView;
    }
}
