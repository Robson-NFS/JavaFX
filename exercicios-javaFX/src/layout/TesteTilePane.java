package layout;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;

public class TesteTilePane extends TilePane{
	
	public TesteTilePane () {
		List<Quadrado> quadrados = new ArrayList<>();
		
		for (int i = 0; i < 10 ; i++) {
			quadrados.add(new Quadrado(i * 10));
		}
	
		setVgap(10);
		setHgap(10);
		
		setOrientation(Orientation.VERTICAL);
		setTileAlignment(Pos.BOTTOM_RIGHT);
		
		getChildren().addAll(quadrados);
	}

}
