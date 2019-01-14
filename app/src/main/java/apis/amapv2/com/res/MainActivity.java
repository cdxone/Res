package apis.amapv2.com.res;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import apis.amapv2.com.listviewlibrary.bean.ItemObject;
import apis.amapv2.com.listviewlibrary.view.MyListView;
import apis.amapv2.com.res.activity.WindowContentOverlayActivity;
import apis.amapv2.com.res.activity.WindowFullScreenActivity;
import apis.amapv2.com.res.activity.WindowNoTitleActivity;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private MyListView mMyListView;
    private ArrayList<ItemObject> mData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initParamsAndValues();

        initView();

        initData();
    }

    private void initParamsAndValues() {
        mContext = this;

        mData.add(new ItemObject("windowNoTitle",WindowNoTitleActivity.class));
        mData.add(new ItemObject("android:windowFullscreen",WindowFullScreenActivity.class));
        mData.add(new ItemObject("android:windowContentOverlay",WindowContentOverlayActivity.class));
    }

    private void initView() {
        mMyListView = findViewById(R.id.mlv);
    }

    private void initData() {
        mMyListView.setData(mData);
    }


}
