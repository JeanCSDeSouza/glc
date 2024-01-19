package br.com.bb.service;

import br.com.bb.persistense.model.CrtcSnlAv;
import br.com.bb.repository.CrtcSnlAvRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class CrtcSnlAvService {
    public CrtcSnlAvRepository crtcSnlAvRepository;
    @Inject
    public CrtcSnlAvService(CrtcSnlAvRepository crtcSnlAvRepository) {
        this.crtcSnlAvRepository = crtcSnlAvRepository;
    }

    public List<CrtcSnlAv> getCrtcSnlAvs() {
        return crtcSnlAvRepository.listAll();
    }

    @Transactional
    public void addCrtcSnlAv(CrtcSnlAv crtcSnlAv) {
        crtcSnlAvRepository.persist(crtcSnlAv);
    }

    @Transactional
    public void deleteCrtcSnlAv(Long id) {
        crtcSnlAvRepository.deleteById(id);
    }

}
