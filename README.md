# CashChaser — Pocket Money Tracker

CashChaser is an Android-based expense tracking application developed using Kotlin and Android Studio. The application helps users manage their personal finances by tracking daily expenses, setting monthly budgets, monitoring spending habits, and viewing savings summaries through a simple and user-friendly interface.

---

## Problem Statement

Managing personal finances and tracking daily expenses can be challenging, especially when trying to stay within a budget. DimeDoodles aims to provide users with a convenient platform to set spending limits, record expenses, receive budget warnings, and monitor monthly savings or overspending.

---

## Objectives

- Allow users to set a monthly spending limit
- Enable expense logging with product name and date
- Track and display monthly spending
- Notify users when nearing budget limits
- Generate monthly savings and expenditure summaries

---

## Features

- User Login System
- Monthly Budget Setup
- Expense Tracking
- Expense History
- Savings & Overspending Overview
- User-Friendly Interface
- Budget Warning Notifications

---

## Technology Stack

- Kotlin
- Android Studio
- XML Layouts
- Room Database
- LiveData & ViewModel
- Material Design Components
- SharedPreferences

---

## Android Components Used

### Activities
- MainActivity
- AddIncomeActivity
- AddExpenseActivity
- BudgetActivity
- ReportsActivity

### Fragments
- IncomeFragment
- ExpenseFragment
- BudgetFragment

### Other Components
- Room Database
- DAO Interfaces
- ViewModels
- LiveData
- Navigation Components
- DialogFragments
- Toasts & Snackbars

---

## Application Workflow

### Screen 1 — Login
Users enter their username and password.

### Screen 2 — Budget Input
Users set their monthly pocket money/budget and view expenditure history.

### Screen 3 — Transaction Entry
Users add:
- Item name
- Amount spent
- Date of transaction

### Screen 4 — Savings Overview
Displays:
- Total spending
- Savings amount
- Overspending details

---

## Related Work

### Mint
A finance management app with advanced budgeting and investment tracking features.

### Goodbudget
Uses the envelope budgeting method for household finance management.

### Notes/Spreadsheets
Manual expense tracking methods lacking automation and budgeting insights.

---

## Installation

1. Clone the repository

```bash
git clone https://github.com/your-username/dime-doodles-expense-tracker.git
```

2. Open the project in Android Studio

3. Sync Gradle files

4. Run the application on an emulator or Android device
