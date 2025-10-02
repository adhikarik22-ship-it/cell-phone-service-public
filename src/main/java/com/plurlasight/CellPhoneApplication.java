package com.plurlasight;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class CellPhoneApplication {

    public static void main(String[] args) {
        // instance of cellphone
        CellPhone myCellPhone = new CellPhone();
        Scanner scanner = new Scanner (System.in);

        //phone info prompt.
        System.out.println("Serial Number: ");
        String serialNumber = scanner.nextLine();

        System.out.println("Model: ");
        String model = scanner.nextLine();

        System.out.println("Carrier: ");
        String carrier = scanner.nextLine();

        System.out.println("Phone Number");
        String phoneNumber = scanner.nextLine();

        System.out.println("Owner's Name:");
        String owner = scanner.nextLine();

        // using setter to add value

        System.out.println("\nCell Phone Info: ");
        System.out.println("Serial Number: " + myCellPhone.getSerialNumber());

        System.out.println("Model: " + myCellPhone.getModel());

        System.out.println("Carrier: " + myCellPhone.getCarrier());

        System.out.println("Phone Number: " + myCellPhone.getPhoneNumber());

        System.out.println("Owner's name: " + myCellPhone.getOwner());



    }
}
