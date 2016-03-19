package com.vana.vcf.core.vcfmessage.message

import com.vana.vcf.core.vcfmessage.MessageList


class AdvisingMessageList<M extends AbstractAdvisingMessage> extends ArrayList<M> implements MessageList<M> {

     List<AdvisingErrorMessage> errorMessages = new ArrayList<>()
     List<StatusMessage> messages = new ArrayList<>()

     @Override
     boolean hasMessages() {
          return messages.size() > 0
     }

     @Override
     boolean hasErrorMessages() {
          return errorMessages.size() > 0
     }

     @Override
     void addErrorMessage(String errorMessage) {

     }

     @Override
     void addErrorMessage(AdvisingErrorMessage errorMessage) {

     }

     @Override
     void addStatusMessage(String statusMessage) {
          messages.add(new StatusMessage(statusMessage))
     }

     @Override
     void addStatusMessage(StatusMessage statusMessage) {

     }
}
