package com.vana.vcf.core.vcfmessage.message



abstract class AbstractAdvisingMessage {
 //   private static final Logger log = Logger.getLogger(AbstractAdvisingMessage.class);
    AbstractAdvisingMessage(){

    }

    AbstractAdvisingMessage(String message){
        log.info("Add StatusMessage to messageList.messages($message)")
        this.message.append(message)
    }



    public StringBuffer message = new StringBuffer("");
    public String fieldName
    public boolean globalMessage

}
