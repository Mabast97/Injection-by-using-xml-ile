package hey;

public class Basketball implements Coach{
    private String basketballName;

    public Basketball(String basketballName) {
        this.basketballName = basketballName;
        System.out.println("Inside Basketball constructor");
    }

    public String getBasketballName() {
        return basketballName;
    }

    @Override
    public String dailyWorkout() {
        return "Basketball DailyWorkout";
    }

    @Override
    public String monthlyWorkout() {
        return "Basketball MonthlyWorkout";
    }
}
