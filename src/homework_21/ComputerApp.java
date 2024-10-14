package homework_21;

public class ComputerApp {
    public static void main(String[] args) {
        Storage st1 = new Storage("Crucial", "SSD512");
        Computer comp1 = new Computer(st1);
        System.out.println(comp1.toString());

        Storage st2 = new Storage("Western Digital", "sd1TB");
        Computer comp2 = new Computer(st2);
        System.out.println(comp2.toString());
    }
}
