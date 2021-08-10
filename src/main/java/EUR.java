import java.io.Serializable;

public class EUR extends Coin implements Serializable {
    private final double value = 4.27;

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public double calculate(double value) {
        return value * getValue();
    }
}

