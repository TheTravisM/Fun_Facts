package io.travis.funfacts

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val tag: String = MainActivity::class.java.simpleName
    private val colorWheel = ColorWheel()
    private val factBook = FactBook()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the xml we would like to display
        setContentView(R.layout.activity_main)

        // Assign Views to Variables
        // Initialize view variables to the views in the layout
        val layoutMain = findViewById<RelativeLayout>(R.id.layout_main)
        val textViewFact = findViewById<TextView>(R.id.textView_fact)
        val buttonShowFact = findViewById<Button>(R.id.button_show_fact)

        val listener = View.OnClickListener {
            // New Background Color
            val bgColor = colorWheel.getColor()
            layoutMain.setBackgroundColor(bgColor)

            // The btn was clicked, Update the fact Text View with a new Fact
            val fact = factBook.getFact()
            // Update Screen with new fact
            textViewFact.text = fact

            // Set Button Text Color to match BG color
            buttonShowFact.setTextColor(bgColor)
        }

        buttonShowFact.setOnClickListener(listener)

        // Toast.makeText(this,"Meassage Here",Toast.LENGTH_SHORT).show()

        Log.d(tag, "We are logging from the onCreate() method!")
    }
}