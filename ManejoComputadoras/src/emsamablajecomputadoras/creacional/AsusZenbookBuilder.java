package emsamablajecomputadoras.creacional;

public class AsusZenbookBuilder extends ComputadorBuilder {
	public void definirCaracteristicas() {
		c = new Computador();
		c.setMarca("Asus");
		//c.setCoolerExterno(coolerExterno);
		c.setAlmacenamiento(500);
		c.setRam(16);
	}
	public void  definirModelo() {
		c.setModelo("Zenbook");
	}
	public void  construirMainboard() {
		c.setPlaca(new Mainboard("Prime","Z370"));
	}
	public void  definirSO() {
		c.setOs(new SistemaOperativo("Windows",64,"10 HOME"));
	}
}
