
package jp.co.shoeisha.javarecipe.chapter03.recipe086;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class MemberSample {

	public static void main(String[] args) {

		/////////////////////////////////////////////////////////////////////////////
		// publicコンストラクタを取得
		/////////////////////////////////////////////////////////////////////////////
		System.out.println("********** publicコンストラクタ **********");
		for (Constructor<?> constructor : File.class.getConstructors()) {
			// コンストラクタ名
			String name = constructor.getName();

			// 引数の型
			Class<?>[] type = constructor.getParameterTypes();

			// 修飾子がpublicかどうか
			boolean mod = Modifier.isPublic(constructor.getModifiers());

			System.out.print(name);
			System.out.print(Arrays.toString(type));
			System.out.println("isPublic: " + mod);
		}

		/////////////////////////////////////////////////////////////////////////////
		// publicメソッドを取得（スーパークラスも含む）
		/////////////////////////////////////////////////////////////////////////////
		System.out.println("********** publicメソッド **********");
		for (Method method : File.class.getMethods()) {
			// メソッド名
			String name = method.getName();

			// 戻り値の型
			Class<?> type = method.getReturnType();

			// 引数の型
			Class<?>[] params = method.getParameterTypes();

			// 修飾子がstaticかどうか
			boolean mod = Modifier.isStatic(method.getModifiers());

			System.out.print(type + " ");
			System.out.print(name);
			System.out.print(Arrays.toString(params));
			System.out.println("isStatic: " + mod);
		}

		/////////////////////////////////////////////////////////////////////////////
		// publicフィールドを取得（スーパークラスも含む）
		/////////////////////////////////////////////////////////////////////////////
		System.out.println("********** publicフィールド **********");
		for (Field field : File.class.getFields()) {
			// フィールド名
			String name = field.getName();

			// フィールドの型
			Class<?> type = field.getType();

			// 修飾子がfinalかどうか
			boolean mod = Modifier.isFinal(field.getModifiers());

			System.out.print(type + " ");
			System.out.print(name + " ");
			System.out.println("isFinal: " + mod);
		}

		/////////////////////////////////////////////////////////////////////////////
		// 全コンストラクタを取得
		/////////////////////////////////////////////////////////////////////////////
		System.out.println("********** privateコンストラクタ **********");
		for (Constructor<?> constructor : File.class.getDeclaredConstructors()) {

			// 修飾子がprivateのみ
			if(Modifier.isPrivate(constructor.getModifiers())) {
				System.out.println(Arrays.toString(constructor.getParameterTypes()));
			}

		}

		/////////////////////////////////////////////////////////////////////////////
		// 全メソッドを取得（スーパークラスは含まない）
		/////////////////////////////////////////////////////////////////////////////
		System.out.println("********** privateメソッド **********");
		for (Method method : File.class.getDeclaredMethods()) {

			// 修飾子がprivateのみ
			if(Modifier.isPrivate(method.getModifiers())) {
				System.out.println(method.getName());
			}

		}

		/////////////////////////////////////////////////////////////////////////////
		// 全フィールドを取得（スーパークラスは含まない）
		/////////////////////////////////////////////////////////////////////////////
		System.out.println("********** privateフィールド **********");
		for (Field field : File.class.getDeclaredFields()) {

			// 修飾子がprivateのみ
			if(Modifier.isPrivate(field.getModifiers())) {
				System.out.println(field.getName());
			}

		}

	}

}

// ********** publicコンストラクタ **********
// java.io.File[class java.lang.String]isPublic: true
// java.io.File[class java.lang.String, class java.lang.String]isPublic: true
// java.io.File[class java.net.URI]isPublic: true
// java.io.File[class java.io.File, class java.lang.String]isPublic: true
// ********** publicメソッド **********
// class java.lang.String getName[]isStatic: false
// boolean equals[class java.lang.Object]isStatic: false
// long length[]isStatic: false
// class java.lang.String toString[]isStatic: false
// int hashCode[]isStatic: false
// boolean isHidden[]isStatic: false
// int compareTo[class java.io.File]isStatic: false
// int compareTo[class java.lang.Object]isStatic: false
// class [Ljava.lang.String; list[]isStatic: false
// class [Ljava.lang.String; list[interface java.io.FilenameFilter]isStatic: false
// boolean isAbsolute[]isStatic: false
// class java.lang.String getParent[]isStatic: false
// boolean delete[]isStatic: false
// boolean setReadOnly[]isStatic: false
// boolean canRead[]isStatic: false
// class java.lang.String getPath[]isStatic: false
// class java.net.URI toURI[]isStatic: false
// class java.net.URL toURL[]isStatic: false
// boolean exists[]isStatic: false
// boolean createNewFile[]isStatic: false
// boolean renameTo[class java.io.File]isStatic: false
// class java.lang.String getAbsolutePath[]isStatic: false
// class java.lang.String getCanonicalPath[]isStatic: false
// boolean isDirectory[]isStatic: false
// class java.io.File getAbsoluteFile[]isStatic: false
// boolean mkdir[]isStatic: false
// class java.io.File getCanonicalFile[]isStatic: false
// class java.io.File getParentFile[]isStatic: false
// boolean mkdirs[]isStatic: false
// boolean setWritable[boolean]isStatic: false
// boolean setWritable[boolean, boolean]isStatic: false
// boolean setReadable[boolean]isStatic: false
// boolean setReadable[boolean, boolean]isStatic: false
// boolean setExecutable[boolean, boolean]isStatic: false
// boolean setExecutable[boolean]isStatic: false
// class [Ljava.io.File; listRoots[]isStatic: true
// class java.io.File createTempFile[class java.lang.String, class java.lang.String, class java.io.File]isStatic: true
// class java.io.File createTempFile[class java.lang.String, class java.lang.String]isStatic: true
// boolean canWrite[]isStatic: false
// boolean isFile[]isStatic: false
// long lastModified[]isStatic: false
// void deleteOnExit[]isStatic: false
// class [Ljava.io.File; listFiles[interface java.io.FilenameFilter]isStatic: false
// class [Ljava.io.File; listFiles[interface java.io.FileFilter]isStatic: false
// class [Ljava.io.File; listFiles[]isStatic: false
// boolean setLastModified[long]isStatic: false
// boolean canExecute[]isStatic: false
// long getTotalSpace[]isStatic: false
// long getFreeSpace[]isStatic: false
// long getUsableSpace[]isStatic: false
// interface java.nio.file.Path toPath[]isStatic: false
// void wait[long, int]isStatic: false
// void wait[]isStatic: false
// void wait[long]isStatic: false
// class java.lang.Class getClass[]isStatic: false
// void notify[]isStatic: false
// void notifyAll[]isStatic: false
// ********** publicフィールド **********
// char separatorChar isFinal: true
// class java.lang.String separator isFinal: true
// char pathSeparatorChar isFinal: true
// class java.lang.String pathSeparator isFinal: true
// ********** privateコンストラクタ **********
// [class java.lang.String, class java.io.File]
// [class java.lang.String, int]
// ********** privateメソッド **********
// readObject
// writeObject
// slashify
// normalizedList
// ********** privateフィールド **********
// fs
// path
// status
// prefixLength
// UNSAFE
// PATH_OFFSET
// PREFIX_LENGTH_OFFSET
// serialVersionUID
// filePath
