/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples.serialization;

import java.io.Serializable;

/**
 *
 * @author Denis
 */
public class Dog extends Animal implements Serializable {

    private String name;
    private int age;
    private static final long serialVersionUID = 1L;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
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
        return "Dog{" + "name=" + name + ", age=" + age +", color="+getColor()+"}";
    }

}
