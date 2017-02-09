package com.javarush.test.level04.lesson04.task09;

/* Светофор
Работа светофора для пешеходов запрограммирована следующим образом: в начале каждого
часа в течение трех минут горит зеленый сигнал,
затем в течение одной минуты — желтый, а потом в течение одной минуты — красный,
затем опять зеленый горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала
 очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зеленый" - если горит зеленый цвет, "желтый" - если горит желтый цвет, "красный" - если горит красный цвет.
Пример для числа 2.5:
зеленый
Пример для числа 3:
желтый
Пример для числа 4:
красный
Пример для числа 5:
зеленый
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String tt=reader.readLine();
        double t=Double.parseDouble(tt);
        int k=0;
        for (int i = 0; i < 12; i++){
        if ((5*i<=t)&&(t<3+5*i))
            k=1;
        else if ((3+5*i<=t)&&(t<4+5*i))
            k=2;
        else if ((4+5*i<=t)&&(t<5+5*i))
            k=3;

        }

        if (k==1) System.out.println("зеленый");
        else if (k==2) System.out.println("желтый");
        else if (k==3) System.out.println("красный");
        else System.out.println("минуты надо вводить от 0 до 60 минут");
    }
}