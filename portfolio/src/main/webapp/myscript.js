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
    const text = await response.text();
    const container = document.getElementById("message");
    container.innerText = text.slice(4,text.length - 6);
}