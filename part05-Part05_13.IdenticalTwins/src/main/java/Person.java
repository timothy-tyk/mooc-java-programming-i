
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Person)){
            return false;
        }
        Person toCompare = (Person)obj;
        if(toCompare.name.equals(this.name) && 
           toCompare.birthday.equals(this.birthday) &&
           toCompare.height == this.height &&
           toCompare.weight == this.weight){
            return true;
        }
        return false;
    }
}
