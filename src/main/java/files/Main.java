package files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final String FILEPATH = "C:/Users/48721/Desktop/SDA/5. Java zaawansowana - programowanie/2021.03.06-07/Java_zaawansowana_programowanie-app/file.txt";

    public static void main(String[] args) {
        List<User> users = readFromFile();
        Scanner scanner = new Scanner(System.in);
        String line;
        // List<User> users = new ArrayList<>();
        while (true) {
            line = scanner.nextLine();
            if (line.equals("koniec")) {
                break;
            }
            users.add(new User(line));
        }
        System.out.println(users);
        writeToFile(users);
    }

    public static void writeToFile(List<User> users) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(FILEPATH);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(users);
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<User> readFromFile() {
        try (FileInputStream fileInputStream = new FileInputStream(FILEPATH);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            List<User> users = (List<User>) objectInputStream.readObject();
            return users;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
