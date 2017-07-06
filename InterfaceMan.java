class InterfaceMan{
	private String msgIn = "0~9までの数値を入力してください。";
	private String msgMa = "あたり！";
	private String msgBa = "はずれ";
	public int inum;

	public InterfaceMan(){
		In_number();
	}

	public int In_number(){
		System.out.println(msgIn);
		inum = new java.util.Scanner(System.in).nextInt();
		return inum;
	}
}