package classes;
import java.util.*;
/**
 * 男性：身高（厘米）－105=标准体重（千克）
 * 女性：身高（厘米）－100=标准体重（千克）
 * @author HuaWenXuan
 *
 */
public class Class01 {
	
	public static void main( String[] args )
	{
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.println( "请输入性别：（0是女，1是男）" );
		int sex = s.nextInt();
		
		if( sex == 0 )
		{
			System.out.println( "请输入身高：（单位：厘米）" );
			int height = s.nextInt();
			
			System.out.println( "请输入体重：（单位：千克）" );
			int weight = s.nextInt();
			
			if( height - 100 == weight )
				System.out.println( "该女生是健康的" );
			else
				System.out.println( "该女生不健康" );
		}
		if( sex == 1 )
		{
			System.out.println( "请输入身高：（单位：厘米）" );
			int height = s.nextInt();
			
			System.out.println( "请输入体重：（单位：千克）" );
			int weight = s.nextInt();
			
			if( height - 100 == weight )
				System.out.println( "该男生是健康的" );
			else
				System.out.println( "该男生不健康" );
		}
		
		s.close();
	}
	
}
