package com.tamersarioglu.flowpay.domain.usecase

import com.tamersarioglu.flowpay.domain.model.Subscription
import com.tamersarioglu.flowpay.domain.repository.SubscriptionRepository
import com.tamersarioglu.flowpay.domain.util.BillingCalculator
import javax.inject.Inject

/**
 * Use case for adding a new subscription.
 * This is part of the domain layer and works with domain models.
 */
class AddSubscriptionUseCase @Inject constructor(
    private val subscriptionRepository: SubscriptionRepository
) {
    suspend operator fun invoke(subscription: Subscription) {
        val subscriptionWithNextBilling = subscription.copy(
            nextBillingDate = BillingCalculator.calculateNextBillingDate(subscription, subscription.startDate)
        )
        subscriptionRepository.insertSubscription(subscriptionWithNextBilling)
    }
}
