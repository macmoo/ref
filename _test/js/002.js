// ----------------------------
// 마우스 좌표
// - event.clientX : 브라우저 왼쪽위를 기준
// - event.clientY
// - event.offsetX : 요소 왼쪽위를 기준
// - event.offsetY
// - event.pageX
// - event.pageY
// - event.screenX : 디바이스 왼쪽위를 기준
// - event.screeY
// ----------------------------
// 스크롤
// - scroll
window.addEventListener('scroll', ()=>{
    console.log('스크롤', window.scrollX, window.scrollY);
})
// ----------------------------
// 텍스트 선택시 처리
// - selectstart
// 吹き出し用の要素
const balloon = document.querySelector('#balloon');

// 対象の文字列要素
const paragraph = document.querySelector('.paragraph');

// 選択開始したときの処理
paragraph.addEventListener('selectstart', () => {
    // マウスを離したときの処理
    paragraph.addEventListener(
        'mouseup',
            (event) => {
            // 選択されている文字列を取得する※
            const selectionCharacters = window.getSelection().toString();

            if (selectionCharacters.length > 0) {
                // 1文字以上選択されていれば、その文字を表示する
                balloon.innerHTML = selectionCharacters;
                balloon.classList.add('on');
                balloon.style.left = `${event.clientX - balloon.clientWidth / 2}px`;
                balloon.style.top = `${event.clientY - balloon.clientHeight * 2}px`;
            } else {
                // 選択文字列がなければ吹き出しを閉じる
                removePopup();
            }
        },
    {
        once: true
    }
    );
});

// 吹き出しをクリックしたら閉じる
balloon.addEventListener('click', removePopup);

// 吹き出しを閉じる処理
function removePopup() {
    balloon.classList.remove('on');
}
// ----------------------------
// 터치
// - touchstart
// - touchmove
// - touchend
// タッチイベントをキャッチするボックス
const targetBox = document.querySelector('.box');
// ログのエリア
const logArea = document.querySelector('.log');

// 画面上でタッチ開始したら、対象内にログを表示
targetBox.addEventListener('touchstart', () => {
    logArea.innerHTML = 'タッチ開始';
});

// 画面上でタッチ位置を移動したら、ログを表示
targetBox.addEventListener('touchmove', () => {
    logArea.innerHTML = 'タッチ位置移動';
});

// 画面上でタッチ位置を移動したら、ログを表示
targetBox.addEventListener('touchend', () => {
    .innerHTML = 'タッチ終了';
});
// ----------------------------
// 터치정보
// - event.changedTouches : 터치정보의 배열
// タッチエリア
const targetBox = document.querySelector('.box');
// ログ
const log = document.querySelector('.log');

// 画面上でタッチ位置を移動したら、ログを表示
targetBox.addEventListener('touchmove', () => {
    const touch = event.changedTouches;

    log.innerHTML = `
        ${touch[0].pageX.toFixed(2)}<br>
        ${touch[0].pageY.toFixed(2)}
        `;
});
// ----------------------------
// ----------------------------
// ----------------------------

