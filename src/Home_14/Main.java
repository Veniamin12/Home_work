package Home_14;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
        String lineString;

        while (!(lineString = bufferedReader.readLine()).equals("exit")) {
            if (lineString.equals("hello")) {
                String hello = "Привіт";
                System.out.println(hello);
                bufferedWriter.write(hello);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }

            if ((lineString.contains("ъ") || (lineString.contains("ы") || (lineString.contains("э"))))) {
                String askpalyanutsa = "Що таке паляниця?";
                System.out.println("Що таке паляниця?");
                bufferedWriter.write(askpalyanutsa);
                bufferedWriter.newLine();
                bufferedWriter.flush();

                if (bufferedReader.readLine().equals("паляниця")) {
                    LocalDate localDate = LocalDate.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    String curentdate = localDate.format(formatter);
                    String byebye = "Good evening";
                    System.out.println(byebye);
                    bufferedWriter.write(curentdate + byebye);
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                    break;
                } else {
                    serverSocket.close();
                    bufferedReader.close();
                    bufferedWriter.close();
                    socket.close();
                }
            }
            System.out.println(lineString);
        }
    }
}
