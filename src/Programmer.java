public class Programmer extends Person {
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    @Override
    public void learn() {
        System.out.println(getName() + " Учится программировать");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " гуляет");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест");
    }

    public void coding() {
        System.out.println(getName() + " программирует на языке джава");
    }

    @Override
    public String toString() {
        return "Programmer{" + " name: " + getName() + " designation: " + getDesignation() +
                " companyName='" + companyName + '\'' +
                '}';
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
