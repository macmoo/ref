// ----------------------------
// 장방향 그라데이션
const rectangle = document.querySelector('.rectangle');

// 버튼이벤트
document.querySelector('.button').addEventListener('click', onClickButton);

function onClickButton(){
    // 0~359랜덤숫자 생성
    const randomHue        = Math.trunc(Math.random() * 360);

    // 그라데이션 시작, 종료 색 설정
    const randomColorStart = `hsl(${randomHue     }, 100%, 50%)`;
    const randomColorEnd   = `hsl(${randomHue + 40}, 100%, 50%)`;

    // 장방형의 그라데이션용 변수(--start, --end)을 변경
    rectangle.style.setProperty('--start', randomColorStart);
    rectangle.style.setProperty('--end'  , randomColorEnd);
}
// ----------------------------
// ----------------------------
// ----------------------------
// ----------------------------
// ----------------------------


