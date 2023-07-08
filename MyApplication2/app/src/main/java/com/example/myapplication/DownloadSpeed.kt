package com.example.myapplication
import android.net.TrafficStats
import java.util.*

// Define the package name of the app to be monitored
val APP_PACKAGE_NAME = "ir.nasim"

fun measureDownloadSpeed(): Double {
    // Get the UID of the app
    val appUid = getAppUid(APP_PACKAGE_NAME)

    // Get the number of bytes received by the app
    val initialBytesReceived = TrafficStats.getUidRxBytes(appUid)

    // Wait for a few seconds for the download to complete
    Thread.sleep(5000)

    // Get the number of bytes received by the app again
    val finalBytesReceived = TrafficStats.getUidRxBytes(appUid)

    // Calculate the download speed in bytes per second
    val downloadSpeed = (finalBytesReceived - initialBytesReceived) / 5.0

    // Convert the download speed to megabits per second
    return downloadSpeed / (1024.0 * 1024.0 * 8.0)
}

fun getAppUid(packageName: String): Int {
    val pm = context.packageManager
    val ai = pm.getApplicationInfo(packageName, 0)
    return ai.uid
}