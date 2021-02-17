package ahmed.jaafuar.faisal.worlduniversities

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_start_app.*

class StartApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_app)

        time_table.typeface = Typeface.createFromAsset(assets,"calibri.TTF")
        Faculty_Border.typeface = Typeface.createFromAsset(assets,"calibri.TTF")
        UNi_news.typeface = Typeface.createFromAsset(assets,"calibri.TTF")

        time_table.setOnClickListener {
           val intent = Intent(this,invinity_table::class.java)
            startActivity(intent)
        }//End time_table(BTN)
//
//        collageTable.setOnClickListener{
//            val intent = Intent(this,invinity_table::class.java)
//            startActivity(intent)
//        }

    }//End onCreate()


}//End class