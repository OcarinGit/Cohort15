//Paso 1 - Crear objeto asíncrono
var xhr = new XMLHttpRequest();

window.onload = function()
{
	document.querySelector("#btnMensaje").addEventListener("click", enviarPeticionAsincrona);
	document.querySelector("#btnSuma").addEventListener("click", enviarPeticionAsincrona2);
}

function enviarPeticionAsincrona()
{
	var miMensaje = document.getElementById("txtMensaje");
	console.log(miMensaje);
	
	//Paso 2 - Abrir la conexión
	xhr.open("GET","MostrarMensajeServlet?txtMensaje="+miMensaje.value);
	
	xhr.onload = funcionCallBack;
	xhr.send(null);
}

function enviarPeticionAsincrona2()
{
	var miNumero1 = document.getElementById("txtNumero1");
	console.log(miNumero1);
	var miNumero2 = document.getElementById("txtNumero2");
	console.log(miNumero2);
	
	//Paso 2 - Abrir la conexión
	xhr.open("GET","SumaNumerosServlet?txtNumero1="+miNumero1.value+"&txtNumero2="+miNumero2.value);
	
	xhr.onload = funcionCallBack;
	xhr.send(null);
}

function funcionCallBack()
{
	if(xhr.status == 200)
	{
		document.getElementById("divResultado").innerHTML+=xhr.responseText;
	}
}


