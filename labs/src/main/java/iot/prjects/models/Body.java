package iot.prjects.models;

public class Body extends Details {
    String typeOfBody;

    public Body(String name, String producer, String material, String type, double weight, int serialNumber, boolean isPartOfTheChassis, String typeOfBody) {
        super(name, producer, material, type, weight, serialNumber, isPartOfTheChassis);
        this.typeOfBody = typeOfBody;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", type of body";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + typeOfBody;
    }
}
