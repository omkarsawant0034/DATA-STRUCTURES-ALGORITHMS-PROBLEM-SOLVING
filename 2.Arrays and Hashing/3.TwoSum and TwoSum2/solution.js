// https://leetcode.com/problems/two-sum/

//With Hashing
var twoSum = function(nums, target) {
    let mp = {};

    for (let i = 0; i < nums.length; i++) {
        if (mp[nums[i]] !== undefined) {
            mp[nums[i]].push(i);
        } else {
            mp[nums[i]] = [i];
        }
    }

    for (let i = 0; i < nums.length; i++) {
        let b = nums[i];
        let a = target - b;

        if (mp[a] !== undefined) {
            if (a !== b || mp[a].length > 1) {
                return [mp[a][0], mp[b][0]];
            }
        }
    }
}

let nums = [2, 7, 11, 15]; 
let target = 9;
console.log(twoSum(nums, target)); // Output: [0, 1]



/*
var twoSum = function(nums, target) {
    const numMap = {};
    
    for (let i = 0; i < nums.length; i++) {
        const complement = target - nums[i];
        if (complement in numMap) {
            return [numMap[complement], i];
        }
        numMap[nums[i]] = i;
    }
};

let nums = [2,7,11,15]; 
let target = 9;
console.log(twoSum(nums,target));
*/