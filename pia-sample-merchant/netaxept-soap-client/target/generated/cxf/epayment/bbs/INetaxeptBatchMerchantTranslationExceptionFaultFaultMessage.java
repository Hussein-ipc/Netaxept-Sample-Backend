
package epayment.bbs;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.10
 * 2019-10-28T07:54:44.809Z
 * Generated source version: 3.1.10
 */

@WebFault(name = "MerchantTranslationException", targetNamespace = "http://schemas.datacontract.org/2004/07/BBS.EPayment.ServiceLibrary")
public class INetaxeptBatchMerchantTranslationExceptionFaultFaultMessage extends Exception {
    
    private org.datacontract.schemas._2004._07.bbs_epayment.MerchantTranslationException merchantTranslationException;

    public INetaxeptBatchMerchantTranslationExceptionFaultFaultMessage() {
        super();
    }
    
    public INetaxeptBatchMerchantTranslationExceptionFaultFaultMessage(String message) {
        super(message);
    }
    
    public INetaxeptBatchMerchantTranslationExceptionFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public INetaxeptBatchMerchantTranslationExceptionFaultFaultMessage(String message, org.datacontract.schemas._2004._07.bbs_epayment.MerchantTranslationException merchantTranslationException) {
        super(message);
        this.merchantTranslationException = merchantTranslationException;
    }

    public INetaxeptBatchMerchantTranslationExceptionFaultFaultMessage(String message, org.datacontract.schemas._2004._07.bbs_epayment.MerchantTranslationException merchantTranslationException, Throwable cause) {
        super(message, cause);
        this.merchantTranslationException = merchantTranslationException;
    }

    public org.datacontract.schemas._2004._07.bbs_epayment.MerchantTranslationException getFaultInfo() {
        return this.merchantTranslationException;
    }
}
