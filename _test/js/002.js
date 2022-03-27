
// ----------------------------
// - Symbol
//   : 절대 중복되지 않는 데이터를 취급할때.
//     빌트인 오브젝트에 독자메소드를 추가할경우의 메소드 명을 작성할때.
//   : Symbol(문자열 또는 수치) => 심볼생성
//   : 심볼 => 다른것과 중복되지 않는 값을 취급한다.
//   : new를 쓰지않고 단지 Symbol()로 생성
// ---------------
const symbol1 = Symbol();
const symbol2 = Symbol();
console.log(symbol1 == symbol2);  // false
console.log(symbol1 === symbol2); // false
console.log(typeof symbol1);      // symbol
console.log(symbol1);             // Symbol()
const symbol3 = Symbol('foo');
const symbol4 = Symbol('foo');
console.log(symbol3 == symbol4);  // false
// ----------------------------
// - 배열이나 오브젝트에 독자메소드를 추가.
//   : 오브젝트.prototype[심볼] = function(){}
//     => 오브젝트에 독자메소드를 추가.
//     오브젝트[심볼]()
//     => 독자메소드를 실행.
//   : prototype => 오브젝트에 멤버(멤버함수, 멤버변수)를 추가하기 위한 프로퍼티이다.
//     Object를 상속받는 모든 객체는 prototype가 있다.
//   : 이미 존재하는 멤버와 같은 이름으로 추가할 경우 덮어씌어진다.
//     => Symbol을 사용하는 이유
console.log(String.prototype);
console.log(Array.prototype);
console.log(Date.prototype);
// ---------------
// [myMethod]라는 심볼생성.
const myMethod = Symbol();
// 독자메소드 추가.
Array.prototype[myMethod] = function(){
    console.log('독자메소드이다.');
}
// 독자메소드 실행.
const arr = [1,2,3];
arr[myMethod](); // 독자메소드이다.
// ---------------
// 배열에 셔플메소드 추가.
const shuffle = Symbol();

Array.prototype[shuffle] = function(){
    const arrayLength = this.length;
    for(let i = arrayLength - 1; i >= 0 ; i --){
        const randomIndex = Math.floor(Math.random() * (i+1));
        [this[i], this[randomIndex]] = [this[randomIndex], this[i]];
    }
    return this; // 자기자신을 반환.
};
// 테스트
// 배열에서 짝수를 빼내어 셔플하고 100배로 한다.
const arr2 = [1,2,3,4,5,6,7,8,9,10];
const arr3 = arr2.filter((value) => value % 2 === 0)
                    [shuffle]()
                    .map((value) => value * 100);
console.log(arr3);
// => Array(5) [ 400, 200, 800, 600, 1000 ]
// ---------------
// 이렇게도 가능.
Array.prototype.myMethod = function(){
    console.log('안녕');
}
const arr4 = [1,2,3];
arr4.myMethod(); // 안녕
// ----------------------------
// - Map을 사용.
//   : 메소드
//     new Map(iterable한 객체) => Map객체를 초기화.
//     맵.set(키, 값)   => 맵에 키/값을 등록
//     맵.get(키)       => 값 취득
//     맵.has(키)       => 키의 값이 존재하나
//     맵.delete(키)    => 키의 값을 삭제
//     맵.clear()       => 모두 삭제
//     맵.keys()        => 키로 이루어진 iterator객체
//     맵.values()      => 값으로 이루어진 iterator객체
//     맵.entries()     => 키/값의 배열로 이루어진 iterator객체
//     맵.forEach(콜백) => 각 페어에 대해 처리를 함.
//   : 프로퍼티
//     맵.size          => 키 / 값의 페어수
//   : forEach의 콜백구문
//     (키, 값) => {}   => 키 / 값을 받아 처리를 함.
//   : 키가 이미 존재할경우, 덮어씌어진다.
// ---------------
// 맴 초기화.
const memberList = new Map();
// 맵 값 설정.
memberList.set( 20, '스즈키');
memberList.set( 50, '다나카');
memberList.set(120, '다카하시');
// 이렇게도 기술가능
// memberList.set( 20, '스즈키')
//             .set( 50, '다나카' )
//             .set(120, '다카하시');
// 값 취득.
console.log(memberList.get(20)); // 스즈키
// 맵의 존재 확인.
console.log(memberList.has(50)); // true
// ---------------
// 맵 생성2
const memMap = new Map([[20, '스즈키'],[50, '다나카'],[120, '다카하시']]);
console.log(memMap.get(50));        // 다나카
console.log(memMap.get(502));       // undefined
const keySymbol = Symbol();
memMap.set(keySymbol, '고토우');
console.log(memMap.get(keySymbol)); // 고토우

console.log(memMap.size);           // 4
// 키
const keyList = memMap.keys();
for(let key of keyList){
    console.log(memMap.get(key));
}
// 값
const valList = memMap.values();
for(let val of valList){
    console.log(val);
}
// 엔트리
memMap.delete(keySymbol);
memMap.forEach((value, key) => {
    console.log(`${key} : ${value}`);
});
// ----------------------------
// - Set => 중복하지 않는 값의 컬렉션
//   : 인덱스나 키로 값에 접근이 불가능
//     기존에 있는 값을 세트하면 무시됨.
//   : 메소드
//     new Set(iterable객체)
//     세트.add(값)
//     세트.has(값)
//     세트.delete(값)
//     세트.clear()
//     세트.values()
//     세트.forEach(콜백함수)
//   : 프로퍼티
//     세트.size
// ---------------
const userList = new Set();
userList.add( 20);
userList.add( 50);
userList.add(120);
// userList.add( 20)
//         .add( 50)
//         .add(120);
console.log(userList.has(50)); // true
// 초기화2
const userList2 = new Set([20, 50, 120]);
// for .. of
const userValList = userList.values();
for(let value of userValList){
    console.log(value);// 20, 50, 120
}
// forEach
userList.forEach((value)=>{
    console.log(value);// 20, 50, 120
});
// 이미 있는 값은 무시됨.
userList.add(120);
userList.forEach((value)=>{
    console.log(value); // 20, 50, 120
});
// 스플레트연산자로 배열로 변환.
const userIdArr = [...userList];
console.log(userIdArr);
// => Array(3) [ 20, 50, 120 ]
console.log(userList.size); // 
// ----------------------------
// - 
// ---------------
// ----------------------------
