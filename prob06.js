var filter = function(array, fn) {
    const newArray=[];
    for(let i=0;i<array.length;i++){
        if(fn(array[i],i)){
            newArray.push(array[i])
        }
    }
    return newArray;
};

const array = [0,10,20,30];
const greater = (n)=> n>10;
const filtered = filter(array,greater);
console.log(filtered);

const firstIndex=(n,i)=> i === 0;
const filtered1 = filter(array,firstIndex);
console.log(filtered1);

const plusone = (n)=> n+1;
const filtered2 = filter(array,plusone);
console.log(filtered2)