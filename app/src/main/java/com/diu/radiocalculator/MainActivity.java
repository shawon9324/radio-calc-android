package com.diu.radiocalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public  static final String extraNumber="com.diu.radiocalculator";
    EditText n1,n2;
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button Calculation;
    EditText edit;
    protected Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        radioGroup = findViewById(R.id.radiogroup);
        Calculation = findViewById(R.id.cal);
        final String myString = "THIS IS HWLL";

























        Calculation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value1 = Integer.parseInt(n1.getText().toString());
                int value2 = Integer.parseInt(n2.getText().toString());
                int radio = radioGroup.getCheckedRadioButtonId();



                if (radio==R.id.sum)
                {
                    int result = value1+value2;
                    Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                    intent.putExtra(extraNumber,result);
                    startActivity(intent);

                }
                else if (radio == R.id.sub)
                {
                    int result = value1-value2;
                    Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                    intent.putExtra(extraNumber,result);
                    startActivity(intent);

                }
                else if(radio == R.id.mul)
                {
                    int result = value1*value2;
                    Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                    intent.putExtra(extraNumber,result);
                    startActivity(intent);


                }
                else if (radio == R.id.div)
                {
                    int result = value1/value2;
                    Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                    intent.putExtra(extraNumber,result);
                    startActivity(intent);
                }
                Toast.makeText(getApplicationContext(),myString,Toast.LENGTH_SHORT).show();


            }
        });

    }

}
