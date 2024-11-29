package tm.esprit.mathexplorer.data.models

enum class FunctionType {
    POLYNOMIAL,
    TRIGONOMETRIC,
    RATIONAL
}

data class MathFunction(
    val id: String = UUID.randomUUID().toString(),
    val equation: String,
    val type: FunctionType,
    val analysisCriteria: AnalysisCriteria
)