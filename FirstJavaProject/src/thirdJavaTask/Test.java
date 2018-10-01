package thirdJavaTask;

import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

import javax.xml.soap.Text;
import javax.xml.ws.AsyncHandler;

public class Test {

	public static void main(String[] args) {

//		ArrayList liste = new ArrayList();
//		
//		liste.add(3);
//		liste.add("Bonjour");
//		liste.add(3.5);
//		liste.add('c');
//
//		System.out.println("---ArrayList---");
//		for(int i = 0; i < liste.size(); i++){	
//			System.out.println("element d�indice " + i + " = " + liste.get(i));
//		}
//		for (Object object : liste) {
//			System.out.println(object);
//		}
//		
//		LinkedList liste2 = new LinkedList();
//		
//		liste2.add(2);
//		liste2.add("Bonsoir");
//		liste2.add(5.8);
//		liste2.add('k');
//		liste2.add("Bonsoir");
//
//		System.out.println("---LinkedList---");
//		for(int i = 0; i < liste2.size(); i++){	
//			System.out.println("element d�indice " + i + " = " + liste2.get(i));
//		}
//
//		ListIterator li2 = liste2.listIterator();
//		while(li2.hasNext())
//		System.out.println(li2.next());
//		
//		//REMOVE AVANT DERNIER
//		System.out.println("---Remove avant dernier---");
//		LinkedList liste3 =  new LinkedList();
//		liste3.add(2);
//		liste3.add(5);
//		liste3.add(2);
//		liste3.add(3);
//		liste3.add(4);
//		liste3.add(2);
//		liste3.add(1);
//		liste3.add(2);
//		
//		//remove avant derniere occurence de 2
//		liste3.remove(liste3.subList(0, liste3.lastIndexOf(2)).lastIndexOf(2));
//
//		liste3.forEach(elt -> System.out.println(elt));
//		
//		//LIST
//		System.out.println("---List---");
//		List <Integer> liste4 = Arrays.asList(2,7,1,3);
//		
//		liste4.stream().map(elt-> elt +2) // ajoute 2 a chaque element
//		.filter(elt -> elt>3) // filtre les elements < 3
//		.forEach(elt-> System.out.println(elt)); // affiche le resultat
//
//		//HASHSET
//		System.out.println("---HashSet---");
//		HashSet hs = new HashSet(); //pas ordonn�
//		hs.add("bonjour");
//		hs.add(69);
//		hs.add('c');
//		hs.add('d');
//		Iterator it = hs.iterator();
//		while(it.hasNext())	System.out.println(it.next());
//
//		//TREESET
//		System.out.println("---TreeSet---");
//		TreeSet ts = new TreeSet();
//		ts.add(5);
//		ts.add(8);
//		ts.add(2);
//		Iterator it2 = ts.iterator();
//		while(it2.hasNext()) System.out.println(it2.next());
	
//		//HASHTABLE
//		System.out.println("---Hashtable---");
//		Hashtable ht = new Hashtable();
//		ht.put(1, "Java");
//		ht.put(2, "PHP");
//		ht.put(10, "C++");
//		ht.put(17, "Pascal");
//		Enumeration e = ht.elements();
//		while(e.hasMoreElements()) System.out.println(e.nextElement());
//		
//		Set <Integer> keys = ht.keySet();
//		for (Integer key : keys) {
//			if ("C++".equals(ht.get(key))) System.out.println(key);
//		}
//		
//		//HASHMAP
//		System.out.println("---Hashmap---");
//		HashMap <Integer,String> hm = new HashMap <Integer,String>();
//		hm.put(1, "Java");
//		hm.put(2, "PHP");
//		hm.put(10, "C++");
//		hm.put(17, "csharp");
//		Set s = hm.entrySet();
//		Iterator it = s.iterator();
//		while(it.hasNext()) System.out.println(it.next());
//		
//		for (Entry<Integer, String> entry : hm.entrySet()) {
//			if (entry.getValue().equals("Java")) System.out.println(entry.getKey());
//		}
		

//		//EXERCICE 1
//		List list = Arrays.asList(2,5,"Bonjour",true,'c',"3","b",false,10);
//		String type="";
//		
//		HashMap<String, Integer> listeTypes = new HashMap<>();
//		for (Object object : list) {
//			type = object.getClass().getSimpleName();
//			listeTypes.computeIfPresent(type, (k, v) -> v + 1);
//			listeTypes.putIfAbsent(type, 1);
//		}
//		
//		Set s2 = listeTypes.entrySet();
//		Iterator it2 = s2.iterator();
//		while(it2.hasNext()) System.out.println(it2.next());
		
		
		//EXERCICE 2
		Map<Integer, String> stringInt = new HashMap<Integer, String>();
		stringInt.put(7, "Paris");
		stringInt.put(5, "Rome");
		stringInt.put(1, "Manchester");
		stringInt.put(3, "Barcelone");
		
		String entree = "Manchester ou Barcelone mais jamais Paris ni Rome";
		StringTokenizer st = new StringTokenizer(entree, " ");
		
		String subst = "";
		while (st.hasMoreTokens()) {
			subst = st.nextToken();
			//if (stringInt.containsValue(subst)) {
				for (Integer key : stringInt.keySet()) {
					if (subst.equals(stringInt.get(key))) {
						subst = subst.replace(subst,key.toString());
					}
				}
		//	}
			System.out.print(subst+ " ");
		}	
	}	
}

