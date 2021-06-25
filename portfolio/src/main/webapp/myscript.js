/**
 * @author Tyler Jedziniak
 * 
 * The purpose of this script is to add a fetch() feature to my portfolio.
 */

 /**
  * Function is to show a hello message from HelloWorldServlet.java
  */
async function showMessage(){
    const response = await fetch("/hello");
    const json = await response.json();
    let randnum = Math.floor(Math.random()*3);
    const text = json[randnum];
    const container = document.getElementById("message");
    container.innerText = text;
}