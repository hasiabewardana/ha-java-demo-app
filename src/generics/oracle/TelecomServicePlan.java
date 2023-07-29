package generics.oracle;

public interface TelecomServicePlan<T, S> {

    T getPlanName();

    S getDataLimit();

    double getMonthlyCost();
}
