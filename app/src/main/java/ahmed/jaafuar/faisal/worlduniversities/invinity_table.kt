package ahmed.jaafuar.faisal.worlduniversities

import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_invinity_table.*

class invinity_table : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_invinity_table)


        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // In landscape
            strBtn.setOnClickListener{
                strBtn.setBackgroundResource(R.color.samawy);    thuBtn.setBackgroundResource(R.color.transparent)
                sunBtn.setBackgroundResource(R.color.transparent);wedBtn.setBackgroundResource(R.color.transparent)
                monBtn.setBackgroundResource(R.color.transparent); tueBtn.setBackgroundResource(R.color.transparent)
            }//End srtBtn

            sunBtn.setOnClickListener{
                sunBtn.setBackgroundResource(R.color.samawy);    thuBtn.setBackgroundResource(R.color.transparent)
                strBtn.setBackgroundResource(R.color.transparent);wedBtn.setBackgroundResource(R.color.transparent)
                monBtn.setBackgroundResource(R.color.transparent); tueBtn.setBackgroundResource(R.color.transparent)
            }//End sunBtn

            monBtn.setOnClickListener{
                monBtn.setBackgroundResource(R.color.samawy);    thuBtn.setBackgroundResource(R.color.transparent)
                strBtn.setBackgroundResource(R.color.transparent);wedBtn.setBackgroundResource(R.color.transparent)
                sunBtn.setBackgroundResource(R.color.transparent); tueBtn.setBackgroundResource(R.color.transparent)
            }//End monBtn

            thuBtn.setOnClickListener{
                thuBtn.setBackgroundResource(R.color.samawy);    sunBtn.setBackgroundResource(R.color.transparent)
                strBtn.setBackgroundResource(R.color.transparent);wedBtn.setBackgroundResource(R.color.transparent)
                monBtn.setBackgroundResource(R.color.transparent); tueBtn.setBackgroundResource(R.color.transparent)
            }//end thuBtn

            wedBtn.setOnClickListener{
                wedBtn.setBackgroundResource(R.color.samawy);    thuBtn.setBackgroundResource(R.color.transparent)
                strBtn.setBackgroundResource(R.color.transparent);sunBtn.setBackgroundResource(R.color.transparent)
                monBtn.setBackgroundResource(R.color.transparent); tueBtn.setBackgroundResource(R.color.transparent)
            }//End wedBtn

            tueBtn.setOnClickListener{
                tueBtn.setBackgroundResource(R.color.samawy);    thuBtn.setBackgroundResource(R.color.transparent)
                strBtn.setBackgroundResource(R.color.transparent);wedBtn.setBackgroundResource(R.color.transparent)
                monBtn.setBackgroundResource(R.color.transparent); sunBtn.setBackgroundResource(R.color.transparent)
            }//End tueBtn

        }//End if
        else {
            // In portrait
        }//End else



    }//End onCreate()

}//End class