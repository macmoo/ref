package jp.co.shoeisha.javarecipe.chapter10.recipe291;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

public class MemoryUsageSample {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// メモリ使用量の取得
		/////////////////////////////////////////////////////////////////////////////
		{
			// MemoryUsageオブジェクトの生成
			MemoryMXBean mbean = ManagementFactory.getMemoryMXBean();
			MemoryUsage usage = mbean.getHeapMemoryUsage();
			// メモリサイズはすべてMbyte
			System.out.println("起動時のメモリサイズ:" + usage.getInit() / 1024 / 1024);
			System.out.println("現在利用されているメモリサイズ:" + usage.getUsed() / 1024 / 1024);
			System.out.println("保証されているサイズ:" + usage.getCommitted() / 1024 / 1024);
			System.out.println("管理対象の最大サイズ:" + usage.getMax() / 1024 / 1024);
		}
		/////////////////////////////////////////////////////////////////////////////
		// GCを発生させる
		/////////////////////////////////////////////////////////////////////////////
		{
			System.gc();
		}
	}

}
