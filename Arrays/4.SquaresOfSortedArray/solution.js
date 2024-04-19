//https://leetcode.com/problems/squares-of-a-sorted-array/

var sortedSquares = function(nums){

    for(let i = 0; i < nums.length; i++){
        nums[i] = (nums[i]**2);
    }

    nums.sort((a,b)=>(a-b));
    return nums;
}

nums = [-4,-1,0,3,10];
console.log(sortedSquares(nums));