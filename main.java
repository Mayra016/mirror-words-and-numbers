public class Main {
   public static void main(String[] args) {
	    String hola = "hola";
	    System.out.println(revertWord(hola));
	    System.out.println(sortDesc(1021));
   }
	
   public static String revertWord(String word) {
      String reverse = "";
      for (int i = word.length() -1; i >= 0; i--) {
          reverse = reverse.concat(Character.toString(word.charAt(i)));
      }
      return reverse;
  }
    
  public static int sortDesc(final int num) {
      String reverse = "";
      String number = String.valueOf(num);
      for (int i = number.length() - 1; i >= 0; i--) {
          reverse = reverse.concat(Character.toString(number.charAt(i)));
      }
      return Integer.parseInt(reverse, 10);
  }
}  
