
public class Three_EvenOdd {

	public static void main(String[] args) {

		int [] num = {1,2,3,4,5};

		int ec = 0;
		int oc = 0;
		for(int i = 0; i < num.length; i++) {

			if (num[i]%2 == 0) {
				ec++;
			}
			else {
				oc++;
			}
		} 

		System.out.println("Even:" + ec);
		System.out.println("Odd:" + oc);
	}

}
