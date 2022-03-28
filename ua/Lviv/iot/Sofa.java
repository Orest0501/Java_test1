package ua.Lviv.iot;

public record Sofa (double width, Integer length, String colour, String brand){

    private static String matter = "Lether" ;

    private static String filler = "Synthetic fluff" ;

    private static String Housing_material = "Oak" ;

    public Sofa(){

        this (1.8, 2, "White", "IKEA" );
    }

    public Sofa(double width, Integer length, String colour){
        this(width, length, colour, "IKEA");

    }

    public static String GetMatter(String matter){
        return matter;
    }


    public String SofaToString() {
        return "width: "+width + " length: "+length().toString() + "  colour: " + colour().toString() + " brand: "+brand;
    }
}
