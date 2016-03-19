package com.vana.vcf.core.vcfresponserequest.businesslogic.impl;

import com.vana.vcf.core.data.AbstractRequestResponseObject;
import com.vana.vcf.core.utilities.businesslogic.ParameterValueConverterImpl;
import com.vana.vcf.core.vcftype.ParameterType;
import com.vana.vcf.core.utilities.ParameterValueConverter;
import com.vana.vcf.core.vcfresponserequest.businesslogic.RequestResponse;

import java.util.HashMap;

public abstract class RequestResponseLogic<R extends AbstractRequestResponseObject> implements RequestResponse{

    HashMap<String, String> parameterValueMap = new HashMap<>();
    ParameterValueConverter valueConverter = new ParameterValueConverterImpl();

    protected void addStringParameter(R responseRequest, String fieldName, String fieldValue){
        parameterValueMap.put(fieldName, fieldValue);
        responseRequest.getParameterTypeMap().put(ParameterType.STRING, parameterValueMap);
    }

    protected void addIntParameter(R responseRequest, String fieldName, int fieldValue){
        parameterValueMap.put(fieldName, String.valueOf(fieldValue));
        responseRequest.getParameterTypeMap().put(ParameterType.INTEGER, parameterValueMap);
    }

    protected void addLongParameter(R responseRequest, String fieldName, long fieldValue){
        parameterValueMap.put(fieldName, String.valueOf(fieldValue));
        responseRequest.getParameterTypeMap().put(ParameterType.LONG, parameterValueMap);
    }

    protected void addDoubleParameter(R responseRequest, String fieldName, double fieldValue){
        parameterValueMap.put(fieldName, String.valueOf(fieldValue));
        responseRequest.getParameterTypeMap().put(ParameterType.DOUBLE, parameterValueMap);
    }

    public String extractParameter(R requestResponse, String fieldName){
        return requestResponse.getParameterTypeMap().get(ParameterType.STRING).get(fieldName);
    }

    public int extractIntParameter(R requestResponse, String fieldName){
        String value =  requestResponse.getParameterTypeMap().get(ParameterType.INTEGER).get(fieldName);
        return valueConverter.covertToInt(value);
    }

    public long extractLongParameter(R requestResponse, String fieldName){
        String value =  requestResponse.getParameterTypeMap().get(ParameterType.LONG).get(fieldName);
        return valueConverter.convertToLong(value);
    }

    public double extractDoubleParameter(R requestResponse, String fieldName){
        String value =  requestResponse.getParameterTypeMap().get(ParameterType.DOUBLE).get(fieldName);
        return valueConverter.convertToDouble(value);
    }



}
