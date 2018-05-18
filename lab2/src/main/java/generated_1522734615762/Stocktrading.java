
package generated_1522734615762;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type �� Java ���O.
 * 
 * <p>�U�C���n���q�|���w�����O���]�t���w�����e.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vip" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="stockId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shares" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "custId",
    "vip",
    "stockId",
    "shares"
})
@XmlRootElement(name = "stocktrading")
public class Stocktrading {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String custId;
    protected byte vip;
    @XmlElement(required = true)
    protected String stockId;
    protected byte shares;

    /**
     * ���o name �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * �]�w name �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * ���o custId �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustId() {
        return custId;
    }

    /**
     * �]�w custId �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustId(String value) {
        this.custId = value;
    }

    /**
     * ���o vip �S�ʪ���.
     * 
     */
    public byte getVip() {
        return vip;
    }

    /**
     * �]�w vip �S�ʪ���.
     * 
     */
    public void setVip(byte value) {
        this.vip = value;
    }

    /**
     * ���o stockId �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockId() {
        return stockId;
    }

    /**
     * �]�w stockId �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockId(String value) {
        this.stockId = value;
    }

    /**
     * ���o shares �S�ʪ���.
     * 
     */
    public byte getShares() {
        return shares;
    }

    /**
     * �]�w shares �S�ʪ���.
     * 
     */
    public void setShares(byte value) {
        this.shares = value;
    }

}
