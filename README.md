# Chapter-2-Lab-10
**Lab Goal :** This lab was designed to teach you more about a linked list and how to use a linked list to create a data structure.

**Lab Description :** Complete the ThingCount class and use Main.java to test your class to ensure that it works correctly. You will use ThingCount to store objects and letter counts. 

**ThingCount – stores an Object and the Object’s count**

class ThingCount implements Comparable

{

private int count;

private Object thing;

public ThingCount(){

}

public ThingCount(Object thang, int cnt){

}

public int getCount(){

return 0;

}

public void setThing(Object obj){

}

public void setCount(int cnt){

}

public Object getThing(){

return null;

}

public boolean equals(Object obj){

ThingCount other = (ThingCount)obj;

return false;

}

public int compareTo(Object obj){

ThingCount other = (ThingCount)obj;

return -1; 

}

public String toString(){

return ""+ getThing() + " - " + getCount();

}

}

**Sample Data (ThingTester.java) :** 

See the main of ThingTester.java.

**Sample Output :**

null - 0

A - 5

hello - 7

7

54.12 - 22

false

true
