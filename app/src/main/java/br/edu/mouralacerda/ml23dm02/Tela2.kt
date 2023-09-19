package br.edu.mouralacerda.ml23dm02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Switch

class Tela2 : AppCompatActivity() {

    private lateinit var editTextEmail: EditText
    private lateinit var switchPublic: Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        editTextEmail = findViewById(R.id.edtEmail)
        switchPublic = findViewById(R.id.swtPublico)

        val nome = intent.extras!!.getString("nome")!!
        val tel = intent.extras!!.getString("tel")!!

        val backButton = findViewById<ImageButton>(R.id.btnVoltar1)
        val nextButton = findViewById<ImageButton>(R.id.btnCadastrar)

        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }

        nextButton.setOnClickListener {
            val email = editTextEmail.text.toString()
            val isPublic = switchPublic.isChecked

            val intent = Intent(this, Tela3::class.java)
            intent.putExtra("email", email)
            intent.putExtra("public", isPublic)
            intent.putExtra("nome", nome)
            intent.putExtra("tel", tel)
            startActivity(intent)
        }
    }
}