package com.tamersarioglu.flowpay.data.mapper

import com.tamersarioglu.flowpay.data.database.BillingInterval as DataBillingInterval
import com.tamersarioglu.flowpay.data.database.subscription.SubscriptionEntity
import com.tamersarioglu.flowpay.domain.model.BillingInterval as DomainBillingInterval
import com.tamersarioglu.flowpay.domain.model.Subscription
import com.tamersarioglu.flowpay.domain.model.SubscriptionCategory

object SubscriptionMapper {
    
    fun mapToDomain(entity: SubscriptionEntity): Subscription {
        return Subscription(
            id = entity.id,
            name = entity.name,
            price = entity.price,
            currency = entity.currency,
            billingInterval = mapToDomainBillingInterval(entity.billingInterval),
            customIntervalDays = entity.customIntervalDays,
            startDate = entity.startDate,
            nextBillingDate = entity.nextBillingDate,
            isActive = entity.isActive,
            iconUrl = entity.iconUrl,
            category = entity.category,
            description = entity.description,
            createdAt = entity.createdAt,
            updatedAt = entity.updatedAt
        )
    }
    
    fun mapToEntity(domain: Subscription): SubscriptionEntity {
        return SubscriptionEntity(
            id = domain.id,
            name = domain.name,
            price = domain.price,
            currency = domain.currency,
            billingInterval = mapToDataBillingInterval(domain.billingInterval),
            customIntervalDays = domain.customIntervalDays,
            startDate = domain.startDate,
            nextBillingDate = domain.nextBillingDate,
            isActive = domain.isActive,
            iconUrl = domain.iconUrl,
            category = domain.category,
            description = domain.description,
            createdAt = domain.createdAt,
            updatedAt = domain.updatedAt
        )
    }
    
    fun mapToDomainList(entities: List<SubscriptionEntity>): List<Subscription> {
        return entities.map { mapToDomain(it) }
    }
    
    fun mapToEntityList(domains: List<Subscription>): List<SubscriptionEntity> {
        return domains.map { mapToEntity(it) }
    }
    
    private fun mapToDomainBillingInterval(dataInterval: DataBillingInterval): DomainBillingInterval {
        return when (dataInterval) {
            DataBillingInterval.WEEKLY -> DomainBillingInterval.WEEKLY
            DataBillingInterval.MONTHLY -> DomainBillingInterval.MONTHLY
            DataBillingInterval.QUARTERLY -> DomainBillingInterval.QUARTERLY
            DataBillingInterval.YEARLY -> DomainBillingInterval.YEARLY
            DataBillingInterval.CUSTOM -> DomainBillingInterval.CUSTOM
        }
    }
    
    private fun mapToDataBillingInterval(domainInterval: DomainBillingInterval): DataBillingInterval {
        return when (domainInterval) {
            DomainBillingInterval.WEEKLY -> DataBillingInterval.WEEKLY
            DomainBillingInterval.MONTHLY -> DataBillingInterval.MONTHLY
            DomainBillingInterval.QUARTERLY -> DataBillingInterval.QUARTERLY
            DomainBillingInterval.YEARLY -> DataBillingInterval.YEARLY
            DomainBillingInterval.CUSTOM -> DataBillingInterval.CUSTOM
        }
    }
}