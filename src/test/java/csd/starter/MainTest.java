package csd.starter;

import org.junit.Test;

import java.util.Scanner;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;

public class MainTest {


    @Test
    public void test_helloWorld(){
        assertEquals("Hello World!",Main.helloWorld());
    }

    @ Test
    public void first_make_reservation_should_be_sucessfully(){
        assertEquals("Reservation sucessfully",Main.makeReservation("Morning","zhangsan","court1"));
    }

//    @Test
//    public void second_time_make_reservation_should_be_failed(){
//        Main.makeReservation("Morning","zhangsan","court1");
//        assertEquals("Reservation failed",Main.makeReservation("Morning","lisi","court1"));
//    }

}
