package iot.prjects.models;

public class Body extends Details
{
    String typeOfBody;

    public Body (String name, String producer, String material, String type, double weight, int serialNumber, boolean isPartOfTheChassis, String typeOfBody)
    {
        super(name, producer, material, type, weight, serialNumber, isPartOfTheChassis);
        this.typeOfBody = typeOfBody;
    }
}