package com.alivin.unitconv;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private  Button gb_button;
    private EditText input_editText;
    private TextView output_textView;
    private Button submit_button;
    private Button submit_button_mb;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button submit_button = findViewById(R.id.submit);               //mile
        Button gb_button = findViewById(R.id.submit2);                  //gb
        Button submit_button_mb = findViewById(R.id.submit3);           //mb
        input_editText = findViewById( R.id.editText);
        output_textView = findViewById(R.id.textView);
        submit_button.setOnClickListener(view -> {
            String input = input_editText.getText().toString();
                int km = Integer.parseInt(input);
                double mile = 1.609 * km;
                output_textView.setText(km + " km = " + mile + " mile.");

            });
        gb_button.setOnClickListener(view -> {
            String input2 = input_editText.getText().toString();
                int mb = Integer.parseInt(input2);
                double gb = 0.0009765625 * mb;
                output_textView.setText(mb+" mb = "+gb +" gb.");
        });

        submit_button_mb.setOnClickListener(view -> {
            String input3 = input_editText.getText().toString();
                int gib = Integer.parseInt(input3);
                double mib = 1024*gib;
                output_textView.setText(gib+" GB is equa to "+mib+" MB");


        });
        }


    public Button getGb_button() {
        return gb_button;
    }
}