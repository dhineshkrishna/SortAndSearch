import java.util.ArrayList;
import java.util.List;

public class Listy {

	public static void main(String[] args) {
List<Object> list=new ArrayList<>();
list.add(2);
list.add(3);
list.add("guna");
list.stream().forEach(System.out::println);

	}

}
