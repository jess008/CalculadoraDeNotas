package com.example.calculadoradenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        val resultados = resultados

        btCalcular.setOnClickListener {
            val nota1: Int = Integer.parseInt(nota1.text.toString())
            val nota2: Int = Integer.parseInt(nota2.text.toString())
            val media = (nota1+nota2)/2
            val faltas: Int = Integer.parseInt(faltas.text.toString())

            if(media>=6 && faltas <=10){
                resultados.setText("Aluno foi Aprovado "+ "\n"+"Nota Final: "+ media+"\n"+"Faltas: "+faltas)
                resultados.setTextColor(Color.GREEN)
            }
            else{
                resultados.setText("Aluno foi Reprovado "+ "\n"+"Nota Final: "+ media+"\n"+"Faltas: "+faltas)
                resultados.setTextColor(Color.RED)
            }
        }
    }
}