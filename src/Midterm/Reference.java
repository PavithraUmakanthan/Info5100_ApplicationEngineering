package Midterm;

public class Reference extends Book{

    public String dictionaries;
    public String encyclopedia;

    public String getDictionaries() {
        return dictionaries;
    }

    public String getEncyclopedia() {
        return encyclopedia;
    }

    public void setDictionaries(String dictionaries) {
        this.dictionaries = dictionaries;
    }

    public void setEncyclopedia(String encyclopedia) {
        this.encyclopedia = encyclopedia;
    }

    public Reference(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public String description( ) {
        return ( "WorldMaps all information is real");
    }

}


