package cards;

public class MajorArcana{
    private String name;
    private int number;
    private String rank;

    private MajorArcana( String nameValue, int numberValue ){
        name = nameValue;
        number = numberValue;
    }

    public final static MajorArcana JOKER_ARCANA = new MajorArcana( "Fool", 0 );
    public final static MajorArcana ONE_ARCANA = new MajorArcana( "Magician", 1 );
    public final static MajorArcana TWO_ARCANA = new MajorArcana( "High Priestess", 2 );
    public final static MajorArcana THREE_ARCANA = new MajorArcana( "Empress", 3 );
    public final static MajorArcana FOUR_ARCANA = new MajorArcana( "Emperor", 4 );
    public final static MajorArcana FIVE_ARCANA = new MajorArcana( "Hierophant", 5 );
    public final static MajorArcana SIX_ARCANA = new MajorArcana( "Lovers", 6 );
    public final static MajorArcana SEVEN_ARCANA = new MajorArcana( "Chariot", 7 );
    public final static MajorArcana EIGHT_ARCANA = new MajorArcana( "Strength", 8 );
    public final static MajorArcana NINE_ARCANA = new MajorArcana( "Hermit", 9 );
    public final static MajorArcana TEN_ARCANA = new MajorArcana( "Fortune", 10 );
    public final static MajorArcana ELEVEN_ARCANA = new MajorArcana( "Justice", 11 );
    public final static MajorArcana TWELVE_ARCANA = new MajorArcana( "Hanged Man", 12 );
    public final static MajorArcana THRIRTEEN_ARCANA = new MajorArcana( "Death", 13 );
    public final static MajorArcana FOURTEEN_ARCANA = new MajorArcana( "Temperance", 14 );
    public final static MajorArcana FIFTEEN_ARCANA = new MajorArcana( "Devil", 15 );
    public final static MajorArcana SIXTEEN_ARCANA = new MajorArcana( "Tower", 16 );
    public final static MajorArcana SEVENTEEN_ARCANA = new MajorArcana( "Star", 17 );
    public final static MajorArcana EIGHTTEEN_ARCANA = new MajorArcana( "Moon", 18 );
    public final static MajorArcana NINETEEN_ARCANA = new MajorArcana( "Sun", 19 );
    public final static MajorArcana TWENTY_ARCANA = new MajorArcana( "Judgement", 20 );
    public final static MajorArcana TWENTYONE_ARCANA = new MajorArcana( "World", 21 );

}