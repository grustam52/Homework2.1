public class SlytherinStudent extends HogwartsStudent {
    private int cunning;
    private int ambition;
    private int decisiveness;
    private int recourcefulness;
    private  int powerLust;

    public SlytherinStudent(String name, int magicPower, int transgressionDistance, int cunning, int ambition, int decisiveness, int recourcefulness, int powerLust) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.ambition = ambition;
        this.decisiveness = decisiveness;
        this.recourcefulness = recourcefulness;
        this.powerLust = powerLust;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public void setDecisiveness(int decisiveness) {
        this.decisiveness = decisiveness;
    }

    public int getRecourcefulness() {
        return recourcefulness;
    }

    public void setRecourcefulness(int recourcefulness) {
        this.recourcefulness = recourcefulness;
    }

    public int getPowerLust() {
        return powerLust;
    }

    public void setPowerLust(int powerLust) {
        this.powerLust = powerLust;
    }

    @Override
    public String toString() {
        return "SlytherinStudent{" +
                "name=" + getName() +
                ",magicPower=" + getMagicPower() +
                ",transgressionDistance=" + getTransgressionDistance() +
                ",cunning=" + cunning +
                ", ambition=" + ambition +
                ", decisiveness=" + decisiveness +
                ", recourcefulness=" + recourcefulness +
                ", powerLust=" + powerLust +
                '}';
    }
}
