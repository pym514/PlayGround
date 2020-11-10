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

    currentTime.innerHTML = `${year}.${month}.${clockDate}`;
}

function init(){
    getTime();
}
init();