package hey;

public class Football implements Coach{
    private Basketball name;

    private String firstName;
    private String SecondName;

    public Football(Basketball name)
    {
        this.name = name;
        System.out.println("Football Constructor/  Basketball  = "+this.name.getBasketballName());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        System.out.println("FirstName Setted : "+firstName);
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
        System.out.println("SecondName Setted : "+SecondName);
    }

    @Override
    public String dailyWorkout() {
        return "Football DailyWorkout";
    }

    @Override
    public String monthlyWorkout() {
        return "Football MonthlyWorkout";
    }
}
