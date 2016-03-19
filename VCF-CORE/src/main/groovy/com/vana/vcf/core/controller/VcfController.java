package com.vana.vcf.core.controller;


import com.vana.vcf.core.data.ValueObject;
import com.vana.vcf.core.vcfresponserequest.businesslogic.Request;
import com.vana.vcf.core.vcfresponserequest.businesslogic.Response;

public abstract class VcfController<V extends ValueObject> implements VcfControllerLogic<V> {

    protected void bindResponse(Request request, Response response, V vo){

    }


}
