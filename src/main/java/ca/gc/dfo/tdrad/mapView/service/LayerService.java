package ca.gc.dfo.tdrad.mapView.service;

import org.springframework.stereotype.Service;

@Service
public interface LayerService {


    public String getSingleLayer(String layerName);
    public String getCompacities(String url_geo);

}
