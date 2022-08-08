
public class Sort {
	private Student [] array;
	private int count;

	public Sort(Student[] array, int count) {
		this.array = array;
		this.count = count;
	}
	public void bubbleSort() {
		for(int i=0;i<count-1;i++) {
			for(int j=0;j<count-1;j++) {
				if(this.array[j].getTot()<this.array[j+1].getTot()) {
					this.swap(j, j+1);
				}
			}
		}
		
	}
	public void selectionSort() {
		for(int i=0;i<count-1;i++) {
			for(int j=i+1;j<count;j++) {
				if(this.array[i].getTot()<this.array[j].getTot()) {
					this.swap(i, j);
				}
			}
		}
		
	}
	private void swap(int front, int back) {
		Student temp = this.array[front];
		this.array[front] = this.array[back];
		this.array[back] = temp;
	}
}
