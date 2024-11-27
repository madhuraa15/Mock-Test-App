package com.example.login10;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CLevel1 extends AppCompatActivity implements View.OnClickListener {

    TextView TotalQuestionsTextView;
    TextView questionTextview;
    Button ansA,ansB,ansC,ansD;
    Button submit_btn;


    int score=0;
    int TotalQuestion = CQuestionAnswer1.question.length;
    int currentQuestionIndex = 0 ;
    String selectedAnswer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clevel1);

        TotalQuestionsTextView = findViewById(R.id.total_question);
        questionTextview = findViewById(R.id.question);
        ansA = findViewById(R.id.ans_A);
        ansB = findViewById(R.id.ans_B);
        ansC = findViewById(R.id.ans_C);
        ansD = findViewById(R.id.ans_D);
        submit_btn = findViewById(R.id.submit_btn);

        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        submit_btn.setOnClickListener(this);

        TotalQuestionsTextView.setText("Total Questions : " + TotalQuestion);

        LoadNewQuestion();
    }

    public void onClick(View view) {

        ansA.setBackgroundColor(Color.GREEN);
        ansB.setBackgroundColor(Color.GREEN);
        ansC.setBackgroundColor(Color.GREEN);
        ansD.setBackgroundColor(Color.GREEN);

        Button clickedButton = (Button) view;

        if(clickedButton.getId()==R.id.submit_btn)
        {

            if(selectedAnswer.equals(CQuestionAnswer1.correctAnswer[currentQuestionIndex]))
            {
                score++;
            }
            currentQuestionIndex++;
            LoadNewQuestion();
        }
        else
        {
            selectedAnswer = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.MAGENTA);
        }

    }

    void LoadNewQuestion() {

        if(currentQuestionIndex == TotalQuestion)
        {
            finishQuiz();
            return;
        }

        questionTextview.setText(CQuestionAnswer1.question[currentQuestionIndex]);
        ansA.setText(CQuestionAnswer1.choices[currentQuestionIndex][0]);
        ansB.setText(CQuestionAnswer1.choices[currentQuestionIndex][1]);
        ansC.setText(CQuestionAnswer1.choices[currentQuestionIndex][2]);
        ansD.setText(CQuestionAnswer1.choices[currentQuestionIndex][3]);
    }

    void finishQuiz() {

        String passStatus = "";

        if(score > TotalQuestion*0.40)
        {
            passStatus = "You have Cleared this level!! Move to next Level";
        }
        else
        {
            passStatus = "You should Practice more to clear this level";
        }

        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Your Score is "+ score+" out of "+ TotalQuestion)
                .setPositiveButton("Restart",(DialogInterface,i) -> RestartQuiz())
                .setCancelable(false)
                .show();
    }

    void RestartQuiz() {
        score = 0;
        currentQuestionIndex = 0;
        LoadNewQuestion();

    }



}

