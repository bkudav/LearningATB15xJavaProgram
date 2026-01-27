package ex_18_OOPs.Hierarchical;

public class Runner_Hierarchical {
    public static void main(String[] args) {
        Father f = new Father();
        System.out.println(f.gold_f);
        f.bhk();

        Son s = new Son();
        System.out.println(s.gold_s);
        System.out.println(s.gold_f);
        s.bhk4();
        s.bhk();

        Daughter d = new Daughter();
        System.out.println(d.gold_d);
        System.out.println(d.gold_f);
        d.apartment4();
        d.bhk();

    }
}
