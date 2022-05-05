package iot.prjects.manager;

import iot.prjects.models.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class CarDetailWriter
{
    public static void writeCSV() throws IOException
    {
        try (FileOutputStream fileStream = new FileOutputStream(new File("result.csv"));
             OutputStreamWriter writer = new OutputStreamWriter(fileStream, StandardCharsets.UTF_8))
        {
            String previousClassName = "";

            ArrayList<Details> detail = new ArrayList<>();

            detail.add(new Body("Body", "Germany", "sheet steel", "car body", 500, 1943628806, false, "body"));
            detail.add(new Engine("Engine", "Canada", "white cast iron", "petrol or diesel", 200, 1287653984, false, "engine"));
            detail.add(new Suspension("Suspension", "Japan", "titanium", "chassis", 2500, 1763456759, true, "suspension"));
            detail.add(new Frame("Frame", "Korea", "mild steel", "chassis", 200, 2054637254, true, "frame"));
            detail.add(new Wheels("Wheels", "Italy", "plastic", "chassis", 30, 2138776485, true, "wheels"));

            for (var details : detail)
            {
                if (!details.getClass().getSimpleName().equals(previousClassName))
                {
                    writer.write(details.getHeaders());
                    writer.write("\r\n");
                    previousClassName = details.getClass().getSimpleName();
                }

                writer.write(details.toCSV());
                writer.write("\r\n");
            }
        }
    }
}





