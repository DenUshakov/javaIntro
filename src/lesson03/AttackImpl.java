package lesson03;

public class AttackImpl implements Attack {

    public AttackImpl(String attack, String move) {
        this.attack = attack;
        this.move = move;
    }

    String attack;
    String move;
    @Override
    public void attack() {
        move();
        System.out.println(attack);
    }

    @Override
    public void move() {
        System.out.println(move);
    }
}
