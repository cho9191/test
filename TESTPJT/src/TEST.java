import java.util.Random;

public class TEST {

	public static void main(String[] args) {
		
	/*	Random rd = new Random();
		System.out.println(rd.nextInt());
		*/
		
		String strScrtKey= "" ;
		
		 for (int i = 0; i < 10; i++) {
			 strScrtKey  += (char) ((Math.random() * 26) + 97);
			 strScrtKey += (int) (Math.random() * 10) + 1;
		    }

		    System.out.println(strScrtKey); 

	}

}
