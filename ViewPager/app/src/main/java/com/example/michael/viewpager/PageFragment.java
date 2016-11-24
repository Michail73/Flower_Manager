package com.example.michael.viewpager;

import java.util.Random;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PageFragment extends Fragment {

    static final String ARGUMENT_PAGE_NUMBER = "arg_page_number";

    int pageNumber;
    int backColor;
    Button mButton;
    static PageFragment newInstance(int page) {
        PageFragment pageFragment = new PageFragment();
        Bundle arguments = new Bundle();
        arguments.putInt(ARGUMENT_PAGE_NUMBER, page);
        pageFragment.setArguments(arguments);
        return pageFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageNumber = getArguments().getInt(ARGUMENT_PAGE_NUMBER);

        Random rnd = new Random();
        backColor = Color.argb(40, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, null);


            mButton = (Button) view.findViewById(R.id.start);
            View.OnClickListener OclStartBtn = new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), ScrollingActivity.class);
                    startActivity(intent);
                }
            };

        mButton.setOnClickListener(OclStartBtn);
        TextView tvPage = (TextView) view.findViewById(R.id.tvPage);
        //TextView tvPageOne = (TextView) view.findViewById(R.id.tvPageOne);
        //
        if(pageNumber==0){
        ImageView im = (ImageView) view.findViewById(R.id.first);
        im.setImageResource(R.drawable.first);
            tvPage.setText("Любите свои \n комнатные растения");
            mButton.setVisibility(View.GONE);
        }
        if(pageNumber==1){
            ImageView im = (ImageView) view.findViewById(R.id.second);
            im.setImageResource(R.drawable.second);
            tvPage.setText("Заботьтесь о них \n правильно");

            mButton.setVisibility(View.GONE);
        }
        if(pageNumber==2) {
            ImageView im = (ImageView) view.findViewById(R.id.third);
            im.setImageResource(R.drawable.third);
            tvPage.setText("Никогда не забывайте \n про них");

            mButton.setVisibility(View.VISIBLE);
        }
        return view;
    }
}