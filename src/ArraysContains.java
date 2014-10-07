import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArraysContains {
	public static void main(String[] args) {
		//Normal way of finding Array Contains a Value
		String[] tarArray = {"A", "B", "C", "D", "E"};
		String findStr = "CS";
		boolean containsFlg = findValueInArray(tarArray, findStr);
		System.out.println(containsFlg);
		
		boolean containsFlg1 = Arrays.asList(tarArray).contains(findStr);
		System.out.println(containsFlg1);		
		
		List<String> list = Arrays.asList(tarArray);
		//list.add("F");
		
		@SuppressWarnings("rawtypes")
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(tarArray));
		arrayList.add("F");
	}

	private static boolean findValueInArray(String[] tarArray, String findStr) {
		for(String str : tarArray){		
			if(str != null && str.equals(findStr)){
				return true;
			}
		}
		return false;
	}
}
