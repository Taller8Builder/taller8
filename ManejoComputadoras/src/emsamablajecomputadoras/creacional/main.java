package emsamablajecomputadoras.creacional;

public class main {
	public static void main(String args[]) {	  
	ComputadorDirector directorAsusRoge = new ComputadorDirector(new AsusRogeBuilder() );
	
	directorAsusRoge.ConstruirComputador();
	
	Computador asusroge= directorAsusRoge.GetComputador();
	
	ComputadorDirector directorAsusZen = new ComputadorDirector(new AsusZenbookBuilder() );
	
	directorAsusZen.ConstruirComputador();
	
	Computador asuszen= directorAsusZen.GetComputador();
	
	System.out.println(asusroge.especificacionesTecnicas());
	System.out.println(asuszen.especificacionesTecnicas());


	}
	
}
