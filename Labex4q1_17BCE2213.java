import java.util.*;
import java.io.*;
import java.lang.*;

class Labex4q1_17BCE2213{
    public static void main(String[] args){
        System.out.println("\t\t\t\t\nSuccess and Hardwork Counter\n");
        System.out.print("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        BufferedReader br = null;

        try{
            br = new BufferedReader(new FileReader("Words.txt"));

            String line;
            int ctr1 = 0;
            int ctr2 = 0;
            int ctr3 = 0;
            while((line = br.readLine())!=null){
                String arr[] = line.split(" ");
                int len = arr.length;
                for(int i = 0;i<len; ++i){
                    if(arr[i].equals(" ")){
                        continue;
                    }
                    if(arr[i].equals("success")){
                        ctr1 = ctr1 + 1;
                    }
                    if(arr[i].equals("hardwork")){
                        ctr2 = ctr2 + 1;
                    }
                    ctr3++;
                }
            }
            System.out.println("TOTAL NUMBER OF WORDS IN THE FILE:"+ctr3);
            System.out.println("The number of times the word Success appears is:"+ctr1);
            System.out.println("The number of times the word Hardwork appears is:"+ctr2);
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try {
                br.close();
            } catch (IOException e) {
                
                e.printStackTrace();
                //TODO: handle exception
            }
        }




    }
}