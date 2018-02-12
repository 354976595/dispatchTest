package com.example.dispatchTest;


import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.*;

public class MyActivity extends Activity {
    private ListView listView;
    private Button btn3;
    private Button btn4;
    private LinearLayout linearLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        findView();
        Button bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MyActivity.this, "click", Toast.LENGTH_SHORT).show();
                // System.out.println( "click");
                Log.i("dis", "click");
            }
        });
        bt.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                //   Toast.makeText(MyActivity.this, "onTouch", Toast.LENGTH_SHORT).show();
                //  System.out.println("onTouch");
                Log.i("dis", "onTouch");
                return false;
            }
        });

        listView = (ListView) findViewById(R.id.listView);
        String[] str = {"java", "android", "c#"};
        listView.setAdapter(new ArrayAdapter(MyActivity.this, android.R.layout.simple_list_item_1, str));
        listView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    Toast.makeText(MyActivity.this, "ListView Click", Toast.LENGTH_LONG).show();
                }
                return true;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.edit:
                Toast.makeText(MyActivity.this, "edit", Toast.LENGTH_SHORT).show();
                break;
            case R.id.del:
                Toast.makeText(MyActivity.this, "del", Toast.LENGTH_SHORT).show();
                break;
            case R.id.actionSetting:
                Toast.makeText(MyActivity.this, "actionSetting", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void findView() {
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        linearLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.i("dis", "linearLayout onTouch");
                return false;
            }
        });
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("dis", "linearLayout onClick");
            }
        });
        btn3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.i("dis", "btn3 onTouch");
                return true;
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("dis", "btn3 onClick");
            }
        });
        btn4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.i("dis", "btn4 onTouch");
                return false;
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("dis", "btn4 onClick");
            }
        });
    }
    public void testDecorView(View v){
      View view=  getWindow().getDecorView();
        new AlertDialog.Builder(MyActivity.this).setMessage(""+view.getHeight()).show();

    }


}
