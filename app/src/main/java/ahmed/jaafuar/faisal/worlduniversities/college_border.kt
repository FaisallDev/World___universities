package ahmed.jaafuar.faisal.worlduniversities

import android.R
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class college_border : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.college)

    }//End onCreate()

    private fun setupScrolling() {
        var view: ScrollNotifier
        val scrollManager = ScrollManager()

        // timeline horizontal scroller
        view = findViewById<View>(R.id.college) as ScrollNotifier
        scrollManager.addScrollClient(view)

        // services vertical scroller
        view = findViewById<View>(R.id.college) as ScrollNotifier
        scrollManager.addScrollClient(view)

        // content area scrollers
        view = findViewById<View>(R.id.college) as ScrollNotifier
        scrollManager.addScrollClient(view)
        view = findViewById<View>(R.id.college) as ScrollNotifier
        scrollManager.addScrollClient(view)
    }
}//End Class