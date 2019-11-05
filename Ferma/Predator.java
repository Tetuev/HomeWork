public class Predator {
    private String predatorname;
    private int predatorweight;
    private int predatorspeed;
    private int predatorpower;

    public Predator(String predatorname, int predatorweight, int predatorspeed, int predatorpower) {
        this.predatorname = predatorname;
        this.predatorweight = predatorweight;
        this.predatorspeed = predatorspeed;
        this.predatorpower = predatorpower;
    }

    public String getPredatorname() { return predatorname; }

    public void setPredatorname(String predatorname) { this.predatorname = predatorname; }

    public int getPredatorweight() { return predatorweight; }

    public void setPredatorweight(int predatorweight) { this.predatorweight = predatorweight; }

    public int getPredatorspeed() { return predatorspeed; }

    public void setPredatorspeed(int predatorspeed) { this.predatorspeed = predatorspeed; }

    public int getPredatorpower() { return predatorpower; }

    public void setPredatorpower(int predatorpower) { this.predatorpower = predatorpower; }


}
