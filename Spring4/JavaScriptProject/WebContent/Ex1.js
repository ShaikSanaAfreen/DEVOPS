function fun1()
{
	var a=document.Registration.userid.value;
	var b=document.Registration.username.value;
	var c=document.Registration.email.value;
	var d=document.Registration.pass.value;
	var e=document.Registration.address.value;
	var g=document.Registration.country.value;
	var h=document.Registration.zipcode.value;

	var i=document.Registration.language.value;

	var j=document.Registration.about.value;
var f=document.getElementsByName("mgender");

	/*if(document.getElementById('male').checked)
	f=document.getElementById("male").value;
else if(document.getElementById('female').checked)
		f=document.getElementById("female").value;*/

	alert("hi hello how r u "+a+""+b+""+c+""+d+""+e+""+g+""+h+""+i+""+j);
	

if(fun2(a,5,12))
	{

	
if(fun3(d,7,10))
	{
	if(allLetter(b))
		{
		}
	if(address(e))
		{
		
		}
	if(countryselect(g))
		{
		
		}
	if(allnumeric(h))
		{
		
		}
	if(languageselect(i))
		{
		
		}
	if(gen(f))
		{
		
		}
	
		}
	}
}
	
function fun2(userid,mx,my){
	var userid_len=userid.length;
	if(userid_len==0 || userid_len>=my || userid_len<mx)
		{
		alert("User Id should not be empty/length be between"+mx+"to"+my);
		userid.focus();
		return false;
		}
	return true;
		}


function fun3(d,mx,my){
	var pass_len=d.length;
	if(pass_len==0 || pass_len>=my || pass_len<mx)
		{
		alert("password should not be empty/length be between"+mx+"to"+my);
		d.focus();
		return false;
		}
	return true;
		}
function allLetter(b)
{
	var letters=/^[A-Za-z]+$/;
	if(b.match(letters))
		{
		return true;
		}
	else
		{
		alert('Username must have alphabet characters only');
		b.focus();
		return false;
		}
}
function address(e)
{
	var letters=/^[0-9A-Za-z]+$/;
	if(e.match(letters))
		{
		return true;
		}
	else
		{
		alert('address must have alphabet and numbers only');
		e.focus();
		return false;
		}
}
function countryselect(g)
{
	if(g=="Default")
		{
		alert('Select your country from the list');
		g.focus();

		return false;
		}
	else
		
		return true;
		}
function allnumeric(h)
{
	var numbers=/^[0-9]+$/;
	if(h.match(numbers))
		{
		return true;
		}
	else
		{
		alert('Zip code must have numeric characters only');
		h.focus();
		return false;
		}
}

function ValidateEmail(c)
{
	var mailformat=/^\w+([\.-]\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	if(c.match(mailformat))
		{
		return true;
		}
	else
		{
		alert('You have entered an invalid email address');
		c.focus();
		return false;
		}
}
function languageselect(i)
{
	if(i=="Default")
		{
		alert('Select your language from the list');
		i.focus();

		return false;
		}
	else
		
		return true;
		}
function gen(f)
{
	var x=0;
	if(f[0].checked==true){
		x++;
		alert(gender="male");
	}
	if(f[1].checked==true)
		{
		x++;
		alert(gender="female");
		}
		if(x==0)
			{
			alert('select male/female');
			f.focus;
			return false;
			}
		else
			{
			alert("fORM SUCCESSFULLY SUBMITTED");
			window.location.reload()
			return true;
			}
			
			}
		

