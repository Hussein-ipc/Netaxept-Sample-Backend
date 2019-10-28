
package epayment.bbs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReconResult" type="{http://schemas.datacontract.org/2004/07/BBS.EPayment.ServiceLibrary}ReconResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reconResult"
})
@XmlRootElement(name = "ReconResponse")
public class ReconResponse {

    @XmlElement(name = "ReconResult", nillable = true)
    protected org.datacontract.schemas._2004._07.bbs_epayment.ReconResponse reconResult;

    /**
     * Gets the value of the reconResult property.
     * 
     * @return
     *     possible object is
     *     {@link org.datacontract.schemas._2004._07.bbs_epayment.ReconResponse }
     *     
     */
    public org.datacontract.schemas._2004._07.bbs_epayment.ReconResponse getReconResult() {
        return reconResult;
    }

    /**
     * Sets the value of the reconResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.datacontract.schemas._2004._07.bbs_epayment.ReconResponse }
     *     
     */
    public void setReconResult(org.datacontract.schemas._2004._07.bbs_epayment.ReconResponse value) {
        this.reconResult = value;
    }

}
