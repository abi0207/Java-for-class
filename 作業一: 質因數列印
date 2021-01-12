import java.util.Scanner;  
public class Main {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        while(sc.hasNextInt()){  
            int i,n = sc.nextInt();  
            for(i=2; i<=n; ++i)  
                if(n%i==0){  
                    System.out.print(i);  
                    n/=i;  
                    break;  
                }  
            for(; i<=n; ++i)  
                while(i<=n)  
                    if(n%i==0){  
                        System.out.print(" "+i);  
                        n/=i;  
                    }  
                    else  
                        break;  
            System.out.println();  
        }  
    }  
}  
