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


}
