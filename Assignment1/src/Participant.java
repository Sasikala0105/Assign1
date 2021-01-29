public class Participant {
String fname,lname, age,pnumber, race, add;

public Participant(String a,String b,String c,String d, String e, String f)
{
	this.fname=a;
	this.lname=b;
	this.age=c;
	this.pnumber=d;
	this.race=e;
	this.add=f;
	
		}
public void setfirstname(String a) {
this.fname= a;
}

public void setlastname(String b) {
this.lname=b;
}
public void setage(String c) {
this.age=c;
}
public void setphonenumber(String d) {
this.pnumber=d;
}
public void setrace (String e) {
	this.race=e;
}
public void setaddress(String f) {
	this.add=f;
}

public String getfirstname() {
return fname;
}
public String getlastname() {
	return lname;
}
public String getage() {
return age;
}
public String getphonenumber() {
return pnumber;
}
public String getrace() {
return race;
}
public String getaddress() {
	return add;
}

public String toString() {
return fname+lname+age+pnumber+race+add;

}

}
