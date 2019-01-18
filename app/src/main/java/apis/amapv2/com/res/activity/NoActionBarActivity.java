package apis.amapv2.com.res.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import apis.amapv2.com.res.R;

public class NoActionBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_action_bar);
    }
}
