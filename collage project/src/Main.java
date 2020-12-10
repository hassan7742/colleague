import sun.dc.pr.PRError;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static String prof_name (Department old, String New){
        for (int i = 0 ; i < old.getcName().size(); i ++) {
            if (old.getcName().get(i).getCname().equals(New)) {
                return old.getcName().get(i).getFname().getFName();
            }
        }
        return null;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Courses mathCourse = new Courses("Math");
        Courses arabicCourse = new Courses("Arabic");
        Courses englishCourse = new Courses("English");
        Courses germanyCourse = new Courses("Germany");
        Courses religionCourse = new Courses("Religion");
        Courses historyCourse = new Courses("History");


        Student studentAhmed =  new Student();
        studentAhmed.getcName().add(historyCourse);
        studentAhmed.getcName().add(mathCourse);

        Student studentMohamed =  new Student();
        studentMohamed.getcName().add(arabicCourse);
        studentMohamed.getcName().add(englishCourse);
        studentMohamed.getcName().add(germanyCourse);

        Student studentMahmoud =  new Student();
        studentMahmoud.getcName().add(religionCourse);


        Department law = new Department();

        law.getcName().add(englishCourse);
        law.getcName().add(mathCourse);
        law.getcName().add(germanyCourse);
        law.getcName().add(arabicCourse);
        law.getcName().add(religionCourse);

        Professor prof_ahmed = new Professor() ;
        prof_ahmed.setFName("ahmed");
        mathCourse.setFname(prof_ahmed);

        ;


//        String x = input.nextLine();
//       System.out.println(prof_name(law, x));
//        System.out.println(prof_name(law, x));

        int numberOfCourses = input.nextInt();
        ArrayList<Courses> courses = new ArrayList<Courses>();
        for (int count=0; count < numberOfCourses; count++) {
            System.out.print("Please Enter The Course Name: ");
            String courseName = input.nextLine();
            Courses course = new Courses(courseName);
            courses.add(course);
        }














    }











}
