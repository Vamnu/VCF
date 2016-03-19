package com.vana.vcf.core.vcfresponserequest.businesslogic

import com.vana.vcf.core.data.ResponseObject
import com.vana.vcf.core.data.ValueObject

interface Request extends RequestResponse  {

    void bindResponse(ResponseObject responseObject, ValueObject vo)


}
