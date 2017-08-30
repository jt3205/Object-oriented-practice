package Test13;

public class SubEntry extends Entry{
	String definition; 
    int year;
    
    SubEntry(String w){
    		super(w);
    }
    SubEntry(String w, String d, int y){
    		this(w);
    		this.definition = d;
    		this.year = y;
    		printView();
    }
    public void printView() {
    		System.out.println("원어 : "+definition);
    		System.out.println("년도 : "+year);
    }

}
