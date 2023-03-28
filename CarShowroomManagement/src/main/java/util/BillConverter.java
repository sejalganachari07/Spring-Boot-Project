package util;

import org.springframework.beans.BeanUtils;

import com.CarShowroomManagement.entity.Bill;
import com.CarShowroomManagement.model.BillDTO;

public class BillConverter {
	public BillDTO  convertEntityToShopManagerDTO (Bill sm)
	{
		BillDTO billDTO = new BillDTO();
		if(sm!=null)
		{
			BeanUtils.copyProperties(sm, billDTO);
			
		}
		return billDTO;
		
	}
	public BillConverter convertDTOToBillManager (BillDTO billDTO)
	{
		BillConverter sm= new BillConverter();
		if(billDTO != null)
		{
			BeanUtils.copyProperties(billDTO, sm);
			
			
		}
		return sm;
	}
	

}
