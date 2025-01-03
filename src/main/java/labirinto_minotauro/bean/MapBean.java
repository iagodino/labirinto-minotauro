package labirinto_minotauro.bean;

import java.util.Arrays;

public class MapBean {

	private String name;
	private int width;
	private int height;
	private String[][] content;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String[][] getContent() {
		return content;
	}
	public void setContent(String[][] content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "MapBean [name=" + name + ", width=" + width + ", height=" + height + ", content="
				+ toString(content)+ "]";
	}
	private String toString(String[][] content2) {
		String contentString = "\n";
		for (int i = 0; i < width; i++) {
	        for (int j = 0; j < height; j++) {
	        	contentString+=content2[i][j];
	        }
	        contentString+="\n";
		}
		return contentString;
	}
	
	
}
