import java.util.*;
import java.io.*;
import java.lang.*;


class MyInfo implements Serializable{
    String RegNo;
    String Name;
    double CGPA;
    String phoneno;

    MyInfo(String r,String n, double c, String p){
        RegNo = r;
        Name = n;
        CGPA = c;
        phoneno = p;
    }
}

class Labex4q2b_17BCE2213{
    public static void main(String[] args){
        MyInfo std = null;

        try {
            FileInputStream file = new FileInputStream("StudentInfo.txt");
            ObjectInputStream in = new ObjectInputStream(file);
            std = (MyInfo) in.readObject();
            in.close();
            file.close();
        } catch (Exception e) {
            
            e.printStackTrace();
            //TODO: handle exception
        }finally{
            System.out.println("Student Deserializing..");
            System.out.println("Your student information is:\nName:"+std.Name+"\nRegistration Number:"+std.RegNo+"\nCGPA:"+std.CGPA+"\nPhone Number:"+std.phoneno);

        }
    }
}