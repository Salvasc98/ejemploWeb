package edu.dws.ejemploWebClase.web.controladores;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorSegunda {
	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping(value="/segunda")
	public ModelAndView gestionSolicitud() {
		logger.info("Navegamos a la vista segunda");
		Map<String, Object> miModelo = new HashMap<String, Object>();
		miModelo.put("mensaje", "Todo ok");
		return new ModelAndView("segunda", "miModelo", miModelo);
	}
}
