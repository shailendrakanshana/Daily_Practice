import java.util.*;

public class maxabsdif {
    public static int maxArr(ArrayList<Integer> A) {
        int Lsmallv[] = new int[A.size()];
        int Lsmalli[] = new int[A.size()];
        int Rmaxv[] = new int[A.size()];
        int Rmaxi[] = new int[A.size()];
        Lsmallv[0] = A.get(0);
        Lsmalli[0] = 0;
        for(int i = 1;i<A.size();i++){
            if(A.get(i)<Lsmallv[i-1]){
                Lsmallv[i] = A.get(i);
                Lsmalli[i] = i;
            }
            else{
                Lsmallv[i] = Lsmallv[i-1];
                Lsmalli[i] = Lsmalli[i-1];
            }
        }
        Rmaxv[A.size()-1] = A.get(A.size()-1);
        Rmaxi[A.size()-1] = A.size()-1;
        for(int i = A.size()-2;i>=0;i--){
            if(A.get(i)>Rmaxv[i+1]){
                Rmaxv[i] = A.get(i);
                Rmaxi[i] = i;
            }
            else{
                Rmaxv[i] = Rmaxv[i+1];
                Rmaxi[i] = Rmaxi[i+1];
            }
        }
        int Rsmallv[] = new int[A.size()];
        int Rsmalli[] = new int[A.size()];
        int Lmaxv[] = new int[A.size()];
        int Lmaxi[] = new int[A.size()];
        Lmaxv[0] = A.get(0);
        Lmaxi[0] = 0;
        for(int i = 1;i<A.size();i++){
            if(A.get(i)>Lmaxv[i-1]){
                Lmaxv[i] = A.get(i);
                Lmaxi[i] = i;
            }
            else{
                Lmaxv[i] = Lmaxv[i-1];
                Lmaxi[i] = Lmaxi[i-1];
            }
        }
        Rsmallv[A.size()-1] = A.get(A.size()-1);
        Rsmalli[A.size()-1] = A.size()-1;
        for(int i = A.size()-2;i>=0;i--){
            if(A.get(i)<Rsmallv[i+1]){
                Rsmallv[i] = A.get(i);
                Rsmalli[i] = i;
            }
            else{
                Rsmallv[i] = Rsmallv[i+1];
                Rsmalli[i] = Rsmalli[i+1];
            }
        }
        int m = 0;
        for(int i = 0;i<A.size();i++){
            int s = Math.max((Math.abs(Lsmallv[i]-Rmaxv[i])+Math.abs(Lsmalli[i]-Rmaxi[i])),(Math.abs(Rsmallv[i]-Lmaxv[i])+Math.abs(Rsmalli[i]-Lmaxi[i])));
            m = Math.max(m, s);
        }
        return m;
        
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(3);
        A.add(-1);
        System.out.println(maxArr(A));

    }
}