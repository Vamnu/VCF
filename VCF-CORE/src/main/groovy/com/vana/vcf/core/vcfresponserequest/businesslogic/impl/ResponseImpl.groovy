package com.vana.vcf.core.vcfresponserequest.businesslogic.impl

import com.vana.vcf.core.data.DisplayObject
import com.vana.vcf.core.data.ResponseObject
import com.vana.vcf.core.vcfresponserequest.businesslogic.Response

class ResponseImpl extends RequestResponseLogic<ResponseObject> implements Response {
    ResponseObject responseObject = new ResponseObject()
    DisplayObject displayObject = new DisplayObject()



    public ResponseImpl(){
        responseObject.parameterTypeMap = new HashMap<>()
    }

    @Override
    void addParameter(String fieldName, String fieldValue) {
        addStringParameter(responseObject, fieldName, fieldValue);
    }

    @Override
    void addParameter(String fieldName, int fieldValue) {
        addIntParameter(responseObject, fieldName, fieldValue);
    }

    @Override
    void addParameter(String fieldName, long fieldValue) {
        addLongParameter(responseObject, fieldName, fieldValue);
    }

    @Override
    void addParameter(String fieldName, double fieldValue) {
        addDoubleParameter(responseObject, fieldName, fieldValue);
    }

    @Override
    String extractParameter(String fieldName) {
        return extractParameter(responseObject, fieldName);
    }

    @Override
    int extractIntParameter(String fieldName) {
        return extractIntParameter(responseObject, fieldName);
    }

    @Override
    long extractLongParameter(String fieldName) {
        return extractLongParameter(responseObject, fieldName);
    }

    @Override
    double extractDoubleParameter(String fieldName) {
        return extractDoubleParameter(responseObject, fieldName);
    }
}
