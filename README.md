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
		int nums[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		int n = nums.length;
		MoveZeroesToEnd(nums, n);
		for (int i=0; i<n; i++)
			System.out.print(nums[i]+" ");
	}
}

