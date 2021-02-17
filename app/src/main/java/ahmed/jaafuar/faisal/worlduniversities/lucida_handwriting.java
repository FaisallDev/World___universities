package ahmed.jaafuar.faisal.worlduniversities;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class lucida_handwriting extends androidx.appcompat.widget.AppCompatTextView {
    public lucida_handwriting(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(),"lucida_handwriting.TTF"));
    }
}
