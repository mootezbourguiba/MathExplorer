package com.mathexplorer
import android.app.Application
import com.mathexplorer.data.database.MathExplorerDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class MathExplorerApp : Application() {
    val applicationScope = CoroutineScope(SupervisorJob())
    val database by lazy { MathExplorerDatabase.getInstance(this) }

    override fun onCreate() {
        super.onCreate()
        // Optional: Initialize app-wide configurations
    }
}