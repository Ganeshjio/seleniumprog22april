package string;

public class StringClassMethods02 {
	
	public static void main(String[]args) {
	String y1 = "Software tester";  // length is consider by space include
	String y2 = "Wipro";
	String y3 = "Wipro";
	String y4 = "WIPRO";
	String y5 = "Java";
    String y6 = new String("Wipro");
    String y7 = "";
    
    System.out.println(y1.isEmpty());
    System.out.println(y7.isEmpty());
    System.out.println(y1.isBlank());
    System.out.println(y7.isBlank());
    System.out.println(y1.length());
    System.out.println(y2.length());
    System.out.println(y7.length());
    System.out.println(y3.toUpperCase());
    System.out.println(y4.toLowerCase());
    System.out.println(y1.startsWith("Software tester"));
    System.out.println(y2.startsWith("WIPRO"));
    System.out.println(y2.startsWith("Wipro"));
    System.out.println(y1.concat("is totaly QA tester"));
    System.out.println(y1.indexOf('s')); //index should be start zero(0)
    System.out.println(y3.lastIndexOf('p'));
    System.out.println(y4.charAt(3));
    System.out.println(y3.substring(2));
    System.out.println(y3.substring(3, 4));
    System.out.println(y2.equals(y3));
    System.out.println(y2.equals(y4));
    System.out.println(y2==y3);
    System.out.println(y3.equals(y2));
    System.out.println(y2==y5);
    System.out.println(y2.equalsIgnoreCase(y3));
    System.out.println(y1.replaceAll("Software", "develpoers"));
    System.out.println(y1.trim());
    
}
}