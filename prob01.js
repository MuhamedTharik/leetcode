function createHelloWorld() {
    return function() {
      return "Hello World";
    };
  }
  

  const f = createHelloWorld();
  console.log(f()); 
  

console.log(f({})); 
console.log(f(null));
console.log(f(42)); 
console.log(f("anything", 123, true)); 
  