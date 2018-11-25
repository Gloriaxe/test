package com.itheima.pojo;

import lombok.EqualsAndHashCode;

import java.util.Objects;





public class Person  implements Cloneable{
    private int age;
    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }
    @Override
    public int hashCode() {

        return Objects.hash(age, name);

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {

    }

    public Person(int age, String name) {

        this.age = age;
        this.name = name;
    }



    public static void main(String[] args) throws CloneNotSupportedException {
        Person person=new Person(1,"fs");
//        Person clone = (Person) person.clone();
//        System.out.println(person);
//        System.out.println(clone);
//        System.out.println( person.equals(clone)?"克隆地址一样":"克隆地址不一样");
        Person person1 = changeP(person);
        String name = person.getName();
        System.out.println(name);
        System.out.println(person1.getName());
    }

    public static Person changeP(Person person){
        person.setName("李四");
        return person;
    }
}
