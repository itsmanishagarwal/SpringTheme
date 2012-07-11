var str="Hello world!";
//look for "Hello"
var patt=/Hello/g;
var result=patt.test(str);
document.write("Returned value: " + result);

//look for "W3Schools"
patt=/W3Schools/g;
result=patt.test(str);
document.write("<br />Returned value: " + result);

