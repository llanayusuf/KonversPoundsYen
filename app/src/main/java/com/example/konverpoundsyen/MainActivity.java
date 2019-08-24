package com.example.konverpoundsyen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int req_code = 17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button konvertYen = findViewById(R.id.rty);
        Button konvertPounds = findViewById(R.id.rtp);

        konvertYen.setOnClickListener(this);
        konvertPounds.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rty:
                Intent konvert_Yen =new Intent(MainActivity.this,konvertYen.class);
                startActivityForResult(konvert_Yen, req_code);
                break;
            case R.id.rtp:
                Intent konvert_Pounds =new Intent(MainActivity.this,konvertPounds.class);
                startActivityForResult(konvert_Pounds, req_code);
                break;


        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == req_code){
            if (resultCode == RESULT_OK){
                TextView hasil = findViewById(R.id.view);
                hasil.setText(data.getData().toString());

            }
        }
    }
}
