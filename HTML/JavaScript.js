
function myFunc()
{
    document.write("<table border='1' align='center'>")
    for(var i=1; i <= 10; i++){
        document.write("<tr>");

        for(var j=1; j<=10; j++){
        document.write("<td>"+(i*j)+"</td>");
        }
        document.write("</tr>");
    }
    document.write("</table>");
}

function ifunc()
{
    for(var i=1; i<=10; i++){
        for(j=1; j<=10; j++){
            document.write((i * j)+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp");
        }
        document.write('<br>');
    }
}

function declare()
{
    window.value = 100
}

function print()
{
    alert(window.value)
}

function pattern()
{
    for (var i = 1; i <= 6; i++) {
        for (var j = 1; j <= 6 - i; j++) {
            document.write("&nbsp")
        }
        for (j = 1; j <= i; j++) {
            document.write(i+"&nbsp")
        }
        document.write('<br>')
    }
}

function pattern1()
{
    for (var i = 1; i <= 6; i++) {
        for (var j = 1; j <= 6 - i; j++) {
            document.write("&nbsp")
        }
        for (j = 1; j <= i; j++) {
            document.write(j+"&nbsp")
        }
        document.write('<br>')
    }
}
function getSquare(n){
    return n*n;
}