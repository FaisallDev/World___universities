package ahmed.jaafuar.faisal.worlduniversities;

import android.content.Context;
import android.widget.ScrollView;

public interface ScrollNotifier {
    public void setScrollListener(ScrollListener scrollListener);

    public ScrollListener getScrollListener();
}

