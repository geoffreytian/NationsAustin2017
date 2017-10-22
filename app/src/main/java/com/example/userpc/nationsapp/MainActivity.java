package com.example.userpc.nationsapp;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.EditText;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;

public class MainActivity extends Activity {

    TextView testLabel;
    Button testButton;
    EditText editText;

    Button changeView;//
    ImageView mission;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        testButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String str = editText.getText().toString();
                testLabel.setText(str);
                String toAdd = testLabel.getText().toString();

                editText.setText("");
            }
        });


        changeView.setOnClickListener(new View.OnClickListener() {//

            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MyOtherActivity.class));
            }
        });
    }


    //This method initializes the sensors, wifi, and UI elements
    public void init() {


        testLabel = (TextView) findViewById(R.id.dragonslayer);
        testButton = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);
        changeView = (Button) findViewById(R.id.button2);//
        mission = (ImageView) findViewById(R.id.imageView);

    }
}