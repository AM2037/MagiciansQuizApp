package com.example.android.magiciansquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //global variable for score
    private int score = 0;

    //nameField global
    private EditText nameField;

    //checkbox globals -- Question 5
    CheckBox Q5firstCheckBox = null;
    CheckBox Q5secondCheckBox = null;
    CheckBox Q5thirdCheckBox = null;
    CheckBox Q5fourthCheckBox = null;
    CheckBox Q5fifthCheckBox = null;
    CheckBox Q5sixthCheckBox = null;
    //checkbox globals -- Question 8
    CheckBox Q8firstCheckBox = null;
    CheckBox Q8secondCheckBox = null;
    CheckBox Q8thirdCheckBox = null;
    CheckBox Q8fourthCheckBox = null;
    CheckBox Q8fifthCheckBox = null;
    CheckBox Q8sixthCheckBox = null;
    //checkbox globals -- Question 10
    CheckBox Q10firstCheckBox = null;
    CheckBox Q10secondCheckBox = null;
    CheckBox Q10thirdCheckBox = null;
    CheckBox Q10fourthCheckBox = null;
    CheckBox Q10fifthCheckBox = null;
    CheckBox Q10sixthCheckBox = null;

    //open-ended global
    EditText responseField = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameField = findViewById(R.id.name_field);
        //checkbox onCreate Q5
        Q5firstCheckBox = findViewById(R.id.Q5_checkbox_1);
        Q5secondCheckBox = findViewById(R.id.Q5_checkbox_2);
        Q5thirdCheckBox = findViewById(R.id.Q5_checkbox_3_wrong);
        Q5fourthCheckBox = findViewById(R.id.Q5_checkbox_4);
        Q5fifthCheckBox = findViewById(R.id.Q5_checkbox_5);
        Q5sixthCheckBox = findViewById(R.id.Q5_checkbox_6);
        //checkbox onCreate Q8
        Q8firstCheckBox = findViewById(R.id.Q8_checkbox_1);
        Q8secondCheckBox = findViewById(R.id.Q8_checkbox_2_wrong);
        Q8thirdCheckBox = findViewById(R.id.Q8_checkbox_3_wrong);
        Q8fourthCheckBox = findViewById(R.id.Q8_checkbox_4);
        Q8fifthCheckBox = findViewById(R.id.Q8_checkbox_5_wrong);
        Q8sixthCheckBox = findViewById(R.id.Q8_checkbox_6);
        //checkbox onCreate Q10
        Q10firstCheckBox = findViewById(R.id.Q10_checkbox_1_wrong);
        Q10secondCheckBox = findViewById(R.id.Q10_checkbox_2);
        Q10thirdCheckBox = findViewById(R.id.Q10_checkbox_3);
        Q10fourthCheckBox = findViewById(R.id.Q10_checkbox_4);
        Q10fifthCheckBox = findViewById(R.id.Q10_checkbox_5_wrong);
        Q10sixthCheckBox = findViewById(R.id.Q10_checkbox_6);
        //open-ended onCreate Q4
        responseField = findViewById(R.id.response_field);

    }

    /**
     * First Question
     * Radio Group 1
     */
    public void radio1(View view) {
        if(view.getId() == R.id.answer_q1) {
            score += 1;
            Toast.makeText(this, getString(R.string.toast_correct), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, getString(R.string.toast_wrong), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Second Question
     * Radio Group 2
     */
    public void radio2(View view) {
        if(view.getId() == R.id.answer_q2) {
            score += 1;
            Toast.makeText(this, getString(R.string.toast_correct), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, getString(R.string.toast_wrong), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Third Question
     * Radio Group 3
     */
    public void radio3(View view) {
        if(view.getId() == R.id.answer_q3) {
            score += 1;
            Toast.makeText(this, getString(R.string.toast_correct), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, getString(R.string.toast_wrong), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Fourth Question
     */
    public void Q4Result() {
        EditText et = findViewById(R.id.response_field);
        String answer = et.getText().toString();


        if (answer.equals("Janet")) {
            score += 1;

        } else {
            Toast.makeText(this, getString(R.string.toast_wrong), Toast.LENGTH_SHORT).show();
        }
    }



    /**
     * Fifth Question
     */
    public void checkBoxOne(View view){

        if (Q5firstCheckBox.isChecked() && Q5secondCheckBox.isChecked() && !Q5thirdCheckBox.isChecked() && Q5fourthCheckBox.isChecked() && Q5fifthCheckBox.isChecked() && Q5sixthCheckBox.isChecked()) {
            score += 1;
            Toast.makeText(this, getString(R.string.toast_correct), Toast.LENGTH_SHORT).show();
        }

        if (Q5thirdCheckBox.isChecked()) {
            Toast.makeText(this, getString(R.string.toast_wrong), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Sixth Question
     * Radio Group 4
     */
    public void radio4(View view) {
        if(view.getId() == R.id.answer_q6) {
            score += 1;
            Toast.makeText(this, getString(R.string.toast_correct), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, getString(R.string.toast_wrong), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Seventh Question
     * Radio Group 5
     */
    public void radio5(View view) {
        if(view.getId() == R.id.answer_q7) {
            score += 1;
            Toast.makeText(this, getString(R.string.toast_correct), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, getString(R.string.toast_wrong), Toast.LENGTH_SHORT).show();
        }
    }


    /**
     * Eighth Question
     */

    public void checkBoxTwo(View view){

        if (Q8firstCheckBox.isChecked() && !Q8secondCheckBox.isChecked() && !Q8thirdCheckBox.isChecked() && Q8fourthCheckBox.isChecked() && !Q8fifthCheckBox.isChecked() && Q8sixthCheckBox.isChecked()) {
            score += 1;
            Toast.makeText(this, getString(R.string.toast_correct), Toast.LENGTH_SHORT).show();
        }

        if (Q8secondCheckBox.isChecked() || Q8thirdCheckBox.isChecked() || Q8fifthCheckBox.isChecked()) {
            Toast.makeText(this, getString(R.string.toast_wrong), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Ninth Question
     * Radio Group 6
     */
    public void radio6(View view) {
        if(view.getId() == R.id.answer_q9) {
            score += 1;
            Toast.makeText(this, getString(R.string.toast_correct), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, getString(R.string.toast_wrong), Toast.LENGTH_SHORT).show();
        }
    }


    /**
     * Tenth Question
     */
    public void checkBoxThree(View view){

        if (!Q10firstCheckBox.isChecked() && Q10secondCheckBox.isChecked() && Q10thirdCheckBox.isChecked() && Q10fourthCheckBox.isChecked() && Q10fifthCheckBox.isChecked() && Q10sixthCheckBox.isChecked()) {
            score += 1;
            Toast.makeText(this, getString(R.string.toast_correct), Toast.LENGTH_SHORT).show();
        }

        if (Q10firstCheckBox.isChecked() || Q10fifthCheckBox.isChecked()) {
            Toast.makeText(this, getString(R.string.toast_wrong), Toast.LENGTH_SHORT).show();
        }
    }



    /**
     * For Score Summary
     */

    public void setScore(View view) {
        Q4Result();
        String scoreSummary = createScoreSummary(nameField.getText().toString(), score);
        Toast.makeText(this, scoreSummary,Toast.LENGTH_SHORT).show();
    }


    private String createScoreSummary(String name, int score) {
        String scoreSummary = String.format(getString(R.string.score_summary_name), name);
        scoreSummary += "\n" + getString(R.string.score_summary_score) + score;
        return scoreSummary;


    }

}
