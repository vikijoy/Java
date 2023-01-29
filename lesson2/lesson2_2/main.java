package lesson2_2;

import java.io.*;
public class main {
    public static String isString100(String s) {
        String Result = "";
        for (int i = 1; i <= 100; i++){
            Result = Result + s;
        }
        return Result;
    }
    public static void WriteToFile(String s) {
        try(FileWriter writer = new FileWriter("lesson2_2.txt", false))
        {
            writer.write(s);
            //writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        String StrVal = isString100("TEST");
        WriteToFile(StrVal);
    }
}