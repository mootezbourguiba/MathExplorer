package tm.esprit.mathexplorer.core

import tm.esprit.mathexplorer.data.models.MathFunction

// Définition de l'interface MathAnalysisService
interface MathAnalysisService {
    fun calculateDerivative(function: MathFunction): String
    fun calculateIntegral(function: MathFunction): String
    fun findRoots(function: MathFunction): List<Double>
    fun plotGraph(function: MathFunction): ByteArray
    fun calculateExtrema(function: MathFunction): Map<String, Double>
}
