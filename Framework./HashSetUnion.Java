import java.util.HashSet;

public class Students {
  public static void main(String[] args) {
   HashSet<Integer> set1 = new HashSet<>();
   set1.add(5);
   set1.add(2);
   set1.add(8);
   HashSet<Integer> set2 = new HashSet<>();
   set2.add(9);
   set2.add(2);
   set3.add(3);
   System.out.println("Set 1:" + set1);
   System.out.println("Set 2:" + set2);

//to perform the union between two sets we use the addAll() method.

   set1.addAll(set2);
   System.out.println("Set Union:" + set1);

//to perform intersection b/w two sets, use the retainAll() method.

   set1.retainAll(set2);
   System.out.println("Set Intersection:" + set1);

//to perform difference b/w two sets, we can use the removeAll() method.

   set1.removeAll(set2);
   System.out.println("Set Difference:" + set1);
 }
}

}
