package gtest;

public class Test1 {

	@Test
	public  void main() {
        System.out.println("��Ǯ�ټ�����Ľ�Ϊ:");
        buyChicken(100,100);
    }

    public static void buyChicken(int m,int n){
        for (int x = 0;x <= n;x++)  
           for (int y = 0;y <= n;y++) { 
               if (x + y <= n) {   
                   int z = n - x -y;    
                   if (z%3 == 0 && x*5 + y*3 + z/3 == m) {
                       System.out.println("����:" + x +  " ĸ��:" + y + " С��:" + z);
                   }else
                       continue;   
               }else
                   break; 
           }
    }
	void test() {
		fail("Not yet implemented");
	}

}