package emsamablajecomputadoras.creacional;

public abstract class ComputadorBuilder {
	protected Computador c;
	
	public Computador getComputador() {
		return c;
	}
	
	public abstract void construirMainboard();
	public abstract void definirSO();
	public abstract void definirCaracteristicas();
	public abstract void definirModelo();
	 
}
