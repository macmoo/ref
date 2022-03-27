window.addEventListener('deviceorientation', deviceOrientationHandler);
function deviceOrientationHandler(event){
    const beta  = evnet.beta;  // x축
    const gamma = evnet.gamma; // y축
    const alpha = evnet.alpha; // z축

    alert(`X축 : ${beta}\n`
        + `Y축 : ${gamma}\n`
        + `Z축 : ${alpha}\n`);
}