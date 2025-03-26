package da.co.varsitycollege.st10487874.imadassignment

import android.os.Bundle
import android.util.Log
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
        val ClickHereButton = findViewById<Button>(R.id.clickHereButton) // Button to access meals
        val DayTime = findViewById<EditText>(R.id.DayTime) // User types the time of day
        val txeHello = findViewById<TextView>(R.id.txeHello) // Welcome text
        val MealsOptions = findViewById<TextView>(R.id.MealsOptions) // Display meal options
        val resetbutton = findViewById<Button>(R.id.Resetbutton) // Reset button

        ClickHereButton.setOnClickListener {
            val userInput = DayTime.text.toString().trim() // get valid input

            val message = when (userInput.lowercase()) {
                "morning" -> "You may have some bread and scrambled eggs."
                "mid-morning" -> "I would suggest some fruit salad."
                "afternoon" -> "Some Bolognese and pasta would be great."
                "afternoon snack" -> "You may get some apple juice and a biscuit."
                "dinner" -> "We highly recommend rice and meat."
                "after dinner" -> "Some latte would be great."
                else -> "Please type in a valid time of the day."
            }

            Log .d("DEBUG", "Message: $message")

            MealsOptions.text = message // Display the message
        }

// Reset button clears input
        resetbutton.setOnClickListener {
            DayTime.text.clear()
            MealsOptions.text = ""
        }


            }
            }






















































