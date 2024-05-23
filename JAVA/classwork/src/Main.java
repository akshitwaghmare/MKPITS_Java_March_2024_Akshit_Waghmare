import funcInterface2.Shape;
import functionalinterface.Calculation;
import threadPrime.NonPrimeNum;
import threadPrime.PrimeNum;
import threadPrimeInnerClass.Prime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        byte[] byteArray = { 72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100 };
//        String str = new String(byteArray);
//        System.out.println(str);

//
//
//        System.out.println(Math.pow(5,8));
//        System.out.println(Math.floor());

//        String str1="Akshit";
//        String str2="Akshit";
//        String str3=new String("Akshit");
//        System.out.println(str1==str2);
//        out.println(str3==str2);

//        Calc calc = new Calc();



//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter string: ");
//        String input = scanner.nextLine();
//        if(PallindromeChecker.isPalindrome(input)==true){
//            System.out.println("String is Pallindrome");
//        }
//        else{
//            System.out.println("String is not pallindrome");
//        }


//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter num: ");
//        int num = scanner.nextInt();
//        scanner.close();
//
//        FactorialCalculator calculator = new FactorialCalculator(num);
//        int factorial = calculator.calculateFactorial();
//
//        System.out.println("Factorial is " + factorial);


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter num: ");
//        int num = scanner.nextInt();
//
//        FizzBuzz fizzBuzz = new FizzBuzz(num);
//        fizzBuzz.print();


//        Scanner scanner = new Scanner(System.in);
//        Calculation calculation;
//        System.out.println("Enter Choice:");
//        System.out.println("1.Addition");
//        System.out.println("2.Subtraction");
//        int choice = scanner.nextInt();
//        switch (choice){
//            case 1:
//                calculation = new Addition();
//                int result=calculation.Calculation(5,6);
//                System.out.println(result);
//                break;
//            case 2:
//                calculation = new Subtraction();
//                result = calculation.Calculation(5, 6);
//                System.out.println(result);
//                break;
//        }


        //        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter 3 numbers:/n");
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        int z = scanner.nextInt();
//        Z v = new Z(x,y);
//    }



//        Atm atm = new Atm();
//        System.out.println(atm.balance());
//        System.out.println(Withdrawl.Withdrawl(1000,500));

//            YourThread yourThread = new YourThread();
//            yourThread.run();
//        out.println(Thread.activeCount());


//
//        Thread thread = new Thread(new MyThread());
//        Thread thread1 = new Thread(new YourThread());
//        thread.setName("salman");
//        thread1.setName("Amir");
//        thread.start();
//        thread1.start();
//        thread.setPriority(Thread.MAX_PRIORITY);
//        thread1.setPriority(Thread.MIN_PRIORITY);
//        out.println(Thread.activeCount());




//
//        Thread thread = new Thread(new PrimeNum());
//        Thread thread1 = new Thread(new NonPrimeNum());
//        thread.start();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        thread1.start();
//        thread.setPriority(Thread.MAX_PRIORITY);
//        thread1.setPriority(Thread.MIN_PRIORITY);
//
//        Prime prime = new Prime();
//        prime.execute();



//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Prime numbers from 1 to 100");
//
//                int i = 0;
//                int num = 0;
//                String primeNumbers = "";
//
//                for (i = 1; i <= 100; i++) {
//                    int count = 0;
//                    for (num = i; num >= 1; num--) {
//                        if (i % num == 0) {
//                            count = count + 1;
//                        }
//                    }
//                    if (count == 2) {
//                        primeNumbers = primeNumbers + i + " ";
//                    }
//                }
//                System.out.println(primeNumbers);
//            }
//        }).start();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Non Prime Numbers from 1 to 100");
//                String nonprimeNumbers = "";
//
//                for (int i = 2; i <= 100; i++) {
//                    boolean isPrime = true;
//                    for (int j = 2; j < i; j++) {
//                        if (i % j == 0) {
//                            isPrime = false;
//                            break;
//                        }
//                    }
//                    if (!isPrime) {
//                        nonprimeNumbers += i + " ";
//                    }
//                }
//                System.out.println(nonprimeNumbers);
//            }
//        }).start();




        //Anonymous Inner Class Type-2
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Non Prime Numbers from 1 to 100");
//                String nonprimeNumbers = "";
//
//                for (int i = 2; i <= 100; i++) {
//                    boolean isPrime = true;
//                    for (int j = 2; j < i; j++) {
//                        if (i % j == 0) {
//                            isPrime = false;
//                            break;
//                        }
//                    }
//                    if (!isPrime) {
//                        nonprimeNumbers += i + " ";
//                    }
//                }
//                System.out.println(nonprimeNumbers);
//            }
//        };
//        Runnable runnable1= new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Prime numbers from 1 to 100");
//
//                int i = 0;
//                int num = 0;
//                String primeNumbers = "";
//
//                for (i = 1; i <= 100; i++) {
//                    int count = 0;
//                    for (num = i; num >= 1; num--) {
//                        if (i % num == 0) {
//                            count = count + 1;
//                        }
//                    }
//                    if (count == 2) {
//                        primeNumbers = primeNumbers + i + " ";
//                    }
//                }
//                System.out.println(primeNumbers);
//            }
//        };
//        Thread thread = new Thread(runnable);
//        Thread thread1 = new Thread(runnable1);
//        thread.start();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        thread1.start();


//        Calculation calculation = new Calculation() {
//            @Override
//            public int calculate(int a, int b) {
//                return a+b;
//            }
//        };
//        Calculation calculation1=new Calculation() {
//            @Override
//            public int calculate(int a, int b) {
//                return a-b;
//            }
//        };
//        Calculation calculation2 = new Calculation() {
//            @Override
//            public int calculate(int a, int b) {
//                return a*b;
//            }
//        };
//        Calculation calculation3 = new Calculation() {
//            @Override
//            public int calculate(int a, int b) {
//                return a/b;
//            }
//        };
//
//        System.out.println(calculation.calculate(23,23));
//        System.out.println(calculation1.calculate(34,45));
//        System.out.println(calculation2.calculate(23,100));
//        System.out.println(calculation3.calculate(55,5));
//
//
//
//
//
//        Shape shape = new Shape() {
//            @Override
//            public void calArea() {
//            }
//        };

    }
}