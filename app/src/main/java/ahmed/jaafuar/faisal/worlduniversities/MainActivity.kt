package ahmed.jaafuar.faisal.worlduniversities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.core.os.HandlerCompat.postDelayed

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

    Handler().postDelayed({
        val intent = Intent(this,StartApp::class.java)
        startActivity(intent)
    },3000)

    }//End onCreate()

}//End class
