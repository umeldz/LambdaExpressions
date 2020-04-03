package lambdas_01_01;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;


public class LambdasFunctionalInterfaces {
	


	public static void main(String[] args) {
		
		
		
		//using the test method of predicate
		//Predicates return boolean
		Predicate<String> stringLen = (s) -> s.length() < 10;
		
		System.out.print(stringLen.test("Apples") + " - apples is less than 10");
		
		//Consumer example uses accept method
		Consumer<String> consumerStr = (s) -> System.out.println(s.toLowerCase());
		consumerStr.accept("ASsssasaWeddsdsdWWD");
		
		//Function example
		Function<Integer, String> converter = (num) -> Integer.toString(num);
		System.out.println("length of 26 " + converter.apply(26).length());
		
		
		//Supplier example
		Supplier<String> s = () -> "Java is fun";
		System.out.println(s.get());
		
		//Binary operator  example
		BinaryOperator<Integer> add = (a,b) -> a + b;
		System.out.println("add 10 + 25" + add.apply(10,25));
		
		//Unary operation
		UnaryOperator<String> str = (msg) -> msg.toUpperCase();
		System.out.println(str.apply("this is a message in upper case"));
		
	}

}
