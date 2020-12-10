import java.util.ArrayList;

public class Courses {
    private String Cname ;
    private String Cdescribtion ;
    private int CNumOfLectures ;
    private int CmaxNumOfStudents;
    private Professor Fname;
    private Department departmentName ;
    private ArrayList <Student> num_of_student = new ArrayList<Student>();


    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public String getCdescribtion() {
        return Cdescribtion;
    }

    public void setCdescribtion(String cdescribtion) {
        Cdescribtion = cdescribtion;
    }

    public int getCNumOfLectures() {
        return CNumOfLectures;
    }

    public void setCNumOfLectures(int CNumOfLectures) {
        this.CNumOfLectures = CNumOfLectures;
    }

    public int getCmaxNumOfStudents() {
        return CmaxNumOfStudents;
    }

    public void setCmaxNumOfStudents(int cmaxNumOfStudents) {
        CmaxNumOfStudents = cmaxNumOfStudents;
    }

    public Professor getFname() {
        return Fname;
    }

    public void setFname(Professor fname) {
        Fname = fname;
    }

    public Department getDepartmentName() {
        return departmentName;
    }



    // contractors


    public Courses(String cname) {
        this.Cname = cname;
    }
      // functions
    public int num_of_students ()
    {
      return num_of_student.size();
    }

    public boolean assignProfessor (Professor New , String pro_name )
    {
        if (New.getFName() == pro_name )
        {
            return false ;
        }
        else
        {
            Fname.setFName(pro_name);
        }
        return true ;
    }

    public void unassignProfessor (Professor New,String pro_name)
    {
        if (New.getFName() == pro_name )
        {
            Fname.setFName(null);
        }

    }

    public String professorName()
    {

        return Fname.getFName();
    }



}


