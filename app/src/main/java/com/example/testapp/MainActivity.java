package com.example.testapp;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
private EditText etName,etLastName;
private TextView tvWelcome;
private Button btn1;
private RadioButton radioLeft;
private RadioButton radioRight;
private ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName=findViewById(R.id.editTextText);
        etLastName=findViewById(R.id.editTextText2);
        tvWelcome=findViewById(R.id.textView);
        btn1=findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NewLabel="Welcome";
                String name = etName.getText().toString();
                String lastName=etLastName.getText().toString();
                if(!(name.isEmpty())&&!(lastName.isEmpty())) {
                    NewLabel += " " + etName.getText().toString();
                    NewLabel += " " + etLastName.getText().toString();
                    tvWelcome.setText(NewLabel);
                }
                else{
                    Toast.makeText(MainActivity.this, "Pleas inter your name and last name", Toast.LENGTH_SHORT).show();
                }
            }
        });
        radioLeft=findViewById(R.id.radioButton);
        radioLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {img1.setImageResource(R.drawable.cat);}
        });
        radioRight=findViewById(R.id.radioButton2);
        img1=findViewById(R.id.imageView);
       radioRight.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               img1.setImageResource(R.drawable.cat2);
           }
       });
    }
}
