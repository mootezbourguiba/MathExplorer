// FunctionAnalysisViewModel.kt
package tm.esprit.mathexplorer.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import tm.esprit.mathexplorer.core.MathAnalysisEngine
import tm.esprit.mathexplorer.core.AIAssistantService
import tm.esprit.mathexplorer.data.models.MathFunction
import tm.esprit.mathexplorer.data.models.AnalysisResult
import kotlinx.coroutines.launch

class FunctionAnalysisViewModel(
    private val analysisEngine: MathAnalysisEngine,
    private val aiAssistant: AIAssistantService
) : ViewModel() {
    private val _analysisResult = MutableLiveData<AnalysisResult>()
    val analysisResult: LiveData<AnalysisResult> = _analysisResult

    fun analyzeMathFunction(function: MathFunction) {
        viewModelScope.launch {
            val continuity = analysisEngine.analyzeContinuity(function.equation)
            val derivative = analysisEngine.calculateDerivative(function.equation)
            val aiExplanation = aiAssistant.provideExplanation(function)

            _analysisResult.value = AnalysisResult(
                function = function,
                continuity = continuity,
                derivative = derivative,
                aiExplanation = aiExplanation
            )
        }
    }
}