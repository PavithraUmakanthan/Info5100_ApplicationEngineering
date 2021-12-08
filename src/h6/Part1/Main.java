package h6.Part1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;



public class Main {
    public static void main(String args[]) throws ParseException {
        List<Student> studentsList = new ArrayList<Student>();
        Date birthDate = new SimpleDateFormat("yyyy-MM-dd").parse("2020-12-01");
        studentsList.add(new Student(1, "bob", 3.6, birthDate));
        Date birthDate1 = new SimpleDateFormat("yyyy-MM-dd").parse("2020-4-20");
        studentsList.add(new Student(2, "jill", 3.5, birthDate1));
        Date birthDate2 = new SimpleDateFormat("yyyy-MM-dd").parse("2020-10-15");
        studentsList.add(new Student(3, "bill", 3, birthDate2));
        Date birthDate3 = new SimpleDateFormat("yyyy-MM-dd").parse("2020-7-22");
        studentsList.add(new Student(4, "mark", 3.2, birthDate3));
        Date birthDate4 = new SimpleDateFormat("yyyy-MM-dd").parse("2020-3-02");
        studentsList.add(new Student(5, "tom", 3.4, birthDate4));

        Collections.sort(studentsList,new NameComparator());
        for(Student sd1: studentsList) {
            System.out.println(sd1.getName());
        }
        Collections.sort(studentsList,new GpaComparator());
        for(Student sd1: studentsList){
            System.out.println(sd1.getGpa());
        }
        Collections.sort(studentsList,new DateOfBirthComparator());
        for(Student sd1: studentsList){
            System.out.println(sd1.getDateOfBirth());
        }

    }
}
