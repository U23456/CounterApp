package caled.exsamps.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var countByInput : EditText
    private lateinit var countOutput : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val countButton = findViewById<Button>(R.id.count)
        val resetButton = findViewById<Button>(R.id.reset)


        var count = 0
        countButton.setOnClickListener {
            try {
                count += countByInput.text.toString().toInt()
                countOutput.text = count.toString()
            } catch (e : Exception) {
                Toast.makeText(this, "Invalid Number! Please enter an Integer!", Toast.LENGTH_LONG).show()
            }
        }
        resetButton.setOnClickListener {
            count = 0
            countOutput.text = count.toString()
        }


        countByInput = findViewById(R.id.CountBy_input)
        countOutput = findViewById(R.id.count_output)
    }


}