
public class Calc {
	private Student [] array;

	public Calc(Student[] array) {   // 멤버변수의 초기화는 생성자가 한다.
		super();
		this.array = array;
	}
	
	public void calc(int count) {
		for(int i=0;i<count;i++) {
			Student student = this.array[i];
			int total = this.calcTotal(student.getKor(), student.getEng(),
					student.getMat(), student.getEdp());
			double avg = this.calcAvg(total, 4);
			char grade = this.calcGrade(avg);
			student.setTot(total);
			student.setAvg(avg);
			student.setGrade(grade);
		}
	}
	
	private int calcTotal(int kor, int eng, int mat, int edp) {
		return kor + eng + mat + edp;
	}
	
	private double calcAvg(int total, int su) {
		return total / (double)su;
	}
	
	private char calcGrade(double avg) {
		return(avg>=90&&avg<=100)?'A':
					(avg>=80)?'B':
						(avg>=70)?'C':
							(avg>=60)?'D':'F';
	}
}
