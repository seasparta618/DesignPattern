package patterns.TemplateMethodPattern.cooking;

import org.junit.Test;

public class Client {

    @Test
    public void test() {
        AbstractFry fryCauliflower = new FryCauliflower();
        fryCauliflower.cookProcess();
        AbstractFry fryPotato = new FryPotato();
        fryPotato.cookProcess();
    }
}
