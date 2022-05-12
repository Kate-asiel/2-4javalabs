package iot.prjects.models;

public class Wheels extends Details {
    String typeOfWheels;

    public Wheels(String name, String producer, String material, String type, double weight, int serialNumber, boolean isPartOfTheChassis, String typeOfWheels) {
        super(name, producer, material, type, weight, serialNumber, isPartOfTheChassis);
        this.typeOfWheels = typeOfWheels;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", type of wheels";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + typeOfWheels;
    }
}

