package singleton;

public class  Database {

    private static Database singleton;
    public String value;

    private Database(String address) {
        this.value = address;
    }

    public String getValue() {
        return this.value;
    }
    public static Database getInstance(String address) {
        if (Database.singleton == null ) {
            Database.singleton = new Database(address);
        }

        return Database.singleton;
    }
}
