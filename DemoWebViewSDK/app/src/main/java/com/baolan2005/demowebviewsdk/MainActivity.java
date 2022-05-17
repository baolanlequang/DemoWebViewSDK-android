package com.baolan2005.demowebviewsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.baolan2005.bldemowebsdk.MTDMainActivity;

public class MainActivity extends AppCompatActivity {

    private Button myBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myBtn = (Button) findViewById(R.id.button);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MTDMainActivity.class);
                startActivity(intent);
            }
        });
    }
}