package com.tamersarioglu.flowpay.data.database.subscription

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.tamersarioglu.flowpay.data.database.BillingInterval
import com.tamersarioglu.flowpay.data.database.Converters
import com.tamersarioglu.flowpay.domain.model.SubscriptionCategory
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.UUID

/**
 * Database entity representing a subscription.
 * This is part of the data layer and is used for Room database operations.
 */
@Entity(tableName = "subscriptions")
@TypeConverters(Converters::class)
data class SubscriptionEntity(
    @PrimaryKey val id: String = UUID.randomUUID().toString(),
    val name: String,
    val price: Double,
    val currency: String = "USD",
    val billingInterval: BillingInterval,
    val customIntervalDays: Int = 0,
    val startDate: LocalDate,
    val nextBillingDate: LocalDate,
    val isActive: Boolean = true,
    val iconUrl: String? = null,
    val category: SubscriptionCategory,
    val description: String? = null,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime = LocalDateTime.now()
)