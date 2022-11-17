package com.example.healthierversionofyourself;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

public class food_category extends AppCompatActivity {
    private int points = 0;
    private TextView pointsCalculated;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_category);




        findViewById(R.id.back_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginPage = new Intent(food_category.this, Start.class);
                setResult(RESULT_OK, loginPage);
                finish();
            }
        });
    }
    public void onCheckboxClicked(View view) {
            CheckBox checkBox = (CheckBox)view;
            if (checkBox.isChecked()) {
                points = 20 + points;
            }
            else{
                points = points - 20;
            }
            pointsCalculated.setText("Points: " + points);
    }
}