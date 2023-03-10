//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.net.InetAddress;
//import java.net.ServerSocket;
//import java.net.Socket;
//
//import static java.lang.System.out;
//
//public class Main {
//    public static void main(String [] arg) {
//     //   out.println("server started");
//
//        String localhost = "127.0.0.1";
//        int port = 8089;
//
//
//        try (Socket clientSocket = new Socket(localhost,port);
//             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);
//                                 BufferedReader in = new BufferedReader(new
//                                         InputStreamReader(clientSocket.getInputStream()))){
//             out.println("GET / HTTP/1.1\n"+"Host: netology.ru\n\n\n");
//
//
//                   String resp = in.readLine();
//
//                    System.out.println(resp);
//
//                }catch (IOException e){
//            e.printStackTrace();
//        }
////        InetAddress inetAddress =InetAddress.getByName(host);
////        System.out.println(host+", ip address: "+inetAddress.getHostAddress());
//            }
//        }








