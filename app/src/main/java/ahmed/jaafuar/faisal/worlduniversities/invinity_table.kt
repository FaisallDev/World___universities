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
                secondLectureTeacherName.text = "" ; secondSubjectName.setText(R.string.text_face_2)
                SecondLectureHallName.setText(R.string.off)
                TimeSecondLectur.setText(R.string.empty); TimeSecondLectur.setText(R.string.empty)
                TimeFourthLecture.setText(R.string.empty)

            }//End srtBtn

            sunBtn.setOnClickListener{
                // change background for days when click
                sunBtn.setBackgroundResource(R.color.days_clickable);    thuBtn.setBackgroundResource(R.color.transparent)
                satBtn.setBackgroundResource(R.color.transparent);wedBtn.setBackgroundResource(R.color.transparent)
                monBtn.setBackgroundResource(R.color.transparent); tueBtn.setBackgroundResource(R.color.transparent)

                //change teacher,hall and subject names
                firstSubjectName.setText(R.string.text_face_2); firstLectureHallName.setText(R.string.off)
                firstLectureTeacherName.text = ""; timeFirstLecture.setText(R.string.empty)
                secondLectureTeacherName.text = "" ; secondSubjectName.setText(R.string.text_face_2)
                SecondLectureHallName.setText(R.string.off)
                TimeSecondLectur.setText(R.string.empty); TimeSecondLectur.setText(R.string.empty)
                TimeFourthLecture.setText(R.string.empty)
            }//End sunBtn

            monBtn.setOnClickListener{
                // change background for days when click
                monBtn.setBackgroundResource(R.color.days_clickable);    thuBtn.setBackgroundResource(R.color.transparent)
                satBtn.setBackgroundResource(R.color.transparent);wedBtn.setBackgroundResource(R.color.transparent)
                sunBtn.setBackgroundResource(R.color.transparent); tueBtn.setBackgroundResource(R.color.transparent)

                //change teacher,hall and subject names
                firstSubjectName.text = "Databases II"; firstLectureHallName.text = "Hall (2)"
                firstLectureTeacherName.text = "Inst.Tageldeen Suliman"; timeFirstLecture.setText(R.string.first_lec)
                secondLectureTeacherName.text = "Dr.Waleed Elshaikh" ; secondSubjectName.text = "Visual programing"
                TimeSecondLectur.setText(R.string.second_lec); SecondLectureHallName.text = "Hall (2)"
                thirdLectureTeacherName.text = ""; thirdSubjectName.setText(R.string.text_face_2)
                TimeThirdLecture.setText(R.string.empty); TimeFourthLecture.setText(R.string.empty)
                fourthLectureHallName.setText(R.string.off); fourthSubjectName.setText(R.string.text_face_2)

            }//End monBtn

            thuBtn.setOnClickListener{
                // change background for days when click
                thuBtn.setBackgroundResource(R.color.days_clickable);    sunBtn.setBackgroundResource(R.color.transparent)
                satBtn.setBackgroundResource(R.color.transparent);wedBtn.setBackgroundResource(R.color.transparent)
                monBtn.setBackgroundResource(R.color.transparent); tueBtn.setBackgroundResource(R.color.transparent)

                //change teacher,hall and subject names
                firstSubjectName.text = "Analysis & Design of Algorithms" ; firstLectureTeacherName.text = "Inst.Mohamed Abdelkareem"
                firstLectureHallName.text = "Hall (2)"; timeFirstLecture.setText(R.string.first_lec);
                secondSubjectName.setText(R.string.text_face_2); secondLectureTeacherName.text=""
                TimeSecondLectur.setText(R.string.empty); SecondLectureHallName.setText(R.string.off)
                thirdSubjectName.text="Microprocessors & Assemly"; thirdLectureTeacherName.text = "Dr.Mohamed Fadul"
                thirdLectureHallName.text="Unknown"; TimeThirdLecture.setText(R.string.third_lec)
                fourthSubjectName.setText(R.string.text_face_2); fourthLectureHallName.setText(R.string.off)
                fourthLectureTeacherName.text="" ; TimeFourthLecture.setText(R.string.empty)

            }//end thuBtn

            wedBtn.setOnClickListener{
                // change background for days when click
                wedBtn.setBackgroundResource(R.color.days_clickable);    thuBtn.setBackgroundResource(R.color.transparent)
                satBtn.setBackgroundResource(R.color.transparent);sunBtn.setBackgroundResource(R.color.transparent)
                monBtn.setBackgroundResource(R.color.transparent); tueBtn.setBackgroundResource(R.color.transparent)

                //change teacher,hall and subject names
                firstLectureTeacherName.text=""; firstSubjectName.setText(R.string.text_face_2)
                firstLectureHallName.setText(R.string.off); timeFirstLecture.setText(R.string.empty)
                secondLectureTeacherName.text=""; secondSubjectName.setText(R.string.text_face_2)
                SecondLectureHallName.setText(R.string.off); TimeSecondLectur.setText(R.string.empty)
                thirdLectureTeacherName.text=""; thirdSubjectName.setText(R.string.text_face_2)
                thirdLectureHallName.setText(R.string.off); TimeThirdLecture.setText(R.string.empty)
                fourthLectureTeacherName.text=""; fourthSubjectName.setText(R.string.text_face_2)
                fourthLectureHallName.setText(R.string.off); TimeFourthLecture.setText(R.string.empty)

            }//End wedBtn

            tueBtn.setOnClickListener{
                // change background for days when click
                tueBtn.setBackgroundResource(R.color.days_clickable);    thuBtn.setBackgroundResource(R.color.transparent)
                satBtn.setBackgroundResource(R.color.transparent);wedBtn.setBackgroundResource(R.color.transparent)
                monBtn.setBackgroundResource(R.color.transparent); sunBtn.setBackgroundResource(R.color.transparent)

                //change teacher,hall and subject names
                firstLectureTeacherName.text="Dr.Waleed Ibrahim"; firstSubjectName.text="Internet Technology I"
                firstLectureHallName.text="Hall (2)"; timeFirstLecture.setText(R.string.first_lec)
                secondLectureTeacherName.text=""; secondSubjectName.setText(R.string.text_face_2)
                SecondLectureHallName.setText(R.string.off); TimeSecondLectur.setText(R.string.empty)
                thirdLectureTeacherName.text="Inst.Tageldeen Suliman"; thirdSubjectName.text="Software Engineering I"
                thirdLectureHallName.text="Hall (2)"; TimeThirdLecture.setText(R.string.third_lec)
                fourthLectureTeacherName.text="Dr.Waleed Ibrahim"; fourthSubjectName.text="Internet Technology I"
                fourthLectureHallName.text="Hall (2)"; TimeFourthLecture.setText(R.string.fourth_lec)
            }//End tueBtn

        }//End if
        else {
            // In portrait
        }//End else



    }//End onCreate()

}//End class