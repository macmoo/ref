// ----------------------------
const date    = new Date();
const year    = date.getFullYear();
const month   = date.getMonth() + 1;
const day     = date.getDate();
const h       = date.getHours();
const m       = date.getMinutes();
const s       = date.getSeconds();
const dayList = ['일','월','화','수','목','금','통'];
const week    = dayList[date.getDay()];
// ----------------------------
document.querySelector(".log1").innerHTML = 
    `지금은 ${year}년 ${month}월 ${day}일 ${week}요일 `
    + `${h}시 ${m}분 ${s} 초이다.`;
// 지금은 2022년 2월 14일 월요일 21시 16분 57 초이다.
// ----------------------------
const locale    = date.toLocaleString();
const localDate = date.toLocaleDateString();
const localTime = date.toLocaleTimeString();
// ----------------------------
document.querySelector(".log2").innerHTML = 
    `${locale}<br/>`
    + `${localDate}<br/>`
    + `${localTime}`;
// 2022. 2. 14. 오후 9:16:57
// 2022. 2. 14.
// 오후 9:16:57
// ----------------------------
const num1 = Date.parse('2022/02/14');
console.log(num1);           // 1644764400000
console.log(date.getTime()); // 1644841858431
// ----------------------------

