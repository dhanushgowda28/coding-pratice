import java.util.*;

public class Pasclas {

	public static void main(String[] args) {
		System.out.println(getRow(1));
	}

	public static List<Integer> getRow(int rowIndex) {
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> first = Arrays.asList(1);
		list.add(first);
		if (rowIndex < 1)
			return first;
		for (int i = 0; i <=rowIndex; i++) {
			List<Integer> temp = new ArrayList<>();
			List<Integer> pre = list.get(0);
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == pre.size()) {
					temp.add(1);
				} else {
					temp.add(pre.get(j) + pre.get(j - 1));
				}
			}
			list.remove(pre);
			list.add(temp);
		}
		return list.get(0);
	}

}
