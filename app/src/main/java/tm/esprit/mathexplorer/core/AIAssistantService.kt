package tm.esprit.mathexplorer.core

import tm.esprit.mathexplorer.data.models.MathFunction
import kotlinx.coroutines.flow.Flow

interface AIAssistantService {
    suspend fun explainFunction(function: MathFunction): String
    suspend fun suggestStudyPath(function: MathFunction): List<String>
    suspend fun generatePracticeQuestions(function: MathFunction): List<String>
    fun getConversationStream(): Flow<String>
}