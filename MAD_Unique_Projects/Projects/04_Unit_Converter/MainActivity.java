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
        convert.setOnClickListener(v->{try{ double m=Double.parseDouble(input.getText().toString()); result.setText(String.format(Locale.getDefault(),"%.2f cm\n%.3f km",m*100,m/1000)); }catch(Exception e){input.setError("Enter a valid number");}});
    }
    private void show(double value) { result.setText(String.valueOf(value)); }
}
