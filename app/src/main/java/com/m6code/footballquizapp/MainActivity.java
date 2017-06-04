package com.m6code.footballquizapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionOne();
        //questionTwo();
        questionThree();
        questionFour();
        questionFive();
        questionSix();
        //questionSeven();


    }

    /**
     * Code for question on goes here
     */
    public void questionOne() {
        //For the radio buttons
        final RadioButton rb_Ques1AnswerA = (RadioButton) findViewById(R.id.rb_ques_1_answer_a);
        final RadioButton rb_Ques1AnswerB = (RadioButton) findViewById(R.id.rb_ques_1_answer_b);
        final RadioButton rb_Ques1AnswerC = (RadioButton) findViewById(R.id.rb_ques_1_answer_c);
        final RadioButton rb_Ques1AnswerD = (RadioButton) findViewById(R.id.rb_ques_1_answer_d);

        final TextView tv_Ques1AnswerA = (TextView) findViewById(R.id.tv_ques_1_answer_a);
        final TextView tv_Ques1AnswerB = (TextView) findViewById(R.id.tv_ques_1_answer_b);
        final TextView tv_Ques1AnswerC = (TextView) findViewById(R.id.tv_ques_1_answer_c);
        final TextView tv_Ques1AnswerD = (TextView) findViewById(R.id.tv_ques_1_answer_d);

        //Set the onClick listener for when rb_ques_1_answer_a is click/selected
        rb_Ques1AnswerA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Ques1AnswerA.setTextColor(Color.rgb(255, 165, 0));

                //Set the text color of others to be black
                tv_Ques1AnswerB.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques1AnswerC.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques1AnswerD.setTextColor(Color.rgb(127, 127, 127));

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
                tv_Ques1AnswerB.setTextColor(Color.rgb(255, 165, 0));

                //Set the text color of others to be black
                tv_Ques1AnswerA.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques1AnswerC.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques1AnswerD.setTextColor(Color.rgb(127, 127, 127));

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
                tv_Ques1AnswerC.setTextColor(Color.rgb(255, 165, 0));
                //Set the text color of others to be black

                tv_Ques1AnswerA.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques1AnswerB.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques1AnswerD.setTextColor(Color.rgb(127, 127, 127));

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
                tv_Ques1AnswerD.setTextColor(Color.rgb(255, 165, 0));
                //Set the text color of others to be black

                tv_Ques1AnswerA.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques1AnswerB.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques1AnswerC.setTextColor(Color.rgb(127, 127, 127));

                //set the other check boxes to unchecked
                rb_Ques1AnswerA.setChecked(false);
                rb_Ques1AnswerB.setChecked(false);
                rb_Ques1AnswerC.setChecked(false);
            }
        });
    }

    public void questionThree(){
        //For the radio buttons
        final RadioButton rb_Ques3AnswerA = (RadioButton) findViewById(R.id.rb_ques_3_answer_a);
        final RadioButton rb_Ques3AnswerB = (RadioButton) findViewById(R.id.rb_ques_3_answer_b);
        final RadioButton rb_Ques3AnswerC = (RadioButton) findViewById(R.id.rb_ques_3_answer_c);
        final RadioButton rb_Ques3AnswerD = (RadioButton) findViewById(R.id.rb_ques_3_answer_d);

        final TextView tv_Ques3AnswerA = (TextView) findViewById(R.id.tv_ques_3_answer_a);
        final TextView tv_Ques3AnswerB = (TextView) findViewById(R.id.tv_ques_3_answer_b);
        final TextView tv_Ques3AnswerC = (TextView) findViewById(R.id.tv_ques_3_answer_c);
        final TextView tv_Ques3AnswerD = (TextView) findViewById(R.id.tv_ques_3_answer_d);

        //Set the onClick listener for when rb_ques_1_answer_a is click/selected
        rb_Ques3AnswerA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Ques3AnswerA.setTextColor(Color.rgb(255, 165, 0));

                //Set the text color of others to be black
                tv_Ques3AnswerB.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques3AnswerC.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques3AnswerD.setTextColor(Color.rgb(127, 127, 127));

                //set the other check boxes to unchecked
                rb_Ques3AnswerB.setChecked(false);
                rb_Ques3AnswerC.setChecked(false);
                rb_Ques3AnswerD.setChecked(false);
            }
        });

        //Set the onClick listener for when rb_ques_1_answer_b is click/selected
        rb_Ques3AnswerB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Set the text color to be orange
                tv_Ques3AnswerB.setTextColor(Color.rgb(255, 165, 0));

                //Set the text color of others to be black
                tv_Ques3AnswerA.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques3AnswerC.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques3AnswerD.setTextColor(Color.rgb(127, 127, 127));

                //set the other check boxes to unchecked
                rb_Ques3AnswerA.setChecked(false);
                rb_Ques3AnswerC.setChecked(false);
                rb_Ques3AnswerD.setChecked(false);
            }
        });

        //Set the onClick listener for when rb_ques_1_answer_c is click/selected
        rb_Ques3AnswerC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Ques3AnswerC.setTextColor(Color.rgb(255, 165, 0));
                //Set the text color of others to be black

                tv_Ques3AnswerA.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques3AnswerB.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques3AnswerD.setTextColor(Color.rgb(127, 127, 127));

                //set the other check boxes to unchecked
                rb_Ques3AnswerA.setChecked(false);
                rb_Ques3AnswerB.setChecked(false);
                rb_Ques3AnswerD.setChecked(false);
            }
        });

        //Set the onClick listener for when rb_ques_1_answer_d is click/selected
        rb_Ques3AnswerD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Ques3AnswerD.setTextColor(Color.rgb(255, 165, 0));
                //Set the text color of others to be black

                tv_Ques3AnswerA.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques3AnswerB.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques3AnswerC.setTextColor(Color.rgb(127, 127, 127));

                //set the other check boxes to unchecked
                rb_Ques3AnswerA.setChecked(false);
                rb_Ques3AnswerB.setChecked(false);
                rb_Ques3AnswerC.setChecked(false);
            }
        });
    }

    public void questionFour(){
        //For the radio buttons
        final RadioButton rb_Ques4AnswerA = (RadioButton) findViewById(R.id.rb_ques_4_answer_a);
        final RadioButton rb_Ques4AnswerB = (RadioButton) findViewById(R.id.rb_ques_4_answer_b);
        final RadioButton rb_Ques4AnswerC = (RadioButton) findViewById(R.id.rb_ques_4_answer_c);
        final RadioButton rb_Ques4AnswerD = (RadioButton) findViewById(R.id.rb_ques_4_answer_d);

        final TextView tv_Ques4AnswerA = (TextView) findViewById(R.id.tv_ques_4_answer_a);
        final TextView tv_Ques4AnswerB = (TextView) findViewById(R.id.tv_ques_4_answer_b);
        final TextView tv_Ques4AnswerC = (TextView) findViewById(R.id.tv_ques_4_answer_c);
        final TextView tv_Ques4AnswerD = (TextView) findViewById(R.id.tv_ques_4_answer_d);

        //Set the onClick listener for when rb_ques_1_answer_a is click/selected
        rb_Ques4AnswerA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Ques4AnswerA.setTextColor(Color.rgb(255, 165, 0));

                //Set the text color of others to be black
                tv_Ques4AnswerB.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques4AnswerC.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques4AnswerD.setTextColor(Color.rgb(127, 127, 127));

                //set the other check boxes to unchecked
                rb_Ques4AnswerB.setChecked(false);
                rb_Ques4AnswerC.setChecked(false);
                rb_Ques4AnswerD.setChecked(false);
            }
        });

        //Set the onClick listener for when rb_ques_1_answer_b is click/selected
        rb_Ques4AnswerB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Set the text color to be orange
                tv_Ques4AnswerB.setTextColor(Color.rgb(255, 165, 0));

                //Set the text color of others to be black
                tv_Ques4AnswerA.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques4AnswerC.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques4AnswerD.setTextColor(Color.rgb(127, 127, 127));

                //set the other check boxes to unchecked
                rb_Ques4AnswerA.setChecked(false);
                rb_Ques4AnswerC.setChecked(false);
                rb_Ques4AnswerD.setChecked(false);
            }
        });

        //Set the onClick listener for when rb_ques_1_answer_c is click/selected
        rb_Ques4AnswerC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Ques4AnswerC.setTextColor(Color.rgb(255, 165, 0));
                //Set the text color of others to be black

                tv_Ques4AnswerA.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques4AnswerB.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques4AnswerD.setTextColor(Color.rgb(127, 127, 127));

                //set the other check boxes to unchecked
                rb_Ques4AnswerA.setChecked(false);
                rb_Ques4AnswerB.setChecked(false);
                rb_Ques4AnswerD.setChecked(false);
            }
        });

        //Set the onClick listener for when rb_ques_1_answer_d is click/selected
        rb_Ques4AnswerD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Ques4AnswerD.setTextColor(Color.rgb(255, 165, 0));
                //Set the text color of others to be black

                tv_Ques4AnswerA.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques4AnswerB.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques4AnswerC.setTextColor(Color.rgb(127, 127, 127));

                //set the other check boxes to unchecked
                rb_Ques4AnswerA.setChecked(false);
                rb_Ques4AnswerB.setChecked(false);
                rb_Ques4AnswerC.setChecked(false);
            }
        });
    }

    public void questionFive(){
        //For the radio buttons
        final RadioButton rb_Ques5AnswerA = (RadioButton) findViewById(R.id.rb_ques_5_answer_a);
        final RadioButton rb_Ques5AnswerB = (RadioButton) findViewById(R.id.rb_ques_5_answer_b);
        final RadioButton rb_Ques5AnswerC = (RadioButton) findViewById(R.id.rb_ques_5_answer_c);
        final RadioButton rb_Ques5AnswerD = (RadioButton) findViewById(R.id.rb_ques_5_answer_d);

        final TextView tv_Ques5AnswerA = (TextView) findViewById(R.id.tv_ques_5_answer_a);
        final TextView tv_Ques5AnswerB = (TextView) findViewById(R.id.tv_ques_5_answer_b);
        final TextView tv_Ques5AnswerC = (TextView) findViewById(R.id.tv_ques_5_answer_c);
        final TextView tv_Ques5AnswerD = (TextView) findViewById(R.id.tv_ques_5_answer_d);

        //Set the onClick listener for when rb_ques_1_answer_a is click/selected
        rb_Ques5AnswerA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Ques5AnswerA.setTextColor(Color.rgb(255, 165, 0));

                //Set the text color of others to be black
                tv_Ques5AnswerB.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques5AnswerC.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques5AnswerD.setTextColor(Color.rgb(127, 127, 127));

                //set the other check boxes to unchecked
                rb_Ques5AnswerB.setChecked(false);
                rb_Ques5AnswerC.setChecked(false);
                rb_Ques5AnswerD.setChecked(false);
            }
        });

        //Set the onClick listener for when rb_ques_1_answer_b is click/selected
        rb_Ques5AnswerB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Set the text color to be orange
                tv_Ques5AnswerB.setTextColor(Color.rgb(255, 165, 0));

                //Set the text color of others to be black
                tv_Ques5AnswerA.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques5AnswerC.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques5AnswerD.setTextColor(Color.rgb(127, 127, 127));

                //set the other check boxes to unchecked
                rb_Ques5AnswerA.setChecked(false);
                rb_Ques5AnswerC.setChecked(false);
                rb_Ques5AnswerD.setChecked(false);
            }
        });

        //Set the onClick listener for when rb_ques_1_answer_c is click/selected
        rb_Ques5AnswerC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Ques5AnswerC.setTextColor(Color.rgb(255, 165, 0));
                //Set the text color of others to be black

                tv_Ques5AnswerA.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques5AnswerB.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques5AnswerD.setTextColor(Color.rgb(127, 127, 127));

                //set the other check boxes to unchecked
                rb_Ques5AnswerA.setChecked(false);
                rb_Ques5AnswerB.setChecked(false);
                rb_Ques5AnswerD.setChecked(false);
            }
        });

        //Set the onClick listener for when rb_ques_1_answer_d is click/selected
        rb_Ques5AnswerD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Ques5AnswerD.setTextColor(Color.rgb(255, 165, 0));
                //Set the text color of others to be black

                tv_Ques5AnswerA.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques5AnswerB.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques5AnswerC.setTextColor(Color.rgb(127, 127, 127));

                //set the other check boxes to unchecked
                rb_Ques5AnswerA.setChecked(false);
                rb_Ques5AnswerB.setChecked(false);
                rb_Ques5AnswerC.setChecked(false);
            }
        });
    }

    public void questionSix(){
        //For the radio buttons
        final RadioButton rb_Ques6AnswerA = (RadioButton) findViewById(R.id.rb_ques_6_answer_a);
        final RadioButton rb_Ques6AnswerB = (RadioButton) findViewById(R.id.rb_ques_6_answer_b);
        final RadioButton rb_Ques6AnswerC = (RadioButton) findViewById(R.id.rb_ques_6_answer_c);
        final RadioButton rb_Ques6AnswerD = (RadioButton) findViewById(R.id.rb_ques_6_answer_d);

        final TextView tv_Ques6AnswerA = (TextView) findViewById(R.id.tv_ques_6_answer_a);
        final TextView tv_Ques6AnswerB = (TextView) findViewById(R.id.tv_ques_6_answer_b);
        final TextView tv_Ques6AnswerC = (TextView) findViewById(R.id.tv_ques_6_answer_c);
        final TextView tv_Ques6AnswerD = (TextView) findViewById(R.id.tv_ques_6_answer_d);

        //Set the onClick listener for when rb_ques_1_answer_a is click/selected
        rb_Ques6AnswerA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Ques6AnswerA.setTextColor(Color.rgb(255, 165, 0));

                //Set the text color of others to be black
                tv_Ques6AnswerB.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques6AnswerC.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques6AnswerD.setTextColor(Color.rgb(127, 127, 127));

                //set the other check boxes to unchecked
                rb_Ques6AnswerB.setChecked(false);
                rb_Ques6AnswerC.setChecked(false);
                rb_Ques6AnswerD.setChecked(false);
            }
        });

        //Set the onClick listener for when rb_ques_1_answer_b is click/selected
        rb_Ques6AnswerB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Set the text color to be orange
                tv_Ques6AnswerB.setTextColor(Color.rgb(255, 165, 0));

                //Set the text color of others to be black
                tv_Ques6AnswerA.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques6AnswerC.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques6AnswerD.setTextColor(Color.rgb(127, 127, 127));

                //set the other check boxes to unchecked
                rb_Ques6AnswerA.setChecked(false);
                rb_Ques6AnswerC.setChecked(false);
                rb_Ques6AnswerD.setChecked(false);
            }
        });

        //Set the onClick listener for when rb_ques_1_answer_c is click/selected
        rb_Ques6AnswerC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Ques6AnswerC.setTextColor(Color.rgb(255, 165, 0));
                //Set the text color of others to be black

                tv_Ques6AnswerA.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques6AnswerB.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques6AnswerD.setTextColor(Color.rgb(127, 127, 127));

                //set the other check boxes to unchecked
                rb_Ques6AnswerA.setChecked(false);
                rb_Ques6AnswerB.setChecked(false);
                rb_Ques6AnswerD.setChecked(false);
            }
        });

        //Set the onClick listener for when rb_ques_1_answer_d is click/selected
        rb_Ques6AnswerD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Ques6AnswerD.setTextColor(Color.rgb(255, 165, 0));
                //Set the text color of others to be black

                tv_Ques6AnswerA.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques6AnswerB.setTextColor(Color.rgb(127, 127, 127));
                tv_Ques6AnswerC.setTextColor(Color.rgb(127, 127, 127));

                //set the other check boxes to unchecked
                rb_Ques6AnswerA.setChecked(false);
                rb_Ques6AnswerB.setChecked(false);
                rb_Ques6AnswerC.setChecked(false);
            }
        });
    }
}
