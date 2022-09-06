package patterns.MementoPattern.WhiteBox;

public class GameRole {
    private int hitPoint;
    private int manaPoint;
    private int atk;
    private int def;

    public void initState() {
        this.atk = 100;
        this.hitPoint = 1000;
        this.manaPoint = 500;
        this.def = 50;
    }

    public void fight() {
        this.atk = 0;
        this.hitPoint = 0;
        this.manaPoint = 0;
        this.def = 0;
    }

    public RoleStateMemento saveState() {
        return new
                RoleStateMemento.Builder().
                atk(this.atk).def(this.def).
                hitPoint(this.hitPoint).manaPoint(this.manaPoint).
                build();
    }

    public void recoverState(RoleStateMemento roleStateMemento) {
        this.manaPoint = roleStateMemento.getManaPoint();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
        this.hitPoint = roleStateMemento.getHitPoint();
    }

    public void stateDisplay() {
        System.out.println(
                "hitPoint=" + hitPoint +
                        ", manaPoint=" + manaPoint +
                        ", atk=" + atk +
                        ", def=" + def);
    }


    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getManaPoint() {
        return manaPoint;
    }

    public void setManaPoint(int manaPoint) {
        this.manaPoint = manaPoint;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
