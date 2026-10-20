
class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sbd= new StringBuffer("Hello");
	    sbd.append(" Reshma");
		System.out.println("Append :" +sbd);
		sbd.insert(5, " World");
		System.out.println("Insert :" +sbd);
		sbd.deleteCharAt(5);
		System.out.println("Delete Character :" +sbd);
		sbd.replace(0 ,5 ,"Hi");
		System.out.println(" Replace ::" +sbd);
		sbd.delete( 0,2);
		System.out.println("Delete :" +sbd);
		sbd.reverse();
		System.out.println("Reverse :" +sbd);	
	}
}