package Trash;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Trash {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fileName = in.nextLine();
        int a = 0;
        int b = 0;
        try(FileReader reader = new FileReader(fileName))
        {
            // читаем посимвольно
            int c;
            while((c = reader.read()) != -1){
                a = a * 10 + c;
            }
            System.out.println(a);
            while((c = reader.read()) != -1){
                b = b * 10 + c;
            }
            System.out.println(b);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        try(FileWriter writer = new FileWriter(fileName, false))
        {
            // запись всей строки
            System.out.println(a + b);
            String text = String.valueOf(a + b);
            writer.write(text);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
