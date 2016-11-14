package com.example.michael.viewpager;

import java.util.Random;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PageFragment extends Fragment {

    static final String ARGUMENT_PAGE_NUMBER = "arg_page_number";

    int pageNumber;
    int backColor;

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

        TextView tvPage = (TextView) view.findViewById(R.id.tvPage);
        //TextView tvPageOne = (TextView) view.findViewById(R.id.tvPageOne);
        //
        if(pageNumber==0){
        ImageView im = (ImageView) view.findViewById(R.id.image_page);
        im.setImageResource(R.drawable.first);
            tvPage.setText("Любите свои \n комнатные растения");
           // tvPage.setBackgroundColor(backColor);
        }
        if(pageNumber==1){
            ImageView im = (ImageView) view.findViewById(R.id.image_page);
            im.setImageResource(R.drawable.second);
            tvPage.setText("Заботьтесь о них \n правильно");
           // tvPage.setBackgroundColor(backColor);
        }
        if(pageNumber==2) {
            ImageView im = (ImageView) view.findViewById(R.id.image_page);
            im.setImageResource(R.drawable.third);
            tvPage.setText("Никогда не забывайте \n про них");
           // tvPage.setBackgroundColor(backColor);
        }
        return view;
    }
}