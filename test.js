const arr = ["35", 52, 8, 8, 26, -300, 800, 0, "35", 35, "35"];

const arr1 = ["35", 52, 8, 8, 26, -300, 800, 0, "35", 35, "35", 8, 8,];


const arr2 : (string | number) [];

const map : Map<(string | number), number>

const map = arr.reduce((a, b) => {
    if(a.has(b)) {
        const count = a.get(b);
        count++;
        a.set(b, count);
    } else {
        a.set(b, 1);
    }
    return a;
}, new Map())


// for(let i = 0; i < arr.length; i++) {
//     const element = arr[i];
//     if(resultMap.has(element)) {
//         let count = resultMap.get(element);
//         count = count + 1;
//         resultMap.set(element, count);
//     } else {
//         resultMap.set(element, 1);
//     }
// }

console.log(resultMap);

// expected result:
// member: 35, count: 3


const a = { x: 1, y: 2 } as const;
type A = typeof a;

interface A {
    x: readonly : number;
    y: readonly : number;
}

Partial
REquired 


type A<T = string> = {
	typeAOnly: string;
        fieldOne: T;
        fieldTwo: number;
};

type B = Omit(<typeAOnly>)

function test<T>(): T {

}