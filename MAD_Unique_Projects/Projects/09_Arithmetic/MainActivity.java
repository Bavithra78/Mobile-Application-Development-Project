package com.example.madminiproject;

import android.app.*;
import android.os.*;
import android.content.*;
import android.net.Uri;
import android.graphics.Color;
import android.view.*;
import android.widget.*;
import android.speech.tts.TextToSpeech;
import android.hardware.*;
import java.util.*;
import java.text.*;

public class MainActivity extends Activity {
    EditText first, second; TextView result; Button action, action2; LinearLayout root;
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
        root=findViewById(R.id.root); first=findViewById(R.id.first); second=findViewById(R.id.second);
        result=findViewById(R.id.result); action=findViewById(R.id.action); action2=findViewById(R.id.action2);
        // TODO: connect additional buttons/views declared in XML for the selected program.
        // Main implementation reference:
        try{double a=Double.parseDouble(first.getText().toString()), b=Double.parseDouble(second.getText().toString()); add.setOnClickListener(v->show(a+b)); sub.setOnClickListener(v->show(a-b)); mul.setOnClickListener(v->show(a*b)); div.setOnClickListener(v->show(b==0?Double.NaN:a/b));}catch(Exception e){result.setText("Enter valid numbers");}
    }
    private void show(double value) { result.setText(String.valueOf(value)); }
}
