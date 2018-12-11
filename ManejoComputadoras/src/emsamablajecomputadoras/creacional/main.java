package emsamablajecomputadoras.creacional;

public class main {
	public static void main(String args[]) {	  
	ComputadorDirector directorAsusRoge = new ComputadorDirector(new AsusROGEBuilder() );
	
	directorAsusRoge.ConstruirComputador();
	
	Computador asusroge= directorAsusRoge.getComputador();
	
	ComputadorDirector directorAsusZen = new ComputadorDirector(new AsusZenbook() );
	
	directorAsusZen.ConstruirComputador();
	
	Computador asuszen= directorAsusZen.getComputador();
	
    

	}
	
}
