package com.example.sns_project.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.example.sns_project.R;
import com.example.sns_project.activity.WritePostActivity;

import javax.annotation.Nullable;

public class ContentsItemView extends LinearLayout { //LinearLayout 생성
    private ImageView imageView;
    private EditText editText;

    public ContentsItemView(Context context){
        super(context);
        initView();
    }

    public ContentsItemView(Context context, @Nullable AttributeSet attributeSet){
        super(context, attributeSet);
        initView();
    }

    private void initView(){

        setLayoutParams( new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        setOrientation(LinearLayout.VERTICAL); //vertical 설정

        LayoutInflater layoutInflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        addView(layoutInflater.inflate(R.layout.view_contents_image,this, false));
        addView(layoutInflater.inflate(R.layout.view_contents_edit_text,this, false));

        imageView = findViewById(R.id.iv_post_image);
        editText = findViewById(R.id.et_post_content);
    }

    public void setImage(String path){
        Glide.with(this).load(path).centerCrop().override(1000).into(imageView);
    }

    public void setText(String text){
        editText.setText(text);
    }

    public void setOnClickListener(OnClickListener onclickListener){
        imageView.setOnClickListener(onclickListener);
    }

    public void setOnFocusChangeListener(OnFocusChangeListener onFocusChangeListener){
        editText.setOnFocusChangeListener(onFocusChangeListener);
    }
}