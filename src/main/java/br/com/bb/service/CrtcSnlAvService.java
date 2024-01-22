package br.com.bb.service;

import br.com.bb.persistense.dto.CrtcSnlAvDto;
import br.com.bb.persistense.model.CrtcSnlAv;
import br.com.bb.persistense.model.mapper.CrtcSnlAvMapper;
import br.com.bb.repository.CrtcSnlAvRepository;
import jakarta.enterprise.context.ApplicationScoped;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

import java.util.List;

@ApplicationScoped
public class CrtcSnlAvService {
    private final CrtcSnlAvRepository crtcSnlAvRepository;
    private final CrtcSnlAvMapper crtcSnlAvMapper;

    public CrtcSnlAvService(CrtcSnlAvRepository crtcSnlAvRepository, CrtcSnlAvMapper crtcSnlAvMapper) {
        this.crtcSnlAvRepository = crtcSnlAvRepository;
        this.crtcSnlAvMapper = crtcSnlAvMapper;
    }

    public List<CrtcSnlAvDto> getCrtcSnlAvs() {
        return this.crtcSnlAvMapper.toDtoList( crtcSnlAvRepository.listAll() );
    }

    @Transactional
    public CrtcSnlAvDto save(@Valid CrtcSnlAvDto crtcSnlAvDto) {
        CrtcSnlAv crtcSnlAv = crtcSnlAvMapper.toModel(crtcSnlAvDto);
        crtcSnlAvRepository.persist( crtcSnlAv );
        crtcSnlAvMapper.updateDtoFromModel( crtcSnlAv, crtcSnlAvDto );
        return crtcSnlAvDto;
    }

    @Transactional
    public void update(Long id) {
        if( id.describeConstable().isEmpty()){
            throw  new RuntimeException("Custumer does not have an Id");
        }
        //crtcSnlAvRepository.deleteById(id);
    }

}
