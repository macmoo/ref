// ----------------------------
// - 자이로 센서, 가속도 센서 사용
//   : event.beta  => x축의 기울기
//     event.gamma => y축의 기울기
//     event.alpha => z축의 기울기
//   : event.acceleration.x => x축의 가속도
//     event.acceleration.y => y축의 가속도
//     event.acceleration.z => z축의 가속도
//   : 자이로 센서는 기울기를 검출하는 센서.
//     DeviceOrientation이벤트로 검출.
// ----------
window.addEventListener('deviceorientation', deviceOrientationHandler);
function deviceOrientationHandler(event){
    const beta  = evnet.beta;  // x축
    const gamma = evnet.gamma; // y축
    const alpha = evnet.alpha; // z축

    alert(`X축 : ${beta}\n`
        + `Y축 : ${gamma}\n`
        + `Z축 : ${alpha}\n`);
}
// ----------------------------
// - 
// ----------
// ----------------------------
// - 
// ----------
// ----------------------------
// - 
// ----------
// ----------------------------
// - 
// ----------
// ----------------------------
