package characters;

public class Heroes {

    private String hName;
    private int hAge;
    private double hHP;
    private double hMP;


    public Heroes (){

    }

    public Heroes(String hName, int hAge, double hHP, double hMP) {
        this.hName = hName;
        this.hAge = hAge;
        this.hHP = hHP;
        this.hMP = hMP;
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public int gethAge() {
        return hAge;
    }

    public void sethAge(int hAge) {
        this.hAge = hAge;
    }

    public double gethHP() {
        return hHP;
    }

    public void sethHP(double hHP) {
        this.hHP = hHP;
    }

    public double gethMP() {
        return hMP;
    }

    public void sethMP(double hMP) {
        this.hMP = hMP;
    }

    @Override
    public String toString() {
        return "Heroe Name: " + hName +
                "Heroe Age: " + hAge +
                "Heroe HP: " + hHP +
                "Heroe MP: ";
    }
}
