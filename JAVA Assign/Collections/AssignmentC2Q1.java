import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Person{
    String name;
    int height;
    double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Name = "+this.name+"| Height = "+this.height+"| Weight = "+this.weight;
    }
}
class HeightComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        if(o1.weight>o2.weight){
            return -1;
        }
        else if(o1.weight<o2.weight){
            return 1;
        }
        else {
            return Double.compare(o2.height, o1.height);
        }
    }
}
public class AssignmentC2Q1 {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>(new HeightComparator());
        set.add(new Person("Mohnish Bhonde",165,60.5));
        set.add(new Person("Axel Kai",165,63.8));
        set.add(new Person("Eren Yeager",172,80.9));
        set.add(new Person("Saitama",160,50.5));
        set.add(new Person("Rengoku",170,90.5));
        set.add(new Person("Tanjiro",162,61.5));

        System.out.println("Printing in the sorted order based upon weight first, if the weights are equal then based upon height:");
        for (Person person: set){
            System.out.println(person);
        }
    }
}

