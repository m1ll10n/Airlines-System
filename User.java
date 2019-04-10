import java.util.*;
import java.io.*;

public class User {
	private String loginID;
	private String password;
	private String name;
	private int age;
	private String gender;
	private String ic;
	private String citizen;
	public boolean superuser;

	//normal constructor
	public User(String id, String pass, String nme, int age, String gend, String ic, String citizen, boolean su) {
		this.loginID = id;
		this.password = pass;
		this.name = nme;
		this.age = age;
		this.gender = gend;
		this.ic = ic;
		this.citizen = citizen;
		this.superuser = su;
	}

	//getters
	
}