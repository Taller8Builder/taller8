package emsamablajecomputadoras.creacional;

public class AsusRogeBuilder extends ComputadorBuilder {
	public void definirCaracteristicas() {
		c = new Computador();
		c.setMarca("Asus");
		//c.setCoolerExterno(coolerExterno);
		c.setAlmacenamiento(1000);
		c.setRam(32);
	}
	public void  definirModelo() {
		c.setModelo("ROG");
	}
	public void  construirMainboard() {
		c.setPlaca(new Mainboard("Strix","x99"));
	}
	public void  definirSO() {
		c.setOs(new SistemaOperativo("Windows",64,"10 PRO"));
	}
}
