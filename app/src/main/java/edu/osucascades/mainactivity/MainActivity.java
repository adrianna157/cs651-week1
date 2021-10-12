package edu.osucascades.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View;
import android.widget.Button;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        Button myButton = new Button(this);
        myButton.setText("Push Me");
        ConstraintLayout ll = (ConstraintLayout) findViewById(R.id.main_Layout);
        ll.addView(myButton);
    }
}