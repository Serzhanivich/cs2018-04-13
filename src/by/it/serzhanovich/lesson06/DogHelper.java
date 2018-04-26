package by.it.serzhanovich.lesson06;

/**
 * Created by user on 26.04.2018.
 */
public class DogHelper {
    void printAllNames(Dog[] dogs) {
        for (Dog dog : dogs) {
            System.out.println(dog.getName() + " ");
        }
        System.out.println();
    }

    void average(Dog[] dogs) {
        double sum = 0;
        for (Dog dog : dogs) {
            sum = sum + dog.getAge();
        }
        return;
    }
}