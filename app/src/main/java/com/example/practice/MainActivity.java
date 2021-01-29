package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

Button baht,dollar,euro,yen,riyal,pound;
public EditText input;


public void onBaht(View view){

    EditText input=(EditText)findViewById(R.id.input);
    String input_string=input.getText().toString();


        double input_d=Double.parseDouble(input_string);

        TextView result=findViewById(R.id.textView5);
        double ans=input_d*0.41;
        String.format("%.2f",ans);
        result.setText(Double.toString(ans)+" ฿");


}

    public void onDollar(View view){
        EditText input=(EditText)findViewById(R.id.input);
        String input_string=input.getText().toString();


            double input_d=Double.parseDouble(input_string);

            TextView result=findViewById(R.id.textView5);
            double ans=input_d*0.014;
        String.format("%.2f",ans);
            result.setText(Double.toString(ans)+" $");


    }
    public void onYen(View view){
        EditText input=(EditText)findViewById(R.id.input);
        String input_string=input.getText().toString();


            double input_d=Double.parseDouble(input_string);

            TextView result=findViewById(R.id.textView5);
            double ans=input_d*1.44;
            String.format("%.2f",ans);
            result.setText(Double.toString(ans)+"¥");


    }
    public void onPound(View view){
        EditText input=(EditText)findViewById(R.id.input);
        String input_string=input.getText().toString();


            double input_d=Double.parseDouble(input_string);

            TextView result=findViewById(R.id.textView5);
            double ans=input_d*0.010;
        String.format("%.2f",ans);
            result.setText(Double.toString(ans)+" £");


    }
    public void onRiyal(View view){
        EditText input=(EditText)findViewById(R.id.input);
        String input_string=input.getText().toString();


            double input_d=Double.parseDouble(input_string);

            TextView result=findViewById(R.id.textView5);
            double ans=input_d*0.051;
        String.format("%.2f",ans);
            result.setText(Double.toString(ans)+"(SAR)");


    }
    public void onEuro(View view){
        EditText input=(EditText)findViewById(R.id.input);
        String input_string=input.getText().toString();


            double input_d=Double.parseDouble(input_string);

            TextView result=findViewById(R.id.textView5);
            double ans=input_d*0.011;
        String.format("%.2f",ans);
            result.setText(Double.toString(ans)+" €");


    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        input=(EditText)findViewById(R.id.input);
        baht=(Button)findViewById(R.id.Baht_button);
        dollar=(Button)findViewById(R.id.dollar_button);
        yen=(Button)findViewById(R.id.yen_button);
        pound=(Button)findViewById(R.id.pound_button);
        riyal=(Button)findViewById(R.id.riyal_button);
        euro=(Button)findViewById(R.id.euro_button);

        input.addTextChangedListener(textWatcher);
    }
    public TextWatcher textWatcher=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String input_string=input.getText().toString().trim();
            baht.setEnabled(!input_string.isEmpty());
            dollar.setEnabled(!input_string.isEmpty());
            yen.setEnabled(!input_string.isEmpty());
            pound.setEnabled(!input_string.isEmpty());
            riyal.setEnabled(!input_string.isEmpty());
            euro.setEnabled(!input_string.isEmpty());

        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
}
