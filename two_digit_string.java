
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       for(int k=0;k<n;k++){
       String a= s.next();
       String b = s.next();
       int x[] = new int[a.length()];
       int y[] = new int[b.length()];
       x[0]=a.charAt(0)-'0';
       y[0] = b.charAt(0)-'0';
       for(int i=1;i<a.length();i++){
           x[i]=(x[i-1]+a.charAt(i)-'0')%10;
       }
       for(int i=1;i<b.length();i++){
           y[i]=(y[i-1]+b.charAt(i)-'0')%10;
       }
       if(y[b.length()-1] != x[a.length()-1]){
           System.out.println("-1");
           continue;
       }
       int d[][] = new int[a.length()+1][b.length()+1];
       for(int i=1;i<=a.length();i++){
           for(int j=1;j<=b.length();j++){
               if(x[i-1]==y[j-1])
               d[i][j]=1+d[i-1][j-1];
               else
               d[i][j] = Math.max(d[i-1][j],d[i][j-1]);
           }
       }
       System.out.println(d[a.length()][b.length()]);
       }
    }
}
