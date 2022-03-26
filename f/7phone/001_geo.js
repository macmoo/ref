// 현재위치 취득
navigator.geolocation.getCurrentPosition(getSuccess, getError);

// 취득성공
function getSuccess(position){
    // 위도
    const lat = position.coords.latitude;
    // 경도
    const lng = position.coords.longitude;
    // 오차(m)
    const acc = Math.floor(position.coords.accuracy);

    alert(`위도 : ${lat}\n` 
        + `경도 : ${lng}\n`
        + `오차 : ${acc}`);
}

// 취득실패(거부)
function getError(){
    alert('Geolocation Error');
}