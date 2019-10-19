package p1;
import java.security.SecureRandom;
import java.util.Scanner;

public class p1
{

    private static void add(int diff)
    {
        Scanner sc = new Scanner(System.in);
        int cor = 0, wrong = 0, x1, x2;
        double answer, input;

        for(int i = 0; i < 10; i++)
        {
            x1 = diffx1(diff);
            x2 = diffx2(diff);

            System.out.printf("What is the answer of: %d + %d\n", x1, x2);
            answer = (double) x1 + x2;
            input = sc.nextDouble();

            if (Double.compare(answer, input) == 0)
            {
                repcor();
                cor++;
            }
            else
            {
                repwrong();
                wrong++;
            }

        }

        System.out.printf("The number of questions answered correctly %d and the number of question gotten wrong is %d\n", cor, wrong);
        mastery(cor);

    }

    private static void multi(int diff)
    {
        Scanner sc = new Scanner(System.in);
        int cor = 0, wrong = 0, x1, x2;
        double answer, input;

        for(int i = 0; i < 10; i++)
        {
            x1 = diffx1(diff);
            x2 = diffx2(diff);

            System.out.printf("What is the answer of: %d * %d\n", x1, x2);
            answer = (double) x1 * x2;
            input = sc.nextDouble();

            if (Double.compare(answer, input) == 0)
            {
                repcor();
                cor++;
            }
            else
            {
                repwrong();
                wrong++;
            }

        }

        System.out.printf("The number of questions answered correctly %d and the number of question gotten wrong is %d\n", cor, wrong);
        mastery(cor);
    }

    private static void subtract(int diff)
    {
        Scanner sc = new Scanner(System.in);
        int cor = 0, wrong = 0, x1, x2;
        double answer, input;

        for(int i = 0; i < 10; i++)
        {
            x1 = diffx1(diff);
            x2 = diffx2(diff);

            System.out.printf("What is the answer of: %d - %d\n", x1, x2);
            answer = (double) x1 - x2;
            input = sc.nextDouble();

            if (Double.compare(answer, input) == 0)
            {
                repcor();
                cor++;
            }
            else
            {
                repwrong();
                wrong++;
            }

        }

        System.out.printf("The number of questions answered correctly %d and the number of question gotten wrong is %d\n", cor, wrong);
        mastery(cor);
    }

    private static void divide(int diff)
    {
        Scanner sc = new Scanner(System.in);
        SecureRandom randNum = new SecureRandom();
        int cor = 0, wrong = 0, x1, x2;
        double answer, input;

        System.out.println("Round to two decimal place:");
        System.out.println();

        for(int i = 0; i < 10; i++)
        {
            x1 = diffx1(diff);
            x2 = diffx2(diff);

            if(diff == 1)
            {
                x2 = randNum.nextInt(9) + 1;
            }

            System.out.printf("What is the answer of: %d / %d\n", x1, x2);
            answer = (double) x1 / x2;
            input = sc.nextDouble();

            answer = Math.round(answer * 100.0) / 100.0;

            if (Double.compare(answer, input) == 0)
            {
                repcor();
                cor++;
            }
            else
            {
                repwrong();
                wrong++;
            }

        }

        System.out.printf("The number of questions answered correctly %d and the number of question gotten wrong is %d\n", cor, wrong);
        mastery(cor);
    }

    private static void mix(int diff)
    {
        Scanner sc = new Scanner(System.in);
        SecureRandom randNum = new SecureRandom();
        int cor = 0, wrong = 0, x1, x2, quest;
        double answer = 0, input = 0;

        for(int i = 0; i < 10; i++)
        {
            x1 = diffx1(diff);
            x2 = diffx2(diff);

            quest = randNum.nextInt(4) + 1;

            switch(quest)
            {
                case 1:
                    System.out.printf("What is the answer of: %d + %d\n", x1, x2);
                    answer = (double) x1 + x2;
                    input = sc.nextDouble();
                    break;
                case 2:
                    System.out.printf("What is the answer of: %d * %d\n", x1, x2);
                    answer = (double) x1 * x2;
                    input = sc.nextDouble();
                    break;
                case 3:
                    System.out.printf("What is the answer of: %d - %d\n", x1, x2);
                    answer = (double) x1 - x2;
                    input = sc.nextDouble();
                    break;
                case 4:
                    if(diff == 1)
                    {
                        x2 = randNum.nextInt(9) + 1;
                    }

                    System.out.println("Round to two decimal place:");
                    System.out.println();
                    System.out.printf("What is the answer of: %d / %d\n", x1, x2);
                    answer = (double) x1 / x2;
                    input = sc.nextDouble();
                    break;
            }

            answer = Math.round(answer * 100.0) / 100.0;

            if (Double.compare(answer, input) == 0)
            {
                repcor();
                cor++;
            }
            else
            {
                repwrong();
                wrong++;
            }

        }

        System.out.printf("The number of questions answered correctly %d and the number of question gotten wrong is %d\n", cor, wrong);
        mastery(cor);
    }

