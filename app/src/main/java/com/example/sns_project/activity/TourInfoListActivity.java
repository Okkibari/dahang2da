package com.example.sns_project.activity;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.Switch;

import com.example.sns_project.R;
import com.example.sns_project.info.ImageInfo;

import java.util.ArrayList;

public class TourInfoListActivity extends BasicActivity{

    private Switch aSwitch;
    private Spinner spinner;
    SearchView search;
    ArrayList<ImageInfo> image_itemArrayList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_info_list);

        aSwitch = findViewById(R.id.switch1);
        spinner = findViewById(R.id.spinner);

        //ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.question,R.layout.support_simple_spinner_dropdown_item);

        ListView listView = findViewById(R.id.listview_place);
        image_itemArrayList = new ArrayList<ImageInfo>();
        search = findViewById(R.id.search);

        StrictMode.enableDefaults();

        //spinner.setOnItemSelectedListener(this);
        //spinner.setAdapter(adapter);
    }
}
