// Vladwoguer Bezerra June 2016
// Ajax request to a DateServer
function loadDoc() {

	var xhttp = new XMLHttpRequest();

	xhttp.onreadystatechange = function() {
 
		if (xhttp.readyState == 4 && xhttp.status == 200) {

			alert(xhttp.responseText);
    
		}
  
	};

	xhttp.open("GET", "http://localhost:7020", true);
  xhttp.send();

}

loadDoc();