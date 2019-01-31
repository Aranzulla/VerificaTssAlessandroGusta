/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function messaggio() {
    //Oggi è il 31/01/2019 ciao Luca Guerrini buona giornata
    let nome = document.getElementById("in_nome").value;
    let ris = "Oggi è il " + giorno() + " ciao " + nome + " buona giornata";
    document.getElementById("div_mex").innerHTML = ris;

}

function giorno() {
    let day = new Date();
    let giorno = day.getDate() + "/";
    let month = new Date();
    let mese = month.getMonth() + 1 + "/";
    let year = new Date();
    let anno = year.getFullYear();

    return giorno + mese + anno;
}

function sposta() {
    let nome1 = document.getElementById("in_n1").value;
    let nome2 = document.getElementById("in_n2").value;
    let nome3 = document.getElementById("in_n3").value;

    document.getElementById("in_n1").value = nome3;
    document.getElementById("in_n2").value = nome1;
    document.getElementById("in_n3").value = nome2;
}

var ar_art = [];

function dati() {
    let newart = document.getElementById("in_art").value;
    let newcost = document.getElementById("in_costo").value * 1;
    let articoli = {
        articolo: newart,
        costo: newcost,
        html: function () {
            let ris = this.articolo + " - " + this.costo + "<br>";
            return ris;
        }
    };
    ar_art.push(articoli);
}

function aggiungi() {
    dati();
    let tx = "";
    for (var i = 0; i < ar_art.length; i++) {
        let ris = ar_art[i];
        tx += ris.html();
    }
    document.getElementById("div_list").innerHTML = tx;

    let tot = totale(ar_art);
    let med = media(ar_art);
    let min = minimo(ar_art);
    let max = massimo(ar_art);
    document.getElementById("div_tot").innerHTML = "Totale" + " - " + tot + "<br>" + "Media" + " - " + med + "<br>" + "Minimo" + " - " + min + "<br>" + "Massimo" + " - " + max;
}

function totale(ar_valore) {
    let tot = "";

    for (i = 0; i < ar_valore.length; i++) {
        tot = tot * 1 + ar_valore[i].costo * 1;
    }
    return tot;


}

function media(ar_valore) {
    let ris = "";

    for (i = 0; i < ar_valore.length; i++) {
        ris = ris * 1 + ar_valore[i].costo * 1 / ar_valore.length;
    }
    return ris;
}

function minimo(ar_valore) {
    let min = ar_valore[0].costo;

    for (i = 0; i < ar_valore.length; i++) {


        if (ar_valore[i].costo * 1 <= min) {
            min = ar_valore[i].costo * 1;
        }
    }
    return min;
}
function massimo(ar_valore) {
    let max = ar_valore[0].costo;

    for (i = 0; i < ar_valore.length; i++) {


        if (ar_valore[i].costo * 1 >= max) {
            max = ar_valore[i].costo * 1;
        }
    }
    return max;
}