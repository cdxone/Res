package apis.amapv2.com.res.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cdx.answerlibrary.view.AnswerView;

import apis.amapv2.com.res.R;

public class WindowFullScreenActivity extends AppCompatActivity {

    private Context mContext;
    private AnswerView mAnswerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window_full_screen);

        initParamsAndValues();

        initView();

        initData();
    }

    private void initParamsAndValues() {
        mContext = this;
    }

    private void initView() {
        mAnswerView = findViewById(R.id.full_screen_answer);
    }

    private void initData() {
        mAnswerView.setData("WindowFullScreen.xml");
    }
}

