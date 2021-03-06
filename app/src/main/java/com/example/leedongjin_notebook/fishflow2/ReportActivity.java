package com.example.leedongjin_notebook.fishflow2;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.gson.Gson;

public class ReportActivity extends Activity {

    Button cencleButton;
    Button sendButton;
    EditText titleEditText;
    EditText mainEditText;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_report);

        if(Build.VERSION.SDK_INT>=21){
            getWindow().setStatusBarColor(Color.parseColor("#ff7828"));
        }

        spinner = (Spinner)findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //position : 인덱스 번호
                //parent.getItemAtPosition(position) : 값
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        titleEditText =(EditText)findViewById(R.id.titleEditText);
        mainEditText = (EditText)findViewById(R.id.mainEditText);

        cencleButton=(Button)findViewById(R.id.cencleButton);
        cencleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    finish();
            }
        });

        sendButton=(Button)findViewById(R.id.sendButton);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //데이터 서버로 보내기
                //Gson gson = new Gson();
                //String jsonData = gson.toJson()
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //바깥레이어 클릭시 안닫히게
        if(event.getAction()==MotionEvent.ACTION_OUTSIDE){
            return false;
        }
        return true;
    }


}
