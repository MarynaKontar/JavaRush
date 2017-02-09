package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось:
Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться
при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String bab = reader.readLine();
        //Human Bab = new Human(bab);
        //Human GrandfatherVova = new Human("Вова",true,65,null,Bab);
        Human GrandfatherVova = new Human("Вова",true,65,null,null);
        Human GrandfatherSer = new Human("Сергей",true,64,null,null);
        Human GrandmotherTanya = new Human("Таня",false,66,null,null);
        Human GrandmotherOlya = new Human("Оля",false,65,null,null);
        Human Father = new Human("Вова",true,35,GrandfatherSer,GrandmotherOlya);
        Human Mother = new Human("Марина",false,36,GrandfatherVova, GrandmotherTanya);

        Human Child1 = new Human("Илья",true,11,Father,Mother);
        Human Child2 = new Human("Маша",false,6,Father,Mother);
        Human Child3 = new Human("Вероника",false,0,Father,Mother);

        System.out.println(GrandfatherVova);
        System.out.println(GrandfatherSer);
        System.out.println(GrandmotherTanya);
        System.out.println(GrandmotherOlya);
        System.out.println(Father);
        System.out.println(Mother);
        System.out.println(Child1);
        System.out.println(Child2);
        System.out.println(Child3);
        //напишите тут ваш код
    }

    public static class Human
    {
        String name;
        Boolean sex;
        int age;
        Human mother;
        Human father;

        /*public Human(String name){
        this.name = name;}*/
        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;

        }
        //напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
