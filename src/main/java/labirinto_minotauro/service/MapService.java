package labirinto_minotauro.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

import labirinto_minotauro.bean.MapBean;


public class MapService {
	
	private static final String RESOURCE_MAP = "/map/";

	public MapBean findByName(String name) {
		MapBean mapBean = new MapBean();
		String filename = RESOURCE_MAP+name;
        try {
        	BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(filename)));
            mapBean.setName(name);
            // load row and col
            String line = br.readLine();
            String[] dimension = line.split(" ");
            mapBean.setWidth(Integer.parseInt(dimension[0]));
            mapBean.setHeight(Integer.parseInt(dimension[1]));
            // load map data
            mapBean.setContent(new String[mapBean.getWidth()][mapBean.getHeight()]);
            for (int i=0; i<mapBean.getWidth(); i++) {
                line = br.readLine();
                for (int j=0; j<mapBean.getHeight(); j++) {
                    mapBean.getContent()[i][j] = line.charAt(j)+"";
                }
            }
        } catch (Exception e) {
            System.out.println("Filename: "+filename+" error "+e.getMessage());
        }
		
		return mapBean;
	}
	


}
