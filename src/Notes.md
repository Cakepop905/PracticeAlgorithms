Notes pour la code" duck the bomb"
- int intIndex =striorg .indexOf("bomb");
if(intIndex == -1) {
System.out.println("bomb not found");
   - ///if {bomb   return "Duck!";
     /// else{ return System.out.println(""Relax, there's no bomb.");
     /// we of course need an else and if
     

-     // count from the first number to the second number in increments of three
            int countfrom;
            if (countTo < countFrom ) {
                return "Try again with better numbers!";
                //valid user input :"Try again with better numbers"
            }
            StringBuilder answer = new StringBuilder();
            // create a pattern. pattern is based on user input basis
            for(int currentInt =countFrom; currentInt<countTo; currentInt+= countBy){
           answer.append(currentInt).append(".. ");
           answer.setLength(answer.length()-3);
            }
            return answer.toString();
        }


- String reverseMe = ;