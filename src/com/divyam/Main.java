package com.divyam;

import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void time(){
        SimpleDateFormat tm = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = new Date();
        System.out.println(tm.format(d));
    }
    public static void main(String[] args) {
        int select = 0;
        int num_of_companies=0;
        int num_of_comp_registered=0;

        int num_of_add_students=0;
        int num_of_students_reg=0;

        int num_of_blockst=0;

        Student_Functionalities add_students[] = new Student_Functionalities[100];
        Student_Functionalities reg_students[] = new Student_Functionalities[100];

        company_details comp[] = new company_details[100];
        company_details compRegistered[] = new company_details[100];

        Students_selected st_selected[] = new Students_selected[100];
        int num_of_stselected = 0;

        int co=0;  //iterator for array of companies

        String company_optime;
        String company_cltime;

        String student_optime;
        String student_closingtime;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to FutureBuilder");
            System.out.println("    1) Enter the Application");
            System.out.println("    2) Exit the Application");
            select = sc.nextInt();

            if (select == 2) {
                break;
            }

            if (select==1) {
                while (true) {
                    System.out.println("Choose The mode you want to Enter in:-");
                    System.out.println("    1) Enter as Student Mode");
                    System.out.println("    2) Enter as Company Mode");
                    System.out.println("    3) Enter as Placement Cell Mode");
                    System.out.println("    4) Return to Main Application");
                    select = sc.nextInt();

                    if (select==4) {
                        break;
                    }

                    if (select==3){
                        while (true) {
                            System.out.println("Welcome to IIITD Placement Cell");
                            System.out.println(    "1) Open Student Registrations");
                            System.out.println(    "2) Open Company Registrations");
                            System.out.println(    "3) Get Number of Student Registrations");
                            System.out.println(    "4) Get Number of Company Registrations");
                            System.out.println(    "5) Get Number of Offered/Unoffered/Blocked Students");
                            System.out.println(    "6) Get Student Details");
                            System.out.println(    "7) Get Company Details");
                            System.out.println(    "8) Get Average Package");
                            System.out.println(    "9) Get Company Process Results");
                            System.out.println(    "10) Back");

                            select = sc.nextInt();

                            if (select == 10) {
                                break;
                            }

                            if (select == 8) {
                                while (true) {
                                    int avg=0;
                                    for (int v=0; v<num_of_stselected; v++) {
                                        avg += add_students[v].inhand;
                                    }
                                    System.out.println("Average package is : "+avg/num_of_stselected);
                                }
                            }

                            if (select == 7) {
                                while (true) {
                                    for (int s=0; s<num_of_comp_registered;s++) {
                                        System.out.println(s+")");
                                        System.out.println(compRegistered[s].name);
                                        System.out.println(compRegistered[s].role);
                                        System.out.println(compRegistered[s].ctc);
                                        System.out.println(compRegistered[s].cgpa);
                                        System.out.println();
                                    }
                                    break;
                                }
                            }

                            if (select == 6) {
                                while (true) {
                                    for (int n=0; n<num_of_students_reg; n++) {
                                        System.out.println(n+")");
                                        System.out.println();
                                    }
                                }
                            }

                            if (select == 3) {
                                while (true) {
                                    System.out.println("Number of Students registered : " + num_of_students_reg);
                                    break;
                                }
                            }

                            if (select == 4) {
                                while (true) {
                                    System.out.println("Number of Companies registered : " + num_of_comp_registered);
                                    break;
                                }
                            }

                            if (select == 5) {
                                while (true) {
                                    System.out.println("Number of Offered Students : "+num_of_stselected);
                                    System.out.println("Number of blocked Students : "+num_of_blockst);
                                    break;
                                }
                            }

                            if (select == 9) {
                                while (true) {
                                    System.out.println("Following are the students selected-");
                                    for (int p = 0; p < num_of_stselected; p++) {
                                        System.out.println(p+")");
                                        System.out.println("Name : "+st_selected[p].namm);
                                        System.out.println("RollNo : "+st_selected[p].rolly);
                                        System.out.println("CGPA : "+st_selected[p].cgpp);
                                        System.out.println("Branch : "+st_selected[p].branchh);
                                        System.out.println();
                                    }
                                    break;
                                }
                            }

                            if (select == 1) {
                                while (true) {
                                    System.out.println("Fill in the Details:-");
                                    System.out.println("    1) Set the Opening time for Student registrations");
                                    System.out.println("    2) Set the Ending time for Student registrations.");

                                    student_optime = sc.next();
                                    student_closingtime = sc.next();
                                    break;
                                }
                            }

                            if (select == 2) {
                                while (true) {
                                    System.out.println("Fill in the details:-");
                                    System.out.println("    1) Fill in the details:-");
                                    System.out.println("    2) Fill in the details:-");

                                    company_optime = sc.next();
                                    company_cltime = sc.next();

                                    break;
                                }
                            }
                        }
                    }

                    if (select == 2) {
                        while (true) {
                            System.out.println("Choose the Company Query to perform-");
                            System.out.println("    1) Add Company and Details");
                            System.out.println("    2) Choose Company");
                            System.out.println("    3) Get Available Companies");
                            System.out.println("    4) Back");

                            select = sc.nextInt();

                            if (select == 4) {
                                break;
                            }

                            if (select == 1) {
                                while (true) {
                                    String naam = sc.next();
                                    String r = sc.next();
                                    float ct = sc.nextFloat();
                                    float cg = sc.nextFloat();
                                    comp[num_of_companies] = new company_details(naam, r, ct, cg);

                                    co = co + 1;
                                    num_of_companies++;
                                    break;
                                }
                            }

                            if (select == 2) {
                                System.out.println("Choose To enter into mode of Available Companies:-");

                                int select2=0;

                                for (int i = 0; i < num_of_companies; i++) {
                                    System.out.println(i+")"+ " "+comp[i].name);
                                }
                                select2 = sc.nextInt();

                                for (int i=0; i< num_of_companies; i++) {
                                    if (select2 == i) {
                                        while (true) {
                                            System.out.println("Welcome " + comp[i].name);
                                            System.out.println("    1) Update Role");
                                            System.out.println("    2) Update Package");
                                            System.out.println("    3) Update CGPA criteria");
                                            System.out.println("    4) Register to Institute Drive");
                                            System.out.println("    5) Back");

                                            int sel = sc.nextInt();

                                            if (sel == 1) {
                                                while (true) {
                                                    String updated_role = sc.nextLine();
                                                    comp[i].role = updated_role;
                                                    break;
                                                }
                                            }

                                            if (sel == 2) {
                                                while (true) {
                                                    float updated_package = sc.nextFloat();
                                                    comp[i].ctc = updated_package;
                                                    break;
                                                }
                                            }

                                            if (sel == 3) {
                                                while (true) {
                                                    float updated_cgpa = sc.nextFloat();
                                                    comp[i].cgpa = updated_cgpa;
                                                    break;
                                                }
                                            }

                                            if (sel == 4) {
                                                while (true) {
                                                    num_of_comp_registered++;
                                                    compRegistered[num_of_comp_registered - 1] = new company_details(comp[num_of_comp_registered - 1].name, comp[num_of_comp_registered - 1].role, comp[num_of_comp_registered - 1].ctc, comp[num_of_comp_registered - 1].cgpa);
                                                    System.out.println("Registered!!!");
                                                    time();
                                                    break;
                                                }
                                            }

                                            if (sel == 5) {
                                                for (int k=0;k<num_of_comp_registered;k++) {
                                                    System.out.println(compRegistered[k].name);
                                                }
                                                break;
                                            }
                                        }
                                    }
                                }
                            }

                        }
                    }

                    if (select == 1) {
                        while (true) {
                            System.out.println("Choose the Student Query to perform-");
                            System.out.println("    1) Enter as a Student(Give Student Name, and Roll No.)");
                            System.out.println("    2) Add students");
                            System.out.println("    3) Back");

                            int sel3 = sc.nextInt();

                            if (sel3 == 3) {
                                break;
                            }

                            if (sel3 == 2) {
                                while (true) {
                                    System.out.println("Number of students to add: ");
                                    int st = sc.nextInt();

                                    for (int y=0;y<st;y++) {
                                        String nam = sc.next();
                                        int rolno = sc.nextInt();
                                        float cgp = sc.nextFloat();
                                        String branch = sc.next();
                                        String stat = "notplaced";
                                        int inhand =0;

                                        add_students[num_of_add_students] = new Student_Functionalities(nam,rolno,cgp,branch,stat,inhand);
                                        num_of_add_students++;

                                        System.out.println();

                                    }
                                    break;
                                }
                            }

                            if (sel3 == 1) {
                                while (true) {
                                    String stu = sc.next();
                                    int roln = sc.nextInt();


                                    for (int e=0; e<num_of_add_students; e++) {
                                        if (stu.compareTo(add_students[e].name) == 0) {
                                            while (true) {
                                                System.out.println("Welcome " + add_students[e].name + "!!");
                                                System.out.println("    1) Register For Placement Drive");
                                                System.out.println("    2) Register For Company");
                                                System.out.println("    3) Get All available companies");
                                                System.out.println("    4) Get Current Status");
                                                System.out.println("    5) Update CGPA");
                                                System.out.println("    6) Accept Offer");
                                                System.out.println("    7) Reject Offer");
                                                System.out.println("    8) Back");

                                                int sel4 = sc.nextInt();

                                                if (sel4 == 8) {
                                                    break;
                                                }

                                                if (sel4 == 5) {
                                                    while (true) {
                                                        float cgg = sc.nextFloat();
                                                        add_students[e].cgpa = cgg;
                                                        break;
                                                    }
                                                }

                                                if (sel4 == 7) {
                                                    while (true) {
                                                        for (int h=0; h<num_of_students_reg; h++) {
                                                            if (add_students[e].name == st_selected[h].namm) {
                                                                System.out.println("Offer rejected!");
                                                                num_of_blockst++;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }

                                                if (sel4 == 6) {
                                                    while (true) {
                                                        for (int x=0; x<num_of_stselected; x++) {
                                                            if (add_students[e].name == st_selected[x].namm) {
                                                                System.out.println("Congratulations " + add_students[e].name + "!! You have accepted the offer by " +st_selected[x].cname+"!!");
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                }

                                                if (sel4 == 4) {
                                                    while (true) {
                                                        for (int t=0; t <num_of_stselected; t++) {
                                                            if (add_students[e].name == st_selected[t].namm) {
                                                                System.out.println("You have been offered by "+st_selected[t].cname+"!!! Please accept the offer");
                                                                break;
                                                            }
                                                            else {
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                }

                                                if (sel4 == 3) {
                                                    while (true) {
                                                        System.out.println("List of All available companies is as follows: ");
                                                        for (int d = 0; d < num_of_comp_registered; d++) {
                                                            System.out.println("   " + d+")");
                                                            System.out.println("    CompanyName: " + compRegistered[d].name);
                                                            System.out.println("    Company role offering: " + compRegistered[d].role);
                                                            System.out.println("    Company Package: " + compRegistered[d].ctc);
                                                            System.out.println("    Company CGPA criteria: " + compRegistered[d].cgpa);
                                                            System.out.println();
                                                        }
                                                        break;
                                                    }
                                                }

                                                if (sel4 == 1) {
                                                    while (true) {
                                                        time();
                                                        System.out.println(add_students[e].name + " Registered for the Placement Drive at IIITD!!!!");
                                                        System.out.println("Your Details are:");
                                                        System.out.println("    Name: " + add_students[e].name);
                                                        System.out.println("    RollNo: " + add_students[e].roll_no);
                                                        System.out.println("    CGPA: " + add_students[e].cgpa);
                                                        System.out.println("    Name: " + add_students[e].branch);
                                                        reg_students[num_of_stselected] = new Student_Functionalities(add_students[e].name,add_students[e].roll_no,add_students[e].cgpa,add_students[e].branch,"unplaced",0);
                                                        num_of_students_reg++;
                                                        break;
                                                    }
                                                }

                                                if (sel4 == 2) {
                                                    while (true) {
                                                        String compname = sc.next();
                                                        for (int q=0;q<num_of_comp_registered;q++) {
                                                            if (compname.compareTo(compRegistered[q].name)==0) {
                                                                if (add_students[e].cgpa>=compRegistered[q].cgpa && (add_students[e].status == "unplaced" || compRegistered[q].ctc >= 3*add_students[e].inhand)) {
                                                                    System.out.println("Successfully Registered for " + compRegistered[q].role +" Role at "+ compRegistered[q].name+"!!!!");
                                                                    add_students[e].inhand = compRegistered[q].ctc;
                                                                    add_students[e].status = "placed";

                                                                    st_selected[num_of_stselected] = new Students_selected(add_students[e].name,add_students[e].roll_no,add_students[e].cgpa,add_students[e].branch,compRegistered[q].name);
                                                                    num_of_stselected++;
                                                                    break;
                                                                }
                                                                else {
                                                                    System.out.println("Not Eligible :(");
                                                                    break;
                                                                }
                                                            }
                                                        break;
                                                        }


                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }

                            }

                        }
                        }
                    }


                }
            }

    }
}