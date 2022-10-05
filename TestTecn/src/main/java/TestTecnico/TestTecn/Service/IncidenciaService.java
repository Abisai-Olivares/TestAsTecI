package TestTecnico.TestTecn.Service;

import java.util.List;

import TestTecnico.TestTecn.Model.Incidencia;

public interface IncidenciaService {
	
	Incidencia saveIncidencia(Incidencia incidencia);
	
	List<Incidencia> findAllIncidencias();
	
	boolean deletByIDincidencia (long id) ;

}
