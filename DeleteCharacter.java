
class DeleteCharcter {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("COMPUTER");
		System.out.println("Original String :"+sb);
		sb.deleteCharAt(3);
		System.out.println("After deleting character :" +sb);
	}
}