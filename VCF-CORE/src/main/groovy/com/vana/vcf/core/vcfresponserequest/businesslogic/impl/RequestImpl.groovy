package com.vana.vcf.core.vcfresponserequest.businesslogic.impl

import com.vana.vcf.core.data.DisplayObject
import com.vana.vcf.core.data.RequestObject
import com.vana.vcf.core.data.ResponseObject
import com.vana.vcf.core.data.ValueObject
import com.vana.vcf.core.vcfresponserequest.businesslogic.Request

class RequestImpl extends RequestResponseLogic<RequestObject> implements Request {
    RequestObject ro = new RequestObject()
    DisplayObject displayObject = new DisplayObject()

    public RequestImpl(){
        ro.parameterTypeMap = new HashMap<>()
    }

    @Override
    void addParameter(String fieldName, String fieldValue) {
        addStringParameter(ro, fieldName, fieldValue);
    }

    @Override
    void addParameter(String fieldName, int fieldValue) {
        addIntParameter(ro, fieldName, fieldValue);
    }

    @Override
    void addParameter(String fieldName, long fieldValue) {
        addLongParameter(ro, fieldName, fieldValue);
    }

    @Override
    void addParameter(String fieldName, double fieldValue) {
        addDoubleParameter(ro, fieldName, fieldValue);
    }

    @Override
    String extractParameter(String fieldName) {
        return extractParameter(ro, fieldName);
    }

    @Override
    int extractIntParameter(String fieldName) {
        return extractIntParameter(ro, fieldName);
    }

    @Override
    long extractLongParameter(String fieldName) {
        return extractLongParameter(ro, fieldName);
    }

    @Override
    double extractDoubleParameter(String fieldName) {
        return extractDoubleParameter(ro, fieldName);
    }

    @Override
    void bindResponse(ResponseObject responseObject, ValueObject vo){
        bindMessages(responseObject, vo)
        bindResponseVO(responseObject)
    }

    private void bindResponseVO(ResponseObject responseObject){
        ro.parameterTypeMap.putAll(responseObject.parameterTypeMap)
    }

    private void bindMessages(ResponseObject responseObject, ValueObject vo){
        responseObject.errorMessages.addAll(vo.messageList.errorMessages.toString())
        responseObject.statusMessages.addAll(vo.messageList.messages.toString())

    }

}
