package com.vana.vcf.core.vcfmessage

import com.vana.vcf.core.vcfmessage.message.AbstractAdvisingMessage
import com.vana.vcf.core.vcfmessage.message.AdvisingErrorMessage
import com.vana.vcf.core.vcfmessage.message.StatusMessage


interface MessageList<M extends AbstractAdvisingMessage> extends List<M> {

    List<AdvisingErrorMessage> getErrorMessages()
    List<StatusMessage> getMessages()
    boolean hasMessages()
    boolean hasErrorMessages()

    void addErrorMessage(String errorMessage)
    void addErrorMessage(AdvisingErrorMessage errorMessage)
    void addStatusMessage(String statusMessage)
    void addStatusMessage(StatusMessage statusMessage)


}
