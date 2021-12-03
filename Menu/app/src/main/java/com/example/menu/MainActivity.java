package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_1,btn_2,btn_3,btn_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1 = findViewById(R.id.bt_1);
        btn_2 = findViewById(R.id.bt_2);
        btn_3 = findViewById(R.id.bt_3);
        btn_4 = findViewById(R.id.bt_4);
        setListeners();
    }

    private void setListeners(){
        OnClick onClick = new OnClick();
        btn_1.setOnClickListener(onClick);
        btn_2.setOnClickListener(onClick);
        btn_3.setOnClickListener(onClick);
        btn_4.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View v){
            Intent intent = null;
            switch(v.getId()){
                case R.id.bt_1:
                    intent = new Intent(MainActivity.this,OneActivity.class);
                    break;
                case R.id.bt_2:
                    intent = new Intent(MainActivity.this,TwoActivity.class);
                    break;
                case R.id.bt_3:
                    intent = new Intent(MainActivity.this,ThreeActivity.class);
                    break;
                case R.id.bt_4:
                    intent = new Intent(MainActivity.this,FourActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}