
package epayment.bbs;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.10
 * 2019-10-28T07:54:44.825Z
 * Generated source version: 3.1.10
 */

@WebFault(name = "NotSupportedException", targetNamespace = "http://schemas.datacontract.org/2004/07/BBS.EPayment.ServiceLibrary")
public class INetaxeptProcessNotSupportedExceptionFaultFaultMessage extends Exception {
    
    private org.datacontract.schemas._2004._07.bbs_epayment.NotSupportedException notSupportedException;

    public INetaxeptProcessNotSupportedExceptionFaultFaultMessage() {
        super();
    }
    
    public INetaxeptProcessNotSupportedExceptionFaultFaultMessage(String message) {
        super(message);
    }
    
    public INetaxeptProcessNotSupportedExceptionFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public INetaxeptProcessNotSupportedExceptionFaultFaultMessage(String message, org.datacontract.schemas._2004._07.bbs_epayment.NotSupportedException notSupportedException) {
        super(message);
        this.notSupportedException = notSupportedException;
    }

    public INetaxeptProcessNotSupportedExceptionFaultFaultMessage(String message, org.datacontract.schemas._2004._07.bbs_epayment.NotSupportedException notSupportedException, Throwable cause) {
        super(message, cause);
        this.notSupportedException = notSupportedException;
    }

    public org.datacontract.schemas._2004._07.bbs_epayment.NotSupportedException getFaultInfo() {
        return this.notSupportedException;
    }
}
