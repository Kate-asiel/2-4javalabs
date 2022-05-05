package iot.prjects.models;

public class Suspension extends Details {
    String typeOfSuspension;

    public Suspension(String name, String producer, String material, String type, double weight, int serialNumber, boolean isPartOfTheChassis, String typeOfSuspension) {
        super(name, producer, material, type, weight, serialNumber, isPartOfTheChassis);
        this.typeOfSuspension = typeOfSuspension;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", type of suspension";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + typeOfSuspension;
    }
}

