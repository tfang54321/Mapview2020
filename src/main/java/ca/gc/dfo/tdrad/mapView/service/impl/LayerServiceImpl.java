package ca.gc.dfo.tdrad.mapView.service.impl;

import org.springframework.stereotype.Service;

import ca.gc.dfo.tdrad.mapView.service.LayerService;

@Service
public class LayerServiceImpl  implements LayerService {

	@Override
    public String getSingleLayer(String layerName) {
    	
    	return "passed layer name ....."+layerName;
		
	}
    	
    	
	@Override
    public String getCompacities(String url_geo) {
    	
    	return "passed url of geo service to get compacities..."+url_geo;
    	
    }


}
