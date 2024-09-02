  import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   System.out.print("Digite o valor X: ");
    double x = sc.nextDouble();
    System.out.print("Digite o valor Y: ");
    double y = sc.nextDouble();
      
     if (x < 0 && y > 0) {
       System.out.print("Q1");
     }
     else if (x > 0 && y > 0) {
       System.out.print("Q2");
     }
     else if (x < 0 && y < 0) {
       System.out.print("Q3");
     }
     else if (x > 0 && y < 0) {
       System.out.print("Q4");
     }
     else if (x == 0 && y == 0) {
       System.out.print("Origem");
     }
     else if (x == 0) {
       System.out.print("Eixo X");
     }
     else if (y == 0) {
       System.out.print("Eixo Y");
     } 
    sc.close();
  }
}