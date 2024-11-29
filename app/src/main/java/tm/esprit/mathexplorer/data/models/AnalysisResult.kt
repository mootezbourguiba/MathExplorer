package tm.esprit.mathexplorer.data.models

data class AnalysisResult(
    val function: MathFunction,
    val continuity: ContinuityResult,
    val derivative: DerivativeResult,
    val variationTable: VariationTable? = null,
    val aiExplanation: String? = null
)

data class ContinuityResult(
    val isContinuous: Boolean,
    val discontinuityPoints: List<Double>
)

data class DerivativeResult(
    val firstDerivative: String,
    val secondDerivative: String,
    val criticalPoints: List<Double>
)

data class VariationTable(
    val increasingIntervals: List<Pair<Double, Double>>,
    val decreasingIntervals: List<Pair<Double, Double>>
)