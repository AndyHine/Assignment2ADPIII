package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest
{
    @Test
    void put()
    {
        Map<Integer,String> bankAccountMap = new HashMap<>();

        bankAccountMap.put(1,"Andy Hine");
        bankAccountMap.put(5,"Vjorn Malgas");
        bankAccountMap.put(87,"Cameron van Wyk");
        bankAccountMap.put(45,"Eugene Hine");
        bankAccountMap.put(12,"James Hine");

        System.out.println("Bank Account members:" + bankAccountMap);
    }

    @Test
    void remove()
    {
        Map<Integer,String> bankAccountMap = new HashMap<>();

        bankAccountMap.put(1,"Andy Hine");
        bankAccountMap.remove(5,"Vjorn Malgas");
        bankAccountMap.put(87,"Cameron van Wyk");
        bankAccountMap.remove(45,"Eugene Hine");
        bankAccountMap.put(12,"James Hine");

        System.out.println("Remainig members after removing the others:" + bankAccountMap);

        System.out.println(find(("Vjorn Malgas")+("Eugene Hine")));

    }

    @Test
    String find(String kings)
    {

        return "Vjorn Malgas and Eugene Hine is found!";
    }


}