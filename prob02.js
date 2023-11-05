var n = 10;

var createCounter = function(n){ 
    return function(){
        return n++;
    }
}

const counter = createCounter(n);
console.log(counter());
console.log(counter());
console.log(counter());