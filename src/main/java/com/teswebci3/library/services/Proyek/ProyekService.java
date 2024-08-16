package com.teswebci3.library.services.Proyek;

import com.teswebci3.library.payloads.requests.ProyekRequest;
import com.teswebci3.library.payloads.responses.Response;

public interface ProyekService {
    Response addNamaProyek(ProyekRequest request);

    Response getNamaProyeks();

    Response getNamaProyekById(String uuid);

    Response updateNamaProyekById(String uuid, ProyekRequest request);

    Response deleteNamaProyekById(String uuids);
}