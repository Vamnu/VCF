package com.vana.vcf.core.vcfmessage.message

import com.vana.vcf.core.vcfmessage.AdvisingMessage
import com.vana.vcf.core.vcftype.AdvisingMessageType


class StatusMessage extends AbstractAdvisingMessage implements AdvisingMessage{

    public StatusMessage(){
        super()
    }

    public StatusMessage(String message){
        super(message)
    }

    @Override
    public AdvisingMessageType getMessageType() {
        return AdvisingMessageType.STATUS_MESSAGE
    }
}
