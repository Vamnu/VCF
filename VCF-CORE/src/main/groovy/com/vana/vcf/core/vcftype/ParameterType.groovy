package com.vana.vcf.core.vcftype


enum ParameterType {

    STRING("STRING"),
    INTEGER("INTEGER"),
    LONG("LONG"),
    DOUBLE("DOUBLE")

    private parameterType

    public ParameterType(String parameterType){
        this.parameterType = parameterType
    }

}