import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.simmanagerment.data.models.Sim
import kotlinx.coroutines.flow.Flow

@Dao
    interface SimDao {
        @Query("SELECT * FROM sims")
        fun getAllSims(): Flow<List<Sim>>

        @Insert(onConflict = OnConflictStrategy.REPLACE)
        suspend fun insertSim(sim: Sim)

        @Query("SELECT * FROM sims WHERE status = :status")
        fun getSimsByStatus(status: String): Flow<List<Sim>>
    }
}