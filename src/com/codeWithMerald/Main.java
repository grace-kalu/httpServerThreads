package com.codeWithMerald;
import java.io.IOException;
import java.net.ServerSocket;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.net.Socket;


public class Main {
    static final int port = 8000;
    static Path pathForHtml = Paths.get("src/com/codeWithMerald/index.html");
    static Path pathForJson = Paths.get("src/com/codeWithMerald/json.json");
    public static void main(String[] args) {
	// write your code here

        System.out.printf("Server is waiting for connection on port %d\n", port);
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            List<String>html = Files.readAllLines(pathForHtml, StandardCharsets.UTF_8);
            List<String>json = Files.readAllLines(pathForJson, StandardCharsets.UTF_8);
            while (true) {
                Socket clientSocket = serverSocket.accept();
                ClientThread client = new ClientThread(clientSocket, html, json);
                client.start();
            }
        }
        catch (IOException e) {
            System.out.printf(e.getMessage());
        }
    }
}







