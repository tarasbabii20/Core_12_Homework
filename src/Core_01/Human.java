package Core_01;

/**
 * Created by Taras on 30.03.2017.
 */
public class Human {

    private int growth;
    private int weight;
    private int age;

    public Human(int growth, int weight, int age) {
        this.growth = growth;
        this.weight = weight;
        this.age = age;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
