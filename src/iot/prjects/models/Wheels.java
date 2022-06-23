package iot.prjects.models;

public class Wheels extends Details {
    String typeOfWheels;

    public Wheels(String name, String producer, String material, String type,
                  double weight, int serialNumber, boolean isPartOfTheChassis, String typeOfWheels) {
        super(name, producer, material, type, weight, serialNumber, isPartOfTheChassis);
        this.typeOfWheels = typeOfWheels;
    }
}
