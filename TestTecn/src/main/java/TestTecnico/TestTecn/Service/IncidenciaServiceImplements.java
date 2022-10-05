package TestTecnico.TestTecn.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TestTecnico.TestTecn.Model.Incidencia;
import TestTecnico.TestTecn.Repository.IncidenciaRepository;

@Service
public class IncidenciaServiceImplements  implements IncidenciaService{
	
	@Autowired
	private IncidenciaRepository incidenciaRepository;
	
	
	@Override
	public Incidencia saveIncidencia(Incidencia incidencia) {
		return incidenciaRepository.save(incidencia);
	}
	
	@Override
	public List<Incidencia> findAllIncidencias() {
		return incidenciaRepository.findAll();
	}
	
	@Override
	public boolean deletByIDincidencia (long id) {
		boolean exist = incidenciaRepository.existsById(id);
		if(exist) {
			incidenciaRepository.deleteById(id);
			return  incidenciaRepository.existsById(id);
		}
		return false;
		
	}

}
