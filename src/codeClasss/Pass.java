package codeClasss;

import java.time.LocalDate;

public class Pass {
    public static void main(String[] args) {
        Passport ukPassport = new Passport("98DCV",LocalDate.ofYearDay(2032,05),"England");
        Passport lkPassport = new Passport("DS456e",LocalDate.ofYearDay(2033,05),"Sri Lanka");

        System.out.println("UK Passport Details ");
        System.out.println(ukPassport.number);
        System.out.println(ukPassport.expiryDate);
        System.out.println(ukPassport.country);
        System.out.println(" ");

        System.out.println("LK Passport Details ");
        System.out.println(lkPassport.number);
        System.out.println(lkPassport.expiryDate);
        System.out.println(lkPassport.country);
        System.out.println(" ");



    }

    // Passport creation blueprint
    static class Passport{
        String number;
        LocalDate expiryDate;
        String country;
        // create constructor
        Passport(String number, LocalDate expiryDate,String country){
            this.number = number;
            this.expiryDate = expiryDate;
            this.country = country;
        }
    }

}

