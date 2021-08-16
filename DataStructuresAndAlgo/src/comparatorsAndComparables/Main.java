package comparatorsAndComparables;

import java.util.*;

public class Main {
	
	public static void main(String [] args) {
		
		List<Student> s = new ArrayList<>();
		
		s.add(new Student(01,"Ram"));
		s.add(new Student(31,"Seetha"));
		s.add(new Student(16,"Krisha"));
		s.add(new Student(01,"Pandava"));
		s.add(new Student(12,"Rupmini"));
		s.add(new Student(94,"Ram"));
		
//		Collections.sort(s,new Sorting());                            // Also learn to do anonymus class and lamdas
		
		Collections.sort(s, Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());       // this is sorting first by name if name is same then this will sort based on the marks
																														// .reversed() will reverse the ordering of sort
		s.forEach(System.out::println);
		
	}

}

//class Sorting implements Comparator<Student>{
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		if(o1.name.equals(o2.name)) {
//			return o1.marks-o2.marks;
//		} else {
//			return o1.name.compareTo(o2.name);
//		}
//	}
//	
//}
