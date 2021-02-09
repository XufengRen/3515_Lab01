package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //onclicklistener for button
        Button button = findViewById(R.id.my_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                TextView t = (TextView)findViewById(R.id.textView);
                t.setText("You have clicked the button");

            }
        });
    }
}