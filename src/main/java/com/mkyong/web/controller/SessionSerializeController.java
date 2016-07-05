package com.mkyong.web.controller;

import com.alibaba.fastjson.annotation.JSONField;
import org.msgpack.MessagePack;
import org.msgpack.annotation.Message;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by czc
 */
@Controller
@RequestMapping("/serialize/*")
public class SessionSerializeController {


    public static void main(String[] args) throws Exception {
        Student student = new Student("李四",20);
        Person person = new Person("lisi",20);
        student.setPerson(person);

        MessagePack msgpack = new MessagePack();
        MessagePack messagePack1 = new MessagePack();
        byte[] bytes = messagePack1.write(student);

        Student student1 = msgpack.read(bytes,Student.class);

        System.out.println(student.getClass().getName());

    }




}
@Message
class Person {

    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age=age;
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
}

@Message
class Student {
    @Field
    private String name;

    @Field
    private int age;

    @JSONField
    private  Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Student(String name, int age){
        this.name = name;
        this.age=age;
    }
    public Student(){}

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
}

@Message
class Students {

    @Field
    public String name;

    @Field
    public int age;

    public Students(String name,int age){
        this.name = name;
        this.age=age;
    }
    public Students(){}

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
}