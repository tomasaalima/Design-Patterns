package classes;

public class PPayModel implements PPay{
	MPay mpay;
	
	public PPayModel(MPay mpay) {
		this.mpay = mpay;
	}

	@Override
	public String getCustCardNo() {
		// TODO Auto-generated method stub
		return mpay.getCreditCardNo();
	}

	@Override
	public String getCardOwnerName() {
		// TODO Auto-generated method stub
		return mpay.getCustomerName();
	}

	@Override
	public String getCardExpMonthDate() {
		// TODO Auto-generated method stub
		return mpay.getCardExpMonth() + "/" + mpay.getCardExpYear();
	}

	@Override
	public Integer getCVVNo() {
		// TODO Auto-generated method stub
		return (int) mpay.getCardCVVNo();
	}

	@Override
	public Double getTotalAmount() {
		// TODO Auto-generated method stub
		return mpay.getAmount();
	}

	@Override
	public void setCustCardNo(String custCardNo) {
		// TODO Auto-generated method stub
		mpay.setCreditCardNo(custCardNo);		
	}

	@Override
	public void setCardOwnerName(String cardOwnerName) {
		// TODO Auto-generated method stub
		mpay.setCustomerName(cardOwnerName);
	}

	@Override
	public void setCardExpMonthDate(String cardExpMonthDate) {
		// TODO Auto-generated method stub
		mpay.setCardExpMonth(cardExpMonthDate);
	}

	@Override
	public void setCVVNo(Integer cVVNo) {
		// TODO Auto-generated method stub
		mpay.setCardCVVNo(Short.valueOf((short)(cVVNo >> 16)));
	}

	@Override
	public void setTotalAmount(Double totalAmount) {
		// TODO Auto-generated method stub
		mpay.setAmount(totalAmount);		
	}

}
