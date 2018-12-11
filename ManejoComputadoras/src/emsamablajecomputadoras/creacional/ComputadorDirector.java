package emsamablajecomputadoras.creacional;

public class ComputadorDirector {
	private ComputadorBuilder builder;
	
	public ComputadorDirector(ComputadorBuilder builder) {
		this.builder = builder;
	}
	
	public void ConstruirComputador() {
		//orden de proceso de construccion
		builder.definirCaracteristicas();
		builder.definirModelo();
		builder.construirMainboard();
		builder.definirSO();
	}
	
	public Computador GetComputador() {
		return builder.getComputador();
	}
	
}
