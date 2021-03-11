package com.example.spring_21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv1;
    String st1, st2, st3, last, year, semester, s, dept;
    int mld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1 = findViewById(R.id.tv1);

    }

    public void setInfo(View view) {
        Intent i = getIntent();
        st1 = i.getStringExtra("name");
        st2 = i.getStringExtra("id");
        st3 = i.getStringExtra("no");
        last = String.valueOf(st3.charAt(st3.length() - 1));
        mld = Integer.parseInt(last);
        if (st2.length() != 0) {
            year = st2.substring(0, 2);
            s = st2.substring(2, 3);
            if (s.contains("1")) {
                semester = "Spring";
            } else if (s.contains("2")) {
                semester = "Summer";
            } else if (s.contains("3")) {
                semester = "Fall";
            }
        }
        if (st2.contains("-15-")) {
            dept = "CSE";
        } else if (st2.contains("-14-")) {
            dept = "SE";
        } else if (st2.contains("-13-")) {
            dept = "BBA";
        } else if (st2.contains("-12-")) {
            dept = "English";
        } else if (st2.contains("-11-")) {
            dept = "Pharmacy";
        }
        if (mld % 2 == 0) {
            tv1.setText(st1 + " has admitted in " + semester + " 20" + year);
        } else {
            tv1.setText(st1 + " has admitted in " + dept + " dept.");
        }
    }
}