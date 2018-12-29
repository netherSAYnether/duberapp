package org.duberapp.dubertest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mGrower = findViewById(R.id.grower);
        Button mSmoker = findViewById(R.id.smoker);


        mGrower.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GrowerLoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        mSmoker.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SmokerLoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
