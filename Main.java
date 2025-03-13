// 3. Классы и объекты, this
// Создать класс Person с полями name и age. Реализовать конструктор, сеттеры и геттеры,
// а также метод introduce(), который выводит информацию о человеке.
import java.util.*;
class Person {
    private String name;
    private int age;
    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void introduce() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет.");
    }
    public static class Builder {
        private String name;
        private int age;
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public Person build() {
            return new Person(this);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder().setName("Иван").setAge(30).build();
        person.introduce();
    }
}
