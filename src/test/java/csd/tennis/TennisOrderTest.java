package csd.tennis;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisOrderTest {

    @Test
    public void courtOrder(){
       assertEquals(true,CourtOrder.order("sky","网球馆A","3","2017-08-26 15:00","2017-08-26 16:00"));
       //assertEquals(false,CourtOrder.order("sky","网球馆A","4","2017-08-26 15:00","2017-08-26 16:00"));

    }
    @Test
    public void queryCourtPlaceStatus(){
        assertEquals("available",CourtOrder.queryStatus("sky","网球馆A","3","2017-08-26 15:00","2017-08-26 16:00"));
    }

}
