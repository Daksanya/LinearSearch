import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int b= sc.nextInt();
        System.out.println(linearSearch(array,n,b));
    }
    static int linearSearch(int array[], int n,int b){
        int count=0;
        for(int i=0;i<n;i++){
            if(array[i]==b){
                count++;
            }
        }
        return count;
    }
}
