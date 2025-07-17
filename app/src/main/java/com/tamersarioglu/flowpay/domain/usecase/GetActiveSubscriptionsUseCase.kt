package com.tamersarioglu.flowpay.domain.usecase

import com.tamersarioglu.flowpay.domain.model.Subscription
import com.tamersarioglu.flowpay.domain.repository.SubscriptionRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Use case for retrieving active subscriptions.
 * This is part of the domain layer and works with domain models.
 */
@Singleton
class GetActiveSubscriptionsUseCase @Inject constructor(
    private val subscriptionRepository: SubscriptionRepository
) {
    operator fun invoke(): Flow<List<Subscription>> = subscriptionRepository.getActiveSubscriptions()
}