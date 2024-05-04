var merge = function(nums1, m, nums2, n) {
    let result = [];
    let i = 0;
    let j = 0;
    let k = 0;

    while (i < m && j < n) {
        if (nums1[i] < nums2[j]) {
            result[k] = nums1[i];
            i++;
        } else {
            result[k] = nums2[j];
            j++;
        }
        k++;
    }

    while (i < m) {
        result[k] = nums1[i];
        i++;
        k++;
    }

    while (j < n) {
        result[k] = nums2[j];
        j++;
        k++;
    }

    for (let p = 0; p < m + n; p++) {
        nums1[p] = result[p];
    }
};


let nums1 = [1,2,3,0,0,0];
const m = 3; 
let nums2 = [2,5,6];
const n = 3;

merge(nums1,m,nums2,3);
console.log(nums1);