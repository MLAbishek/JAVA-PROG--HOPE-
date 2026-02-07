package striver.OOPS;

class Account {
    String name;
    int bal;

    Account(String n, int b) {
        this.name = n;
        this.bal = b;
    }

    Account(Account acc) {
        Account(acc.getName(), acc.getBal());
    }

    String getName() {
        return this.name;
    }

    int getBal() {
        return this.bal;
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Account mainobj = new Account("abi", 110);
        Account childobj = new Account(mainobj);
        System.out.println(childobj.getName());
    }
}
