<html>
<body>
	<div>
	<h3>Current Date and Time is :</h3>
			<% java.util.Date d = new java.util.Date();
			out.println(d.toString());%>
<p id="para">SpringBoot Training</p>
  <button onclick="changeColor('blue');">blue</button>
  <button onclick="changeColor('red');">red</button>
  <script>
  function changeColor(newColor) {
	  var elem = document.getElementById('para');
	  elem.style.color = newColor;
	}
  </script>
	
	</div>
</body>
</html>
