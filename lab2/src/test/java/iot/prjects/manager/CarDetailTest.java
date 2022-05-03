package iot.prjects.manager;

import iot.prjects.models.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarDetailTest
{
    private CarDetail carDetail;
    private Body body;
    private Engine engine;
    private Frame frame;
    private Suspension suspension;
    private Wheels wheels;


    @BeforeEach
    void setUp()
    {
        Body body = new Body("Body", "Germany", "sheet steel", "car body", 500, 1943628806, false, "body");
        Engine engine = new Engine("Engine", "Canada", "white cast iron", "petrol or diesel", 200, 1287653984, false, "engine");
        Suspension suspension = new Suspension("Suspension", "Japan", "titanium", "chassis", 2500, 1763456759, true, "suspension");
        Frame frame = new Frame("Frame", "Korea", "mild steel", "chassis", 200, 2054637254, true, "frame");
        Wheels wheels = new Wheels("Wheels", "Italy", "plastic", "chassis", 30, 2138776485, true, "wheels");
        carDetail = new CarDetail();
    }

    @AfterEach
    void tearDown()
    {

    }

    @Test
    void testAddDetails()
    {
        List<Details> expected = new ArrayList<>();
        expected.add(body);
        expected.add(engine);
        expected.add(frame);
        expected.add(suspension);
        expected.add(wheels);

        List<Details> actual = new ArrayList<>();
        actual.add(body);
        actual.add(engine);
        actual.add(frame);
        actual.add(suspension);
        actual.add(wheels);
        assertEquals(expected, actual);

    }

    @Test
    void testFoundDetails()
    {
        carDetail.addDetails();
        var result = carDetail.foundDetails();
        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals("Suspension", result.get(0).getName());
        Assertions.assertEquals("Frame", result.get(1).getName());
        Assertions.assertEquals("Wheels", result.get(2).getName());

    }

    @Test
    void testSortByProducerAsc() 
    {
        carDetail.addDetails();
        carDetail.foundDetails();
        var result = carDetail.sortByProducerAsc();
        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals("Wheels", result.get(0).getName());
        Assertions.assertEquals("Suspension", result.get(1).getName());
        Assertions.assertEquals("Frame", result.get(2).getName());

    }

    @Test
    void testSortByProducerDesc()
    {
        carDetail.addDetails();
        carDetail.foundDetails();
        var result = carDetail.sortByProducerDesc();
        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals("Frame", result.get(0).getName());
        Assertions.assertEquals("Suspension", result.get(1).getName());
        Assertions.assertEquals("Wheels", result.get(2).getName());
    }

    @Test
    void testSortBySerialNumberAsc()
    {
        carDetail.addDetails();
        carDetail.foundDetails();
        var result = carDetail.sortBySerialNumberAsc();
        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals("Suspension", result.get(0).getName());
        Assertions.assertEquals("Frame", result.get(1).getName());
        Assertions.assertEquals("Wheels", result.get(2).getName());
    }

    @Test
    void testSortBySerialNumberDesc()
    {
        carDetail.addDetails();
        carDetail.foundDetails();
        var result = carDetail.sortBySerialNumberDesc();
        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals("Wheels", result.get(0).getName());
        Assertions.assertEquals("Frame", result.get(1).getName());
        Assertions.assertEquals("Suspension", result.get(2).getName());
    }
}