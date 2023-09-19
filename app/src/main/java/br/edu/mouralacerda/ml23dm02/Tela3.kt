package br.edu.mouralacerda.ml23dm02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class Tela3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela3)

        val textViewNome = findViewById<TextView>(R.id.txtNome)
        val textViewTel = findViewById<TextView>(R.id.txtTel)
        val textViewEmail = findViewById<TextView>(R.id.txtEmail)
        val textViewSwitch = findViewById<TextView>(R.id.txtPublico)
        val backButton = findViewById<ImageButton>(R.id.btnVoltar2)

        val nome = intent.getStringExtra("nome")
        val tel = intent.getStringExtra("tel")
        val email = intent.getStringExtra("email")
        val isPublic = intent.getBooleanExtra("public", false)

        textViewNome.text = "Nome: $nome"
        textViewTel.text = "Telefone: $tel"
        textViewEmail.text = "Email: $email"
        textViewSwitch.text = "Visibilidade: ${if (isPublic) "Público" else "Privado"}"

        backButton.setOnClickListener {
            val intent = Intent(this, Tela2::class.java)
            intent.putExtra("nome", nome)
            intent.putExtra("tel", tel)

            startActivity(intent)
        }
    }
}
