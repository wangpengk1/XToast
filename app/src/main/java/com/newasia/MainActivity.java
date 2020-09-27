package com.newasia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.newasia.xtoast.XToast;
import com.newasia.xtoast.XToastUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onToastTest(View view)
    {
        XToastUtil.setContext(this);
        XToastUtil.warning("dwadwa", Toast.LENGTH_LONG);
    }
}