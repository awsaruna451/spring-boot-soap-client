
package com.example.demo.wsdl;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "ExampleServicePortType", targetNamespace = "http://example.com/demo")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ExampleServicePortType {


    /**
     * 
     * @param parameters
     * @return
     *     returns com.example.demo.wsdl.GetExampleResponse
     */
    @WebMethod
    @WebResult(name = "getExampleResponse", targetNamespace = "http://example.com/demo", partName = "parameters")
    public GetExampleResponse getExample(
        @WebParam(name = "getExampleRequest", targetNamespace = "http://example.com/demo", partName = "parameters")
        GetExampleRequest parameters);

}
