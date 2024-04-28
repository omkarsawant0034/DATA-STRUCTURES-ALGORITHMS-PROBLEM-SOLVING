
function selectionSort(arr){

    let result = [];
    let n = arr.length;

    for(let i = 0; i < n-1; i++){
       let min_idx = minElement(arr,i);

       let temp = arr[i];
       arr[i] = arr[min_idx];
       arr[min_idx] = temp;
    }
}

function minElement(arr,i){
    let min_idx_ele = i;
    for(let j = i+1; j < arr.length; j++){
        if(arr[j] < arr[min_idx_ele]){
            min_idx_ele = j;
        }
    }
    return min_idx_ele;
}

const arr = [2,14,3,1,5];
selectionSort(arr);
console.log(arr)