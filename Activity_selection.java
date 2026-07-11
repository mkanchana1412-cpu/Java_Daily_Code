import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		for(int i=0;i<n;i++){
		    arr[i][0]=sc.nextInt();
		    arr[i][1]=sc.nextInt();
		}
		Arrays.sort(arr,(a,b) ->Integer.compare(a[1],b[1]));
		int lastend =-1;
		for(int i=0;i<n;i++){
		    if(arr[i][0]>=lastend){
		        System.out.println(arr[i][0]+" "+arr[i][1]);
		        lastend =arr[i][1];
		    }
		}
	}
}
