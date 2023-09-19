package br.edu.mouralacerda.ml23dm02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    private lateinit var editTextNome: EditText
    private lateinit var editTextTel: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextNome = findViewById(R.id.edtNome)
        editTextTel = findViewById(R.id.edtTel)

        val closeButton = findViewById<ImageButton>(R.id.btnFechar)
        val nextButton = findViewById<ImageButton>(R.id.btnProximo1)

        closeButton.setOnClickListener {
            finish()
        }

        nextButton.setOnClickListener {
            val nome = editTextNome.text.toString()
            val tel = editTextTel.text.toString()

            val intent = Intent(this, Tela2::class.java)
            intent.putExtra("nome", nome)
            intent.putExtra("tel", tel)
            startActivity(intent)
        }
    }
}