package za.ac.cput;

/**
 * @author Andy William Hine - 219259038
 */

import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class SetTest
{
    @Test
    void add()
    {
        Set<Integer> s = new HashSet<>();

        s.add(7);
        s.add(5);
        s.add(10);
        s.add(2);
        s.add(90);

        System.out.println("Set:"+ s);
    }
    @Test
        void remove(){
        Set<Integer> s = new HashSet<>();

        s.add(7);
        s.add(5);
        s.add(10);
        s.add(2);
        s.add(90);

        s.remove(7);
        s.remove(10);
        s.remove(5);

        System.out.println("This is the remaining elements:" + s);

        System.out.println(find((7)+(10)+(5)));

    }

    @Test
    String find(int kings)
    {

        return "7,10,5 was removed from the HashSet";
    }
}