/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var primo;
var secondo;
var terzo;
var quarto;
var ris = 0;

function  invioTest() {
    primo = document.getElementById("in_nome1").value;
    secondo = document.getElementById("in_nome2").value;
    terzo = document.getElementById("in_nome3").value;
    quarto = document.getElementById("in_nome4").value;

    let risp = risposte();
    let prom= promozione();
    document.getElementById("div_test").innerHTML ="Il tuo punteggio è: " + risp + " quindi " + prom;
}


function risposte() {
    if (primo === "lorella") {
        ris += 10;
    }
    if (secondo === "michelle") {
        ris += 10;
    }
    if (terzo === "rita") {
        ris += 20;
    }
    if (quarto === "ettore") {
        ris += 30;
    }
    return ris;
}

function promozione(){
    let ris2="";
    
    if (ris < 40) {
        ris2="Bocciato! " + "Il minimo per passare è: 40!";
    }
    
    if(ris>=40){
        ris2="Promosso!";
    }
    return ris2;    
}