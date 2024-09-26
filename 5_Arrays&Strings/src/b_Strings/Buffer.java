package b_Strings;

public class Buffer {

	public static void main(String[] args) {

		StringBuffer stringBuffer = new StringBuffer();
		StringBuffer stringBuffer1 = new StringBuffer("John");
		StringBuffer stringBuffer2 = new StringBuffer(20);

		System.out.println(stringBuffer1.append(" Patil"));
		System.out.println(stringBuffer1.replace(2, 6, "nica"));
		System.out.println(stringBuffer1.reverse());
		System.out.println(stringBuffer.capacity());
		System.out.println(stringBuffer2.capacity());r
		System.out.println(stringBuffer1.length());
	}

}
