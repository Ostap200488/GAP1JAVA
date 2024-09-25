public class TestDate {
    public static void main(String[] args) {
        Date date = new Date(1, 10, 2024);
        System.out.println("Date: " + date.toString());

        date.setDate(25, 12, 2023);
        System.out.println("Updated Date: " + date);
    }
}
