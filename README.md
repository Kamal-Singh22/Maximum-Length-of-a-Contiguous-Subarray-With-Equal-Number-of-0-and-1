# Maximum-Length-of-a-Contiguous-Subarray-With-Equal-Number-of-0-and-1
Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
Explanation:
We treat 0 as -1 and keep a running sum.

If the same sum appears again at a later index, it means the number of 1s and 0s between the two indexes is equal.

We store the first occurrence of each sum in a HashMap.

Whenever we see the same sum again, we calculate the length of the subarray between the current index and the stored index.
