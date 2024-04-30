
function bubbleSort(arr){
    let isSwapped = false;
    for(let i = 0; i < arr.length; i++){
        for(let j = 0; j < arr.length-i-1; j++){
            if(arr[j] > arr[j+1]){
                let temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                isSwapped = true;
            }
        }
    }
    if(isSwapped == true) return;
}

//const arr = [4,1,3,2,9];
const arr = [1,2,3,4,9];
bubbleSort(arr);
console.log(arr);