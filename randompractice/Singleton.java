import java.util.*;

class School {
    private static School sch = new School();

    private School() {
    }

    private String name = "Rakesh School";

    public static School getInstance() {
        return sch;
    }

    public String getName() {
        return this.name;
    }
}

public class Singleton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(School.getInstance().getName());
    }
}
