setTimeout(() => {
  // #myBox要素を子ノードも含めて複製
  // const clonedBox = document.querySelector('#myBox').cloneNode(true);
  const clonedBox = document.querySelector('#myBox').cloneNode(false);
  document.querySelector('.container').appendChild(clonedBox);
}, 3000);
