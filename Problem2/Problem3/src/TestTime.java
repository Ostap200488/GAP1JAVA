public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);
        t1.setTime(21, 10, 15);
        t2.setTime(10, 20, 25);
        t1.nextSecond();
        t2.previousSecond();
        System.out.println("t1 after next second: " + t1);
        System.out.println("t2 after previous second: " + t2);
    }
}
