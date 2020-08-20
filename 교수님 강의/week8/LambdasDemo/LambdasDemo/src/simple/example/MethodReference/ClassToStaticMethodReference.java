package simple.example.MethodReference;

import java.util.Arrays;
import java.util.List;

public class ClassToStaticMethodReference {
	public static void main(String[] args) {
        List<String> list = Arrays.asList("name: James","name: Clark", "name: Brown", "name: Roger");

        // Method reference
        list.forEach(ClassToStaticMethodReference::print);
//        list.forEach(System.out::println);

        // Lambda expression
        list.forEach(string -> ClassToStaticMethodReference.print(string));
       
        // normal
        for(String str : list) {

            ClassToStaticMethodReference.print(str);
        }

    }

    public static void print(final String str) {
        System.out.println("I am printing " + str);

    }
}
	
