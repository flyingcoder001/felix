package org.apache.felix.ipojo.runtime.core.components;

import org.osgi.framework.BundleContext;

public class CallSuperConstructorWithBC extends ParentClassWithBC {
    
    public CallSuperConstructorWithBC(BundleContext bc) {
        super("bc", bc, "bundle");
        String message = "plop-bc";
        System.out.println(message);
    } 

}
