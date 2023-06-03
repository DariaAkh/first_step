<!DOCTYPE html>
<html>
<body>

<img src="planets.gif" width="145" height="126" usemap="#planetmap">

<map name="planetmap">
  <area id="venus" shape="circle" coords="124,58,8" alt="Venus" href="venus.htm">
</map>

<p>Click the button to display the pathname of the href attribute for the "venus" area in the image-map.</p>

<button onclick="myFunction()">Try it</button>

<p id="demo"></p>

<script>
function myFunction() {
  var x = document.getElementById("venus").pathname;
  document.getElementById("demo").innerHTML=x;
}
</script>

</body>
</html>
