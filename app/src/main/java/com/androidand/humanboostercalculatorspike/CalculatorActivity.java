package com.androidand.humanboostercalculatorspike;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.androidand.humanboostercalculatorspike.business.Palimdrome;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        final TextView textView = (TextView) findViewById(R.id.text);
        final TextView textView2 = (TextView) findViewById(R.id.text2);
        final EditText editText = (EditText) findViewById(R.id.edit_text);
        final Palimdrome palimdrome= new Palimdrome();
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (palimdrome.isPalimdrome(s.toString())) {
                    textView.setText("true");
                    textView.setBackgroundColor(Color.GREEN);
                } else {
                    textView.setText("false");
                    textView.setBackgroundColor(Color.RED);
                }
                textView2.setText(palimdrome.reve(s.toString()));
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }

}
