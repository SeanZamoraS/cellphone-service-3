package com.pluralsight;

import java.util.Scanner;

public class Main
{
    static Scanner input = new Scanner(System.in);

    static CellPhone cellphone1 = new CellPhone();
    static CellPhone cellphone2 = new CellPhone();
    //instantiating for exercise 3
    static CellPhone cellphone3 = new CellPhone(
            11223344, "Mint", "Google Pixel 10",
            "425-987-6543", "Mr. E");

    static String[] cellphoneNumbers = new String[3];
    static CellPhone[] cellphones = new CellPhone[3];

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
        display(cellphone3);

        //original: String secondPhoneNumber = cellphone2.getPhoneNumber();
        //credit to Sara for making this less complicated
        //cellphone1.dialPhoneNumber(cellphone2.getPhoneNumber());

        //everybodyDialsEveryoneElse();
        everybodyDialsEveryoneElse2();

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
    public static void everybodyDialsEveryoneElse()
    {
        cellphoneNumbers[0] = cellphone1.getPhoneNumber();
        cellphoneNumbers[1] = cellphone2.getPhoneNumber();
        cellphoneNumbers[2] = cellphone3.getPhoneNumber();

        cellphones[0] = cellphone1;
        cellphones[1] = cellphone2;
        cellphones[2] = cellphone3;

        for (CellPhone firstNumber : cellphones)
        {
            for (String secondNumber : cellphoneNumbers)
            {
                if (!firstNumber.getPhoneNumber().equals(secondNumber))
                {
                    firstNumber.dialPhoneNumber(secondNumber);
                }
            }
        }
    }
    public static void everybodyDialsEveryoneElse2()
    {
        //this also works? didn't think about it before but I don't technically need 2 arrays
        //just requires a lot of methods within methods
        cellphones[0] = cellphone1;
        cellphones[1] = cellphone2;
        cellphones[2] = cellphone3;

        for (CellPhone firstNumber : cellphones)
        {
            for (CellPhone secondNumber : cellphones)
            {
                if (!firstNumber.getPhoneNumber().equals(secondNumber.getPhoneNumber()))
                {
                    firstNumber.dialPhoneNumber(secondNumber.getPhoneNumber());
                }
            }
        }
    }
}