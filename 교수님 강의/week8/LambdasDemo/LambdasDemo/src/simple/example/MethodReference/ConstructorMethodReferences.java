package simple.example.MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

public class ConstructorMethodReferences {

    public static void main(String args[]) {

        final List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Method Reference

        copyElements(null, ArrayList<Integer>::new);

        // Lambda expression

        copyElements(list, () -> new ArrayList<Integer>());
        																																																										
    }

    private static void copyElements(final List<Integer> list, final Supplier<Collection<Integer>> targetCollection) {
    	//Supplier is a built-in Functional Interface
    	//Represents a no-parameter method that returns a result. 
    	//Often used to create a collection Object in which stream operation's results are placed. 
        // Method reference to a particular instance

        list.forEach(targetCollection.get()::add);

    }

}