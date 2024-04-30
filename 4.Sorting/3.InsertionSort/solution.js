
function insertionSort(nums){

    for(let i = 1; i < nums.length; i++){
        let element = nums[i];
        let j = 0;
        for(j = i-1; j >= 0; j--){
            if(nums[j] > element){
                nums[j+1] = nums[j];
            }
            else{
                break; // arr[j] <= element // Not neccessary
            }
        }
        nums[j+1] = element;
    }
}

const arr = [5,4,3,2,1];
insertionSort(arr);
console.log(arr);
