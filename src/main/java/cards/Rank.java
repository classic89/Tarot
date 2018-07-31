package cards;

// enum Rank{
//     ACE, PIP, COURT;
// }

public class Rank{
    private String name;
    private String symbol;

    private Rank( String nameValue, String symbolValue ){
        name = nameValue;
        symbol = symbolValue;
    }

    public final static Rank ACE = new Rank( "Ace", "a" );
}