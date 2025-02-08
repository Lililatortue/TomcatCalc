<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
function sendString(){
	let str=document.getElementById('formula').value;
	
	fetch("/calcWebApp/calculate?formula=" + encodeURIComponent(str))
	 .then(response => response.text())
     .then(data => document.getElementById("resultat").innerHTML = data)
     .catch(error => console.error('Error:', error));
}

</script>
</head>
<body>
<form onsubmit="event.preventDefault(); sendString();">
<label>Entrez une equation</label>
<input type="text" id="formula" name="formula" required/>
<button type="submit" >calculate</button>
    </form>

<h2 id="resultat"></h2>

</body>
</html>