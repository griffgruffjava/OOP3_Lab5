import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JOptionPane;
/** demonstrates Set and SortedSet via a list of names
 */
public class NameSet {
  public static void main (String args[]){
  	Set<String> names = new HashSet<String>();
  	names.add("Bernadine");
  	names.add("Elizabeth");
  	names.add("Gene");
  	names.add("Elizabeth");
  	names.add("Clara");
  	System.out.println(names);
  	// transfer all the names to a (sorted) TreeSet
  	TreeSet<String> sortedNames = new TreeSet<String>(names);
  	System.out.println(sortedNames);
  	System.out.println("First person is " +sortedNames.first());
  	sortedNames.add("gene");
  	sortedNames.add("Dave");
  	sortedNames.add("CIARAN");
  	sortedNames.add("CIaa");
  	sortedNames.add("Zed");
  	sortedNames.add("Alice");
  	sortedNames.add("zed");
  	System.out.println(sortedNames);
  	System.out.println("First person is " +sortedNames.first());
  	
  	if(names.contains("ciaran"))
  		System.out.println("TEST 1");
  	else if(sortedNames.contains("Ciaran"))
  		System.out.println("TEST 2");
  	else if(sortedNames.contains("CIARAN"))
  		System.out.println("TEST 3");
  	
  	String searchForName;
  	
  	do
  	{
  		searchForName=JOptionPane.showInputDialog("Enter a name");
  		if(sortedNames.contains(searchForName))
  			System.out.println("contains name");
  	
  	}while(!sortedNames.contains(searchForName));
  	
  	JOptionPane.showMessageDialog(null,searchForName+" is contatined in the set.");
  	
  }
}