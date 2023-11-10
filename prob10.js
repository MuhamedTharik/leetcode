var once = function (fn) {
    let calls = false;
    
    return function (...args) {
      if (calls === false) {
        calls = true;
        return fn(...args);
      }
      else
        return undefined;
    }
  };