package com.vana.vcf.core.data

import com.vana.vcf.core.vcftype.ParameterType


abstract class AbstractRequestResponseObject extends DataObject {

    HashMap<ParameterType, HashMap<String, String>> parameterTypeMap
}
