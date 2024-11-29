package tm.esprit.mathexplorer.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "users")
data class User(
    @PrimaryKey val id: String = UUID.randomUUID().toString(),
    val email: String,
    val displayName: String?,
    val createdAt: Long = System.currentTimeMillis()
)