package com.huang.javase.Array;

public class Homework01 {
    public static void main(String[] args) {
        Army army = new Army(4);
        try {
            army.addWeapon(new TanK());
            army.addWeapon(new TanK());
            army.addWeapon(new TanK());
            army.addWeapon(new TanK());
            army.addWeapon(new TanK());
        } catch (AddWeaponException e) {
            System.out.println(e.getMessage());
        }

        army.attackAll();
        army.moveAll();
    }
}

//军队
class Army{
    private Weapon[] weapons;
    private int num = 0;

    public Army() {
    }

    public Army(int count) {
        this.weapons = new Weapon[count];
    }

    public void addWeapon(Weapon wa) throws AddWeaponException {
        if(num > weapons.length - 1){
            throw new AddWeaponException("武器库已达上限。");
        }
        weapons[num++] = wa;
    }

    public void attackAll(){
        for (int i = 0; i < weapons.length; i++) {
            if(weapons[i] instanceof Shootable){
                //调用子类特有的方法，向下转型
                Shootable shootable = (Shootable)weapons[i];
                shootable.shoot();
            }
        }
    }

    public void moveAll(){
        for (int i = 0; i < weapons.length; i++) {
            if(weapons[i] instanceof Moveable){
                Moveable moveable = (Moveable)weapons[i];
                moveable.move();
            }
        }
    }
}

class Weapon{
}

class TanK extends Weapon implements Shootable, Moveable{
    @Override
    public void move() {
        System.out.println("坦克移动");
    }

    @Override
    public void shoot() {
        System.out.println("坦克开炮");
    }
}

interface Moveable{
    void move();
}

interface Shootable {
    void shoot();
}

class AddWeaponException extends Exception{
    public AddWeaponException() {

    }

    public AddWeaponException(String message) {
        super(message);
    }
}