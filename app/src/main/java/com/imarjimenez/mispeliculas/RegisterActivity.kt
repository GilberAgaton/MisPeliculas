package com.imarjimenez.mispeliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.*
import android.widget.Toast
import com.imarjimenez.mispeliculas.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var registerBinding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerBinding= ActivityRegisterBinding.inflate(layoutInflater)
        val view = registerBinding.root
        setContentView(view)

        registerBinding.registerButton.setOnClickListener {
            Log.d("button", "clicked")
            val email: String= registerBinding.emailEditText.text.toString()
            var info= email
            val password= registerBinding.passwordEditText.text.toString()
            val repPassword = registerBinding.repPasswordEditText.text.toString()
            var genre ="Masculino"
            if(registerBinding.femaleRadioButton.isChecked)
                genre="Femenino"

            var favoritesGenre=""
            if(registerBinding.AmorCheckBox.isChecked)
                favoritesGenre= favoritesGenre + " " +"Amor"
            if(registerBinding.SuspensoCheckBox.isChecked)
                favoritesGenre= favoritesGenre + " " +"Suspenso"
            if(registerBinding.HumorCheckBox.isChecked)
                favoritesGenre= favoritesGenre + " " +"Humor"
            if(registerBinding.TerrorCheckBox.isChecked)
                favoritesGenre= favoritesGenre + " " +"Terror"
            if(registerBinding.AventuraCheckBox.isChecked)
                favoritesGenre= favoritesGenre + " " +"Aventura"
            if(registerBinding.MusicalCheckBox.isChecked)
            favoritesGenre= favoritesGenre + " " +"Musical"
            if(registerBinding.DramaCheckBox.isChecked)
                favoritesGenre= favoritesGenre + " " +"Drama"
            if(registerBinding.CienciaFiccionCheckBox.isChecked)
                favoritesGenre= favoritesGenre + " " +"Ciencia Ficcion"
            if(registerBinding.InfantilCheckBox.isChecked)
                favoritesGenre= favoritesGenre + " " +"Infantil"



            if(password ==repPassword){
               val info= email + "\n" +password + genre
                registerBinding.infoTextView.text=info
             }else{
                 Toast.makeText(this,"Las contraseñas no son iguales", Toast.LENGTH_LONG).show()

            }
        }
    }
}