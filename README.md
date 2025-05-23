# FlowPay 💳

A modern Android subscription management app built with Jetpack Compose that helps you track and manage all your recurring subscriptions in one place.

## ✨ Features

- **Subscription Tracking**: Add, edit, and manage all your recurring subscriptions
- **Multiple Billing Intervals**: Support for weekly, monthly, quarterly, yearly, and custom billing cycles
- **Categorization**: Organize subscriptions by categories (Entertainment, Productivity, Health & Fitness, Education, Utilities, Shopping, Other)
- **Analytics Dashboard**: Visualize your spending patterns with interactive charts
- **Payment History**: Track payment history for all subscriptions
- **Notifications**: Get reminders for upcoming payments
- **Dark/Light Theme**: Modern Material 3 design with theme support
- **Offline Support**: Local database storage with Room

## 🛠️ Tech Stack

### Core
- **Kotlin** - Primary programming language
- **Jetpack Compose** - Modern declarative UI toolkit
- **Material 3** - Latest Material Design components

### Architecture
- **Clean Architecture** - Separation of concerns with data, domain, and presentation layers
- **MVVM Pattern** - Model-View-ViewModel architecture
- **Hilt** - Dependency injection framework

### Data & Storage
- **Room Database** - Local SQLite database with type-safe queries
- **DataStore** - Modern data storage solution for preferences
- **Kotlin DateTime** - Date and time handling

### Background Processing
- **WorkManager** - Reliable background task scheduling
- **Notifications** - Payment reminders and alerts

### UI & Visualization
- **Vico Charts** - Beautiful and interactive charts for analytics
- **Material Icons Extended** - Comprehensive icon library
- **Navigation Compose** - Type-safe navigation

## 📱 Screenshots

*Screenshots will be added here*

## 🚀 Getting Started

### Prerequisites
- Android Studio Hedgehog | 2023.1.1 or newer
- JDK 17 or higher
- Android SDK with API level 26+ (Android 8.0) support

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/tamersarioglu/FlowPay.git
   cd FlowPay
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Select "Open an existing project"
   - Navigate to the cloned FlowPay directory

3. **Build and Run**
   - Let Android Studio sync the project
   - Connect an Android device or start an emulator
   - Click the "Run" button or press `Ctrl+R` (Windows/Linux) or `Cmd+R` (Mac)

### Build Commands

```bash
# Clean build
./gradlew clean

# Build debug APK
./gradlew assembleDebug

# Build release APK
./gradlew assembleRelease

# Run tests
./gradlew test

# Run Android instrumented tests
./gradlew connectedAndroidTest
```

## 📁 Project Structure

```
app/src/main/java/com/tamersarioglu/flowpay/
├── data/                    # Data layer
│   ├── database/           # Room database entities and DAOs
│   │   ├── subcription/    # Subscription-related database components
│   │   └── paymenthistory/ # Payment history database components
│   └── repository/         # Repository implementations
├── domain/                 # Domain layer (business logic)
│   ├── model/             # Domain models
│   ├── repository/        # Repository interfaces
│   ├── usecase/          # Use cases (business operations)
│   └── util/             # Domain utilities
├── presentation/          # Presentation layer (UI)
│   ├── ui/               # Compose screens and components
│   │   ├── components/   # Reusable UI components
│   │   └── theme/        # App theming
│   ├── viewmodel/        # ViewModels
│   └── navigation/       # Navigation setup
├── di/                   # Dependency injection modules
├── notification/         # Notification handling
├── worker/              # Background workers
├── FlowPayApp.kt        # Application class
└── MainActivity.kt      # Main activity
```

## 🔧 Key Components

### Subscription Management
- Add new subscriptions with custom details
- Edit existing subscription information
- Track multiple currencies and billing intervals
- Categorize subscriptions for better organization

### Analytics
- Monthly spending overview
- Category-wise expense breakdown
- Interactive charts and visualizations
- Spending trends analysis

### Notifications
- Payment reminder notifications
- Background processing with WorkManager
- Customizable notification preferences

## 🎨 Design Philosophy

FlowPay follows Material 3 design principles with:
- **Adaptive Design**: Responsive layouts that work across different screen sizes
- **Dynamic Color**: Support for Material You dynamic theming
- **Accessibility**: Full accessibility support with proper content descriptions
- **Smooth Animations**: Delightful micro-interactions and transitions

## 📊 Database Schema

### Subscriptions Table
- `id`: Unique identifier
- `name`: Subscription service name
- `price`: Cost amount
- `currency`: Currency code (default: USD)
- `billingInterval`: Billing frequency
- `startDate`: Subscription start date
- `nextBillingDate`: Next payment due date
- `category`: Subscription category
- `isActive`: Active status

### Payment History Table
- Tracks all payment records
- Links to subscription entries
- Maintains payment dates and amounts

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request. For major changes, please open an issue first to discuss what you would like to change.

### Development Guidelines
1. Follow Kotlin coding conventions
2. Write clean, readable code with proper documentation
3. Add unit tests for new features
4. Follow the existing architecture patterns
5. Test on multiple screen sizes and orientations

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

**Tamer Sarıoğlu**
- GitHub: [@tamersarioglu](https://github.com/tamersarioglu)

## 🙏 Acknowledgments

- Android team for Jetpack Compose
- Material Design team for Material 3
- Vico team for beautiful charts
- All open-source contributors

---

*Built with ❤️ using Jetpack Compose*
