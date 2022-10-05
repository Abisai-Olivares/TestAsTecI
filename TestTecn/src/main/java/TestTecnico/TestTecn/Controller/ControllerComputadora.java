package TestTecnico.TestTecn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TestTecnico.TestTecn.Model.Computadora;
import TestTecnico.TestTecn.Service.ComputadoraService;

@RestController
@RequestMapping(value="/apiComputadora")
public class ControllerComputadora {
	
	
	@Autowired
	private ComputadoraService computadoraService;
	
	
	public ResponseEntity<Computadora> saveComputadora(@RequestBody Computadora computadora){
		Computadora compu= computadoraService.saveComputadora(computadora);
		return new ResponseEntity(compu,HttpStatus.CREATED);
	}

}
