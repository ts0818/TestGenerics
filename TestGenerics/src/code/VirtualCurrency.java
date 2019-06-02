package code;

/**
 * 日本で取引できる仮想通貨のリスト
 * @author Toshinobu
 *
 */
public enum VirtualCurrency implements CodeInterface {
	
	// 仮想通過の一覧
    BTC("C01", "ビットコイン"),
    XRP("C02", "リップル"),
    LTC("C03", "ライトコイン"),
    ETH("C04", "イーサリアム"),
    BCH("C05", "ビットコインキャッシュ"),
    XEM("C06", "ネム"),
    LSK("C07", "リスク"),
    FCT("C08", "ファクトム"),
    ETC("C09", "イーサリアムクラシック");
	
	private String code;
	
	private String codeValue;
	
	private VirtualCurrency(String code, String codeValue) {
		this.code = code;
		this.codeValue = codeValue;
	}

	@Override
	public String getCode() {
		// TODO 自動生成されたメソッド・スタブ
		return this.code;
	}

	@Override
	public String getCodeValue() {
		// TODO 自動生成されたメソッド・スタブ
		return this.codeValue;
	}

}
