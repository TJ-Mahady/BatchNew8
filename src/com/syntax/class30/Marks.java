package com.syntax.class30;

public abstract class Marks {
    /*We have to calculate the average of marks obtained in three subjects by student A and by student B.
    Create class 'Marks' with an abstract method 'getPercentage'
    that will be returning the average percentage of marks.
    Provide implementation of abstract method in classes 'A' and 'B'.
    The constructor of student A takes the marks in three subjects as its parameters
    and the marks in four subjects as its parameters for student B. Test your code*/
    abstract double getPercentage();
}
class A extends Marks {
    double subject1, subject2, subject3;
    double average;
    A(double sub1, double sub2, double sub3) {
        this.subject1 = sub1;
        this.subject2 = sub2;
        this.subject3 = sub3;
    }
    @Override
    double getPercentage() {
        average = (subject1 + subject2 + subject3) / 3;
        return average;
    }
}
class B extends Marks {
    double subject1, subject2, subject3, subject4;
    double average;
    B(double sub1, double sub2, double sub3, double sub4) {
        this.subject1 = sub1;
        this.subject2 = sub2;
        this.subject3 = sub3;
        this.subject4 = sub4;
    }
    @Override
    double getPercentage() {
        average = (subject1 + subject2 + subject3 + subject4) / 4;
        return average;
    }
}
class MarksTester {
    public static void main(String[] args) {
        A objA = new A(90, 94.5, 87);
        B objB = new B(98, 97.5, 76, 89);
        System.out.println(objA.getPercentage());
        System.out.println(objB.getPercentage());
    }
}
