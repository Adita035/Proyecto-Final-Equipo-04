package com.example.proyectofinale04

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.ejemplo.proyectofinale04.DrawingView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawingView = findViewById<DrawingView>(R.id.drawingView)

        findViewById<Button>(R.id.btnBlack).setOnClickListener {
            drawingView.setColor(Color.BLACK)
        }

        findViewById<Button>(R.id.btnRed).setOnClickListener {
            drawingView.setColor(Color.RED)
        }

        findViewById<Button>(R.id.btnBlue).setOnClickListener {
            drawingView.setColor(Color.BLUE)
        }

        findViewById<Button>(R.id.btnGreen).setOnClickListener {
            drawingView.setColor(Color.GREEN)
        }

        findViewById<Button>(R.id.btnClear).setOnClickListener {
            drawingView.clearCanvas()
        }
    }
}