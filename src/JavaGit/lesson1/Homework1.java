package JavaGit.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework1 {
    public static void main(String[] args) {
        task1();
        mat();
        System.out.println(mat());
    }
    private static void task1(){
        System.out.println("Homework!");
    }
    public static String mat(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter id: ");
            String id = br.readLine();
            return id;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
