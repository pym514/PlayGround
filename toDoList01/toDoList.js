const form = document.querySelector(".js-form"),
input = form.querySelector("input"),
greeting = document.querySelector("js-greeting");

const USER_LS = "currentUser";

function askForName(){
    
}

function paintGreeting(){

}

function loadName(){
    const currentUser = localStorage.getItem(USER_LS);
    if(currentUser === null){
        askForName();
    } else {
        paintGreeting(currentUser);
    }

}

function init(){
    loadName();
}
init();