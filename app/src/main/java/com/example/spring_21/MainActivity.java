package com.example.spring_21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2, et3;
    String st1, st2, st3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);

    }

    public void nextHandle(View view) {
        st1 = et1.getText().toString();
        st2 = et2.getText().toString();
        st3 = et3.getText().toString();
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        i.putExtra("name", st1);
        i.putExtra("id", st2);
        i.putExtra("no", st3);
        startActivity(i);
    }
}