package iot.prjects.models;

import iot.prjects.manager.CarDetail;

public class Details
{
    String name;
    private String producer;
    private String material;
    private String type;
    private double weight; //kg
    private int serialNumber;
    private boolean isPartOfTheChassis;


    public boolean isPartOfTheChassis()
    {
        return isPartOfTheChassis;
    }

    public String getProducer()
    {
        return producer;
    }

    public int getSerialNumber()
    {
        return serialNumber;
    }

    public Details (String name, String producer, String material, String type, double weight, int serialNumber, boolean isPartOfTheChassis)
    {
        this.name = name;
        this.producer = producer;
        this.material = material;
        this.type = type;
        this.weight = weight;
        this.serialNumber = serialNumber;
        this.isPartOfTheChassis = isPartOfTheChassis;
    }


    public Details() {}

    @Override
    public String toString() {
        return "Details{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", material='" + material + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                ", serialNumber=" + serialNumber +
                ", isPartOfTheChassis=" + isPartOfTheChassis +
                '}';
    }
}