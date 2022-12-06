import java.util.ArrayList;

public class Company_Functionalities {
}

class company_details {
    String name;
    String role;
    float ctc;
    float cgpa;

    private ArrayList students;

    public ArrayList getStudents() {
        return students;
    }

    public void setStudents(ArrayList students) {
        this.students = students;
    }

    company_details (String name, String profile, float ctc, float cgpa) {
        this.name = name;
        this.role = profile;
        this.ctc = ctc;
        this.cgpa = cgpa;
    }

}