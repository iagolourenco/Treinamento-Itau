function mostrarHello() {
  alert("Hello Word");
}

function verificaNumero() {
  var numero = prompt("Digite um número: ");
  var resultado = parseInt(numero) % 2;
  if (parseInt(resultado) == 0) {
    alert("Numero par");
  } else {
    alert("Numero impar");
  }
}

function somarValores(n1, n2){
var resultado = parseInt(n1) + parseInt(n2)
return resultado
}