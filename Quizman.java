import java.util.*;
class Quizman{

	Random rnd = new Random();
	private int seikai = rnd.nextInt(10);
	int hantei;
		public void hantei(int ans){	
			if (ans!=seikai) {
				hantei=0;
			}else{
				hantei=1;
			}
		}
}