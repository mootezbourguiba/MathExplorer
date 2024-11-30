package tm.esprit.mathexplorer.data.repositories

import tm.esprit.mathexplorer.data.models.User
import kotlinx.coroutines.flow.Flow

// Interface générique de persistance
interface PersistenceService<T> {
    suspend fun save(item: T)
    suspend fun delete(item: T)
    suspend fun getById(id: String): T?
    fun getAll(): Flow<List<T>>
}

interface UserRepository {
    suspend fun insert(user: User)
    suspend fun update(user: User)
    suspend fun delete(user: User)
    suspend fun getUserById(userId: String): User?
    suspend fun authenticate(email: String, password: String): User?
    fun getAllUsers(): Flow<List<User>>
}