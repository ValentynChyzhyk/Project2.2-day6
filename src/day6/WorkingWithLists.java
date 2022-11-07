package day6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    @Test
    public void createAndWorkWithList(){
        Student valera = new Student();
        valera.setFirstName("valera");
        valera.setLastName("The Tester");
        valera.setEmail("valerunchik@gmail.com");
        valera.setPhone("+371234234234");

        Student Dimko = new Student("Dimko", "Skatinishe", "liga@test.lv", "+3712334234");
        Student Liga = new Student("Liga", "Skatinishe", "omg@test.lv","02");

        Liga.setLastName("Zvaigzne");

        List<Student> students = new ArrayList<>();
        students.add(valera);
        students.add(Liga);
        students.add(Dimko);

        for (int i = 0; i < students.size(); i++){
            System.out.println(students.get(i).getFirstName());
        }
        ///---FOREACH-----
        for (Student s : students){
          //  System.out.print(s.getFirstName() + " " + s.getLastName());
            System.out.println(s.getFullName());
        }

        //-----FOREACH with IF-----
        for (Student s : students){
            System.out.println("printing students with phone nr start with +371");
            if (s.getPhone().startsWith("+371")) {
                System.out.println(s.getFullName());

            }
        }
    }
}
