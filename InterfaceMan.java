class InterfaceMan{
	private String msgIn = "0~9までの数値を入力してください。";
	private String msgMa = "あたり！";
	private String msgBa = "はずれ";
	public int inum;

	public int In_number(){
		System.out.println(msgIn);
		inum = new java.util.Scanner(System.in).nextInt();
		return inum;
	}

	public void Bingo(){
		System.out.println(msgMa);
	}

	public void Miss(){
		System.out.println(msgBa);
	}
}