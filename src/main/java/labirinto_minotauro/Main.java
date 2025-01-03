package labirinto_minotauro;

import labirinto_minotauro.bean.MapBean;
import labirinto_minotauro.emun.MapEnum;
import labirinto_minotauro.service.MapService;

public class Main {

	public static void main(String[] args) {
		MapService mapService = new MapService();
		MapBean mapBean = mapService.findByName(MapEnum.MAP1.getFilename());
		System.out.println(mapBean.toString());

	}

}
