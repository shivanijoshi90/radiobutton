package com.shivani.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdGroup;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Binding();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id =rdGroup.getCheckedRadioButtonId();

                RadioButton rb=findViewById(id);

                Toast.makeText(MainActivity.this,"Gender" +rb.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Binding(){

        rdGroup=findViewById(R.id.rdoGroup);
        submit=findViewById(R.id.submit);
    }
}