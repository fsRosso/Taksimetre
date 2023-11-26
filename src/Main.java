//km başına 2.20tl, minimum ücret 20tl, açılış ücreti 10tl.

import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        int km, acilisUcreti=10, minucret=20;
        double perkm=2.20, tutar;


        Scanner inp=new Scanner(System.in);

        System.out.println("Mesafeyi km cinsinden giriniz:");
        km=inp.nextInt();

        tutar=((km*perkm)+acilisUcreti);

        tutar=(tutar<20) ? 20 : tutar;
        System.out.println("Ücret: " +tutar);
    }
}