package homework1;

import com.sun.jdi.connect.Connector;

public class Person {
    private String fullName;
    private Integer age;


    public void setFullName(String name) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return this.fullName;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        return this.age;
    }
    public void  talk(){
        System.out.println(this.fullName + "  talk");
    }
    public void move(){
        System.out.println(this.fullName + " go");
    }


     //Constructor с параметрами заменяет сеттеры

    public Person(){};

    public Person(String fullName, Integer age) {
        this.fullName = fullName;
            this.age = age;
    }
    // name getter
//    public String getFullName(){
//
//        return this.fullName;
//    }
//    public void setFullName(){
//        this.fullName = fullName;
//    }
//     // age getter
//
//    public Integer getAge(){
//        return this.age;
//    }
//    public void setAge(){
//        this.age = age;
//    }


}
