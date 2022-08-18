package patterns.TemplateMethodPattern.cooking;

public class FryCauliflower extends AbstractFry {
    @Override
    public void pourVegetable() {
        System.out.println("Pour cauliflower blocks into");
    }

    @Override
    public void pourSauce() {

        System.out.println("Pour Italian sauce");
    }
}
