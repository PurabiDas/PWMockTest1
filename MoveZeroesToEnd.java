import java.io.*;

class MoveZeroes
{
	static void MoveZeroesToEnd(int nums[], int n)
	{
		int count = 0;
		for (int i = 0; i < n; i++)
			if (nums[i] != 0)
				nums[count++] = nums[i]; 
		while (count < n)
			nums[count++] = 0;
	}
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
    int[] nums = new int[input.nextInt()];
    for(int i = 0; i < array.length; i++)
            nums[i] = input.nextInt();
		int n = nums.length;
		MoveZeroesToEnd(nums, n);
		for (int i=0; i<n; i++)
			System.out.print(nums[i]+" ");
	}
}
