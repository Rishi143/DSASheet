Array 

Easy 

**Problem 1** :- 1 Two Sum 

Link: https://leetcode.com/problems/two-sum/ 

Statement : 

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Solution 1: 

Sort the array and declare two pointers on front and back apply two pointer algorithm 

TC: O(nLogn) SC: O(1) 

considering TC is O(nlogn) because sorting best case is O(nlogn) and traversing using two pointers O(n) so O(nlogn) + O(n) = O(nlogn) SC is O(1) if we don’t use any extra space for sorting the array but if we use merge sort or quick sort we may end up using O(n) auxillary space because of recursion

Solution 2:

Declare a hashmap and traverse each element and check if target – currentelement is present in the hashmap or not

If present store their indexes in an result array/set/list and break there

Else add the element as key and index as value in the hashmap 

Code: https://github.com/Rishi143/DSASheet/blob/master/src/main/java/com/dsa/overall/_1TwoSum.java

TC:O(N) SC: O(N) 

Considering hashmap has no collisions so time complexity would be O(1*n) which is O(n) and space complexity would be O(n) because we may end up storing all elements in the hashmap

TC is time complexity and SC is space complexity

**Problem 2** :- 121 Best time to buy and sell stock

Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

Statement: 

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Solution:

Declare minUntilNow as first element of the array and maxProfit as 0

Traverse everyelement and first check if currProfit which is currentElement – minUntilNow is greater than maxProfit then assign maxProfit as currProfit

Then check if current element is smaller than minUntilNow then assign minUntilNow as current element

After all the elements are traversed then return the maxProfit 

Code: https://github.com/Rishi143/DSASheet/blob/master/src/main/java/com/dsa/overall/_2BestTimeToBuyAndSellStock.java

TC: O(n) and SC:O(1)

**Problem 3**: 88 Merge Sorted Array

Link: https://leetcode.com/problems/merge-sorted-array/

Statement:

You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 

To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 
Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3

Output: [1,2,2,3,5,6]

Explanation: The arrays we are merging are [1,2,3] and [2,5,6].

The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

Solution:

Declare two pointers m and n such that m is the last non zero index in the array 1 and n is the last element in the array2 and end as last element of array1

Run a while loop m >= 0 && n >= 0 such that if array1[m] > array2[n] then array1[end] is assigned as array1[m] and m,end are decremented Or else array1[end] is assigned as array2[n] and n,end are decremented

In the end if any of the array2 elements left then array1[end] = array2[n] and end,n are decremented this is done because it fills the remaining elements

Code: https://github.com/Rishi143/DSASheet/blob/master/src/main/java/com/dsa/overall/_3MergeSortedArray.java

TC: O(len1) because we traverse every element of both the arrays so O(len1+len2) becomes O(len1) because len1 is larger and SC: O(1)

**Problem 4**: 283 Move Zeroes

Link: https://leetcode.com/problems/move-zeroes/

Statement:

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]

Output: [1,3,12,0,0]

Solution:

Declare a pointer ind as 0

Traverse the array and if you found non zero element assign array[ind] = array[current index in loop] and then ind is incremented
After the end of the loop run a while loop until the ind is less than length of array

Set array[ind] as 0

Code: https://github.com/Rishi143/DSASheet/blob/master/src/main/java/com/dsa/overall/_4MoveZeroes.java

TC: O(n) because we traverse the array once for every element and SC: O(1)

Problem 5: 122 Best Time to Buy and Sell Stock II

Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

Statement: 

You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

Find and return the maximum profit you can achieve.
 
Example 1:

Input: prices = [7,1,5,3,6,4]

Output: 7

Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.

Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.

Total profit is 4 + 3 = 7.

Solution 1:

If current element lesser than previous element we can add the difference of those both elements to the total profit

Solution 2:


