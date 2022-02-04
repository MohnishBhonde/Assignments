import java.util.*;

import java.util.ArrayList;
import java.util.List;
public class JUnitAssignment{
public ArrayList<Integer> maxArrValue(){
	 List<Integer>arr=new ArrayList<Integer>();
     Collections.addAll(arr,56,34,7,3,54,3,34,34,53);
     int max=Collections.max(arr);
     int min=Collections.min(arr);
     ArrayList<Integer>NewArr=new ArrayList<Integer>();
     NewArr.add(0,min);
     NewArr.add(1,max);
	 return NewArr;
}
}
