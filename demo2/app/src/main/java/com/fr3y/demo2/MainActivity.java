package com.fr3y.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String total = "@@@###@@@";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        while (true){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            fun(50,30);
            Log.d("ROYSUE.string" , fun("LoWeRcAsE Me!!!!!!!!!"));
        }
    }

    void fun(int x , int y ){
        Log.d("ROYSUE.Sum" , String.valueOf(x+y));
    }

    String fun(String x){
        total +=x;
        return x.toLowerCase();
    }

    String secret(){
        return total;
    }
}