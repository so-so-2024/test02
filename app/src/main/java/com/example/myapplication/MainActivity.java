package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String TAG="TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate: hooooo");
 
        Log.i(TAG, "onCreate: 999999999999999999");
        Toast.makeText(this, "dfsdfs", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onCreate: 666");
        Log.i(TAG, "onCreate: hoo555ooo");
        
           Log.i(TAG, "onCreate: ho88oooo"); /* add gitub */
        
        /****************/
        
           Log.i(TAG, "onCreate: 111111111"); /* add gitub */
           Log.i(TAG, "onCreate: 222222"); /* add gitub 222222*/
          Log.i(TAG, "onCreate: 333333"); /* add gitub 333333*/
    }
}
