package com.company;

import java.util.*;
import java.util.Scanner;
public class StackForGame {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Stack<Integer> st1=new Stack();
        Stack<Integer> st2=new Stack();
        /*Карты первого игрока*/
        for(int i=0;i<5;i++)
            st1.push(scanner.nextInt());
        /*Карты второго игрока*/
        for(int i=0;i<5;i++)
            st2.push(scanner.nextInt());
        play(st1,st2);
    }
    public static void play(Stack<Integer> st1,Stack<Integer> st2){
        int k=0;
        while(!st1.isEmpty()&&!st2.isEmpty()&&k<107){
            int FirstCard= st1.pop();
            int SecondCard=st2.pop();
            if(FirstCard==0&&SecondCard==9){
                st1.add(0,FirstCard);
                st1.add(0,SecondCard);
            }else if(FirstCard==9&&SecondCard==0){
                st2.add(0,FirstCard);
                st2.add(0,SecondCard);
            } else if(FirstCard<SecondCard){
                st2.add(0,FirstCard);
                st2.add(0,SecondCard);
            } else {
                st1.add(0,FirstCard);
                st1.add(0,SecondCard);
            }
            k++;
        }
        if(k==107){
            System.out.println("botva");
        }else if(st2.isEmpty()){
            System.out.println("first "+k);
        } else{
            System.out.println("second "+k);
        }
    }
}
