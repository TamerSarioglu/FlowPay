package com.tamersarioglu.flowpay.data.database.subscription

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

@Dao
interface SubscriptionDao {
    @Query("SELECT * FROM subscriptions WHERE isActive = 1 ORDER BY nextBillingDate ASC")
    fun getActiveSubscriptions(): Flow<List<SubscriptionEntity>>

    @Query("SELECT * FROM subscriptions ORDER BY updatedAt DESC")
    fun getAllSubscriptions(): Flow<List<SubscriptionEntity>>

    @Query("SELECT * FROM subscriptions WHERE id = :id")
    suspend fun getSubscriptionById(id: String): SubscriptionEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSubscription(subscription: SubscriptionEntity)

    @Update
    suspend fun updateSubscription(subscription: SubscriptionEntity)

    @Delete
    suspend fun deleteSubscription(subscription: SubscriptionEntity)

    @Query("SELECT * FROM subscriptions WHERE nextBillingDate BETWEEN :startDate AND :endDate")
    suspend fun getSubscriptionsDueBetween(startDate: LocalDate, endDate: LocalDate): List<SubscriptionEntity>

    @Query("SELECT category, SUM(price) as totalAmount, COUNT(*) as count FROM subscriptions WHERE isActive = 1 GROUP BY category")
    suspend fun getCategorySpending(): List<CategorySpendingResult>
}

data class CategorySpendingResult(
    val category: String,
    val totalAmount: Double,
    val count: Int
)