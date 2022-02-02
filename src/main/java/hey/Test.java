package hey;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext s = new ClassPathXmlApplicationContext("config.xml");

        Coach coach = s.getBean("Football", Football.class);

        System.out.println(coach.dailyWorkout());
        System.out.println(coach.monthlyWorkout());

        s.close();


    }
}
