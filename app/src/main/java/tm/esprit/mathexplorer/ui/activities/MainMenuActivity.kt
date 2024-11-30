package tm.esprit.mathexplorer.ui.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import tm.esprit.mathexplorer.R

class MainMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        findViewById<Button>(R.id.btnAnalyzeFunction).setOnClickListener {
            startActivity(Intent(this, FunctionAnalysisActivity::class.java))
        }
    }
}
