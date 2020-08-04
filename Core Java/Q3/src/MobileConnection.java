class MobileConnection{
	private int mobileNumber;
	private String serviceProvider;
	private String typeOfConnection;
	
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	public String getTypeOfConnection() {
		return typeOfConnection;
	}
	public void setTypeOfConnection(String typeOfConnection) {
		this.typeOfConnection = typeOfConnection;
	}
	
	public MobileConnection(int mobileNumber, String serviceProvider, String typeOfConnection) {
		super();
		this.mobileNumber = mobileNumber;
		this.serviceProvider = serviceProvider;
		this.typeOfConnection = typeOfConnection;
	}
	@Override
	public String toString() {
		return "MobileConnection [mobileNumber=" + mobileNumber + ", serviceProvider=" + serviceProvider
				+ ", typeOfConnection=" + typeOfConnection + "]";
	}
	
	
	
}