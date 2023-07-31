package exception_handling;

class CommonInterviewQuestions2 {
	
	int count = 0;//6,5

	void A() throws Exception {
		try {
			count++;
			try {
				count++;
				try {
					count++;//3
					throw new Exception();
				}
				catch (Exception ex) {
					count++;//4
					throw new Exception();
				}
			}
			catch (Exception ex) {
				count++;//5
			}
		}
		catch (Exception ex) {
			count++;
		}

	}

	void display() {
		System.out.println(count);
	}

	public static void main(String[] args) throws Exception {
		CommonInterviewQuestions2 obj = new CommonInterviewQuestions2();
		obj.A();
		obj.display();
	}
}
