package za.ac.cput;

/**
 * @author Andy William Hine - 219259038
 */

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.LinkedHashSet;

class EmployeeTest
{
    @Test
    void add()
    {
        Collection employee = new LinkedHashSet();

        employee.add("Wendy");
        employee.add("John");
        employee.add("Chester");
        employee.add("Gouws");
        employee.add("Chris");

        System.out.println("Full size of LinkedHashSet:"+ employee);

    }

    @Test
    void remove()
    {
        Collection employee = new LinkedHashSet();

        employee.add("Wendy");
        employee.add("John");
        employee.add("Chester");
        employee.add("Gouws");
        employee.add("Chris");

        System.out.println("Wendy will be removed from LinkedHashSet"+employee.remove(("Wendy"))+
                ", as well as Gouws" + employee.remove(("Gouws")));

        System.out.println("Updated List:" + employee);

        System.out.println(find(("Wendy")+("Gouws")));
    }

    @Test
    String find(String kings)
    {

        return "Wendy and Gouws is found!";
    }
}