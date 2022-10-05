package TestTecnico.TestTecn.Service;

import java.util.List;

import TestTecnico.TestTecn.Model.Computadora;

public interface ComputadoraService {
	
	
	Computadora saveComputadora(Computadora comutadora);
	List<Computadora> finAllComputadora();
	
	boolean deletByIDComputadora (long id);

}
