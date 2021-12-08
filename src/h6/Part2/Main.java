package h6.Part2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) throws ParseException {

        System.out.println("Enter your Date Of Birth in YYYY-MM-DD");
        Scanner s = new Scanner(System.in);
        String dob = s.nextLine();

        try {
            Date dateOfBirth = new SimpleDateFormat("yyyy-MM-dd").parse(dob);
            LocalDate today = LocalDate.now();
            LocalDate date = dateOfBirth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Period p = Period.between(date, today);

            if(p.getYears()<18){
                String age = String.valueOf(p.getYears());
                throw new Exception(age);
            }
        }catch(Exception e){
            System.out.println("The age of the applicant is "+e.getMessage() +" which is too early to apply for a driving license");
        }


    }
}
