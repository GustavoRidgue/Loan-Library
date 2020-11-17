package com.library.person;

public abstract class Person {
    private String name;
    private int age;
    private String cpf;
    private double money;
    private double salary;
    private boolean working;

    public void receiveSalary() {
        if (this.isWorking()) {
            this.setMoney(this.getMoney() + this.getSalary());
        } else {
            System.out.println("You aren't working to receive salary!");
        }
    }

    public void toWork(Double salary) {
        if (salary > 5000 && salary < 400) {
            System.out.println("The salary is too high!");
        } else {
            this.setSalary(salary);
            this.setWorking(true);
        }
    }

    public void stopWorking() {
        this.setSalary(0);
        this.setWorking(false);
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

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isWorking() {
        return working;
    }
    public void setWorking(boolean working) {
        this.working = working;
    }
}
