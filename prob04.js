function createCounter(init) {
    let currentValue = init;
  
    return {
      increment: function() {
        currentValue += 1;
        return currentValue;
      },
      decrement: function() {
        currentValue -= 1;
        return currentValue;
      },
      reset: function() {
        currentValue = init;
        return currentValue;
      }
    };
  }
  const counter1 = createCounter(5);
  const output1 = [];
  for (const call of ["increment", "reset", "decrement"]) {
    output1.push(counter1[call]());
  }
  console.log(output1);