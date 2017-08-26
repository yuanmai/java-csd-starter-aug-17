package csd.starter;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestTennisScore {

    @Test
    public void equal_sore_ge_4(){
        //System.out.print(TennisScore.tennisScore(4,4));
        assertEquals("Deuce",TennisScore.tennisScore(4,4));
        assertEquals("Deuce",TennisScore.tennisScore(6,6));
    }

    @Test
    public void equal_score_lt_4(){
        assertEquals("Love All",TennisScore.tennisScore(0,0));
        assertEquals("Fifteen All",TennisScore.tennisScore(1,1));
        assertEquals("Thirty All",TennisScore.tennisScore(2,2));
        assertEquals("Forty All",TennisScore.tennisScore(3,3));
    }

    @Test
    public void not_equal_score_lt_4(){
        assertEquals("Love Fifteen",TennisScore.tennisScore(0,1));
        assertEquals("Forty Thirty",TennisScore.tennisScore(3,2));
    }

    @Test
    public void not_equal_score_ge_4(){
        assertEquals("Advantage Server",TennisScore.tennisScore(5,4));
        assertEquals("Advantage Receiver",TennisScore.tennisScore(4,5));
        assertEquals("Advantage Server",TennisScore.tennisScore(6,4));
        assertEquals("Advantage Receiver",TennisScore.tennisScore(4,6));
    }

    @Test
    public void win_score_one_equal_4(){
        assertEquals("Game to Server",TennisScore.tennisScore(4,2));
        assertEquals("Game to Receiver",TennisScore.tennisScore(0,4));
    }

    @Test
    public void win_score_gt_4(){
        assertEquals("Game to Server",TennisScore.tennisScore(7,5));
        assertEquals("Game to Receiver",TennisScore.tennisScore(6,8));
    }
}

