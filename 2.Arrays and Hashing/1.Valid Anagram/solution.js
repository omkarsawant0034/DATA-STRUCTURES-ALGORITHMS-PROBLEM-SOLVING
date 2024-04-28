//https://leetcode.com/problems/valid-anagram/

// BRUTE FORCE

var validAnagram = function(s,t){
    
    if(s.length != t.length){
        return false;
    }

    s = s.split('');
    t = t.split('');

    s.sort();
    t.sort();
    console.log(s+"  "+t);

    s = s.join(""); 
    t = t.join("");
    console.log(s+"  "+t); 

    if(s == t){
        return true;
    }

    return false;
}

let s = "anagram"; 
let t = "nagaram";

console.log(validAnagram(s,t));
