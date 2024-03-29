package com.tw.vapasi;

//Understands the chance of occurences of event
class Probability {

    private double eventProbability;

    Probability(double eventProbability) {
        this.eventProbability = eventProbability;
    }

    Probability combinedProbability(Probability probability)
    {
        return new Probability(this.eventProbability * probability.eventProbability);
    }

    @Override
    public boolean equals(Object probability) {

        if (this == probability)
            return true;
        if (probability == null || this.getClass() != probability.getClass())
            return false;
        Probability p = (Probability) probability;
        if (this.eventProbability == p.eventProbability)
            return true;

        return false;
    }

    @Override
    public int hashCode() {

        int hashCode = (int) this.eventProbability * 2;
        return hashCode;

    }


}
