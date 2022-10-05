package TestTecnico.TestTecn.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TestTecnico.TestTecn.Model.Computadora;
import TestTecnico.TestTecn.Model.Operador;
import TestTecnico.TestTecn.Repository.OperadorRepository;

@Service
public class OperadorServiceImplements implements OperadorService {
	
	@Autowired
	private OperadorRepository operadorRepository;
	
	
	@Override
	public Operador  saveOperador (Operador operador) {
		return operadorRepository.save(operador);
		
	}
	
	@Override 
	public List<Operador> finAllOperador(){
		return operadorRepository.findAll();
		
	}
	
	
	@Override
	public boolean deletByOperaador (long id) {
		boolean exist = operadorRepository.existsById(id);
		if(exist) {
			operadorRepository.deleteById(id);
			return  operadorRepository.existsById(id);
		}
		return false;
		
	}
	
	
	

}
