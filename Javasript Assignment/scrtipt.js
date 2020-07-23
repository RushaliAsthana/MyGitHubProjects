function checkEmail()
{
 var x=document.getElementById("emailfield").value;
 var atpos = x.indexOf("@");
 var dotpos = x.lastIndexOf(".");
 if((atpos<1||dotpos<atpos+2||dotpos+2>=x.length) && x.length>0)
 {
    document.getElementById("invalidemail").innerHTML="Invalid Email id!";
 }
}
function lengthcheck()
{
 var pwd=document.getElementById("pwd").value;
 var invalidmsg=document.getElementById("invalidpwd");
 if(pwd.length>8)
 {
  invalidmsg.innerHTML="Password too long!";
 }
 else if(pwd.length>0 && pwd.length<4)
 {
  invalidmsg.innerHTML="Password too short!";
 }
 else{
  invalidmsg.innerHTML="";
 }
}
function checkPwd()
{
         var pwd=document.getElementById("pwd").value;
         var cwd=document.getElementById("cpwd").value;
         if(pwd.length!=0 && cwd.length!=0 && cwd!=pwd)
         {
          document.getElementById("invalidcpwd").innerHTML="Passwords dont match!";
         }
}
function phnoCheck()
{
 var no=document.getElementById("phno").value;

 if(no.toString().length>10 || (no.toString().charAt(0)!="9"&&no.toString().charAt(0)!="7"&&no.toString().charAt(0)!="6")&&no.toString().charAt(0)!="8")
 {
  document.getElementById("invalidphno").innerHTML="Invalid Phno";
 }
 else{
  document.getElementById("invalidphno").innerHTML="";
 }
}
function checkLen()
{
 var no=document.getElementById("phno").value;
 if(no.toString().length!=10)
 document.getElementById("invalidmsg").innerHTML="Invalid Phno";
}
function validateAge()
{
 var age=document.getElementById("age").value;
 if(age.toString().length>2 || age.toString().charAt(0)=="0")
 {
  document.getElementById("invalidage").innerHTML="Invalid Age";
 }
 else{
  document.getElementById("invalidage").innerHTML="";
 }
 
}
function resetfun1()
{
 document.getElementById("invalidemail").innerHTML="";
}
function resetfun2()
{
 document.getElementById("invalidpwd").innerHTML="";
}
function resetfun3()
{
 document.getElementById("invalidcpwd").innerHTML="";
}
function resetfun4()
{
 document.getElementById("invalidage").innerHTML="";
}
function resetfun5()
{
 document.getElementById("invalidphno").innerHTML="";
}