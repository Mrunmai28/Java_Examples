package java8feature;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class StreamApiEx {
	static List<String> things=new ArrayList();
	public static List addItems()
	{
		things.add("Furniture,Chair");
		things.add("Furniture, Sofa");
		things.add("Furniture, Bero");
		things.add("Electonics, Fan");
		things.add("Electonics, AC");

		return things;
	}public static void main(String[] args) {
		List<String> thing=addItems();         // thing is variable which store the return type in it and get datatype of return type
		thing.stream()   
		.filter((f)->f.startsWith("Furniture"))
		.sorted()
		.forEach((f)->System.out.println(f));
		LocalTime t=LocalTime.now();
		System.out.println(t);
		LocalDate d=LocalDate.now();
		System.out.println(d);
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
	}
}
