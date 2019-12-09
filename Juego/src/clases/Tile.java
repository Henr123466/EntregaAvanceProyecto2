package clases;

import importar.Juego;
import javafx.scene.canvas.GraphicsContext;

public class Tile extends ClasePadre {
        private int altoImagen;
	private int anchoImagen;
	private int xImagen;
	private int yImagen;
	public Tile(int x, int y,int anchoImagen,int altoImagen,int xImagen,int yImagen, String indiceImagen, int velocidad) {
		super(x, y, indiceImagen, velocidad);
		this.altoImagen = altoImagen;
		this.anchoImagen = anchoImagen;
		this.xImagen = xImagen;
		this.yImagen = yImagen;
	}


	public Tile(int tipoTile,int x, int y, String indiceImagen, int velocidad){
		super(x, y, indiceImagen, velocidad);
		switch(tipoTile){
			case 1:
				this.altoImagen = 136;
				this.anchoImagen = 140;
				this.xImagen =650;
				this.yImagen = 0;
			break;
			case 2:
				this.altoImagen = 104;
				this.anchoImagen = 92;
				this.xImagen = 664;
				this.yImagen = 156;
			break;
			
			
		}
		
	}


	public int getAltoImagen() {
		return altoImagen;
	}


	public void setAltoImagen(int altoImagen) {
		this.altoImagen = altoImagen;
	}


	public int getAnchoImagen() {
		return anchoImagen;
	}


	public void setAnchoImagen(int anchoImagen) {
		this.anchoImagen = anchoImagen;
	}


	public int getxImagen() {
		return xImagen;
	}


	public void setxImagen(int xImagen) {
		this.xImagen = xImagen;
	}


	public int getyImagen() {
		return yImagen;
	}


	public void setyImagen(int yImagen) {
		this.yImagen = yImagen;
	}
	
	public void pintar(GraphicsContext graficos) {
		graficos.drawImage(
			Juego.imagenes.get(this.indiceImagen), 
			this.xImagen, this.yImagen, 
			this.anchoImagen, this.altoImagen, 
			this.x, this.y,
			this.anchoImagen, this.altoImagen
		); 
	}
}
