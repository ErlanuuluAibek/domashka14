public class Dancer extends Person {
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    @Override
    public void learn() {
        System.out.println(getName() + " учится танцевать");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " гуляет");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест");
    }

    public void dancing() {
        System.out.println(getName() + " танцует балет");
    }


    @Override
    public String toString() {
        return "name: " + getName() + " designation: " + getDesignation() + " groupName: " + getGroupName();
    }


    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }


}