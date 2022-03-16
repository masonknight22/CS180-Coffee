public class Coffee {
    private Producer producer;
    private String variety;
    private int cuppingScore;

    public Coffee(Producer producer, String variety, int cuppingScore) {
        this.producer = producer;
        this.variety = variety;
        this.cuppingScore = cuppingScore;
    }

    public Coffee(Coffee coffee) {
        this.producer = coffee.producer;
        this.variety = coffee.variety;
        this.cuppingScore = coffee.cuppingScore;
    }

    public Coffee() {
        this.producer = null;
        this.variety = null;
        this.cuppingScore = 0;
    }

    public Producer getProducer() {
        return this.producer;
    }

    public String getVariety() {
        return this.variety;
    }

    public int getCuppingScore() {
        return this.cuppingScore;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public void setCuppingScore(int cuppingScore) {
        this.cuppingScore = cuppingScore;
    }

    double price = 0;

    public double calculatePricePerPound() {
        if (cuppingScore >= 80) {
            if (variety == "Gesha") {
                price = 16.4;
            } else if (variety == "SL-28") {
                price = 8.05;
            } else if (variety == "Pacamara") {
                price = 7.5;
            } else if (variety == "Typica") {
                price = 6.85;
            } else if (variety == "Caturra") {
                price = 6.65;
            } else if (variety == "Bourbon") {
                price = 6.6;
            }
        }
        else {
            price = 1.21;
        }
        return price;
    }


    public String toString() {
        return "Coffee<producer=Producer<name=" + producer + ", variety=" + variety + ", cuppingScore=" + cuppingScore + ">";

    }
}
