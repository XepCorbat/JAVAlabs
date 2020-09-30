package laba5;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Задние 10");
        reserve(321);
        System.out.println('\n');
        Sequence();
        Sequence12();
        Sequence13();
        System.out.println("Задание 14");
        System.out.println("Введите число");
        reserve2(321);
    }

    public static void reserve(int n)
    {

        System.out.print(n % 10 );
        if (n / 10 != 0)
        {
            reserve(n / 10);
        }
    }

    public static void Sequence()
    {
        System.out.println("Задание 11");
        System.out.println("Введите число");
        int count = 0;
        Scanner console = new Scanner(System.in);
        String select = console.nextLine();
        for (int i = 0; i < select.length(); i++)
        {
            if (select.charAt(i) == '0' && select.charAt(i + 1) == '0') break;
            if (select.charAt(i)=='1')count++;
        }
        System.out.println(count);
    }
    public static void Sequence12()
    {
        System.out.println("Задание 12");
        System.out.println("Введите число");
        Scanner console = new Scanner(System.in);
        String select = console.nextLine();
        for (int i = 0; i < select.length(); i++) {
            char is = select.charAt(i);
            int s = Character.getNumericValue(is);
            if (s % 2 == 1) {
                System.out.print(s);

            }

        }
        System.out.println();
    }

        public static void Sequence13()
        {
            System.out.println("Задание 13");
            System.out.println("Введите число");
            Scanner console1 = new Scanner(System.in);
            String select1 = console1.nextLine();
            int index=-1;
            for (int i = 0; i < select1.length(); i++)
            {
                char is = select1.charAt(i);
                int s = Character.getNumericValue(is);
                index++;
                if (s % 2 != 0)
                {
                    System.out.print(index);
                }

            }
            System.out.println();

        }

    private static void reserve2(int i)
    {

        System.out.println(i % 10 );
        if (i / 10 != 0)
        {
            reserve2(i/ 10);
        }
        System.out.println();
    }

}



