package TestTecnico.TestTecn.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TestTecnico.TestTecn.Model.Incidencia;
import TestTecnico.TestTecn.Service.IncidenciaService;

@RestController
@RequestMapping(value="/apiIncidencia")
public class ControllerIncidencia {
	
	
	@Autowired
	private IncidenciaService incidenciaService;
	
	
	@PostMapping("/saveIncidencia")
	public ResponseEntity<Incidencia> saveIncidencia(@RequestBody Incidencia incidencia){
		Incidencia inciden= incidenciaService.saveIncidencia(incidencia);
		return new ResponseEntity(inciden,HttpStatus.CREATED);
		
				}
	
	
	@GetMapping("/GetIncidenciaByID/{byID}")
	public ResponseEntity<Incidencia>  finAllIncidencias(@PathVariable("byID")int byID){
		
		List<Incidencia> incidenTemp= incidenciaService.findAllIncidencias();
		Incidencia nuevoIn= new Incidencia ();
		
		for (Incidencia incidencia : incidenTemp) {
			if(incidencia.getIdIncidencia()==byID) {
				nuevoIn=incidencia;
			}
		}
		
		return new ResponseEntity(nuevoIn,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/GetIncidenciaByID/{byNameOperador}")
	public ResponseEntity<Incidencia>  finAllIncidencias(@PathVariable("byNameOperador")String  byNameOperador){
		
		List<Incidencia> incidenTemp= incidenciaService.findAllIncidencias();
		Incidencia nuevoIn= new Incidencia ();
		
		for (Incidencia incidencia : incidenTemp) {
			if(incidencia.getNombreOperador().equalsIgnoreCase(byNameOperador)) {
				nuevoIn=incidencia;
			}
		}
		
		return new ResponseEntity(nuevoIn,HttpStatus.ACCEPTED);
	}
	
	
	
	

	@GetMapping("/finallIncidencias")
	public List<Incidencia> finAllIncidencia(){
		return incidenciaService.findAllIncidencias();
	}
	
	
}
