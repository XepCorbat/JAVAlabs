package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DequeueForGame {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Deque<Integer> st1=new ArrayDeque<Integer>();
        Deque<Integer> st2=new ArrayDeque<Integer>();
        /*Карты первого игрока*/
        for(int i=0;i<5;i++)
            st1.add(scanner.nextInt());
        /*Карты второго игрока*/
        for(int i=0;i<5;i++)
            st2.add(scanner.nextInt());
        play(st1,st2);
    }
    public static void play(Deque<Integer> st1,Deque<Integer> st2){
        int k=0;
        while(!st1.isEmpty()&&!st2.isEmpty()&&k<107){
            int FirstCard= st1.pop();
            int SecondCard=st2.pop();
            if(FirstCard==0&&SecondCard==9){
                st1.add(FirstCard);
                st1.add(SecondCard);
            }else if(FirstCard==9&&SecondCard==0){
                st2.add(FirstCard);
                st2.add(SecondCard);
            } else if(FirstCard<SecondCard){
                st2.add(FirstCard);
                st2.add(SecondCard);
            } else {
                st1.add(FirstCard);
                st1.add(SecondCard);
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