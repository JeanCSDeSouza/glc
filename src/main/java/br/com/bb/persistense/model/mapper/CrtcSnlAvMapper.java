package br.com.bb.persistense.model.mapper;

import br.com.bb.persistense.dto.CrtcSnlAvDto;
import br.com.bb.persistense.model.CrtcSnlAv;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "cdi")
public interface CrtcSnlAvMapper {
    List<CrtcSnlAvDto> toDtoList(List<CrtcSnlAv> models);

    CrtcSnlAvDto toDto(CrtcSnlAv model);

    @InheritInverseConfiguration(name = "toDto")
    CrtcSnlAv toModel(CrtcSnlAvDto crtcSnlAvDto);

    void updateModelFromDto(CrtcSnlAvDto dto, @MappingTarget CrtcSnlAv model);

    void updateDtoFromModel(CrtcSnlAv model, @MappingTarget CrtcSnlAvDto dto);

}
