package com.zhoujian.AutoLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.zhy.autolayout.AutoLayoutActivity;

public class MainActivity extends AutoLayoutActivity
{

    private Button mButtonOne , mButtonTwo;
    private Button mButtonThree , mButtonFour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mButtonOne = (Button)findViewById(R.id.button_one);
        mButtonTwo = (Button)findViewById(R.id.button_two);
        mButtonThree = (Button)findViewById(R.id.button_three);
        mButtonFour = (Button)findViewById(R.id.button_four);


        if(mButtonOne.isEnabled()){
            mButtonOne.setEnabled(false);
            mButtonTwo.setEnabled(true);
            mButtonThree.setEnabled(true);
            mButtonFour.setEnabled(true);
        }


        mButtonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mButtonOne.isEnabled()){
                    mButtonOne.setEnabled(false);
                    mButtonTwo.setEnabled(true);
                    mButtonThree.setEnabled(true);
                    mButtonFour.setEnabled(true);
                }
                Toast.makeText(MainActivity.this, "充值卡充值", Toast.LENGTH_SHORT).show();

            }
        });


        mButtonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mButtonTwo.isEnabled()){
                    mButtonTwo.setEnabled(false);
                    mButtonOne.setEnabled(true);
                    mButtonThree.setEnabled(true);
                    mButtonFour.setEnabled(true);
                }
                Toast.makeText(MainActivity.this, "充值卡消费", Toast.LENGTH_SHORT).show();
            }
        });


        mButtonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mButtonThree.isEnabled()){
                    mButtonThree.setEnabled(false);
                    mButtonTwo.setEnabled(true);
                    mButtonOne.setEnabled(true);
                    mButtonFour.setEnabled(true);
                }
                Toast.makeText(MainActivity.this, "会员拉新", Toast.LENGTH_SHORT).show();
            }
        });


        mButtonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mButtonFour.isEnabled()){
                    mButtonFour.setEnabled(false);
                    mButtonThree.setEnabled(true);
                    mButtonTwo.setEnabled(true);
                    mButtonOne.setEnabled(true);
                }
                Toast.makeText(MainActivity.this, "普通顾客优惠", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
