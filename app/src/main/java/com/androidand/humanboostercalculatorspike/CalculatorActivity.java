package com.androidand.humanboostercalculatorspike;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
        Button button = (Button) findViewById(R.id.button);
        final Palimdrome palimdrome= new Palimdrome();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = editText.getText().toString();
                if (palimdrome.isPalimdrome(string)) {
                    textView.setText("true");
                    textView.setBackgroundColor(Color.GREEN);
                } else {
                    textView.setText("false");
                    textView.setBackgroundColor(Color.RED);
                }
                textView2.setText(palimdrome.reve(string));
            }
        });

    }

}
