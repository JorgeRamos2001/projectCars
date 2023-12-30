package com.projectCars.persistance.mapper;

import com.projectCars.domain.pojo.MarcaPojo;
import com.projectCars.persistance.entities.MarcaEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMarcaMapperInterface {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "nombre", target = "nombre")
    MarcaPojo toMarcaPojo(MarcaEntity marcaEntity);
    @InheritInverseConfiguration
    MarcaEntity toMarcaEntity(MarcaPojo marcaPojo);

    List<MarcaPojo> toMarcaPojoList(List<MarcaEntity> marcas);
}
