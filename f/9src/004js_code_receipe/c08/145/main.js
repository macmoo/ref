const container = document.querySelector('.container');
// 挿入する.new-box要素
const newBox1 = `<div class="new-box box">.new-box要素 - 1</div>`;
const newBox2 = `<div class="new-box box">.new-box要素 - 2</div>`;
const newBox3 = `<div class="new-box box">.new-box要素 - 3</div>`;
const newBox4 = `<div class="new-box box">.new-box要素 - 4</div>`;

setTimeout(() => {
	// .container要素内先頭に.new-box要素を追加する
	container.insertAdjacentHTML('beforebegin', newBox1);
	container.insertAdjacentHTML('afterbegin', newBox2);
	container.insertAdjacentHTML('beforeend' , newBox3);
	// .container要素の直後に.new-box要素を追加する
		container.insertAdjacentHTML('afterend', newBox4);
}, 3000);
