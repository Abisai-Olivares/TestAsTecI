package TestTecnico.TestTecn.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TestTecnico.TestTecn.Model.Incidencia;
import TestTecnico.TestTecn.Model.Operador;
import TestTecnico.TestTecn.Service.OperadorService;

@RestController
@RequestMapping(value="/apiOperador")
public class ControllerOperador {
	
	@Autowired
	private OperadorService operadorService;
	
	@PostMapping("/saveoperador")
	public ResponseEntity<Operador> saveOperador(@RequestBody Operador operador){
		Operador persona = operadorService.saveOperador(operador);
		return new ResponseEntity(persona,HttpStatus.CREATED);
	}

	
	
	@GetMapping("/finalOperadores")
	public List<Operador> finAllIncidencia(){
		return operadorService.finAllOperador();
	}
	
}
