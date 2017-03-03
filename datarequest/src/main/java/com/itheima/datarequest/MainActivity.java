package com.itheima.datarequest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //内存缓存cookie,退出应用后cookie被清理
    }

    //双击退出

    int clickCount = 0;

    @Override
    public void onBackPressed() {
        if (clickCount < 1){
            Toast.makeText(this,"再次点击退出",0).show();
            clickCount++;
        }
        finish();
    }
}
