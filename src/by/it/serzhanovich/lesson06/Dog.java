package by.it.serzhanovich.lesson06;

/**
 * Created by user on 26.04.2018.
 */
public class Dog {
    private String name;
    private int age;
    private int weight; //вес собаки
    private double power; //сила укуса собаки


    public Dog() {
        this.name = name;
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public Dog(int name, int age, int weight, double power) {

        this.age = age;
        this.weight = weight;
        this.power = power;

    }
    boolean win(Dog otherDog){
        double sh1= 0.2*this.age;
   return true;//Шсы на победу = 0.2 * возраст + 0.3 * вес + 0.5 * силу укуса.
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return " Кличка:" + name + ". Возраст:" + age;
    }
}
