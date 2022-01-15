package com.fr3y.demo1;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;

public class MainActivity extends Activity {

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
        }
    }

    void fun(int x , int y ){
        Log.d("Sum" , String.valueOf(x+y));
    }

}