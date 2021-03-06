package com.list; 
/** 
 * @author yyj 
 * @version CreateTime：2019年4月15日 下午5:28:37 
 * 
 */
public class Person {
    private String id;
    private String name;
    private int age;
     
    public Person(String id, String name, int age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
    
}
 