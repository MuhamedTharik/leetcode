function map(array, fn) {
    const newArray = [];
    for (let i = 0; i < array.length; i++) {
      newArray.push(fn(array[i], i));
    }
    return newArray;
  }
  const arr = [1, 2, 3];
const plusOne = (n) => n + 1;
const newArray = map(arr, plusOne);
console.log(newArray); 