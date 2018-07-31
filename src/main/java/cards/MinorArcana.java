package cards;

public class MINORArcana{
    private String name;
    private String symbol;

    private MINORArcana( String nameValue, String symbolValue ){
        name = nameValue;
        symbol = symbolValue;
    }

    public final static MINORArcana ACE = new MINORArcana( "Ace", "a" );
    public final static MINORArcana TWO = new MINORArcana( "Two", "2" );
    public final static MINORArcana THREE = new MINORArcana( "Three", "3" );
    public final static MINORArcana FOUR = new MINORArcana( "FOUR", "4" );
    public final static MINORArcana FIVE = new MINORArcana( "FIVE", "5" );
    public final static MINORArcana SIX = new MINORArcana( "SIX", "6" );
    public final static MINORArcana SEVEN = new MINORArcana( "SEVEN", "7" );
    public final static MINORArcana EIGHT = new MINORArcana( "EIGHT", "8" );
    public final static MINORArcana NINE = new MINORArcana( "NINE", "9" );
    public final static MINORArcana TEN = new MINORArcana( "TEN", "t" );
    public final static MINORArcana PAGE = new MINORArcana( "PAGE", "p" );
    public final static MINORArcana JACK = new MINORArcana( "JACK", "j" );
    public final static MINORArcana QUEEN = new MINORArcana( "QUEEN", "q" );
    public final static MINORArcana KING = new MINORArcana( "KING", "k" );

}