package se.Lexicon;

public class datatyps

{

        public static void main(String [] args)
        {
// Data types

            int speed = 100;
            byte b = 10;
            short s = 10;
            int i = 10;
            long l = 10;
            float f = 23.5f;
            double d = 23.5;
            char c = 'a';
            boolean bool = true;
            double decimal;

            System.out.println();
// =
            int number1 = 10;
            int number2 = 5;
            number1 = number2;
            System.out.println();
//+
            int result = 42 + 10;
//-
            int number3 = 5;
            int number4 = 10;
            int t = number3 - number4;
//*
            int n = 10;
            int q = n * 24;
            System.out.println(q);
// /
            double w = 100 / 2.5;
            System.out.println(w);

//  ”Changing” a primitive ?

            int y = 5;
            y = y + 1;

            double decimalw = 432.43;
            decimalw = decimalw - (234.32 / 32);
            System.out.println(decimalw);

//   (++) and (--)

            int h = 0;
            System.out.println(h);

//  (%) ”Remainer operator”

            int modulus = 11 % 3;
            System.out.println(modulus);

// Comparison Operators: (==, !=, <, >, <=, >=)

            //== is equal
            int v = 1 + 2 + 3;
            int r = 3 + 2 + 1;
            boolean isequal = v == r;
            System.out.println(isequal);

            // != not egual
            char er = 'a';
            char ty = 'b';
            boolean asd = ty != er;
            System.out.println(asd);
            // <,>
            int df = 12;
            int gh = 11;
            System.out.println(df < gh);
            // <=,>=
            int be = 1;
            int re = 1;
            {System.out.println(be <= re);}
            {System.out.println(12 % 3 > 0);}

// If, else statements (for two conditions.) ?

        int age = 17;
        if (age >= 18);
        {System.out.println("you can have a beer");}
        else
        {System.out.println("you are young to drink beer");}

//&&

            int ages = 17;
            if (ages>=18);
            {System.out.println("you can have a beer");}
            else if (age < 18 && age >= 15);
            {System.out.println("you can drive a moped but not drink beer");}
             else
            {System.out.println("you are too young to drive a moped and drink beer");}

// Switch?

            double num1=5, num2=7, result = 0;
            char opr = '+';
            switch (opr)
            case '+':
            result= num1+num2;
            break;
            case '-':
            result=num1-num2;
            break;
            case '*':
            result=num1*num2;
            break;
            case '/':
            result = num1/num2;
            default:
            System.out.println(opr+"is not supported");
            System.out.println(result);

        }

}














            }



        }


}




