package com.yimeihui.gittest2.home.model.activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.yimeihui.gittest2.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private List<String> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.mian_lv);
        data = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String string = "item"+i;
            data.add(string);
        }
        mListView.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data));

    }
}
