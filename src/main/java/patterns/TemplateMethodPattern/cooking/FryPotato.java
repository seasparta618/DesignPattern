package patterns.TemplateMethodPattern.cooking;

public class FryPotato extends AbstractFry {

    @Override
    public void pourVegetable() {
        System.out.println("Put potato pieces in");
    }

    @Override
    public void pourSauce() {
        System.out.println("Add spicy source");
    }
}
