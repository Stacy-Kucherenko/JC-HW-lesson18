package lviv.lgs.ua;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
	
	public static void main(String[] args) {
		
		Map<Integer, List<Integers>> newMap = new Map<>(22, new ArrayList<Integers>(Arrays.asList(new Integers("4"))));
		
		newMap.addNewEntry(11, new ArrayList<Integers> (Arrays.asList(new Integers ("2"))));
		newMap.addNewEntry(33, new ArrayList<Integers> (Arrays.asList(new Integers ("4"))));
		newMap.viewMap();
		newMap.removeEntry(22);
		newMap.viewMap();
		newMap.removeValue(11);
		newMap.viewKeySet();
		newMap.viewValueList();
		newMap.viewMap();
		
		Map <String, Integer> newMap1 = new Map <>("11", 2);
		
		newMap1.addNewEntry("5", 44);
		newMap1.addNewEntry("3", 33);
		newMap1.viewMap();
		newMap1.removeEntry("11");
		newMap1.viewMap();
		newMap1.removeValue("5");
		newMap1.viewKeySet();
		newMap1.viewValueList();
		newMap1.viewMap();
		
	}
	
	public static class Integers {
		String integer;

		public Integers(String integer) {
			super();
			this.integer = integer;
		}

		public String getInteger() {
			return integer;
		}

		public void setInteger(String integer) {
			this.integer = integer;
		}

		@Override
		public String toString() {
			return integer;
		} 
		
	}

}


