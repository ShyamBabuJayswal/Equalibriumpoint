import java.util.Scanner;

public class Equalibriumpointinarray {
    //long arr={1,3,5,2,2}
//from leftsum 1+3=4
//from rightsum 2+2=4
//then 5 index 3 is equalibrium point where before this point  left sum and right sum is equal


        public static int equilibriumPoint(long arr[], int n) {
            int i=0;
            int j=n-1;
            long leftsum=arr[0];
            long rightsum=arr[n-1];
            if(i==j){
                return 1;
            }
            while(i<j){
                if(leftsum<rightsum){
                    i++;
                    leftsum += arr[i];
                }
                else{
                    j--;
                    rightsum += arr[j];
                }
                if(leftsum==rightsum){
                    if(i+1 == j-1){
                        return i+2;
                    }
                    else{
                        i++;
                        leftsum += arr[i];
                        j--;
                        rightsum += arr[j];
                    }
                }}
            return -1;
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            long[] arr=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }
            System.out.println(equilibriumPoint(arr,n));
        }
    }







