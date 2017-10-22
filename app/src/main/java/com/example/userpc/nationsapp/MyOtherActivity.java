package com.example.userpc.nationsapp;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.EditText;
        import android.app.Activity;
        import android.os.Bundle;
        import android.content.Intent;
/**
 * Created by margaretcheng on 10/21/17.
 */

public class MyOtherActivity extends Activity{
    TextView stuff;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondpage);
        init();

    }



    public void init() {
        stuff = (TextView) findViewById(R.id.stuff);
    }

}
