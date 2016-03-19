package com.vana.vcf.core.controller;

import com.vana.vcf.core.data.ValueObject;
import com.vana.vcf.core.vcfresponserequest.businesslogic.Request;
import com.vana.vcf.core.vcfresponserequest.businesslogic.Response;

public interface VcfControllerLogic<V extends ValueObject>{

    Response getDefault(Request request);

    Response read(Request request);

    Response add(Request request);

    Response update(Request request);

    Response delete(Request request);


}
