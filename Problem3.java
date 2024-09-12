public class Problem3
{
  public static void main(String[] args)
  {
    final double num = 62.1435;
    int first = (int)((num % 1) * 10);
    int second = (int)((num % 0.1) * 100);
    int third = (int)((num % 0.01) * 1000);

    System.out.println("decimal number: " + num);
    System.out.println("answer: " + first + " " + second + " " + third); 
 }
}

