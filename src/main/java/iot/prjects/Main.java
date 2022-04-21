package iot.prjects;

import iot.prjects.manager.CarDetail;
import iot.prjects.models.*;

public class Main
{

    public static void main(String[] args)
    {
        Body body = new Body("Body", "Germany", "sheet steel", "car body", 500, 1943628806, false, "body");
        Engine engine = new Engine("Engine", "Canada", "white cast iron", "petrol or diesel", 200, 1287653984, false, "engine");
        Suspension suspension = new Suspension("Suspension", "Japan", "titanium", "chassis", 2500, 1763456759, true, "suspension");
        Frame frame = new Frame("Frame", "Korea", "mild steel", "chassis", 200, 2054637254, true, "frame");
        Wheels wheels = new Wheels("Wheels", "Italy", "plastic", "chassis", 30, 2138776485, true, "wheels");

        CarDetail carDetail = new CarDetail();
        carDetail.addDetails();
        System.out.println("Found details to collect the chassis");
        carDetail.foundDetails();
        System.out.println("\n");
        System.out.println("Sort found details' producer by ascending");
        carDetail.sortByProducerAsc();
        System.out.println("\n");
        System.out.println("Sort found details' producer by descending");
        carDetail.sortByProducerDesc();
        System.out.println("\n");
        System.out.println("Sort details' serial number by ascending");
        carDetail.sortBySerialNumberAsc();
        System.out.println("\n");
        System.out.println("Sort details' serial number by descending");
        carDetail.sortBySerialNumberDesc();
    }
}

