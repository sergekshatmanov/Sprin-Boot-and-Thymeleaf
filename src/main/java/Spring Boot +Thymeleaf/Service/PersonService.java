package sergek.Project.COVID19.Tracker.App.Service;

public class PersonService {
    private String name;
    private int age;

    public PersonService(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



}
