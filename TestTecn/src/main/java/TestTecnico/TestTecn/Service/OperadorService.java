package TestTecnico.TestTecn.Service;

import java.util.List;

import TestTecnico.TestTecn.Model.Operador;

public interface OperadorService {
	
	Operador  saveOperador (Operador operador);
	boolean deletByOperaador (long id);
	 List<Operador> finAllOperador();
	 
	
	
	

}
