package com.pgzxc.poplive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pgzxc.poplive.widget.LiveDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListener();
    }

    private void setListener() {
        findViewById(R.id.image_live).setOnClickListener(view -> {
            LiveDialog liveDialog = new LiveDialog(this);
            liveDialog.showDialog();
        });
    }
}
