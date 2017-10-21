package com.example.userpc.nationsapp;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    TextView testLabel;
    Button testButton;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Parse.initiliaze(new Parse.Configuration.Builder(this)
                .applicationId("")
                .clientKey(null)
                .server("http://*/parse/")
                .build()
        );

        init();

        testButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String str = editText.getText().toString();
                testLabel.setText(str);
                editText.setText("");
            }
        });
    }


    //This method initializes the sensors, wifi, and UI elements
    public void init() {
        testLabel = (TextView) findViewById(R.id.textView);
        testButton = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);
    }
}