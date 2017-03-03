package com.itheima.datarequest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //序列化cookie到本地内存
    }

    private long lastClickTime = 0;

    @Override
    public void onBackPressed() {
        if (lastClickTime <= 0) {
            Toast.makeText(this, "再次点击退出", Toast.LENGTH_SHORT).show();
            lastClickTime = System.currentTimeMillis();
        } else {
            long newClickTime = System.currentTimeMillis();
            if ((newClickTime - lastClickTime) < 1000) {
                finish();
            }else{
                Toast.makeText(this, "再次点击退出", Toast.LENGTH_SHORT).show();
                lastClickTime = newClickTime;
            }
        }
    }
}
