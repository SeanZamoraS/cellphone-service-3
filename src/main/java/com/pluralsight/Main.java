package com.pluralsight;

import java.util.Scanner;

public class Main
{
    static Scanner input = new Scanner(System.in);

    static CellPhone cellphone1 = new CellPhone();
    static CellPhone cellphone2 = new CellPhone();

    public static void main(String[] args)
    {
        //adding new values for cellphone2 for the purpose of the exercise
        cellphone2.setSerialNumber(87654321);
        cellphone2.setCarrier("Verizon");
        cellphone2.setModel("Motorola Moto G");
        cellphone2.setPhoneNumber("360-123-4567");
        cellphone2.setOwner("Yob Gob");
        promptUser();
    }

    public static void promptUser()
    {
        //int userSerialNumberInput = 0;
        String userModelInput = " ";
        String userCarrierInput = " ";
        String userPhoneNumberInput = " ";
        String userOwnerInput = " ";


        System.out.println("""
                Cellphone application start!
                
                What is the phone's serial number? """);

        //userSerialNumberInput = input.nextInt();
        //cellphone1.setSerialNumber(userSerialNumberInput);
        //input.nextLine();
        theExceptionPreventer9000();

        System.out.println("\nWhat model is the phone?" );
        userModelInput = input.nextLine();
        cellphone1.setModel(userModelInput);

        System.out.println("\nWhat is the carrier of the phone?" );
        userCarrierInput = input.nextLine();
        cellphone1.setCarrier(userCarrierInput);

        System.out.println("\nWhat is the phone number?" );
        userPhoneNumberInput = input.nextLine();
        cellphone1.setPhoneNumber(userPhoneNumberInput);

        System.out.println("\nWhat is the first and last name of the owner of the phone?" );
        userOwnerInput = input.nextLine();
        cellphone1.setOwner(userOwnerInput);

        display(cellphone1);
        display(cellphone2);

        String secondPhoneNumber = cellphone2.getPhoneNumber();
        cellphone1.dialPhoneNumber(secondPhoneNumber);

    }

    public static void display(CellPhone phone)
    {
        System.out.println("\n" + phone.getSerialNumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getOwner());
    }

    public static void theExceptionPreventer9000()
    {
        while (true)
        {
            try
            {
                int userSerialNumberInput = input.nextInt();
                cellphone1.setSerialNumber(userSerialNumberInput);
                input.nextLine();
                break;
            }
            catch (Exception e)
            {
                System.out.println("\nPlease enter a valid serial number. ");
                input.nextLine();
            }

        }
    }

}