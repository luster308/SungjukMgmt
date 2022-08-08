
public class Main {

	public static void main(String[] args) {
//		System.out.println("성적관리 프로그램 시작");
		Student [] array = new Student[100];
		
		Input input = new Input(	array);
		int count = input.fileInput();
		System.out.println("count = "+count);
		
//		Calc calc = new Calc(array);
//		calc.calc(count);
		
//		Sort sort = new Sort(array, count);
//		sort.bubbleSort();
		
//		Output output = new Output();
//		output.print(array, count);
//		System.out.println("성적관리 프로그램 끝");
	}

}
