import java.util.*;
import java.util.stream.*;

public class StudentMain {

    public static void main(String[] args) {

        List<Student> list = Arrays.asList(
                new Student("Alice", 22, 50000, "Female"),
                new Student("Bob", 24, 60000, "Male"),
                new Student("Charlie", 21, 50000, "Male"),
                new Student("Diana", 23, 70000, "Female"),
                new Student("Eve", 26, 40000, "Female"));

        OptionalDouble averageSalToage = list.stream().filter(s -> s.getAge() >= 21 && s.getAge() <= 25)
                .mapToDouble(Student::getSalary).average();
        System.out.println(averageSalToage.getAsDouble());
        OptionalDouble secoundHighestSalary = list.stream().mapToDouble(Student::getSalary).distinct().boxed()
                .sorted(Comparator.reverseOrder()).skip(1).mapToDouble(Double::doubleValue).findFirst();
        System.out.println(secoundHighestSalary.getAsDouble());
        Map<Integer, List<Student>> groupByAge = list.stream().collect(Collectors.groupingBy(Student::getAge));
        System.out.println(groupByAge);
        Map<String, Double> genderAvgSal = list.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.averagingDouble(Student::getSalary)));
        System.out.println(genderAvgSal);
    }

}

class Student {
    private String name;
    private int age;
    private double salary;
    private String gender;

    // Constructors, getters, setters
    public Student(String name, int age, double salary, String gender) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getGender() {
        return gender;
    }
}
