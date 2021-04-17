package ahmed.jaafuar.faisal.worlduniversities.Test;

import android.content.Context;
import android.widget.ScrollView;

import ahmed.jaafuar.faisal.worlduniversities.Test.ScrollListener;
import ahmed.jaafuar.faisal.worlduniversities.Test.ScrollNotifier;

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
