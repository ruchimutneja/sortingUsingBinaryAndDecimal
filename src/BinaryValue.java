import java.util.ArrayList;

public class BinaryValue {

    ArrayList<Integer> binaryNumber = new ArrayList<Integer>();
    public Integer[] generateBinaryNumber(int number) {
        while(number!=0)
        {
            if(number%2==0)
                binaryNumber.add(0);
            else
                binaryNumber.add(1);
            number = number/2;
        }
        return (Integer[])binaryNumber.toArray(new Integer[binaryNumber.size()]);

    }


    public int countNumberOfOne(int givenNumber) {
        int count=0;
        Integer[] binarValueOfGivenNumber = generateBinaryNumber(givenNumber);
        for(int i=0;i<binarValueOfGivenNumber.length;i++){

            if(binarValueOfGivenNumber[i]==1)
                count++;
        }
        return count;
    }
}
