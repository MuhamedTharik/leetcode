var reduce = function(array,fn,init){
    let val =init;
    for(let i=0;i<array.length;i++){
        val = fn(val,array[i],i);
    }
    return val;
}


const nums = [1, 2, 3, 4];
const sum = (accum, curr) => accum + curr;
var init = 0;
var reducedArray = reduce(nums, sum, init);
console.log(reducedArray); 

const sumOfSquares = (accum, curr) => accum + curr * curr;
var init = 100;
var reducedArray = reduce(nums, sumOfSquares, init);
console.log(reducedArray);


const emptyArray = [];
var initValue = 25;
var reducedArray = reduce(emptyArray, sum, initValue);
console.log(reducedArray); 

