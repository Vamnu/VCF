package com.vana.vcf.core.businesslogic.impl;

import com.vana.vcf.core.businesslogic.BusinessLogic;
import com.vana.vcf.core.businesslogic.sql.impl.DaoImpl;
import com.vana.vcf.core.data.ValueObject;
import groovy.util.logging.Log4j;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Log4j
public abstract class AbstractBusinessLogic<V extends ValueObject> extends DaoImpl<V> implements BusinessLogic<V> {

 //   private static final Logger log = Logger.getLogger(AbstractBusinessLogic.class);

    public V read(V v) {
        return v;
    }

    public List<V> list(V v) {
        return new ArrayList<V>();
    }


    public void add(V v) {
        executeAdd(v);
    }

    protected final void executeAdd(V v) {
        preValidate(v, false);

        if (!v.errorsExist()) {
            commit(v);
        }

    }

    protected final void executeAddNoLogging(V v) {
        preValidate(v, false);

        if (!v.errorsExist()) {
            commitNoLogging(v);
        }
    }

    public void update(V v) {

    }

    public void delete(V v) {

    }

    protected void preValidate(V v, boolean update) {
        validate(v, false);
    }

    protected void validate(V v, boolean update) {

    }

    protected void beforeAdd(V v) {

    }

    protected void afterAdd(V v) {

    }

    protected void beforeUpdate(V v) {

    }

    protected void afterUpdate(V v) {

    }

    private void commit(V v) {
        executeCommit(v);
        //TODO perform logging of tx
    }

    private void commitNoLogging(V v) {
        executeCommit(v);

    }

    private void executeCommit(V v) {
       // log.info("Attempting to commit");
        beforeAdd(v);
        try{
            commitDatabaseTX(v);
      //      log.info("Creating update message");
      //      v.getMessageList().addStatusMessage("Record Updated");
            afterAdd(v);
        } catch (SQLException e)  {
            e.printStackTrace();
        } catch (NullPointerException e){
            e.printStackTrace();
        }
    }



}
