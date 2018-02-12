package com.example.dispatchTest;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/10/13.
 */
public class BuildActivity extends Activity implements View.OnClickListener {
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test1);
        button2= (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(BuildActivity.this,"手机型号:"+ Build.MODEL+"\n"+"SDK:"+Build.VERSION.SDK_INT+"\n"+"系统版本:"+Build.VERSION.RELEASE+"\n"+"手机品牌:"+Build.BOARD,Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button2 :
                Toast.makeText(BuildActivity.this,"手机型号:"+ Build.MODEL+"\n"+"SDK:"+Build.VERSION.SDK_INT+"\n"+"系统版本:"+Build.VERSION.RELEASE+"\n"+"手机品牌:"+Build.BOARD,Toast.LENGTH_LONG).show();
                break;
        }
    }
}
