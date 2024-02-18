package org.example;

import java.io.*;

public class FunctionForZad2 {

    // Запись массива Arr в файл s
    public static void WriteInFile(byte[] Arr,String s){
        try(DataOutputStream f = new DataOutputStream(new FileOutputStream(s))){
            for (int i = 0;i < Arr.length; i++){
                f.writeByte(Arr[i]);
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    // расчет среднего значения чисел файла
    public static double ReadFile(String s){
        try(DataInputStream f = new DataInputStream(new FileInputStream(s))){
            int k = 0;
            double sum = 0;
            double temp;
            while(true){
                temp = f.read();
                if (temp == -1){
                    return sum/k;
                }
                else {
                    sum = sum + temp;
                    k++;
                }
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
            return 0;
        }
    }




}
