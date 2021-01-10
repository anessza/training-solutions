package week0804;

import week07d05.TransmissionType;

public class Trainer {
    private CanMark canMark;

    public Trainer(CanMark canMark) {
        this.canMark= canMark;
    }

    int giveMark(){
        return canMark.giveMark();
    }

    public static void main(String[] args) {
        Trainer trainer = new Trainer(new GoodMood());
        Trainer trainer2 = new Trainer(new BadMood());
        System.out.println(trainer.giveMark());
        System.out.println(trainer2.giveMark());
    }
}
