package com.example.chapter3_5_3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new OnBtnClick());
    }

    private class OnBtnClick implements OnClickListener {
        public void onClick(View v) {
            if (v.getId() == R.id.button1)
                Toast.makeText(MainActivity.this, "点击了按钮",
                        Toast.LENGTH_SHORT).show();
        }
    }
}
