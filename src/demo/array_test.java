package demo;

public class array_test {
	public static void main(String[] args) {
		int[] nums = {2,3,1,0,2,5,3,0};
		
		for(int i=0; i<nums.length; i++) {
			while(nums[i] != i) {
				if(nums[i] == nums[nums[i]]) {
						System.out.println("数组中重复的数字是："+nums[i]);
						break;
				}
				else {
					int temp = nums[i];
					nums[i] = nums[temp];
					nums[temp] = temp;
				}
				
			}
		}
		
	}	
}
