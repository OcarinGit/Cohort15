console.log("Estamos en el inicio del script.js");

//Paso 1. Crear el objeto Ajax
let xhr = new XMLHttpRequest();

window.onload = function()
{
	console.log("Estamos en el window.onload");
	document.querySelector("#btnPotencia").addEventListener("click", enviarAjax);
}

function enviarAjax()
{
	console.log("Estamos dentro del enviarAjax");
	//Paso 2. Abrir la conexión
	xhr.open("POST", "CalcularPotenciaServlet");
	var miFormita = new FormData();
	var miBase = document.getElementById("txtBase").value;
	var miExponente = document.getElementById("txtExponente").value;
	miFormita.append("txtBase",miBase);
	miFormita.append("txtExponente",miExponente);
	
	//Paso 3. Cargamos la función en el método onload
	xhr.onload = funcionCallBack;
	
	//Paso 4. Enviar el Ajax
	xhr.send(miFormita);
}

function funcionCallBack()
{
	if(xhr.status == 200)
	{
		document.getElementById("divRes").innerHTML+=xhr.responseText;
	}
}

