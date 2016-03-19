package com.vana.vcf.core.vcftype


public enum AdvisingMessageType {

    STATUS_MESSAGE("STATUS_MESSAGE"),
    ERROR_MESSAGE("ERROR_MESSAGE")

    private String messageType

    public AdvisingMessageType(String messageType){
        this.messageType = messageType
    }
}
