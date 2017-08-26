package csd.starter;

import org.junit.Test;

import java.util.Scanner;

import static java.lang.System.setIn;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void test_book() {
        Scanner scanner = new Scanner("123456");
        String line = scanner.nextLine();
        assertEquals("success", Main.book_ticket(line));
    }


}
