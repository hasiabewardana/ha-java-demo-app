package generics.oracle;

public class TelecomServicePlanImpl<T, S> implements TelecomServicePlan<T, S> {

    private final T planName;
    private final S dataLimit;
    private final double monthlyCost;

    public TelecomServicePlanImpl(T planName, S dataLimit, double monthlyCost) {
        this.planName = planName;
        this.dataLimit = dataLimit;
        this.monthlyCost = monthlyCost;
    }

    @Override
    public T getPlanName() {
        return planName;
    }

    @Override
    public S getDataLimit() {
        return dataLimit;
    }

    @Override
    public double getMonthlyCost() {
        return monthlyCost;
    }

    @Override
    public String toString() {
        return "TelecomServicePlanImpl{" +
                "planName=" + planName +
                ", dataLimit=" + dataLimit +
                ", monthlyCost=" + monthlyCost +
                '}';
    }
}
