package com.corelab.springboot.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class CustomerMapper {
    public static final CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

//    public abstract Customer toCustomer(CustomerPostRequestBody animePostRequestBody);
//
//    public abstract Customer toCustomer(CustomerPutRequestBody animePostRequestBody);
}
