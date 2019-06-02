package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import code.VirtualCurrency;
import util.EnumUtil;

public class TestGenerics {

	public static void main(String[] args) {
		
		// サーバ側に送られてくるコード値を想定
		List<String> codeVirtualCurrency = new ArrayList<>(Arrays.asList("C01", "C03", "C100"));
		// 検索結果を出力
		codeVirtualCurrency.stream().forEach(code ->
		{
			EnumUtil.of(VirtualCurrency.class, VirtualCurrency::getCode, code).ifPresent(System.out::println);
		});
		
	}

}
