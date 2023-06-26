package chj.tutorials.kotlintutorialapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)

        val countingNum = findViewById<TextView>(R.id.btncount)

        var clickedCnt = 0

        btnClickMe.setOnClickListener {
            clickedCnt++

            countingNum.text = clickedCnt.toString()

            Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show()
        }


    }
}