package com.m6code.footballquizapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Question 1
         */
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


        /**
         * Question 2
         */
        final CheckBox cb_Ques2AnswerA = (CheckBox) findViewById(R.id.cb_ques_2_answer_a);
        final CheckBox cb_Ques2AnswerB = (CheckBox) findViewById(R.id.cb_ques_2_answer_b);
        final CheckBox cb_Ques2AnswerC = (CheckBox) findViewById(R.id.cb_ques_2_answer_c);
        final CheckBox cb_Ques2AnswerD = (CheckBox) findViewById(R.id.cb_ques_2_answer_d);

        final TextView tv_Ques2AnswerA = (TextView) findViewById(R.id.tv_ques_2_answer_a);
        final TextView tv_Ques2AnswerB = (TextView) findViewById(R.id.tv_ques_2_answer_b);
        final TextView tv_Ques2AnswerC = (TextView) findViewById(R.id.tv_ques_2_answer_c);
        final TextView tv_Ques2AnswerD = (TextView) findViewById(R.id.tv_ques_2_answer_d);

        /**
         * Question 3
         */
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

        /**
         * Question 4
         */
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

        /**
         * Question 5
         */
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

        /**
         * Question 6
         */
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

        /**
         * Question 7
         */
        final CheckBox cb_Ques7AnswerA = (CheckBox) findViewById(R.id.cb_ques_7_answer_a);
        final CheckBox cb_Ques7AnswerB = (CheckBox) findViewById(R.id.cb_ques_7_answer_b);
        final CheckBox cb_Ques7AnswerC = (CheckBox) findViewById(R.id.cb_ques_7_answer_c);
        final CheckBox cb_Ques7AnswerD = (CheckBox) findViewById(R.id.cb_ques_7_answer_d);

        final TextView tv_Ques7AnswerA = (TextView) findViewById(R.id.tv_ques_7_answer_a);
        final TextView tv_Ques7AnswerB = (TextView) findViewById(R.id.tv_ques_7_answer_b);
        final TextView tv_Ques7AnswerC = (TextView) findViewById(R.id.tv_ques_7_answer_c);
        final TextView tv_Ques7AnswerD = (TextView) findViewById(R.id.tv_ques_7_answer_d);

        /**
         * Ques tion 8
         */
        final EditText et_Ques8Answer = (EditText) findViewById(R.id.et_ques_8);

        /**
         * Question 9
         */
        final EditText et_Ques9Answer = (EditText) findViewById(R.id.et_ques_9);
        //questionSeven();

        /**
         * Submit all button
         */

        Button btSubmitAll = (Button)findViewById(R.id.bt_submit);

        btSubmitAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int score = 0; // to track correct and incorrect answers
                /**
                 * CHECK IF QUESTION 1 IS CORRECT
                 */
                if (rb_Ques1AnswerB.isChecked()){

                    // set the correct option to be green
                    tv_Ques1AnswerB.setTextColor(Color.GREEN);

                    //Set the text color of others to be red
                    tv_Ques1AnswerA.setTextColor(Color.RED);
                    tv_Ques1AnswerC.setTextColor(Color.RED);
                    tv_Ques1AnswerD.setTextColor(Color.RED);

                    score = score + 1;
                }
                else{
                    tv_Ques1AnswerB.setTextColor(Color.GREEN);

                    //Set the text color of others to be red
                    tv_Ques1AnswerA.setTextColor(Color.RED);
                    tv_Ques1AnswerC.setTextColor(Color.RED);
                    tv_Ques1AnswerD.setTextColor(Color.RED);
                } // CODE FOR QUESTION 1 ENDS HERE

                /**
                 * CHECK IF QUESTION 2 IS CORRECT
                 */
                if ((cb_Ques2AnswerA.isChecked() && cb_Ques2AnswerD.isChecked())
                        && (!cb_Ques2AnswerC.isChecked() && !cb_Ques2AnswerB.isChecked())){
                    // set the correct option to be green
                    tv_Ques2AnswerA.setTextColor(Color.GREEN);
                    tv_Ques2AnswerD.setTextColor(Color.GREEN);

                    //Set the text color of others to be red
                    tv_Ques2AnswerB.setTextColor(Color.RED);
                    tv_Ques2AnswerC.setTextColor(Color.RED);
                    score = score + 1;
                }
                else if (cb_Ques2AnswerB.isChecked() || cb_Ques2AnswerC.isChecked()){
                    // set the correct option to be green
                    tv_Ques2AnswerA.setTextColor(Color.GREEN);
                    tv_Ques2AnswerD.setTextColor(Color.GREEN);

                    //Set the text color of others to be red
                    tv_Ques2AnswerB.setTextColor(Color.RED);
                    tv_Ques2AnswerC.setTextColor(Color.RED);
                }
                else{
                    // set the correct option to be green
                    tv_Ques2AnswerA.setTextColor(Color.GREEN);
                    tv_Ques2AnswerD.setTextColor(Color.GREEN);

                    //Set the text color of others to be red
                    tv_Ques2AnswerB.setTextColor(Color.RED);
                    tv_Ques2AnswerC.setTextColor(Color.RED);
                }// CODE FOR QUESTION 2 ENDS HERE

                /**
                 * CHECK IF QUESTION 3 IS CORRECT
                 */
                if (rb_Ques3AnswerC.isChecked()){

                    // set the correct option to be green
                    tv_Ques3AnswerC.setTextColor(Color.GREEN);

                    //Set the text color of others to be red
                    tv_Ques3AnswerA.setTextColor(Color.RED);
                    tv_Ques3AnswerB.setTextColor(Color.RED);
                    tv_Ques3AnswerD.setTextColor(Color.RED);
                    score = score + 1;
                }
                else{
                    tv_Ques3AnswerC.setTextColor(Color.GREEN);

                    //Set the text color of others to be red
                    tv_Ques3AnswerA.setTextColor(Color.RED);
                    tv_Ques3AnswerB.setTextColor(Color.RED);
                    tv_Ques3AnswerD.setTextColor(Color.RED);
                } // CODE FOR QUESTION 3 ENDS HERE

                /**
                 * CHECK IF QUESTION 4 IS CORRECT
                 */
                if (rb_Ques4AnswerA.isChecked()){

                    // set the correct option to be green
                    tv_Ques4AnswerA.setTextColor(Color.GREEN);

                    //Set the text color of others to be red
                    tv_Ques4AnswerB.setTextColor(Color.RED);
                    tv_Ques4AnswerC.setTextColor(Color.RED);
                    tv_Ques4AnswerD.setTextColor(Color.RED);
                    score = score + 1;
                }
                else{
                    // set the correct option to be green
                    tv_Ques4AnswerA.setTextColor(Color.GREEN);

                    //Set the text color of others to be red
                    tv_Ques4AnswerB.setTextColor(Color.RED);
                    tv_Ques4AnswerC.setTextColor(Color.RED);
                    tv_Ques4AnswerD.setTextColor(Color.RED);
                } // CODE FOR QUESTION 4 ENDS HERE

                /**
                 * CHECK IF QUESTION 5 IS CORRECT
                 */
                if (rb_Ques5AnswerD.isChecked()){

                    // set the correct option to be green
                    tv_Ques5AnswerD.setTextColor(Color.GREEN);

                    //Set the text color of others to be red
                    tv_Ques5AnswerA.setTextColor(Color.RED);
                    tv_Ques5AnswerB.setTextColor(Color.RED);
                    tv_Ques5AnswerC.setTextColor(Color.RED);
                    score = score + 1;
                }
                else{
                    // set the correct option to be green
                    tv_Ques5AnswerD.setTextColor(Color.GREEN);

                    //Set the text color of others to be red
                    tv_Ques5AnswerA.setTextColor(Color.RED);
                    tv_Ques5AnswerB.setTextColor(Color.RED);
                    tv_Ques5AnswerC.setTextColor(Color.RED);
                } // CODE FOR QUESTION 5 ENDS HERE

                /**
                 * CHECK IF QUESTION 6 IS CORRECT
                 */
                if (rb_Ques6AnswerA.isChecked()){

                    // set the correct option to be green
                    tv_Ques6AnswerA.setTextColor(Color.GREEN);

                    //Set the text color of others to be red
                    tv_Ques6AnswerB.setTextColor(Color.RED);
                    tv_Ques6AnswerC.setTextColor(Color.RED);
                    tv_Ques6AnswerD.setTextColor(Color.RED);
                    score = score + 1;
                }
                else{
                    // set the correct option to be green
                    tv_Ques6AnswerA.setTextColor(Color.GREEN);

                    //Set the text color of others to be red
                    tv_Ques6AnswerB.setTextColor(Color.RED);
                    tv_Ques6AnswerC.setTextColor(Color.RED);
                    tv_Ques6AnswerD.setTextColor(Color.RED);
                } // CODE FOR QUESTION 6 ENDS HERE

                /**
                 * CHECK IF QUESTION 7 IS CORRECT
                 */
                if ((cb_Ques7AnswerC.isChecked() && cb_Ques7AnswerD.isChecked())
                        && (!cb_Ques7AnswerA.isChecked() && !cb_Ques7AnswerB.isChecked())){
                    // set the correct option to be green
                    tv_Ques7AnswerC.setTextColor(Color.GREEN);
                    tv_Ques7AnswerD.setTextColor(Color.GREEN);

                    //Set the text color of others to be red
                    tv_Ques7AnswerA.setTextColor(Color.RED);
                    tv_Ques7AnswerB.setTextColor(Color.RED);
                    score = score + 1;
                }
                else if (cb_Ques7AnswerA.isChecked() || cb_Ques7AnswerB.isChecked()){
                    // set the correct option to be green
                    tv_Ques7AnswerC.setTextColor(Color.GREEN);
                    tv_Ques7AnswerD.setTextColor(Color.GREEN);

                    //Set the text color of others to be red
                    tv_Ques7AnswerA.setTextColor(Color.RED);
                    tv_Ques7AnswerB.setTextColor(Color.RED);
                }
                else{
                    // set the correct option to be green
                    tv_Ques7AnswerC.setTextColor(Color.GREEN);
                    tv_Ques7AnswerD.setTextColor(Color.GREEN);

                    //Set the text color of others to be red
                    tv_Ques7AnswerA.setTextColor(Color.RED);
                    tv_Ques7AnswerB.setTextColor(Color.RED);
                }// CODE FOR QUESTION 7 ENDS HERE

                // CHECK IF QUESTION 8 IS CORRECT
                if (et_Ques8Answer.getText().toString().equals("Manchester United") || et_Ques8Answer.getText().toString().equals("manchester united")) {
                    et_Ques8Answer.setTextColor(Color.GREEN);
                    score = score + 1;
                } else {
                    et_Ques8Answer.setText("'Manchester United' is the correct answer");
                    et_Ques8Answer.setTextColor(Color.GREEN);
                }

                // CHECK IF QUESTION 9 IS CORRECT
                if (et_Ques9Answer.getText().toString().equals("1996")) {
                    et_Ques9Answer.setTextColor(Color.GREEN);
                    score = score + 1;
                } else {
                    et_Ques9Answer.setText("'1996' is the correct answer");
                    et_Ques9Answer.setTextColor(Color.GREEN);
                }


                Toast.makeText(getApplicationContext(),"Your scored "+Integer.toString(score)+"/9",Toast.LENGTH_LONG).show();
            }
        });


    }

}
