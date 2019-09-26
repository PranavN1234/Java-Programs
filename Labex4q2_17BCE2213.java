

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
class Labex4q2_17BCE2213{
    public static void main(String[] args){
        
        //We create three students to serialize and put into the textfile Studentinfo.txt

        MyInfo std1 = new MyInfo("17BCE2213","Pranav",8.7,"8220198903");


        try {
            FileOutputStream file = new FileOutputStream("StudentInfo.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(std1);
         
            out.close();
            file.close();
            System.out.println("Serialization is Successfull and the object is stored");

        } catch (Exception e) {

            e.printStackTrace();
            //TODO: handle exception
        }

    }
}