package tm.esprit.mathexplorer.data.models

// Classe contenant les critères d'analyse d'une fonction mathématique
data class AnalysisCriteria(
    val continuity: Boolean,         // Indicateur de continuité de la fonction
    val differentiability: Boolean,  // Indicateur de différentiabilité de la fonction
    val extrema: Boolean             // Indicateur de présence d'extrema (maxima/minima)
)
