package com.vana.vcf.core.data

import com.vana.vcf.core.vcfmessage.message.AdvisingErrorMessage
import com.vana.vcf.core.vcfmessage.message.AdvisingMessageList
import com.vana.vcf.core.vcfmessage.MessageList


class ValueObject extends DataObject {

    String createUserName
    String createDateTime
    String changeUserName
    String changeDateTime
    short updateVersion


    MessageList messageList = new AdvisingMessageList()

    boolean errorsExist(){
        return messageList.hasErrorMessages()
    }

    boolean messagesExist(){
        return messageList.hasMessages()
    }

    void addErrorMessage(String errorMessage){
        messageList.addErrorMessage(errorMessage)
    }

    void addErrorMessage(AdvisingErrorMessage errorMessage){
        messageList.addErrorMessage(errorMessage)
    }



}
