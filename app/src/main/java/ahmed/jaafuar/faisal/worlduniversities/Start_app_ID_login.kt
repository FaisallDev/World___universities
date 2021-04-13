package ahmed.jaafuar.faisal.worlduniversities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ahmed.jaafuar.faisal.worlduniversities.R
import android.content.Intent
import android.graphics.Typeface
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_start_app__i_d_login.*

class Start_app_ID_login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_app__i_d_login)


        idBtn.setOnClickListener {
           if (EditTextID.text.toString() == "000000" ) {
               val i = Intent (this,StartApp::class.java)
                   startActivity(i)
           }//End if
           else if (EditTextID.text.isEmpty()) {
               EditTextID.error="قم بكتابة رقم جامعي قبل الدخول"
           }//End else if
            else {
               EditTextID.error="أدخل رقم جامعي صحيح"
           }//End else
        }//End OnClickListener()

        idBtn.typeface = Typeface.createFromAsset(assets,"calibri.TTF")
        EditTextID.typeface = Typeface.createFromAsset(assets,"FranklinGothicBookRegular.ttf")



    } //End onCreate()


} //End class
