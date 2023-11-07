function compose() {
    // Convert the arguments object to an array
    var functions = Array.from(arguments);
  
    if (functions.length === 0) {
      // If no functions are provided, return the identity function
      return function (x) {
        return x;
      };
    }
  
    // Use the reduce method to create a single composed function
    return functions.reduce(function (f, g) {
      return function (x) {
        return f(g(x));
      };
    });
  }
  
  // Example 1: Compose three functions
  var example1 = compose(
    function (x) {
      return x + 1;
    },
    function (x) {
      return x * x;
    },
    function (x) {
      return 2 * x;
    }
  );
  console.log(example1(4)); // Output: 65
  
  // Example 2: Compose the same function multiple times
  var example2 = compose(
    function (x) {
      return 10 * x;
    },
    function (x) {
      return 10 * x;
    },
    function (x) {
      return 10 * x;
    }
  );
  console.log(example2(1)); // Output: 1000
  
  // Example 3: Compose no functions (identity function)
  var example3 = compose();
  console.log(example3(42)); // Output: 42
  