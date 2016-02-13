package cboost.com.anotherso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    //private native int sum(int s);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try{
            Log.i(TAG, "this");
        }catch(Exception e){
            Log.i(TAG, "error");
        }
    }

    static{
        try{
            System.loadLibrary("hello-jni");
            Log.i(TAG, "I loaded this shit");
        }catch(Exception e){
            Log.i(TAG, "Check the error");
        }
    }
}
