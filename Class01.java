package classes;
import java.util.*;
/**
 * ���ԣ���ߣ����ף���105=��׼���أ�ǧ�ˣ�
 * Ů�ԣ���ߣ����ף���100=��׼���أ�ǧ�ˣ�
 * @author HuaWenXuan
 *
 */
public class Class01 {
	
	public static void main( String[] args )
	{
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.println( "�������Ա𣺣�0��Ů��1���У�" );
		int sex = s.nextInt();
		
		if( sex == 0 )
		{
			System.out.println( "��������ߣ�����λ�����ף�" );
			int height = s.nextInt();
			
			System.out.println( "���������أ�����λ��ǧ�ˣ�" );
			int weight = s.nextInt();
			
			if( height - 100 == weight )
				System.out.println( "��Ů���ǽ�����" );
			else
				System.out.println( "��Ů��������" );
		}
		if( sex == 1 )
		{
			System.out.println( "��������ߣ�����λ�����ף�" );
			int height = s.nextInt();
			
			System.out.println( "���������أ�����λ��ǧ�ˣ�" );
			int weight = s.nextInt();
			
			if( height - 100 == weight )
				System.out.println( "�������ǽ�����" );
			else
				System.out.println( "������������" );
		}
		
		s.close();
	}
	
}
