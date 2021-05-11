package day31_ArrayList;

import java.util.ArrayList;

public class removeInteger {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<>();

		System.out.println(nums.size());
		System.out.println(nums.isEmpty());
		System.out.println(nums.size() == 0);

		nums.add(4);
		nums.add(1);
		nums.add(10);
		nums.add(17);
		nums.add(50);

		System.out.println(nums.toString()); //only (nums) is also ok!

		nums.remove(4); // removes the specified INDEX NUMBER from the list

		System.out.println(nums);
		
		System.out.println("--------------------");

		Integer n1 = new Integer(4); // converting primitive to object
		System.out.println(n1);
		Integer n2 = Integer.valueOf(4);

		nums.remove(n1);
		System.out.println(nums);

		nums.remove(new Integer(10)); //removes the specified ELEMENT from the list
		System.out.println(nums);

	}

}
