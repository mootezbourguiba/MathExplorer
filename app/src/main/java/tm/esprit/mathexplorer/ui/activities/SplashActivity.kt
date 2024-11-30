package tm.esprit.mathexplorer.ui.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import tm.esprit.mathexplorer.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash) // Assurez-vous d'avoir l'interface de votre écran de splash

        // Utilisation d'un Handler pour un délai avant de lancer l'AuthActivity
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            // Démarre l'activité AuthActivity après 2 secondes
            startActivity(Intent(this, AuthActivity::class.java))
            finish() // Termine l'activité actuelle (SplashActivity)
        }, 2000)  // Délai de 2000 millisecondes (2 secondes)
    }
}
