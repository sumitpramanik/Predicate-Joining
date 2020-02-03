import java.util.function.*;

class Main {
  public static void main(String[] args) {
    int[] x = {1,2,3,4,5,10,12,13};
    
    Predicate<Integer> p1 = i-> i>10;
    Predicate<Integer> p2 = i->i%2 == 0;
    System.out.println("---- Greater than 10-----");
    m1(p1,x);
    System.out.println("-----Even nos----");
    m1(p2,x);
    System.out.println("----- Odd nos ----");
    m1(p2.negate(),x);
    System.out.println("--- Greater than 10 and even----");
    m1(p1.and(p2),x);
    System.out.println("--- NOT greater than 10 -----");
    m1(p1.negate(),x);
    System.out.println("Hello world!");
  }

  public static void m1(Predicate<Integer> p, int[] arr){
    for(int x: arr){
      if(p.test(x)){
        System.out.println(x);
      }
    }
  }
}