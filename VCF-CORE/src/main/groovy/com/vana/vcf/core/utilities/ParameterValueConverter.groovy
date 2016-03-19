package com.vana.vcf.core.utilities


interface ParameterValueConverter {

    int covertToInt(String parameterValue);
    long convertToLong(String parameterValue);
    double convertToDouble(String parameterValue);

}