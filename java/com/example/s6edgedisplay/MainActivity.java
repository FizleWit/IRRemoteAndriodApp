package com.example.s6edgedisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.ConsumerIrManager;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ConsumerIrManager mCIR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCIR = (ConsumerIrManager)getSystemService(Context.CONSUMER_IR_SERVICE);
    }

    public void  TVPowerButtonClick(View view)
    {
//        if (!mCIR.hasIrEmitter()) {
//            Log.e(TAG, "NO ir emitter FOund");
//            return;
//        }
        int[] pattern5 = {341,170,21,21,21,21,21,21,21,21,21,21,21,64,21,21,21,21,21,64,21,64,21,64,21,64,21,64,21,21,21,64,21,64,21,21,21,21,21,21,21,21,21,64,21,21,21,21,21,21,21,64,21,64,21,64,21,64,21,21,21,64,21,64,21,64,21,1517};
        mCIR.transmit(38000, pattern5);
    }






}