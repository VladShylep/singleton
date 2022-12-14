package singleton;

public class Customer {
    public static void main(String[] args) {
        Database testValue = Database.getInstance("Test!@#");
        Database testValue2 = Database.getInstance("Test123");

        System.out.println(
                testValue.getValue()
        );
        System.out.println(
                testValue2.getValue()
        );

    }
}
