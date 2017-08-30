package Test13;

public class Entry {
	String word;
	Entry() {
		System.out.println("***** 약어사전 *****");
	}
    Entry(String word) {
    		this();
    		this.word = word;
    		writeView();
    }
    public void writeView() {
    		System.out.println("약어 : "+word);
    }

}