    private static void repcor()
    {
        SecureRandom randNum = new SecureRandom();

        int rep = randNum.nextInt(4) + 1;
        switch (rep)
        {
            case 1:
                System.out.println("Very good!");
                break;
            case 2:
                System.out.println("Excellent!");
                break;
            case 3:
                System.out.println("Nice work!");
                break;
            case 4:
                System.out.println("Keep up the good work!");
                break;
        }
    }

    private static void repwrong()
    {
        SecureRandom randNum = new SecureRandom();

        int rep = randNum.nextInt(4) + 1;
        switch (rep)
        {
            case 1:
                System.out.println("No. Try again.");
                break;
            case 2:
                System.out.println("Wrong. Try once more.");
                break;
            case 3:
                System.out.println("Don't give up!");
                break;
            case 4:
                System.out.println("No. Keep trying.");
                break;
        }
    }

    public static int diffx1(int diff)
    {
        SecureRandom randNum = new SecureRandom();

        int x1;

        if(diff == 1 || diff == 2 || diff == 3|| diff == 4)
        {
            if(diff == 1)
            {
                x1 = randNum.nextInt(10);
                return x1;
            }
            if(diff == 2)
            {
                x1 = randNum.nextInt(90) + 10;
                return x1;
            }
            if(diff == 3)
            {
                x1 = randNum.nextInt(900) + 100;
                return x1;
            }
            if(diff == 4)
            {
                x1 = randNum.nextInt(9000) + 1000;
                return x1;
            }
        }
        return 0;
    }

    public static int diffx2(int diff)
    {
        SecureRandom randNum = new SecureRandom();

        int x2;

        if(diff == 1 || diff == 2 || diff == 3|| diff == 4)
        {
            if(diff == 1)
            {
                x2 = randNum.nextInt(10);
                return x2;
            }
            if(diff == 2)
            {
                x2 = randNum.nextInt(90) + 10;
                return x2;
            }
            if(diff == 3)
            {
                x2 = randNum.nextInt(900) + 100;
                return x2;
            }
            if(diff == 4)
            {
                x2 = randNum.nextInt(9000) + 1000;
                return x2;
            }
        }
        return 0;
    }

    private static void mastery(int cor)
    {
        double mast;
        mast = (double) cor / 10;
        mast *= 100;

        System.out.println("Your percentage was " + mast);

        if(mast > 75)
            System.out.println("Congratulations, you are ready to go to the next level!");

        else
            System.out.println("Please ask your teacher for extra help.");

        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int mchoice = 0, diff;

        while(mchoice != 6)
        {
            System.out.printf("Welcome to Math Practice!\nPlease select one of the following options:\n");
            System.out.printf("1 - Addition problems only.\n");
            System.out.printf("2 - Multiplication problems only.\n");
            System.out.printf("3 - Subtraction problems only.\n");
            System.out.printf("4 - Division problems only.\n");
            System.out.printf("5 - Mix of addition, multiplication, subtraction problems, and division.\n");
            System.out.println("6 - Quit program");

            mchoice = sc.nextInt();

            switch(mchoice)
            {
                case 1:
                    System.out.println("Enter the difficulty level you wish to practice:");
                    diff = sc.nextInt();
                    add(diff);
                    break;
                case 2:
                    System.out.println("Enter the difficulty level you wish to practice:");
                    diff = sc.nextInt();
                    multi(diff);
                    break;
                case 3:
                    System.out.println("Enter the difficulty level you wish to practice:");
                    diff = sc.nextInt();
                    subtract(diff);
                    break;
                case 4:
                    System.out.println("Enter the difficulty level you wish to practice:");
                    diff = sc.nextInt();
                    divide(diff);
                    break;
                case 5:
                    System.out.println("Enter the difficulty level you wish to practice:");
                    diff = sc.nextInt();
                    mix(diff);
                    break;
                case 6:
                    break;
            }
        }
    }
}