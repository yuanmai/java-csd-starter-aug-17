package csd.bookonline;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class BookOnlineTest {

    @Test
    public void testBook(){

        BookOnline book = new BookOnline();
        assertEquals(Arrays.asList("place one","place two","place three"),book.queryPlace());

        assertEquals("book success",book.book("place two"));
        assertEquals("have no place",book.book("place two"));
        assertEquals(Arrays.asList("place one","place three"),book.queryPlace());

    }
}
