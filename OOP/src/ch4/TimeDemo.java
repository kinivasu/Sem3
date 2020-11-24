package ch4;

class Time {
    int hours, minutes, seconds;

    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    void display() {
        System.out.println("The time is " + hours + ":" + minutes + ":" + seconds);
    }

    Time addTime(Time t1) {
        int hoursum = hours + t1.hours;
        int minutesum = minutes + t1.minutes;
        int secondsum = seconds + t1.seconds;

        if (secondsum > 60) {
            minutesum++;
            secondsum = secondsum % 60;
        }
        if (minutesum > 60) {
            hoursum++;
            minutesum = minutesum % 60;
        }
        if (hoursum > 24) {
            hoursum = hoursum % 24;
        }
        return new Time(hoursum, minutesum, secondsum);
    }
}

public class TimeDemo {
    public static void main(String[] args) {
        Time t1 = new Time(20, 15, 55);
        Time t2 = new Time(21, 15, 55);
        t1.display();
        t2.display();

        Time t3 = t1.addTime(t2);
        t3.display();
    }
}
