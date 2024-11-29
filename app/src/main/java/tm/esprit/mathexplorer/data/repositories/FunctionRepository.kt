package tm.esprit.mathexplorer.data.repositories

import tm.esprit.mathexplorer.data.models.MathFunction
import tm.esprit.mathexplorer.data.database.MathExplorerDatabase

class FunctionRepository(private val database: MathExplorerDatabase) {
    suspend fun saveMathFunction(function: MathFunction) {
        database.mathFunctionDao().insert(function)
    }

    suspend fun getAllMathFunctions(): List<MathFunction> {
        return database.mathFunctionDao().getAllFunctions()
    }
}