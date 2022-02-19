// ---------------------------
// 페이지 이동
console.log(location.href); // 현재웹페이지URL
// => file:///D:/200.dev/201.src/_githubIO/ref/_test/js/002.html
 // location.href = 'http://www.google.com';
// 값을 대입한 타이밍에 페이지 이동
// ---------------------------
// 페이지 리로드
// location.reload();     // => 브라우저의 캐시를 사용.
// location.reload(true); // => 브라우저의 캐시를 무시.
// ---------------------------
// 브라우저의 '뒤로 돌아가기' 버튼과 같은 동작
// history.back();    // 돌아가기
// history.forward(); // 진행
// history.go(수치);  // 임의의 수만큰 돌아감
// history.go(-1) == history.back();
// ---------------------------
// 앵커사용
const hash = location.hash;
console.log(hash);
// ---------------------------
// hash 변경 이벤트
// &lt;a href="#orange"&gt;オレンジのアンカーリンク&lt;/a&gt;
window.addEventListener('hashchange', handleHashChange);
handleHashChange();

function handleHashChange(){
    const hash = location.hash;
    document.querySelector('.log1').innerHTML = `현재의 앵커는 ${hash}`;
}
// ---------------------------
// 새로운 윈도우로 URL열기
// const win = window.open('http://www.google.co.kr');
// 뒤에서 열리는 경우도 있기때문에 포커스를 맞춰줌
// win.focus();
// ---------------------------
// 윈도우 스크롤양을 조사
const x = window.screenX;
const y = window.screenY;
console.log(x);
console.log(y);
// ---------------------------
// 윈도우를 스크롤 시킴
// window.scrollTo(0, 1000);
// ---------------------------
// 타이틀 변경
// document.title
const title = document.title;
document.querySelector('#btnApple').addEventListener('click', ()=>{
    document.title = 'APPLE';
});
document.querySelector('#btnOrange').addEventListener('click', ()=>{
    document.title = 'ORANGE';
});
// ---------------------------
// 윈도우가 포커스가 되어 있나 조사
window.addEventListener('focus', ()=>{
    document.querySelector('.log1').innerHTML = `Focus 되어 있음`;
});
window.addEventListener('blur', ()=>{
    document.querySelector('.log1').innerHTML = `Focus 되어 있지 않음`;
});
// ---------------------------
// 전체화면 표시
const btn = document.querySelector('#btnFull');
btn.addEventListener('click', ()=>{
    document.body.requestFullscreen();
});
// 전체화면 끄기
const btnE = document.querySelector('#btnExit');
btnE.addEventListener('click', ()=>{
    document.exitFullscreen();
});
// ---------------------------
// 온라인/오프라인 처리 분기
const isOnline = navigator.onLine; // 상태취득
if(isOnline === true){
    console.log('온라인')
}else{
    console.log('오프라인')
}
window.addEventListener('online', ()=>{
    console.log('온라인');
});
window.addEventListener('offline', ()=>{
    console.log('오프라인');
});
// ---------------------------
// ---------------------------
// ---------------------------
// ---------------------------
// ---------------------------
// ---------------------------

