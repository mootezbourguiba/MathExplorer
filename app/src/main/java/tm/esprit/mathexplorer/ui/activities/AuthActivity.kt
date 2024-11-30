package tm.esprit.mathexplorer.ui.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import tm.esprit.mathexplorer.R

class AuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        // Initialisation des vues
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etPassword = findViewById<EditText>(R.id.etPassword)

        // Gestion du clic sur le bouton de connexion
        btnLogin.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            // Vérification des champs de texte
            if (username.isNotEmpty() && password.isNotEmpty()) {
                // Démarre l'activité MainMenuActivity si les champs sont valides
                startActivity(Intent(this, MainMenuActivity::class.java))
                finish() // Termine l'AuthActivity pour ne pas revenir dessus
            } else {
                // Affichage d'un message d'erreur si les champs sont vides
                // À adapter en fonction de la manière dont vous souhaitez informer l'utilisateur
                etUsername.error = "Veuillez entrer un nom d'utilisateur"
                etPassword.error = "Veuillez entrer un mot de passe"
            }
        }
    }
}
