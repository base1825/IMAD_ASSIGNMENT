package da.co.varsitycollege.st10487874.imadassignment

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val ClickHereButton =
            findViewById<Button>(R.id.clickHereButton) // this isd the button to access the meals
        val DayTime =
            findViewById<EditText>(R.id.DayTime)// this is for the user to typ0e in the time of the day
        val txeHello = findViewById<TextView>(R.id.txeHello) // this is a welcoming text
        val MealsOptions = findViewById<TextView>(R.id.MealsOptions)
        val resetbutton = findViewById<Button>(R.id.Resetbutton) // this is to reset everything


        //This button
        ClickHereButton.setOnClickListener {


            //
            val message = when {

                DayTime.text.toString() == "Morning" -> {
                    "you may have some bread and strambled eggs"
                }

                DayTime.text.toString() == "Mid-Morning" -> {
                    "i would suggest some fruit salad "
                }

                DayTime.text.toString() == "Afternoom" -> {
                    "some bolognese and pasta would be great"
                }

                DayTime.text.toString() == "Afternoon snack" -> {
                    "you may get some apple juice and and biscuit"
                }

                DayTime.text.toString() == "dinner" -> {
                    "we highly recommend rice and meat "
                }


                DayTime.text.toString() == "after dinner" -> {
                    "some latte "
                }

                else -> {
                    "please try to type something else"
                }
            }
            // this button clean what the user typed
            resetbutton.setOnClickListener {


            }
        }
    }
}



















































