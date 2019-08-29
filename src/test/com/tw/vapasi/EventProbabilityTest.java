package com.tw.vapasi;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EventProbabilityTest {
    @Test
    public void expectCoinHead_DiceEvenEqual()
    {
        Probability p1=new Probability(1,2);
        Probability p2=new Probability(3,6);
        Assertions.assertEquals(true,p1.equals(p2) );
    }
}

