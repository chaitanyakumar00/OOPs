package Stringsdemo;

public class StringsBufferCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer x=new StringBuffer();
		System.out.println(x.capacity());
		x.append("java");
		System.out.println(x.capacity());
		x.append("It is a StringBuffer Capacity");
		System.out.println(x.capacity());

	}

}
