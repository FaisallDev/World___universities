package ahmed.jaafuar.faisal.worlduniversities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ahmed.jaafuar.faisal.worlduniversities.R
import android.content.Intent
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
               errorMessageForID.visibility = View.INVISIBLE
                   startActivity(i)
           }//End if
            else if (EditTextID.text.toString() == "") {
             errorMessageForID.visibility = View.VISIBLE
           }//End else if
            else {
                errorMessageForID.visibility = View.VISIBLE
           }//End else
        }//End OnClickListener()

    } //End onCreate()


} //End class
