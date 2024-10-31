import java.util.*;
class Least_Greater_Right {
    public static void main(String[] args) {
        int[]arr={1,4,2,6};
        int[]ans=f(arr,arr.length);
        System.out.println(Arrays.toString(ans));
    }
    static int[] f(int[]arr,int n){
        TreeSet<Integer>set=new TreeSet<>();
        int[]a=new int[n];
        Arrays.fill(a,-1);
        for(int i=n-1;i>=0;i--){
            Integer nex=set.higher(arr[i]);
            if(nex!=null){
                a[i]=nex;
            }
            set.add(arr[i]);
        }
        return a;
    }
}