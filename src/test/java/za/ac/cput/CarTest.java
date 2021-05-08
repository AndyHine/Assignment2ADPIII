package za.ac.cput;

/**
 * @author Andy William Hine - 219259038
 */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class CarTest
{
    @Test
    void add()
    {
        List<String> carList = new ArrayList<>();

        carList.add("VW");
        carList.add("BMW");
        carList.add("Tata");
        carList.add("Audi");
        carList.add("Mercedes-benz");

        System.out.println("All motor vehicles in the List:" + carList);

    }

    @Test
    void remove()
    {
        List<String> carList = new ArrayList<>();

        carList.add("VW");
        carList.add("BMW");
        carList.add("Tata");
        carList.add("Audi");
        carList.add("Mercedes-benz");

        carList.remove("VW");
        carList.remove("BMW");
        carList.remove("Tata");

        System.out.println("These are the remaining vehicles after removing the others from the List:"
                + carList);

        System.out.println(find(("VW")+("BMW")+("Tata")));

    }

    @Test
    String find(String kings)
    {

        return "These are the cars that was lost but found: VW,BMW,TATA";
    }
}