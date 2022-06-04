package idat.pe.JavierCcasaniMicroservicio.service;

import java.util.List;

import idat.pe.JavierCcasaniMicroservicio.dto.RopaRequestDTO;
import idat.pe.JavierCcasaniMicroservicio.dto.RopaResponseDTO;

public interface RopaService {

	public void guardarRopa(RopaRequestDTO r);
	public void eliminaRopa(Integer id);
	public void editarRopa(RopaRequestDTO r);
	public  List<RopaResponseDTO> listarRopa();
	public RopaResponseDTO ropaById(Integer id);
}
