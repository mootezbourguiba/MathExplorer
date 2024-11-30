package tm.esprit.mathexplorer.data.repositories

import tm.esprit.mathexplorer.data.models.MathFunction
import kotlinx.coroutines.flow.Flow

interface FunctionRepository {
    suspend fun saveFunction(function: MathFunction)
    suspend fun deleteFunction(function: MathFunction)
    suspend fun getFunctionById(functionId: String): MathFunction?
    fun getAllUserFunctions(userId: String): Flow<List<MathFunction>>
    suspend fun analyzeFunction(function: MathFunction): Map<String, Any>
}