package com.vana.vcf.core.businesslogic;


import com.vana.vcf.core.data.DataObject;

import java.util.List;

public interface BusinessLogic<V extends DataObject> {

    V read(V v);

    List<V> list(V v);

    void add(V v);

    void update(V v);

    void delete(V v);
}
