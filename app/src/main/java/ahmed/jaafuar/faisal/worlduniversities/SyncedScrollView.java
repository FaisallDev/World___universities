package ahmed.jaafuar.faisal.worlduniversities;

import android.content.Context;
import android.widget.ScrollView;

public class SyncedScrollView extends ScrollView implements ScrollNotifier {

    //...

    private ScrollListener scrollListener = null;

    public SyncedScrollView(Context context) {
        super(context);
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        if (scrollListener != null)
            scrollListener.onScrollChanged(this, l, t, oldl, oldt);
    }
    @Override
    public void setScrollListener(ScrollListener scrollListener) {
        this.scrollListener = scrollListener;
    }
    @Override
    public ScrollListener getScrollListener() {
        return scrollListener;
    }
}
