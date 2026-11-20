public class ArgumentDemo {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("No command");
			return ;
	}
	System.out.println("Total"+args.length);
	for(int i =0; i<args.length;i++) {
		System.out.println("Argument index"+i+":" +args.length);
	}
	}
}
