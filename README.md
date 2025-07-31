
# 🔒 Photo Vault App

A secure offline Photo Vault App built using Kotlin and Jetpack Compose, allowing users to import, store, and privately view their photos. Focused on privacy, simplicity, and smooth user experience without using cloud storage.

## ✨ Features

- 🖼️ Import photos from device gallery
- 📂 Store photos securely in local storage
- 🔐 Private viewing of photos inside the app
- ⬅️➡️ Navigate through photos with Next/Previous buttons
- 🆔 Save photo IDs for quick access
- 🚫 No cloud storage — 100% offline & private

## 🚀 Tech Stack

- **Kotlin**
- **Jetpack Compose**
- **Room Database (Photo metadata)**
- **MVVM Architecture**
- **Coroutines & Flows**

## 🏗️ Project Structure

```

com.yourpackage.photovault
│
├── ui/               # Compose UI Screens (Gallery, Viewer)
├── viewmodel/        # ViewModels handling app logic
├── repository/       # Handles photo storage & retrieval
├── model/            # Photo Data Models
├── utils/            # Helper functions (storage, permissions)
└── MainActivity.kt   # Entry point

````

## 📲 Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/photo-vault.git](https://github.com/Bhaskarkr64/Photo-Vault.git
````

2. Open in **Android Studio**
3. Run on a physical device (photo access permissions needed)

## 🛡️ Permissions Required

* READ\_EXTERNAL\_STORAGE (For Android <13)
* READ\_MEDIA\_IMAGES (For Android 13+)
* WRITE\_EXTERNAL\_STORAGE (Optional for file management)

## 📦 Future Enhancements

* PIN / Fingerprint lock for app access
* Folder categorization for photos
* Trash bin & recovery feature
* Encrypt photos in internal storage

```
