package iot.prjects.manager;

import iot.prjects.models.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class CarDetail
{
    ArrayList<Details> details = new ArrayList<Details>();

    public void addDetails()
    {
        details.add(new Body("Body", "Germany", "sheet steel", "car body", 500, 1943628806, false, "body"));
        details.add(new Engine("Engine", "Canada", "white cast iron", "petrol or diesel", 200, 1287653984, false, "engine"));
        details.add(new Suspension("Suspension", "Japan", "titanium", "chassis", 2500, 1763456759,  true,"suspension"));
        details.add(new Frame("Frame", "Korea", "mild steel", "chassis", 200, 2054637254, true, "frame"));
        details.add(new Wheels("Wheels", "Italy", "plastic", "chassis", 30, 2138776485, true, "wheels"));
    }

    ArrayList<Details> found = new ArrayList<Details>();

    public void foundDetails()
    {

        for (Details detail : details)
        {
            if (detail.isPartOfTheChassis() == true)
            {
                found.add(detail);
            }
        }
        for (int i = 0; i < found.size(); i++)
        {
            System.out.println(found.get(i));
        }
    }

    public void sortByProducerAsc()
    {

        found.sort(Comparator.comparing(Details::getProducer));

        for (Details count : found)
        {
            System.out.println(count);
        }
    }

    public void sortByProducerDesc()
    {

        found.sort(Comparator.comparing(Details::getProducer).reversed());

        for (Details count : found)
        {
            System.out.println(count);
        }

    }

    public void sortBySerialNumberAsc()
    {

        found.sort(Comparator.comparing(Details::getSerialNumber));

        for (Details count : found)
        {
            System.out.println(count);
        }
    }

    public void sortBySerialNumberDesc()
    {

        found.sort(Comparator.comparing(Details::getSerialNumber).reversed());

        for (Details count : found)
        {
            System.out.println(count);
        }
    }

}
