
public class TicketCounters {
	
	private int ticketToBuy;
	private int tixBought;
	private int TOTAL_TICKET;
	private int customer;
	private int ticketPerBuyer;
	private int maxTicketPerBuyer;
	
	public TicketCounters() {
		super();
		this.ticketToBuy = 0;
		this.tixBought = 0;
		TOTAL_TICKET = 75;
		this.customer = 0;
		this.ticketPerBuyer = 6;
		this.maxTicketPerBuyer = 6;
	}
	public TicketCounters(int ticketToBuy, int tixBought, int tOTAL_TICKET,
			int customer, int ticketPerBuyer, int maxTicketPerBuyer) {
		super();
		this.ticketToBuy = ticketToBuy;
		this.tixBought = tixBought;
		TOTAL_TICKET = tOTAL_TICKET;
		this.customer = customer;
		this.ticketPerBuyer = ticketPerBuyer;
		this.maxTicketPerBuyer = maxTicketPerBuyer;
	}

	public int getTicketToBuy() {
		return ticketToBuy;
	}

	public void setTicketToBuy(int ticketToBuy) {
		if (ticketToBuy<= this.TOTAL_TICKET && ticketToBuy >0){
			this.tixBought = this.tixBought + ticketToBuy;
			this.customer = this.customer +1;
		}
		this.ticketToBuy = ticketToBuy;
	}

	public int getTixBought() {
		return tixBought;
	}

	public void setTixBought(int tixBought) {
		this.tixBought = tixBought;
	}

	public int getTOTAL_TICKET() {
		return TOTAL_TICKET;
	}

	public void setTOTAL_TICKET(int tOTAL_TICKET) {
		TOTAL_TICKET = tOTAL_TICKET;
	}

	public int getCustomer() {
		return customer;
	}
	public void setCustomer(int customer) {
		if(this.ticketToBuy<= this.TOTAL_TICKET){
			this.TOTAL_TICKET = this.TOTAL_TICKET - this.ticketToBuy;
			this.customer++;
		}
		this.customer = customer;
	}
	public int getTicketPerBuyer() {
		return ticketPerBuyer;
	}

	public void setTicketPerBuyer(int ticketPerBuyer) {
		this.ticketPerBuyer = ticketPerBuyer;
	}
	

	public int getMaxTicketPerBuyer() {
		return maxTicketPerBuyer;
	}

	public void setMaxTicketPerBuyer(int maxTicketPerBuyer) {
		this.maxTicketPerBuyer = maxTicketPerBuyer;
	}
	
}
