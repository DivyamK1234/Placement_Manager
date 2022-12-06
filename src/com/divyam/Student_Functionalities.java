
public class Student_Functionalities {
    String name;
    int roll_no;
    float cgpa;
    String branch;
    String status;
    float inhand;

    private float final_cgpa;
    private String password;
    private String CTC;

    public float getFinal_cgpa() {
        return final_cgpa;
    }

    public void setFinal_cgpa(float final_cgpa) {
        this.final_cgpa = final_cgpa;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCTC() {
        return CTC;
    }

    public void setCTC(String CTC) {
        this.CTC = CTC;
    }

    Student_Functionalities(String name, int roll_no, float cgpa, String branch, String status, int inhand) {
        this.name = name;
        this.roll_no = roll_no;
        this.cgpa = cgpa;
        this.branch = branch;
        this.status = status;
        this.inhand = 0;
    }

}

class Students_selected {
    String namm;
    int rolly;
    float cgpp;
    String branchh;
    String cname;

    Students_selected(String namm,int rolly,float cgpp,String branchh,String cname) {
        this.namm = namm;
        this.rolly = rolly;
        this.cgpp = cgpp;
        this.branchh = branchh;
        this.cname = cname;
    }

}
