//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class ThingCount implements Comparable
{
 private int count;
 private Object thing;
 
 public ThingCount()
 {
 count = 0;
   thing = null;
 }
 
 public ThingCount(Object obj, int cnt)
 {
  count = cnt;
   thing = obj;
 }
 
 public int getCount()
 {
  return count;
 }
 
 public void setCount(int cnt)
 {
 count = cnt;
 }

 public void setThing(Object obj)
 {
 thing = obj;
 } 
 
 public Object getThing()
 {
  return thing;
 }
 
 public boolean equals(ThingCount obj)
 {
  if(this.getThing().equals(obj.getThing()) && this.getCount()==obj.getCount())
    return true;
  return false;
 }
 
 public int compareTo(Object obj)
 {
  return -1;  
 }
 
 public String toString()
 {
  return ""+ getThing() + " - " + getCount();
 }
}
