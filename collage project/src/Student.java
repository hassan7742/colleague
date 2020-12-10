import java.util.ArrayList;

public class Student extends human {


    private Department departmentName;
    private ArrayList<Courses> cName = new ArrayList<Courses>();

    public Student() {
    }

    public Department getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(Department departmentName) {
        this.departmentName = departmentName;
    }

    public ArrayList<Courses> getcName() {
        return cName;
    }

    public void setcName(ArrayList<Courses> cName) {
        this.cName = cName;
    }
}
