package iot.prjects.models;

public class Engine extends Details
{
    String typeOfEngine;

    public Engine (String name, String producer, String material, String type, double weight, int serialNumber, boolean isPartOfTheChassis, String typeOfEngine)
    {
        super(name, producer, material, type, weight, serialNumber, isPartOfTheChassis);
        this.typeOfEngine = typeOfEngine;
    }

}
