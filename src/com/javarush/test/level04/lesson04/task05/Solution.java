package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //System.out.print("Введіть число: ");
        //System.out.println("");
        String number = reader.readLine();
        double number1=Double.parseDouble(number);

        if (number1>0)
            System.out.println(number1*2);
        else    System.out.println(++number1);
        //(nnumber<0) else System.out.println(nnumber);*/


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //System.out.print("Введіть число: ");
        //System.out.println("");
        String number = reader.readLine();
        int number1=Integer.parseInt(number);
        int c=0;
        if (number1>0){
            c=number1*2;}
        else {c=number1+1;}
        System.out.println(c);
        //напишите тут ваш код


    }

}