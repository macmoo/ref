// ----------------------------
// 오브젝트
// : 복수의 프로퍼티를 갖음
// 프로퍼티
// : 키-값 조합
const object = {}; // 빈 오브젝트
// ----------------------------
const person = {
    id:1,
    name:'스즈키',
    age:28
}
console.log(person.id);      // 1
console.log(person[name]);   // undefined
console.log(person['name']); // 스즈키
// ----------------------------
person.id = 99;
console.log(person.id);      // 99
// ----------------------------
const resp = {
    result:true,
    list:[{id:1, name:'다나카', age:26}
        ,{id:2, name:'곽', age:39}]
};
console.log(resp.list[0].name); // 다나카
console.log(resp.list[1].id);   // 2
resp.list[1].id = 98;
console.log(resp.list[1].id);   // 98
// ----------------------------
// 함수도 가능
const myClass = {
    method1 : function(){
        console.log('1실행');
    },
    method2 : function(){
        console.log('2실행');
    }
};
myClass.method2(); // 2실행
// ----------------------------
// 오브젝트 복사
const object1 = {
    result:true,
    members:[
        {id:1, name:'다나카1', age:26},
        {id:2, name:'다나카2', age:27},
        {id:3, name:'다나카3', age:28}
    ]
};
// Object.assign() 사용
const copiedObj1 = Object.assign({}, object1);
// ----------------------------
// ...(스프레드연산자)사용
const copiedObj2 = {...object1};
// Object.assign()/...(스프레드연산자)는 얕은 복사
// 얕은복사:복사元、복사先가 같은 데이터를 참조
// 복사元의 오브젝트의 조작은 복사先에 영향을 끼침
console.log(copiedObj1.result);          // true
console.log(copiedObj2.members[0].name); // 다나카1
object1.result = false;
object1.members[0].name='스즈키';
console.log(copiedObj1.result);          // true
console.log(copiedObj2.members[0].name); // 스즈키
// ----------------------------
// 오브젝트에 프로퍼티의 존재 체크
// 오브젝트.hasOwnProperty('키')
var ret1 = object1.hasOwnProperty('result');
var ret2 = 'members' in object1;
var ret3 = object1.result != null;
var ret4 = object1.no != null;
console.log(ret1); // true
console.log(ret2); // true
console.log(ret3); // true
console.log(ret4); // false
// ----------------------------
// 값에 대해 처리
// Object.keys(오브젝트)
// Object.values(오브젝트)
// Object.entries(오브젝트) // 각 프로퍼티의 배열
const person2 = {
    id2:1,
    name2:'스즈키',
    age2:28
}
console.log(Object.keys(person2));    // [ "id2", "name2", "age2" ]
console.log(Object.values(person2));  // [ 1, "스즈키", 28 ]
console.log(Object.entries(person2));
// 0: Array [ "id", 1 ]
// 1: Array [ "name", "스즈키" ]
// 2: Array [ "age", 28 ]
// ----------------------------
// 복수의 변수에 값을 한번에 대입
// 변수명 일치 필요
const {id2, name2, age3} = person2;
console.log(name2); // 스즈키
console.log(age3);  // undefined
// 별명은 가능
const {name2:yourName} = person2;
console.log(yourName); // 스즈키
// ----------------------------
// 오브젝트를 편집불가로 변경
// Object.freeze(오브젝트)
// Object.isFrozen(오브젝트)
// 오브젝트는 const여도 프로퍼티의 추가/삭제/변경이 가능
const object2 = {id:10, name:'다나카'};
console.log(object2); // { id: 10, name: "다나카" }
object2.id = 12;
object2.address = '서울';
console.log(object2); // { id: 12, name: "다나카", address: "서울" }
// "'use strict';" => 선두에 선언 에러감지를 유효화
Object.freeze(object2);
object2.id = 99; // "'use strict';" 없으면 에러는 안남
object2.mail = 'a@gmail.com';
console.log(object2); // { id: 12, name: "다나카", address: "서울" }
// ----------------------------
const arr1 = [1,2,3];
Object.freeze(arr1);
console.log(arr1);
// arr1.push(99); // "'use strict';" 없어도 에러남
console.log(Object.isFrozen(arr1)); // true
// ----------------------------
// 다른 방법
// - Object.seal() : 프로퍼티의 추가/삭제만 금지, 변경은 가능.
// - Object.preventExtensions() : 프러퍼티의 추가만 금지, 삭제/변경가능
// ----------------------------
// ----------------------------
// ----------------------------
// ----------------------------
