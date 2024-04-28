// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

var twoSum = function(numbers, target) {
    let i = 0;
    let j = numbers.length-1;

  while(i < j){

    if(numbers[i] + numbers[j] == target){
        return [i+1,j+1];
    }
    else if(numbers[i] + numbers[j] > target){
        j--;
    }
    else{
        i++;
    }
  }  
};

let numbers = [2,7,11,15];
let target = 9;

console.log(twoSum(numbers,target));
