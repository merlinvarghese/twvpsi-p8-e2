package com.tw.vapasi;

//Understands the chance of occurences of event
 class Probability {

    private int maxOccurances;
    private int numberOfEvents;

    Probability(int maxoccurance, int numberOfEvents) {
        this.maxOccurances = maxoccurance;
        this.numberOfEvents = numberOfEvents;
    }

    private Double eventProbability() {
        return Double.valueOf(numberOfEvents / maxOccurances);
    }

    boolean equals(Probability p2) {
        Double resultP1 = this.eventProbability();
        Double resultP2 = p2.eventProbability();
        return resultP1.equals(resultP2);
    }


}
