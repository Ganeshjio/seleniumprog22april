package string;

public class StringClassMethods {
	
	public static void main(String[] args) {
		String s1 = " Java Developers";
		String s2 = "Pinspire";
		String s3 = "Pinspire";
		String s4 = "PINSPIRE";
		String s5 = "Java";
		String s6 = new String ("Pinspire");
		String s7 = "";
		
		System.out.println(s1.isEmpty());
		System.out.println(s7.isEmpty());
		System.out.println(s1.isBlank());
		System.out.println(s7.isBlank());
		System.out.println(s1.length());
		System.out.println(s3.toUpperCase());
		System.out.println(s4.toLowerCase());
		System.out.println(s1.startsWith("Mava"));
		System.out.println(s1.startsWith("Java"));
		System.out.println(s3.startsWith("pinspire"));
		System.out.println(s1.concat(" is totally Mava Developers"));
		System.out.println(s2.concat(s1));
		System.out.println(s1.indexOf('v'));
		System.out.println(s1.lastIndexOf('v'));
		System.out.println(s1.charAt(8));
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5, 10));
		System.out.println(s2.equals(s3));// False
		System.out.println(s2.equalsIgnoreCase(s3));// True
		System.out.println(s2==s3);// False
		System.out.println(s2==s6);// False
		System.out.println(s2.equals(s6));// False
		System.out.println(s1.replaceAll("Java", "Mava"));
		System.out.println(s1.trim());
	}


}
