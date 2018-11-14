package MondayProjectsOctober1;

public class LoopsMonday01 {
 public static void main(String[]args) {
	 //1.Write for and while loops so that 
	 //they print numbers between 1 and 20
	 int num =1;
	 while(num <= 20) {
		 
	 
	 
	 System.out.print(num + " ");
	 num++;
	 }
	 
	// same assignment using "for loop"
	 for(int i =1;i<=20; i++) {
         System.out.print(i+" ");
     }
	 
	 //2.Write for and while loops so that they 
	 //print only the even numbers between 1 and 20.
	 
	 int count = 1;

     while (count <= 20) {
         count++;
         if (count % 2 == 0) {
             System.out.println(count + " ");
         }
     }
	 //using for loop
     for (int k = 1; k <=20; k++) {
    	 if (k % 2 == 0) {
        	 System.out.println(k+" ");

    	 }
     }
	 
	 //3. Write for and while loops so that they 
     //print those numbers between 1 and 20 and divisible by 3.
     int count1 = 1;

     while (count1 <= 20) {
         count1++;
         if (count1 % 3 == 0) {
             System.out.println(count1 + " ");
         }
     }
	 //3. using for loop
     
     for (int k1 = 1; k1 <=20; k1++) {
    	 if (k1 % 3 == 0) {
        	 System.out.println(k1  + " ");

    	 }
     }
    //4. Write for and while loops so that they print the 
     //square of each odd number from numbers between 1 and 20. 
     
     int number = 1;
     while (number <= 20) {
         if (!(number % 2 == 0)) { //(number %2 != 0)
             System.out.println(number * number );
         }
         number++;
     }
   // using for loop
     
     for (int kk = 1; kk <=20; kk++) {
    	 if (kk % 2 != 0) {
        	 System.out.println(kk * kk);

    	 }
     }
	 //5. Print numbers between 1 and 20 in a way that:

//a. numbers are printed with plus signs between them and a space on either side,

//b. there should be no plus sign or space before the first number and after the last number
     int num2 =1;
	 while(num2 <= 20) {
		 if (num2 ==20) {
			
			 System.out.println(num2);
			 break;
		 }
	 
	 System.out.print(num2 + " + ");
	 
	 num2++;
	 }
	 // using for loop 
	 for (int y = 1; y <= 20; y++) {
         if(y==20) {
             System.out.println(y);
             break;
         }
             System.out.print(y+ " + ");
     }
	 
    //6. Write for and while loops so that they add numbers 
	//between 1 and 20 and display the sum 
	 int n =1;
	 int sum= 0;
	 while(n <= 20) {
	 
	 sum += n;
	 n++;
	 }
	 System.out.println(sum);
	 
	 //6. using for loop
	 
	 int sum1 = 0;
     for (int z = 1; z <= 20; z++) {
         sum1 = sum1 + z;
     }
     System.out.print(sum1);
     System.out.println(" ");
	 
     //7. Write for and while loops so that they add up the
     //even numbers between 1 and 20 and prints it
     int a =1;
	 int sum2= 0;
	 while(a <= 20) {
		 a++;
	  if(a %2 ==0){
	 sum2 += a;
	 }
	 }
	 System.out.println(sum2);
	 
	 //7. using for loop
	 int sumh = 0;
     for (int h = 1; h <= 20; h++) {
         if (h % 2 == 0) {
             sumh = sumh + h;
         }
     }
     System.out.println(sumh);
     
     //8. Write for and while loops so that they go through the odd integers (from 1 to 19),
     //keeping track of the sum of these integers at each stage, 
     //and printing the sum at each stage.
     

     int number3 = 1;
     int summ =0;
     while (number3 < 20) {
     if (number3 % 2 !=0) { //(number %2 != 0)
    	 summ =summ + number3;
    			 System.out.println(summ);
}
         number3++;
     
     }
     // 8. using for loop
     
     int summ2 =0;
     for (int number4 =1; number4 <20; number4++) {
    	 if (number4 % 2 !=0) {
    		 summ2 = summ2 + number4;
    		 System.out.println(summ2);

    	 }
     }

     
 }
}
