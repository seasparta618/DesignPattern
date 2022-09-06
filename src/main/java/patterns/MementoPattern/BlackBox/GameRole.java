package patterns.MementoPattern.BlackBox;

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

    private class RoleStateMemento implements Memento {
        private int hitPoint;
        private int manaPoint;
        private int atk;
        private int def;

        public RoleStateMemento(int hitPoint, int manaPoint, int atk, int def) {
            this.hitPoint = hitPoint;
            this.manaPoint = manaPoint;
            this.atk = atk;
            this.def = def;
        }

        public RoleStateMemento() {
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

    public Memento saveState() {
        return new RoleStateMemento(this.hitPoint, this.manaPoint, this.atk, this.def);
    }

    public void recoverState(Memento memento) {
        RoleStateMemento roleStateMemento = (RoleStateMemento) memento;
        this.manaPoint = roleStateMemento.getManaPoint();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
        this.hitPoint = roleStateMemento.getHitPoint();
    }

    public void stateDisplay() {
        System.out.println("hitPoint=" + hitPoint + ", manaPoint=" + manaPoint + ", atk=" + atk + ", def=" + def);
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
