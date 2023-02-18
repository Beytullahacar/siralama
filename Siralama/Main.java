package Siralama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scan = new Scanner(System.in);
        System.out.print("a sayısını giriniz : ");
        a = scan.nextInt();
        System.out.print("b sayısını giriniz : ");
        b = scan.nextInt();
        System.out.print("c sayısını giriniz : ");
        c = scan.nextInt();

        if (a<b && b<c){
            System.out.println("a < b < c");
        }else if (a<c && c<b){
            System.out.println("a < c < b");
        }else if (b<a && a<c){
            System.out.println("b < a < c");
        }else if (b<c && c<a){
            System.out.println("b < c < a");
        }else if (c<b && b<a){
            System.out.println("c < b < a");
        }else {
            System.out.println("c < a < b");
        }
    }
}
