package ua.Lviv.iot;

public class Main {
    public static void main(String args[]) {
        String colour = "Grey";
        Sofa sofa = new Sofa();
        Sofa sofa2 = new Sofa(1.7, 2, colour, "JYSK");
        Sofa sofa3 = new Sofa(1.8, 2, colour);

        System.out.println(sofa.SofaToString());

        System.out.println(sofa2.SofaToString());

        System.out.println(sofa3.SofaToString());

        System.out.println(sofa.GetMatter(colour));

    }


}
