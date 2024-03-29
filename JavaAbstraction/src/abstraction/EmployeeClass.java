package abstraction;

public abstract class EmployeeClass {
	
	public String name;
	public String id;
	public String address;
	public int age;
	
	public EmployeeClass() {
		
	}

	public EmployeeClass(String name, String id, String address, int age) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.age = age;
	}
	
	public abstract String getname();
	public abstract String getid();
	public abstract String getaddress();
	public abstract int getage();
	
	public abstract void _name();
	public abstract void _id();
	public abstract void _address();
	public abstract void _age();
}
