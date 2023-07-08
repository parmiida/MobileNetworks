package com.example.myapplication
import com.android.volley.*
import com.android.volley.toolbox.*
import java.util.*

// Define the URL of the server to ping
val SERVER_URL = "https://web.bale.ai/"

fun measurePing(): Double {
    val queue = Volley.newRequestQueue(context)

    // Send a GET request to the server and measure the time it takes to get a response
    val startTime = System.currentTimeMillis()
    val request = StringRequest(Request.Method.GET, SERVER_URL,
        { response ->
            val endTime = System.currentTimeMillis()
            val pingTime = (endTime - startTime).toDouble()

            // Convert the ping time to milliseconds
            return pingTime
        },
        { error ->
            // Handle the error
        })

    // Set a timeout of 5 seconds for the request
    request.retryPolicy = DefaultRetryPolicy(
        5000,
        DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
        DefaultRetryPolicy.DEFAULT_BACKOFF_MULT)

    // Add the request to the queue
    queue.add(request)
}
