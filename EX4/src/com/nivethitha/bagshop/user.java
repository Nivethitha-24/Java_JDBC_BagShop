package com.nivethitha.bagshop;
import java.util.*;
public class user {
String login;


String passord;
public user(String login, String passord) {
	super();
	this.login = login;
	this.passord = passord;
}


public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}

public String getPassord() {
	return passord;
}

public void setPassord(String passord) {
	this.passord = passord;
}
public String toString() {
	return "user [login=" + login + ", passord=" + passord + ", getLogin()=" + getLogin() + ", getPassord()="
			+ getPassord() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}

}
