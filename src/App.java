package patterns;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Design Patterns em Java ===");

        // Testando Singleton
        SingletonExample s1 = SingletonExample.getInstance();
        SingletonExample s2 = SingletonExample.getInstance();
        System.out.println("Singleton funciona? " + (s1 == s2));

        // Testando Strategy
        StrategyExample strategy = new StrategyExample();
        strategy.setOperation(new SumOperation());
        System.out.println("10 + 5 = " + strategy.execute(10, 5));

        strategy.setOperation(new MultiplyOperation());
        System.out.println("10 * 5 = " + strategy.execute(10, 5));

        // Testando Facade
        FacadeExample facade = new FacadeExample();
        facade.startSystem();
    }
}
