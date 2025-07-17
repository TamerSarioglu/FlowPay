package com.tamersarioglu.flowpay.domain.model

import java.time.LocalDate
import java.time.LocalDateTime

data class Subscription(
    val id: String,
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