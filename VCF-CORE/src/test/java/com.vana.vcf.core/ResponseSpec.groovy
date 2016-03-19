package com.vana.vcf.core

import com.vana.vcf.core.vcfresponserequest.businesslogic.Request
import com.vana.vcf.core.vcfresponserequest.businesslogic.Response
import com.vana.vcf.core.vcfresponserequest.businesslogic.impl.RequestImpl
import com.vana.vcf.core.vcfresponserequest.businesslogic.impl.ResponseImpl
import spock.lang.Specification

class ResponseSpec extends Specification {

    def 'test extractParameter extracts correct primitive values'(){
        given:
        int intValue = 1
        long longValue = 2222L
        double doubleValue = 3.1415D
        String stringValue = "IAMASTRING"

        String intFieldName = "intFieldName"
        String longFieldName = "longFieldName"
        String doubleFieldName = "doubleFieldName"
        String stringFieldName = "stringFieldName"

        Response response = new ResponseImpl()
        response.addParameter(intFieldName, intValue)
        response.addParameter(longFieldName, longValue)
        response.addParameter(doubleFieldName, doubleValue)
        response.addParameter(stringFieldName, stringValue)

        when:
        int intResponse = response.extractIntParameter(intFieldName)
        long longResponse = response.extractLongParameter(longFieldName)
        double doubleResponse = response.extractDoubleParameter(doubleFieldName)
        String stringResponse = response.extractParameter(stringFieldName)

        then:
        0 * _

        and:
        intValue == intResponse
        longValue == longResponse
        doubleValue == doubleResponse
        stringValue == stringResponse

    }

    def 'test request extractParameter extracts correct primitive values'(){
        given:
        int intValue = 1
        long longValue = 2222L
        double doubleValue = 3.1415D
        String stringValue = "IAMASTRING"

        String intFieldName = "intFieldName"
        String longFieldName = "longFieldName"
        String doubleFieldName = "doubleFieldName"
        String stringFieldName = "stringFieldName"

        Request request = new RequestImpl()
        request.addParameter(intFieldName, intValue)
        request.addParameter(longFieldName, longValue)
        request.addParameter(doubleFieldName, doubleValue)
        request.addParameter(stringFieldName, stringValue)

        when:
        int intResponse = request.extractIntParameter(intFieldName)
        long longResponse = request.extractLongParameter(longFieldName)
        double doubleResponse = request.extractDoubleParameter(doubleFieldName)
        String stringResponse = request.extractParameter(stringFieldName)

        then:
        0 * _

        and:
        intValue == intResponse
        longValue == longResponse
        doubleValue == doubleResponse
        stringValue == stringResponse

    }

}