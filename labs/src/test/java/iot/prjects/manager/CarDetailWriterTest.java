package iot.prjects.manager;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CarDetailWriterTest
{

    @BeforeEach
    void setUp()
    {
    }

    @AfterEach
    void tearDown()
    {
    }

    @Test
    void writeCSV() throws IOException
    {
        try (FileReader expectedReader = new FileReader("src/test/resources/expected.csv");
             BufferedReader expectedBR = new BufferedReader(expectedReader);
             FileReader actualReader = new FileReader("result.csv");
             BufferedReader actualBR = new BufferedReader(actualReader);)
        {
            String line1 = expectedBR.readLine();
            String line2 = actualBR.readLine();
            CarDetailWriter.writeCSV();
            Assertions.assertEquals(line1, line2);
        }
    }

}