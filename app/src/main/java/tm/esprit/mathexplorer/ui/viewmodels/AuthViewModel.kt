package tm.esprit.mathexplorer.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import tm.esprit.mathexplorer.data.repositories.UserRepository
import kotlinx.coroutines.launch

class AuthViewModel(private val userRepository: UserRepository) : ViewModel() {
    fun signIn(email: String, password: String) {
        viewModelScope.launch {
            val user = userRepository.signIn(email, password)
            // Gérer le résultat de la connexion
        }
    }

    fun signOut() {
        userRepository.signOut()
    }
}