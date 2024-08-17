package com.teswebci3.library.services.Lokasi;

import com.teswebci3.library.payloads.requests.LokasiRequest;
import com.teswebci3.library.payloads.responses.Response;

public interface LokasiService {
    Response addNamaLokasi(LokasiRequest lokasiRequest);

    Response getNamaLokasis();

    Response getNamaLokasiById(String uuid);

    Response updateNamaLokasiById(String uuid, LokasiRequest lokasiRequest);

    Response deleteNamaLokasiById(String uuid);
}