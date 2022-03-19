const audio = document.querySelector('#myAudio');
audio.addEventListener('loadedmetadata', () => {
  console.log(audio.duration); // 音声の長さ(秒)
});

document.querySelector('#btnPlay').addEventListener('click', () => {
  audio.play();
});
document.querySelector('#btnPause').addEventListener('click', () => {
  audio.pause();
});
document.querySelector('#btnSkip').addEventListener('click', () => {
  audio.currentTime = 30;
});
document.querySelector('#btnVMin').addEventListener('click', () => {
  audio.volume = 0.0;
});
document.querySelector('#btnVMax').addEventListener('click', () => {
  audio.volume = 1.0;
});
document.querySelector('#btnMute').addEventListener('click', () => {
  audio.muted = true;
});
