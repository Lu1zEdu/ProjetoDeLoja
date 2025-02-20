package com.br.Ecommerce.Api.dto;

import com.br.Ecommerce.Api.enums.TypeCategoty;

public class CategoryRequest {

    private TypeCategoty typeCategoty;

    public TypeCategoty getTypeCategoty() {
        return typeCategoty;
    }

    public void setTypeCategoty(TypeCategoty typeCategoty) {
        this.typeCategoty = typeCategoty;
    }
}
