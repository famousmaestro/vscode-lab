package main.java.com.example;

abstract class Employee {
    abstract double calculateBonus();
}

class Manager extends Employee {
    @Override
    double calculateBonus() {
        return 5000;
    }
}

class Developer extends Employee {
    @Override
    double calculateBonus() {
        return 3000;
    }
}

class Intern extends Employee {
    @Override
    double calculateBonus() {
        return 1000;
    }
}
