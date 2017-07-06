public class Main{
	public static void main(String[] args) {
		InterfaceMan im = new InterfaceMan();
		Quizman qm = new Quizman();
		im.In_number();
		qm.hantei(im.inum);
		//System.out.println(qm.hantei);
	}
}