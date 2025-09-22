
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void showPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}


interface Worker {
    void performDuties();
}


class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        showPersonInfo();
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
        System.out.println("Duties: Cooking dishes.");
    }
}


class Waiter extends Person implements Worker {
    int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        showPersonInfo();
        System.out.println("Role: Waiter");
        System.out.println("Tables Assigned: " + tablesAssigned);
        System.out.println("Duties: Serving customers.");
    }
}

// Main
public class RestaurantSystem {
    public static void main(String[] args) {
        Worker c = new Chef("David", 201, "Italian Cuisine");
        Worker w = new Waiter("Eva", 202, 5);

        System.out.println("=== Restaurant Staff ===");
        c.performDuties();
        System.out.println("-----------------");
        w.performDuties();
    }
}

