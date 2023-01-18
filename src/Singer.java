public class Singer extends Person {
    private String bandName;

    public Singer(String name, String designation,String bandName) {
        super(name, designation);
        this.bandName=bandName;
    }

    @Override
    public void learn() {
        System.out.println(getName() + " учится петь");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " гуляет");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест");
    }

    public void singing() {
        System.out.println(getName() + " поет ");
    }

    public void playGitar() {
        System.out.println(getName() + " играет на классической гитаре ");
    }

    @Override
    public String toString() {
        return "Singer{" + " name " + getName() + " designation: " + getDesignation() +
                " bandName='" + bandName + '\'' +
                '}';
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
}
