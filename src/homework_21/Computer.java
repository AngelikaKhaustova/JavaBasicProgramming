package homework_21;

public class Computer {
    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(Storage storage) {
        this.storage = storage;
        this.processor = new Processor("Intel", "i5-6300u");
        this.memory = new Memory("Samsung", "DDR4");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Я компьютер. У меня стоит процессор: ").append(processor.toString()).append("\nУ меня есть память: ").append(memory.toString()).append("\nМой накопитель: ").append(storage.toString());
        return sb.toString();

    }

}
