import java.util.ArrayList;

public class Department {
    private String departmentName;
    private int departmentMaxNum;
    private int maxNumOfStudents;
    private ArrayList<Student> studentName = new ArrayList<Student>();

    public ArrayList<Student> getStudentName() {
        return studentName;
    }

    public void setStudentName(ArrayList<Student> studentName) {
        this.studentName = studentName;
    }

    private ArrayList<Courses> cName = new ArrayList<Courses>();
    public ArrayList<Courses> getcName() {
        return cName ;
    }

    public void setcName(ArrayList<Courses> cName) {
        this.cName = cName;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public int getDepartmentMaxNum() {
        return departmentMaxNum;
    }
    public void setDepartmentMaxNum(int departmentMaxNum) {
        this.departmentMaxNum = departmentMaxNum;
    }
    public int getMaxNumOfStudents() {
        return maxNumOfStudents;
    }
    public void setMaxNumOfStudents(int maxNumOfStudents) {
        this.maxNumOfStudents = maxNumOfStudents;
    }

    public boolean findcourse(ArrayList<Courses> courses, String cname) {
        boolean x = false;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCname().equals(cname)) {
                return true;
            }
        }
        return false;
    }

    public int NumberOfCourses() {
        return  cName.size() ;
    }

    public boolean Is_full ()
    {
        if (getStudentName().size() == getMaxNumOfStudents())
        {
            return true ;
        }
          return false ;
    }



}



