package jd;

public interface Config {
    /** MySQL */
    // public static final String URL = "jdbc:mysql://localhost:3306/me";

    static boolean isMySql() {
        return false;
    }

    // or, when something like default-time-zone="+02:00" is not set in my.ini
    //
    // public static final String URL = "jdbc:mysql://localhost:3306/me?serverTimezone=Europe/Rome";

    /** Oracle DB */
    // public static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521/xe";

    static boolean isOracle() {
        return false;
    }

    /** SQLite */
    public static final String URL = "jdbc:sqlite:me.db";

    static boolean isSqLite() {
        return true;
    }

    // Access to user/schema me
    public static final String USER = "me";
    public static final String PASSWORD = "password";
}
