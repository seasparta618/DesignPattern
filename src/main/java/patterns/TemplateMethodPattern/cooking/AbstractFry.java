package patterns.TemplateMethodPattern.cooking;

public abstract class AbstractFry {

    public final void cookProcess() {
        this.pourOil();
        this.heatOil();
        this.pourVegetable();
        this.pourSauce();
        this.fry();
    }

    public void pourOil() {
        System.out.println("Pour oil");
    }

    public void heatOil() {
        System.out.println("Heat oil");
    }

    public abstract void pourVegetable();

    public abstract void pourSauce();

    public void fry() {
        System.out.println("Frying Frying");
    }
}
