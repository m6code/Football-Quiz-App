package com.m6code.footballquizapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Codes for Question 1 goes here
        //For the radio buttons
        final RadioButton rb_Ques1AnswerA = (RadioButton) findViewById(R.id.rb_ques_1_answer_a);
        final RadioButton rb_Ques1AnswerB = (RadioButton) findViewById(R.id.rb_ques_1_answer_b);
        final RadioButton rb_Ques1AnswerC = (RadioButton) findViewById(R.id.rb_ques_1_answer_c);
        final RadioButton rb_Ques1AnswerD = (RadioButton) findViewById(R.id.rb_ques_1_answer_d);

        final TextView tv_Ques1AnswerA = (TextView)findViewById(R.id.tv_ques_1_answer_a);
        final TextView tv_Ques1AnswerB = (TextView)findViewById(R.id.tv_ques_1_answer_b);
        final TextView tv_Ques1AnswerC = (TextView)findViewById(R.id.tv_ques_1_answer_c);
        final TextView tv_Ques1AnswerD = (TextView)findViewById(R.id.tv_ques_1_answer_d);

        //Set the onClick listener for when rb_ques_1_answer_a is click/selected
        rb_Ques1AnswerA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Ques1AnswerA.setTextColor(Color.rgb(255,165,0));
                //Set the text color of others to be black
                tv_Ques1AnswerB.setTextColor(Color.rgb(127,127,127));
                tv_Ques1AnswerC.setTextColor(Color.rgb(127,127,127));
                tv_Ques1AnswerD.setTextColor(Color.rgb(127,127,127));
                //set the other check boxes to unchecked
                rb_Ques1AnswerB.setChecked(false);
                rb_Ques1AnswerC.setChecked(false);
                rb_Ques1AnswerD.setChecked(false);
            }
        });

        //Set the onClick listener for when rb_ques_1_answer_b is click/selected
        rb_Ques1AnswerB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Set the text color to be orange
                tv_Ques1AnswerB.setTextColor(Color.rgb(255,165,0));
                //Set the text color of others to be black
                tv_Ques1AnswerA.setTextColor(Color.rgb(127,127,127));
                tv_Ques1AnswerC.setTextColor(Color.rgb(127,127,127));
                tv_Ques1AnswerD.setTextColor(Color.rgb(127,127,127));
                //set the other check boxes to unchecked
                rb_Ques1AnswerA.setChecked(false);
                rb_Ques1AnswerC.setChecked(false);
                rb_Ques1AnswerD.setChecked(false);
            }
        });

        //Set the onClick listener for when rb_ques_1_answer_c is click/selected
        rb_Ques1AnswerC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Ques1AnswerC.setTextColor(Color.rgb(255,165,0));
                //Set the text color of others to be black
                tv_Ques1AnswerA.setTextColor(Color.rgb(127,127,127));
                tv_Ques1AnswerB.setTextColor(Color.rgb(127,127,127));
                tv_Ques1AnswerD.setTextColor(Color.rgb(127,127,127));
                //set the other check boxes to unchecked
                rb_Ques1AnswerA.setChecked(false);
                rb_Ques1AnswerB.setChecked(false);
                rb_Ques1AnswerD.setChecked(false);
            }
        });

        //Set the onClick listener for when rb_ques_1_answer_d is click/selected
        rb_Ques1AnswerD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Ques1AnswerD.setTextColor(Color.rgb(255,165,0));
                //Set the text color of others to be black
                tv_Ques1AnswerA.setTextColor(Color.rgb(127,127,127));
                tv_Ques1AnswerB.setTextColor(Color.rgb(127,127,127));
                tv_Ques1AnswerC.setTextColor(Color.rgb(127,127,127));
                //set the other check boxes to unchecked
                rb_Ques1AnswerA.setChecked(false);
                rb_Ques1AnswerB.setChecked(false);
                rb_Ques1AnswerC.setChecked(false);
            }
        });
    }
}
