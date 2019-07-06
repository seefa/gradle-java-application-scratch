package ir.seefa.sample.project;

import org.joda.time.LocalTime;

public class App {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        Helper helper = new Helper();
        System.out.println(helper.sayHello());
    }
}
