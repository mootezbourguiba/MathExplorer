// FunctionAnalysisActivity.kt
package tm.esprit.mathexplorer.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import tm.esprit.mathexplorer.databinding.ActivityFunctionAnalysisBinding
import tm.esprit.mathexplorer.ui.viewmodels.FunctionAnalysisViewModel

class FunctionAnalysisActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFunctionAnalysisBinding
    private lateinit var viewModel: FunctionAnalysisViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFunctionAnalysisBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.analyzeButton.setOnClickListener {
            val equation = binding.equationEditText.text.toString()
            // Logique d'analyse de fonction
        }
    }
}