package jp.co.shoeisha.javarecipe.chapter04.recipe097;

import java.awt.Point;
import java.util.Arrays;

public class AyyayCopySample {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		////////////////////////////////////////////////////
		//配列をコピーする
		////////////////////////////////////////////////////
		{
			// コピー元の配列
			int[] array = {30, 10, 20, 15};

			// 同じ配列長へコピーする場合
			int[] sameArray = Arrays.copyOf(array, array.length); // => [30, 10, 20, 15]

			// 短い配列長へコピーする場合、指定した配列長までの範囲でコピーし返却
			int[] shortArray = Arrays.copyOf(array, 2);           // => [30, 10]

			// 長い配列長へコピーする場合、余った部分にデータ型に応じた値でパディングし返却
			int[] longArray = Arrays.copyOf(array, 6);            // => [30, 10, 20, 15, 0, 0]

			// コピー元配列長の範囲内のインデックスを指定した場合、
			// to-fromの長さの配列長をコピーし返却
			int[] rangeArray = Arrays.copyOfRange(array, 1, 3);   // => [10, 20]

			// コピー元配列長より長い範囲のインデックスを指定してコピーする場合、
			// データ型に応じた値をパディングし返却
			int[] longRangeArray = Arrays.copyOfRange(array, 2, 5); // => [20, 15, 0]
		}
		////////////////////////////////////////////////////
		//copyOfメソッドが「浅いコピー」であることの確認例  
		////////////////////////////////////////////////////
		{
			// srcPointとdestPointにコピー
			Point[] srcPoint = {new Point(10, 20), new Point(30, 40)};
			Point[] destPoint = Arrays.copyOf(srcPoint, 2);

			// コピー元の配列内のオブジェクトのプロパティを変更すると
			// コピー先のオブジェクトのプロパティの値も変わる
			srcPoint[0].x = 50;

			System.out.println(srcPoint[0].x);  // => 50（コピー元の値）
			System.out.println(destPoint[0].x); // => 50（コピー先の値）
		}
		////////////////////////////////////////////////////
		//参照先のオブジェクトをコピーする「深いコピー」の例
		////////////////////////////////////////////////////
		{
			// コピー元の配列
			Point[] srcPoint = {new Point(10, 20), new Point(30, 40)};
			int size = srcPoint.length;

			// コピー先の配列
			Point[] destPoint = new Point[size];

			// srcPointからdestPointに深いコピーをする
			for (int i = 0; i < size; i++) {
				// プロパティを基に新たなインスタンスを作成する
				destPoint[i] = new Point(srcPoint[i].x, srcPoint[i].y);
			}

			// コピー元の配列内のオブジェクトのプロパティの値を変更しても
			// コピー先のオブジェクトのプロパティの値は変わらない
			srcPoint[0].x = 50;

			System.out.println(srcPoint[0].x);  // => 50（コピー元の値）
			System.out.println(destPoint[0].x); // => 10（コピー先の値）
		}
	}

}