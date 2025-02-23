# MultiThreaded Web Server in Java

## 📌 Project Overview

This project implements a **web server in Java** with three different architectures:

1. **Single-Threaded Server** - Handles one client at a time.
2. **Multi-Threaded Server (without Thread Pool)** - Creates a new thread for each client.
3. **Multi-Threaded Server (with Thread Pool)** - Uses a fixed thread pool for efficient resource management.

Each implementation demonstrates different concurrency models, showcasing the trade-offs in performance and resource utilization.

---

## 🚀 Features

✅ Accepts multiple client connections
✅ Implements single-threaded and multi-threaded approaches
✅ Uses a thread pool for optimized resource management

## 🛠️ Technologies Used

- **Java** (Sockets, Threads, ExecutorService)
- **Concurrency & Threading**

---

---

## 🎯 How to Run the Server

### **1️⃣ Running the Single-Threaded Server**

```sh
javac SingleThreadedServer.java
java SingleThreadedServer
```

Output:

```
Server is listening on port 8010
```

### **2️⃣ Running the Multi-Threaded Server (Without Thread Pool)**

```sh
javac MultiThreadedServer.java
java MultiThreadedServer
```

Output:

```
Server is listening on port 8010
New client connected from 192.168.1.5
```

### **3️⃣ Running the Multi-Threaded Server (With Thread Pool)**

```sh
javac ThreadPoolServer.java
java ThreadPoolServer
```

Output:

```
Server is listening on port 8010
Client connected: 192.168.1.10
```

---

## 🖥️ How to Run the Client

```sh
javac Client.java
java Client
```

Expected Output:

```
Connected to server
Server response: Hello from server 192.168.1.10
```

---

## 📌 Performance Comparison

| Server Type     | Performance | Resource Usage | Scalability       |
| --------------- | ----------- | -------------- | ----------------- |
| Single-Threaded | 🚫 Slow     | ✅ Low          | 🚫 Limited        |
| Multi-Threaded  | ✅ Faster    | 🚫 High        | ✅ Scalable        |
| Thread Pool     | ✅ Optimized | ✅ Balanced     | ✅ Highly Scalable |

---

## 📌 Future Improvements

🔹 Implement support for HTTP requests
🔹 Add a graphical interface for monitoring connections
🔹 Implement file handling (serving static files)
🔹 Support secure connections (SSL/TLS)

---

## 🏆 Contributors

💡 \*\*Uday Kumar \*\*📅 **23-02-2025**





