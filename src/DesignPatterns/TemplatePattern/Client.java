package DesignPatterns.TemplatePattern;

public class Client {
    public static void main(String[] args) {
        CaffienBeverage coffe = new CoffeCaffeineBeverage();
        coffe.prepare();
        CaffienBeverage tea = new TeaCaffeinBeverage();
        tea.prepare();
//        output:
//        Milk added
//        coffe is being brewed
//        adding something
//        Sugar added
//        Milk added
//        Tea shreading
//        add Icecubes
//        Sugar added
    }
}
