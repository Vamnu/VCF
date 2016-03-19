package com.vana.vcf.core.utilities.businesslogic

import com.vana.vcf.core.utilities.ParameterValueConverter


class ParameterValueConverterImpl implements  ParameterValueConverter{


    @Override
    int covertToInt(String value) {
        return Integer.parseInt(value);
    }

    @Override
    long convertToLong(String value) {
        return Long.parseLong(value);
    }

    @Override
    double convertToDouble(String value) {
        return Double.isNaN(Double.parseDouble(value)) ? 0 : Double.parseDouble(value);
    }
}
