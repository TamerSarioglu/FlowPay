package com.tamersarioglu.flowpay.presentation.ui.theme

import androidx.compose.ui.graphics.Color
import com.tamersarioglu.flowpay.domain.model.SubscriptionCategory

/**
 * Extension property to get the Color for each SubscriptionCategory.
 * This bridges the domain model with the presentation layer colors.
 */
val SubscriptionCategory.color: Color
    get() = Color(this.colorValue)