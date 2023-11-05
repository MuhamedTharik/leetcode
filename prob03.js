function expect(val) {
    return {
      toBe: function(expected) {
        if (val === expected) {
          return {"value": true};
        } else {
          throw new Error("Not Equal");
        }
      },
      notToBe: function(unexpected) {
        if (val !== unexpected) {
          return {"value": true};
        } else {
          throw new Error("Equal");
        }
      }
    };
  }
  
 
  try {
    const result1 = expect(5).toBe(5);
    console.log(result1); // Output: {"value": true}
  } catch (error) {
    console.log({"error": error.message});
  }
  
  try {
    const result2 = expect(5).toBe(7);
    console.log(result2);
  } catch (error) {
    console.log({"error": error.message}); // Output: {"error": "Not Equal"}
  }
    