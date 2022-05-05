class StackArray{
	
	int size;
	int top1;
	int top2;
	int arr[];
	
	StackArray(int n){
		
		this.arr = new int[n];
		this.size = n;
		this.top1 = -1;
		this.top2 = size;
	}
	
	void push1(int x1){
		if(top1 < top2-1){
			top1++;
			arr[top1]=x1;
		}
		else{
			System.out.println("Stack has Overflowed");
			System.exit(1);
		}
	}
	
	void push2(int x2){
		if (top1 < top2-1){
			top2--;
			arr[top2]=x2;
		}
		else{
			System.out.println("Stack has Overflowed");
			System.exit(1);
		}
	}
	
	int pop1(){
		if (top1 >= 0){
			int x1 = arr[top1];
			top1-- ;
			return x1;
		}
		else{
			System.out.println("Stack has underlowed");
			System.exit(1);
		}
		return 0;
	}
	
	int pop2(){
		
		if(top2 < size){
			int x2 = arr[top2];
			top2++;
			return x2;
		}
		else{
			System.out.println("Stack has underlowed");
			System.exit(1);
		}
		return 0;
	}
	
	public static void main(String... args){
		
		StackArray sa = new StackArray(6);
		
		sa.push1(5);
		sa.push2(10);
		sa.push2(15);
		sa.push1(11);
		sa.push2(7);
		sa.push2(40);
		
		
		System.out.println("Popped element from stack1 is :"+ sa.pop1());
		
		System.out.println("Popped element from stack2 is :"+ sa.pop2());
		
	}
}