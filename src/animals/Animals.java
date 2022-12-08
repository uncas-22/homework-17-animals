package animals;

import java.util.Objects;

public class Animals {
    private String nameAnimals;
    private int ageAnimals;
    public Animals (String name, int age) {
        setName(name);
        if (age > 0) {
            this.age = age;
} else{
        this.age=0;
        }
        }

public String getName(){
        return name;
public void go(){

        }

public void sleep(){

        }

public void eat(){

        }

public String getNameAnimals(){
        return nameAnimals;
        }

public void setName(String name){
        if(name!=null&&!name.isBlank()&&!name.isEmpty()){
        this.name=name;
        }
        }

public int getAge(){
        return age;
        }

@Override
public boolean equals(Object o){
        if(this==o)return true;
        if(o==null||getClass()!=o.getClass())return false;
        Animals animals=(Animals)o;
        return ageAnimals==animals.ageAnimals&&Objects.equals(nameAnimals,animals.nameAnimals);
        }

@Override
public int hashCode(){
        return Objects.hash(nameAnimals,ageAnimals);
        }

public String toString(){
        return"Кличка -"+getNameAnimals()+", возраст: "+getAgeAnimals();
        }
        }
