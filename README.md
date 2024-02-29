# Reverse Echo TCP/UDP

This project consists of Java programs that implement simple reverse echo communication protocols using TCP/IP and UDP sockets. The server can handle multiple client connections concurrently in TCP/IP implementations.

## Features

- **Reverse Echo TCP**: The server receives messages from TCP clients, reverses them, and sends them back to the clients. It can handle multiple TCP client connections concurrently.
- **Reverse Echo UDP**: The server receives messages from UDP clients, reverses them, and sends them back to the clients. It can handle multiple UDP client connections concurrently.

## How to Use

### TCP Implementation

1. **Compilation**: Compile the Java source files for the TCP implementation using a Java compiler (e.g., `javac`). Ensure that you compile all Java files in the `reverseEcho` package.

2. **Execution**:
   - Run the TCP server program first by executing the `server` class. Make sure to specify the appropriate classpath if needed.
   - Then, run one or more instances of the TCP client program by executing the `client` class. Ensure that you specify the correct classpath and package.

3. **Interaction**:
   - Once the TCP server and clients are running, the clients can send messages to the server.
   - The server will receive the messages, reverse them, and send them back to the respective clients.
   - The clients will display the reversed messages received from the server.

### UDP Implementation

1. **Compilation**: Compile the Java source files for the UDP implementation using a Java compiler (e.g., `javac`). Ensure that you compile all Java files in the `reverseEcho.UDP` package.

2. **Execution**:
   - Run the UDP server program first by executing the `datagramServer` class. Make sure to specify the appropriate classpath if needed.
   - Then, run one or more instances of the UDP client program by executing the `datagramClient` class. Ensure that you specify the correct classpath and package.

3. **Interaction**:
   - Once the UDP server and clients are running, the clients can send messages to the server.
   - The server will receive the messages, reverse them, and send them back to the respective clients.
   - The clients will display the reversed messages received from the server.

## Requirements

- Java Development Kit (JDK)

## Installation

1. Clone the repository:
   ```bash
   https://github.com/Sharif37/socketProgramming.git
   
