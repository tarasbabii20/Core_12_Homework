package Core_01;

/**
 * Created by Taras on 30.03.2017.
 */
public class Author extends Human {

    private String name;
    private String surname;

    public Author(int growth, int weight, int age, String name, String surname) {
        super(growth, weight, age);
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
