package TestTecnico.TestTecn.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TestTecnico.TestTecn.Model.Computadora;
import TestTecnico.TestTecn.Repository.ComputadoraRepository;

@Service
public class ComputadoraServiceImplements  implements ComputadoraService{
	
	
	@Autowired   
	private ComputadoraRepository comoutadoraRepository;
	

	public Computadora saveComputadora(Computadora comutadora) {
		return comoutadoraRepository.save(comutadora);
		
		
		
	}
	@Override 
	public List<Computadora> finAllComputadora(){
		return comoutadoraRepository.findAll();
		
	}
	
	
	@Override
	public boolean deletByIDComputadora (long id) {
		boolean exist = comoutadoraRepository.existsById(id);
		if(exist) {
			comoutadoraRepository.deleteById(id);
			return  comoutadoraRepository.existsById(id);
		}
		return false;
		
	}

}
