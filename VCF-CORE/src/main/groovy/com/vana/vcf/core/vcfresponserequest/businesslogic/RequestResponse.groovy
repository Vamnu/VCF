package com.vana.vcf.core.vcfresponserequest.businesslogic

import com.vana.vcf.core.data.AbstractRequestResponseObject

interface RequestResponse<R extends AbstractRequestResponseObject> {

    void addParameter(String fieldName, String fieldValue);
    void addParameter(String fieldName, int fieldValue);
    void addParameter(String fieldName, long fieldValue);
    void addParameter(String fieldName, double fieldValue);

    String extractParameter(String fieldName);
    int extractIntParameter(String fieldName);
    long extractLongParameter(String fieldName);
    double extractDoubleParameter(String fieldName);

}