package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button showButton;
private TextView nameButton;
private EditText enter_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showButton = findViewById(R.id.button);
        nameButton = findViewById(R.id.textView);
        enter_name = findViewById(R.id.editTextText);
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = enter_name.getText().toString();
                if(name.isEmpty()){
nameButton.setText("even if you dont have a name,  \nstill its Y.V.K. s game \nYEAH!!!!!!");
                }else{
                    nameButton.setText("Y.V.K. YEEEAAAAAAHHHH!!!!!!!!\n" + name + " do you understand damnit");
                }
            }
        });
    }
}