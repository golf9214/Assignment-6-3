package com.example.myapplication02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clear = Toast.makeText(applicationContext,"All fields are cleared.", Toast.LENGTH_LONG)
        var sumall:Double
        var suminter:Double
        var year1:Double = 0.00
        var year2:Double = 0.00
        var year3:Double = 0.00
        var i1:Double
        var i2:Double
        var i3:Double

        calculate1.setOnClickListener(){
            val a = M1.getText().toString().toDouble()
            for (z in 1..10){
                if (z >= 1 && z <= 3){
                    i1 = a * 3 / 100
                    year1 = year1 + i1
                    i1 = 0.00
                    y1.setText("$year1")
                }else if (z >= 4 && z <= 7){
                    i2 = a * 5 / 100
                    year2 = year2 + i2
                    i2 = 0.00
                    y2.setText("$year2")
                }else if (z >= 8 && z <= 10){
                    i3 = a * 7 / 100
                    year3 = year3 + i3
                    i3 = 0.00
                    y3.setText("$year3")
                }
            }
            suminter = y1 + y2 + y3
            sumall = a + suminter
            in1.setText("$suminter")
            sum.setText("$sumall")
        }
        clear2.setOnClickListener(){
            input.setText(null)
            y1.setText(null)
            y2.setText(null)
            y3.setText(null)
            inter.setText(null)
            sum.setText(null)
            clear.show()
        }
    }
}

}
}