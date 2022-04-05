package jp.co.shoeisha.javarecipe.chapter02.recipe028;

public class SwitchSample {

	public static void main(String[] args) {

		/////////////////////////////////////////////////////////////////////////////
		// switch文を使った条件分岐
		/////////////////////////////////////////////////////////////////////////////
		int i = 10;

		switch(i){
		// i = 10の場合
		case 10:
			System.out.println("10");
			break;

		// それ以外の場合
		default:
			System.out.println("10以外");
		}

		// defaultは省略可能
		switch(i){
		case 10:
			System.out.println("10");
			break;
		}

		// breakを省略すると次のcase文を実行する
		switch(i){
		// i = 5またはi = 10の場合
		case 5:
		case 10:
			System.out.println("5または10");
			break;
		default:
			System.out.println("それ以外");
		}


		/////////////////////////////////////////////////////////////////////////////
		// if、else switch文を使った条件分岐
		/////////////////////////////////////////////////////////////////////////////
		String str = new String[]{null, ""}[0];

		if(str == null){
			System.out.println("文字列はnullです");

		} else switch(str){
			case "hoge":
				System.out.println("文字列はhogeです");
				break;
			default:
				System.out.println("想定外の文字列です");
		}

	}

}
