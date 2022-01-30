// ----------------------------
// 배열
// ----------------------------
// [] : 배열을 정의
const arr1 = [];               // 빈배열
const arr2 = [1,2,3];          // 배열 초기화
const arr3 = new Array(4,5,6); // 배열초기화
// 인수가 1개의 수치일 경우에는 지정개수의 배열이 작성됨
const arr4 = new Array(10);    // 10개의 수를 넣을수 있는 배열
// ----------------------------
console.log(arr3.length); // 3
// ----------------------------
// 배열의 각요소에 대해 처리 (1)
// 베열.forEach(콜백함수)
// 인수로 건넨 콜백함수를 써서 요소를 순서대로 처리
// 콜백함수 (* : 생략가능)
// ([요소*], [인덱스*], [元배열*]) => {} 
const arr5 = ['딸기','귤','사과'];
arr5.forEach((value, index) => {
    console.log(index, value);
});
// 0 딸기
// 1 귤
// 2 사과
// -----------
[1,2,3,4,5,6,7]
    .filter( (value) => value % 2 === 0)
    .forEach((value) => {
        console.log(value); // 2 4 6
    });  
// ----------------------------
// 배열의 각요소에 대해 처리 (2)
// for(const 요소 of 배열) {}
for(const val of arr5){
    console.log(val); // 딸기 , 귤 , 사과
}
// ----------------------------
// 배열의 각요소에 대해 처리 (3)
for(let i = 0; i < arr5.length; i++){
    console.log(arr5[i]); // 딸기 , 귤 , 사과
}
// ----------------------------
// 배열에 요소 추가
// 배열.unshift(요소1, 요소2) : 선두에 요소추가
// 배열.push(요소1, 요소2)    : 말미에 요소추가
// ----------------------------
// 배열.shift() : 선두의 요소를 제거
// 배열.pop()   : 마지막 요소를 제거
const arr7 = ['딸기','귤','사과'];
const itemShift = arr7.shift();
console.log(itemShift);      // 딸기
console.log(arr7);           // 귤, 사과
// ------------
const itemPop = arr7.pop();
console.log(itemPop);        // 사과
console.log(arr7);           // 귤
// ----------------------------
// 배열의 요소 일부는 치환
// 배열.splice(추가위치, 추출할 개수, 요소1, 요소2)
const arr8 = ['사과','귤'];
const arr9 = ['사과','귤'];
// ------------
arr8.splice(1, 0, '바나나');        // 1의 위치에 0개를 지우고 바나나를 추가
arr9.splice(1, 1, '바나나','딸기'); // 1의 위치에 1개를 지우고 추가
// ------------
console.log(arr8); // [ "사과", "바나나", "귤" ]
console.log(arr9); // [ "사과", "바나나", "딸기" ]
// ----------------------------
// 배열연결
// 배열1.concat(배열2, 배열3)
// [...배열1, ...배열2, ...배열3]
const a1 = [1,2,3];
const a2 = ['a','b','c'];
const a3 = ['ㄱ','ㄴ'];
const a4 = a1.concat(a2,a3);
const a5 = [...a1, ...a2];
console.log(a4); // [ 1, 2, 3, "a", "b", "c", "ㄱ", "ㄴ" ]
console.log(a5); // [ 1, 2, 3, "a", "b", "c" ]
// ----------------------------
// 배열요소를 문자열로 결합
const a6 = a2.join();
const a7 = a2.join('');
console.log(a6); // a,b,c
console.log(a7); // abc
// ----------------------------
// 요소 검색
// 배열.indexOf(검색하고 싶은 요소, [검색시작위치])
// 배열.lastIndexOf(검색하고 싶은 요소, [검색시작위치])
// 배열.includes(검색하고 싶은 요소, [검색시작위치])
const b1 = [0,2,4,6,4,2,0];
console.log(b1.indexOf(4));     // 2
console.log(b1.lastIndexOf(4)); // 4
console.log(b1.includes(3));    // false
// ----------------------------
// 배열에서 조건 검색
// 배열.find(콜백함수)
// : 콜백함수에 처음 일치하는 요소
// 배열.findIndex(테스트함수)
// : 콜백함수에 처음 일치하는 요소의 인덱스
// 콜백함수
// :  ([요소],[인덱스],[元배열]) => 진리값
const c1 = ['스즈키','다나카','다카하시','고토'];
const targetUser1 = c1.find((elem) => elem == '다나카');
// 위와 동일
const targetUser2 = c1.find((elem) => { return elem == '다나카'; });
const targetUser3 = c1.findIndex((elem) => { return elem == '다나카'; });
console.log(targetUser1); // 다나카
console.log(targetUser2); // 다나카
console.log(targetUser3); // 1
// ----------------------------
// 배열의 역순
// 배열.reverse()
const c2 = [1,3,5];
console.log(c2); // [ 1, 3, 5 ]
c2.reverse();
console.log(c2); // [ 5, 3, 1 ]
// ----------------------------
// 배열을 정렬
// 배열.sort([비교함수])
// : 비교함수의 리턴값의 대소에 따라 정렬
//   0미만   : a, b의 순으로 정렬 
//   0       : a, b순서을 안바꿈
//   0보다큼 : b, a의 순으로 바꿈
// : 비교함수를 생략하면 문자열로 유니코드순으로 정렬
const c3 = [1,2,3,3,4,5];
c3.sort((a,b) => {
    // a가 b보다 작으면, a,b순으로 정렬
    if(a <  b) return  1; 
    if(a == b) return  0;
    if(a >  b) return -1;
});
console.log(c3); // [ 5, 4, 3, 3, 2, 1 ]
// ----------------------------
// 문자열 대소무시하고 비교 정렬
const c4 = ['grape','Orange','apple'];
c4.sort();
console.log(c4); // [ "Orange", "apple", "grape" ]
// ------------
const c5 = ['grape','Orange','apple'];
c5.sort((a,b) => a.localeCompare(b));
console.log(c5); // [ "apple", "grape", "Orange" ]
// ----------------------------
// 배열에서 새 배열 만들기
// 배열.map(콜백함수)
// : 콜백함수에 따라 새로운 배열을 작성
// : ([요소],[인덱스],[元배열]) => 밴경후의 요소
//   요소를 받아, 변경후의 요소를 반환
// map()
// : 어떤 배열을 근거로 새로운 배열을 만듬
//   요소 하나씩하나씩 처리
//   forEach()와 비슷한데 
//   map()는 실행후의 결과를 배열로 반환하는 점이 다름
const idList1  = [4, 10, 20];
const newList1 = idList1.map((value) => `userid_${value}`);
console.log(newList1); // [ "userid_4", "userid_10", "userid_20" ]
// ------------
const idList2  = [3, 8, 12];
const newList2 = idList1.map((value, index) => `userid_${index + 1}_${value}`);
console.log(newList2); // [ "userid_1_4", "userid_2_10", "userid_3_20" ]
// ------------
const idList3 = [
    { id:  2, name:'스즈키'  },
    { id: 10, name:'다나카'  },
    { id:  4, name:'사토'    },
    { id: 29, name:'다카하시'},
    { id:101, name:'오기하라'}
];
const newList3 = idList3.map((value) => value.id);
// 위와 같음
const newList4 = idList3.map((value) => { return value.id });
console.log(newList3); // [ 2, 10, 4, 29, 101 ]
console.log(newList4); // [ 2, 10, 4, 29, 101 ]
// ----------------------------
// 한 배열에서 조건을 만족하는 배열을 작성
// 배열.filter(콜백함수)
// 콜백함수에 일치하는 배열을 생성
// ([요소],[인덱스],[元배열]) => 진리값
const d1 = [10,20,30,40];
const d2 = d1.filter((value) => value >= 30);
const d3 = d1.filter((value) => { return value >= 30 });
const d4 = d1.filter(function (value) { return value >= 30; })
console.log(d2); // [ 30, 40 ]
console.log(d3); // [ 30, 40 ]
console.log(d4); // [ 30, 40 ]
// map과 filter의 
// : 공통점은 기존배열은 건드리지 않으면서 요소들을 순회한 후 
//   새로운 배열을 리턴한다는 것이고, 
// : 차이점은 map은 콜백함수가 적용된 새 요소, 
//   filter는 조건문을 만족한 요소들을 반환한다는 점입니다.
// ----------------------------
// 각 요소들로 부터 단일 값을 만듬
// 배열.reduce(콜백함수, [초기값])
// : 각 요소의 왼쪽에서 오른쪽으로 처리해서 단일값을 만듬
// 배열.reduceRight(콜백함수, [초기값])
// : 각 요소의 오른쪽에서 왼쪽으로 처리해서 단일값을 만듬
// 콜백함수
// ((앞요소, 현재요소, 인덱스, 元배열)) => { /* 처리 */}
const e1   = [100, 500, 900];
const sum1 = e1.reduce((previous, current) => { return previous + current; });
// 위와 같음
const sum2 = e1.reduce((a, b) => a + b );
let   sum3 = 0;
for(const price of e1){
    sum3 += price;
}
console.log(sum1); // 1500
console.log(sum2); // 1500
console.log(sum3); // 1500
// 2차 배열을 1차 배열로 만듬
const e2 = [['바나나','사과','딸기'],['귤','포도']];
const e3 = e2.reduce((a,b) => { return a.concat(b); });
const e4 = e2.reduceRight((a,b) => { return a.concat(b); });
console.log(e3); // [ "바나나", "사과", "딸기", "귤", "포도" ]
console.log(e4); // [ "귤", "포도", "바나나", "사과", "딸기" ]
// ----------------------------
// 배열과 비슷한 오브젝트를 배열로 변환
// [...변환대상]
// "..." (スプレッド연산자)
// : ArrayLike오브젝트를 배열로 변환
// ArrayLike오브젝트
// : length프로퍼티로 길이를 취득가능
//   index가 부여된 요소를 가짐
//   예) NodeListOf오브젝트(배열은 아니기 때문에 filter()사용불가)
const f1 = '안녕하세요';
const f2 = [...f1];
console.log(f1); // 안녕하세요
console.log(f2); // "안", "녕", "하", "세", "요" ]
// ------------
// Array.from(변환대상, [콜백함수])
// 로도 변환가능
// ([요소],[인덱스],[元배열]) => {}

// ----------------------------
// ----------------------------
// ----------------------------
// ----------------------------
