package com.tw.vapasi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EventProbabilityTest {
    @Test
    public void expectCoinHeadEqual() {
        Probability coinHead = new Probability(0.5);
        assertTrue(coinHead.equals(coinHead));
    }


    @Test
    public void expectCoinHeadDiceEvenProbabilityNotEqual() {
        Probability coinHead = new Probability(0.5);
        Probability diceEven = new Probability(0.8);
        assertFalse(coinHead.equals(diceEven));
    }

    @Test
    public void expectRain60AndFlood20() {
        Probability rainProbability = new Probability(0.6);
        Probability floodProbability = new Probability(0.2);
        assertFalse(rainProbability.equals(floodProbability));

    }

}

