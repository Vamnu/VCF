package com.vana.vcf.core.vcfmessage.message

import com.vana.vcf.core.vcfmessage.AdvisingMessage
import com.vana.vcf.core.vcftype.AdvisingMessageType


public class AdvisingErrorMessage extends AbstractAdvisingMessage implements AdvisingMessage {

    @Override
    AdvisingMessageType getMessageType() {
        return AdvisingMessageType.ERROR_MESSAGE
    }
}
