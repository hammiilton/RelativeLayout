package com.example.onde_parei1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("1. onCreate");
    }
/*
    protected void onStart(){
        super.onStart();
        System.out.println("2. on Start");
    }
    protected void onResume(){
        super.onResume();
        System.out.println("2. on Resume");
    }
    protected void onPause(){
        super.onPause();
        System.out.println("2. on Pouse");
    }
    protected void onStop(){
        super.onStop();
        System.out.println("2. on Stop");
    }
    protected void onDestroy(){
        super.onDestroy();
        System.out.println("2. on Destroy");
    }
*/
    @Override
    public void onClick(View view) {

        TextView t = (TextView) findViewById(R.id.txtCarro);
        String s;
        switch(view.getId()) {
            case R.id.btnCarro:
                s="Capturar Local do Carro";
                break;
            default:
                s="Não entendi a sua seleção";
        }
    }
}