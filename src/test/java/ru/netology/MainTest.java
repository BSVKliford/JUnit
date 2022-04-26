package ru.netology;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static ru.netology.Main.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.List;

public class MainTest
{
    private static List<Employee> employee;

    @BeforeAll
    public static void setEmployee() {
        employee = (List<Employee>) new Employee(1, "Vasya", "Ivanov", "Russia", 25);
    }

    //JUnit
    @Test
    public void testingParseCSV() {
        // given:
        String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
        String fileName = "data.csv";
        // when:
        List<Employee> result = parseCSV(columnMapping, fileName);
        // then:
        assertFalse(result.isEmpty());
    }

    @Test
    public void testingListToJson() {
        // given:
        // when:
        String result = listToJson(employee);
        // then:
        assertFalse(result.isEmpty());
    }

    @Test
    public void testingParseXML() {
        // given:
        String s = "data.xml";
        // when:
        List<Employee> result = parseXML(s);
        // then:
        assertFalse(result.isEmpty());
    }

    @Test
    public void testingReadString() {
        // given:
        String s = "data.json";
        // when:
        String result = readString(s);
        // then:
        assertNotNull(result);
    }

    @Test
    public void testingJsonTOList() {
        // given:
        String s = "[{\"id\":1,\"firstName\":\"Vasya\",\"lastName\":\"Ivanov\",\"country\":\"Russia\",\"age\":25}]";
        // when:
        List<Employee> result = jsonToList(s);
        // then:
        assertFalse(result.isEmpty());
    }
}
