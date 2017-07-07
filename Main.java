import java.util.*;
public class Main{
	public static void main(String[] args) {
		InterfaceMan im = new InterfaceMan();
		Quizman qm = new Quizman();
		im.In_number();
		qm.hantei(im.inum);
		while (qm.hantei==0) {
			im.Miss();
			System.out.println("もう一度やりますか？Y/n");
			String msg = new Scanner(System.in).nextLine();
			if (msg.equals("Y")) {
				im.In_number();
				qm.hantei(im.inum);
			}else if(msg.equals("n")){
				break;
			}
		}
		if (qm.hantei==1) {
		im.Bingo();
		}
	}
}