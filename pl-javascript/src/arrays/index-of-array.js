let intarray = [10, 23, 55, 67];
let midIndex = Math.floor((intarray.length - 1) / 2);
console.log(midIndex);

let intarray2 = [10, 23, 55, 66, 77];
let midIndex2 = Math.floor((intarray2.length - 1) / 2);
console.log(midIndex2);

let intarray3 = [10, 23, 55, 66, 77, 88];
let midIndex3 = Math.floor((intarray3.length - 1) / 2);
console.log(midIndex3);


function search(arr, val) {
    let start = 0;
    let end = intarray3.length - 1;
    while (start <= end) {
        let mid = Math.floor((start + end) / 2);
        if (val === arr[mid]) {
            return mid;
        } else if (val > arr[mid]) {
            start = mid + 1;
        } else {
            start = mid - 1;
        }
    }
}

search(intarray3, 77);