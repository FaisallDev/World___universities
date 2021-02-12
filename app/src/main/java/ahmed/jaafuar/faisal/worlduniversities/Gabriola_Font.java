package ahmed.jaafuar.faisal.worlduniversities;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Gabriola_Font extends androidx.appcompat.widget.AppCompatTextView {
    public Gabriola_Font(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(),"gabriola.ttf"));
    }
}
