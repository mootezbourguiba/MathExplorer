package tm.esprit.mathexplorer.data.models

import java.util.UUID

// Enum représentant les différents types de fonctions mathématiques
enum class FunctionType {
    POLYNOMIAL,
    TRIGONOMETRIC,
    RATIONAL
}

// Classe représentant une fonction mathématique
data class MathFunction(
    val id: String = UUID.randomUUID().toString(),  // Identifiant unique de la fonction
    val equation: String,  // L'équation de la fonction
    val type: FunctionType,  // Le type de fonction
    val analysisCriteria: AnalysisCriteria  // Les critères d'analyse de la fonction
)
