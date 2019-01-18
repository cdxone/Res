package apis.amapv2.com.res;

import java.util.ArrayList;

import apis.amapv2.com.listviewlibrary.activity.BaseListActivty;
import apis.amapv2.com.listviewlibrary.bean.ItemObject;
import apis.amapv2.com.res.activity.ThemeActivity;

public class MainActivity extends BaseListActivty {

    @Override
    protected void initData() {

        ArrayList<ItemObject> data = new ArrayList<>();
        data.add(new ItemObject("页面主题研究", ThemeActivity.class));

        mMyListView.setData(data);
    }
}
