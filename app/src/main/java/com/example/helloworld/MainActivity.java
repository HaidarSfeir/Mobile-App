package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button displayButton;
    EditText nameEditText;
    TextView displayTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initLayoutComponents();
        initDisplayButton();

    }
    private void initLayoutComponents(){
        displayButton = findViewById(R.id.buttonDisplay);
        nameEditText = findViewById(R.id.editTextName);
        displayTextView = findViewById(R.id.textViewDisplay);
    }

    private void initDisplayButton(){
        displayButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String nameToDisplay = nameEditText.getText().toString();
                displayTextView.setText("Hello " + nameToDisplay +"!");
                nameEditText.setText("");
            }
        });
    }

}