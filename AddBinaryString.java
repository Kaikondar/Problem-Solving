import java.util.*;
class AddBinaryString{
      
      public static void main(String[] args) {
            String a="0100";
            String b="0010";
           System.out.println(helper(a, b));
      }
      private static String helper(String a,String b){
            int n1=a.length();
            int n2=b.length();
            int i=n1-1,j=n2-1;
            int z=0;
            StringBuilder sb=new StringBuilder();
            while(i>=0 && j>=0){
                int x=a.charAt(i)-'0';
                int y=b.charAt(j)-'0';
                int sum=x+y+z;
                if(sum==0){
                    sb.append('0');
                    z=0;
                }else if(sum==1){
                    sb.append('1');
                    z=0;
                }else if(sum==2) {
                    sb.append('0');
                    z=1;
                }else{
                    sb.append('1');
                    z=1;
                }
                i--;
                j--;
            }
            while(i>=0){
                int x=a.charAt(i)-'0';
                int sum=x+z;
                if(sum==1){
                    sb.append('1');
                    z=0;
                }else if(sum==2){
                    sb.append('0');
                    z=1;
                }else{
                    sb.append('0');
                    z=0;
                }
                i--;
            }
            while(j>=0){
                int x=b.charAt(j)-'0';
                int sum=x+z;
                if(sum==1){
                    sb.append('1');
                    z=0;
                }else if(sum==2){
                    sb.append('0');
                    z=1;
                }else{
                    sb.append('0');
                    z=0;
                }
                j--;
            }
            if(z==1){
                sb.append('1');
            }
            sb.reverse();
            i=0;
             while(i<sb.length() && sb.charAt(i)=='0'){
                 sb.deleteCharAt(i);
            }
             if(sb.length()==0)
             sb.append('0');
            return sb.toString();
        }
}