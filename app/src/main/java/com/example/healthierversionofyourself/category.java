package com.example.healthierversionofyourself;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class category extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    private TextView dateText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);
        dateText =findViewById(R.id.showdate);
        dateText.setText("Pick a Date");
        Intent intent = getIntent();
        Integer id = (Integer) intent.getExtras().get("id");

        findViewById(R.id.back_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(category.this, Start.class);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        findViewById(R.id.showdate_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePicker();
            }
        });


        findViewById(R.id.lifestyle_Btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(category.this, lifestyle_category.class);
                intent.putExtra("id", id);
                startActivityForResult(intent, 100);
            }
        });


        findViewById(R.id.knowledge_Btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(category.this, knowledge_category.class);
                intent.putExtra("id", id);
                startActivityForResult(intent, 100);

            }
        });

        findViewById(R.id.food_Btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(category.this, food_category.class);
                intent.putExtra("id", id);
                startActivityForResult(intent, 100);

            }
        });


    }

    private void showDatePicker() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }


    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
        String date = "Date: " + i2 + "/" + i1 + "/" + i;
        dateText.setText(date);
    }
}