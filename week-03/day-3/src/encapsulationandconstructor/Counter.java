package encapsulationandconstructor;

public class Counter {

    int field = 0;
    int fieldReset = field;

    public Counter(int field) {
        this.field = field;
        fieldReset = field;
    }

    public Counter() {}

    public void add() {
        field++;
    }

    public void add(int plusNum) {
        field = field + plusNum;
    }

    public int get() {
        return field;
    }

    public void reset() {
        field = fieldReset;
    }

}
