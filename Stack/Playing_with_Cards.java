// You are at a casino. There are N stacked cards on pile . Each card has a number written on it. Then there will be Q iterations. 
// In ith iteration, you start picking up the cards in Ai-1th pile from the top one by one and check whether the number written on the card is
//  divisible by the ith prime number. If the number is divisible, you stack that card on pile Bi. Otherwise, you stack that card on pile Ai. 
//  After Q iterations, cards can only be on pile B1, B2, B3, . . . BQ, AQ . 
// Output numbers on these cards from top to bottom of each piles in order of B1, B2, B3, . . . BQ, AQ .


import java.util.*;
public class Playing_with_Cards {
	public static void Primes(List<Integer> l){
		boolean b[] = new boolean[100001];
		for(int i = 2;i<=100000;i++){
			if(b[i]==false){
				for(int j = 2;i*j<=100000;j++){
					b[i*j] = true;
				}
			}
		}
		for(int i = 2;i<=100000;i++){
			if(!b[i]) l.add(i);
		}
	}
	public static Stack<Integer> getCards(Stack<Integer> s,int k){
		Stack<Integer> a = new Stack<Integer>();
		Stack<Integer> b = new Stack<Integer>();
		while(!s.isEmpty()){
			int x = s.pop();
			if(x%k==0) b.push(x);
			else a.push(x);
		}
		while(!b.isEmpty()){
			System.out.println(b.pop());
		}
		return a;
	}
    public static void main(String args[]) {
		List<Integer> l = new ArrayList<>();
		Primes(l);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		Stack<Integer> s = new Stack<>();
		while(n-->0){
			s.push(sc.nextInt());
		}
		for(int i = 0;i<q;i++){
			s = getCards(s,l.get(i));
		}
		while(!s.isEmpty()){
			System.out.println(s.pop());
		}
        sc.close();
    }
}
