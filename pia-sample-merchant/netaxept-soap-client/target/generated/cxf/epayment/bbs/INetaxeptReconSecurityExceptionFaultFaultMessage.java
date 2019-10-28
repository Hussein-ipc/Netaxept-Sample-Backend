
package epayment.bbs;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.10
 * 2019-10-28T07:54:44.827Z
 * Generated source version: 3.1.10
 */

@WebFault(name = "SecurityException", targetNamespace = "http://schemas.datacontract.org/2004/07/BBS.EPayment.ServiceLibrary")
public class INetaxeptReconSecurityExceptionFaultFaultMessage extends Exception {
    
    private org.datacontract.schemas._2004._07.bbs_epayment.SecurityException securityException;

    public INetaxeptReconSecurityExceptionFaultFaultMessage() {
        super();
    }
    
    public INetaxeptReconSecurityExceptionFaultFaultMessage(String message) {
        super(message);
    }
    
    public INetaxeptReconSecurityExceptionFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public INetaxeptReconSecurityExceptionFaultFaultMessage(String message, org.datacontract.schemas._2004._07.bbs_epayment.SecurityException securityException) {
        super(message);
        this.securityException = securityException;
    }

    public INetaxeptReconSecurityExceptionFaultFaultMessage(String message, org.datacontract.schemas._2004._07.bbs_epayment.SecurityException securityException, Throwable cause) {
        super(message, cause);
        this.securityException = securityException;
    }

    public org.datacontract.schemas._2004._07.bbs_epayment.SecurityException getFaultInfo() {
        return this.securityException;
    }
}
