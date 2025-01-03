package labirinto_minotauro.emun;

public enum MapEnum {
	
	MAP1("caso40_4.txt");
    
    private String filename;
 
    MapEnum(String filename) {
        this.filename = filename;
    }
 
    public String getFilename() {
        return filename;
    }
	

}
