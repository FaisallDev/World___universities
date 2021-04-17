package ahmed.jaafuar.faisal.worlduniversities;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ListView;
import android.widget.ScrollView;

import java.util.ArrayList;

public interface ScrollListener {
    void onScrollChanged(View syncedScrollView, int l, int t, int oldl,
                         int oldt);
}
