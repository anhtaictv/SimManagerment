package com.example.simmanagerment.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

class Sim {@Entity(tableName = "sims")
data class Sim(
    @PrimaryKey
    val serialNumber: String,
    val phoneNumber: String,
    val type: String,
    val purchaseDate: Long,
    val purchasePrice: Double,
    val supplier: String,
    val status: SimStatus
)

    enum class SimStatus {
        IN_STOCK,
        SOLD
    }
}