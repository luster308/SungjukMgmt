import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Input {
	private Student [] array;
	private Scanner sc;
	private File file;
	private BufferedReader br;
	
	public Input(Student[] array) {
		this.array = array;
		this.sc = new Scanner(System.in);
		this.file = new File("C:/Temp/sungjuk_utf8.dat");
		try {
			this.br = new BufferedReader(new FileReader(this.file));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
		
	}

	public int fileInput() {
		int count = 0;
		String line = null;
		while(true) {
			count++;
			try {
				line = this.br.readLine();
				if(line==null) break;
//				System.out.println(line);
//				1101     한송이     78     87     83     78
				String [] lines = line.split("\\s+");
				System.out.println(line[2]);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return count - 1;
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
			this.sc.nextLine();   // buffer 날리기
		}while(io.equals("I")||io.equals("i"));
		return count;
	}
}
