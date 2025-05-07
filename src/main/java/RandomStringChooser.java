
import java.util.*;
public class RandomStringChooser
{
  private ArrayList<String> nums;
 
   public RandomStringChooser(String[] array){
     nums = new ArrayList<String>();
     for(String temp: array){
     nums.add(temp);
     }
   }
 public String getNext(){
 if(nums.size() ==0) return "NONE";
 int i = (int)(Math.random()*nums.size());
 return nums.remove(i);
 }
}
