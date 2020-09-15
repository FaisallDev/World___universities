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
            satBtn.setOnClickListener{
                // change background for days when click
                satBtn.setBackgroundResource(R.color.days_clickable);    thuBtn.setBackgroundResource(R.color.transparent)
                sunBtn.setBackgroundResource(R.color.transparent);wedBtn.setBackgroundResource(R.color.transparent)
                monBtn.setBackgroundResource(R.color.transparent); tueBtn.setBackgroundResource(R.color.transparent)

                //change teacher,hall and subject names
                firstSubjectName.setText(R.string.text_face_2); firstLectureHallName.setText(R.string.off)
                firstLectureTeacherName.text = ""; timeFirstLecture.setText(R.string.empty)
                secondLectureTeacherName.text = "" ; secondSubjectName.setText(R.string.text_face_2);
                SecondLectureHallName.setText(R.string.off)
                TimeSecondLectur.setText(R.string.empty); TimeSecondLectur.setText(R.string.empty)
                TimeFourthLecture.setText(R.string.empty)

            }//End srtBtn

            sunBtn.setOnClickListener{
                // change background for days when click
                sunBtn.setBackgroundResource(R.color.days_clickable);    thuBtn.setBackgroundResource(R.color.transparent)
                satBtn.setBackgroundResource(R.color.transparent);wedBtn.setBackgroundResource(R.color.transparent)
                monBtn.setBackgroundResource(R.color.transparent); tueBtn.setBackgroundResource(R.color.transparent)
            }//End sunBtn

            monBtn.setOnClickListener{
                // change background for days when click
                monBtn.setBackgroundResource(R.color.days_clickable);    thuBtn.setBackgroundResource(R.color.transparent)
                satBtn.setBackgroundResource(R.color.transparent);wedBtn.setBackgroundResource(R.color.transparent)
                sunBtn.setBackgroundResource(R.color.transparent); tueBtn.setBackgroundResource(R.color.transparent)
            }//End monBtn

            thuBtn.setOnClickListener{
                // change background for days when click
                thuBtn.setBackgroundResource(R.color.days_clickable);    sunBtn.setBackgroundResource(R.color.transparent)
                satBtn.setBackgroundResource(R.color.transparent);wedBtn.setBackgroundResource(R.color.transparent)
                monBtn.setBackgroundResource(R.color.transparent); tueBtn.setBackgroundResource(R.color.transparent)
            }//end thuBtn

            wedBtn.setOnClickListener{
                // change background for days when click
                wedBtn.setBackgroundResource(R.color.days_clickable);    thuBtn.setBackgroundResource(R.color.transparent)
                satBtn.setBackgroundResource(R.color.transparent);sunBtn.setBackgroundResource(R.color.transparent)
                monBtn.setBackgroundResource(R.color.transparent); tueBtn.setBackgroundResource(R.color.transparent)
            }//End wedBtn

            tueBtn.setOnClickListener{
                // change background for days when click
                tueBtn.setBackgroundResource(R.color.days_clickable);    thuBtn.setBackgroundResource(R.color.transparent)
                satBtn.setBackgroundResource(R.color.transparent);wedBtn.setBackgroundResource(R.color.transparent)
                monBtn.setBackgroundResource(R.color.transparent); sunBtn.setBackgroundResource(R.color.transparent)
            }//End tueBtn

        }//End if
        else {
            // In portrait
        }//End else



    }//End onCreate()

}//End class