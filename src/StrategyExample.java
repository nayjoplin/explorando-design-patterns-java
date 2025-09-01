package patterns;

interface Operation {
    int execute(int a, int b);
}

class SumOperation implements Operation {
    public int execute(int a, int b) { return a + b; }
}

class MultiplyOperation implements Operation {
    public int execute(int a, int b) { return a * b; }
}

public class StrategyExample {
    private Operation operation;

    public void setOperation(Operation op) {
        this.operation = op;
    }

    public int execute(int a, int b) {
        return operation.execute(a, b);
    }
}
