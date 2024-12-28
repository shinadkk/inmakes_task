package task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Comparable interface
class Student implements Comparable<Student> 
{
    private String name;
    private int age;

    public Student(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    public String getName() 
    {
        return name;
    }

    public int getAge() 
    {
        return age;
    }

    @Override
    public int compareTo(Student other) 
    {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() 
    {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

// Comparator
class AgeComparator implements Comparator<Student> 
{
    @Override
    public int compare(Student s1, Student s2) 
    {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}

public class SortArrayList 
{
    public static void main(String[] args) 
    {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 23));
        students.add(new Student("Bob", 21));
        students.add(new Student("Charlie", 22));
        students.add(new Student("David", 24));

        // Sort
        
        Collections.sort(students);
        System.out.println("Sorted by name (using Comparable):");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort (by age)
        Collections.sort(students, new AgeComparator());
        System.out.println("\nSorted by age (using Comparator):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
