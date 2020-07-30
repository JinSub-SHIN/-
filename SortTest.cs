using System;

namespace SortTest
{
    class SortTest
    {
        public class Solution
        {
            public int[] solution(int[] arr)
            {
                int[] originalArray = new int[arr.Length];
                for (int i = 0; i < arr.Length; i++)
                {
                    originalArray[i] = arr[i];
                }
                Array.Sort(arr);
                int find = 0;
                if (arr.Length == 1)
                {
                    return new int[] { -1 };
                }
                else
                {
                    int[] answer = new int[arr.Length - 1];
                    int check = arr[0];
                    for (int i = 0; i < arr.Length; i++)
                    {
                        if (originalArray[i] == check)
                        {
                            find = 1;
                            continue;
                        }
                        if (find == 0)
                        {
                            answer[i] = originalArray[i];
                        }
                        else
                        {
                            answer[i - 1] = originalArray[i];
                        }
                    }
                    return answer;
                }
            }
        }
    }
}
