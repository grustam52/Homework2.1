public class HufflepuffStudent extends HogwartsStudent{
    private int hardWork;
    private int loyality;
    private int integrity;

    public HufflepuffStudent(String name, int magicPower, int transgressionDistance, int hardWork, int loyality, int integrity) {
        super(name, magicPower, transgressionDistance);
        this.hardWork = hardWork;
        this.loyality = loyality;
        this.integrity = integrity;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyality() {
        return loyality;
    }

    public void setLoyality(int loyality) {
        this.loyality = loyality;
    }

    public int getIntegrity() {
        return integrity;
    }

    public void setIntegrity(int integrity) {
        this.integrity = integrity;
    }

    @Override
    public String toString() {
        return "HufflepuffStudent{" +
                "name=" + getName() +
                ",magicPower=" + getMagicPower() +
                ",transgressionDistance=" + getTransgressionDistance() +
                ",hardWork=" + hardWork +
                ", loyality=" + loyality +
                ", integrity=" + integrity +
                '}';
    }
}
