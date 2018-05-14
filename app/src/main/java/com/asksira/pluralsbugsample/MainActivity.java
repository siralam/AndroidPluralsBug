package com.asksira.pluralsbugsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.tv_result);

        findViewById(R.id.btn_singular).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(getResources().getQuantityString(R.plurals.example, 1, 1));
            }
        });
        findViewById(R.id.btn_plural).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(getResources().getQuantityString(R.plurals.example, 999, 999));
            }
        });
    }
}
