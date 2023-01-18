public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Aibek", "учусь программировать", "Apple");
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println(programmer);

        System.out.println();
        Dancer dancer = new Dancer("Egor", "учусь танцевать", "лебедь");
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        System.out.println(dancer);
        System.out.println();
        Singer singer=new Singer("Alex","учится петь","rok");
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGitar();
        System.out.println(singer);
    }

}