package jp.co.iccom.hiratsuka_tomoya.calculate_sales;

public abstract class DifinitionData {
	String code;
	String name;
	long amount;

	DifinitionData(){
		name = new String();
	}

	void setCode(String code) {
		this.code = code;
	}

	void setName(String name){
		this.name = name;
	}

	void addAmount(long amount){
		this.amount += amount;
	}

	String getCode(){
		return code;
	}

	String getName(){
		return name;
	}

	long getAmount() {
		return amount;
	}
}