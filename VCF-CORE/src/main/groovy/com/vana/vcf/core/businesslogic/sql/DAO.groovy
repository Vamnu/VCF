package com.vana.vcf.core.businesslogic.sql

import com.vana.vcf.core.data.DataObject

import java.sql.SQLException

interface DAO<V extends DataObject> {

    void commitDatabaseTX(V v) throws SQLException;

}
