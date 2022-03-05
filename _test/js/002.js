// ----------------------------
// 이벤트를 발생시킴
// - 이벤트리스너.dispatchEvent(이벤트)   : 이벤트를 발생시킴
// - new Event('이벤트명', [{detail:값}]) : 이벤트를 생성함
// 프로그램 실행시부터 1초후에 #myBox요소에 클릭 이벤트를 발생시킴
const boxElement = document.querySelector('#myBox');
boxElement.addEventListener('click', () => {
    boxElement.innerHTML = 'クリックされました';
});
setTimeout(() => {
    boxElement.dispatchEvent(new Event('click'));
}, 1000);
// click만 가능
setTimeout(() => {
    boxElement.click();
}, 1000);
// ----------------------------
// 디폴트 이벤트를 캔슬
// - 이벤트.preventDefault()

/** マウスホイールを有効にするかどうか */
let enableMouseWheel = true;
// チェックボックスをクリックしたときの処理
document.querySelector('#mouseWheelToggle')
        .addEventListener('click', (event) => {
    // チェックボックスに値が入っていたら、マウスホイールを無効化する
    enableMouseWheel = event.target.checked === false;
});

// スクロール可能な要素上でマウスホイールしたときの処理
document.querySelector('.scrollable-element')
        .addEventListener('wheel', (event) => {
    // マウスホイールが有効な場合は処理を抜ける
    if (enableMouseWheel === true) {
        return;
    }
    // マウスホイールが無効な場合はevent.preventDefault()を実行
    event.preventDefault();
});
// ----------------------------
// 드래그 앤 드롭
// - dragstart : 요소의 드래그가 시작
// - drag
// - dragend
// - dragenter : 드래그중에 마우스가 요소의 위에 올라감
// - dragover  : 드래그중에 마우스가 요소에 존재함
// - dragleave
// - drop
// - event.dataTransfer.files
//   : 드롭된 파일의 정보, 리턴 FileList오브젝트
// ----------
const character = document.querySelector('.character');

character.addEventListener('dragstart', () => {
    console.log('dragstartイベント');
});

character.addEventListener('drag', () => {
    console.log('dragイベント');
});

character.addEventListener('dragend', () => {
    console.log('dragendイベント');
});

box.addEventListener('dragenter', () => {
    console.log('dragenterイベント');
});

box.addEventListener('dragover', () => {
    console.log('dragoverイベント');
});

box.addEventListener('dragleave', () => {
    console.log('dragleaveイベント');
});

// dragoverイベントの無効化
box.addEventListener('dragover', (event) => {
    event.preventDefault();
});

box.addEventListener('drop', () => {
    console.log('dropイベント');
});
// ---------- 
// 샘플
// ファイルアップロードゾーン
const fileZone = document.querySelector('.file-zone');

// ファイルアップロードゾーンに着脱するクラス
const className = 'on';

// ドラッグした要素が重なったときの処理
fileZone.addEventListener('dragover', (event) => {
    // デフォルトの挙動を停止
    event.preventDefault();
    fileZone.classList.add(className);
});

// ドラッグした要素が離れたときの処理
fileZone.addEventListener('dragleave', () => {
    // デフォルトの挙動を停止
    event.preventDefault();
    fileZone.classList.remove(className);
});

// ドロップした時の処理
fileZone.addEventListener('drop', (event) => {
    // デフォルトの挙動を停止
    event.preventDefault();
    fileZone.classList.remove(className);

    // Fileオブジェクトを参照
    const transferdFiles = event.dataTransfer.files;

    // 画像を表示する
    displayImages(transferdFiles);
});

/** 画像の表示処理 */
function displayImages(transferdFiles) {
    // 画像ファイルの格納配列
    const imageFileList = [];

    // ファイル数
    const fileNum = transferdFiles.length;

    // ファイルが画像のもののみを配列に格納する
    for (let i = 0; i < fileNum; i++) {
        if (transferdFiles[i].type.match('image.*') === false) {
            return;
        }
        imageFileList.push(transferdFiles[i]);
    }

    // 画像表示エリアの参照
    const imagePreviewArea = document.querySelector('.image-list');

    // 各画像ファイルについて処理
    for (const imageFile of imageFileList) {
        // 画像ファイルの読み込み処理
        const fileReader = new FileReader();
        fileReader.readAsDataURL(imageFile);
        fileReader.addEventListener('load', (event) => {
            const image = new Image();
            image.src = event.target.result;
            // 表示エリアの先頭に画像ファイルを表示
            imagePreviewArea.insertBefore(image, imagePreviewArea.firstChild);
        });
    }
}
// ---------- 
// CSS
body {
    display: block;
    overflow: scroll;
}

.file-zone {
    background-color: rgba(0, 0, 0, 0.1);
    box-sizing: border-box;
    display: flex;
    justify-content: center;
    align-items: center;
    width: 100%;
    height: calc(100% - 200px);
    transition: 100ms all ease-out;
}

.file-zone.on {
    background-color: rgba(97, 131, 209, 0.9);
}

.file-preview-area {
    width: 100%;
    min-height: 200px;
    background-color: rgba(0, 0, 0, 0.58);
}

.file-preview-area .image-list {
    display: grid;
    overflow: scroll;
    gap: 10px;
    grid-template-columns: repeat(3, 1fr);
    grid-auto-rows: 200px;
}

.file-preview-area .image-list > img {
    width: 100%;
    height: 100%;
    display: block;
    object-fit: cover;z
}

// ----------------------------
// ----------------------------
// ----------------------------
// ----------------------------