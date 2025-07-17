package com.tamersarioglu.flowpay.domain.model

enum class SubscriptionCategory(val displayName: String, val colorValue: Long) {
    ENTERTAINMENT("Entertainment", 0xFF9C27B0),
    PRODUCTIVITY("Productivity", 0xFF2196F3),
    HEALTH("Health & Fitness", 0xFF4CAF50),
    EDUCATION("Education", 0xFFFF9800),
    UTILITIES("Utilities", 0xFFF44336),
    SHOPPING("Shopping", 0xFFE91E63),
    FINANCE("Finance", 0xFF795548),
    NEWS("News & Media", 0xFF3F51B5),
    GAMING("Gaming", 0xFF009688),
    OTHER("Other", 0xFF607D8B)
}