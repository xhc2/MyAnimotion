package com.example.tongmin.myanimotion;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * LayoutAnimation作用于子元素的动画。
 *
 */
public class LayoutAnimationActiivty extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_layout_animation_actiivty);
        listView = (ListView)findViewById(R.id.listview);
        List<String> list = new ArrayList<String>();
        for(int i = 0 ;i < 10 ;++ i){
            list.add("adfasdf"+i);
        }
        arrayAdapter = new ArrayAdapter(this,R.layout.item,list);
        listView.setAdapter(arrayAdapter);
    }

}
