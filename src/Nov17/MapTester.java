package Nov17;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

class HashMap<K,V>
{
private HashSet set;

public HashMap()
{
}

public void put(K key, V value)
{
}

public V get(K key)
{
}

public V remove(K key)
{
}

public Set keySet()
{
}

public int size()
{
return set.size();
}
}


class Pair<T,S>
{
private T first;
private S second;

public Pair(T firstElement, S secondElement)
{
first = firstElement;
second = secondElement;
}

public T getFirst()
{
return first;
}

public S getSecond()
{
return second;
}

public boolean equals(Object otherObject)
{
}
public int hashCode()
{
}
}


/**
This program tests a map that maps names to colors.
*/
public class MapTester
{
public static void main(String[] args)
{   
HashMap favoriteColors =
new HashMap();
favoriteColors.put("Juliet", Color.PINK);
favoriteColors.put("Romeo", Color.GREEN);
favoriteColors.put("Adam", Color.BLUE);
favoriteColors.put("Eve", Color.PINK);
favoriteColors.put("Romeo", Color.WHITE);
favoriteColors.remove("Juliet");
System.out.println(favoriteColors.get("Romeo"));
System.out.println("Expected: java.awt.Color[r=255,g=255,b=255]");
System.out.println(favoriteColors.get("Juliet"));
System.out.println("Expected: null");
System.out.println(favoriteColors.size());
System.out.println("Expected: 3");
Set keys = favoriteColors.keySet();
System.out.println(keys.size());
System.out.println("Expected: 3");
}
}


