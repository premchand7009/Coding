let h1 =document.querySelector("h1");
let btn = document.querySelector("button");
let div =document.querySelector("div");

btn.addEventListener("click",()=>{
 h1.innerHTML=generateColor();
 div.style.backgroundColor=generateColor();
});

let generateColor=()=>{
    let red= Math.floor(Math.random*255);
    let green= Math.floor(Math.random*255);
    let blue= Math.floor(Math.random*255);
    return (`rgb(${red},${green},${blue})`);
}