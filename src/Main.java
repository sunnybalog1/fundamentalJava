public class Main {

    public static void main(String[] args) {

/*      int students =150;
        int rooms = 300;
        int stuResult = students/rooms;
        if (rooms >0 && stuResult >3)
            System.out.println("School setup is okay");
        else
            System.out.println(" School setup not okay");
        */

        System.out.println("before method call");
        //doSomething(5.4, 4.5, 0);
        System.out.println("back from method call");
       // System.out.println("lets calculate interest rate now");;
        //produceInterestHistory(3.4, 1000, 3);


         // Learn about conditional assignment
        // result = condition? true-value : false-value;
  /*int val1 = 8;
        int val2 = 17;
        int maxValue = val1 > val2 ? //result = condition?
                val1 : val2; // true-value : false - value
        int minValue = val1 < val2 ? val1 : val2;
        System.out.println("maximum value of the two numbers is :");
        System.out.println(maxValue);
        System.out.println("minimum value of the two numbers is :");
        System.out.println(minValue);

        System.out.println("END OF CONDITIONAL ASSIGNMENT NOTES");
        System.out.println("---------------------------");
        */
        // if-else condition
/*
        System.out.println("Beginning of If-else notes");
        System.out.println("");
        int val3 = 1;
        int val4 = 4;
        if (val3 > val4)
            System.out.println("val3 is bigger");
        else
            System.out.println("val4 is bigger");
        */

        // if a lot of condition are to be tested in chains, chains of if, else-if and else can be used
      //the statement with true condition will be the only one that will run
       // Lets build a calEngine App
/*        System.out.println("Lets build a calEngine App");
        System.out.println("");
        double val5 = 100.0d, val6 = 50.0d, val7 = 4.0d, result = 0.0d;
        char opCode = 's';
        if (opCode == 'a')
            result = val5 + val6;
        else if (opCode == 's')
            result = val5 - val6;
        else if (opCode == 'm')
            result = val5 * val6;
        System.out.println("Result is:   " + result);
 */
            // Logical Operators  ---AND & Logical operators
/*        if (val5 > val6 & val6 > val7)
            System.out.println("Good result");
        else
            System.out.println("Check inputted numbers");
*/
        // BLOCK STATEMENT
        //expression
   /*
        {
            statement-1;
            statement-2;
            .
            .
            .
            statement-N;
        {
 */
     //block statement impact variable scope: i.e can not be seen outside the block
  /*      int val8 = 10;
        int val9 = 4;
        final int diff;
        if (val8 > val9) {
            diff = val8 - val9;
            System.out.println("val8 is bigger and the difference is:  ");
            System.out.println(diff);}
        else
            diff = val9 - val8;
            System.out.println("val9 is not bigger and the difference is: ");
            System.out.println(diff);
*/
        //SWITCH
        //SWITCH EXPRESSION
/* switch (value-to-test) {
 case matching-value-1:
 statements
 break;
 .
 .
 .
 case matching-value-N:
 statements
 break;
 default;
 statements
 }


 */
        //CALCENGINE
/*      double value1 = 100.0d;
        double value2 = 20.0d;
        double result = 0.0d;
        char opCode = 'l';
        if (opCode == 'a')
            result = value1 + value2;
        else if (opCode=='s')
            result = value1 - value2;
        else if (opCode=='m')
            result = value1 * value2;
        else if (opCode=='d') {
            if (value2 > 0)
                result = value1 / value2;
        }
        else{
            System.out.println("Invalid Opcode:   "  + opCode);
            result = 0.0d;
            }
            System.out.println(result);
*/
        //CALCENGINE WITH SWITCH
/*
        double value1 = 100.d;
        double value2 = 50.d;
        char opCode = 'l';
        double result = 0.0d;

        switch (opCode) {
                case 'a':
                    result = value1 + value2;
                    break;
                case 's':
                    result = value1 - value2;
                    break;
                case 'm':
                    result = value1 * value2;
                    break;
                case 'd':
                    result = value2 != 0 ? value1 / value2 : 0.0d;
                    break;
            default:
                    System.out.println("Invalid opCode: " + opCode);
                    result = 0.0d;
                    break;
            }
        System.out.println(result);

 */

        //using method for the same switch example above PART 1
/*        double[] leftvals = {100.d, 25.0d, 225.0d, 11.0d};
        double[] rightvals = {50.d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];

        for(int i=0; i<opCodes.length; i++) {
            results[i] = execute(opCodes[i], leftvals[i], rightvals[i]);
            //execute(opCodes[i], leftvals[i], rightvals[i]);
        }
        for(double currentResult : results)
            System.out.println(currentResult);
*/
        //WHILE LOOP
       /* System.out.println("start of examples with 'while loop''");
        int valAb =5;
        int factorial = 1;
        while (valAb>2) {
            factorial *= valAb;
            valAb--;
        }
        System.out.println(factorial);
*/
        // while loop used to calculator a betting rollover
/*        System.out.println("Betting Rollover system using while loop");
        System.out.println("input the odds, starting capital and maximum payout");
        float oddsAccum = 1;
        float capital = 1000;
        float result1 = 1;
        int day = 1;
        System.out.println("");
        System.out.println("capital =" +capital);
        while (result1 < 1200000) {
            //System.out.println(i);
            oddsAccum *= 1.3;
            System.out.println("Day: " + day);
            day = day + 1;
            result1 = capital * oddsAccum;
            System.out.println("Result: " + result1);
        }

        // DO-WHILE LOOP
/*    do
        statement;
    while (condition)
*/
/*        int ival =5;
        do {
            System.out.print(ival);
            System.out.print(" *2 =");
            ival *=2;
            System.out.println(ival);

        } while (ival <25);
*/
        // FOR LOOP -----------"
/*        float i;
        for (i = 1; i < 120000; i *= 1.3) ;
        System.out.println(i);
*/
        //arrays
            //Declaring arrays using this method
/*
        float[] thevalue = new float[4];
        thevalue[0] = 10.0f;
        thevalue[1] = 15.0f;
        thevalue[2] = 13.0f;
        thevalue[3] = 25.0f;
        float sum = 0.0f;
        for (int index =0; index<thevalue.length; index++)
            sum += thevalue[index];
        System.out.println(sum);
*/
                //  OR
/*      // using array method of declaring variables
        float[] thevalue = {10.0f, 15.0f, 13.0f, 25.0f};
        float sum = 0.0f;
        for (int index =0; index<thevalue.length; index++)
          sum += thevalue[index];
        System.out.println(sum);
*/
        // OR using array method for calcEngine
/*      double[] leftvals = {100.d, 25.0d, 225.0d, 11.0d};
        double[] rightvals = {50.d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];
        for(int i=0; i<opCodes.length; i++) {
            switch (opCodes[i]) {
                case 'a':
                    results[i] = leftvals[i] + rightvals[i];
                    break;
                //case 's':
                //  result = value1 - value2;
                // break;
                case 's':
                    results[i] = leftvals[i] - rightvals[i];
                    break;
                // case 'm':
                //   result = value1 * value2;
                // break;
                case 'm':
                    results[i] = leftvals[i] * rightvals[i];
                    break;
                //case 'd':
                //  result = value2 != 0 ? value1 / value2 : 0.0d;
                //break;
                case 'd':
                    results[i] = leftvals[i] / rightvals[i];
                    break;
                default:
                    //System.out.println("Invalid opCode: " + opCode);
                    System.out.println("Invalid opCode: " + opCodes[i]);
                    //result = 0.0d;
                    results[i] = 0.0d;
                    break;
            }
        }
        for(double currentResult : results)
        System.out.println(currentResult);

 */
        //Examples of for-each loop to achieve same result
/* float[] thevalue = {10.0f, 15.0f, 13.0f, 25.0f};
        float sum = 0.0f;
        for (float currentVal:thevalue)
            sum +=currentVal;
        System.out.println(sum);
*/
        int i = 5;
        int j = 4;

            //int k = i;
            // i = j;
            // j = k;
            System.out.println(i);
            System.out.println(j);}

    private static void swap(int j, int i) {
        swap(j, i);
    }

    //using method for the same switch example above PART 2
/*    double[] leftval = {100.d, 25.0d, 225.0d, 11.0d};
    double[] rightval = {50.d, 92.0d, 17.0d, 3.0d};
    char[] opCodes = {'d', 'a', 's', 'm'};
    static double execute(char opCode, double leftVal, double rightVal) {
        double result;
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = leftVal / rightVal;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                //result = 0.0d;
                result = 0.0d;
                break;
        }
        return  result;
    }
*/
    //END OF METHOD CALL PROGRAM
    /*static double[] produceInterestHistory(double rate, double capital, int years)
    {
        double[] accumInterest = new double[years];
        for (int yearIndex = 0; yearIndex < years; yearIndex++) {
            int year = yearIndex + 1;
            accumInterest[yearIndex] = calculateInterest(rate, capital, year);
        }
        return accumInterest;
    }
    */
    //private static double calculateInterest(double rate, double capital, int year) {
      //  return 0;
    //}
    /*private static void doSomething(double x, double y, int count ) {
        double sum = x + y;
        for (int i=0; i<count; i++)
            System.out.println(sum);
            System.out.println("inside the method");
            System.out.println("still inside the method");
        return;
    }*/


}


