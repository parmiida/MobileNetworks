# Mobile Networks Final Project
# Alioth project - Group 15 : Parmida Majmasanaye, Zahra Momeninezhad

In this project, we are going to measure the quality of Bale Messenger. First, we will review the concepts of QoS and QoE, and then we will discuss what is meant by the quality measurement of a messenger.

QoS stands for Quality of Service. It refers to the ability of a network to provide different levels of service to different types of traffic. QoS allows network administrators to prioritize certain types of traffic over others, ensuring that critical applications and services receive the necessary bandwidth and are not affected by congestion or other network issues. QoS can be used to prioritize traffic based on factors such as latency, packet loss, jitter, and throughput. It is often used in enterprise networks, service provider networks, and other situations where network performance is critical.

QoE stands for Quality of Experience. It is a term used to describe the overall quality of an end-user's experience with a particular product or service. Unlike QoS, which focuses on the technical aspects of network performance, QoE takes into account the subjective experience of the end-user.

QoE can be influenced by a variety of factors, including network performance, application performance, device capabilities, and user behavior. For example, a user may have a high-quality network connection, but if the application they are using is slow or unresponsive, their QoE may still be poor.
To measure QoE, researchers may use a combination of subjective and objective metrics. Subjective metrics can include surveys or interviews with users to gauge their overall satisfaction with a product or service. Objective metrics can include measurements of network performance, application performance, and other technical factors.
Overall, QoE is an important consideration for companies that provide products or services to end-users, as it can directly impact user satisfaction, retention, and loyalty.

---------------------------------------------------------------------------------------------------------------------------------------------
Now we want to find out what is meant by the quality measurement of a messenger?

Messenger quality measurement refers to the process of evaluating the quality of a messaging service, such as a chat application, based on various metrics. The purpose of messenger quality measurement is to assess the performance and user experience of the messaging service.

Some of the metrics used to measure messenger quality include:

1. Message delivery rate: This measures the percentage of messages that are successfully delivered to the intended recipient.

2. Message latency: This measures the time it takes for a message to be delivered from the sender to the recipient.

3. Message throughput: This measures the number of messages that can be sent and received per unit of time.

4. Message reliability: This measures the likelihood of a message being lost or corrupted during transmission.

5. User engagement: This measures the level of user engagement with the messaging service, such as the number of active users, the frequency of use, and the duration of use.

By measuring these and other metrics, messenger quality measurement can help identify areas for improvement in the messaging service and ensure that it meets the needs and expectations of its users.

---------------------------------------------------------------------------------------------------------------------------------------------
We considered three parameters: download speed, upload speed and ping. The main files are DownloadSpeed.kt, UploadSpeed.kt and ping.kt.

To get the download and upload rate of Bale we did a lot of research. We tried several ways including using the website, the APIs, but we complete it with the help of TrafficStats library finally.
For measuring the upload and download speed, we extract the name of the Bale package. The package name of the program in the mobile phone is "ir.nasim". Then we get the application name with getAppUid. And with the TrafficStats functions, we get the upload and download rates. For ping, we send a request to the website and calculate the response delay.
