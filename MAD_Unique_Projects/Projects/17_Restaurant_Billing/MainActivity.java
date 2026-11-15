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
        try{int q=Integer.parseInt(first.getText().toString()); double p=Double.parseDouble(second.getText().toString()); result.setText("Total: Rs. "+(q*p));}catch(Exception e){result.setText("Enter valid quantity and price");}
    }
    private void show(double value) { result.setText(String.valueOf(value)); }
}
