package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    String[] unitts={"Metre","Foot","Inch","Kilometre","Centimetre","Millimetre"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spin1=findViewById(R.id.unit1);
        Spinner spin=findViewById(R.id.unitts);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,unitts);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spin.setAdapter(adapter);
        spin1.setAdapter(adapter);
        Button calc=(Button) findViewById(R.id.cal);
        calc.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Spinner fromSpinner, toSpinner;
        EditText fromEditText;
        TextView displ;
        fromSpinner = (Spinner) findViewById(R.id.unit1);
        toSpinner = (Spinner) findViewById(R.id.unitts);
        fromEditText = (EditText) findViewById(R.id.vall);
        displ = (TextView) findViewById(R.id.conval);
        displ.setTextColor(Color.MAGENTA);

        // Get the string from the Spinners and number from the EditText
        String fromUnit = (String) fromSpinner.getSelectedItem();
        String toUnit = (String) toSpinner.getSelectedItem();
        double input = Double.valueOf(fromEditText.getText().toString());
        // Convert the strings to something in our Unit enu,
        if(fromUnit=="Kilometre"&&toUnit=="Metre")
        {
            displ.setText(String.valueOf(input*1000));

        }
        else if(fromUnit=="Metre"&&toUnit=="Kilometre")
        {
            displ.setText(String.valueOf(input/1000));

        }
        else if(fromUnit=="Metre"&&toUnit=="Foot")
        {
            displ.setText(String.valueOf(input*3.2808399));


        }
        else if(fromUnit=="Foot"&&toUnit=="Metre")
        {
            displ.setText(String.valueOf(input/3.2808399));


        }
        else if(fromUnit=="Inch"&&toUnit=="Centimetre")
        {
            displ.setText(String.valueOf(input*2.54));


        }
        else if(fromUnit=="Centimetre"&&toUnit=="Inch")
        {
            displ.setText(String.valueOf(input*0.393700787));
        }
        else if(fromUnit=="Metre"&&toUnit=="Inch")
        {
            displ.setText(String.valueOf(input*39.3700787));
        }
        else if(fromUnit=="Inch"&&toUnit=="Metre")
        {
            displ.setText(String.valueOf(input/39.3700787));

        }
        else if(fromUnit=="Metre"&&toUnit=="Centimetre")
        {
            displ.setText(String.valueOf(input*100));
        }
        else if(fromUnit=="Centimetre"&&toUnit=="Metre")
        {
            displ.setText(String.valueOf(input/100));
        }
        else if(fromUnit=="Metre"&&toUnit=="Millimetre")
        {
            displ.setText(String.valueOf(input*1000));
        }
        else if(fromUnit=="Foot"&&toUnit=="Inch")
        {
            displ.setText(String.valueOf(input*12));
        }
        else if(fromUnit=="Inch"&&toUnit=="Foot")
        {
            displ.setText(String.valueOf(input/12));
        }
        else if(fromUnit=="Kilometre"&&toUnit=="Foot")
        {
            displ.setText(String.valueOf(input*3280.8399));
        }
        else if(fromUnit=="Foot"&&toUnit=="Centimetre")
        {
            displ.setText(String.valueOf(input*30.48));
        }
        else if(fromUnit=="Centimetre"&&toUnit=="Foot")
        {
            displ.setText(String.valueOf(input/30.48));
        }
        else if(fromUnit=="Foot"&&toUnit=="Millimetre")
        {
            displ.setText(String.valueOf(input*304.8));
        }
        else if(fromUnit=="Millimetre"&&toUnit=="Foot")
        {
            displ.setText(String.valueOf(input/304.8));
        }
        else if(fromUnit=="Inch"&&toUnit=="Kilometre")
        {
            displ.setText(String.valueOf(input*39370.1));
        }
        else if(fromUnit=="Kilometre"&&toUnit=="Inch")
        {
            displ.setText(String.valueOf(input/39370.1));
        }
        else if(fromUnit=="Inch"&&toUnit=="Millimetre")
        {
            displ.setText(String.valueOf(input*25.4));
        }
        else if(fromUnit=="Millimetre"&&toUnit=="Inch")
        {
            displ.setText(String.valueOf(input/25.4));
        }
        else if(fromUnit=="Kilometre"&&toUnit=="Centimetre")
        {
            displ.setText(String.valueOf(input*100000));
        }
        else if(fromUnit=="Kilometre"&&toUnit=="Inch")
        {
            displ.setText(String.valueOf(input/100000));
        }
        else if(fromUnit=="Kilometre"&&toUnit=="Millimetre")
        {
            displ.setText(String.valueOf(input*1000000));
        }
        else if(fromUnit=="Millimetre"&&toUnit=="Kilometre") {
            displ.setText(String.valueOf(input / 1000000));
        }
        else if(fromUnit=="Centimetre"&&toUnit=="Millimetre")
        {
            displ.setText(String.valueOf(input*10));
        }
        else if(fromUnit=="Millimetre"&&toUnit=="Centimetre") {
            displ.setText(String.valueOf(input / 10));
        }



        else{
            Toast.makeText(getApplicationContext(),"Same Unit Conversion Not possible",Toast.LENGTH_SHORT).show();
        }
    }
}