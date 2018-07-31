package cards;

public class MinorArcana{
    private String name;
    private String symbol;
    private String rank;

    MinorArcana( String nameValue, String symbolValue ){
        name = nameValue;
        symbol = symbolValue;
    }

    public final static MinorArcana ACE = new MinorArcana( "Ace", "a" );
    public final static MinorArcana TWO = new MinorArcana( "Two", "2" );
    public final static MinorArcana THREE = new MinorArcana( "Three", "3" );
    public final static MinorArcana FOUR = new MinorArcana( "FOUR", "4" );
    public final static MinorArcana FIVE = new MinorArcana( "FIVE", "5" );
    public final static MinorArcana SIX = new MinorArcana( "SIX", "6" );
    public final static MinorArcana SEVEN = new MinorArcana( "SEVEN", "7" );
    public final static MinorArcana EIGHT = new MinorArcana( "EIGHT", "8" );
    public final static MinorArcana NINE = new MinorArcana( "NINE", "9" );
    public final static MinorArcana TEN = new MinorArcana( "TEN", "t" );
    public final static MinorArcana PAGE = new MinorArcana( "PAGE", "p" );
    public final static MinorArcana JACK = new MinorArcana( "JACK", "j" );
    public final static MinorArcana QUEEN = new MinorArcana( "QUEEN", "q" );
    public final static MinorArcana KING = new MinorArcana( "KING", "k" );

}