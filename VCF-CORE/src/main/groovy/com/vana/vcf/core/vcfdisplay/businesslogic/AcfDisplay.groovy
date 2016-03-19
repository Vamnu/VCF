package com.vana.vcf.core.vcfdisplay.businesslogic

import com.vana.vcf.core.vcfdisplay.data.AcfDisplayObject
import com.vana.vcf.core.vcfresponserequest.businesslogic.impl.RequestImpl


interface AcfDisplay<DO extends AcfDisplayObject> {

    void sendRequest(RequestImpl request);



}