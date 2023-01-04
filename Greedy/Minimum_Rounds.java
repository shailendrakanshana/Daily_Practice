// You are given a 0-indexed integer array tasks, where tasks[i] represents the difficulty level of a task. In each round, 
// you can complete either 2 or 3 tasks of the same difficulty level.

// Return the minimum rounds required to complete all the tasks, or -1 if it is not possible to complete all the tasks.


import java.util.*;

public class Minimum_Rounds {
    public static int minimumRounds(int[] tasks) {
        int n = tasks.length;
        if(n==1) return -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            if(map.containsKey(tasks[i])) map.put(tasks[i],map.get(tasks[i])+1);
            else map.put(tasks[i],1);
        }
        int frq[] = new int[map.size()];
        int j = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            frq[j] = entry.getValue();
            j++;
        }

        //for only one occurance
        for(int i = 0;i<j;i++){
            if(frq[i]==1) return -1;
        }
        //Final showdown
        int c = 0;
        for(int i =0;i<j;i++){
            if(frq[i]==0) continue;
            if(frq[i]==2){
                c++;
                continue;
            }
            int r = frq[i]%3;
            if(r==1 || r==2){
                c = c + (frq[i]/3)+1;
            }
            else c = c + (frq[i]/3);
        }

        return c;

    }
    public static void main(String[] args) {
        int ar[] = {2,2,3,3,2,4,4,4,4,4};
        System.out.println(minimumRounds(ar));
    }
}
