package patterns;

class CPU {
    void start() { System.out.println("CPU iniciada."); }
}
class Memory {
    void load() { System.out.println("Memória carregada."); }
}
class Disk {
    void read() { System.out.println("Disco lido."); }
}

public class FacadeExample {
    private final CPU cpu = new CPU();
    private final Memory memory = new Memory();
    private final Disk disk = new Disk();

    public void startSystem() {
        System.out.println("=== Facade ===");
        cpu.start();
        memory.load();
        disk.read();
        System.out.println("Sistema iniciado com sucesso!");
    }
}
