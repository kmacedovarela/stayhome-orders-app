package org.delivery.stayhome.model;

public class Order implements java.io.Serializable {

    /**
	 *
	 */
    private static final long serialVersionUID = 281765876232693398L;
    
	private Long id;
    private String item;
    private Integer quantity;
    private String customerName;
    private String customerId;

    private Boolean acceptedByRestaurant;
    private Boolean readyToDeliver;
    private Boolean delivered;
    private String observations;
	public String getItem() {
		return item;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public Boolean getAcceptedByRestaurant() {
		return acceptedByRestaurant;
	}
	public void setAcceptedByRestaurant(Boolean acceptedByRestaurant) {
		this.acceptedByRestaurant = acceptedByRestaurant;
	}
	public Boolean getReadyToDeliver() {
		return readyToDeliver;
	}
	public void setReadyToDeliver(Boolean readyToDeliver) {
		this.readyToDeliver = readyToDeliver;
	}
	public Boolean getDelivered() {
		return delivered;
	}
	public void setDelivered(Boolean delivered) {
		this.delivered = delivered;
	}
	public String getObservations() {
		return observations;
	}
	public void setObservations(String observations) {
		this.observations = observations;
	}


    

}