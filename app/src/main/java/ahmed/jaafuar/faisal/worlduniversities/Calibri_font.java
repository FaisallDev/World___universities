package ahmed.jaafuar.faisal.worlduniversities;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class Calibri_font extends androidx.appcompat.widget.AppCompatTextView {
    public Calibri_font(@NonNull Context context) {
        super(context);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(),"calibri.TTF"));
    }//End font

}//End class
