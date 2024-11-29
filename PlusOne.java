import java.util.* ;
import java.io.*; 
public class PlusOne
{
public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr)
    {
        // Write your code here.
        int i=arr.size()-1;
         while(i>=0 && arr.get(i)==9){
           arr.set(i,0);
           i--;
         }
         if(i>=0){
             arr.set(i,arr.get(i)+1);
         }else{
             arr.add(0,1);
         }
         while(arr.size()>0 && arr.get(0)==0){
         arr.remove(0);
         }
         return arr;
    }
}
