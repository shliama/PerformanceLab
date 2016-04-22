package com.performance.ua.performancelab;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by sergey on 4/22/16.
 */
public class HierarchyActivity extends AppCompatActivity {

    public static void start(Context context) {
        context.startActivity(new Intent(context, HierarchyActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hierarchy_layout);
    }
}
