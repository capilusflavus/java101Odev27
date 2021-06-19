package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Kaç tane sayi gireceksiniz : ");
        int n=scanner.nextInt();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=1; i<=n; i++){
            System.out.print(i+". Sayıyı giriniz : ");
            int k=scanner.nextInt();
         if (max<k){
             max=k;
         }
         if(min>k){
             min=k;
         }
        }
        System.out.println("En büyük sayı : "+ max);
        System.out.println("En küçük sayı : "+ min);
    }
}
