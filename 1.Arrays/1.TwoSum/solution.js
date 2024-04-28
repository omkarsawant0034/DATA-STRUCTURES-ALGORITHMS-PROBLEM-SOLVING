// Link : https://leetcode.com/problems/two-sum/description/

function TwoSum(nums,target){

    let n = nums.length;
    for(let i = 0; i < n-1; i++){
        for(let j = i+1; j < n; j++){
            if(nums[i]+nums[j] == target){
                return [i,j];
            }
        }
    }

    return null;
}

let nums = [2,7,11,15];
let target = 9;
let ans = console.log(TwoSum(nums,target));
