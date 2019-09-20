/**
 * HolaMundoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.wspractica1;

public interface HolaMundoService extends javax.xml.rpc.Service {
    public java.lang.String getHolaMundoAddress();

    public com.wspractica1.HolaMundo getHolaMundo() throws javax.xml.rpc.ServiceException;

    public com.wspractica1.HolaMundo getHolaMundo(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
