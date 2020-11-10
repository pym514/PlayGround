var currentTime = document.getElementById("clock");

function getTime(){
    var date = new Date();
    //년, 월, 일, 요일
    var year = date.getFullYear();
    var month = date.getMonth();
    var clockDate = date.getDate();
    var dateDay = date.getDay();
    var week = ['SUN', 'MON', 'TUE', 'WED', 'THUR', 'FRI', 'SAT'];

    //시, 분, 초
    var hour = date.getHours();
    var minute = date.getMinutes();
    var second = date.getSeconds();

    //삼항연산자로 0 붙이기
    currentTime.innerHTML = `${year}.${month <10? `0${month}`:month}.${clockDate}.${week[dateDay]} <br>` 
    + `${hour <10 ? `0${hour}`:hour}:${minute <10? `0${minute}`:minute}:${second<10? `0${second}`:second}` ;
}

function init(){
    getTime();

    setInterval(getTime, 1000);
}
init();