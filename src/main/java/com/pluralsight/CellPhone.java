package com.pluralsight;

public class CellPhone
{
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone() //constructor
    {
        serialNumber = 0;
        model = " ";
        carrier = " ";
        phoneNumber = "000-000-0000";
        owner = " ";
    }
    //Setters:
    public void setSerialNumber(int serialNumber)
    {
        this.serialNumber = serialNumber;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setCarrier(String carrier)
    {
        this.carrier = carrier;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    //Getters:
    public int getSerialNumber()
    {
        return serialNumber;
    }

    public String getModel()
    {
        return model;
    }

    public String getCarrier()
    {
        return carrier;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getOwner()
    {
        return owner;
    }

    public void dialPhoneNumber(String phoneNumber)
    {
        String owner = this.owner;
        System.out.printf("\n%s is calling %s.... ", owner, phoneNumber);
    }
}