import java.util.*;
import java.lang.*;
import java.io.*;

// class VotingGen{
//     int[] vote_list;

//     VotingGen(){
//         vote_list = new int[300];
//         for(int i = 0;i<vote_list.length;++i){
//             vote_list[i] = (int)(Math.random()*((3-1)+1))+1;
//         }
//     }
// }

class Vote_Counter implements Runnable{
    private int count_A = 0;
    private int count_B = 0;
    private int count_C = 0;

    int[] vote_list;
    public Vote_Counter(){
        vote_list = new int[75];
        for(int i = 0;i<vote_list.length;++i){
             vote_list[i] = (int)(Math.random()*((3-1)+1))+1;
        }
    }
   
    @Override
    public void run(){

        

        for(int i=0;i<vote_list.length;++i){
            if(vote_list[i]==1){
                incrementA();
            }
            if(vote_list[i]==2){
                incrementB();
            }
            if(vote_list[i]==3){
                incrementC();
            }
        }
    }

    private synchronized void incrementA(){
        count_A++;
    }
    private synchronized void incrementB(){
        count_B++;
    }
    private synchronized void incrementC(){
        count_C++;
    }

    public int getCounterA(){
        return count_A;
    }
    public int getCounterB(){
        return count_B;
    }
    public int getCounterC(){
        return count_C;
    }
}
class Exp3q1_17BCE2213{
    public static void main(String[] args){
        

        Vote_Counter vote = new Vote_Counter();
        Thread t1 = new Thread(vote);
        Thread t2 = new Thread(vote);
        Thread t3 = new Thread(vote);
        Thread t4 = new Thread(vote);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (Exception e) {

            e.printStackTrace();
            //TODO: handle exception
        }

        System.out.println("Vote Count of A:"+vote.getCounterA());
        System.out.println("Vote Count of B:"+vote.getCounterB());
        System.out.println("Vote Count of C:"+vote.getCounterC());


    }
}