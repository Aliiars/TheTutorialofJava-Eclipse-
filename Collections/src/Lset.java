import java.util.LinkedHashSet;

public class Lset {

	public static void main(String[] args) {
		
		LinkedHashSet gunler = new LinkedHashSet();
		
		gunler.add("Pazartesi");
		gunler.add("Salı");
		gunler.add("Çarşamba");
		gunler.add("Perşembe");
		gunler.add("Cuma");
		gunler.add("Cumartesi");
		gunler.add("Pazar");
		
		gunler.forEach(item -> System.out.print(item + " , "));

	}

}
