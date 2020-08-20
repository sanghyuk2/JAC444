package simple.example.MethodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InstanceMethodofaParticularObject {
	public static void main(String[] args) {
       final List<String> list = Arrays.asList("name: James","name: James", "name: Brown", "name: Roger");
       final MyComparator myComparator = new MyComparator();

        // Method reference
        Collections.sort(list, myComparator::compare);

        // Lambda expression
        Collections.sort(list, (a,b) -> myComparator.compare(a,b));
    }

    private static class MyComparator{
    	public int compare(final String a, final String b) {
    		return a.compareTo(b);
    	}
    }
}
