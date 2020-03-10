package ca.gc.dfo.tdrad.mapView.restful;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.gc.dfo.tdrad.mapView.constants.ServicePath;
import ca.gc.dfo.tdrad.mapView.service.LayerService;



@RestController
@RequestMapping(ServicePath.mapView_PATH)
public class MapViewRestfulService {

	@Autowired
	LayerService lservice;
	
	
	@GetMapping(ServicePath.compacities_PATH+"/{url_geo}")
	public String getCompacites(@PathVariable String url_geo) {
		
		return lservice.getCompacities(url_geo);
	}
	
	@GetMapping(ServicePath.layer_PATH+"/{layerName}")
	public String getLayerContents(@PathVariable String layerName) {
		
		return lservice.getSingleLayer( layerName);
	}


}
