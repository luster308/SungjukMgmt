import java.util.Scanner;

public class Input {
	private Student [] array;
	private Scanner sc;
	
	public Input(Student[] array) {
		this.array = array;
		this.sc = new Scanner(System.in);
	}


	public int input() {
		String io = null;
		int count = 0;
		do {
			count++;
			System.out.print("Hakbun: ");		String hakbun = this.sc.nextLine();
			System.out.print("Name: ");		String name = this.sc.nextLine();
			System.out.print("Korean: ");		int kor = this.sc.nextInt();
			System.out.print("English: ");		int eng = this.sc.nextInt();
			System.out.print("Math: ");			int mat = this.sc.nextInt();
			System.out.print("EDPS: ");			int edp = this.sc.nextInt();
			this.sc.nextLine();   // buffer 날리기
			this.array[count-1] = new Student(hakbun, name, kor, eng, mat, edp);
			
			System.out.print("계속(I/O)? : ");
			io = this.sc.next();
		}while(io.equals("I")||io.equals("i"));
		return count;
	}
}
