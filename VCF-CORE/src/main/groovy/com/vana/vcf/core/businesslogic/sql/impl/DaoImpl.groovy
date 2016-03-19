package com.vana.vcf.core.businesslogic.sql.impl

import com.vana.vcf.core.businesslogic.sql.DAO
import com.vana.vcf.core.data.DataObject

import java.sql.SQLException


public class DaoImpl<V extends DataObject> implements DAO<V> {

    @Override
    void commitDatabaseTX(V v) throws SQLException, NullPointerException {

    }



}
