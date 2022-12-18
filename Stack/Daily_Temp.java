import java.util.*;

//739
class Daily_Temp{
    public static int[] dailyTemperatures(int[] arr) {
        //Applying Next Greater Element Approach

        int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				ans[st.pop()] = i;
			}
			st.push(i);

		}
		while (!st.isEmpty()) {
			ans[st.pop()] = 0;
		}
        for(int i = 0;i<ans.length;i++){
            if(ans[i]!=0) ans[i] = ans[i] - i;
        }
		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i] + " " + ans[i]);
		}
        return ans;
    }
    public static void main(String[] args) {
        int ar[] = {73,74,75,71,69,72,76,73};
        int br[] = dailyTemperatures(ar);
        for(int i= 0;i<ar.length;i++) System.out.print(br[i]+" ");
    }
}