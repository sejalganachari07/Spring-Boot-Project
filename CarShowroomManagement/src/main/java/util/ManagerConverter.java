package util;

import org.springframework.beans.BeanUtils;

import com.CarShowroomManagement.entity.Manager;
import com.CarShowroomManagement.model.ManagerDTO;

public class ManagerConverter {
	public ManagerDTO  convertEntityToShowroomManagerDTO (Manager sm)
	{
		ManagerDTO showroommanagerDTO = new ManagerDTO();
		if(sm!=null)
		{
			BeanUtils.copyProperties(sm, showroommanagerDTO);
			
		}
		return showroommanagerDTO;
		
	}
	public ManagerConverter convertDTOToShowroomManager (ManagerDTO ShowroommanagerDTO)
	{
		ManagerConverter sm= new ManagerConverter();
		if(ShowroommanagerDTO != null)
		{
			BeanUtils.copyProperties(ShowroommanagerDTO, sm);
			
			
		}
		return sm;
	}}


