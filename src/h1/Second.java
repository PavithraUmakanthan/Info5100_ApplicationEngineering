package h1;

import java.util.Arrays;

public class Second {

    public static void main(String args[]) {

        int nums[] = {-4, -2, -1, 0};

        int result[] = new int[nums.length];

        int num = 0;

        for (int i = 0; i < nums.length; i++) {

            num = nums[i] * nums[i];

            result[i] = num;

        }


        int temp;
        for (int i = 0; i < result.length-1; i++)
        {
            for (int j = i+1; j < result.length; j++)
            {
                if (result[i] > result[j])
                {
                    temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(result));

            }


}
