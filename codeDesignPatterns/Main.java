package codeDesignPatterns;

import codeDesignPatterns.abstraction.MailService;
import codeDesignPatterns.dependentClasses.User;
import codeDesignPatterns.encapsulation.Account;
import codeDesignPatterns.inheritence.SubmitButton;
import codeDesignPatterns.inheritence.TextBox;
import codeDesignPatterns.looselyCoupled.TaxCalculator;
import codeDesignPatterns.looselyCoupled.TaxCalculator2024;
import codeDesignPatterns.memento.Editor;
import codeDesignPatterns.polymorphism.Circle;
import codeDesignPatterns.polymorphism.Rectangle;
import codeDesignPatterns.polymorphism.Shape;

public class Main {
    public static void main(String[] args) {

        //dependent classes
        User user = new User("user1");
        System.out.println(user.name);
        user.HelloUser();

        //loosely coupled
        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();

        //encapsulation
        var account = new Account();
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());

        //abstraction
        var mailservice = new MailService();
        mailservice.sendEmail();

        //inheritance
        var textbox = new TextBox();
        textbox.enable();
        var submitButton = new SubmitButton();
        submitButton.enable();

        //polymorphism
        calculateArea(new Circle(3));
        calculateArea(new Rectangle(5,4));

        //momento
        var editor = new Editor();
    }
    //loosely coupled
    public static TaxCalculator getCalculator(){
        return new TaxCalculator2024();
    }

    //polymorphism
    public static void calculateArea(Shape shape){
        double area = shape.calculateArea();
        System.out.println(area);
    }
}
