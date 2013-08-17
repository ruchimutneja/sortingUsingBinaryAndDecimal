
public class sumOfMoney {

        private final double [] denominations  = {0.01,0.02,0.05,1,5,10,25,50};
        private double amount;

        public sumOfMoney(double amount) {
            this.amount = amount;
        }

        public int giveArrangementsOfMoney(double sum, int currentIndex){
            int arrangements=0;
            if(sum>amount)
                return 0;
            for(int i=currentIndex;i<denominations.length;i++){
                if(sum + denominations[i]<amount){
                    arrangements += giveArrangementsOfMoney(sum + denominations[i], i);
                }
                else if(sum + denominations[i]==amount){
                    arrangements++;
                    return arrangements;
                }
            }
            return arrangements;
        }
 }

