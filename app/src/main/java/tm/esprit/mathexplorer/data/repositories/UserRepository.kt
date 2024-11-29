package tm.esprit.mathexplorer.data.repositories

import com.google.firebase.auth.FirebaseAuth
import tm.esprit.mathexplorer.data.models.User
import kotlinx.coroutines.tasks.await

class UserRepository(private val firebaseAuth: FirebaseAuth) {
    suspend fun signIn(email: String, password: String): User? {
        return try {
            val result = firebaseAuth.signInWithEmailAndPassword(email, password).await()
            result.user?.let { firebaseUser ->
                User(
                    id = firebaseUser.uid,
                    email = firebaseUser.email ?: "",
                    displayName = firebaseUser.displayName
                )
            }
        } catch (e: Exception) {
            null
        }
    }

    fun signOut() {
        firebaseAuth.signOut()
    }
}
