package patterns.MementoPattern.WhiteBox;

import javax.management.relation.Role;

public class RoleStateMemento {
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



    private RoleStateMemento(Builder builder) {
        this.hitPoint = builder.hitPoint;
        this.manaPoint = builder.manaPoint;
        this.atk = builder.atk;
        this.def = builder.def;
    }

    public static final class Builder {
        private int hitPoint;
        private int manaPoint;
        private int atk;
        private int def;

        public Builder hitPoint(int hitPoint) {
            this.hitPoint = hitPoint;
            return this;
        }

        public Builder manaPoint(int manaPoint) {
            this.manaPoint = manaPoint;
            return this;
        }

        public Builder atk(int atk) {
            this.atk = atk;
            return this;
        }

        public Builder def(int def) {
            this.def = def;
            return this;
        }

        public RoleStateMemento build() {
            return new RoleStateMemento(this);
        }
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
