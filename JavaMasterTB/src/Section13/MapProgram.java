package Section13;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> languaes = new HashMap<>();
		languaes.put("Java", "a  java langauge");
		languaes.put("python", "a  pthon langauge");
		languaes.put("C", "a  C langauge");
		languaes.put("c++", "a  C++ langauge");
		
		System.out.println(languaes.get("Java"));
		
	}

}
