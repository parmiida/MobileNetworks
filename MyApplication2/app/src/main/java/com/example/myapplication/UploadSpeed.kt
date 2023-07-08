package com.example.myapplication
import android.net.TrafficStats
import java.util.*

// Define the package name of the app to be monitored
val APP_PACKAGE_NAME = "ir.nasim"

fun measureUploadSpeed(): Double {
    // Get the UID of the app
    val appUid = getAppUid(APP_PACKAGE_NAME)

    // Get the number of bytes sent by the app
    val initialBytesSent = TrafficStats.getUidTxBytes(appUid)

    // Wait for a few seconds for the upload to complete
    Thread.sleep(5000)

    // Get the number of bytes sent by the app again
    val finalBytesSent = TrafficStats.getUidTxBytes(appUid)

    // Calculate the upload speed in bytes per second
    val uploadSpeed = (finalBytesSent - initialBytesSent) / 5.0

    // Convert the upload speed to megabits per second
    return uploadSpeed / (1024.0 * 1024.0 * 8.0)
}

fun getAppUid(packageName: String): Int {
    val pm = context.packageManager
    val ai = pm.getApplicationInfo(packageName, 0)
    return ai.uid
}
