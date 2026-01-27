package ex_18_OOPs.multilevelInheritance;

public class Runner_multilevelInheritance {
    public static void main(String[] args) {
        //GrandFather
        GrandFather gf = new GrandFather();
        System.out.println(gf.gold_gf);
        gf.villa();

        //Father
        Father f = new Father();
        System.out.println(f.gold_f);
        System.out.println(f.gold_gf);
        f.bungalow();
        f.villa();

        //Son
        Son s = new Son();
        System.out.println(s.gold_s);
        System.out.println(s.gold_f);
        System.out.println(s.gold_gf);
        s.bhk4();
        s.land();
        s.bungalow();
        s.villa();

    }
}
