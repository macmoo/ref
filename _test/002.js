// ----------------------------
// 문자열
// ----------------------------
// 길이
console.log("string".length); // 6
console.log(Array.from('string2').length); // 7
// ----------------------------
// 문자열양끝 공백, 탭, 개행 제거
console.log(" str ing ".trim()); // "str ing"
// ----------------------------
// 문자열 검색(검색결과없으면 -1을 반환)
// 대소문자 구분함, 인덱스를 반환
// - 대상문자열.indexOf(검색할 문자열, [검색개시 인덱스])
// - 대상문자열.lastIndexOf(검색할 문자열, [검색개시 인덱스])
// - 대상문자열.search(정규표현)
const str = 'Javascript를 배우자.';
const s1 = str.search(/Javascript/);
const s2 = str.search(/HTML/);
console.log(s1); // 0 : hit
console.log(s2); // -1 : no hit
// ----------------------------
// 문자열이 포함되어 있는가. (참/거짓을 리턴)
// - 대상문자열.includes(검색할 문자열, [검색개시 인덱스])
// 문자열로 시작하는가, 끝나는가
// - 대상문자열.startsWith(검색할 문자열, [검색개시 인덱스])
// - 대상문자열.endsWith(검색할 문자열, [검색개시 인덱스])
const a1 = str.includes("script");
const a2 = str.startsWith("javascript");
const a3 = str.endsWith("배우자.");
console.log(a1); // true
console.log(a2); // false
console.log(a3); // true
// ----------------------------
// 문자추출
// 문자열.charAt(인덱스)
console.log("string".charAt(3)); // i
console.log("string".charAt());  // s
// 문자열.slice(시작인덱스, [종료인덱스])
// 문자열.substring(시작인덱스, [종료인덱스])
// 종료인덱스를 생략하면 문자열끝까지
// slice()음수지정가능(뒤에서부터 추출)
// slice()와 substring()은 시작idx가 종료idx보다 
// 클경우의 처리가 다름. (시작idx, 종료idx를 바꿔서 처리)
const str2 = "kwak no1";
console.log(str2.slice(2,4));       // ak
console.log(str2.substring(2,4));   // ak
console.log(str2.slice(0));         // kwak no1
console.log(str2.substring(0));     // kwak no1
console.log(str2.slice(1, -1));     // wak no
console.log(str2.substring(1, -1)); // k
console.log(str2.slice(3, 1));      // <empty string>
console.log(str2.substring(3, 1));  // wa
// ----------------------------
// 문자열.substr(시작인덱스, [취득문자수])
// @deprecated
console.log(str2.substr(1, 3));  // wak
// ----------------------------
// 문자열치환
// 문자열1/정규펴현을 문자열2로 바꿈
// 대상문자열.replace(문자열1, 문자열2)
// 대상문자열.replace(정규표현, 문자열2)
const phone = '111-2222-3333';
console.log(phone.replace(/-/g, '')); // 11122223333
// ----------------------------
// * 버튼의 디폴트 이벤트 무효화
document.querySelector('#submitBtn')
        .addEventListener('click'
        , (event)=>{ event.defaultPrevented(); });
// ----------------------------
// 문자열분할
// 문자열.split([구분문자], [분할수])
// 문자열.split([정규표현], [분할수])
// 빈문자로 분할하면 한글자씩 들어간 배열이 리턴
// 인수를 생략하면 하나의 전체문자열이 들어간 배열 리턴
// ----------------------------
// ----------------------------
// ----------------------------
// ----------------------------
// ----------------------------
// ----------------------------
// ----------------------------
// ----------------------------
// ----------------------------
// ----------------------------
// ----------------------------


