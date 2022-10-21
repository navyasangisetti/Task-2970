package hashset;
import java.util.HashSet;
public class Main {
      public static void main(String args[]){
	        HashSet<Integer> hset = new HashSet<>();
	        hset.add(10);
	        hset.add(20);
	        hset.add(30);
	        hset.add(40);
	        hset.add(50);
	        System.out.println(hset);
	        hset.remove(10);
	        hset.remove(20);
	        System.out.println(hset);
	        System.out.println(hset.size());
	        System.out.println(hset.contains(30));
	        
	    }
}



