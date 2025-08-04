# MAE Wallet Android App

A native Android application built with Kotlin and Jetpack Compose that replicates the MAE Wallet UI design.

## Features

- **Modern UI Design**: Matches the original MAE Wallet interface with yellow gradient theme
- **Jetpack Compose**: Built using modern Android UI toolkit
- **Material Design 3**: Follows Material Design principles
- **Responsive Layout**: Adapts to different screen sizes
- **Bottom Navigation**: 5-tab navigation (Home, Accounts, Scan, Expenses, Apply)

## UI Components

### Home Screen
- **Header Section**: User greeting, profile avatar, settings, notifications, and login
- **Wallet Card**: Main balance display with account number and "View All Accounts" button
- **Quick Actions**: 8 action items in a grid layout including Secure2u, Pay Bills, Transfer, etc.
- **Featured Section**: 4 featured items with "NEW" badges

### Design Elements
- **Color Scheme**: Yellow gradient background (#FFE082 to #FFC107)
- **Typography**: Clean, modern fonts with proper hierarchy
- **Icons**: Material Design icons for consistency
- **Cards**: Rounded corners with subtle shadows
- **Badges**: "NEW" and "PROMO" labels for featured items

## Project Structure

```
android/
├── app/
│   ├── build.gradle                 # App-level build configuration
│   ├── proguard-rules.pro          # ProGuard rules
│   └── src/main/
│       ├── AndroidManifest.xml     # App manifest
│       ├── java/com/example/maewallet/
│       │   ├── MainActivity.kt     # Main activity
│       │   ├── MAEWalletApp.kt    # Main app composable
│       │   └── ui/
│       │       ├── components/     # Reusable UI components
│       │       ├── screens/        # Screen composables
│       │       └── theme/          # Theme and styling
│       └── res/
│           ├── values/             # Colors, strings, themes
│           └── xml/                # Backup and data extraction rules
├── build.gradle                    # Project-level build configuration
├── settings.gradle                 # Project settings
└── gradle.properties              # Gradle properties
```

## Key Components

1. **HeaderSection**: Top bar with user info and actions
2. **WalletCard**: Main wallet balance display
3. **QuickActionsSection**: Grid of quick action buttons
4. **FeaturedSection**: Featured services with badges
5. **BottomNavigationBar**: 5-tab bottom navigation

## Build Requirements

- Android Studio Arctic Fox or later
- Kotlin 1.9.10+
- Compile SDK 34
- Min SDK 24 (Android 7.0)
- Target SDK 34

## Dependencies

- Jetpack Compose BOM 2023.10.01
- Material 3
- Navigation Compose
- Activity Compose
- Core KTX

## How to Build

1. Open the `android` folder in Android Studio
2. Sync the project with Gradle files
3. Run the app on an emulator or physical device

## UI Matching

The app closely replicates the original design including:
- Exact color scheme and gradients
- Proper spacing and typography
- Icon placement and sizing
- Card layouts and shadows
- Badge positioning and styling
- Bottom navigation appearance

## Notes

This is a UI-only implementation focused on visual accuracy. The app includes placeholder click handlers but no actual functionality like payment processing or account management.
