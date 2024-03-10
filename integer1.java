import java.util.Scanner;
public class integer1{
  public static void main (String[] arg){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=sc.nextInt();
    System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
  }
}
